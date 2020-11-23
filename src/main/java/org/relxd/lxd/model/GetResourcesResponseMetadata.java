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
import org.relxd.lxd.model.Cpu2;
import org.relxd.lxd.model.Memory2;

/**
 * GetResourcesResponseMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T19:42:20.041212Z[Europe/London]")
public class GetResourcesResponseMetadata {
  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private Cpu2 cpu;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Memory2 memory;


  public GetResourcesResponseMetadata cpu(Cpu2 cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cpu2 getCpu() {
    return cpu;
  }


  public void setCpu(Cpu2 cpu) {
    this.cpu = cpu;
  }


  public GetResourcesResponseMetadata memory(Memory2 memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Memory2 getMemory() {
    return memory;
  }


  public void setMemory(Memory2 memory) {
    this.memory = memory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetResourcesResponseMetadata getResourcesResponseMetadata = (GetResourcesResponseMetadata) o;
    return Objects.equals(this.cpu, getResourcesResponseMetadata.cpu) &&
        Objects.equals(this.memory, getResourcesResponseMetadata.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetResourcesResponseMetadata {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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

