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


package org.relxd.lxd.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.relxd.lxd.model.DevicesKvm;

/**
 * CreateInstancesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class CreateInstancesRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private List<String> profiles = new ArrayList<String>();

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private Boolean ephemeral;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Map<String, Object> config = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private DevicesKvm devices;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "instance_type";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private String instanceType;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Map<String, Object> source = new HashMap<String, Object>();


  public CreateInstancesRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 64 chars max, ASCII, no slash, no colon and no comma
   * @return name
  **/
  @ApiModelProperty(example = "my-new-instance", required = true, value = "64 chars max, ASCII, no slash, no colon and no comma")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateInstancesRequest architecture(String architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @ApiModelProperty(example = "x86_64", required = true, value = "")

  public String getArchitecture() {
    return architecture;
  }


  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public CreateInstancesRequest profiles(List<String> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public CreateInstancesRequest addProfilesItem(String profilesItem) {
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * List of profiles
   * @return profiles
  **/
  @ApiModelProperty(example = "[\"default\"]", required = true, value = "List of profiles")

  public List<String> getProfiles() {
    return profiles;
  }


  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }


  public CreateInstancesRequest ephemeral(Boolean ephemeral) {
    
    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * Whether to destroy the instance on shutdown
   * @return ephemeral
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether to destroy the instance on shutdown")

  public Boolean getEphemeral() {
    return ephemeral;
  }


  public void setEphemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
  }


  public CreateInstancesRequest config(Map<String, Object> config) {
    
    this.config = config;
    return this;
  }

  public CreateInstancesRequest putConfigItem(String key, Object configItem) {
    this.config.put(key, configItem);
    return this;
  }

   /**
   * This is a map of config parameters to be used during instance creation. The keys for this map are the keys from instance.md file (https://github.com/lxc/lxd/blob/master/doc/instances.md#keyvalue-configuration) and values are the fields to set.
   * @return config
  **/
  @ApiModelProperty(example = "{\"limits.cpu\":\"2\",\"limits.memory\":\"512MB\"}", required = true, value = "This is a map of config parameters to be used during instance creation. The keys for this map are the keys from instance.md file (https://github.com/lxc/lxd/blob/master/doc/instances.md#keyvalue-configuration) and values are the fields to set.")

  public Map<String, Object> getConfig() {
    return config;
  }


  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }


  public CreateInstancesRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Optional. Can be \&quot;virtual-machine\&quot;, \&quot;container\&quot; - by default it set to \&quot;container\&quot;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "container", value = "Optional. Can be \"virtual-machine\", \"container\" - by default it set to \"container\"")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateInstancesRequest devices(DevicesKvm devices) {
    
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DevicesKvm getDevices() {
    return devices;
  }


  public void setDevices(DevicesKvm devices) {
    this.devices = devices;
  }


  public CreateInstancesRequest instanceType(String instanceType) {
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * An optional instance type to use as basis for limits
   * @return instanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c2.micro", value = "An optional instance type to use as basis for limits")

  public String getInstanceType() {
    return instanceType;
  }


  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }


  public CreateInstancesRequest source(Map<String, Object> source) {
    
    this.source = source;
    return this;
  }

  public CreateInstancesRequest putSourceItem(String key, Object sourceItem) {
    this.source.put(key, sourceItem);
    return this;
  }

   /**
   * Source to be used to create this container. Can be: \&quot;image\&quot;, \&quot;migration\&quot;, \&quot;copy\&quot; or \&quot;none\&quot;
   * @return source
  **/
  @ApiModelProperty(example = "{\"type\":\"image\",\"fingerprint\":\"6d825770a54383a01cdb78ae1c66260024629bb3b362f0ecd7b74dfcc8aa435f\"}", required = true, value = "Source to be used to create this container. Can be: \"image\", \"migration\", \"copy\" or \"none\"")

  public Map<String, Object> getSource() {
    return source;
  }


  public void setSource(Map<String, Object> source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesRequest createInstancesRequest = (CreateInstancesRequest) o;
    return Objects.equals(this.name, createInstancesRequest.name) &&
        Objects.equals(this.architecture, createInstancesRequest.architecture) &&
        Objects.equals(this.profiles, createInstancesRequest.profiles) &&
        Objects.equals(this.ephemeral, createInstancesRequest.ephemeral) &&
        Objects.equals(this.config, createInstancesRequest.config) &&
        Objects.equals(this.type, createInstancesRequest.type) &&
        Objects.equals(this.devices, createInstancesRequest.devices) &&
        Objects.equals(this.instanceType, createInstancesRequest.instanceType) &&
        Objects.equals(this.source, createInstancesRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, architecture, profiles, ephemeral, config, type, devices, instanceType, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
