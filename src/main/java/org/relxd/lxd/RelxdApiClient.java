package org.relxd.lxd;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreService;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class RelxdApiClient {

    private String basePath;

    private OkHttpClient httpClient;

    private Logger logger;

    private JavaKeyStoreService javaKeyStoreService;

    private String javaKeyStoreFilePath;

    private String guestKeyStoreFilePath;

    private String javaKeyStorePassword;

    private String guestKeyStorePassword;

    private String authenticationType;

    private static final String GUEST = "Guest";

    private static final String TRUSTED = "Trusted";

    private static final String NOT_TRUSTED = "Not Trusted";

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public JavaKeyStoreService getJavaKeyStoreService() {
        return javaKeyStoreService;
    }

    public void setJavaKeyStoreService(JavaKeyStoreService javaKeyStoreService) {
        this.javaKeyStoreService = javaKeyStoreService;
    }

    public String getJavaKeyStoreFilePath() {
        return javaKeyStoreFilePath;
    }

    public void setJavaKeyStoreFilePath(String javaKeyStoreFilePath) {
        this.javaKeyStoreFilePath = javaKeyStoreFilePath;
    }

    public String getGuestKeyStoreFilePath() {
        return guestKeyStoreFilePath;
    }

    public void setGuestKeyStoreFilePath(String guestKeyStoreFilePath) {
        this.guestKeyStoreFilePath = guestKeyStoreFilePath;
    }

    public String getJavaKeyStorePassword() {
        return javaKeyStorePassword;
    }

    public void setJavaKeyStorePassword(String javaKeyStorePassword) {
        this.javaKeyStorePassword = javaKeyStorePassword;
    }

    public String getGuestKeyStorePassword() {
        return guestKeyStorePassword;
    }

    public void setGuestKeyStorePassword(String guestKeyStorePassword) {
        this.guestKeyStorePassword = guestKeyStorePassword;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public RelxdApiClient(){

        logger = LoggerFactory.getLogger(ApiClient.class);

        basePath = this.getApplicationProperties().getProperty("base.url");
        javaKeyStoreFilePath = this.getApplicationProperties().getProperty("java.keystore.path");
        javaKeyStorePassword = this.getApplicationProperties().getProperty("java.keystore.password");
        javaKeyStoreService = new JavaKeyStoreServiceImpl();
        authenticationType = this.getApplicationProperties().getProperty("authentication.type");
        guestKeyStoreFilePath = this.getApplicationProperties().getProperty("java.guest.keystore.path");
        guestKeyStorePassword = this.getApplicationProperties().getProperty("java.guest.keystore.password");

        initHttpClient();

    }


    public Properties getApplicationProperties() {

        final String PROPERTIES_FILE_LOCATION = "application.properties";

        Properties props = new Properties();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE_LOCATION);

        try {

            if (inputStream != null) {
                props.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + PROPERTIES_FILE_LOCATION + "' not found in the classpath");
            }

        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
        return props;

    }

    void initHttpClient() {
        initHttpClient(Collections.<Interceptor>emptyList());
    }

    private void initHttpClient(List<Interceptor> interceptors) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        if ((basePath != null) && (basePath.contains("https"))) {

            try {
                KeyStore keyStore = javaKeyStoreService.getKeyStore(javaKeyStoreFilePath, javaKeyStorePassword);

                SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);

                KeyManager[] keyManagers = null;

                if (TRUSTED.equalsIgnoreCase(authenticationType))
                {
                    KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    keyManagerFactory.init(keyStore, javaKeyStorePassword.toCharArray());

                    keyManagers  = keyManagerFactory.getKeyManagers();

                }else if (GUEST.equalsIgnoreCase(authenticationType)){

                    keyStore = javaKeyStoreService.getKeyStore(guestKeyStoreFilePath, guestKeyStorePassword);

                    KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    keyManagerFactory.init(keyStore, guestKeyStorePassword.toCharArray());

                    keyManagers  = keyManagerFactory.getKeyManagers();
                }

                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:"
                            + Arrays.toString(trustManagers));
                }
                X509TrustManager trustManager = (X509TrustManager) trustManagers[0];

                sslContext.init(keyManagers, trustManagerFactory.getTrustManagers(), new SecureRandom());
                builder.sslSocketFactory(sslContext.getSocketFactory(), trustManager);


            } catch (Exception ex) {
                ex.printStackTrace();
            }
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

        }

        builder.addNetworkInterceptor(getProgressInterceptor());
        for (Interceptor interceptor: interceptors) {
            builder.addInterceptor(interceptor);
        }


        httpClient = builder.build();

    }

    private Interceptor getProgressInterceptor() {
        return new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                final Request request = chain.request();
                final Response originalResponse = chain.proceed(request);
                if (request.tag() instanceof ApiCallback) {
                    final ApiCallback callback = (ApiCallback) request.tag();
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), callback))
                            .build();
                }
                return originalResponse;
            }
        };
    }
}
