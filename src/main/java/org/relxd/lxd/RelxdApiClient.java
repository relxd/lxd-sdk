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

public class RelxdApiClient extends ApiClient{

    //Base url
    private String basePath;

    //HttpClient
    private OkHttpClient httpClient;

    private Logger logger;

    //Java Keystore fields
    private JavaKeyStoreService javaKeyStoreService;
    private String javaKeyStoreFilePath;
    private String javaKeyStorePassword;

    //Authentication type which is either Trusted or Not Trusted
    private String authenticationType;
    private static final String TRUSTED = "Trusted";
    private static final String NOT_TRUSTED = "Not Trusted";

    public String getBasePath() {
        return basePath;
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
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

    public String getJavaKeyStorePassword() {
        return javaKeyStorePassword;
    }

    public void setJavaKeyStorePassword(String javaKeyStorePassword) {
        this.javaKeyStorePassword = javaKeyStorePassword;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public RelxdApiClient(){

        //initialise logger
        logger = LoggerFactory.getLogger(ApiClient.class);
        //Initialise fields from properties file
        basePath = this.getApplicationProperties().getProperty("base.url");
        javaKeyStoreFilePath = this.getApplicationProperties().getProperty("java.keystore.path");
        javaKeyStorePassword = this.getApplicationProperties().getProperty("java.keystore.password");
        javaKeyStoreService = new JavaKeyStoreServiceImpl();
        authenticationType = this.getApplicationProperties().getProperty("authentication.type");

        //Initialise Http Client
        initHttpClient();

    }


    //Method to get Application Properties from the properties file
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

    //Initialise an HttpClient
    void initHttpClient() {
        initHttpClient(Collections.<Interceptor>emptyList());
    }

    private void initHttpClient(List<Interceptor> interceptors) {

        //Build HttpClient
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        if ((basePath != null) && (basePath.contains("https"))) {

            try {
                //Connect to the keystore to get certificate
                KeyStore keyStore = javaKeyStoreService.getKeyStore(javaKeyStoreFilePath, javaKeyStorePassword);

                //Initialise an SSL Context
                SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);

                KeyManager[] keyManagers;

                //If authentication type is trusted add key manager
                if (TRUSTED.equalsIgnoreCase(authenticationType)) {
                    KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    keyManagerFactory.init(keyStore, javaKeyStorePassword.toCharArray());

                    keyManagers = keyManagerFactory.getKeyManagers();

                //If authentication type is not trusted do not add key manager
                }else if (NOT_TRUSTED.equalsIgnoreCase(authenticationType)){
                    keyManagers = null;
                }else {
                    throw new RuntimeException("Authentication types can only be Trusted or Not Trusted");
                }

                //Add trust manager
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

        //Add a network Interceptor
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
