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
 * UpdateNetworksByNameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class UpdateNetworksByNameRequest {
  public static final String SERIALIZED_NAME_BRIDGE_DRIVER = "bridge.driver";
  @SerializedName(SERIALIZED_NAME_BRIDGE_DRIVER)
  private String bridgeDriver;

  public static final String SERIALIZED_NAME_IPV4_ADDRESS = "ipv4.address";
  @SerializedName(SERIALIZED_NAME_IPV4_ADDRESS)
  private String ipv4Address;

  public static final String SERIALIZED_NAME_IPV6_ADDRESS = "ipv6.address";
  @SerializedName(SERIALIZED_NAME_IPV6_ADDRESS)
  private String ipv6Address;


  public UpdateNetworksByNameRequest bridgeDriver(String bridgeDriver) {
    
    this.bridgeDriver = bridgeDriver;
    return this;
  }

   /**
   * Get bridgeDriver
   * @return bridgeDriver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "openvswitch", value = "")

  public String getBridgeDriver() {
    return bridgeDriver;
  }


  public void setBridgeDriver(String bridgeDriver) {
    this.bridgeDriver = bridgeDriver;
  }


  public UpdateNetworksByNameRequest ipv4Address(String ipv4Address) {
    
    this.ipv4Address = ipv4Address;
    return this;
  }

   /**
   * Get ipv4Address
   * @return ipv4Address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0.3.1/24", value = "")

  public String getIpv4Address() {
    return ipv4Address;
  }


  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }


  public UpdateNetworksByNameRequest ipv6Address(String ipv6Address) {
    
    this.ipv6Address = ipv6Address;
    return this;
  }

   /**
   * Get ipv6Address
   * @return ipv6Address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fd1:6997:4939:495d::1/64", value = "")

  public String getIpv6Address() {
    return ipv6Address;
  }


  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNetworksByNameRequest updateNetworksByNameRequest = (UpdateNetworksByNameRequest) o;
    return Objects.equals(this.bridgeDriver, updateNetworksByNameRequest.bridgeDriver) &&
        Objects.equals(this.ipv4Address, updateNetworksByNameRequest.ipv4Address) &&
        Objects.equals(this.ipv6Address, updateNetworksByNameRequest.ipv6Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridgeDriver, ipv4Address, ipv6Address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNetworksByNameRequest {\n");
    sb.append("    bridgeDriver: ").append(toIndentedString(bridgeDriver)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
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

