package org.relxd.lxd.javakeystore;


import org.junit.jupiter.api.*;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreService;
import org.relxd.lxd.auth.javakeystore.service.JavaKeyStoreServiceImpl;
import org.relxd.lxd.auth.javakeystore.x509certificate.X509CertificateAndKeyPair;
import org.relxd.lxd.auth.javakeystore.x509certificate.service.CertificateChainGenerationService;
import org.relxd.lxd.auth.javakeystore.x509certificate.service.CertificateChainGenerationServiceImpl;
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

    @BeforeEach
    public void init(){
        javaKeyStoreService = spy(new JavaKeyStoreServiceImpl());
        certificateChainGenerationService = spy(new CertificateChainGenerationServiceImpl());
        logger = LoggerFactory.getLogger(JavaKeyStoreServiceTest.class);
    }


    @Test
    @Order(2)
    public void storeCertificateToKeyStore(){

        try {
            final X509CertificateAndKeyPair x509CertificateAndPrivateKey = certificateChainGenerationService.generateX509Certificate("Lxd Application", "rootcert","lxdCertificate");

            if (x509CertificateAndPrivateKey != null) {
                final X509Certificate x509Certificate = x509CertificateAndPrivateKey.getX509Certificate();
                final KeyPair keyPair = x509CertificateAndPrivateKey.getKeyPair();
                final String keyStoreFileName = "./certificates/java-key-store.jks";
                javaKeyStoreService.exportKeyPairToKeystoreFile(keyPair, x509Certificate, "anotherLxdCertificate", keyStoreFileName, KeyStore.getDefaultType(), "pass");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Test
    @Order(3)
    public void loadCertificateFromKeyStore(){

        final Certificate[] certificates = javaKeyStoreService.loadCertificateFromKeyStore("anotherLxdCertificate", "./certificates/java-key-store.jks", "pass");

        logger.info("Certficates in KeyStore ====>>>> {}", certificates[0]);

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
            javaKeyStoreService.deleteKeyStore("./certificates/java-key-store.jks");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
