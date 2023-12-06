/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class TemplateVersionUpdatable {
    /**
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    @SpeakeasyMetadata("form:name=description multipartForm:name=description")
    public String description;

    public TemplateVersionUpdatable withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * The engine used to combine HTML template with merge variables.
     *   * `legacy` - Lob's original engine
     *   * `handlebars`
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("engine")
    @SpeakeasyMetadata("form:name=engine multipartForm:name=engine")
    public Engine engine;

    public TemplateVersionUpdatable withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
    
    /**
     * An array of required variables to be used in a template. Only available for `handlebars` templates.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required_vars")
    @SpeakeasyMetadata("form:name=required_vars multipartForm:name=required_vars")
    public String[] requiredVars;

    public TemplateVersionUpdatable withRequiredVars(String[] requiredVars) {
        this.requiredVars = requiredVars;
        return this;
    }
    
    public TemplateVersionUpdatable(){}
}