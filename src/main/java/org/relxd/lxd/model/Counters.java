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
import java.math.BigDecimal;

/**
 * Counters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class Counters {
  public static final String SERIALIZED_NAME_BYTES_RECEIVED = "bytes_received";
  @SerializedName(SERIALIZED_NAME_BYTES_RECEIVED)
  private BigDecimal bytesReceived;

  public static final String SERIALIZED_NAME_BYTES_SENT = "bytes_sent";
  @SerializedName(SERIALIZED_NAME_BYTES_SENT)
  private BigDecimal bytesSent;

  public static final String SERIALIZED_NAME_PACKETS_RECEIVED = "packets_received";
  @SerializedName(SERIALIZED_NAME_PACKETS_RECEIVED)
  private BigDecimal packetsReceived;

  public static final String SERIALIZED_NAME_PACKETS_SENT = "packets_sent";
  @SerializedName(SERIALIZED_NAME_PACKETS_SENT)
  private BigDecimal packetsSent;


  public Counters bytesReceived(BigDecimal bytesReceived) {
    
    this.bytesReceived = bytesReceived;
    return this;
  }

   /**
   * Get bytesReceived
   * @return bytesReceived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "33942", value = "")

  public BigDecimal getBytesReceived() {
    return bytesReceived;
  }


  public void setBytesReceived(BigDecimal bytesReceived) {
    this.bytesReceived = bytesReceived;
  }


  public Counters bytesSent(BigDecimal bytesSent) {
    
    this.bytesSent = bytesSent;
    return this;
  }

   /**
   * Get bytesSent
   * @return bytesSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30810", value = "")

  public BigDecimal getBytesSent() {
    return bytesSent;
  }


  public void setBytesSent(BigDecimal bytesSent) {
    this.bytesSent = bytesSent;
  }


  public Counters packetsReceived(BigDecimal packetsReceived) {
    
    this.packetsReceived = packetsReceived;
    return this;
  }

   /**
   * Get packetsReceived
   * @return packetsReceived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "402", value = "")

  public BigDecimal getPacketsReceived() {
    return packetsReceived;
  }


  public void setPacketsReceived(BigDecimal packetsReceived) {
    this.packetsReceived = packetsReceived;
  }


  public Counters packetsSent(BigDecimal packetsSent) {
    
    this.packetsSent = packetsSent;
    return this;
  }

   /**
   * Get packetsSent
   * @return packetsSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "178", value = "")

  public BigDecimal getPacketsSent() {
    return packetsSent;
  }


  public void setPacketsSent(BigDecimal packetsSent) {
    this.packetsSent = packetsSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Counters counters = (Counters) o;
    return Objects.equals(this.bytesReceived, counters.bytesReceived) &&
        Objects.equals(this.bytesSent, counters.bytesSent) &&
        Objects.equals(this.packetsReceived, counters.packetsReceived) &&
        Objects.equals(this.packetsSent, counters.packetsSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesReceived, bytesSent, packetsReceived, packetsSent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Counters {\n");
    sb.append("    bytesReceived: ").append(toIndentedString(bytesReceived)).append("\n");
    sb.append("    bytesSent: ").append(toIndentedString(bytesSent)).append("\n");
    sb.append("    packetsReceived: ").append(toIndentedString(packetsReceived)).append("\n");
    sb.append("    packetsSent: ").append(toIndentedString(packetsSent)).append("\n");
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

