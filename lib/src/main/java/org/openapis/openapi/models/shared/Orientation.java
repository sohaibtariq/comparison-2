/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Orientation - The orientation of the card.
 */
public enum Orientation {
    HORIZONTAL("horizontal"),
    VERTICAL("vertical");

    @JsonValue
    public final String value;

    private Orientation(String value) {
        this.value = value;
    }
}
