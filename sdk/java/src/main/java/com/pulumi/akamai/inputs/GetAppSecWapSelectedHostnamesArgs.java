// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppSecWapSelectedHostnamesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecWapSelectedHostnamesArgs Empty = new GetAppSecWapSelectedHostnamesArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecWapSelectedHostnamesArgs() {}

    private GetAppSecWapSelectedHostnamesArgs(GetAppSecWapSelectedHostnamesArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecWapSelectedHostnamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecWapSelectedHostnamesArgs $;

        public Builder() {
            $ = new GetAppSecWapSelectedHostnamesArgs();
        }

        public Builder(GetAppSecWapSelectedHostnamesArgs defaults) {
            $ = new GetAppSecWapSelectedHostnamesArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetAppSecWapSelectedHostnamesArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecWapSelectedHostnamesArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppSecWapSelectedHostnamesArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
