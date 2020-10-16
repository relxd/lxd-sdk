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
 * Sockets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class Sockets {
  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private BigDecimal cores;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private BigDecimal frequency;

  public static final String SERIALIZED_NAME_FREQUENCY_TURBO = "frequency_turbo";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_TURBO)
  private BigDecimal frequencyTurbo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_THREADS = "threads";
  @SerializedName(SERIALIZED_NAME_THREADS)
  private BigDecimal threads;


  public Sockets cores(BigDecimal cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * Get cores
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public BigDecimal getCores() {
    return cores;
  }


  public void setCores(BigDecimal cores) {
    this.cores = cores;
  }


  public Sockets frequency(BigDecimal frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2691", value = "")

  public BigDecimal getFrequency() {
    return frequency;
  }


  public void setFrequency(BigDecimal frequency) {
    this.frequency = frequency;
  }


  public Sockets frequencyTurbo(BigDecimal frequencyTurbo) {
    
    this.frequencyTurbo = frequencyTurbo;
    return this;
  }

   /**
   * Get frequencyTurbo
   * @return frequencyTurbo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3400", value = "")

  public BigDecimal getFrequencyTurbo() {
    return frequencyTurbo;
  }


  public void setFrequencyTurbo(BigDecimal frequencyTurbo) {
    this.frequencyTurbo = frequencyTurbo;
  }


  public Sockets name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GenuineIntel", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Sockets vendor(String vendor) {
    
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Intel(R) Core(TM) i5-3340M CPU @ 2.70GHz", value = "")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public Sockets threads(BigDecimal threads) {
    
    this.threads = threads;
    return this;
  }

   /**
   * Get threads
   * @return threads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public BigDecimal getThreads() {
    return threads;
  }


  public void setThreads(BigDecimal threads) {
    this.threads = threads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sockets sockets = (Sockets) o;
    return Objects.equals(this.cores, sockets.cores) &&
        Objects.equals(this.frequency, sockets.frequency) &&
        Objects.equals(this.frequencyTurbo, sockets.frequencyTurbo) &&
        Objects.equals(this.name, sockets.name) &&
        Objects.equals(this.vendor, sockets.vendor) &&
        Objects.equals(this.threads, sockets.threads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cores, frequency, frequencyTurbo, name, vendor, threads);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sockets {\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyTurbo: ").append(toIndentedString(frequencyTurbo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    threads: ").append(toIndentedString(threads)).append("\n");
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

