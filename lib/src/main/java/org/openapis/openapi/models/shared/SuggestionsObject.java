/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SuggestionsObject - Value is resource type.
 */
public enum SuggestionsObject {
    US_AUTOCOMPLETION("us_autocompletion");

    @JsonValue
    public final String value;

    private SuggestionsObject(String value) {
        this.value = value;
    }
}
