package org.relxd.lxd.client;

import org.relxd.lxd.client.api.*;

public final class ApiServices {

    private CertificatesApi certificatesApi;
    private ClusterApi clusterApi;
    private EventsApi eventsApi;
    private ImagesApi imagesApi;
    private InstancesApi instancesApi;
    private NetworksApi networksApi;
    private OperationsApi operationsApi;
    private ProfilesApi profilesApi;
    private ProjectsApi projectsApi;
    private ResourcesApi resourcesApi;
    private ServerConfigApi serverConfigApi;
    private StoragePoolsApi storagePoolsApi;
    private SupportedApisApi supportedApisApi;
    

    public ApiServices() {
    }

     public CertificatesApi getCertificatesApi(){
        if(this.certificatesApi == null)
            this.certificatesApi = new CertificatesApi();
        return this.certificatesApi;
    }

     public ClusterApi getClusterApi(){
        if(this.clusterApi == null)
            this.clusterApi = new ClusterApi();
        return this.clusterApi;
    }

     public EventsApi getEventsApi(){
        if(this.eventsApi == null)
            this.eventsApi = new EventsApi();
        return this.eventsApi;
    }

     public ImagesApi getImagesApi(){
        if(this.imagesApi == null)
            this.imagesApi = new ImagesApi();
        return this.imagesApi;
    }

     public InstancesApi getInstancesApi(){
        if(this.instancesApi == null)
            this.instancesApi = new InstancesApi();
        return this.instancesApi;
    }

     public NetworksApi getNetworksApi(){
        if(this.networksApi == null)
            this.networksApi = new NetworksApi();
        return this.networksApi;
    }

     public OperationsApi getOperationsApi(){
        if(this.operationsApi == null)
            this.operationsApi = new OperationsApi();
        return this.operationsApi;
    }

     public ProfilesApi getProfilesApi(){
        if(this.profilesApi == null)
            this.profilesApi = new ProfilesApi();
        return this.profilesApi;
    }

     public ProjectsApi getProjectsApi(){
        if(this.projectsApi == null)
            this.projectsApi = new ProjectsApi();
        return this.projectsApi;
    }

     public ResourcesApi getResourcesApi(){
        if(this.resourcesApi == null)
            this.resourcesApi = new ResourcesApi();
        return this.resourcesApi;
    }

     public ServerConfigApi getServerConfigApi(){
        if(this.serverConfigApi == null)
            this.serverConfigApi = new ServerConfigApi();
        return this.serverConfigApi;
    }

     public StoragePoolsApi getStoragePoolsApi(){
        if(this.storagePoolsApi == null)
            this.storagePoolsApi = new StoragePoolsApi();
        return this.storagePoolsApi;
    }

     public SupportedApisApi getSupportedApisApi(){
        if(this.supportedApisApi == null)
            this.supportedApisApi = new SupportedApisApi();
        return this.supportedApisApi;
    }

    
}
