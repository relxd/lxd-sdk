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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Containers
 */
@JsonPropertyOrder({
  Containers.JSON_PROPERTY_CONTAINERS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Containers {
  public static final String JSON_PROPERTY_CONTAINERS = "containers";
  private List<String> containers = null;


  public Containers containers(List<String> containers) {
    this.containers = containers;
    return this;
  }

  public Containers addContainersItem(String containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"/1.0/instances/test\"]", value = "")
  @JsonProperty(JSON_PROPERTY_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContainers() {
    return containers;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainers(List<String> containers) {
    this.containers = containers;
  }


  /**
   * Return true if this Containers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Containers containers = (Containers) o;
    return Objects.equals(this.containers, containers.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Containers {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
