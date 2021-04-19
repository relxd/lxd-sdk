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
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.model.Args;
import org.relxd.lxd.model.CreateInstancesByNameExecRequestOneOf;
import org.relxd.lxd.model.Sigusr1SignalRequest;
import org.relxd.lxd.model.WindowSizeChangeRequest;

/**
 * CreateInstancesByNameExecRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class CreateInstancesByNameExecRequest {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SIGNAL = "signal";
  @SerializedName(SERIALIZED_NAME_SIGNAL)
  private Integer signal;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Args args;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private Object environment;

  public static final String SERIALIZED_NAME_WAIT_FOR_WEBSOCKET = "wait-for-websocket";
  @SerializedName(SERIALIZED_NAME_WAIT_FOR_WEBSOCKET)
  private Boolean waitForWebsocket;

  public static final String SERIALIZED_NAME_RECORD_OUTPUT = "record-output";
  @SerializedName(SERIALIZED_NAME_RECORD_OUTPUT)
  private Boolean recordOutput;

  public static final String SERIALIZED_NAME_INTERACTIVE = "interactive";
  @SerializedName(SERIALIZED_NAME_INTERACTIVE)
  private Boolean interactive;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Integer user;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private Integer group;

  public static final String SERIALIZED_NAME_CWD = "cwd";
  @SerializedName(SERIALIZED_NAME_CWD)
  private String cwd;


  public CreateInstancesByNameExecRequest command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public CreateInstancesByNameExecRequest addCommandItem(String commandItem) {
    this.command.add(commandItem);
    return this;
  }

   /**
   * Command and arguments
   * @return command
  **/
  @ApiModelProperty(example = "[\"/bin/bash\"]", required = true, value = "Command and arguments")

  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }


  public CreateInstancesByNameExecRequest signal(Integer signal) {
    
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


  public CreateInstancesByNameExecRequest args(Args args) {
    
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Args getArgs() {
    return args;
  }


  public void setArgs(Args args) {
    this.args = args;
  }


  public CreateInstancesByNameExecRequest environment(Object environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Optional extra environment variables to set
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional extra environment variables to set")

  public Object getEnvironment() {
    return environment;
  }


  public void setEnvironment(Object environment) {
    this.environment = environment;
  }


  public CreateInstancesByNameExecRequest waitForWebsocket(Boolean waitForWebsocket) {
    
    this.waitForWebsocket = waitForWebsocket;
    return this;
  }

   /**
   * Whether to wait for a connection before starting the process
   * @return waitForWebsocket
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether to wait for a connection before starting the process")

  public Boolean getWaitForWebsocket() {
    return waitForWebsocket;
  }


  public void setWaitForWebsocket(Boolean waitForWebsocket) {
    this.waitForWebsocket = waitForWebsocket;
  }


  public CreateInstancesByNameExecRequest recordOutput(Boolean recordOutput) {
    
    this.recordOutput = recordOutput;
    return this;
  }

   /**
   * Whether to store stdout and stderr (only valid with wait-for-websocket&#x3D;false) (requires API extension container_exec_recording)
   * @return recordOutput
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether to store stdout and stderr (only valid with wait-for-websocket=false) (requires API extension container_exec_recording)")

  public Boolean getRecordOutput() {
    return recordOutput;
  }


  public void setRecordOutput(Boolean recordOutput) {
    this.recordOutput = recordOutput;
  }


  public CreateInstancesByNameExecRequest interactive(Boolean interactive) {
    
    this.interactive = interactive;
    return this;
  }

   /**
   * Whether to allocate a pty device instead of PIPEs
   * @return interactive
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether to allocate a pty device instead of PIPEs")

  public Boolean getInteractive() {
    return interactive;
  }


  public void setInteractive(Boolean interactive) {
    this.interactive = interactive;
  }


  public CreateInstancesByNameExecRequest width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Initial width of the terminal (optional)
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80", value = "Initial width of the terminal (optional)")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public CreateInstancesByNameExecRequest height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Initial height of the terminal (optional)
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Initial height of the terminal (optional)")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public CreateInstancesByNameExecRequest user(Integer user) {
    
    this.user = user;
    return this;
  }

   /**
   * User to run the command as (optional)
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "User to run the command as (optional)")

  public Integer getUser() {
    return user;
  }


  public void setUser(Integer user) {
    this.user = user;
  }


  public CreateInstancesByNameExecRequest group(Integer group) {
    
    this.group = group;
    return this;
  }

   /**
   * Group to run the command as (optional)
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Group to run the command as (optional)")

  public Integer getGroup() {
    return group;
  }


  public void setGroup(Integer group) {
    this.group = group;
  }


  public CreateInstancesByNameExecRequest cwd(String cwd) {
    
    this.cwd = cwd;
    return this;
  }

   /**
   * Current working directory (optional)
   * @return cwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/tmp", value = "Current working directory (optional)")

  public String getCwd() {
    return cwd;
  }


  public void setCwd(String cwd) {
    this.cwd = cwd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesByNameExecRequest createInstancesByNameExecRequest = (CreateInstancesByNameExecRequest) o;
    return Objects.equals(this.command, createInstancesByNameExecRequest.command) &&
        Objects.equals(this.signal, createInstancesByNameExecRequest.signal) &&
        Objects.equals(this.args, createInstancesByNameExecRequest.args) &&
        Objects.equals(this.environment, createInstancesByNameExecRequest.environment) &&
        Objects.equals(this.waitForWebsocket, createInstancesByNameExecRequest.waitForWebsocket) &&
        Objects.equals(this.recordOutput, createInstancesByNameExecRequest.recordOutput) &&
        Objects.equals(this.interactive, createInstancesByNameExecRequest.interactive) &&
        Objects.equals(this.width, createInstancesByNameExecRequest.width) &&
        Objects.equals(this.height, createInstancesByNameExecRequest.height) &&
        Objects.equals(this.user, createInstancesByNameExecRequest.user) &&
        Objects.equals(this.group, createInstancesByNameExecRequest.group) &&
        Objects.equals(this.cwd, createInstancesByNameExecRequest.cwd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, signal, args, environment, waitForWebsocket, recordOutput, interactive, width, height, user, group, cwd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameExecRequest {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    waitForWebsocket: ").append(toIndentedString(waitForWebsocket)).append("\n");
    sb.append("    recordOutput: ").append(toIndentedString(recordOutput)).append("\n");
    sb.append("    interactive: ").append(toIndentedString(interactive)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    cwd: ").append(toIndentedString(cwd)).append("\n");
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
