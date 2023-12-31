/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;


public class Check {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public Object from;

    public Check withFrom(Object from) {
        this.from = from;
        return this;
    }
    
    /**
     * Unique identifier prefixed with `chk_`.
     */
    @JsonProperty("id")
    public String id;

    public Check withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The payment amount to be sent in US dollars.
     */
    @JsonProperty("amount")
    public Float amount;

    public Check withAmount(Float amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonProperty("bank_account")
    public BankAccount bankAccount;

    public Check withBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_bottom_template_id")
    public String checkBottomTemplateId;

    public Check withCheckBottomTemplateId(String checkBottomTemplateId) {
        this.checkBottomTemplateId = checkBottomTemplateId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachment_template_id")
    public String attachmentTemplateId;

    public Check withAttachmentTemplateId(String attachmentTemplateId) {
        this.attachmentTemplateId = attachmentTemplateId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_bottom_template_version_id")
    public String checkBottomTemplateVersionId;

    public Check withCheckBottomTemplateVersionId(String checkBottomTemplateVersionId) {
        this.checkBottomTemplateVersionId = checkBottomTemplateVersionId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachment_template_version_id")
    public String attachmentTemplateVersionId;

    public Check withAttachmentTemplateVersionId(String attachmentTemplateVersionId) {
        this.attachmentTemplateVersionId = attachmentTemplateVersionId;
        return this;
    }
    
    /**
     * A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.
     */
    @JsonProperty("url")
    public String url;

    public Check withUrl(String url) {
        this.url = url;
        return this;
    }
    
    @JsonProperty("to")
    public Object to;

    public Check withTo(Object to) {
        this.to = to;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("carrier")
    public Carrier carrier;

    public Check withCarrier(Carrier carrier) {
        this.carrier = carrier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumbnails")
    public Thumbnail[] thumbnails;

    public Check withThumbnails(Thumbnail[] thumbnails) {
        this.thumbnails = thumbnails;
        return this;
    }
    
    /**
     * A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("expected_delivery_date")
    public LocalDate expectedDeliveryDate;

    public Check withExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
        return this;
    }
    
    /**
     * An array of tracking_event objects ordered by ascending `time`. Will not be populated for checks created in test mode.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_events")
    public TrackingEventNormal[] trackingEvents;

    public Check withTrackingEvents(TrackingEventNormal[] trackingEvents) {
        this.trackingEvents = trackingEvents;
        return this;
    }
    
    /**
     * TThe use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type).
     */
    @JsonProperty("use_type")
    public ChkUseType useType;

    public Check withUseType(ChkUseType useType) {
        this.useType = useType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public TheStatusOfTheCheck status;

    public Check withStatus(TheStatusOfTheCheck status) {
        this.status = status;
        return this;
    }
    
    /**
     * A string describing the reason for failure if the check failed to render.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failure_reason")
    public String failureReason;

    public Check withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }
    
    /**
     * Value is resource type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public CheckObject object;

    public Check withObject(CheckObject object) {
        this.object = object;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_created")
    public OffsetDateTime dateCreated;

    public Check withDateCreated(OffsetDateTime dateCreated) {
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

    public Check withDateModified(OffsetDateTime dateModified) {
        this.dateModified = dateModified;
        return this;
    }
    
    /**
     * Only returned if the resource has been successfully deleted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public Boolean deleted;

    public Check withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    /**
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public Check withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public Check withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&amp;`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `@`, `[`, `\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in &lt;a href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10" target="_blank"&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;Merge Variable strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merge_variables")
    public MergeVariables mergeVariables;

    public Check withMergeVariables(MergeVariables mergeVariables) {
        this.mergeVariables = mergeVariables;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("send_date")
    public Object sendDate;

    public Check withSendDate(Object sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    
    /**
     * Checks must be sent `usps_first_class`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mail_type")
    public CheckMailType mailType;

    public Check withMailType(CheckMailType mailType) {
        this.mailType = mailType;
        return this;
    }
    
    /**
     * Text to include on the memo line of the check.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memo")
    public String memo;

    public Check withMemo(String memo) {
        this.memo = memo;
        return this;
    }
    
    /**
     * An integer that designates the check number.
     * If `check_number` is not provided, checks created from a new `bank_account` will start at `10000` and increment with each check created with the `bank_account`.
     * A provided `check_number` overrides the defaults. Subsequent checks created with the same `bank_account` will increment from the provided check number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_number")
    public Long checkNumber;

    public Check withCheckNumber(Long checkNumber) {
        this.checkNumber = checkNumber;
        return this;
    }
    
    /**
     * Max of 400 characters to be included at the bottom of the check page.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public Check withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public Check(@JsonProperty("id") String id, @JsonProperty("amount") Float amount, @JsonProperty("bank_account") BankAccount bankAccount, @JsonProperty("url") String url, @JsonProperty("to") Object to, @JsonProperty("use_type") ChkUseType useType, @JsonProperty("date_created") OffsetDateTime dateCreated, @JsonProperty("date_modified") OffsetDateTime dateModified) {
        this.id = id;
        this.amount = amount;
        this.bankAccount = bankAccount;
        this.url = url;
        this.to = to;
        this.useType = useType;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
  }
}
