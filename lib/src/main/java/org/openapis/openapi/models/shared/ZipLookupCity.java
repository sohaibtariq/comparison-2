/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ZipLookupCity {
    @JsonProperty("city")
    public String city;

    public ZipLookupCity withCity(String city) {
        this.city = city;
        return this;
    }
    
    /**
     * The &lt;a href="https://en.wikipedia.org/wiki/ISO_3166-2" target="_blank"&gt;ISO 3166-2&lt;/a&gt; two letter code for the state.
     * 
     */
    @JsonProperty("state")
    public String state;

    public ZipLookupCity withState(String state) {
        this.state = state;
        return this;
    }
    
    /**
     * County name of the address city.
     */
    @JsonProperty("county")
    public String county;

    public ZipLookupCity withCounty(String county) {
        this.county = county;
        return this;
    }
    
    /**
     * A 5-digit &lt;a href="https://en.wikipedia.org/wiki/FIPS_county_code" target="_blank"&gt;FIPS county code&lt;/a&gt; which uniquely identifies `components[county]`. It consists of a 2-digit state code and a 3-digit county code.
     * 
     */
    @JsonProperty("county_fips")
    public String countyFips;

    public ZipLookupCity withCountyFips(String countyFips) {
        this.countyFips = countyFips;
        return this;
    }
    
    /**
     * Indicates whether or not the city is the &lt;a href="https://en.wikipedia.org/wiki/ZIP_Code#ZIP_Codes_and_previous_zoning_lines" target="_blank"&gt;USPS default city&lt;/a&gt; (preferred city) of a ZIP code. There is only one preferred city per ZIP code, which will always be in position 0 in the array of cities.
     * 
     */
    @JsonProperty("preferred")
    public Boolean preferred;

    public ZipLookupCity withPreferred(Boolean preferred) {
        this.preferred = preferred;
        return this;
    }
    
    public ZipLookupCity(@JsonProperty("city") String city, @JsonProperty("state") String state, @JsonProperty("county") String county, @JsonProperty("county_fips") String countyFips, @JsonProperty("preferred") Boolean preferred) {
        this.city = city;
        this.state = state;
        this.county = county;
        this.countyFips = countyFips;
        this.preferred = preferred;
  }
}