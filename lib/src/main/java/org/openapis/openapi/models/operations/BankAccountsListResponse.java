/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class BankAccountsListResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public BankAccountsListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public BankAccountsListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public BankAccountsListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A dictionary with a data property that contains an array of up to `limit` bank_accounts. Each entry in the array is a separate bank_account. The previous and next page of bank_accounts can be retrieved by calling the endpoint contained in the `previous_url` and `next_url` fields in the API response respectively.&lt;br&gt;If no more bank_accounts are available beyond the current set of returned results, the `next_url` field will be empty.
     */
    
    public BankAccountsListResponseBody object;

    public BankAccountsListResponse withObject(BankAccountsListResponseBody object) {
        this.object = object;
        return this;
    }
    
    public BankAccountsListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
