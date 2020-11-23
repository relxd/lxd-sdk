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
import java.math.BigDecimal;
import org.relxd.lxd.model.Cpu;
import org.relxd.lxd.model.Disk;
import org.relxd.lxd.model.Memory;
import org.relxd.lxd.model.Network;

/**
 * GetInstancesByNameStateMetadataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T19:42:20.041212Z[Europe/London]")
public class GetInstancesByNameStateMetadataResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private BigDecimal statusCode;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private Cpu cpu;

  public static final String SERIALIZED_NAME_DISK = "disk";
  @SerializedName(SERIALIZED_NAME_DISK)
  private Disk disk;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Memory memory;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private Network network;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private BigDecimal pid;

  public static final String SERIALIZED_NAME_PROCESSES = "processes";
  @SerializedName(SERIALIZED_NAME_PROCESSES)
  private BigDecimal processes;


  public GetInstancesByNameStateMetadataResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Running", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetInstancesByNameStateMetadataResponse statusCode(BigDecimal statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "")

  public BigDecimal getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
  }


  public GetInstancesByNameStateMetadataResponse cpu(Cpu cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cpu getCpu() {
    return cpu;
  }


  public void setCpu(Cpu cpu) {
    this.cpu = cpu;
  }


  public GetInstancesByNameStateMetadataResponse disk(Disk disk) {
    
    this.disk = disk;
    return this;
  }

   /**
   * Get disk
   * @return disk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Disk getDisk() {
    return disk;
  }


  public void setDisk(Disk disk) {
    this.disk = disk;
  }


  public GetInstancesByNameStateMetadataResponse memory(Memory memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Memory getMemory() {
    return memory;
  }


  public void setMemory(Memory memory) {
    this.memory = memory;
  }


  public GetInstancesByNameStateMetadataResponse network(Network network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Network getNetwork() {
    return network;
  }


  public void setNetwork(Network network) {
    this.network = network;
  }


  public GetInstancesByNameStateMetadataResponse pid(BigDecimal pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13663", value = "")

  public BigDecimal getPid() {
    return pid;
  }


  public void setPid(BigDecimal pid) {
    this.pid = pid;
  }


  public GetInstancesByNameStateMetadataResponse processes(BigDecimal processes) {
    
    this.processes = processes;
    return this;
  }

   /**
   * Get processes
   * @return processes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32", value = "")

  public BigDecimal getProcesses() {
    return processes;
  }


  public void setProcesses(BigDecimal processes) {
    this.processes = processes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstancesByNameStateMetadataResponse getInstancesByNameStateMetadataResponse = (GetInstancesByNameStateMetadataResponse) o;
    return Objects.equals(this.status, getInstancesByNameStateMetadataResponse.status) &&
        Objects.equals(this.statusCode, getInstancesByNameStateMetadataResponse.statusCode) &&
        Objects.equals(this.cpu, getInstancesByNameStateMetadataResponse.cpu) &&
        Objects.equals(this.disk, getInstancesByNameStateMetadataResponse.disk) &&
        Objects.equals(this.memory, getInstancesByNameStateMetadataResponse.memory) &&
        Objects.equals(this.network, getInstancesByNameStateMetadataResponse.network) &&
        Objects.equals(this.pid, getInstancesByNameStateMetadataResponse.pid) &&
        Objects.equals(this.processes, getInstancesByNameStateMetadataResponse.processes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusCode, cpu, disk, memory, network, pid, processes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstancesByNameStateMetadataResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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

