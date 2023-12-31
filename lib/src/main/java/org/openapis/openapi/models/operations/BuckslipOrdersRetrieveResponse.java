/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class BuckslipOrdersRetrieveResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public BuckslipOrdersRetrieveResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public BuckslipOrdersRetrieveResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public BuckslipOrdersRetrieveResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Returns the buckslip orders associated with the given buckslip id
     */
    
    public BuckslipOrdersRetrieveResponseBody object;

    public BuckslipOrdersRetrieveResponse withObject(BuckslipOrdersRetrieveResponseBody object) {
        this.object = object;
        return this;
    }
    
    public BuckslipOrdersRetrieveResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
