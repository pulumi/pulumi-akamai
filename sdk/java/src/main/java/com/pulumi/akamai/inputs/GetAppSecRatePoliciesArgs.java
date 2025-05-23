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


public final class GetAppSecRatePoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecRatePoliciesArgs Empty = new GetAppSecRatePoliciesArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="ratePolicyId")
    private @Nullable Output<Integer> ratePolicyId;

    public Optional<Output<Integer>> ratePolicyId() {
        return Optional.ofNullable(this.ratePolicyId);
    }

    private GetAppSecRatePoliciesArgs() {}

    private GetAppSecRatePoliciesArgs(GetAppSecRatePoliciesArgs $) {
        this.configId = $.configId;
        this.ratePolicyId = $.ratePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecRatePoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecRatePoliciesArgs $;

        public Builder() {
            $ = new GetAppSecRatePoliciesArgs();
        }

        public Builder(GetAppSecRatePoliciesArgs defaults) {
            $ = new GetAppSecRatePoliciesArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder ratePolicyId(@Nullable Output<Integer> ratePolicyId) {
            $.ratePolicyId = ratePolicyId;
            return this;
        }

        public Builder ratePolicyId(Integer ratePolicyId) {
            return ratePolicyId(Output.of(ratePolicyId));
        }

        public GetAppSecRatePoliciesArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecRatePoliciesArgs", "configId");
            }
            return $;
        }
    }

}
