/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Message {
    FILE_UPLOADED_SUCCESSFULLY("File uploaded successfully");

    @JsonValue
    public final String value;

    private Message(String value) {
        this.value = value;
    }
}
