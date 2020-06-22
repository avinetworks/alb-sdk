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
import com.vmware.avi.sdk.model.DnsCnameRdata;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DnsInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DnsInfo {
  @JsonProperty("algorithm")
  private String algorithm = "DNS_RECORD_RESPONSE_CONSISTENT_HASH";

  @JsonProperty("cname")
  private DnsCnameRdata cname = null;

  @JsonProperty("fqdn")
  private String fqdn = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("num_records_in_response")
  private Integer numRecordsInResponse = 1;

  @JsonProperty("ttl")
  private Integer ttl = null;

  @JsonProperty("type")
  private String type = "DNS_RECORD_A";

  public DnsInfo algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Specifies the algorithm to pick the IP address(es) to be returned, when multiple entries are configured. This does not apply if num_records_in_response is 0. Default is consistent hash. Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH. Field introduced in 17.1.1.
   * @return algorithm
  **/
  @Schema(description = "Specifies the algorithm to pick the IP address(es) to be returned, when multiple entries are configured. This does not apply if num_records_in_response is 0. Default is consistent hash. Enum options - DNS_RECORD_RESPONSE_ROUND_ROBIN, DNS_RECORD_RESPONSE_CONSISTENT_HASH. Field introduced in 17.1.1.")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public DnsInfo cname(DnsCnameRdata cname) {
    this.cname = cname;
    return this;
  }

   /**
   * Get cname
   * @return cname
  **/
  @Schema(description = "")
  public DnsCnameRdata getCname() {
    return cname;
  }

  public void setCname(DnsCnameRdata cname) {
    this.cname = cname;
  }

  public DnsInfo fqdn(String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

   /**
   * Fully qualified domain name.
   * @return fqdn
  **/
  @Schema(description = "Fully qualified domain name.")
  public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

   /**
   * Any metadata associated with this record. Field introduced in 17.2.2.
   * @return metadata
  **/
  @Schema(description = "Any metadata associated with this record. Field introduced in 17.2.2.")
  public String getMetadata() {
    return metadata;
  }

  public DnsInfo numRecordsInResponse(Integer numRecordsInResponse) {
    this.numRecordsInResponse = numRecordsInResponse;
    return this;
  }

   /**
   * Specifies the number of records returned for this FQDN. Enter 0 to return all records. Default is 0. Allowed values are 0-20. Special values are 0- &#x27;Return all records&#x27;. Field introduced in 17.1.1.
   * @return numRecordsInResponse
  **/
  @Schema(description = "Specifies the number of records returned for this FQDN. Enter 0 to return all records. Default is 0. Allowed values are 0-20. Special values are 0- 'Return all records'. Field introduced in 17.1.1.")
  public Integer getNumRecordsInResponse() {
    return numRecordsInResponse;
  }

  public void setNumRecordsInResponse(Integer numRecordsInResponse) {
    this.numRecordsInResponse = numRecordsInResponse;
  }

  public DnsInfo ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * Time to live for fqdn record. Default value is chosen from DNS profile for this cloud if no value provided.
   * @return ttl
  **/
  @Schema(description = "Time to live for fqdn record. Default value is chosen from DNS profile for this cloud if no value provided.")
  public Integer getTtl() {
    return ttl;
  }

  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  public DnsInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY.
   * @return type
  **/
  @Schema(description = "DNS record type. Enum options - DNS_RECORD_OTHER, DNS_RECORD_A, DNS_RECORD_NS, DNS_RECORD_CNAME, DNS_RECORD_SOA, DNS_RECORD_PTR, DNS_RECORD_HINFO, DNS_RECORD_MX, DNS_RECORD_TXT, DNS_RECORD_RP, DNS_RECORD_DNSKEY, DNS_RECORD_AAAA, DNS_RECORD_SRV, DNS_RECORD_OPT, DNS_RECORD_RRSIG, DNS_RECORD_AXFR, DNS_RECORD_ANY.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsInfo dnsInfo = (DnsInfo) o;
    return Objects.equals(this.algorithm, dnsInfo.algorithm) &&
        Objects.equals(this.cname, dnsInfo.cname) &&
        Objects.equals(this.fqdn, dnsInfo.fqdn) &&
        Objects.equals(this.metadata, dnsInfo.metadata) &&
        Objects.equals(this.numRecordsInResponse, dnsInfo.numRecordsInResponse) &&
        Objects.equals(this.ttl, dnsInfo.ttl) &&
        Objects.equals(this.type, dnsInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, cname, fqdn, metadata, numRecordsInResponse, ttl, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsInfo {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    cname: ").append(toIndentedString(cname)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    numRecordsInResponse: ").append(toIndentedString(numRecordsInResponse)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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