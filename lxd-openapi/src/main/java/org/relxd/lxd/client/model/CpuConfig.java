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


package org.relxd.lxd.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CpuConfig
 */
@JsonPropertyOrder({
  CpuConfig.JSON_PROPERTY_LIMITS_CPU
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CpuConfig {
  public static final String JSON_PROPERTY_LIMITS_CPU = "limits.cpu";
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
  @JsonProperty(JSON_PROPERTY_LIMITS_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLimitsCpu() {
    return limitsCpu;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitsCpu(String limitsCpu) {
    this.limitsCpu = limitsCpu;
  }


  /**
   * Return true if this CpuConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
