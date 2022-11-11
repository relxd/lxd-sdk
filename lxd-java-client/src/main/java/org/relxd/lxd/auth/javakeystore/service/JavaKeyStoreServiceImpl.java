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

package org.relxd.lxd.auth.javakeystore.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.util.Enumeration;

public class JavaKeyStoreServiceImpl implements JavaKeyStoreService{

    private static final String BC_PROVIDER = "BC";

    Logger logger = LoggerFactory.getLogger(JavaKeyStoreService.class);

    public void exportKeyPairToKeystoreFile(KeyPair keyPair, Certificate certificate, String alias, String fileName, String storeType, String storePass) throws Exception {
        KeyStore sslKeyStore = KeyStore.getInstance(storeType, BC_PROVIDER);
        File file = new File(fileName);
        if (!file.exists()) {
            sslKeyStore.load(null, null);
        }else {
            InputStream readCert = new FileInputStream(file);
            try {
                sslKeyStore.load(readCert, storePass.toCharArray());
            } finally {
                readCert.close();
            }
        }

        if (sslKeyStore.containsAlias(alias)){
            throw new Exception("The keystore already contains alias :" + alias + ", try another one");
        }

        sslKeyStore.setKeyEntry(alias, keyPair.getPrivate(),null, new Certificate[]{certificate});
        FileOutputStream keyStoreOs = new FileOutputStream(fileName);
        sslKeyStore.store(keyStoreOs, storePass.toCharArray());
    }

    public Certificate[] loadCertificateFromKeyStore(String alias, String filePath, String password){

        try{
        KeyStore keyStore = getKeyStore(filePath, password);

            final Certificate[] certificateChain = keyStore.getCertificateChain(alias);
            if (null == certificateChain) {
                throw new Exception("There is no X.509 certificate chain under alias " + alias);
            }else {
                logger.info("FOUND CERTIFICATES ::>> {}", certificateChain.length);
                return certificateChain;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return null;
    }

    public KeyStore getKeyStore(String filePath, String password) {

        try{
            File file = new File(filePath);
            if (!file.exists()) {
                throw new Exception("Keystore does not exist at path :"+ filePath);
            }

            KeyStore keyStore = KeyStore.getInstance("PKCS12");


            InputStream readStream = new FileInputStream(filePath);

            try{
                keyStore.load(readStream, password.toCharArray());
            }finally {
                readStream.close();
            }

            return keyStore;

    }catch (Exception ex){
            throw new RuntimeException(ex);
        }

}

    public void deleteKeyStore(String keystorePath) throws IOException{

        Files.delete(Paths.get(keystorePath));

    }

    public void removeAllKeyStoreElements(KeyStore keyStore) throws KeyStoreException {

        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String alias = aliases.nextElement();
            keyStore.deleteEntry(alias);
        }
    }

    public void removeKeyStoreElement(KeyStore keyStore, String secretKey) throws KeyStoreException{
        keyStore.deleteEntry(secretKey);
    }

}
