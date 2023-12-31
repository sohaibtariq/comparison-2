/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UploadCreateExport {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public UploadCreateExportMessage message;

    public UploadCreateExport withMessage(UploadCreateExportMessage message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("exportId")
    public String exportId;

    public UploadCreateExport withExportId(String exportId) {
        this.exportId = exportId;
        return this;
    }
    
    public UploadCreateExport(@JsonProperty("exportId") String exportId) {
        this.exportId = exportId;
  }
}
