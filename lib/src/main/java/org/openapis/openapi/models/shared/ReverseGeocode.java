/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReverseGeocode {
    /**
     * Unique identifier prefixed with `us_reverse_geocode_`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public ReverseGeocode withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * list of addresses
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    public Addresses[] addresses;

    public ReverseGeocode withAddresses(Addresses[] addresses) {
        this.addresses = addresses;
        return this;
    }
    
    /**
     * Value is resource type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public ReverseGeocodeObject object;

    public ReverseGeocode withObject(ReverseGeocodeObject object) {
        this.object = object;
        return this;
    }
    
    public ReverseGeocode(){}
}
