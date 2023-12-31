/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ChecksListResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public ChecksListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public ChecksListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public ChecksListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A dictionary with a data property that contains an array of up to `limit` checks. Each entry in the array is a separate check. The previous and next page of checks can be retrieved by calling the endpoint contained in the `previous_url` and `next_url` fields in the API response respectively.&lt;br&gt;If no more checks are available beyond the current set of returned results, the `next_url` field will be empty.
     */
    
    public ChecksListResponseBody object;

    public ChecksListResponse withObject(ChecksListResponseBody object) {
        this.object = object;
        return this;
    }
    
    public ChecksListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
