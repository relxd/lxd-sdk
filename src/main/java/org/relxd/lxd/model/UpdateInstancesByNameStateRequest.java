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
 * UpdateInstancesByNameStateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-18T21:27:43.349207+02:00[Africa/Harare]")
public class UpdateInstancesByNameStateRequest {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private BigDecimal timeout;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force;

  public static final String SERIALIZED_NAME_STATEFUL = "stateful";
  @SerializedName(SERIALIZED_NAME_STATEFUL)
  private Boolean stateful;


  public UpdateInstancesByNameStateRequest action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * State change action (stop, start, restart, freeze or unfreeze)
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stop", value = "State change action (stop, start, restart, freeze or unfreeze)")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public UpdateInstancesByNameStateRequest timeout(BigDecimal timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * A timeout after which the state change is considered as failed
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "A timeout after which the state change is considered as failed")

  public BigDecimal getTimeout() {
    return timeout;
  }


  public void setTimeout(BigDecimal timeout) {
    this.timeout = timeout;
  }


  public UpdateInstancesByNameStateRequest force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * Force the state change (currently only valid for stop and restart where it means killing the instance)
   * @return force
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Force the state change (currently only valid for stop and restart where it means killing the instance)")

  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  public UpdateInstancesByNameStateRequest stateful(Boolean stateful) {
    
    this.stateful = stateful;
    return this;
  }

   /**
   * Whether to store or restore runtime state before stopping or startiong (only valid for stop and start, defaults to false)
   * @return stateful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to store or restore runtime state before stopping or startiong (only valid for stop and start, defaults to false)")

  public Boolean getStateful() {
    return stateful;
  }


  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInstancesByNameStateRequest updateInstancesByNameStateRequest = (UpdateInstancesByNameStateRequest) o;
    return Objects.equals(this.action, updateInstancesByNameStateRequest.action) &&
        Objects.equals(this.timeout, updateInstancesByNameStateRequest.timeout) &&
        Objects.equals(this.force, updateInstancesByNameStateRequest.force) &&
        Objects.equals(this.stateful, updateInstancesByNameStateRequest.stateful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, timeout, force, stateful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInstancesByNameStateRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
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

