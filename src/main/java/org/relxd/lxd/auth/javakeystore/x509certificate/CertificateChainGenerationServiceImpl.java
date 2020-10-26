package org.relxd.lxd.auth.javakeystore.x509certificate;

import sun.security.tools.keytool.CertAndKeyGen;
import sun.security.x509.*;

import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class CertificateChainGenerationServiceImpl implements CertificateChainGenerationService {

    public X509Certificate generateX509Certificate() throws Exception {
        // generate the certificate
        // first parameter  = Algorithm
        // second parameter = signrature algorithm
        // third parameter  = the provider to use to generate the keys (may be null or
        //                    use the constructor without provider)
        CertAndKeyGen certGen = new CertAndKeyGen("RSA", "SHA256WithRSA", null);
        // generate it with 2048 bits
        certGen.generate(2048);
        // prepare the validity of the certificate
        long validSecs = (long) 365 * 24 * 60 * 60; // valid for one year
        // add the certificate information, currently only valid for one year.
        X509Certificate cert = certGen.getSelfCertificate(
        //details according to our application
        new X500Name("CN=Lxd Application,O=Competition Labs,L=United Kingdom ,C=DE"), validSecs);

        return cert;
    }

    public X509Certificate createSignedCertificate(X509Certificate cetrificate, X509Certificate issuerCertificate, PrivateKey issuerPrivateKey){

        try{
            Principal issuer = issuerCertificate.getSubjectDN();
            String issuerSigAlg = issuerCertificate.getSigAlgName();

            byte[] inCertBytes = cetrificate.getTBSCertificate();
            X509CertInfo info = new X509CertInfo(inCertBytes);
            info.set(X509CertInfo.ISSUER, new CertificateIssuerName((X500Name) issuer));

            //No need to add the BasicConstraint for leaf cert
            if(!cetrificate.getSubjectDN().getName().equals("CN=TOP")){
                CertificateExtensions exts=new CertificateExtensions();
                BasicConstraintsExtension bce = new BasicConstraintsExtension(true, -1);
                exts.set(BasicConstraintsExtension.NAME,new BasicConstraintsExtension(false, bce.getExtensionValue()));
                info.set(X509CertInfo.EXTENSIONS, exts);
            }

            X509CertImpl outCert = new X509CertImpl(info);
            outCert.sign(issuerPrivateKey, issuerSigAlg);

            return outCert;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
