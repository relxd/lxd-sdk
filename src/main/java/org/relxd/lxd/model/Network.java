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
import org.relxd.lxd.model.Eth02;

/**
 * Network
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T19:42:20.041212Z[Europe/London]")
public class Network {
  public static final String SERIALIZED_NAME_ETH0 = "eth0";
  @SerializedName(SERIALIZED_NAME_ETH0)
  private Eth02 eth0;

  public static final String SERIALIZED_NAME_LO = "lo";
  @SerializedName(SERIALIZED_NAME_LO)
  private Eth02 lo;

  public static final String SERIALIZED_NAME_LXDBR0 = "lxdbr0";
  @SerializedName(SERIALIZED_NAME_LXDBR0)
  private Eth02 lxdbr0;

  public static final String SERIALIZED_NAME_ZT0 = "zt0";
  @SerializedName(SERIALIZED_NAME_ZT0)
  private Eth02 zt0;


  public Network eth0(Eth02 eth0) {
    
    this.eth0 = eth0;
    return this;
  }

   /**
   * Get eth0
   * @return eth0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Eth02 getEth0() {
    return eth0;
  }


  public void setEth0(Eth02 eth0) {
    this.eth0 = eth0;
  }


  public Network lo(Eth02 lo) {
    
    this.lo = lo;
    return this;
  }

   /**
   * Get lo
   * @return lo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Eth02 getLo() {
    return lo;
  }


  public void setLo(Eth02 lo) {
    this.lo = lo;
  }


  public Network lxdbr0(Eth02 lxdbr0) {
    
    this.lxdbr0 = lxdbr0;
    return this;
  }

   /**
   * Get lxdbr0
   * @return lxdbr0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Eth02 getLxdbr0() {
    return lxdbr0;
  }


  public void setLxdbr0(Eth02 lxdbr0) {
    this.lxdbr0 = lxdbr0;
  }


  public Network zt0(Eth02 zt0) {
    
    this.zt0 = zt0;
    return this;
  }

   /**
   * Get zt0
   * @return zt0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Eth02 getZt0() {
    return zt0;
  }


  public void setZt0(Eth02 zt0) {
    this.zt0 = zt0;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.eth0, network.eth0) &&
        Objects.equals(this.lo, network.lo) &&
        Objects.equals(this.lxdbr0, network.lxdbr0) &&
        Objects.equals(this.zt0, network.zt0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eth0, lo, lxdbr0, zt0);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    sb.append("    eth0: ").append(toIndentedString(eth0)).append("\n");
    sb.append("    lo: ").append(toIndentedString(lo)).append("\n");
    sb.append("    lxdbr0: ").append(toIndentedString(lxdbr0)).append("\n");
    sb.append("    zt0: ").append(toIndentedString(zt0)).append("\n");
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

