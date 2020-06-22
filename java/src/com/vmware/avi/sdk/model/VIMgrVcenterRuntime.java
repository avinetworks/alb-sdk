/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * VIMgrVcenterRuntime
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class VIMgrVcenterRuntime {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("api_version")
  private String apiVersion = null;

  @JsonProperty("apic_mode")
  private Boolean apicMode = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("datacenter_refs")
  private List<String> datacenterRefs = null;

  @JsonProperty("disc_end_time")
  private String discEndTime = null;

  @JsonProperty("disc_start_time")
  private String discStartTime = null;

  @JsonProperty("discovered_datacenter")
  private String discoveredDatacenter = null;

  @JsonProperty("inventory_progress")
  private String inventoryProgress = null;

  @JsonProperty("inventory_state")
  private String inventoryState = null;

  @JsonProperty("management_network")
  private String managementNetwork = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("num_clusters")
  private Long numClusters = null;

  @JsonProperty("num_dcs")
  private Long numDcs = null;

  @JsonProperty("num_hosts")
  private Long numHosts = null;

  @JsonProperty("num_nws")
  private Long numNws = null;

  @JsonProperty("num_vcenter_req_pending")
  private Long numVcenterReqPending = null;

  @JsonProperty("num_vms")
  private Long numVms = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("privilege")
  private String privilege = null;

  @JsonProperty("progress")
  private Long progress = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vcenter_connected")
  private Boolean vcenterConnected = null;

  @JsonProperty("vcenter_fullname")
  private String vcenterFullname = null;

  @JsonProperty("vcenter_template_se_location")
  private String vcenterTemplateSeLocation = null;

  @JsonProperty("vcenter_url")
  private String vcenterUrl = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public VIMgrVcenterRuntime apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * api_version of VIMgrVcenterRuntime.
   * @return apiVersion
  **/
  @Schema(description = "api_version of VIMgrVcenterRuntime.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public VIMgrVcenterRuntime apicMode(Boolean apicMode) {
    this.apicMode = apicMode;
    return this;
  }

   /**
   * Placeholder for description of property apic_mode of obj type VIMgrVcenterRuntime field type str  type boolean
   * @return apicMode
  **/
  @Schema(description = "Placeholder for description of property apic_mode of obj type VIMgrVcenterRuntime field type str  type boolean")
  public Boolean isApicMode() {
    return apicMode;
  }

  public void setApicMode(Boolean apicMode) {
    this.apicMode = apicMode;
  }

  public VIMgrVcenterRuntime cloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Cloud.
   * @return cloudRef
  **/
  @Schema(description = " It is a reference to an object of type Cloud.")
  public String getCloudRef() {
    return cloudRef;
  }

  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  public VIMgrVcenterRuntime datacenterRefs(List<String> datacenterRefs) {
    this.datacenterRefs = datacenterRefs;
    return this;
  }

  public VIMgrVcenterRuntime addDatacenterRefsItem(String datacenterRefsItem) {
    if (this.datacenterRefs == null) {
      this.datacenterRefs = new ArrayList<String>();
    }
    this.datacenterRefs.add(datacenterRefsItem);
    return this;
  }

   /**
   *  It is a reference to an object of type VIMgrDCRuntime.
   * @return datacenterRefs
  **/
  @Schema(description = " It is a reference to an object of type VIMgrDCRuntime.")
  public List<String> getDatacenterRefs() {
    return datacenterRefs;
  }

  public void setDatacenterRefs(List<String> datacenterRefs) {
    this.datacenterRefs = datacenterRefs;
  }

  public VIMgrVcenterRuntime discEndTime(String discEndTime) {
    this.discEndTime = discEndTime;
    return this;
  }

   /**
   * disc_end_time of VIMgrVcenterRuntime.
   * @return discEndTime
  **/
  @Schema(description = "disc_end_time of VIMgrVcenterRuntime.")
  public String getDiscEndTime() {
    return discEndTime;
  }

  public void setDiscEndTime(String discEndTime) {
    this.discEndTime = discEndTime;
  }

  public VIMgrVcenterRuntime discStartTime(String discStartTime) {
    this.discStartTime = discStartTime;
    return this;
  }

   /**
   * disc_start_time of VIMgrVcenterRuntime.
   * @return discStartTime
  **/
  @Schema(description = "disc_start_time of VIMgrVcenterRuntime.")
  public String getDiscStartTime() {
    return discStartTime;
  }

  public void setDiscStartTime(String discStartTime) {
    this.discStartTime = discStartTime;
  }

  public VIMgrVcenterRuntime discoveredDatacenter(String discoveredDatacenter) {
    this.discoveredDatacenter = discoveredDatacenter;
    return this;
  }

   /**
   * discovered_datacenter of VIMgrVcenterRuntime.
   * @return discoveredDatacenter
  **/
  @Schema(description = "discovered_datacenter of VIMgrVcenterRuntime.")
  public String getDiscoveredDatacenter() {
    return discoveredDatacenter;
  }

  public void setDiscoveredDatacenter(String discoveredDatacenter) {
    this.discoveredDatacenter = discoveredDatacenter;
  }

  public VIMgrVcenterRuntime inventoryProgress(String inventoryProgress) {
    this.inventoryProgress = inventoryProgress;
    return this;
  }

   /**
   * inventory_progress of VIMgrVcenterRuntime.
   * @return inventoryProgress
  **/
  @Schema(description = "inventory_progress of VIMgrVcenterRuntime.")
  public String getInventoryProgress() {
    return inventoryProgress;
  }

  public void setInventoryProgress(String inventoryProgress) {
    this.inventoryProgress = inventoryProgress;
  }

  public VIMgrVcenterRuntime inventoryState(String inventoryState) {
    this.inventoryState = inventoryState;
    return this;
  }

   /**
   *  Enum options - VCENTER_DISCOVERY_BAD_CREDENTIALS, VCENTER_DISCOVERY_RETRIEVING_DC, VCENTER_DISCOVERY_WAITING_DC, VCENTER_DISCOVERY_RETRIEVING_NW, VCENTER_DISCOVERY_ONGOING, VCENTER_DISCOVERY_RESYNCING, VCENTER_DISCOVERY_COMPLETE, VCENTER_DISCOVERY_DELETING_VCENTER, VCENTER_DISCOVERY_FAILURE, VCENTER_DISCOVERY_COMPLETE_NO_MGMT_NW, VCENTER_DISCOVERY_COMPLETE_PER_TENANT_IP_ROUTE, VCENTER_DISCOVERY_MAKING_SE_OVA, VCENTER_DISCOVERY_RESYNC_FAILED, VCENTER_DISCOVERY_OBJECT_LIMIT_REACHED.
   * @return inventoryState
  **/
  @Schema(description = " Enum options - VCENTER_DISCOVERY_BAD_CREDENTIALS, VCENTER_DISCOVERY_RETRIEVING_DC, VCENTER_DISCOVERY_WAITING_DC, VCENTER_DISCOVERY_RETRIEVING_NW, VCENTER_DISCOVERY_ONGOING, VCENTER_DISCOVERY_RESYNCING, VCENTER_DISCOVERY_COMPLETE, VCENTER_DISCOVERY_DELETING_VCENTER, VCENTER_DISCOVERY_FAILURE, VCENTER_DISCOVERY_COMPLETE_NO_MGMT_NW, VCENTER_DISCOVERY_COMPLETE_PER_TENANT_IP_ROUTE, VCENTER_DISCOVERY_MAKING_SE_OVA, VCENTER_DISCOVERY_RESYNC_FAILED, VCENTER_DISCOVERY_OBJECT_LIMIT_REACHED.")
  public String getInventoryState() {
    return inventoryState;
  }

  public void setInventoryState(String inventoryState) {
    this.inventoryState = inventoryState;
  }

  public VIMgrVcenterRuntime managementNetwork(String managementNetwork) {
    this.managementNetwork = managementNetwork;
    return this;
  }

   /**
   * management_network of VIMgrVcenterRuntime.
   * @return managementNetwork
  **/
  @Schema(description = "management_network of VIMgrVcenterRuntime.")
  public String getManagementNetwork() {
    return managementNetwork;
  }

  public void setManagementNetwork(String managementNetwork) {
    this.managementNetwork = managementNetwork;
  }

  public VIMgrVcenterRuntime name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object.
   * @return name
  **/
  @Schema(required = true, description = "Name of the object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VIMgrVcenterRuntime numClusters(Long numClusters) {
    this.numClusters = numClusters;
    return this;
  }

   /**
   * Number of num_clusters.
   * @return numClusters
  **/
  @Schema(description = "Number of num_clusters.")
  public Long getNumClusters() {
    return numClusters;
  }

  public void setNumClusters(Long numClusters) {
    this.numClusters = numClusters;
  }

  public VIMgrVcenterRuntime numDcs(Long numDcs) {
    this.numDcs = numDcs;
    return this;
  }

   /**
   * Number of num_dcs.
   * @return numDcs
  **/
  @Schema(description = "Number of num_dcs.")
  public Long getNumDcs() {
    return numDcs;
  }

  public void setNumDcs(Long numDcs) {
    this.numDcs = numDcs;
  }

  public VIMgrVcenterRuntime numHosts(Long numHosts) {
    this.numHosts = numHosts;
    return this;
  }

   /**
   * Number of num_hosts.
   * @return numHosts
  **/
  @Schema(description = "Number of num_hosts.")
  public Long getNumHosts() {
    return numHosts;
  }

  public void setNumHosts(Long numHosts) {
    this.numHosts = numHosts;
  }

  public VIMgrVcenterRuntime numNws(Long numNws) {
    this.numNws = numNws;
    return this;
  }

   /**
   * Number of num_nws.
   * @return numNws
  **/
  @Schema(description = "Number of num_nws.")
  public Long getNumNws() {
    return numNws;
  }

  public void setNumNws(Long numNws) {
    this.numNws = numNws;
  }

  public VIMgrVcenterRuntime numVcenterReqPending(Long numVcenterReqPending) {
    this.numVcenterReqPending = numVcenterReqPending;
    return this;
  }

   /**
   * Number of num_vcenter_req_pending.
   * @return numVcenterReqPending
  **/
  @Schema(description = "Number of num_vcenter_req_pending.")
  public Long getNumVcenterReqPending() {
    return numVcenterReqPending;
  }

  public void setNumVcenterReqPending(Long numVcenterReqPending) {
    this.numVcenterReqPending = numVcenterReqPending;
  }

  public VIMgrVcenterRuntime numVms(Long numVms) {
    this.numVms = numVms;
    return this;
  }

   /**
   * Number of num_vms.
   * @return numVms
  **/
  @Schema(description = "Number of num_vms.")
  public Long getNumVms() {
    return numVms;
  }

  public void setNumVms(Long numVms) {
    this.numVms = numVms;
  }

  public VIMgrVcenterRuntime password(String password) {
    this.password = password;
    return this;
  }

   /**
   * password of VIMgrVcenterRuntime.
   * @return password
  **/
  @Schema(required = true, description = "password of VIMgrVcenterRuntime.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public VIMgrVcenterRuntime privilege(String privilege) {
    this.privilege = privilege;
    return this;
  }

   /**
   *  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.
   * @return privilege
  **/
  @Schema(description = " Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS.")
  public String getPrivilege() {
    return privilege;
  }

  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }

  public VIMgrVcenterRuntime progress(Long progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Number of progress.
   * @return progress
  **/
  @Schema(description = "Number of progress.")
  public Long getProgress() {
    return progress;
  }

  public void setProgress(Long progress) {
    this.progress = progress;
  }

  public VIMgrVcenterRuntime tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  public VIMgrVcenterRuntime type(String type) {
    this.type = type;
    return this;
  }

   /**
   *  Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.
   * @return type
  **/
  @Schema(required = true, description = " Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public VIMgrVcenterRuntime username(String username) {
    this.username = username;
    return this;
  }

   /**
   * username of VIMgrVcenterRuntime.
   * @return username
  **/
  @Schema(required = true, description = "username of VIMgrVcenterRuntime.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public VIMgrVcenterRuntime uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @Schema(description = "Unique object identifier of the object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public VIMgrVcenterRuntime vcenterConnected(Boolean vcenterConnected) {
    this.vcenterConnected = vcenterConnected;
    return this;
  }

   /**
   * Placeholder for description of property vcenter_connected of obj type VIMgrVcenterRuntime field type str  type boolean
   * @return vcenterConnected
  **/
  @Schema(description = "Placeholder for description of property vcenter_connected of obj type VIMgrVcenterRuntime field type str  type boolean")
  public Boolean isVcenterConnected() {
    return vcenterConnected;
  }

  public void setVcenterConnected(Boolean vcenterConnected) {
    this.vcenterConnected = vcenterConnected;
  }

  public VIMgrVcenterRuntime vcenterFullname(String vcenterFullname) {
    this.vcenterFullname = vcenterFullname;
    return this;
  }

   /**
   * vcenter_fullname of VIMgrVcenterRuntime.
   * @return vcenterFullname
  **/
  @Schema(description = "vcenter_fullname of VIMgrVcenterRuntime.")
  public String getVcenterFullname() {
    return vcenterFullname;
  }

  public void setVcenterFullname(String vcenterFullname) {
    this.vcenterFullname = vcenterFullname;
  }

  public VIMgrVcenterRuntime vcenterTemplateSeLocation(String vcenterTemplateSeLocation) {
    this.vcenterTemplateSeLocation = vcenterTemplateSeLocation;
    return this;
  }

   /**
   * vcenter_template_se_location of VIMgrVcenterRuntime.
   * @return vcenterTemplateSeLocation
  **/
  @Schema(description = "vcenter_template_se_location of VIMgrVcenterRuntime.")
  public String getVcenterTemplateSeLocation() {
    return vcenterTemplateSeLocation;
  }

  public void setVcenterTemplateSeLocation(String vcenterTemplateSeLocation) {
    this.vcenterTemplateSeLocation = vcenterTemplateSeLocation;
  }

  public VIMgrVcenterRuntime vcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
    return this;
  }

   /**
   * vcenter_url of VIMgrVcenterRuntime.
   * @return vcenterUrl
  **/
  @Schema(required = true, description = "vcenter_url of VIMgrVcenterRuntime.")
  public String getVcenterUrl() {
    return vcenterUrl;
  }

  public void setVcenterUrl(String vcenterUrl) {
    this.vcenterUrl = vcenterUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMgrVcenterRuntime viMgrVcenterRuntime = (VIMgrVcenterRuntime) o;
    return Objects.equals(this._lastModified, viMgrVcenterRuntime._lastModified) &&
        Objects.equals(this.apiVersion, viMgrVcenterRuntime.apiVersion) &&
        Objects.equals(this.apicMode, viMgrVcenterRuntime.apicMode) &&
        Objects.equals(this.cloudRef, viMgrVcenterRuntime.cloudRef) &&
        Objects.equals(this.datacenterRefs, viMgrVcenterRuntime.datacenterRefs) &&
        Objects.equals(this.discEndTime, viMgrVcenterRuntime.discEndTime) &&
        Objects.equals(this.discStartTime, viMgrVcenterRuntime.discStartTime) &&
        Objects.equals(this.discoveredDatacenter, viMgrVcenterRuntime.discoveredDatacenter) &&
        Objects.equals(this.inventoryProgress, viMgrVcenterRuntime.inventoryProgress) &&
        Objects.equals(this.inventoryState, viMgrVcenterRuntime.inventoryState) &&
        Objects.equals(this.managementNetwork, viMgrVcenterRuntime.managementNetwork) &&
        Objects.equals(this.name, viMgrVcenterRuntime.name) &&
        Objects.equals(this.numClusters, viMgrVcenterRuntime.numClusters) &&
        Objects.equals(this.numDcs, viMgrVcenterRuntime.numDcs) &&
        Objects.equals(this.numHosts, viMgrVcenterRuntime.numHosts) &&
        Objects.equals(this.numNws, viMgrVcenterRuntime.numNws) &&
        Objects.equals(this.numVcenterReqPending, viMgrVcenterRuntime.numVcenterReqPending) &&
        Objects.equals(this.numVms, viMgrVcenterRuntime.numVms) &&
        Objects.equals(this.password, viMgrVcenterRuntime.password) &&
        Objects.equals(this.privilege, viMgrVcenterRuntime.privilege) &&
        Objects.equals(this.progress, viMgrVcenterRuntime.progress) &&
        Objects.equals(this.tenantRef, viMgrVcenterRuntime.tenantRef) &&
        Objects.equals(this.type, viMgrVcenterRuntime.type) &&
        Objects.equals(this.url, viMgrVcenterRuntime.url) &&
        Objects.equals(this.username, viMgrVcenterRuntime.username) &&
        Objects.equals(this.uuid, viMgrVcenterRuntime.uuid) &&
        Objects.equals(this.vcenterConnected, viMgrVcenterRuntime.vcenterConnected) &&
        Objects.equals(this.vcenterFullname, viMgrVcenterRuntime.vcenterFullname) &&
        Objects.equals(this.vcenterTemplateSeLocation, viMgrVcenterRuntime.vcenterTemplateSeLocation) &&
        Objects.equals(this.vcenterUrl, viMgrVcenterRuntime.vcenterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, apiVersion, apicMode, cloudRef, datacenterRefs, discEndTime, discStartTime, discoveredDatacenter, inventoryProgress, inventoryState, managementNetwork, name, numClusters, numDcs, numHosts, numNws, numVcenterReqPending, numVms, password, privilege, progress, tenantRef, type, url, username, uuid, vcenterConnected, vcenterFullname, vcenterTemplateSeLocation, vcenterUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMgrVcenterRuntime {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    apicMode: ").append(toIndentedString(apicMode)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    datacenterRefs: ").append(toIndentedString(datacenterRefs)).append("\n");
    sb.append("    discEndTime: ").append(toIndentedString(discEndTime)).append("\n");
    sb.append("    discStartTime: ").append(toIndentedString(discStartTime)).append("\n");
    sb.append("    discoveredDatacenter: ").append(toIndentedString(discoveredDatacenter)).append("\n");
    sb.append("    inventoryProgress: ").append(toIndentedString(inventoryProgress)).append("\n");
    sb.append("    inventoryState: ").append(toIndentedString(inventoryState)).append("\n");
    sb.append("    managementNetwork: ").append(toIndentedString(managementNetwork)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numClusters: ").append(toIndentedString(numClusters)).append("\n");
    sb.append("    numDcs: ").append(toIndentedString(numDcs)).append("\n");
    sb.append("    numHosts: ").append(toIndentedString(numHosts)).append("\n");
    sb.append("    numNws: ").append(toIndentedString(numNws)).append("\n");
    sb.append("    numVcenterReqPending: ").append(toIndentedString(numVcenterReqPending)).append("\n");
    sb.append("    numVms: ").append(toIndentedString(numVms)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vcenterConnected: ").append(toIndentedString(vcenterConnected)).append("\n");
    sb.append("    vcenterFullname: ").append(toIndentedString(vcenterFullname)).append("\n");
    sb.append("    vcenterTemplateSeLocation: ").append(toIndentedString(vcenterTemplateSeLocation)).append("\n");
    sb.append("    vcenterUrl: ").append(toIndentedString(vcenterUrl)).append("\n");
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