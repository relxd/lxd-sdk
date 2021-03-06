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
 * FeaturesConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class FeaturesConfig {
  public static final String SERIALIZED_NAME_FEATURES_IMAGES = "features.images";
  @SerializedName(SERIALIZED_NAME_FEATURES_IMAGES)
  private String featuresImages;

  public static final String SERIALIZED_NAME_FEATURES_PROFILES = "features.profiles";
  @SerializedName(SERIALIZED_NAME_FEATURES_PROFILES)
  private String featuresProfiles;


  public FeaturesConfig featuresImages(String featuresImages) {
    
    this.featuresImages = featuresImages;
    return this;
  }

   /**
   * Get featuresImages
   * @return featuresImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getFeaturesImages() {
    return featuresImages;
  }


  public void setFeaturesImages(String featuresImages) {
    this.featuresImages = featuresImages;
  }


  public FeaturesConfig featuresProfiles(String featuresProfiles) {
    
    this.featuresProfiles = featuresProfiles;
    return this;
  }

   /**
   * Get featuresProfiles
   * @return featuresProfiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getFeaturesProfiles() {
    return featuresProfiles;
  }


  public void setFeaturesProfiles(String featuresProfiles) {
    this.featuresProfiles = featuresProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesConfig featuresConfig = (FeaturesConfig) o;
    return Objects.equals(this.featuresImages, featuresConfig.featuresImages) &&
        Objects.equals(this.featuresProfiles, featuresConfig.featuresProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featuresImages, featuresProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesConfig {\n");
    sb.append("    featuresImages: ").append(toIndentedString(featuresImages)).append("\n");
    sb.append("    featuresProfiles: ").append(toIndentedString(featuresProfiles)).append("\n");
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

