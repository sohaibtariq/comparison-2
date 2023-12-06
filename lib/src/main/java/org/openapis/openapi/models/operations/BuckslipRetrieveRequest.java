/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class BuckslipRetrieveRequest {
    /**
     * id of the buckslip
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buckslip_id")
    public String buckslipId;

    public BuckslipRetrieveRequest withBuckslipId(String buckslipId) {
        this.buckslipId = buckslipId;
        return this;
    }
    
    public BuckslipRetrieveRequest(@JsonProperty("buckslip_id") String buckslipId) {
        this.buckslipId = buckslipId;
  }
}
