// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecCustomRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecCustomRulesArgs Empty = new GetAppSecCustomRulesArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="customRuleId")
    private @Nullable Output<Integer> customRuleId;

    public Optional<Output<Integer>> customRuleId() {
        return Optional.ofNullable(this.customRuleId);
    }

    private GetAppSecCustomRulesArgs() {}

    private GetAppSecCustomRulesArgs(GetAppSecCustomRulesArgs $) {
        this.configId = $.configId;
        this.customRuleId = $.customRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecCustomRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecCustomRulesArgs $;

        public Builder() {
            $ = new GetAppSecCustomRulesArgs();
        }

        public Builder(GetAppSecCustomRulesArgs defaults) {
            $ = new GetAppSecCustomRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder customRuleId(@Nullable Output<Integer> customRuleId) {
            $.customRuleId = customRuleId;
            return this;
        }

        public Builder customRuleId(Integer customRuleId) {
            return customRuleId(Output.of(customRuleId));
        }

        public GetAppSecCustomRulesArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecCustomRulesArgs", "configId");
            }
            return $;
        }
    }

}
