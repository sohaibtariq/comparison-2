/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class TemplateVersionUpdateResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public TemplateVersionUpdateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public TemplateVersionUpdateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public TemplateVersionUpdateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Returns the template version with the given template and version ids.
     */
    
    public org.openapis.openapi.models.shared.TemplateVersion templateVersion;

    public TemplateVersionUpdateResponse withTemplateVersion(org.openapis.openapi.models.shared.TemplateVersion templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public TemplateVersionUpdateResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public TemplateVersionUpdateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse, @JsonProperty("Headers") java.util.Map<String, String[]> headers) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.headers = headers;
  }
}