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
 * Memory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class Memory {
  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private BigDecimal usage;

  public static final String SERIALIZED_NAME_USAGE_PEAK = "usage_peak";
  @SerializedName(SERIALIZED_NAME_USAGE_PEAK)
  private BigDecimal usagePeak;

  public static final String SERIALIZED_NAME_SWAP_USAGE = "swap_usage";
  @SerializedName(SERIALIZED_NAME_SWAP_USAGE)
  private BigDecimal swapUsage;

  public static final String SERIALIZED_NAME_SWAP_USAGE_PEAK = "swap_usage_peak";
  @SerializedName(SERIALIZED_NAME_SWAP_USAGE_PEAK)
  private BigDecimal swapUsagePeak;


  public Memory usage(BigDecimal usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "51126272", value = "")

  public BigDecimal getUsage() {
    return usage;
  }


  public void setUsage(BigDecimal usage) {
    this.usage = usage;
  }


  public Memory usagePeak(BigDecimal usagePeak) {
    
    this.usagePeak = usagePeak;
    return this;
  }

   /**
   * Get usagePeak
   * @return usagePeak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "70246400", value = "")

  public BigDecimal getUsagePeak() {
    return usagePeak;
  }


  public void setUsagePeak(BigDecimal usagePeak) {
    this.usagePeak = usagePeak;
  }


  public Memory swapUsage(BigDecimal swapUsage) {
    
    this.swapUsage = swapUsage;
    return this;
  }

   /**
   * Get swapUsage
   * @return swapUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getSwapUsage() {
    return swapUsage;
  }


  public void setSwapUsage(BigDecimal swapUsage) {
    this.swapUsage = swapUsage;
  }


  public Memory swapUsagePeak(BigDecimal swapUsagePeak) {
    
    this.swapUsagePeak = swapUsagePeak;
    return this;
  }

   /**
   * Get swapUsagePeak
   * @return swapUsagePeak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getSwapUsagePeak() {
    return swapUsagePeak;
  }


  public void setSwapUsagePeak(BigDecimal swapUsagePeak) {
    this.swapUsagePeak = swapUsagePeak;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Memory memory = (Memory) o;
    return Objects.equals(this.usage, memory.usage) &&
        Objects.equals(this.usagePeak, memory.usagePeak) &&
        Objects.equals(this.swapUsage, memory.swapUsage) &&
        Objects.equals(this.swapUsagePeak, memory.swapUsagePeak);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage, usagePeak, swapUsage, swapUsagePeak);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memory {\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    usagePeak: ").append(toIndentedString(usagePeak)).append("\n");
    sb.append("    swapUsage: ").append(toIndentedString(swapUsage)).append("\n");
    sb.append("    swapUsagePeak: ").append(toIndentedString(swapUsagePeak)).append("\n");
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

