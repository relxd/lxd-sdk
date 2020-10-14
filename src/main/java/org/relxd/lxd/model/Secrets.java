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
 * Secrets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:02:37.524657+02:00[Africa/Harare]")
public class Secrets {
  public static final String SERIALIZED_NAME_CONTROL = "control";
  @SerializedName(SERIALIZED_NAME_CONTROL)
  private String control;

  public static final String SERIALIZED_NAME_CRIU = "criu";
  @SerializedName(SERIALIZED_NAME_CRIU)
  private String criu;

  public static final String SERIALIZED_NAME_FS = "fs";
  @SerializedName(SERIALIZED_NAME_FS)
  private String fs;


  public Secrets control(String control) {
    
    this.control = control;
    return this;
  }

   /**
   * Get control
   * @return control
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-secret-string", value = "")

  public String getControl() {
    return control;
  }


  public void setControl(String control) {
    this.control = control;
  }


  public Secrets criu(String criu) {
    
    this.criu = criu;
    return this;
  }

   /**
   * Get criu
   * @return criu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-other-secret", value = "")

  public String getCriu() {
    return criu;
  }


  public void setCriu(String criu) {
    this.criu = criu;
  }


  public Secrets fs(String fs) {
    
    this.fs = fs;
    return this;
  }

   /**
   * Get fs
   * @return fs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my third secret", value = "")

  public String getFs() {
    return fs;
  }


  public void setFs(String fs) {
    this.fs = fs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secrets secrets = (Secrets) o;
    return Objects.equals(this.control, secrets.control) &&
        Objects.equals(this.criu, secrets.criu) &&
        Objects.equals(this.fs, secrets.fs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(control, criu, fs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secrets {\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    criu: ").append(toIndentedString(criu)).append("\n");
    sb.append("    fs: ").append(toIndentedString(fs)).append("\n");
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

