/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateTemplateVersionResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public CreateTemplateVersionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public CreateTemplateVersionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public CreateTemplateVersionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Returns the template version with the given template and version ids.
     */
    
    public org.openapis.openapi.models.shared.TemplateVersion templateVersion;

    public CreateTemplateVersionResponse withTemplateVersion(org.openapis.openapi.models.shared.TemplateVersion templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public CreateTemplateVersionResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public CreateTemplateVersionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse, @JsonProperty("Headers") java.util.Map<String, String[]> headers) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.headers = headers;
  }
}
