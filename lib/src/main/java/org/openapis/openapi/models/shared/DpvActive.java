/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DpvActive - Corresponds to the USPS field `dpv_no_stat`. Indicates that an address has been vacated in the recent past, and is no longer receiving deliveries. If it's been unoccupied for 90+ days, or temporarily vacant, this will be flagged. Possible values are:
 * * `Y` –– Address is active.
 * * `N` –– Address is not active.
 * * `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string).
 * 
 */
public enum DpvActive {
    Y("Y"),
    N("N"),
    UNKNOWN("");

    @JsonValue
    public final String value;

    private DpvActive(String value) {
        this.value = value;
    }
}
