/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class BillingGroupUpdateRequest {
    /**
     * id of the billing_group
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bg_id")
    public String bgId;

    public BillingGroupUpdateRequest withBgId(String bgId) {
        this.bgId = bgId;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public org.openapis.openapi.models.shared.BillingGroupBase billingGroupBase;

    public BillingGroupUpdateRequest withBillingGroupBase(org.openapis.openapi.models.shared.BillingGroupBase billingGroupBase) {
        this.billingGroupBase = billingGroupBase;
        return this;
    }
    
    public BillingGroupUpdateRequest(@JsonProperty("bg_id") String bgId, @JsonProperty("billing_group_base") org.openapis.openapi.models.shared.BillingGroupBase billingGroupBase) {
        this.bgId = bgId;
        this.billingGroupBase = billingGroupBase;
  }
}
