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
 * DNSModeConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class DNSModeConfig {
  public static final String SERIALIZED_NAME_DNS_MODE = "dns.mode";
  @SerializedName(SERIALIZED_NAME_DNS_MODE)
  private String dnsMode;


  public DNSModeConfig dnsMode(String dnsMode) {
    
    this.dnsMode = dnsMode;
    return this;
  }

   /**
   * Get dnsMode
   * @return dnsMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dynamic", value = "")

  public String getDnsMode() {
    return dnsMode;
  }


  public void setDnsMode(String dnsMode) {
    this.dnsMode = dnsMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSModeConfig dnSModeConfig = (DNSModeConfig) o;
    return Objects.equals(this.dnsMode, dnSModeConfig.dnsMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSModeConfig {\n");
    sb.append("    dnsMode: ").append(toIndentedString(dnsMode)).append("\n");
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

