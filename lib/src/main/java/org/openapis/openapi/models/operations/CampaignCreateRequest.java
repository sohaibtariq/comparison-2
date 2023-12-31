/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class CampaignCreateRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public org.openapis.openapi.models.shared.CampaignWritable campaignWritable;

    public CampaignCreateRequest withCampaignWritable(org.openapis.openapi.models.shared.CampaignWritable campaignWritable) {
        this.campaignWritable = campaignWritable;
        return this;
    }
    
    /**
     * * `native` - Translate response to the native language of the country in the request
     * * `match` - match the response to the language in the request
     * 
     * Default response is in English.
     * 
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-lang-output")
    public org.openapis.openapi.models.shared.LangSpec xLangOutput;

    public CampaignCreateRequest withXLangOutput(org.openapis.openapi.models.shared.LangSpec xLangOutput) {
        this.xLangOutput = xLangOutput;
        return this;
    }
    
    public CampaignCreateRequest(@JsonProperty("campaign_writable") org.openapis.openapi.models.shared.CampaignWritable campaignWritable) {
        this.campaignWritable = campaignWritable;
  }
}
