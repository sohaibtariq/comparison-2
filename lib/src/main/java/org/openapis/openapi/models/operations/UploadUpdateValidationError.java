/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UploadUpdateValidationError {
    @JsonProperty("loc")
    public Object[] loc;

    public UploadUpdateValidationError withLoc(Object[] loc) {
        this.loc = loc;
        return this;
    }
    
    @JsonProperty("msg")
    public String msg;

    public UploadUpdateValidationError withMsg(String msg) {
        this.msg = msg;
        return this;
    }
    
    @JsonProperty("type")
    public String type;

    public UploadUpdateValidationError withType(String type) {
        this.type = type;
        return this;
    }
    
    public UploadUpdateValidationError(@JsonProperty("loc") Object[] loc, @JsonProperty("msg") String msg, @JsonProperty("type") String type) {
        this.loc = loc;
        this.msg = msg;
        this.type = type;
  }
}
