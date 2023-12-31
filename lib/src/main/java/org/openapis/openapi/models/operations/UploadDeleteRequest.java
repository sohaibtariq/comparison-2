/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class UploadDeleteRequest {
    /**
     * id of the upload
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=upl_id")
    public String uplId;

    public UploadDeleteRequest withUplId(String uplId) {
        this.uplId = uplId;
        return this;
    }
    
    public UploadDeleteRequest(@JsonProperty("upl_id") String uplId) {
        this.uplId = uplId;
  }
}
