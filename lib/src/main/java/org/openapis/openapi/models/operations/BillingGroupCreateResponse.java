/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class BillingGroupCreateResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public BillingGroupCreateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public BillingGroupCreateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public BillingGroupCreateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Returns a billing group object
     */
    
    public org.openapis.openapi.models.shared.BillingGroup billingGroup;

    public BillingGroupCreateResponse withBillingGroup(org.openapis.openapi.models.shared.BillingGroup billingGroup) {
        this.billingGroup = billingGroup;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public BillingGroupCreateResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public BillingGroupCreateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse, @JsonProperty("Headers") java.util.Map<String, String[]> headers) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.headers = headers;
  }
}
