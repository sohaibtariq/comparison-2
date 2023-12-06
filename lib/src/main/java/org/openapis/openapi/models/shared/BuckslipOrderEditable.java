/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class BuckslipOrderEditable {
    /**
     * The quantity of buckslips in the order (minimum 5,000).
     */
    @JsonProperty("quantity")
    @SpeakeasyMetadata("form:name=quantity multipartForm:name=quantity")
    public Long quantity;

    public BuckslipOrderEditable withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public BuckslipOrderEditable(@JsonProperty("quantity") Long quantity) {
        this.quantity = quantity;
  }
}
