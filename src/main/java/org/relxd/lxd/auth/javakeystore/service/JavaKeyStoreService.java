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

import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;

public interface JavaKeyStoreService {

    void exportKeyPairToKeystoreFile(KeyPair keyPair, Certificate certificate, String alias, String fileName, String storeType, String storePass) throws Exception;

    Certificate[] loadCertificateFromKeyStore(String alias, String filePath, String password);

    public KeyStore getKeyStore(String filePath, String password);

    void deleteKeyStore(String keystorePath) throws IOException;

    void removeAllKeyStoreElements(KeyStore keyStore) throws KeyStoreException;

    void removeKeyStoreElement(KeyStore keyStore, String secretKey) throws KeyStoreException;
}
