/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Addresses {
    /**
     * A nested object containing a breakdown of each component of a reverse geocoded response.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("components")
    public Components components;

    public Addresses withComponents(Components components) {
        this.components = components;
        return this;
    }
    
    /**
     * A nested object containing a breakdown of the analysis of a reverse geocoded location.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_analysis")
    public LocationAnalysis locationAnalysis;

    public Addresses withLocationAnalysis(LocationAnalysis locationAnalysis) {
        this.locationAnalysis = locationAnalysis;
        return this;
    }
    
    public Addresses(){}
}
