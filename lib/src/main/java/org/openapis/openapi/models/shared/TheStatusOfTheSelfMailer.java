/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TheStatusOfTheSelfMailer {
    PROCESSED("processed"),
    RENDERED("rendered"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private TheStatusOfTheSelfMailer(String value) {
        this.value = value;
    }
}
