
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

package org.relxd.lxd.client.api.trusted;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonSyntaxException;
import org.junit.Before;
import org.junit.Test;
import org.relxd.lxd.CompleteableFutureTestWrapper;
import org.relxd.lxd.client.ApiException;
import org.relxd.lxd.client.JSON;
import org.relxd.lxd.RelxdApiClient;
import org.relxd.lxd.client.api.CertificatesApi;
import org.relxd.lxd.client.model.BackgroundOperationResponse;
import org.relxd.lxd.client.model.CreateCertificatesRequest;
import org.relxd.lxd.client.model.ErrorResponse;
import org.relxd.lxd.client.model.UpdateFingerprintRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * API tests for CertificatesApi
 */

public class CertificatesApiTest implements CompleteableFutureTestWrapper {

    private CertificatesApi api;

    private Logger logger;

    @Before
    public void setup() {
        var apiClient = new RelxdApiClient();
        api = apiClient.services().getCertificatesApi();
       logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    /**
     *
     *
     * Remove a trusted certificate
     *
     */
    @Test
    public void deleteFingerprintTest() {
        String fingerprint = "";

        try {
            BackgroundOperationResponse response = $( api.deleteFingerprint(fingerprint) );
            logger.info("Get Certificates Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Return a list of trusted certificates
     *
     */
    @Test
    public void getCertificatesTest() {
        Integer recursion = null;
        String filter = null;

        try {
            BackgroundOperationResponse response = $( api.getCertificates(recursion, filter) );
            logger.info("Get Certificates Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Return a trusted certificate information
     *
     */
    @Test
    public void getCertificatesByFingerPrintTest() {

        String fingerprint = "4ed5800011eb95372db2f52b0da18190bc1a49ee7dd38033533cfdcea35b284d";

        try {
            BackgroundOperationResponse response = $( api.getCertificatesByFingerPrint(fingerprint) );
            logger.info("Get Certificates Fingerprint Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Updates the certificate properties
     *
     */
    @Test
    public void patchFingerprintTest() {
        String fingerprint = "4ed5800011eb95372db2f52b0da18190bc1a49ee7dd38033533cfdcea35b284d";
        UpdateFingerprintRequest request = new UpdateFingerprintRequest();
        request.setName("new-cert-name");
        request.setType("client");

        try {
            BackgroundOperationResponse response = $( api.patchFingerprint(fingerprint, request) );
            logger.info("Patch Certificates Fingerprint Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
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
        request.setCertificate("MIIFzzCCA7cCFFkXu+TD9zpOyDfy1RaR449z8EDdMA0GCSqGSIb3DQEBCwUAMIGj\n" +
                "MQswCQYDVQQGEwJaVzEPMA0GA1UECAwGSGFyYXJlMQ8wDQYDVQQHDAZIYXJhcmUx\n" +
                "GTAXBgNVBAoMEENvbXBldGl0aW9uIExBYnMxHTAbBgNVBAsMFFNvZnR3YXJlIGRl\n" +
                "dmVsb3BtZW50MQ4wDAYDVQQDDAVHaXZlbjEoMCYGCSqGSIb3DQEJARYZZ2l2ZW5A\n" +
                "Y29tcGV0aXRpb25sYWJzLmNvbTAeFw0yMDExMDUxMzIzMTFaFw0zMDExMDMxMzIz\n" +
                "MTFaMIGjMQswCQYDVQQGEwJaVzEPMA0GA1UECAwGSGFyYXJlMQ8wDQYDVQQHDAZI\n" +
                "YXJhcmUxGTAXBgNVBAoMEENvbXBldGl0aW9uIExBYnMxHTAbBgNVBAsMFFNvZnR3\n" +
                "YXJlIGRldmVsb3BtZW50MQ4wDAYDVQQDDAVHaXZlbjEoMCYGCSqGSIb3DQEJARYZ\n" +
                "Z2l2ZW5AY29tcGV0aXRpb25sYWJzLmNvbTCCAiIwDQYJKoZIhvcNAQEBBQADggIP\n" +
                "ADCCAgoCggIBAL3OknhZx+Z665aY3ou2cgqWxnPuvH/1g3DNU1jr0d3NobB13Ngy\n" +
                "WCzknoitpqDSlJKqBzbLDV+c5Kw8XFveKjIg5+BzXEvRuM4pQ6MLDu1mKoE6N+Yd\n" +
                "M3MrQt+7reFfUWg3MWsRUM+u/lQBQl1k2aIF6wSRBdf+H53mEm4wTwVyriuANv+t\n" +
                "cK+lKTd8bTN/GfN3CIbBGq5Pe6aZa19xnVFNh3C6AfT5kZIpjQOjyqctnSUx2zap\n" +
                "LnmcMqEKGoE9L2mbNdlybtq8Qiy0HmG4Rc3GMVJvmf57M/aefwTtm0401vNSz8Wd\n" +
                "KjHMMftwYVOh9PP6G99OqEQZGaOnn9eQT2caS0pO7CUq0jqG5ObzbV8KszbF+Xji\n" +
                "hrSyjshHkxttndbKgTwOl5nZuMZ9hmO58mTE6tTS3Q1rRDB+CfERBFxg+jUJc2P+\n" +
                "zFe+rbLm2+J2qFnyn/jGkPCpF4d3Zfu73Qs8cS+VeVDKf6eJVPDFWDjtyBnsK390\n" +
                "dOiNDAmpqysek5088Mu/zwmj0ke1zb7FToUbOO72k2+WPmEXL1yDDPwumTIjGnP+\n" +
                "SaerZl5KGr7grDzIU7piNxxuke3+koCJhX8Z6kHVdlhlt0JlPG2zcgFYzxYx5Kag\n" +
                "mcxJrxuDqZ2XynPX8w6lyRbwNoksXXPI0OjElT5DlJ6Pa46Ise9ZmNbFAgMBAAEw\n" +
                "DQYJKoZIhvcNAQELBQADggIBAADhj0Oe2dlWQM3upcUnUGz1yGNWBXPntcPA5az5\n" +
                "6gtUpuDVRuZTa6yq0d/BUnJhFULvXXVJZnH5OdhStG8m1TpVfHUM0SF82p74Dwm0\n" +
                "itzx5qYp8xWTJjYxgG7NeVdqtmXwmjkV4jlzZrZjlPF41/APHcghaNAJDM9qfVrE\n" +
                "2rBOc97wfPxSrncm7khmcmo9JMM447KQdU6tolfvRDaGjmZ7JvwNMM7dPVQSXkA5\n" +
                "jsNq871CZMxbpY1su38xTJJ5Jivanoec7B+TjGLCkz/7CWxtCQwmMURlKMSvlL6W\n" +
                "y4kXoyvFeyGCm//YnGpUyNZxRlM5myfrLRdhlXVaMSNoTWUWSUjZF6HBAVEGKIbD\n" +
                "orsMDm37bnMS0CHDxZ0cUPCwxBJhYZJJQUiXCildp58vsbSJl3+3RhpPD+X/4sdA\n" +
                "F7F9EVNAnovJRdjMMRcb5bzuu7Q0m2ujTuJUhX//K240j5ZH5lkQ+/uuILkbd9ST\n" +
                "29EpN8W+sMyJmHFjKR9iisCmK+5sc+gclwjnACPM3Mqp/OVbeVG1T/UK2LWJ6Jzi\n" +
                "LKnZf28zMC0HW02mtOk4d5dcvg6mXJEVfJKUvPaUviyMv3N3BMLKTL+/15tN8Fb7\n" +
                "YYDF2o/vIljSSrLzeP1mx1FHnqdBRggeDo4QfFGvZiZoz16t5e8KE4dZPPImO2Z8\n" +
                "YAUN");

        try {
            BackgroundOperationResponse response = $( api.postCertificates(request) );
            logger.info("Post Certificates Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    /**
     *
     *
     * Replaces the certificate properties
     *
     */
    @Test
    public void putFingerprintTest() {
        String fingerprint = "4ed5800011eb95372db2f52b0da18190bc1a49ee7dd38033533cfdcea35b284d";
        UpdateFingerprintRequest request = new UpdateFingerprintRequest();
        request.setName("baz");
        request.setType("client");

        try {
            BackgroundOperationResponse response = $( api.putFingerprint(fingerprint, request) );
            logger.info("Put Certificates Fingerprint Response >>>>>> {}", response);

            assertEquals(response.getStatusCode(), Integer.valueOf(200));

        }catch (ApiException ex){
            catchApiException(ex);
        }
    }

    private ErrorResponse catchApiException(ApiException e) {
        JSON json = new JSON();
        ErrorResponse errorResponse = new ErrorResponse();
        try {
            errorResponse = json.getMapper().readValue(e.getResponseBody(), ErrorResponse.class);
            logger.info("ERROR RESPONSE >>>> " + errorResponse);
        }catch (JsonSyntaxException | JsonProcessingException ex){

        }
        return errorResponse;
    }
}