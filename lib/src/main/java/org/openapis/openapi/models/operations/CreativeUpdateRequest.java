/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class CreativeUpdateRequest {
    /**
     * id of the creative
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=crv_id")
    public String crvId;

    public CreativeUpdateRequest withCrvId(String crvId) {
        this.crvId = crvId;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public org.openapis.openapi.models.shared.CreativeBase creativeBase;

    public CreativeUpdateRequest withCreativeBase(org.openapis.openapi.models.shared.CreativeBase creativeBase) {
        this.creativeBase = creativeBase;
        return this;
    }
    
    public CreativeUpdateRequest(@JsonProperty("crv_id") String crvId, @JsonProperty("creative_base") org.openapis.openapi.models.shared.CreativeBase creativeBase) {
        this.crvId = crvId;
        this.creativeBase = creativeBase;
  }
}
