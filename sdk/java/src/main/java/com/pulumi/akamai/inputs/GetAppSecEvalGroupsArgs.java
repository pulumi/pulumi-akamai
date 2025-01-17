// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecEvalGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecEvalGroupsArgs Empty = new GetAppSecEvalGroupsArgs();

    @Import(name="attackGroup")
    private @Nullable Output<String> attackGroup;

    public Optional<Output<String>> attackGroup() {
        return Optional.ofNullable(this.attackGroup);
    }

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

    private GetAppSecEvalGroupsArgs() {}

    private GetAppSecEvalGroupsArgs(GetAppSecEvalGroupsArgs $) {
        this.attackGroup = $.attackGroup;
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecEvalGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecEvalGroupsArgs $;

        public Builder() {
            $ = new GetAppSecEvalGroupsArgs();
        }

        public Builder(GetAppSecEvalGroupsArgs defaults) {
            $ = new GetAppSecEvalGroupsArgs(Objects.requireNonNull(defaults));
        }

        public Builder attackGroup(@Nullable Output<String> attackGroup) {
            $.attackGroup = attackGroup;
            return this;
        }

        public Builder attackGroup(String attackGroup) {
            return attackGroup(Output.of(attackGroup));
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

        public GetAppSecEvalGroupsArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalGroupsArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalGroupsArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
