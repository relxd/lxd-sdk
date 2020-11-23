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
import org.relxd.lxd.model.MemberConfig;

/**
 * GetClusterResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T19:42:20.041212Z[Europe/London]")
public class GetClusterResponse {
  public static final String SERIALIZED_NAME_SERVER_NAME = "server_name";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_MEMBER_CONFIG = "member_config";
  @SerializedName(SERIALIZED_NAME_MEMBER_CONFIG)
  private List<MemberConfig> memberConfig = null;


  public GetClusterResponse serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "node1", value = "")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public GetClusterResponse enabled(Boolean enabled) {
    
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


  public GetClusterResponse memberConfig(List<MemberConfig> memberConfig) {
    
    this.memberConfig = memberConfig;
    return this;
  }

  public GetClusterResponse addMemberConfigItem(MemberConfig memberConfigItem) {
    if (this.memberConfig == null) {
      this.memberConfig = new ArrayList<MemberConfig>();
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

  public List<MemberConfig> getMemberConfig() {
    return memberConfig;
  }


  public void setMemberConfig(List<MemberConfig> memberConfig) {
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
    GetClusterResponse getClusterResponse = (GetClusterResponse) o;
    return Objects.equals(this.serverName, getClusterResponse.serverName) &&
        Objects.equals(this.enabled, getClusterResponse.enabled) &&
        Objects.equals(this.memberConfig, getClusterResponse.memberConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, enabled, memberConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClusterResponse {\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

