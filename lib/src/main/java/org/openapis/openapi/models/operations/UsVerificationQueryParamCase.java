/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UsVerificationQueryParamCase - Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.
 */
public enum UsVerificationQueryParamCase {
    UPPER("upper"),
    PROPER("proper");

    @JsonValue
    public final String value;

    private UsVerificationQueryParamCase(String value) {
        this.value = value;
    }
}
