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
import org.relxd.lxd.model.Kvm;

/**
 * DevicesKvm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-14T17:58:36.350241+02:00[Africa/Harare]")
public class DevicesKvm {
  public static final String SERIALIZED_NAME_KVM = "kvm";
  @SerializedName(SERIALIZED_NAME_KVM)
  private Kvm kvm;


  public DevicesKvm kvm(Kvm kvm) {
    
    this.kvm = kvm;
    return this;
  }

   /**
   * Get kvm
   * @return kvm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Kvm getKvm() {
    return kvm;
  }


  public void setKvm(Kvm kvm) {
    this.kvm = kvm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesKvm devicesKvm = (DevicesKvm) o;
    return Objects.equals(this.kvm, devicesKvm.kvm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kvm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesKvm {\n");
    sb.append("    kvm: ").append(toIndentedString(kvm)).append("\n");
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

