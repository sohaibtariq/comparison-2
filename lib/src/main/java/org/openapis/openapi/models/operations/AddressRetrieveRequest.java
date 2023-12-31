/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class AddressRetrieveRequest {
    /**
     * id of the address
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=adr_id")
    public String adrId;

    public AddressRetrieveRequest withAdrId(String adrId) {
        this.adrId = adrId;
        return this;
    }
    
    public AddressRetrieveRequest(@JsonProperty("adr_id") String adrId) {
        this.adrId = adrId;
  }
}
