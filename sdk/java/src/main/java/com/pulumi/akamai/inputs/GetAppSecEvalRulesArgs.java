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


public final class GetAppSecEvalRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecEvalRulesArgs Empty = new GetAppSecEvalRulesArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="ruleId")
    private @Nullable Output<Integer> ruleId;

    public Optional<Output<Integer>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecEvalRulesArgs() {}

    private GetAppSecEvalRulesArgs(GetAppSecEvalRulesArgs $) {
        this.configId = $.configId;
        this.ruleId = $.ruleId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecEvalRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecEvalRulesArgs $;

        public Builder() {
            $ = new GetAppSecEvalRulesArgs();
        }

        public Builder(GetAppSecEvalRulesArgs defaults) {
            $ = new GetAppSecEvalRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder ruleId(@Nullable Output<Integer> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        public Builder ruleId(Integer ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetAppSecEvalRulesArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalRulesArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalRulesArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
