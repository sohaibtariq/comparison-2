/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CheckMailType - Checks must be sent `usps_first_class`
 */
public enum CheckMailType {
    USPS_FIRST_CLASS("usps_first_class");

    @JsonValue
    public final String value;

    private CheckMailType(String value) {
        this.value = value;
    }
}
