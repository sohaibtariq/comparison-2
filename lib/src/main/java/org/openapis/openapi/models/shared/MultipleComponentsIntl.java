/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MultipleComponentsIntl {
    /**
     * The intended recipient, typically a person's or firm's name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recipient")
    public String recipient;

    public MultipleComponentsIntl withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    
    /**
     * The primary delivery line (usually the street address) of the address.
     * 
     */
    @JsonProperty("primary_line")
    public String primaryLine;

    public MultipleComponentsIntl withPrimaryLine(String primaryLine) {
        this.primaryLine = primaryLine;
        return this;
    }
    
    /**
     * The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secondary_line")
    public String secondaryLine;

    public MultipleComponentsIntl withSecondaryLine(String secondaryLine) {
        this.secondaryLine = secondaryLine;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;

    public MultipleComponentsIntl withCity(String city) {
        this.city = city;
        return this;
    }
    
    /**
     * The name of the state.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    public String state;

    public MultipleComponentsIntl withState(String state) {
        this.state = state;
        return this;
    }
    
    /**
     * The postal code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postal_code")
    public String postalCode;

    public MultipleComponentsIntl withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    
    /**
     * Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`, `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification API. Also does not accept `PS`, which is not currently supported.
     */
    @JsonProperty("country")
    public CountryExtended country;

    public MultipleComponentsIntl withCountry(CountryExtended country) {
        this.country = country;
        return this;
    }
    
    public MultipleComponentsIntl(@JsonProperty("primary_line") String primaryLine, @JsonProperty("country") CountryExtended country) {
        this.primaryLine = primaryLine;
        this.country = country;
  }
}
