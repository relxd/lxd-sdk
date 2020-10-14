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
 * UpdateFingerprintRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:02:37.524657+02:00[Africa/Harare]")
public class UpdateFingerprintRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public UpdateFingerprintRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Certificate type (keyring), currently only client
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "client", value = "Certificate type (keyring), currently only client")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UpdateFingerprintRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * An optional name for the certificate. If nothing is provided, the host in the TLS header for the request is used.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "foo", value = "An optional name for the certificate. If nothing is provided, the host in the TLS header for the request is used.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFingerprintRequest updateFingerprintRequest = (UpdateFingerprintRequest) o;
    return Objects.equals(this.type, updateFingerprintRequest.type) &&
        Objects.equals(this.name, updateFingerprintRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFingerprintRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

