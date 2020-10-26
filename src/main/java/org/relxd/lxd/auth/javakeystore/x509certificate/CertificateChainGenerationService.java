package org.relxd.lxd.auth.javakeystore.x509certificate;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public interface CertificateChainGenerationService {

    X509Certificate generateX509Certificate() throws Exception;

    X509Certificate createSignedCertificate(X509Certificate cetrificate, X509Certificate issuerCertificate, PrivateKey issuerPrivateKey);
}
