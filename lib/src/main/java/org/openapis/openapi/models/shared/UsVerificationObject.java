/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UsVerificationObject - Value is resource type.
 */
public enum UsVerificationObject {
    US_VERIFICATION("us_verification");

    @JsonValue
    public final String value;

    private UsVerificationObject(String value) {
        this.value = value;
    }
}
