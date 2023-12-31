/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;


public class PostcardsListRequest {
    /**
     * How many results to return.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public PostcardsListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * `before` and `after` are both optional but only one of them can be in the query at a time.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=before/after")
    public Object beforeAfter;

    public PostcardsListRequest withBeforeAfter(Object beforeAfter) {
        this.beforeAfter = beforeAfter;
        return this;
    }
    
    /**
     * Request that the response include the total count by specifying `include=["total_count"]`.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    public String[] include;

    public PostcardsListRequest withInclude(String[] include) {
        this.include = include;
        return this;
    }
    
    /**
     * Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=date_created")
    public java.util.Map<String, String> dateCreated;

    public PostcardsListRequest withDateCreated(java.util.Map<String, String> dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * Filter by metadata key-value pair`.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, String> metadata;

    public PostcardsListRequest withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=size")
    public org.openapis.openapi.models.shared.PostcardSize[] size;

    public PostcardsListRequest withSize(org.openapis.openapi.models.shared.PostcardSize[] size) {
        this.size = size;
        return this;
    }
    
    /**
     * * `true` - only return orders (past or future) where `send_date` is
     * greater than `date_created`
     * * `false` - only return orders where `send_date` is equal to `date_created`
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=scheduled")
    public Boolean scheduled;

    public PostcardsListRequest withScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
        return this;
    }
    
    /**
     * Filter by ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=send_date")
    public Object sendDate;

    public PostcardsListRequest withSendDate(Object sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    
    /**
     * A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a &lt;a href="https://lob.com/pricing/print-mail#compare" target="_blank"&gt;cheaper option&lt;/a&gt; which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mail_type")
    public org.openapis.openapi.models.shared.MailType mailType;

    public PostcardsListRequest withMailType(org.openapis.openapi.models.shared.MailType mailType) {
        this.mailType = mailType;
        return this;
    }
    
    /**
     * Sorts items by ascending or descending dates. Use either `date_created` or `send_date`, not both.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort_by")
    public Object sortBy;

    public PostcardsListRequest withSortBy(Object sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    
    public PostcardsListRequest(){}
}
