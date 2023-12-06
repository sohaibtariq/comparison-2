/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class Domains {
    /**
     * The registered domain/hostname.
     */
    @JsonProperty("domain")
    @SpeakeasyMetadata("form:name=domain multipartForm:name=domain")
    public String domain;

    public Domains withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    public Domains(@JsonProperty("domain") String domain) {
        this.domain = domain;
  }
}