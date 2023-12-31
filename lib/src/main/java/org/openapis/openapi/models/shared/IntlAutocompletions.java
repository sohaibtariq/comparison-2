/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IntlAutocompletions {
    /**
     * Unique identifier prefixed with `intl_auto_`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public IntlAutocompletions withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * An array of objects representing suggested addresses.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suggestions")
    public IntlSuggestions[] suggestions;

    public IntlAutocompletions withSuggestions(IntlSuggestions[] suggestions) {
        this.suggestions = suggestions;
        return this;
    }
    
    public IntlAutocompletions(){}
}
