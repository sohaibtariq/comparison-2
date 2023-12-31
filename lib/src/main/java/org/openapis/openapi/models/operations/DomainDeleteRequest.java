/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class DomainDeleteRequest {
    /**
     * Unique identifier for a domain.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=domain_id")
    public String domainId;

    public DomainDeleteRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    
    public DomainDeleteRequest(@JsonProperty("domain_id") String domainId) {
        this.domainId = domainId;
  }
}
