// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGtmResourceLink extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmResourceLink Empty = new GetGtmResourceLink();

    /**
     * A hypermedia link to the complete URL that uniquely defines a resource.
     * 
     */
    @Import(name="href", required=true)
    private String href;

    /**
     * @return A hypermedia link to the complete URL that uniquely defines a resource.
     * 
     */
    public String href() {
        return this.href;
    }

    /**
     * Indicates the link relationship of the object.
     * 
     */
    @Import(name="rel", required=true)
    private String rel;

    /**
     * @return Indicates the link relationship of the object.
     * 
     */
    public String rel() {
        return this.rel;
    }

    private GetGtmResourceLink() {}

    private GetGtmResourceLink(GetGtmResourceLink $) {
        this.href = $.href;
        this.rel = $.rel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmResourceLink defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmResourceLink $;

        public Builder() {
            $ = new GetGtmResourceLink();
        }

        public Builder(GetGtmResourceLink defaults) {
            $ = new GetGtmResourceLink(Objects.requireNonNull(defaults));
        }

        /**
         * @param href A hypermedia link to the complete URL that uniquely defines a resource.
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            $.href = href;
            return this;
        }

        /**
         * @param rel Indicates the link relationship of the object.
         * 
         * @return builder
         * 
         */
        public Builder rel(String rel) {
            $.rel = rel;
            return this;
        }

        public GetGtmResourceLink build() {
            if ($.href == null) {
                throw new MissingRequiredPropertyException("GetGtmResourceLink", "href");
            }
            if ($.rel == null) {
                throw new MissingRequiredPropertyException("GetGtmResourceLink", "rel");
            }
            return $;
        }
    }

}
