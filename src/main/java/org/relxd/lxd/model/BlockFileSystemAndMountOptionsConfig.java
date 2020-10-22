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
 * BlockFileSystemAndMountOptionsConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-22T12:08:40.528566+02:00[Africa/Harare]")
public class BlockFileSystemAndMountOptionsConfig {
  public static final String SERIALIZED_NAME_BLOCK_FILESYSTEM = "block.filesystem";
  @SerializedName(SERIALIZED_NAME_BLOCK_FILESYSTEM)
  private String blockFilesystem;

  public static final String SERIALIZED_NAME_BLOCK_MOUNT_OPTIONS = "block.mount_options";
  @SerializedName(SERIALIZED_NAME_BLOCK_MOUNT_OPTIONS)
  private String blockMountOptions;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;


  public BlockFileSystemAndMountOptionsConfig blockFilesystem(String blockFilesystem) {
    
    this.blockFilesystem = blockFilesystem;
    return this;
  }

   /**
   * Get blockFilesystem
   * @return blockFilesystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ext4", value = "")

  public String getBlockFilesystem() {
    return blockFilesystem;
  }


  public void setBlockFilesystem(String blockFilesystem) {
    this.blockFilesystem = blockFilesystem;
  }


  public BlockFileSystemAndMountOptionsConfig blockMountOptions(String blockMountOptions) {
    
    this.blockMountOptions = blockMountOptions;
    return this;
  }

   /**
   * Get blockMountOptions
   * @return blockMountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "discard", value = "")

  public String getBlockMountOptions() {
    return blockMountOptions;
  }


  public void setBlockMountOptions(String blockMountOptions) {
    this.blockMountOptions = blockMountOptions;
  }


  public BlockFileSystemAndMountOptionsConfig size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10737418240", value = "")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockFileSystemAndMountOptionsConfig blockFileSystemAndMountOptionsConfig = (BlockFileSystemAndMountOptionsConfig) o;
    return Objects.equals(this.blockFilesystem, blockFileSystemAndMountOptionsConfig.blockFilesystem) &&
        Objects.equals(this.blockMountOptions, blockFileSystemAndMountOptionsConfig.blockMountOptions) &&
        Objects.equals(this.size, blockFileSystemAndMountOptionsConfig.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockFilesystem, blockMountOptions, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockFileSystemAndMountOptionsConfig {\n");
    sb.append("    blockFilesystem: ").append(toIndentedString(blockFilesystem)).append("\n");
    sb.append("    blockMountOptions: ").append(toIndentedString(blockMountOptions)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

