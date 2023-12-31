/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;


public class BillingGroupsListRequest {
    /**
     * How many results to return.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public BillingGroupsListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * An integer that designates the offset at which to begin returning results. Defaults to 0.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;

    public BillingGroupsListRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * Request that the response include the total count by specifying `include=["total_count"]`.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    public String[] include;

    public BillingGroupsListRequest withInclude(String[] include) {
        this.include = include;
        return this;
    }
    
    /**
     * Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=date_created")
    public java.util.Map<String, String> dateCreated;

    public BillingGroupsListRequest withDateCreated(java.util.Map<String, String> dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * Filter by date modified. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=date_modified")
    public java.util.Map<String, String> dateModified;

    public BillingGroupsListRequest withDateModified(java.util.Map<String, String> dateModified) {
        this.dateModified = dateModified;
        return this;
    }
    
    /**
     * Sorts items by ascending or descending dates. Use either `date_created` or `date_modified`, not both.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort_by")
    public Object sortBy;

    public BillingGroupsListRequest withSortBy(Object sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    
    public BillingGroupsListRequest(){}
}
