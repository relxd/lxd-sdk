package org.relxd.lxd.auth.javakeystore.x509certificate.service;

import org.relxd.lxd.auth.javakeystore.x509certificate.X509CertificateAndKeyPair;

import java.security.cert.Certificate;

public interface CertificateChainGenerationService {

    X509CertificateAndKeyPair generateX509Certificate(String issuedTo, String rootCertificateAlias, String issuedCertificateAliase) throws Exception;

    void writeCertToFileBase64Encoded(Certificate certificate, String fileName) throws Exception;

}



