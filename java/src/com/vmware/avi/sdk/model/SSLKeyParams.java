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
import com.vmware.avi.sdk.model.SSLKeyECParams;
import com.vmware.avi.sdk.model.SSLKeyRSAParams;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SSLKeyParams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class SSLKeyParams {
  @JsonProperty("algorithm")
  private String algorithm = "SSL_KEY_ALGORITHM_RSA";

  @JsonProperty("ec_params")
  private SSLKeyECParams ecParams = null;

  @JsonProperty("rsa_params")
  private SSLKeyRSAParams rsaParams = null;

  public SSLKeyParams algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   *  Enum options - SSL_KEY_ALGORITHM_RSA, SSL_KEY_ALGORITHM_EC.
   * @return algorithm
  **/
  @Schema(required = true, description = " Enum options - SSL_KEY_ALGORITHM_RSA, SSL_KEY_ALGORITHM_EC.")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public SSLKeyParams ecParams(SSLKeyECParams ecParams) {
    this.ecParams = ecParams;
    return this;
  }

   /**
   * Get ecParams
   * @return ecParams
  **/
  @Schema(description = "")
  public SSLKeyECParams getEcParams() {
    return ecParams;
  }

  public void setEcParams(SSLKeyECParams ecParams) {
    this.ecParams = ecParams;
  }

  public SSLKeyParams rsaParams(SSLKeyRSAParams rsaParams) {
    this.rsaParams = rsaParams;
    return this;
  }

   /**
   * Get rsaParams
   * @return rsaParams
  **/
  @Schema(description = "")
  public SSLKeyRSAParams getRsaParams() {
    return rsaParams;
  }

  public void setRsaParams(SSLKeyRSAParams rsaParams) {
    this.rsaParams = rsaParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLKeyParams ssLKeyParams = (SSLKeyParams) o;
    return Objects.equals(this.algorithm, ssLKeyParams.algorithm) &&
        Objects.equals(this.ecParams, ssLKeyParams.ecParams) &&
        Objects.equals(this.rsaParams, ssLKeyParams.rsaParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, ecParams, rsaParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLKeyParams {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    ecParams: ").append(toIndentedString(ecParams)).append("\n");
    sb.append("    rsaParams: ").append(toIndentedString(rsaParams)).append("\n");
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