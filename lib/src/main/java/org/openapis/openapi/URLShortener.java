/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;
import org.openapis.openapi.utils.SerializedBody;

/**
 * Lob's URL shortener allows you to generate unique short links, either with Lob's own domain or your own custom domains. Each custom link enables Lob to track mail individually and provide customers the relevant tracking data in their dashboard.
 * 
 * Webhooks can be used to integrate Lob's URL Shortener scans into your omni channel marketing stratergy. See the &lt;a href="#tag/Webhooks"&gt;Webhooks&lt;/a&gt; section of our documentation to learn how to enable the `letter.viewed`, `postcard.viewed` and `self_mailer.viewed` event notifications for your mail pieces.
 * 
 * Furthermore, you can use our Retrieve endpoints to track the impact and engagement rate of links created. 
 * 
 * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
 * 
 */
public class URLShortener {
	
	private SDKConfiguration sdkConfiguration;

	public URLShortener(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete a Domain
     * Delete a registered domain. This operation can only be performed if all associated links with the domain are deleted.
     * @param domainId Unique identifier for a domain.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.DomainDeleteResponse domainDelete(String domainId) throws Exception {
        org.openapis.openapi.models.operations.DomainDeleteRequest request = new org.openapis.openapi.models.operations.DomainDeleteRequest(domainId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.DomainDeleteRequest.class, baseUrl, "/domains/{domain_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.DomainDeleteResponse res = new org.openapis.openapi.models.operations.DomainDeleteResponse(contentType, httpRes.statusCode(), httpRes) {{
            domainResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.DomainResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.DomainResponse.class);
                res.domainResponse = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a domain
     * Retrieve details for a single domain.
     * @param domainId Unique identifier for a domain.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.DomainGetResponse domainGet(String domainId) throws Exception {
        org.openapis.openapi.models.operations.DomainGetRequest request = new org.openapis.openapi.models.operations.DomainGetRequest(domainId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.DomainGetRequest.class, baseUrl, "/domains/{domain_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.DomainGetResponse res = new org.openapis.openapi.models.operations.DomainGetResponse(contentType, httpRes.statusCode(), httpRes) {{
            domainResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.DomainResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.DomainResponse.class);
                res.domainResponse = out;
            }
        }

        return res;
    }

    /**
     * List all domains
     * Retrieve a list of all created domains.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.DomainListResponse domainList() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/domains");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.DomainListResponse res = new org.openapis.openapi.models.operations.DomainListResponse(contentType, httpRes.statusCode(), httpRes) {{
            domainsResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.DomainsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.DomainsResponse.class);
                res.domainsResponse = out;
            }
        }

        return res;
    }

    /**
     * Create Domain
     * Add a new custom domain that can be used to create custom links.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.DomainCreateResponse domainCreate(org.openapis.openapi.models.shared.Domains request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/domains");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.DomainCreateResponse res = new org.openapis.openapi.models.operations.DomainCreateResponse(contentType, httpRes.statusCode(), httpRes) {{
            domainResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.DomainResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.DomainResponse.class);
                res.domainResponse = out;
            }
        }

        return res;
    }

    /**
     * Delete all links for a domain
     * Delete all associated links for a domain
     * @param domainId Unique identifier for a domain.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.DomainDeleteLinksResponse domainDeleteLinks(String domainId) throws Exception {
        org.openapis.openapi.models.operations.DomainDeleteLinksRequest request = new org.openapis.openapi.models.operations.DomainDeleteLinksRequest(domainId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.DomainDeleteLinksRequest.class, baseUrl, "/domains/{domain_id}/links", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.DomainDeleteLinksResponse res = new org.openapis.openapi.models.operations.DomainDeleteLinksResponse(contentType, httpRes.statusCode(), httpRes) {{
            domainsResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.DomainsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.DomainsResponse.class);
                res.domainsResponse = out;
            }
        }

        return res;
    }

    /**
     * Retrieve all shortened links
     * Retrieves a list of shortened links. The list is sorted by  creation date, with the most recently created appearing first.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.LinksListResponse linksList(org.openapis.openapi.models.operations.LinksListRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/links");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.LinksListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.LinksListResponse res = new org.openapis.openapi.models.operations.LinksListResponse(contentType, httpRes.statusCode(), httpRes) {{
            linksResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.LinksResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.LinksResponse.class);
                res.linksResponse = out;
            }
        }

        return res;
    }

    /**
     * Delete Link
     * Delete the shortened link.
     * @param linkId Unique identifier for a link.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.LinksDeleteResponse linksDelete(String linkId) throws Exception {
        org.openapis.openapi.models.operations.LinksDeleteRequest request = new org.openapis.openapi.models.operations.LinksDeleteRequest(linkId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.LinksDeleteRequest.class, baseUrl, "/links/{link_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.LinksDeleteResponse res = new org.openapis.openapi.models.operations.LinksDeleteResponse(contentType, httpRes.statusCode(), httpRes) {{
            linkResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.LinkResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.LinkResponse.class);
                res.linkResponse = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a link
     * Retrievs a single shortened link.
     * @param linkId Unique identifier for a link.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.LinksGetResponse linksGet(String linkId) throws Exception {
        org.openapis.openapi.models.operations.LinksGetRequest request = new org.openapis.openapi.models.operations.LinksGetRequest(linkId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.LinksGetRequest.class, baseUrl, "/links/{link_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.LinksGetResponse res = new org.openapis.openapi.models.operations.LinksGetResponse(contentType, httpRes.statusCode(), httpRes) {{
            linkResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.LinkResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.LinkResponse.class);
                res.linkResponse = out;
            }
        }

        return res;
    }

    /**
     * Update a Link
     * Update any of the properties of a shortened link.
     * @param linkId Unique identifier for a link.
     * @param linkSingle
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.LinkUpdateResponse linkUpdate(String linkId, org.openapis.openapi.models.shared.LinkSingle linkSingle) throws Exception {
        org.openapis.openapi.models.operations.LinkUpdateRequest request = new org.openapis.openapi.models.operations.LinkUpdateRequest(linkId, linkSingle);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.LinkUpdateRequest.class, baseUrl, "/links/{link_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "linkSingle", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.LinkUpdateResponse res = new org.openapis.openapi.models.operations.LinkUpdateResponse(contentType, httpRes.statusCode(), httpRes) {{
            linkResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.LinkResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.LinkResponse.class);
                res.linkResponse = out;
            }
        }

        return res;
    }

    /**
     * Create Link
     * Given a long URL, shorten your URL either by using a custom domain or Lob's own short domain.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.LinkCreateResponse linkCreate(org.openapis.openapi.models.shared.LinkSingle request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/links/shorten");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.LinkCreateResponse res = new org.openapis.openapi.models.operations.LinkCreateResponse(contentType, httpRes.statusCode(), httpRes) {{
            linkResponse = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.LinkResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.LinkResponse.class);
                res.linkResponse = out;
            }
        }

        return res;
    }
}