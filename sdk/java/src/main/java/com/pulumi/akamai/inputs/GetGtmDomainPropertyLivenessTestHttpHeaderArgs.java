// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGtmDomainPropertyLivenessTestHttpHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGtmDomainPropertyLivenessTestHttpHeaderArgs Empty = new GetGtmDomainPropertyLivenessTestHttpHeaderArgs();

    /**
     * Name of the HTTP header.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the HTTP header.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Value of the HTTP header.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of the HTTP header.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private GetGtmDomainPropertyLivenessTestHttpHeaderArgs() {}

    private GetGtmDomainPropertyLivenessTestHttpHeaderArgs(GetGtmDomainPropertyLivenessTestHttpHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDomainPropertyLivenessTestHttpHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDomainPropertyLivenessTestHttpHeaderArgs $;

        public Builder() {
            $ = new GetGtmDomainPropertyLivenessTestHttpHeaderArgs();
        }

        public Builder(GetGtmDomainPropertyLivenessTestHttpHeaderArgs defaults) {
            $ = new GetGtmDomainPropertyLivenessTestHttpHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the HTTP header.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the HTTP header.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the HTTP header.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the HTTP header.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetGtmDomainPropertyLivenessTestHttpHeaderArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestHttpHeaderArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestHttpHeaderArgs", "value");
            }
            return $;
        }
    }

}
