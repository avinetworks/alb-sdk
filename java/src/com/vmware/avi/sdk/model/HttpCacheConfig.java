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
import com.vmware.avi.sdk.model.PathMatch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * HttpCacheConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class HttpCacheConfig {
  @JsonProperty("age_header")
  private Boolean ageHeader = true;

  @JsonProperty("aggressive")
  private Boolean aggressive = null;

  @JsonProperty("date_header")
  private Boolean dateHeader = true;

  @JsonProperty("default_expire")
  private Integer defaultExpire = 600;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("heuristic_expire")
  private Boolean heuristicExpire = null;

  @JsonProperty("ignore_request_cache_control")
  private Boolean ignoreRequestCacheControl = null;

  @JsonProperty("max_cache_size")
  private Long maxCacheSize = null;

  @JsonProperty("max_object_size")
  private Integer maxObjectSize = 4194304;

  @JsonProperty("mime_types_black_group_refs")
  private List<String> mimeTypesBlackGroupRefs = null;

  @JsonProperty("mime_types_black_list")
  private List<String> mimeTypesBlackList = null;

  @JsonProperty("mime_types_group_refs")
  private List<String> mimeTypesGroupRefs = null;

  @JsonProperty("mime_types_list")
  private List<String> mimeTypesList = null;

  @JsonProperty("min_object_size")
  private Integer minObjectSize = 100;

  @JsonProperty("query_cacheable")
  private Boolean queryCacheable = null;

  @JsonProperty("uri_non_cacheable")
  private PathMatch uriNonCacheable = null;

  @JsonProperty("xcache_header")
  private Boolean xcacheHeader = true;

  public HttpCacheConfig ageHeader(Boolean ageHeader) {
    this.ageHeader = ageHeader;
    return this;
  }

   /**
   * Add an Age header to content served from cache, which indicates to the client the number of seconds the object has been in the cache.
   * @return ageHeader
  **/
  @Schema(description = "Add an Age header to content served from cache, which indicates to the client the number of seconds the object has been in the cache.")
  public Boolean isAgeHeader() {
    return ageHeader;
  }

  public void setAgeHeader(Boolean ageHeader) {
    this.ageHeader = ageHeader;
  }

  public HttpCacheConfig aggressive(Boolean aggressive) {
    this.aggressive = aggressive;
    return this;
  }

   /**
   * Enable/disable caching objects without Cache-Control headers.
   * @return aggressive
  **/
  @Schema(description = "Enable/disable caching objects without Cache-Control headers.")
  public Boolean isAggressive() {
    return aggressive;
  }

  public void setAggressive(Boolean aggressive) {
    this.aggressive = aggressive;
  }

  public HttpCacheConfig dateHeader(Boolean dateHeader) {
    this.dateHeader = dateHeader;
    return this;
  }

   /**
   * If a Date header was not added by the server, add a Date header to the object served from cache.  This indicates to the client when the object was originally sent by the server to the cache.
   * @return dateHeader
  **/
  @Schema(description = "If a Date header was not added by the server, add a Date header to the object served from cache.  This indicates to the client when the object was originally sent by the server to the cache.")
  public Boolean isDateHeader() {
    return dateHeader;
  }

  public void setDateHeader(Boolean dateHeader) {
    this.dateHeader = dateHeader;
  }

  public HttpCacheConfig defaultExpire(Integer defaultExpire) {
    this.defaultExpire = defaultExpire;
    return this;
  }

   /**
   * Default expiration time of cache objects received from the server without a Cache-Control expiration header.  This value may be overwritten by the Heuristic Expire setting.
   * @return defaultExpire
  **/
  @Schema(description = "Default expiration time of cache objects received from the server without a Cache-Control expiration header.  This value may be overwritten by the Heuristic Expire setting.")
  public Integer getDefaultExpire() {
    return defaultExpire;
  }

  public void setDefaultExpire(Integer defaultExpire) {
    this.defaultExpire = defaultExpire;
  }

  public HttpCacheConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable/disable HTTP object caching.When enabling caching for the first time, SE Group app_cache_percent must beset to allocate shared memory required for caching (A service engine restart is needed after setting/resetting the SE group value).
   * @return enabled
  **/
  @Schema(description = "Enable/disable HTTP object caching.When enabling caching for the first time, SE Group app_cache_percent must beset to allocate shared memory required for caching (A service engine restart is needed after setting/resetting the SE group value).")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public HttpCacheConfig heuristicExpire(Boolean heuristicExpire) {
    this.heuristicExpire = heuristicExpire;
    return this;
  }

   /**
   * If a response object from the server does not include the Cache-Control header, but does include a Last-Modified header, the system will use this time to calculate the Cache-Control expiration.  If unable to solicit an Last-Modified header, then the system will fall back to the Cache Expire Time value.
   * @return heuristicExpire
  **/
  @Schema(description = "If a response object from the server does not include the Cache-Control header, but does include a Last-Modified header, the system will use this time to calculate the Cache-Control expiration.  If unable to solicit an Last-Modified header, then the system will fall back to the Cache Expire Time value.")
  public Boolean isHeuristicExpire() {
    return heuristicExpire;
  }

  public void setHeuristicExpire(Boolean heuristicExpire) {
    this.heuristicExpire = heuristicExpire;
  }

  public HttpCacheConfig ignoreRequestCacheControl(Boolean ignoreRequestCacheControl) {
    this.ignoreRequestCacheControl = ignoreRequestCacheControl;
    return this;
  }

   /**
   * Ignore client&#x27;s cache control headers when fetching or storing from and to the cache. Field introduced in 18.1.2.
   * @return ignoreRequestCacheControl
  **/
  @Schema(description = "Ignore client's cache control headers when fetching or storing from and to the cache. Field introduced in 18.1.2.")
  public Boolean isIgnoreRequestCacheControl() {
    return ignoreRequestCacheControl;
  }

  public void setIgnoreRequestCacheControl(Boolean ignoreRequestCacheControl) {
    this.ignoreRequestCacheControl = ignoreRequestCacheControl;
  }

  public HttpCacheConfig maxCacheSize(Long maxCacheSize) {
    this.maxCacheSize = maxCacheSize;
    return this;
  }

   /**
   * Max size, in bytes, of the cache.  The default, zero, indicates auto configuration.
   * @return maxCacheSize
  **/
  @Schema(description = "Max size, in bytes, of the cache.  The default, zero, indicates auto configuration.")
  public Long getMaxCacheSize() {
    return maxCacheSize;
  }

  public void setMaxCacheSize(Long maxCacheSize) {
    this.maxCacheSize = maxCacheSize;
  }

  public HttpCacheConfig maxObjectSize(Integer maxObjectSize) {
    this.maxObjectSize = maxObjectSize;
    return this;
  }

   /**
   * Maximum size of an object to store in the cache.
   * @return maxObjectSize
  **/
  @Schema(description = "Maximum size of an object to store in the cache.")
  public Integer getMaxObjectSize() {
    return maxObjectSize;
  }

  public void setMaxObjectSize(Integer maxObjectSize) {
    this.maxObjectSize = maxObjectSize;
  }

  public HttpCacheConfig mimeTypesBlackGroupRefs(List<String> mimeTypesBlackGroupRefs) {
    this.mimeTypesBlackGroupRefs = mimeTypesBlackGroupRefs;
    return this;
  }

  public HttpCacheConfig addMimeTypesBlackGroupRefsItem(String mimeTypesBlackGroupRefsItem) {
    if (this.mimeTypesBlackGroupRefs == null) {
      this.mimeTypesBlackGroupRefs = new ArrayList<String>();
    }
    this.mimeTypesBlackGroupRefs.add(mimeTypesBlackGroupRefsItem);
    return this;
  }

   /**
   * Blacklist string group of non-cacheable mime types. It is a reference to an object of type StringGroup.
   * @return mimeTypesBlackGroupRefs
  **/
  @Schema(description = "Blacklist string group of non-cacheable mime types. It is a reference to an object of type StringGroup.")
  public List<String> getMimeTypesBlackGroupRefs() {
    return mimeTypesBlackGroupRefs;
  }

  public void setMimeTypesBlackGroupRefs(List<String> mimeTypesBlackGroupRefs) {
    this.mimeTypesBlackGroupRefs = mimeTypesBlackGroupRefs;
  }

  public HttpCacheConfig mimeTypesBlackList(List<String> mimeTypesBlackList) {
    this.mimeTypesBlackList = mimeTypesBlackList;
    return this;
  }

  public HttpCacheConfig addMimeTypesBlackListItem(String mimeTypesBlackListItem) {
    if (this.mimeTypesBlackList == null) {
      this.mimeTypesBlackList = new ArrayList<String>();
    }
    this.mimeTypesBlackList.add(mimeTypesBlackListItem);
    return this;
  }

   /**
   * Blacklist of non-cacheable mime types.
   * @return mimeTypesBlackList
  **/
  @Schema(description = "Blacklist of non-cacheable mime types.")
  public List<String> getMimeTypesBlackList() {
    return mimeTypesBlackList;
  }

  public void setMimeTypesBlackList(List<String> mimeTypesBlackList) {
    this.mimeTypesBlackList = mimeTypesBlackList;
  }

  public HttpCacheConfig mimeTypesGroupRefs(List<String> mimeTypesGroupRefs) {
    this.mimeTypesGroupRefs = mimeTypesGroupRefs;
    return this;
  }

  public HttpCacheConfig addMimeTypesGroupRefsItem(String mimeTypesGroupRefsItem) {
    if (this.mimeTypesGroupRefs == null) {
      this.mimeTypesGroupRefs = new ArrayList<String>();
    }
    this.mimeTypesGroupRefs.add(mimeTypesGroupRefsItem);
    return this;
  }

   /**
   * Whitelist string group of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*. It is a reference to an object of type StringGroup.
   * @return mimeTypesGroupRefs
  **/
  @Schema(description = "Whitelist string group of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*. It is a reference to an object of type StringGroup.")
  public List<String> getMimeTypesGroupRefs() {
    return mimeTypesGroupRefs;
  }

  public void setMimeTypesGroupRefs(List<String> mimeTypesGroupRefs) {
    this.mimeTypesGroupRefs = mimeTypesGroupRefs;
  }

  public HttpCacheConfig mimeTypesList(List<String> mimeTypesList) {
    this.mimeTypesList = mimeTypesList;
    return this;
  }

  public HttpCacheConfig addMimeTypesListItem(String mimeTypesListItem) {
    if (this.mimeTypesList == null) {
      this.mimeTypesList = new ArrayList<String>();
    }
    this.mimeTypesList.add(mimeTypesListItem);
    return this;
  }

   /**
   * Whitelist of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*.
   * @return mimeTypesList
  **/
  @Schema(description = "Whitelist of cacheable mime types. If both Cacheable Mime Types string list and string group are empty, this defaults to *_/_*.")
  public List<String> getMimeTypesList() {
    return mimeTypesList;
  }

  public void setMimeTypesList(List<String> mimeTypesList) {
    this.mimeTypesList = mimeTypesList;
  }

  public HttpCacheConfig minObjectSize(Integer minObjectSize) {
    this.minObjectSize = minObjectSize;
    return this;
  }

   /**
   * Minimum size of an object to store in the cache.
   * @return minObjectSize
  **/
  @Schema(description = "Minimum size of an object to store in the cache.")
  public Integer getMinObjectSize() {
    return minObjectSize;
  }

  public void setMinObjectSize(Integer minObjectSize) {
    this.minObjectSize = minObjectSize;
  }

  public HttpCacheConfig queryCacheable(Boolean queryCacheable) {
    this.queryCacheable = queryCacheable;
    return this;
  }

   /**
   * Allow caching of objects whose URI included a query argument.  When disabled, these objects are not cached.  When enabled, the request must match the URI query to be considered a hit.
   * @return queryCacheable
  **/
  @Schema(description = "Allow caching of objects whose URI included a query argument.  When disabled, these objects are not cached.  When enabled, the request must match the URI query to be considered a hit.")
  public Boolean isQueryCacheable() {
    return queryCacheable;
  }

  public void setQueryCacheable(Boolean queryCacheable) {
    this.queryCacheable = queryCacheable;
  }

  public HttpCacheConfig uriNonCacheable(PathMatch uriNonCacheable) {
    this.uriNonCacheable = uriNonCacheable;
    return this;
  }

   /**
   * Get uriNonCacheable
   * @return uriNonCacheable
  **/
  @Schema(description = "")
  public PathMatch getUriNonCacheable() {
    return uriNonCacheable;
  }

  public void setUriNonCacheable(PathMatch uriNonCacheable) {
    this.uriNonCacheable = uriNonCacheable;
  }

  public HttpCacheConfig xcacheHeader(Boolean xcacheHeader) {
    this.xcacheHeader = xcacheHeader;
    return this;
  }

   /**
   * Add an X-Cache header to content served from cache, which indicates to the client that the object was served from an intermediate cache.
   * @return xcacheHeader
  **/
  @Schema(description = "Add an X-Cache header to content served from cache, which indicates to the client that the object was served from an intermediate cache.")
  public Boolean isXcacheHeader() {
    return xcacheHeader;
  }

  public void setXcacheHeader(Boolean xcacheHeader) {
    this.xcacheHeader = xcacheHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpCacheConfig httpCacheConfig = (HttpCacheConfig) o;
    return Objects.equals(this.ageHeader, httpCacheConfig.ageHeader) &&
        Objects.equals(this.aggressive, httpCacheConfig.aggressive) &&
        Objects.equals(this.dateHeader, httpCacheConfig.dateHeader) &&
        Objects.equals(this.defaultExpire, httpCacheConfig.defaultExpire) &&
        Objects.equals(this.enabled, httpCacheConfig.enabled) &&
        Objects.equals(this.heuristicExpire, httpCacheConfig.heuristicExpire) &&
        Objects.equals(this.ignoreRequestCacheControl, httpCacheConfig.ignoreRequestCacheControl) &&
        Objects.equals(this.maxCacheSize, httpCacheConfig.maxCacheSize) &&
        Objects.equals(this.maxObjectSize, httpCacheConfig.maxObjectSize) &&
        Objects.equals(this.mimeTypesBlackGroupRefs, httpCacheConfig.mimeTypesBlackGroupRefs) &&
        Objects.equals(this.mimeTypesBlackList, httpCacheConfig.mimeTypesBlackList) &&
        Objects.equals(this.mimeTypesGroupRefs, httpCacheConfig.mimeTypesGroupRefs) &&
        Objects.equals(this.mimeTypesList, httpCacheConfig.mimeTypesList) &&
        Objects.equals(this.minObjectSize, httpCacheConfig.minObjectSize) &&
        Objects.equals(this.queryCacheable, httpCacheConfig.queryCacheable) &&
        Objects.equals(this.uriNonCacheable, httpCacheConfig.uriNonCacheable) &&
        Objects.equals(this.xcacheHeader, httpCacheConfig.xcacheHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageHeader, aggressive, dateHeader, defaultExpire, enabled, heuristicExpire, ignoreRequestCacheControl, maxCacheSize, maxObjectSize, mimeTypesBlackGroupRefs, mimeTypesBlackList, mimeTypesGroupRefs, mimeTypesList, minObjectSize, queryCacheable, uriNonCacheable, xcacheHeader);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpCacheConfig {\n");
    
    sb.append("    ageHeader: ").append(toIndentedString(ageHeader)).append("\n");
    sb.append("    aggressive: ").append(toIndentedString(aggressive)).append("\n");
    sb.append("    dateHeader: ").append(toIndentedString(dateHeader)).append("\n");
    sb.append("    defaultExpire: ").append(toIndentedString(defaultExpire)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    heuristicExpire: ").append(toIndentedString(heuristicExpire)).append("\n");
    sb.append("    ignoreRequestCacheControl: ").append(toIndentedString(ignoreRequestCacheControl)).append("\n");
    sb.append("    maxCacheSize: ").append(toIndentedString(maxCacheSize)).append("\n");
    sb.append("    maxObjectSize: ").append(toIndentedString(maxObjectSize)).append("\n");
    sb.append("    mimeTypesBlackGroupRefs: ").append(toIndentedString(mimeTypesBlackGroupRefs)).append("\n");
    sb.append("    mimeTypesBlackList: ").append(toIndentedString(mimeTypesBlackList)).append("\n");
    sb.append("    mimeTypesGroupRefs: ").append(toIndentedString(mimeTypesGroupRefs)).append("\n");
    sb.append("    mimeTypesList: ").append(toIndentedString(mimeTypesList)).append("\n");
    sb.append("    minObjectSize: ").append(toIndentedString(minObjectSize)).append("\n");
    sb.append("    queryCacheable: ").append(toIndentedString(queryCacheable)).append("\n");
    sb.append("    uriNonCacheable: ").append(toIndentedString(uriNonCacheable)).append("\n");
    sb.append("    xcacheHeader: ").append(toIndentedString(xcacheHeader)).append("\n");
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