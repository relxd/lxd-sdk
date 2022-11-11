/*
 *
 * MIT License
 *
 * Copyright (c) 2020 ReLxd
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */


package org.relxd.lxd;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreService;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreServiceImpl;
import org.relxd.lxd.client.ApiClient;
import org.relxd.lxd.client.ApiServices;
import org.relxd.lxd.client.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class RelxdApiClient extends ApiClient {

    private String unixSocketPath;
    private String basePath;
    private Logger logger;
    private ApiServices apiServices;

    @Override
    public void updateBaseUri(String baseUri) {
        URI uri = URI.create(baseUri);
        basePath = uri.getRawPath();
        super.updateBaseUri(baseUri);
    }

    //Java Keystore fields
    private JavaKeyStoreService javaKeyStoreService;
    private String javaKeyStoreFilePath;
    private String javaKeyStorePassword;

    //Authentication type which is either Trusted or Not Trusted
    private String authenticationType;
    private static final String TRUSTED = "Trusted";
    private static final String NOT_TRUSTED = "Not Trusted";

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

    public String getUnixSocketPath() {
        return unixSocketPath;
    }

    public void setUnixSocketPath(String unixSocketPath) {
        this.unixSocketPath = unixSocketPath;
    }

    public RelxdApiClient(){

        //initialise logger
        logger = LoggerFactory.getLogger(RelxdApiClient.class);
        //Initialise fields from properties file
        final String basePath = this.getApplicationProperties().getProperty("base.url");
        super.setBasePath(basePath);
        javaKeyStoreFilePath = this.getApplicationProperties().getProperty("java.keystore.path");
        javaKeyStorePassword = this.getApplicationProperties().getProperty("java.keystore.password");
        javaKeyStoreService = new JavaKeyStoreServiceImpl();
        authenticationType = this.getApplicationProperties().getProperty("authentication.type");
        unixSocketPath = this.getApplicationProperties().getProperty("unix.socket.base.path");

        //Initialise Http Client
        initHttpClient();

        //Set RelxdApiClient as default ApiClient
        Configuration.setDefaultApiClient(this);

        this.apiServices = new ApiServices();
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

    public ApiServices services() {
        return apiServices;
    }

    public String getBasePath(){
        return basePath;
    }

    public static HostnameVerifier allowAllHostNames() {
        return (hostname, sslSession) -> true;
    }

    //Initialise an HttpClient
    void initHttpClient() {
        initHttpClient(Collections.<Interceptor>emptyList());
    }

    private void initHttpClient(List<Interceptor> interceptors) {

        System.out.println("Java Home : " + System.getProperty("java.home"));

        //Build HttpClient
        HttpClient.Builder builder = HttpClient.newBuilder();

        if ((getBasePath() != null) && (getBasePath().contains("https"))) {

            try {
                //Connect to the keystore to get certificate
                KeyStore keyStore = javaKeyStoreService.getKeyStore(javaKeyStoreFilePath, javaKeyStorePassword);

                //Initialise an SSL Context
                SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);

                //final TrustSelfSignedStrategy trustSelfSignedStrategy = TrustSelfSignedStrategy.INSTANCE;

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

                X509TrustManager systemTrustManager = (X509TrustManager) trustManagers[0];

                //Extend Trust to Self signed certificates
                X509TrustManager[] wrapTrustManagers = TrustSelfSignedX509TrustManager.wrap(systemTrustManager);

                sslContext.init(keyManagers, wrapTrustManagers, new SecureRandom());
                builder.sslContext(sslContext);
//                builder.sslSocketFactory(sslContext.getSocketFactory(), wrapTrustManagers[0]);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
//            builder.hostnameVerifier(allowAllHostNames());

        }

        //Add a network Interceptor
//        builder.addNetworkInterceptor(getProgressInterceptor());
//        for (Interceptor interceptor: interceptors) {
//            builder.addInterceptor(interceptor);
//        }


//        super.setHttpClient(builder.build());
        super.setHttpClientBuilder(builder);

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

    private boolean isSelfSigned(X509Certificate[] chain) {
        return chain.length == 1;
    }
}
