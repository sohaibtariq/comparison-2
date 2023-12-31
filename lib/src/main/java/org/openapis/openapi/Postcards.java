/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;

/**
 * The postcards endpoint allows you to easily print and mail postcards. The API provides endpoints for creating postcards,
 * retrieving individual postcards, canceling postcards, and retrieving a list of postcards.
 * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
 * 
 */
public class Postcards {
	
	private SDKConfiguration sdkConfiguration;

	public Postcards(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Cancel
     * Completely removes a postcard from production. This can only be done if the postcard has a `send_date` and the `send_date` has not yet passed. If the postcard is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.
     * @param pscId id of the postcard
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PostcardDeleteResponse postcardDelete(String pscId) throws Exception {
        org.openapis.openapi.models.operations.PostcardDeleteRequest request = new org.openapis.openapi.models.operations.PostcardDeleteRequest(pscId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.PostcardDeleteRequest.class, baseUrl, "/postcards/{psc_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.PostcardDeleteResponse res = new org.openapis.openapi.models.operations.PostcardDeleteResponse(contentType, httpRes.statusCode(), httpRes) {{
            postcardDeletion = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.PostcardDeletion out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.PostcardDeletion.class);
                res.postcardDeletion = out;
            }
        }

        return res;
    }

    /**
     * Retrieve
     * Retrieves the details of an existing postcard. You need only supply the unique customer identifier that was returned upon postcard creation.
     * @param pscId id of the postcard
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PostcardRetrieveResponse postcardRetrieve(String pscId) throws Exception {
        org.openapis.openapi.models.operations.PostcardRetrieveRequest request = new org.openapis.openapi.models.operations.PostcardRetrieveRequest(pscId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.PostcardRetrieveRequest.class, baseUrl, "/postcards/{psc_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.PostcardRetrieveResponse res = new org.openapis.openapi.models.operations.PostcardRetrieveResponse(contentType, httpRes.statusCode(), httpRes) {{
            postcard = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Postcard out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Postcard.class);
                res.postcard = out;
            }
        }

        return res;
    }

    /**
     * List
     * Returns a list of your postcards. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.PostcardsListResponse postcardsList(org.openapis.openapi.models.operations.PostcardsListRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/postcards");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.PostcardsListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.PostcardsListResponse res = new org.openapis.openapi.models.operations.PostcardsListResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.PostcardsListResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.PostcardsListResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}