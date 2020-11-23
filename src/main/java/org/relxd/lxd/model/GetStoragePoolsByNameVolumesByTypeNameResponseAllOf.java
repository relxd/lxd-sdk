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
import org.relxd.lxd.model.GetStoragePoolsByNameVolumesByTypeNameResponseMetadata;

/**
 * GetStoragePoolsByNameVolumesByTypeNameResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T19:42:20.041212Z[Europe/London]")
public class GetStoragePoolsByNameVolumesByTypeNameResponseAllOf {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private GetStoragePoolsByNameVolumesByTypeNameResponseMetadata metadata;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;


  public GetStoragePoolsByNameVolumesByTypeNameResponseAllOf metadata(GetStoragePoolsByNameVolumesByTypeNameResponseMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStoragePoolsByNameVolumesByTypeNameResponseMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(GetStoragePoolsByNameVolumesByTypeNameResponseMetadata metadata) {
    this.metadata = metadata;
  }


  public GetStoragePoolsByNameVolumesByTypeNameResponseAllOf errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public GetStoragePoolsByNameVolumesByTypeNameResponseAllOf error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStoragePoolsByNameVolumesByTypeNameResponseAllOf getStoragePoolsByNameVolumesByTypeNameResponseAllOf = (GetStoragePoolsByNameVolumesByTypeNameResponseAllOf) o;
    return Objects.equals(this.metadata, getStoragePoolsByNameVolumesByTypeNameResponseAllOf.metadata) &&
        Objects.equals(this.errorCode, getStoragePoolsByNameVolumesByTypeNameResponseAllOf.errorCode) &&
        Objects.equals(this.error, getStoragePoolsByNameVolumesByTypeNameResponseAllOf.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, errorCode, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStoragePoolsByNameVolumesByTypeNameResponseAllOf {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

