/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DomainListResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public DomainListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public DomainListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public DomainListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Returns a list of all domains.
     */
    
    public org.openapis.openapi.models.shared.DomainsResponse domainsResponse;

    public DomainListResponse withDomainsResponse(org.openapis.openapi.models.shared.DomainsResponse domainsResponse) {
        this.domainsResponse = domainsResponse;
        return this;
    }
    
    public DomainListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}