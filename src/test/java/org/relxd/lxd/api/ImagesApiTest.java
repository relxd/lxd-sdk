/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@relxd.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.api;

import org.junit.Before;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.CreateImagesAliasesByNameRequest;
import org.relxd.lxd.model.CreateImagesAliasesRequest;
import org.relxd.lxd.model.CreateImagesFingerprintExportRequest;
import org.relxd.lxd.model.CreateImagesRequest;
import org.relxd.lxd.model.ErrorResponse;
import org.relxd.lxd.model.PatchImagesFingerprintRequest;
import org.relxd.lxd.model.UpdateImagesAliasesByNameRequest;
import org.relxd.lxd.model.UpdateImagesFingerprintRequest;
import org.junit.Test;
import org.junit.Ignore;
import org.relxd.lxd.service.linuxCmd.LinuxCmdService;
import org.relxd.lxd.service.linuxCmd.LinuxCmdServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.spy;

/**
 * API tests for ImagesApi
 */

public class ImagesApiTest {

    private final ImagesApi api = new ImagesApi();
    private final Logger logger = LoggerFactory.getLogger(SupportedApisApiTest.class);
    private LinuxCmdService linuxCmdService;

    @Before
    public void setup() {

        linuxCmdService = spy(new LinuxCmdServiceImpl());
    }
    /**
     * 
     *
     * Remove an alias
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteImagesAliasesByNameTest() throws ApiException {
        String name = null;
        BackgroundOperationResponse response = api.deleteImagesAliasesByName(name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteImagesFingerprintTest() throws ApiException {
        String fingerprint = null;
        BackgroundOperationResponse response = api.deleteImagesFingerprint(fingerprint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List of images (public or private)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesTest() throws ApiException {
        final String getImagesCommand = "curl -s --unix-socket /var/snap/lxd/common/lxd/unix.socket a/1.0/images";
        Integer recursion = null;
        String filter = null;

        try
        {

            final BackgroundOperationResponse expectedGetImagesResponse = linuxCmdService.executeLinuxCmdWithResultJsonObject(getImagesCommand, BackgroundOperationResponse.class);
            logger.info("Expected Get Images Response >>>>>>>>>> " + expectedGetImagesResponse);

            BackgroundOperationResponse actualGetImagesResponse = api.getImages(recursion, filter);
            logger.info("Actual Get Images Response >>>>>>>>>> " + actualGetImagesResponse);

            assertEquals(expectedGetImagesResponse, actualGetImagesResponse);

        } catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }


    }
    
    /**
     * 
     *
     * List of aliases (public or private based on image visibility)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesAliasesTest() throws ApiException {
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getImagesAliases(recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Alias description and target
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesAliasesByNameTest() throws ApiException {
        String name = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getImagesAliasesByName(name, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Download the image tarball
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesByFingerprintExportTest() throws ApiException {
        String fingerprint = null;
        Integer recursion = null;
        String filter = null;
        String secret = null;
        BackgroundOperationResponse response = api.getImagesByFingerprintExport(fingerprint, recursion, filter, secret);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Image description and metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesFingerprintTest() throws ApiException {
        String fingerprint = null;
        Integer recursion = null;
        String filter = null;
        String secret = null;
        BackgroundOperationResponse response = api.getImagesFingerprint(fingerprint, recursion, filter, secret);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Refresh an image from its origin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImagesFingerprintRefreshTest() throws ApiException {
        String fingerprint = null;
        Integer recursion = null;
        String filter = null;
        BackgroundOperationResponse response = api.getImagesFingerprintRefresh(fingerprint, recursion, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates the alias target or description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchImagesAliasesByNameTest() throws ApiException {
        String name = null;
        UpdateImagesAliasesByNameRequest body = null;
        BackgroundOperationResponse response = api.patchImagesAliasesByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates the image properties, update information and visibility
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchImagesFingerprintTest() throws ApiException {
        String fingerprint = null;
        PatchImagesFingerprintRequest body = null;
        BackgroundOperationResponse response = api.patchImagesFingerprint(fingerprint, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create and publish a new image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImagesTest() throws ApiException {
        String xLXDFingerprint = null;
        String xLXDFilename = null;
        Boolean xLXDPublic = null;
        String xLXDProperties = null;
        CreateImagesRequest body = null;
        BackgroundOperationResponse response = api.postImages(xLXDFingerprint, xLXDFilename, xLXDPublic, xLXDProperties, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new alias
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImagesAliasesTest() throws ApiException {
        CreateImagesAliasesRequest body = null;
        BackgroundOperationResponse response = api.postImagesAliases(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Rename an alias
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImagesAliasesByNameTest() throws ApiException {
        String name = null;
        CreateImagesAliasesByNameRequest body = null;
        BackgroundOperationResponse response = api.postImagesAliasesByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Upload the image tarball
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImagesFingerprintExportTest() throws ApiException {
        String fingerprint = null;
        CreateImagesFingerprintExportRequest body = null;
        BackgroundOperationResponse response = api.postImagesFingerprintExport(fingerprint, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Generate a random token and tell LXD to expect it be used by a guest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postImagesFingerprintSecretTest() throws ApiException {
        String fingerprint = null;
        Object body = null;
        BackgroundOperationResponse response = api.postImagesFingerprintSecret(fingerprint, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replaces the alias target or description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImagesAliasesByNameTest() throws ApiException {
        String name = null;
        UpdateImagesAliasesByNameRequest body = null;
        BackgroundOperationResponse response = api.putImagesAliasesByName(name, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replaces the image properties, update information and visibility
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putImagesFingerprintTest() throws ApiException {
        String fingerprint = null;
        UpdateImagesFingerprintRequest body = null;
        BackgroundOperationResponse response = api.putImagesFingerprint(fingerprint, body);

        // TODO: test validations
    }
    
}
