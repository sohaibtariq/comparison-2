/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * TemplateVersionObject - Value is resource type.
 */
public enum TemplateVersionObject {
    VERSION("version");

    @JsonValue
    public final String value;

    private TemplateVersionObject(String value) {
        this.value = value;
    }
}
