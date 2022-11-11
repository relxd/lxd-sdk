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


package org.relxd.lxd.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.client.model.Aliases;
import org.relxd.lxd.client.model.Properties3;
import org.relxd.lxd.client.model.Source10;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Source image dictionary (transfers a remote image)
 */
@ApiModel(description = "Source image dictionary (transfers a remote image)")
@JsonPropertyOrder({
  CreateImagesRequest.JSON_PROPERTY_FILENAME,
  CreateImagesRequest.JSON_PROPERTY_PUBLIC,
  CreateImagesRequest.JSON_PROPERTY_AUTO_UPDATE,
  CreateImagesRequest.JSON_PROPERTY_PROPERTIES,
  CreateImagesRequest.JSON_PROPERTY_ALIASES,
  CreateImagesRequest.JSON_PROPERTY_SOURCE,
  CreateImagesRequest.JSON_PROPERTY_COMPRESSION_ALGORITHM
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateImagesRequest {
  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_PUBLIC = "public";
  private Boolean _public;

  public static final String JSON_PROPERTY_AUTO_UPDATE = "auto_update";
  private Boolean autoUpdate;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Properties3 properties;

  public static final String JSON_PROPERTY_ALIASES = "aliases";
  private List<Aliases> aliases = new ArrayList<>();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Source10 source;

  public static final String JSON_PROPERTY_COMPRESSION_ALGORITHM = "compression_algorithm";
  private String compressionAlgorithm;


  public CreateImagesRequest filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Used for export (optional)
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "filename", value = "Used for export (optional)")
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public CreateImagesRequest _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Whether the image can be downloaded by untrusted users (defaults to false)
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the image can be downloaded by untrusted users (defaults to false)")
  @JsonProperty(JSON_PROPERTY_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublic() {
    return _public;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public CreateImagesRequest autoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * Whether the image should be auto-updated (optional; defaults to false)
   * @return autoUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the image should be auto-updated (optional; defaults to false)")
  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoUpdate() {
    return autoUpdate;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }


  public CreateImagesRequest properties(Properties3 properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Properties3 getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(Properties3 properties) {
    this.properties = properties;
  }


  public CreateImagesRequest aliases(List<Aliases> aliases) {
    this.aliases = aliases;
    return this;
  }

  public CreateImagesRequest addAliasesItem(Aliases aliasesItem) {
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Set initial aliases (\&quot;image_create_aliases\&quot; API extension)
   * @return aliases
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Set initial aliases (\"image_create_aliases\" API extension)")
  @JsonProperty(JSON_PROPERTY_ALIASES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Aliases> getAliases() {
    return aliases;
  }


  @JsonProperty(JSON_PROPERTY_ALIASES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAliases(List<Aliases> aliases) {
    this.aliases = aliases;
  }


  public CreateImagesRequest source(Source10 source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Source10 getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(Source10 source) {
    this.source = source;
  }


  public CreateImagesRequest compressionAlgorithm(String compressionAlgorithm) {
    this.compressionAlgorithm = compressionAlgorithm;
    return this;
  }

   /**
   * Override the compression algorithm for the image (optional)
   * @return compressionAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xz", value = "Override the compression algorithm for the image (optional)")
  @JsonProperty(JSON_PROPERTY_COMPRESSION_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompressionAlgorithm() {
    return compressionAlgorithm;
  }


  @JsonProperty(JSON_PROPERTY_COMPRESSION_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompressionAlgorithm(String compressionAlgorithm) {
    this.compressionAlgorithm = compressionAlgorithm;
  }


  /**
   * Return true if this CreateImagesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateImagesRequest createImagesRequest = (CreateImagesRequest) o;
    return Objects.equals(this.filename, createImagesRequest.filename) &&
        Objects.equals(this._public, createImagesRequest._public) &&
        Objects.equals(this.autoUpdate, createImagesRequest.autoUpdate) &&
        Objects.equals(this.properties, createImagesRequest.properties) &&
        Objects.equals(this.aliases, createImagesRequest.aliases) &&
        Objects.equals(this.source, createImagesRequest.source) &&
        Objects.equals(this.compressionAlgorithm, createImagesRequest.compressionAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, _public, autoUpdate, properties, aliases, source, compressionAlgorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImagesRequest {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    compressionAlgorithm: ").append(toIndentedString(compressionAlgorithm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
