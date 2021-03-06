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
import org.relxd.lxd.model.Args;
import org.relxd.lxd.model.CreateInstancesByNameConsoleRequestOneOf;
import org.relxd.lxd.model.WindowSizeChangeRequest;

/**
 * CreateInstancesByNameConsoleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class CreateInstancesByNameConsoleRequest {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Args args;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public CreateInstancesByNameConsoleRequest command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "window-resize", value = "")

  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }


  public CreateInstancesByNameConsoleRequest args(Args args) {
    
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


  public CreateInstancesByNameConsoleRequest width(Integer width) {
    
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


  public CreateInstancesByNameConsoleRequest height(Integer height) {
    
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


  public CreateInstancesByNameConsoleRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Connection type (\&quot;console\&quot; or \&quot;vga\&quot;).
   * @return type
  **/
  @ApiModelProperty(example = "console", required = true, value = "Connection type (\"console\" or \"vga\").")

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
    CreateInstancesByNameConsoleRequest createInstancesByNameConsoleRequest = (CreateInstancesByNameConsoleRequest) o;
    return Objects.equals(this.command, createInstancesByNameConsoleRequest.command) &&
        Objects.equals(this.args, createInstancesByNameConsoleRequest.args) &&
        Objects.equals(this.width, createInstancesByNameConsoleRequest.width) &&
        Objects.equals(this.height, createInstancesByNameConsoleRequest.height) &&
        Objects.equals(this.type, createInstancesByNameConsoleRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, args, width, height, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameConsoleRequest {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

