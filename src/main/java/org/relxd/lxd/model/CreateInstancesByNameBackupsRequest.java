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
 * CreateInstancesByNameBackupsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T19:42:20.041212Z[Europe/London]")
public class CreateInstancesByNameBackupsRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private BigDecimal expiry;

  public static final String SERIALIZED_NAME_INSTANCE_ONLY = "instance_only";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ONLY)
  private Boolean instanceOnly;

  public static final String SERIALIZED_NAME_OPTIMIZED_STORAGE = "optimized_storage";
  @SerializedName(SERIALIZED_NAME_OPTIMIZED_STORAGE)
  private Boolean optimizedStorage;


  public CreateInstancesByNameBackupsRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Unique identifier for the backup
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "backupName", value = "Unique identifier for the backup")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateInstancesByNameBackupsRequest expiry(BigDecimal expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * When to delete the backup automatically
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "When to delete the backup automatically")

  public BigDecimal getExpiry() {
    return expiry;
  }


  public void setExpiry(BigDecimal expiry) {
    this.expiry = expiry;
  }


  public CreateInstancesByNameBackupsRequest instanceOnly(Boolean instanceOnly) {
    
    this.instanceOnly = instanceOnly;
    return this;
  }

   /**
   * If True, snapshots aren&#39;t included
   * @return instanceOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If True, snapshots aren't included")

  public Boolean getInstanceOnly() {
    return instanceOnly;
  }


  public void setInstanceOnly(Boolean instanceOnly) {
    this.instanceOnly = instanceOnly;
  }


  public CreateInstancesByNameBackupsRequest optimizedStorage(Boolean optimizedStorage) {
    
    this.optimizedStorage = optimizedStorage;
    return this;
  }

   /**
   * If True, btrfs send or zfs send is used for instance and snapshots
   * @return optimizedStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If True, btrfs send or zfs send is used for instance and snapshots")

  public Boolean getOptimizedStorage() {
    return optimizedStorage;
  }


  public void setOptimizedStorage(Boolean optimizedStorage) {
    this.optimizedStorage = optimizedStorage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesByNameBackupsRequest createInstancesByNameBackupsRequest = (CreateInstancesByNameBackupsRequest) o;
    return Objects.equals(this.name, createInstancesByNameBackupsRequest.name) &&
        Objects.equals(this.expiry, createInstancesByNameBackupsRequest.expiry) &&
        Objects.equals(this.instanceOnly, createInstancesByNameBackupsRequest.instanceOnly) &&
        Objects.equals(this.optimizedStorage, createInstancesByNameBackupsRequest.optimizedStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expiry, instanceOnly, optimizedStorage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameBackupsRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    instanceOnly: ").append(toIndentedString(instanceOnly)).append("\n");
    sb.append("    optimizedStorage: ").append(toIndentedString(optimizedStorage)).append("\n");
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

