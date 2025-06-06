// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGtmDatacentersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmDatacentersPlainArgs Empty = new GetGtmDatacentersPlainArgs();

    @Import(name="domain", required=true)
    private String domain;

    public String domain() {
        return this.domain;
    }

    private GetGtmDatacentersPlainArgs() {}

    private GetGtmDatacentersPlainArgs(GetGtmDatacentersPlainArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDatacentersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDatacentersPlainArgs $;

        public Builder() {
            $ = new GetGtmDatacentersPlainArgs();
        }

        public Builder(GetGtmDatacentersPlainArgs defaults) {
            $ = new GetGtmDatacentersPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder domain(String domain) {
            $.domain = domain;
            return this;
        }

        public GetGtmDatacentersPlainArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("GetGtmDatacentersPlainArgs", "domain");
            }
            return $;
        }
    }

}
