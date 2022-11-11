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
import org.relxd.lxd.client.model.DevicesKvm;
import org.relxd.lxd.client.model.MemoryLimitsConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetProfilesByNameResponse
 */
@JsonPropertyOrder({
  GetProfilesByNameResponse.JSON_PROPERTY_NAME,
  GetProfilesByNameResponse.JSON_PROPERTY_DESCRIPTION,
  GetProfilesByNameResponse.JSON_PROPERTY_CONFIG,
  GetProfilesByNameResponse.JSON_PROPERTY_DEVICES,
  GetProfilesByNameResponse.JSON_PROPERTY_USED_BY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetProfilesByNameResponse {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private MemoryLimitsConfig config;

  public static final String JSON_PROPERTY_DEVICES = "devices";
  private DevicesKvm devices;

  public static final String JSON_PROPERTY_USED_BY = "used_by";
  private List<String> usedBy = null;


  public GetProfilesByNameResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "")
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


  public GetProfilesByNameResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some description string", value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GetProfilesByNameResponse config(MemoryLimitsConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MemoryLimitsConfig getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(MemoryLimitsConfig config) {
    this.config = config;
  }


  public GetProfilesByNameResponse devices(DevicesKvm devices) {
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DevicesKvm getDevices() {
    return devices;
  }


  @JsonProperty(JSON_PROPERTY_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevices(DevicesKvm devices) {
    this.devices = devices;
  }


  public GetProfilesByNameResponse usedBy(List<String> usedBy) {
    this.usedBy = usedBy;
    return this;
  }

  public GetProfilesByNameResponse addUsedByItem(String usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

   /**
   * Get usedBy
   * @return usedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"/1.0/instances/blah\"]", value = "")
  @JsonProperty(JSON_PROPERTY_USED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUsedBy() {
    return usedBy;
  }


  @JsonProperty(JSON_PROPERTY_USED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedBy(List<String> usedBy) {
    this.usedBy = usedBy;
  }


  /**
   * Return true if this GetProfilesByNameResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfilesByNameResponse getProfilesByNameResponse = (GetProfilesByNameResponse) o;
    return Objects.equals(this.name, getProfilesByNameResponse.name) &&
        Objects.equals(this.description, getProfilesByNameResponse.description) &&
        Objects.equals(this.config, getProfilesByNameResponse.config) &&
        Objects.equals(this.devices, getProfilesByNameResponse.devices) &&
        Objects.equals(this.usedBy, getProfilesByNameResponse.usedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, config, devices, usedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfilesByNameResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
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
