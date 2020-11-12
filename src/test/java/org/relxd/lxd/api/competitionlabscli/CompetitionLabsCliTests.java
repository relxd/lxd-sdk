package org.relxd.lxd.api.competitionlabscli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.relxd.lxd.ApiException;
import org.relxd.lxd.api.ImagesApi;
import org.relxd.lxd.api.trusted.ImagesApiTest;
import org.relxd.lxd.api.trusted.InstancesApiTest;
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CompetitionLabsCliTests {

    private ImagesApiTest imagesApiTest;
    private ImagesApi imagesApi;
    private InstancesApiTest instancesApiTest;

    private List<String> getImageResponseUrls;
    private Logger logger;

    @BeforeEach
    public void init(){
        imagesApiTest = new ImagesApiTest();
        imagesApi = new ImagesApi();
        instancesApiTest =  new InstancesApiTest();
        logger = LoggerFactory.getLogger(InstancesApiTest.class);
    }

    @Test
    public void createInstanceFromImage(){
        imagesApiTest.postImagesTest();

        try {
            final BackgroundOperationResponse images = imagesApi.getImages(0, null);
            if (images != null){
                getImageResponseUrls = (List<String>) images.getMetadata();
                if(getImageResponseUrls.size()>0)
                    logger.info("Metadata >>>>>>> {}", getImageResponseUrls.get(0));
            }

            String[] splitUrl;
            String fingerprint = null;

            if (getImageResponseUrls != null) {

                for (String imageUrl : getImageResponseUrls) {
                    splitUrl = imageUrl.split("/");
                    logger.info("Image Fingerprint >>>>> {}", splitUrl[3]);
                    fingerprint = splitUrl[3];
                }

                final BackgroundOperationResponse backgroundOperationResponse = instancesApiTest.postInstances(fingerprint);

                logger.info("Create Instance Response >>>>> {}", backgroundOperationResponse);
            }

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
