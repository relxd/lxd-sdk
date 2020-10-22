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
 * SecurityNestingConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-22T12:08:40.528566+02:00[Africa/Harare]")
public class SecurityNestingConfig {
  public static final String SERIALIZED_NAME_SECURITY_NESTING = "security.nesting";
  @SerializedName(SERIALIZED_NAME_SECURITY_NESTING)
  private String securityNesting;

  public static final String SERIALIZED_NAME_VOLATILE_BASE_IMAGE = "volatile.base_image";
  @SerializedName(SERIALIZED_NAME_VOLATILE_BASE_IMAGE)
  private String volatileBaseImage;

  public static final String SERIALIZED_NAME_VOLATILE_ETH0_HWADDR = "volatile.eth0.hwaddr";
  @SerializedName(SERIALIZED_NAME_VOLATILE_ETH0_HWADDR)
  private String volatileEth0Hwaddr;

  public static final String SERIALIZED_NAME_VOLATILE_LAST_STATE_IDMAP = "volatile.last_state.idmap";
  @SerializedName(SERIALIZED_NAME_VOLATILE_LAST_STATE_IDMAP)
  private String volatileLastStateIdmap;


  public SecurityNestingConfig securityNesting(String securityNesting) {
    
    this.securityNesting = securityNesting;
    return this;
  }

   /**
   * Get securityNesting
   * @return securityNesting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getSecurityNesting() {
    return securityNesting;
  }


  public void setSecurityNesting(String securityNesting) {
    this.securityNesting = securityNesting;
  }


  public SecurityNestingConfig volatileBaseImage(String volatileBaseImage) {
    
    this.volatileBaseImage = volatileBaseImage;
    return this;
  }

   /**
   * Get volatileBaseImage
   * @return volatileBaseImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a49d26ce5808075f5175bf31f5cb90561f5023dcd408da8ac5e834096d46b2d8", value = "")

  public String getVolatileBaseImage() {
    return volatileBaseImage;
  }


  public void setVolatileBaseImage(String volatileBaseImage) {
    this.volatileBaseImage = volatileBaseImage;
  }


  public SecurityNestingConfig volatileEth0Hwaddr(String volatileEth0Hwaddr) {
    
    this.volatileEth0Hwaddr = volatileEth0Hwaddr;
    return this;
  }

   /**
   * Get volatileEth0Hwaddr
   * @return volatileEth0Hwaddr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:16:3e:ec:65:a8", value = "")

  public String getVolatileEth0Hwaddr() {
    return volatileEth0Hwaddr;
  }


  public void setVolatileEth0Hwaddr(String volatileEth0Hwaddr) {
    this.volatileEth0Hwaddr = volatileEth0Hwaddr;
  }


  public SecurityNestingConfig volatileLastStateIdmap(String volatileLastStateIdmap) {
    
    this.volatileLastStateIdmap = volatileLastStateIdmap;
    return this;
  }

   /**
   * Get volatileLastStateIdmap
   * @return volatileLastStateIdmap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"Isuid\":true,\"Isgid\":false,\"Hostid\":100000,\"Nsid\":0,\"Maprange\":65536},{\"Isuid\":false,\"Isgid\":true,\"Hostid\":100000,\"Nsid\":0,\"Maprange\":65536}]", value = "")

  public String getVolatileLastStateIdmap() {
    return volatileLastStateIdmap;
  }


  public void setVolatileLastStateIdmap(String volatileLastStateIdmap) {
    this.volatileLastStateIdmap = volatileLastStateIdmap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityNestingConfig securityNestingConfig = (SecurityNestingConfig) o;
    return Objects.equals(this.securityNesting, securityNestingConfig.securityNesting) &&
        Objects.equals(this.volatileBaseImage, securityNestingConfig.volatileBaseImage) &&
        Objects.equals(this.volatileEth0Hwaddr, securityNestingConfig.volatileEth0Hwaddr) &&
        Objects.equals(this.volatileLastStateIdmap, securityNestingConfig.volatileLastStateIdmap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityNesting, volatileBaseImage, volatileEth0Hwaddr, volatileLastStateIdmap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityNestingConfig {\n");
    sb.append("    securityNesting: ").append(toIndentedString(securityNesting)).append("\n");
    sb.append("    volatileBaseImage: ").append(toIndentedString(volatileBaseImage)).append("\n");
    sb.append("    volatileEth0Hwaddr: ").append(toIndentedString(volatileEth0Hwaddr)).append("\n");
    sb.append("    volatileLastStateIdmap: ").append(toIndentedString(volatileLastStateIdmap)).append("\n");
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

