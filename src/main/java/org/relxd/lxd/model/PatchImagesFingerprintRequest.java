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
import org.relxd.lxd.model.Properties5;

/**
 * PatchImagesFingerprintRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class PatchImagesFingerprintRequest {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Properties5 properties;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;


  public PatchImagesFingerprintRequest properties(Properties5 properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Properties5 getProperties() {
    return properties;
  }


  public void setProperties(Properties5 properties) {
    this.properties = properties;
  }


  public PatchImagesFingerprintRequest _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchImagesFingerprintRequest patchImagesFingerprintRequest = (PatchImagesFingerprintRequest) o;
    return Objects.equals(this.properties, patchImagesFingerprintRequest.properties) &&
        Objects.equals(this._public, patchImagesFingerprintRequest._public);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, _public);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchImagesFingerprintRequest {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

