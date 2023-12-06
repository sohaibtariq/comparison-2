/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;

/**
 * TrackingEventNormal - As mail pieces travel through the mail stream, USPS scans their unique barcodes, and Lob processes these mail scans to generate tracking events.
 */

public class TrackingEventNormal {
    /**
     * Unique identifier prefixed with `evnt_`.
     */
    @JsonProperty("id")
    public String id;

    public TrackingEventNormal withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date USPS registered the event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("time")
    public OffsetDateTime time;

    public TrackingEventNormal withTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_created")
    public OffsetDateTime dateCreated;

    public TrackingEventNormal withDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_modified")
    public OffsetDateTime dateModified;

    public TrackingEventNormal withDateModified(OffsetDateTime dateModified) {
        this.dateModified = dateModified;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public TrackingEventNormalObject object;

    public TrackingEventNormal withObject(TrackingEventNormalObject object) {
        this.object = object;
        return this;
    }
    
    /**
     * non-Certified postcards, self mailers, letters, and checks
     */
    @JsonProperty("type")
    public Type type;

    public TrackingEventNormal withType(Type type) {
        this.type = type;
        return this;
    }
    
    /**
     * Name of tracking event (for normal postcards, self mailers, letters, and checks):
     * 
     *   * `Mailed` - The mailpiece has been handed off to and accepted by USPS
     *     and is en route. &lt;a href="https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4" target="_blank"&gt;More about
     *     Mailed.&lt;/a&gt;
     *     Note this data is only available in Enterprise editions of
     *     Lob. &lt;a href="https://lob.com/support/contact#contact" target="_blank"&gt;Contact Sales&lt;/a&gt; if
     *     you want access to this feature.
     * 
     *   * `In Transit` - The mailpiece is being processed at the entry/origin facility.
     * 
     *   * `In Local Area` - The mailpiece is being processed at the destination facility.
     * 
     *   * `Processed for Delivery` - The mailpiece has been greenlit for
     *     delivery at the recipient's nearest postal facility. The mailpiece
     *     should reach the mailbox within 1 business day of this tracking
     *     event.
     * 
     *   * `Delivered` - The mail piece has been delivered to 
     *     the recipient’s address. The final scan is generated when the mail 
     *     carrier's GPS unit leaves the delivery area.
     * 
     *   * `Re-Routed` - The mailpiece is re-routed due to recipient change of
     *     address, address errors, or USPS relabeling of barcode/ID tag
     *     area.
     * 
     *   * `Returned to Sender` - The mailpiece is being returned to sender due
     *     to barcode, ID tag area, or address errors.
     *   
     *   * `International Exit` - The mail piece has been processed to 
     *     ship to a destination abroad. This is typically the last 
     *     scan a US-originated international mail piece will receive 
     *     from the USPS.
     * 
     * &lt;a href="https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4" target="_blank"&gt;More about tracking&lt;/a&gt;
     * 
     */
    @JsonProperty("name")
    public Name name;

    public TrackingEventNormal withName(Name name) {
        this.name = name;
        return this;
    }
    
    /**
     * Will be `null` for `type=normal` events
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public Details details;

    public TrackingEventNormal withDetails(Details details) {
        this.details = details;
        return this;
    }
    
    /**
     * The zip code in which the scan event occurred. Null for `Mailed` events.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    public String location;

    public TrackingEventNormal withLocation(String location) {
        this.location = location;
        return this;
    }
    
    public TrackingEventNormal(@JsonProperty("id") String id, @JsonProperty("date_created") OffsetDateTime dateCreated, @JsonProperty("date_modified") OffsetDateTime dateModified, @JsonProperty("type") Type type, @JsonProperty("name") Name name) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.type = type;
        this.name = name;
  }
}