/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class CardUpdatable {
    /**
     * Description of the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    @SpeakeasyMetadata("form:name=description multipartForm:name=description")
    public String description;

    public CardUpdatable withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Allows for auto reordering
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auto_reorder")
    @SpeakeasyMetadata("form:name=auto_reorder multipartForm:name=auto_reorder")
    public Boolean autoReorder;

    public CardUpdatable withAutoReorder(Boolean autoReorder) {
        this.autoReorder = autoReorder;
        return this;
    }
    
    /**
     * The quantity of items to be reordered (only required when auto_reorder is true).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reorder_quantity")
    @SpeakeasyMetadata("form:name=reorder_quantity multipartForm:name=reorder_quantity")
    public Double reorderQuantity;

    public CardUpdatable withReorderQuantity(Double reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
        return this;
    }
    
    public CardUpdatable(){}
}
