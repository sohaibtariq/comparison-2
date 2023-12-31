/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class IntlAutocompletionsWritable {
    /**
     * Only accepts numbers and street names in an alphanumeric format.
     * 
     */
    @JsonProperty("address_prefix")
    @SpeakeasyMetadata("form:name=address_prefix multipartForm:name=address_prefix")
    public String addressPrefix;

    public IntlAutocompletionsWritable withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }
    
    /**
     * An optional city input used to filter suggestions. Case insensitive and does not match partial abbreviations.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    @SpeakeasyMetadata("form:name=city multipartForm:name=city")
    public String city;

    public IntlAutocompletionsWritable withCity(String city) {
        this.city = city;
        return this;
    }
    
    /**
     * An optional state input used to filter suggestions. Case insensitive and does not match partial abbreviations.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    @SpeakeasyMetadata("form:name=state multipartForm:name=state")
    public String state;

    public IntlAutocompletionsWritable withState(String state) {
        this.state = state;
        return this;
    }
    
    /**
     * An optional Zip Code input used to filter suggestions. Matches partial entries.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("zip_code")
    @SpeakeasyMetadata("form:name=zip_code multipartForm:name=zip_code")
    public String zipCode;

    public IntlAutocompletionsWritable withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    
    /**
     * Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`, `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification API. Also does not accept `PS`, which is not currently supported.
     */
    @JsonProperty("country")
    @SpeakeasyMetadata("form:name=country multipartForm:name=country")
    public CountryExtended country;

    public IntlAutocompletionsWritable withCountry(CountryExtended country) {
        this.country = country;
        return this;
    }
    
    /**
     * If `true`, sort suggestions by proximity to the IP set in the `X-Forwarded-For` header.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("geo_ip_sort")
    @SpeakeasyMetadata("form:name=geo_ip_sort multipartForm:name=geo_ip_sort")
    public Boolean geoIpSort;

    public IntlAutocompletionsWritable withGeoIpSort(Boolean geoIpSort) {
        this.geoIpSort = geoIpSort;
        return this;
    }
    
    public IntlAutocompletionsWritable(@JsonProperty("address_prefix") String addressPrefix, @JsonProperty("country") CountryExtended country) {
        this.addressPrefix = addressPrefix;
        this.country = country;
  }
}
