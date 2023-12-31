/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;

/**
 * PublishedVersion - The template's currently published version. This version will be used in any Print &amp; Mail API requests that reference the specified template.
 */

public class PublishedVersion {
    /**
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public PublishedVersion withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:
     * - [Postcards](#operation/postcard_create) - `front` and `back`
     * - [Self Mailers](#operation/self_mailer_create) - `inside` and `outside`
     * - [Letters](#operation/letter_create) - `file`
     * - [Checks](#operation/check_create) - `check_bottom` and `attachment`
     * - [Cards](#operation/card_create) - `front` and `back`
     * 
     * If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.
     * 
     */
    @JsonProperty("html")
    public String html;

    public PublishedVersion withHtml(String html) {
        this.html = html;
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
    public Engine engine;

    public PublishedVersion withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
    
    /**
     * An array of required variables to be used in a template. Only available for `handlebars` templates.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required_vars")
    public String[] requiredVars;

    public PublishedVersion withRequiredVars(String[] requiredVars) {
        this.requiredVars = requiredVars;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was created.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_created")
    public OffsetDateTime dateCreated;

    public PublishedVersion withDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_modified")
    public OffsetDateTime dateModified;

    public PublishedVersion withDateModified(OffsetDateTime dateModified) {
        this.dateModified = dateModified;
        return this;
    }
    
    /**
     * Only returned if the resource has been successfully deleted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public Boolean deleted;

    public PublishedVersion withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    /**
     * Value is resource type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public TemplateSchemasObject object;

    public PublishedVersion withObject(TemplateSchemasObject object) {
        this.object = object;
        return this;
    }
    
    /**
     * Unique identifier prefixed with `vrsn_`.
     */
    @JsonProperty("id")
    public String id;

    public PublishedVersion withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Used by frontend, true if the template uses advanced features.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suggest_json_editor")
    public Boolean suggestJsonEditor;

    public PublishedVersion withSuggestJsonEditor(Boolean suggestJsonEditor) {
        this.suggestJsonEditor = suggestJsonEditor;
        return this;
    }
    
    /**
     * Object representing the keys of every merge variable present in the template. It has one key named 'keys', and its value is an array of strings.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merge_variables")
    public TemplateMergeVariables mergeVariables;

    public PublishedVersion withMergeVariables(TemplateMergeVariables mergeVariables) {
        this.mergeVariables = mergeVariables;
        return this;
    }
    
    public PublishedVersion(@JsonProperty("html") String html, @JsonProperty("date_created") OffsetDateTime dateCreated, @JsonProperty("date_modified") OffsetDateTime dateModified, @JsonProperty("id") String id) {
        this.html = html;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.id = id;
  }
}
