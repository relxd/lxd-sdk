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
import java.util.List;
import org.relxd.lxd.model.DevicesRoot;
import org.relxd.lxd.model.ExpandedConfig;
import org.relxd.lxd.model.ExpandedDevices;
import org.relxd.lxd.model.HardwareSpecsConfig;

/**
 * GetInstancesByNameResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-18T21:27:43.349207+02:00[Africa/Harare]")
public class GetInstancesByNameResponse {
  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private HardwareSpecsConfig config;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private DevicesRoot devices;

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private Boolean ephemeral;

  public static final String SERIALIZED_NAME_EXPANDED_CONFIG = "expanded_config";
  @SerializedName(SERIALIZED_NAME_EXPANDED_CONFIG)
  private ExpandedConfig expandedConfig;

  public static final String SERIALIZED_NAME_EXPANDED_DEVICES = "expanded_devices";
  @SerializedName(SERIALIZED_NAME_EXPANDED_DEVICES)
  private ExpandedDevices expandedDevices;

  public static final String SERIALIZED_NAME_LAST_USED_AT = "last_used_at";
  @SerializedName(SERIALIZED_NAME_LAST_USED_AT)
  private String lastUsedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private List<String> profiles = null;

  public static final String SERIALIZED_NAME_STATEFUL = "stateful";
  @SerializedName(SERIALIZED_NAME_STATEFUL)
  private Boolean stateful;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;


  public GetInstancesByNameResponse architecture(String architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "x86_64", value = "")

  public String getArchitecture() {
    return architecture;
  }


  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public GetInstancesByNameResponse config(HardwareSpecsConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HardwareSpecsConfig getConfig() {
    return config;
  }


  public void setConfig(HardwareSpecsConfig config) {
    this.config = config;
  }


  public GetInstancesByNameResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-02-16T01:05:05Z", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public GetInstancesByNameResponse devices(DevicesRoot devices) {
    
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DevicesRoot getDevices() {
    return devices;
  }


  public void setDevices(DevicesRoot devices) {
    this.devices = devices;
  }


  public GetInstancesByNameResponse ephemeral(Boolean ephemeral) {
    
    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * Get ephemeral
   * @return ephemeral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getEphemeral() {
    return ephemeral;
  }


  public void setEphemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
  }


  public GetInstancesByNameResponse expandedConfig(ExpandedConfig expandedConfig) {
    
    this.expandedConfig = expandedConfig;
    return this;
  }

   /**
   * Get expandedConfig
   * @return expandedConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpandedConfig getExpandedConfig() {
    return expandedConfig;
  }


  public void setExpandedConfig(ExpandedConfig expandedConfig) {
    this.expandedConfig = expandedConfig;
  }


  public GetInstancesByNameResponse expandedDevices(ExpandedDevices expandedDevices) {
    
    this.expandedDevices = expandedDevices;
    return this;
  }

   /**
   * Get expandedDevices
   * @return expandedDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpandedDevices getExpandedDevices() {
    return expandedDevices;
  }


  public void setExpandedDevices(ExpandedDevices expandedDevices) {
    this.expandedDevices = expandedDevices;
  }


  public GetInstancesByNameResponse lastUsedAt(String lastUsedAt) {
    
    this.lastUsedAt = lastUsedAt;
    return this;
  }

   /**
   * Get lastUsedAt
   * @return lastUsedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-02-16T01:05:05Z", value = "")

  public String getLastUsedAt() {
    return lastUsedAt;
  }


  public void setLastUsedAt(String lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }


  public GetInstancesByNameResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-instance", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetInstancesByNameResponse profiles(List<String> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public GetInstancesByNameResponse addProfilesItem(String profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<String>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProfiles() {
    return profiles;
  }


  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }


  public GetInstancesByNameResponse stateful(Boolean stateful) {
    
    this.stateful = stateful;
    return this;
  }

   /**
   * If true, indicates that the instance has some stored state that can be restored on startup
   * @return stateful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If true, indicates that the instance has some stored state that can be restored on startup")

  public Boolean getStateful() {
    return stateful;
  }


  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }


  public GetInstancesByNameResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Running", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetInstancesByNameResponse statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "103", value = "")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstancesByNameResponse getInstancesByNameResponse = (GetInstancesByNameResponse) o;
    return Objects.equals(this.architecture, getInstancesByNameResponse.architecture) &&
        Objects.equals(this.config, getInstancesByNameResponse.config) &&
        Objects.equals(this.createdAt, getInstancesByNameResponse.createdAt) &&
        Objects.equals(this.devices, getInstancesByNameResponse.devices) &&
        Objects.equals(this.ephemeral, getInstancesByNameResponse.ephemeral) &&
        Objects.equals(this.expandedConfig, getInstancesByNameResponse.expandedConfig) &&
        Objects.equals(this.expandedDevices, getInstancesByNameResponse.expandedDevices) &&
        Objects.equals(this.lastUsedAt, getInstancesByNameResponse.lastUsedAt) &&
        Objects.equals(this.name, getInstancesByNameResponse.name) &&
        Objects.equals(this.profiles, getInstancesByNameResponse.profiles) &&
        Objects.equals(this.stateful, getInstancesByNameResponse.stateful) &&
        Objects.equals(this.status, getInstancesByNameResponse.status) &&
        Objects.equals(this.statusCode, getInstancesByNameResponse.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, config, createdAt, devices, ephemeral, expandedConfig, expandedDevices, lastUsedAt, name, profiles, stateful, status, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstancesByNameResponse {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    expandedConfig: ").append(toIndentedString(expandedConfig)).append("\n");
    sb.append("    expandedDevices: ").append(toIndentedString(expandedDevices)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

