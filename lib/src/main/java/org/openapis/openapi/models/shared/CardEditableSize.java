/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CardEditableSize - The size of the card
 */
public enum CardEditableSize {
    THREE375X2125("3.375x2.125"),
    TWO125X3375("2.125x3.375");

    @JsonValue
    public final String value;

    private CardEditableSize(String value) {
        this.value = value;
    }
}
