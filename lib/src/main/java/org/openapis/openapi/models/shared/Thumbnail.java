/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Thumbnail {
    /**
     * A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("small")
    public String small;

    public Thumbnail withSmall(String small) {
        this.small = small;
        return this;
    }
    
    /**
     * A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("medium")
    public String medium;

    public Thumbnail withMedium(String medium) {
        this.medium = medium;
        return this;
    }
    
    /**
     * A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("large")
    public String large;

    public Thumbnail withLarge(String large) {
        this.large = large;
        return this;
    }
    
    public Thumbnail(){}
}
