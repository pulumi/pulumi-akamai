// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20250113BehaviorApplicationLoadBalancerAllDownNetStorage {
    private @Nullable Integer cpCode;
    private @Nullable String downloadDomainName;
    private @Nullable String g2oToken;

    private GetPropertyRulesBuilderRulesV20250113BehaviorApplicationLoadBalancerAllDownNetStorage() {}
    public Optional<Integer> cpCode() {
        return Optional.ofNullable(this.cpCode);
    }
    public Optional<String> downloadDomainName() {
        return Optional.ofNullable(this.downloadDomainName);
    }
    public Optional<String> g2oToken() {
        return Optional.ofNullable(this.g2oToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20250113BehaviorApplicationLoadBalancerAllDownNetStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cpCode;
        private @Nullable String downloadDomainName;
        private @Nullable String g2oToken;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20250113BehaviorApplicationLoadBalancerAllDownNetStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpCode = defaults.cpCode;
    	      this.downloadDomainName = defaults.downloadDomainName;
    	      this.g2oToken = defaults.g2oToken;
        }

        @CustomType.Setter
        public Builder cpCode(@Nullable Integer cpCode) {

            this.cpCode = cpCode;
            return this;
        }
        @CustomType.Setter
        public Builder downloadDomainName(@Nullable String downloadDomainName) {

            this.downloadDomainName = downloadDomainName;
            return this;
        }
        @CustomType.Setter
        public Builder g2oToken(@Nullable String g2oToken) {

            this.g2oToken = g2oToken;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20250113BehaviorApplicationLoadBalancerAllDownNetStorage build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20250113BehaviorApplicationLoadBalancerAllDownNetStorage();
            _resultValue.cpCode = cpCode;
            _resultValue.downloadDomainName = downloadDomainName;
            _resultValue.g2oToken = g2oToken;
            return _resultValue;
        }
    }
}
