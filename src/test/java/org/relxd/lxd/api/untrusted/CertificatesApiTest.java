
package org.relxd.lxd.api.untrusted;

import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.api.CertificatesApi;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.CreateCertificatesRequest;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.UpdateFingerprintRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for CertificatesApi
 */

public class CertificatesApiTest {

    private CertificatesApi api;

    private Logger logger;

    @Before
    public void setup() {
        new RelxdApiClient();
        api = new CertificatesApi();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    /**
     *
     *
     * Add a new trusted certificate
     *
     */
    @Test
    public void postCertificatesTest() {
        CreateCertificatesRequest request = new CreateCertificatesRequest();
        request.setName("my-certificate");
        request.setType("client");
        request.setPassword("pass123");
        request.setCertificate("MIIEOzCCAyOgAwIBAgIUHmwoNiAlHHzPQXK/7bOcQDinLO8wDQYJKoZIhvcNAQELBQAwgawxCzAJBgNVBAYTAlpXMQ8wDQYDVQQIDAZIYXJhcmUxDzANBgNVBAcMBkhhcmFyZTEZMBcGA1UECgwQQ29tcGV0aXRpb24gTGFiczEdMBsGA1UECwwUU29mdHdhcmUgRGV2ZWxvcG1lbnQxFzAVBgNVBAMMDkdpdmVuIFBmdW5ndXJvMSgwJgYJKoZIhvcNAQkBFhlnaXZlbkBjb21wZXRpdGlvbmxhYnMuY29tMB4XDTIwMTAxMTAxMzg1NVoXDTIxMTAxMTAxMzg1NVowgawxCzAJBgNVBAYTAlpXMQ8wDQYDVQQIDAZIYXJhcmUxDzANBgNVBAcMBkhhcmFyZTEZMBcGA1UECgwQQ29tcGV0aXRpb24gTGFiczEdMBsGA1UECwwUU29mdHdhcmUgRGV2ZWxvcG1lbnQxFzAVBgNVBAMMDkdpdmVuIFBmdW5ndXJvMSgwJgYJKoZIhvcNAQkBFhlnaXZlbkBjb21wZXRpdGlvbmxhYnMuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2qyPVx7pwVgz1FDHy3NLWIT2kRk02SdWbtDPyS2/eES+6Dkdn2bFzi+RLEDMnO950B0uhOC6DyRdGB+SXQXpV4QTxS8AuJrIfEPAcV51c43iTxi1mBgzJ5PAwNME7/k2ef27gY/5fPcllwAlutUU1VqURseMzNpJK317hU8mAGPHHoKKBYJqrt5gw+gD+zVkTe2dB2PALf6bidHGY16E/+33yRQkysYPd1cpq5G8fIdlX7hZxbTFsvDKZWZQNUWRrSlqovVHwIrjVoh7WdPCi17osXFep3YmgSaOTTaVvGjsWJMfKeoQQU0LeIMjPgbYqPg8NzZXJXgUJgoDSN+IfwIDAQABo1MwUTAdBgNVHQ4EFgQUlhMFs/ye5EV9Fcww85vz1bswpJgwHwYDVR0jBBgwFoAUlhMFs/ye5EV9Fcww85vz1bswpJgwDwYDVR0TAQH/BAUwAwEB/zANBgkqhkiG9w0BAQsFAAOCAQEACdIbzOHTcD95pz0Bk5Vqp3ziNW7c0Uoq7pPihdHNwVmuuDFH17+J4u7syu4z3Wedsxyrtxm5LN8zMnXFY5hvJ5P0hYSYEu0r1dIA7GA+qqtoyWHHhx7vKZm7Z5nWvodZtHQVk20WyTPZfH6oF5RMYbAB/nkAn7L4C/XfuEyGkd20g+y2o0ee+/MHuDSNH4QD9sB13GHTWULdJj9yXLi+bUMGwkv2AEmEdIlFLm34cpOmZ6NeJ0IVtxh3H579m3/WMudeMfpXsRKvcuAJdTijDVSNeJxk/iVSfP/Snq8/id2tKmnQlBh/cdEq1UtX1NL7YTHGnAkO4JmHjIp1qIRJYA==");

        try {
            BackgroundOperationResponse response = api.postCertificates(request);
            logger.info("Post Certificates Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse = json.deserialize(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException ex){

        }
        return errorResponse;
    }
}