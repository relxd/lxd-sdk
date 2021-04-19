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
import org.relxd.lxd.model.CreateInstancesByNameRequestOneOf;
import org.relxd.lxd.model.MigrateInstancesByNameRequest;

/**
 * CreateInstancesByNameRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class CreateInstancesByNameRequest {
  public static final String SERIALIZED_NAME_CONTROL = "control";
  @SerializedName(SERIALIZED_NAME_CONTROL)
  private String control;

  public static final String SERIALIZED_NAME_CRIU = "criu";
  @SerializedName(SERIALIZED_NAME_CRIU)
  private String criu;

  public static final String SERIALIZED_NAME_FS = "fs";
  @SerializedName(SERIALIZED_NAME_FS)
  private String fs;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MIGRATION = "migration";
  @SerializedName(SERIALIZED_NAME_MIGRATION)
  private Boolean migration;

  public static final String SERIALIZED_NAME_LIVE = "live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  private String live;


  public CreateInstancesByNameRequest control(String control) {
    
    this.control = control;
    return this;
  }

   /**
   * Get control
   * @return control
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secret1", value = "")

  public String getControl() {
    return control;
  }


  public void setControl(String control) {
    this.control = control;
  }


  public CreateInstancesByNameRequest criu(String criu) {
    
    this.criu = criu;
    return this;
  }

   /**
   * Get criu
   * @return criu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secret2", value = "")

  public String getCriu() {
    return criu;
  }


  public void setCriu(String criu) {
    this.criu = criu;
  }


  public CreateInstancesByNameRequest fs(String fs) {
    
    this.fs = fs;
    return this;
  }

   /**
   * Get fs
   * @return fs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secret3", value = "")

  public String getFs() {
    return fs;
  }


  public void setFs(String fs) {
    this.fs = fs;
  }


  public CreateInstancesByNameRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "new-name", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateInstancesByNameRequest migration(Boolean migration) {
    
    this.migration = migration;
    return this;
  }

   /**
   * Get migration
   * @return migration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getMigration() {
    return migration;
  }


  public void setMigration(Boolean migration) {
    this.migration = migration;
  }


  public CreateInstancesByNameRequest live(String live) {
    
    this.live = live;
    return this;
  }

   /**
   * Get live
   * @return live
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getLive() {
    return live;
  }


  public void setLive(String live) {
    this.live = live;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesByNameRequest createInstancesByNameRequest = (CreateInstancesByNameRequest) o;
    return Objects.equals(this.control, createInstancesByNameRequest.control) &&
        Objects.equals(this.criu, createInstancesByNameRequest.criu) &&
        Objects.equals(this.fs, createInstancesByNameRequest.fs) &&
        Objects.equals(this.name, createInstancesByNameRequest.name) &&
        Objects.equals(this.migration, createInstancesByNameRequest.migration) &&
        Objects.equals(this.live, createInstancesByNameRequest.live);
  }

  @Override
  public int hashCode() {
    return Objects.hash(control, criu, fs, name, migration, live);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameRequest {\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    criu: ").append(toIndentedString(criu)).append("\n");
    sb.append("    fs: ").append(toIndentedString(fs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
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
