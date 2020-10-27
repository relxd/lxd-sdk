package org.relxd.lxd.auth.javakeystore.x509certificate;

import java.security.KeyPair;
import java.security.cert.X509Certificate;

public class X509CertificateAndKeyPair {

    private X509Certificate x509Certificate;

    private KeyPair keyPair;

    public X509Certificate getX509Certificate() {
        return x509Certificate;
    }

    public void setX509Certificate(X509Certificate x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    public KeyPair getKeyPair() {
        return keyPair;
    }

    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    @Override
    public String toString() {
        return "X509CertificateAndKeyPair{" +
                "x509Certificate=" + x509Certificate +
                ", keyPair=" + keyPair +
                '}';
    }
}
