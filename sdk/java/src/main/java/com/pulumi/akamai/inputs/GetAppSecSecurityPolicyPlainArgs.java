// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecSecurityPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecSecurityPolicyPlainArgs Empty = new GetAppSecSecurityPolicyPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="securityPolicyName")
    private @Nullable String securityPolicyName;

    public Optional<String> securityPolicyName() {
        return Optional.ofNullable(this.securityPolicyName);
    }

    private GetAppSecSecurityPolicyPlainArgs() {}

    private GetAppSecSecurityPolicyPlainArgs(GetAppSecSecurityPolicyPlainArgs $) {
        this.configId = $.configId;
        this.securityPolicyName = $.securityPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecSecurityPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecSecurityPolicyPlainArgs $;

        public Builder() {
            $ = new GetAppSecSecurityPolicyPlainArgs();
        }

        public Builder(GetAppSecSecurityPolicyPlainArgs defaults) {
            $ = new GetAppSecSecurityPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder securityPolicyName(@Nullable String securityPolicyName) {
            $.securityPolicyName = securityPolicyName;
            return this;
        }

        public GetAppSecSecurityPolicyPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecSecurityPolicyPlainArgs", "configId");
            }
            return $;
        }
    }

}
