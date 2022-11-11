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
 * CreateInstancesByNameSnapshotRequest
 */
@JsonPropertyOrder({
  CreateInstancesByNameSnapshotRequest.JSON_PROPERTY_NAME,
  CreateInstancesByNameSnapshotRequest.JSON_PROPERTY_STATEFUL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateInstancesByNameSnapshotRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATEFUL = "stateful";
  private Boolean stateful;


  public CreateInstancesByNameSnapshotRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the snapshot
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-snapshot", value = "Name of the snapshot")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateInstancesByNameSnapshotRequest stateful(Boolean stateful) {
    this.stateful = stateful;
    return this;
  }

   /**
   * Whether to include state too
   * @return stateful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to include state too")
  @JsonProperty(JSON_PROPERTY_STATEFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStateful() {
    return stateful;
  }


  @JsonProperty(JSON_PROPERTY_STATEFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }


  /**
   * Return true if this CreateInstancesByNameSnapshotRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesByNameSnapshotRequest createInstancesByNameSnapshotRequest = (CreateInstancesByNameSnapshotRequest) o;
    return Objects.equals(this.name, createInstancesByNameSnapshotRequest.name) &&
        Objects.equals(this.stateful, createInstancesByNameSnapshotRequest.stateful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stateful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameSnapshotRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
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
