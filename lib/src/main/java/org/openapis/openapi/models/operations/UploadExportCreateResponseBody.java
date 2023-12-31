/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UploadExportCreateResponseBody - Create Export Error
 */

public class UploadExportCreateResponseBody {
    /**
     * A conventional HTTP status code
     */
    @JsonProperty("code")
    public Double code;

    public UploadExportCreateResponseBody withCode(Double code) {
        this.code = code;
        return this;
    }
    
    /**
     * A human-readable message with more details about the error
     */
    @JsonProperty("message")
    public String message;

    public UploadExportCreateResponseBody withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * An array of pre-defined strings that identify an error
     */
    @JsonProperty("errors")
    public String[] errors;

    public UploadExportCreateResponseBody withErrors(String[] errors) {
        this.errors = errors;
        return this;
    }
    
    public UploadExportCreateResponseBody(@JsonProperty("code") Double code, @JsonProperty("message") String message, @JsonProperty("errors") String[] errors) {
        this.code = code;
        this.message = message;
        this.errors = errors;
  }
}
