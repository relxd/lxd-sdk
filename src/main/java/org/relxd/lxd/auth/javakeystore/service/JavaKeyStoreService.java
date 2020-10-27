package org.relxd.lxd.auth.javakeystore.service;

import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;

public interface JavaKeyStoreService {

    void exportKeyPairToKeystoreFile(KeyPair keyPair, Certificate certificate, String alias, String fileName, String storeType, String storePass) throws Exception;

    Certificate[] loadCertificateFromKeyStore(String alias, String filePath, String password);

    void deleteKeyStore(String keystorePath) throws IOException;

    void removeAllKeyStoreElements(KeyStore keyStore) throws KeyStoreException;

    void removeKeyStoreElement(KeyStore keyStore, String secretKey) throws KeyStoreException;
}
