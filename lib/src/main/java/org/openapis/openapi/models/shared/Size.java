/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Size - The size of the buckslip
 */
public enum Size {
    EIGHT75X375("8.75x3.75");

    @JsonValue
    public final String value;

    private Size(String value) {
        this.value = value;
    }
}
