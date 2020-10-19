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

/**
 * ServerConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-18T21:27:43.349207+02:00[Africa/Harare]")
public class ServerConfig {
  public static final String SERIALIZED_NAME_CORE_TRUST_PASSWORD = "core.trust_password";
  @SerializedName(SERIALIZED_NAME_CORE_TRUST_PASSWORD)
  private String coreTrustPassword;

  public static final String SERIALIZED_NAME_CORE_HTTPS_ADDRESS = "core.https_address";
  @SerializedName(SERIALIZED_NAME_CORE_HTTPS_ADDRESS)
  private String coreHttpsAddress;


  public ServerConfig coreTrustPassword(String coreTrustPassword) {
    
    this.coreTrustPassword = coreTrustPassword;
    return this;
  }

   /**
   * Get coreTrustPassword
   * @return coreTrustPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-password", value = "")

  public String getCoreTrustPassword() {
    return coreTrustPassword;
  }


  public void setCoreTrustPassword(String coreTrustPassword) {
    this.coreTrustPassword = coreTrustPassword;
  }


  public ServerConfig coreHttpsAddress(String coreHttpsAddress) {
    
    this.coreHttpsAddress = coreHttpsAddress;
    return this;
  }

   /**
   * Get coreHttpsAddress
   * @return coreHttpsAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[::]:8443", value = "")

  public String getCoreHttpsAddress() {
    return coreHttpsAddress;
  }


  public void setCoreHttpsAddress(String coreHttpsAddress) {
    this.coreHttpsAddress = coreHttpsAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConfig serverConfig = (ServerConfig) o;
    return Objects.equals(this.coreTrustPassword, serverConfig.coreTrustPassword) &&
        Objects.equals(this.coreHttpsAddress, serverConfig.coreHttpsAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreTrustPassword, coreHttpsAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConfig {\n");
    sb.append("    coreTrustPassword: ").append(toIndentedString(coreTrustPassword)).append("\n");
    sb.append("    coreHttpsAddress: ").append(toIndentedString(coreHttpsAddress)).append("\n");
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

