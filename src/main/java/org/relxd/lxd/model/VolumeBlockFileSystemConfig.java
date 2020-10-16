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
 * VolumeBlockFileSystemConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class VolumeBlockFileSystemConfig {
  public static final String SERIALIZED_NAME_VOLUME_BLOCK_FILESYSTEM = "volume.block.filesystem";
  @SerializedName(SERIALIZED_NAME_VOLUME_BLOCK_FILESYSTEM)
  private String volumeBlockFilesystem;


  public VolumeBlockFileSystemConfig volumeBlockFilesystem(String volumeBlockFilesystem) {
    
    this.volumeBlockFilesystem = volumeBlockFilesystem;
    return this;
  }

   /**
   * Get volumeBlockFilesystem
   * @return volumeBlockFilesystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xfs", value = "")

  public String getVolumeBlockFilesystem() {
    return volumeBlockFilesystem;
  }


  public void setVolumeBlockFilesystem(String volumeBlockFilesystem) {
    this.volumeBlockFilesystem = volumeBlockFilesystem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeBlockFileSystemConfig volumeBlockFileSystemConfig = (VolumeBlockFileSystemConfig) o;
    return Objects.equals(this.volumeBlockFilesystem, volumeBlockFileSystemConfig.volumeBlockFilesystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeBlockFilesystem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeBlockFileSystemConfig {\n");
    sb.append("    volumeBlockFilesystem: ").append(toIndentedString(volumeBlockFilesystem)).append("\n");
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

