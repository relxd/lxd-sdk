
/*
 *
 * MIT License
 *
 * Copyright (c) 2020 Daniel Frąk
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

package org.relxd.lxd.auth.javakeystore;


import org.junit.jupiter.api.*;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreService;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreServiceImpl;
import org.relxd.lxd.auth.javakeystore.x509certificate.X509CertificateAndKeyPair;
import org.relxd.lxd.auth.javakeystore.x509certificate.service.CertificateChainGenerationService;
//import org.relxd.lxd.auth.javakeystore.x509certificate.service.CertificateChainGenerationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import static org.mockito.Mockito.spy;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JavaKeyStoreServiceTest {

    private JavaKeyStoreService javaKeyStoreService;
    private CertificateChainGenerationService certificateChainGenerationService;
    private Logger logger;
    private RelxdApiClient apiClient;
    private String javaKeyStoreFilePath;
    private String javaKeyStorePassword;

    @BeforeEach
    public void init(){
        javaKeyStoreService = spy(new JavaKeyStoreServiceImpl());
        //certificateChainGenerationService = spy(new CertificateChainGenerationServiceImpl());
        logger = LoggerFactory.getLogger(JavaKeyStoreServiceTest.class);
        apiClient = new RelxdApiClient();
        javaKeyStoreFilePath = apiClient.getJavaKeyStoreFilePath();
        javaKeyStorePassword = apiClient.getJavaKeyStorePassword();
    }


    @Test
    @Order(2)
    public void storeCertificateToKeyStore(){

        try {
            final X509CertificateAndKeyPair x509CertificateAndPrivateKey = certificateChainGenerationService.generateX509Certificate("another Lxd Application", "rootcert","lxdCertificate");

            if (x509CertificateAndPrivateKey != null) {
                final X509Certificate x509Certificate = x509CertificateAndPrivateKey.getX509Certificate();
                final KeyPair keyPair = x509CertificateAndPrivateKey.getKeyPair();
                final String keyStoreFileName = javaKeyStoreFilePath;
                javaKeyStoreService.exportKeyPairToKeystoreFile(keyPair, x509Certificate, "anotherLxdCertificate", keyStoreFileName, KeyStore.getInstance("PKCS12").getType(), "pass");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Test
    @Order(3)
    public void loadCertificateFromKeyStore() throws Exception{

        final Certificate[] certificates = javaKeyStoreService.loadCertificateFromKeyStore("anotherLxdCertificate", javaKeyStoreFilePath, "pass");

        logger.info("Certificates in KeyStore ====>>>> {}", certificates[0].getPublicKey());

        certificateChainGenerationService.writeCertToFileBase64Encoded(certificates[0],javaKeyStoreFilePath);

    }

    @Test
    @Order(1)
    public void generateX509Certificate(){
        try {

            certificateChainGenerationService.generateX509Certificate("Lxd Application", "rootcert","lxdCertificate");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Test
    @Order(4)
    public void deleteKeyStore(){
        try {
            javaKeyStoreService.deleteKeyStore(javaKeyStoreFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
