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
 * CreateInstancesByNameRequestOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:02:37.524657+02:00[Africa/Harare]")
public class CreateInstancesByNameRequestOneOf {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MIGRATION = "migration";
  @SerializedName(SERIALIZED_NAME_MIGRATION)
  private Boolean migration;

  public static final String SERIALIZED_NAME_LIVE = "live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  private String live;


  public CreateInstancesByNameRequestOneOf name(String name) {
    
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


  public CreateInstancesByNameRequestOneOf migration(Boolean migration) {
    
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


  public CreateInstancesByNameRequestOneOf live(String live) {
    
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
    CreateInstancesByNameRequestOneOf createInstancesByNameRequestOneOf = (CreateInstancesByNameRequestOneOf) o;
    return Objects.equals(this.name, createInstancesByNameRequestOneOf.name) &&
        Objects.equals(this.migration, createInstancesByNameRequestOneOf.migration) &&
        Objects.equals(this.live, createInstancesByNameRequestOneOf.live);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, migration, live);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameRequestOneOf {\n");
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

