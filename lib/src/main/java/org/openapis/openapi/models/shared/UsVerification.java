/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UsVerification {
    /**
     * Unique identifier prefixed with `us_ver_`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public UsVerification withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The intended recipient, typically a person's or firm's name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recipient")
    public String recipient;

    public UsVerification withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    
    /**
     * The primary delivery line (usually the street address) of the address.
     * Combination of the following applicable `components`:
     * * `primary_number`
     * * `street_predirection`
     * * `street_name`
     * * `street_suffix`
     * * `street_postdirection`
     * * `secondary_designator`
     * * `secondary_number`
     * * `pmb_designator`
     * * `pmb_number`
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary_line")
    public String primaryLine;

    public UsVerification withPrimaryLine(String primaryLine) {
        this.primaryLine = primaryLine;
        return this;
    }
    
    /**
     * The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secondary_line")
    public String secondaryLine;

    public UsVerification withSecondaryLine(String secondaryLine) {
        this.secondaryLine = secondaryLine;
        return this;
    }
    
    /**
     * Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or development within a city. See &lt;a href="https://pe.usps.com/text/pub28/28api_008.htm#:~:text=I51.,-4%20Urbanizations&amp;text=In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name." target="_blank"&gt;USPS documentation&lt;/a&gt; for clarification.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("urbanization")
    public String urbanization;

    public UsVerification withUrbanization(String urbanization) {
        this.urbanization = urbanization;
        return this;
    }
    
    /**
     * Combination of the following applicable `components`:
     * * City (`city`)
     * * State (`state`)
     * * ZIP code (`zip_code`)
     * * ZIP+4 (`zip_code_plus_4`)
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_line")
    public String lastLine;

    public UsVerification withLastLine(String lastLine) {
        this.lastLine = lastLine;
        return this;
    }
    
    /**
     * Summarizes the deliverability of the `us_verification` object.
     * For full details, see the `deliverability_analysis` field. Possible values are:
     * * `deliverable` – The address is deliverable by the USPS.
     * * `deliverable_unnecessary_unit` – The address is deliverable, but the secondary unit information is unnecessary.
     * * `deliverable_incorrect_unit` – The address is deliverable to the building's default address but the secondary unit provided may not exist. There is a chance the mail will not reach the intended recipient.
     * * `deliverable_missing_unit` – The address is deliverable to the building's default address but is missing secondary unit information. There is a chance the mail will not reach the intended recipient.
     * * `undeliverable` – The address is not deliverable according to the USPS.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deliverability")
    public UsVerificationDeliverability deliverability;

    public UsVerification withDeliverability(UsVerificationDeliverability deliverability) {
        this.deliverability = deliverability;
        return this;
    }
    
    /**
     * This field indicates whether an address was found in a more comprehensive address dataset that includes sources from the USPS, open source mapping data, and our proprietary mail delivery data.
     * This field can be interpreted as a representation of whether an address is a real location or not. Additionally a valid address may contradict the deliverability field since an address can be a real valid location but the USPS may not deliver to that address.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("valid_address")
    public Boolean validAddress;

    public UsVerification withValidAddress(Boolean validAddress) {
        this.validAddress = validAddress;
        return this;
    }
    
    /**
     * A nested object containing a breakdown of each component of an address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("components")
    public UsComponents components;

    public UsVerification withComponents(UsComponents components) {
        this.components = components;
        return this;
    }
    
    /**
     * A nested object containing a breakdown of the deliverability of an address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deliverability_analysis")
    public DeliverabilityAnalysis deliverabilityAnalysis;

    public UsVerification withDeliverabilityAnalysis(DeliverabilityAnalysis deliverabilityAnalysis) {
        this.deliverabilityAnalysis = deliverabilityAnalysis;
        return this;
    }
    
    /**
     * Lob Confidence Score is a nested object that provides a numerical value between 0-100 of the likelihood that an address is deliverable based on Lob’s mail delivery data to over half of US households.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lob_confidence_score")
    public LobConfidenceScore lobConfidenceScore;

    public UsVerification withLobConfidenceScore(LobConfidenceScore lobConfidenceScore) {
        this.lobConfidenceScore = lobConfidenceScore;
        return this;
    }
    
    /**
     * Value is resource type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public UsVerificationObject object;

    public UsVerification withObject(UsVerificationObject object) {
        this.object = object;
        return this;
    }
    
    public UsVerification(){}
}
