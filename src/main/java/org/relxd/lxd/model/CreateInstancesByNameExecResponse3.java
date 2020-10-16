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
import org.relxd.lxd.model.Output;

/**
 * Return (with interactive&#x3D;false and record-output&#x3D;true)
 */
@ApiModel(description = "Return (with interactive=false and record-output=true)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class CreateInstancesByNameExecResponse3 {
  public static final String SERIALIZED_NAME_FDS = "fds";
  @SerializedName(SERIALIZED_NAME_FDS)
  private Output fds;

  public static final String SERIALIZED_NAME_RETURN = "return";
  @SerializedName(SERIALIZED_NAME_RETURN)
  private Integer _return;


  public CreateInstancesByNameExecResponse3 fds(Output fds) {
    
    this.fds = fds;
    return this;
  }

   /**
   * Get fds
   * @return fds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Output getFds() {
    return fds;
  }


  public void setFds(Output fds) {
    this.fds = fds;
  }


  public CreateInstancesByNameExecResponse3 _return(Integer _return) {
    
    this._return = _return;
    return this;
  }

   /**
   * Get _return
   * @return _return
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getReturn() {
    return _return;
  }


  public void setReturn(Integer _return) {
    this._return = _return;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesByNameExecResponse3 createInstancesByNameExecResponse3 = (CreateInstancesByNameExecResponse3) o;
    return Objects.equals(this.fds, createInstancesByNameExecResponse3.fds) &&
        Objects.equals(this._return, createInstancesByNameExecResponse3._return);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fds, _return);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameExecResponse3 {\n");
    sb.append("    fds: ").append(toIndentedString(fds)).append("\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
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

