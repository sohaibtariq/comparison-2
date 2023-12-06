/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * FailureStatusCode - A conventional HTTP status code:
 *   * `401` - Authorization error with your API key or account
 *   * `403` - Forbidden error with your API key or account
 *   * `404` - The requested item does not exist
 *   * `413` - Payload too large
 *   * `422` - The query or body parameters did not pass validation
 *   * `429` - Too many requests have been sent with an API key in a given amount of time
 *   * `500` - An internal server error occurred, please contact support@lob.com
 * 
 */
public enum FailureStatusCode {
    FOUR_HUNDRED_AND_ONE(401L),
    FOUR_HUNDRED_AND_THREE(403L),
    FOUR_HUNDRED_AND_FOUR(404L),
    FOUR_HUNDRED_AND_THIRTEEN(413L),
    FOUR_HUNDRED_AND_TWENTY_TWO(422L),
    FOUR_HUNDRED_AND_TWENTY_NINE(429L),
    FIVE_HUNDRED(500L);

    @JsonValue
    public final Long value;

    private FailureStatusCode(Long value) {
        this.value = value;
    }
}
