/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;
import org.openapis.openapi.utils.SerializedBody;

/**
 * Validates whether a given name is associated with an address.
 * &lt;div class="back-to-top" &gt;&lt;a href="#" onclick="toTopLink()"&gt;back to top&lt;/a&gt;&lt;/div&gt;
 * 
 */
public class IdentityValidation {
	
	private SDKConfiguration sdkConfiguration;

	public IdentityValidation(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Identity Validation
     * Validates whether a given name is associated with an address.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.IdentityValidationResponse identityValidation(Object request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/identity_validation");
        
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
        
        org.openapis.openapi.models.operations.IdentityValidationResponse res = new org.openapis.openapi.models.operations.IdentityValidationResponse(contentType, null, httpRes.statusCode(), httpRes) {{
            identityValidation = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.identityValidation = out;
            }
        }

        return res;
    }
}