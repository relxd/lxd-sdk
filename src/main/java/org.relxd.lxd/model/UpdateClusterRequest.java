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
import org.relxd.lxd.model.MemberConfig2;

/**
 * Input (request to join an existing cluster)
 */
@ApiModel(description = "Input (request to join an existing cluster)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class UpdateClusterRequest {
  public static final String SERIALIZED_NAME_SERVER_NAME = "server_name";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_SERVER_ADDRESS = "server_address";
  @SerializedName(SERIALIZED_NAME_SERVER_ADDRESS)
  private String serverAddress;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_CLUSTER_ADDRESS = "cluster_address";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ADDRESS)
  private String clusterAddress;

  public static final String SERIALIZED_NAME_CLUSTER_CERTIFICATE = "cluster_certificate";
  @SerializedName(SERIALIZED_NAME_CLUSTER_CERTIFICATE)
  private String clusterCertificate;

  public static final String SERIALIZED_NAME_CLUSTER_PASSWORD = "cluster_password";
  @SerializedName(SERIALIZED_NAME_CLUSTER_PASSWORD)
  private String clusterPassword;

  public static final String SERIALIZED_NAME_MEMBER_CONFIG = "member_config";
  @SerializedName(SERIALIZED_NAME_MEMBER_CONFIG)
  private List<MemberConfig2> memberConfig = null;


  public UpdateClusterRequest serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "node2", value = "")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public UpdateClusterRequest serverAddress(String serverAddress) {
    
    this.serverAddress = serverAddress;
    return this;
  }

   /**
   * Get serverAddress
   * @return serverAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.1.1.102:8443", value = "")

  public String getServerAddress() {
    return serverAddress;
  }


  public void setServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
  }


  public UpdateClusterRequest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public UpdateClusterRequest clusterAddress(String clusterAddress) {
    
    this.clusterAddress = clusterAddress;
    return this;
  }

   /**
   * Get clusterAddress
   * @return clusterAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.1.1.101:8443", value = "")

  public String getClusterAddress() {
    return clusterAddress;
  }


  public void setClusterAddress(String clusterAddress) {
    this.clusterAddress = clusterAddress;
  }


  public UpdateClusterRequest clusterCertificate(String clusterCertificate) {
    
    this.clusterCertificate = clusterCertificate;
    return this;
  }

   /**
   * Get clusterCertificate
   * @return clusterCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BEGIN CERTIFICATE-----MIFf-----END CERTIFICATE-----", value = "")

  public String getClusterCertificate() {
    return clusterCertificate;
  }


  public void setClusterCertificate(String clusterCertificate) {
    this.clusterCertificate = clusterCertificate;
  }


  public UpdateClusterRequest clusterPassword(String clusterPassword) {
    
    this.clusterPassword = clusterPassword;
    return this;
  }

   /**
   * Get clusterPassword
   * @return clusterPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sekret", value = "")

  public String getClusterPassword() {
    return clusterPassword;
  }


  public void setClusterPassword(String clusterPassword) {
    this.clusterPassword = clusterPassword;
  }


  public UpdateClusterRequest memberConfig(List<MemberConfig2> memberConfig) {
    
    this.memberConfig = memberConfig;
    return this;
  }

  public UpdateClusterRequest addMemberConfigItem(MemberConfig2 memberConfigItem) {
    if (this.memberConfig == null) {
      this.memberConfig = new ArrayList<MemberConfig2>();
    }
    this.memberConfig.add(memberConfigItem);
    return this;
  }

   /**
   * Get memberConfig
   * @return memberConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MemberConfig2> getMemberConfig() {
    return memberConfig;
  }


  public void setMemberConfig(List<MemberConfig2> memberConfig) {
    this.memberConfig = memberConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClusterRequest updateClusterRequest = (UpdateClusterRequest) o;
    return Objects.equals(this.serverName, updateClusterRequest.serverName) &&
        Objects.equals(this.serverAddress, updateClusterRequest.serverAddress) &&
        Objects.equals(this.enabled, updateClusterRequest.enabled) &&
        Objects.equals(this.clusterAddress, updateClusterRequest.clusterAddress) &&
        Objects.equals(this.clusterCertificate, updateClusterRequest.clusterCertificate) &&
        Objects.equals(this.clusterPassword, updateClusterRequest.clusterPassword) &&
        Objects.equals(this.memberConfig, updateClusterRequest.memberConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, serverAddress, enabled, clusterAddress, clusterCertificate, clusterPassword, memberConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClusterRequest {\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    serverAddress: ").append(toIndentedString(serverAddress)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    clusterAddress: ").append(toIndentedString(clusterAddress)).append("\n");
    sb.append("    clusterCertificate: ").append(toIndentedString(clusterCertificate)).append("\n");
    sb.append("    clusterPassword: ").append(toIndentedString(clusterPassword)).append("\n");
    sb.append("    memberConfig: ").append(toIndentedString(memberConfig)).append("\n");
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

