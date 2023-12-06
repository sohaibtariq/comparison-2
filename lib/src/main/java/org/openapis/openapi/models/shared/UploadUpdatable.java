/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UploadUpdatable {
    /**
     * Original filename provided when the upload is created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("originalFilename")
    public String originalFilename;

    public UploadUpdatable withOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
        return this;
    }
    
    /**
     * The mapping of column headers in your file to Lob-required fields for the resource created. See our &lt;a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#required-columns-2" target="_blank"&gt;Campaign Audience Guide&lt;/a&gt; for additional details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requiredAddressColumnMapping")
    public RequiredAddressColumnMapping requiredAddressColumnMapping;

    public UploadUpdatable withRequiredAddressColumnMapping(RequiredAddressColumnMapping requiredAddressColumnMapping) {
        this.requiredAddressColumnMapping = requiredAddressColumnMapping;
        return this;
    }
    
    /**
     * The mapping of column headers in your file to Lob-optional fields for the resource created. See our &lt;a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#optional-columns-3" target="_blank"&gt;Campaign Audience Guide&lt;/a&gt; for additional details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optionalAddressColumnMapping")
    public OptionalAddressColumnMapping optionalAddressColumnMapping;

    public UploadUpdatable withOptionalAddressColumnMapping(OptionalAddressColumnMapping optionalAddressColumnMapping) {
        this.optionalAddressColumnMapping = optionalAddressColumnMapping;
        return this;
    }
    
    /**
     * The list of column headers in your file as an array that you want as metadata associated with each mailpiece. See our &lt;a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#required-columns-2" target="_blank"&gt;Campaign Audience Guide&lt;/a&gt; for additional details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public UploadsMetadata metadata;

    public UploadUpdatable withMetadata(UploadsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * The mapping of column headers in your file to the merge variables present in your creative. See our &lt;a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7" target="_blank"&gt;Campaign Audience Guide&lt;/a&gt; for additional details. &lt;br /&gt;If a merge variable has the same "name" as a "key" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects. If using customized QR code redirect from the Audience file, then a `qr_code_redirect_url` must be mapped to the column header as used in the CSV.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mergeVariableColumnMapping")
    public MergeVariableColumnMapping mergeVariableColumnMapping;

    public UploadUpdatable withMergeVariableColumnMapping(MergeVariableColumnMapping mergeVariableColumnMapping) {
        this.mergeVariableColumnMapping = mergeVariableColumnMapping;
        return this;
    }
    
    public UploadUpdatable(){}
}
