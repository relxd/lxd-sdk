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
 * DiskAndLvmConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class DiskAndLvmConfig {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_VOLUME_BLOCK_FILESYSTEM = "volume.block.filesystem";
  @SerializedName(SERIALIZED_NAME_VOLUME_BLOCK_FILESYSTEM)
  private String volumeBlockFilesystem;

  public static final String SERIALIZED_NAME_VOLUME_BLOCK_MOUNT_OPTIONS = "volume.block.mount_options";
  @SerializedName(SERIALIZED_NAME_VOLUME_BLOCK_MOUNT_OPTIONS)
  private String volumeBlockMountOptions;

  public static final String SERIALIZED_NAME_LVM_THINPOOL_NAME = "lvm.thinpool_name";
  @SerializedName(SERIALIZED_NAME_LVM_THINPOOL_NAME)
  private String lvmThinpoolName;

  public static final String SERIALIZED_NAME_LVM_VG_NAME = "lvm.vg_name";
  @SerializedName(SERIALIZED_NAME_LVM_VG_NAME)
  private String lvmVgName;

  public static final String SERIALIZED_NAME_VOLUME_SIZE = "volume.size";
  @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
  private String volumeSize;


  public DiskAndLvmConfig size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15032385536", value = "")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public DiskAndLvmConfig source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pool1", value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public DiskAndLvmConfig volumeBlockFilesystem(String volumeBlockFilesystem) {
    
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


  public DiskAndLvmConfig volumeBlockMountOptions(String volumeBlockMountOptions) {
    
    this.volumeBlockMountOptions = volumeBlockMountOptions;
    return this;
  }

   /**
   * Get volumeBlockMountOptions
   * @return volumeBlockMountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "discard", value = "")

  public String getVolumeBlockMountOptions() {
    return volumeBlockMountOptions;
  }


  public void setVolumeBlockMountOptions(String volumeBlockMountOptions) {
    this.volumeBlockMountOptions = volumeBlockMountOptions;
  }


  public DiskAndLvmConfig lvmThinpoolName(String lvmThinpoolName) {
    
    this.lvmThinpoolName = lvmThinpoolName;
    return this;
  }

   /**
   * Get lvmThinpoolName
   * @return lvmThinpoolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LXDThinPool", value = "")

  public String getLvmThinpoolName() {
    return lvmThinpoolName;
  }


  public void setLvmThinpoolName(String lvmThinpoolName) {
    this.lvmThinpoolName = lvmThinpoolName;
  }


  public DiskAndLvmConfig lvmVgName(String lvmVgName) {
    
    this.lvmVgName = lvmVgName;
    return this;
  }

   /**
   * Get lvmVgName
   * @return lvmVgName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pool1", value = "")

  public String getLvmVgName() {
    return lvmVgName;
  }


  public void setLvmVgName(String lvmVgName) {
    this.lvmVgName = lvmVgName;
  }


  public DiskAndLvmConfig volumeSize(String volumeSize) {
    
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10737418240", value = "")

  public String getVolumeSize() {
    return volumeSize;
  }


  public void setVolumeSize(String volumeSize) {
    this.volumeSize = volumeSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskAndLvmConfig diskAndLvmConfig = (DiskAndLvmConfig) o;
    return Objects.equals(this.size, diskAndLvmConfig.size) &&
        Objects.equals(this.source, diskAndLvmConfig.source) &&
        Objects.equals(this.volumeBlockFilesystem, diskAndLvmConfig.volumeBlockFilesystem) &&
        Objects.equals(this.volumeBlockMountOptions, diskAndLvmConfig.volumeBlockMountOptions) &&
        Objects.equals(this.lvmThinpoolName, diskAndLvmConfig.lvmThinpoolName) &&
        Objects.equals(this.lvmVgName, diskAndLvmConfig.lvmVgName) &&
        Objects.equals(this.volumeSize, diskAndLvmConfig.volumeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, source, volumeBlockFilesystem, volumeBlockMountOptions, lvmThinpoolName, lvmVgName, volumeSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskAndLvmConfig {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    volumeBlockFilesystem: ").append(toIndentedString(volumeBlockFilesystem)).append("\n");
    sb.append("    volumeBlockMountOptions: ").append(toIndentedString(volumeBlockMountOptions)).append("\n");
    sb.append("    lvmThinpoolName: ").append(toIndentedString(lvmThinpoolName)).append("\n");
    sb.append("    lvmVgName: ").append(toIndentedString(lvmVgName)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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

