/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * BuckslipEditableSize - The size of the buckslip
 */
public enum BuckslipEditableSize {
    EIGHT75X375("8.75x3.75");

    @JsonValue
    public final String value;

    private BuckslipEditableSize(String value) {
        this.value = value;
    }
}
