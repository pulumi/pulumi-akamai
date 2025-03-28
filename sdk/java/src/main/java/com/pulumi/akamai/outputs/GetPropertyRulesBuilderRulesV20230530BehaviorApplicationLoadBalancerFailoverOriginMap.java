// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap {
    /**
     * @return Specifies the origin whose failure triggers the mapping rule.
     * 
     */
    private @Nullable String fromOriginId;
    /**
     * @return Requests stuck to the `fromOriginId` origin retry for each alternate origin `toOriginIds`, until one succeeds.
     * 
     */
    private @Nullable List<String> toOriginIds;

    private GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap() {}
    /**
     * @return Specifies the origin whose failure triggers the mapping rule.
     * 
     */
    public Optional<String> fromOriginId() {
        return Optional.ofNullable(this.fromOriginId);
    }
    /**
     * @return Requests stuck to the `fromOriginId` origin retry for each alternate origin `toOriginIds`, until one succeeds.
     * 
     */
    public List<String> toOriginIds() {
        return this.toOriginIds == null ? List.of() : this.toOriginIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fromOriginId;
        private @Nullable List<String> toOriginIds;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromOriginId = defaults.fromOriginId;
    	      this.toOriginIds = defaults.toOriginIds;
        }

        @CustomType.Setter
        public Builder fromOriginId(@Nullable String fromOriginId) {

            this.fromOriginId = fromOriginId;
            return this;
        }
        @CustomType.Setter
        public Builder toOriginIds(@Nullable List<String> toOriginIds) {

            this.toOriginIds = toOriginIds;
            return this;
        }
        public Builder toOriginIds(String... toOriginIds) {
            return toOriginIds(List.of(toOriginIds));
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap();
            _resultValue.fromOriginId = fromOriginId;
            _resultValue.toOriginIds = toOriginIds;
            return _resultValue;
        }
    }
}
