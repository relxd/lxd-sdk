package org.relxd.lxd.auth.javakeystore;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public interface JavaKeyStoreService {

    void StoreCertificateToKeyStore(String alias, X509Certificate[] certificateChain, SecretKey privateKey, String password, String filePath) throws Exception;

    Certificate[] LoadCertificateFromKeyStore(String alias, String filePath, String password);

    void DeleteKeyStore(String keystorePath) throws IOException;

    void RemoveAllKeyStoreElements(KeyStore keyStore) throws KeyStoreException;

    void RemoveKeyStoreElement(KeyStore keyStore, String secretKey) throws KeyStoreException;
}
