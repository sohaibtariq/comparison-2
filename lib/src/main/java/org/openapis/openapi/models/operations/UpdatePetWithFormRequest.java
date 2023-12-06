/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class UpdatePetWithFormRequest {
    /**
     * ID of pet that needs to be updated
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=petId")
    public Long petId;

    public UpdatePetWithFormRequest withPetId(Long petId) {
        this.petId = petId;
        return this;
    }
    
    /**
     * Name of pet that needs to be updated
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=name")
    public String name;

    public UpdatePetWithFormRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Status of pet that needs to be updated
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    public String status;

    public UpdatePetWithFormRequest withStatus(String status) {
        this.status = status;
        return this;
    }
    
    public UpdatePetWithFormRequest(@JsonProperty("petId") Long petId) {
        this.petId = petId;
  }
}
