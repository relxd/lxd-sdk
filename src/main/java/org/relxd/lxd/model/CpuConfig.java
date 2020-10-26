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
 * CpuConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-23T12:53:01.261363+02:00[Africa/Harare]")
public class CpuConfig {
  public static final String SERIALIZED_NAME_LIMITS_CPU = "limits.cpu";
  @SerializedName(SERIALIZED_NAME_LIMITS_CPU)
  private String limitsCpu;


  public CpuConfig limitsCpu(String limitsCpu) {
    
    this.limitsCpu = limitsCpu;
    return this;
  }

   /**
   * Get limitsCpu
   * @return limitsCpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public String getLimitsCpu() {
    return limitsCpu;
  }


  public void setLimitsCpu(String limitsCpu) {
    this.limitsCpu = limitsCpu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpuConfig cpuConfig = (CpuConfig) o;
    return Objects.equals(this.limitsCpu, cpuConfig.limitsCpu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitsCpu);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpuConfig {\n");
    sb.append("    limitsCpu: ").append(toIndentedString(limitsCpu)).append("\n");
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
