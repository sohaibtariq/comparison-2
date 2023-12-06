/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class UploadFileRequest {
    /**
     * ID of the upload
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=upl_id")
    public String uplId;

    public UploadFileRequest withUplId(String uplId) {
        this.uplId = uplId;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public UploadFileRequestBody requestBody;

    public UploadFileRequest withRequestBody(UploadFileRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    public UploadFileRequest(@JsonProperty("upl_id") String uplId, @JsonProperty("RequestBody") UploadFileRequestBody requestBody) {
        this.uplId = uplId;
        this.requestBody = requestBody;
  }
}
