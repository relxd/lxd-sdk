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
 * Sigusr1SignalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class Sigusr1SignalRequest {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_SIGNAL = "signal";
  @SerializedName(SERIALIZED_NAME_SIGNAL)
  private Integer signal;


  public Sigusr1SignalRequest command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "signal", value = "")

  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }


  public Sigusr1SignalRequest signal(Integer signal) {
    
    this.signal = signal;
    return this;
  }

   /**
   * Get signal
   * @return signal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getSignal() {
    return signal;
  }


  public void setSignal(Integer signal) {
    this.signal = signal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sigusr1SignalRequest sigusr1SignalRequest = (Sigusr1SignalRequest) o;
    return Objects.equals(this.command, sigusr1SignalRequest.command) &&
        Objects.equals(this.signal, sigusr1SignalRequest.signal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, signal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sigusr1SignalRequest {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
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
