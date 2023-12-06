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
 * The self mailer endpoint allows you to easily print and mail self mailers. The API provides endpoints
 * for creating self mailers, retrieving individual self mailers, canceling self mailers, and retrieving a list of self mailers.
 * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
 * 
 */
public class SelfMailers {
	
	private SDKConfiguration sdkConfiguration;

	public SelfMailers(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete
     * Completely removes a self mailer from production. This can only be done if the self mailer's `send_date` has not yet passed. If the self mailer is successfully canceled, you will not be charged for it. This feature is exclusive to certain customers. Upgrade to the appropriate &lt;a href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.
     * @param sfmId id of the self_mailer
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.SelfMailerDeleteResponse selfMailerDelete(String sfmId) throws Exception {
        org.openapis.openapi.models.operations.SelfMailerDeleteRequest request = new org.openapis.openapi.models.operations.SelfMailerDeleteRequest(sfmId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.SelfMailerDeleteRequest.class, baseUrl, "/self_mailers/{sfm_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.SelfMailerDeleteResponse res = new org.openapis.openapi.models.operations.SelfMailerDeleteResponse(contentType, httpRes.statusCode(), httpRes) {{
            selfMailerDeletion = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.SelfMailerDeletion out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.SelfMailerDeletion.class);
                res.selfMailerDeletion = out;
            }
        }

        return res;
    }

    /**
     * Retrieve
     * Retrieves the details of an existing self_mailer. You need only supply the unique self_mailer identifier that was returned upon self_mailer creation.
     * @param sfmId id of the self_mailer
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.SelfMailerRetrieveResponse selfMailerRetrieve(String sfmId) throws Exception {
        org.openapis.openapi.models.operations.SelfMailerRetrieveRequest request = new org.openapis.openapi.models.operations.SelfMailerRetrieveRequest(sfmId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.SelfMailerRetrieveRequest.class, baseUrl, "/self_mailers/{sfm_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.SelfMailerRetrieveResponse res = new org.openapis.openapi.models.operations.SelfMailerRetrieveResponse(contentType, httpRes.statusCode(), httpRes) {{
            selfMailer = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.SelfMailer out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.SelfMailer.class);
                res.selfMailer = out;
            }
        }

        return res;
    }

    /**
     * List
     * Returns a list of your self_mailers. The self_mailers are returned sorted by creation date, with the most recently created self_mailers appearing first.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.SelfMailersListResponse selfMailersList(org.openapis.openapi.models.operations.SelfMailersListRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/self_mailers");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.SelfMailersListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.SelfMailersListResponse res = new org.openapis.openapi.models.operations.SelfMailersListResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.SelfMailersListResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.SelfMailersListResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}