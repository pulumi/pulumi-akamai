// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudletsSharedPolicyActivationsStagingEffective;
import com.pulumi.akamai.outputs.GetCloudletsSharedPolicyActivationsStagingLatest;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudletsSharedPolicyActivationsStaging {
    /**
     * @return The status of the activation that&#39;s currently in use on this network, or null if the policy has no activations.
     * 
     */
    private @Nullable GetCloudletsSharedPolicyActivationsStagingEffective effective;
    /**
     * @return The status of the latest activation or null if the policy has no activations.
     * 
     */
    private @Nullable GetCloudletsSharedPolicyActivationsStagingLatest latest;

    private GetCloudletsSharedPolicyActivationsStaging() {}
    /**
     * @return The status of the activation that&#39;s currently in use on this network, or null if the policy has no activations.
     * 
     */
    public Optional<GetCloudletsSharedPolicyActivationsStagingEffective> effective() {
        return Optional.ofNullable(this.effective);
    }
    /**
     * @return The status of the latest activation or null if the policy has no activations.
     * 
     */
    public Optional<GetCloudletsSharedPolicyActivationsStagingLatest> latest() {
        return Optional.ofNullable(this.latest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudletsSharedPolicyActivationsStaging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetCloudletsSharedPolicyActivationsStagingEffective effective;
        private @Nullable GetCloudletsSharedPolicyActivationsStagingLatest latest;
        public Builder() {}
        public Builder(GetCloudletsSharedPolicyActivationsStaging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effective = defaults.effective;
    	      this.latest = defaults.latest;
        }

        @CustomType.Setter
        public Builder effective(@Nullable GetCloudletsSharedPolicyActivationsStagingEffective effective) {

            this.effective = effective;
            return this;
        }
        @CustomType.Setter
        public Builder latest(@Nullable GetCloudletsSharedPolicyActivationsStagingLatest latest) {

            this.latest = latest;
            return this;
        }
        public GetCloudletsSharedPolicyActivationsStaging build() {
            final var _resultValue = new GetCloudletsSharedPolicyActivationsStaging();
            _resultValue.effective = effective;
            _resultValue.latest = latest;
            return _resultValue;
        }
    }
}
