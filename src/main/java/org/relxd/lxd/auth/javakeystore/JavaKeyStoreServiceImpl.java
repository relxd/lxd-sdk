package org.relxd.lxd.auth.javakeystore;

import javax.crypto.SecretKey;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

public class JavaKeyStoreServiceImpl implements JavaKeyStoreService{


    public void StoreCertificateToKeyStore(String alias, X509Certificate[] certificateChain, SecretKey privateKey, String password, String filePath) throws Exception{

        File file = new File(filePath);
        KeyStore javaKeyStore = KeyStore.getInstance("JCEKS");
        if (!file.exists()){
            javaKeyStore.load(null, null);
        }
        if (javaKeyStore.containsAlias(alias)){
            throw new Exception("The keystore already contains that alias, try another one");
        }

        javaKeyStore.setKeyEntry(alias,privateKey, password.toCharArray(),certificateChain);
        OutputStream writeStream = new FileOutputStream(filePath);
        javaKeyStore.store(writeStream, password.toCharArray());
    }

    public Certificate[] LoadCertificateFromKeyStore(String alias, String filePath, String password){

        try{
        KeyStore keyStore = KeyStore.getInstance("JCEKS");
            InputStream readStream = new FileInputStream(filePath);
            keyStore.load(readStream, password.toCharArray());
            final Certificate[] certificateChain = keyStore.getCertificateChain(alias);

            return certificateChain;

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return null;
    }

    public void DeleteKeyStore(String keystorePath) throws IOException{

        Files.delete(Paths.get(keystorePath));

    }

    public void RemoveAllKeyStoreElements(KeyStore keyStore) throws KeyStoreException {

        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String alias = aliases.nextElement();
            keyStore.deleteEntry(alias);
        }
    }

    public void RemoveKeyStoreElement(KeyStore keyStore, String secretKey) throws KeyStoreException{
        keyStore.deleteEntry(secretKey);
    }

}
