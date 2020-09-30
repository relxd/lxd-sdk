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
 * Eth0
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-30T13:16:18.308214+01:00[Europe/London]")
public class Eth0 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NICTYPE = "nictype";
  @SerializedName(SERIALIZED_NAME_NICTYPE)
  private String nictype;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public Eth0 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eth0", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Eth0 nictype(String nictype) {
    
    this.nictype = nictype;
    return this;
  }

   /**
   * Get nictype
   * @return nictype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bridged", value = "")

  public String getNictype() {
    return nictype;
  }


  public void setNictype(String nictype) {
    this.nictype = nictype;
  }


  public Eth0 parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lxdbr0", value = "")

  public String getParent() {
    return parent;
  }


  public void setParent(String parent) {
    this.parent = parent;
  }


  public Eth0 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "nic", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eth0 eth0 = (Eth0) o;
    return Objects.equals(this.name, eth0.name) &&
        Objects.equals(this.nictype, eth0.nictype) &&
        Objects.equals(this.parent, eth0.parent) &&
        Objects.equals(this.type, eth0.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nictype, parent, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eth0 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nictype: ").append(toIndentedString(nictype)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

