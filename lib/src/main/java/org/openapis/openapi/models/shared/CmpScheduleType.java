/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CmpScheduleType - How the campaign should be scheduled. Only value available today is `immediate`.
 */
public enum CmpScheduleType {
    IMMEDIATE("immediate");

    @JsonValue
    public final String value;

    private CmpScheduleType(String value) {
        this.value = value;
    }
}
