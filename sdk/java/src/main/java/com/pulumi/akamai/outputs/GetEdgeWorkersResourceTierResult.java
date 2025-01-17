// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEdgeWorkersResourceTierResult {
    private String contractId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Integer resourceTierId;
    private String resourceTierName;

    private GetEdgeWorkersResourceTierResult() {}
    public String contractId() {
        return this.contractId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer resourceTierId() {
        return this.resourceTierId;
    }
    public String resourceTierName() {
        return this.resourceTierName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEdgeWorkersResourceTierResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String id;
        private Integer resourceTierId;
        private String resourceTierName;
        public Builder() {}
        public Builder(GetEdgeWorkersResourceTierResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.id = defaults.id;
    	      this.resourceTierId = defaults.resourceTierId;
    	      this.resourceTierName = defaults.resourceTierName;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetEdgeWorkersResourceTierResult", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEdgeWorkersResourceTierResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceTierId(Integer resourceTierId) {
            if (resourceTierId == null) {
              throw new MissingRequiredPropertyException("GetEdgeWorkersResourceTierResult", "resourceTierId");
            }
            this.resourceTierId = resourceTierId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceTierName(String resourceTierName) {
            if (resourceTierName == null) {
              throw new MissingRequiredPropertyException("GetEdgeWorkersResourceTierResult", "resourceTierName");
            }
            this.resourceTierName = resourceTierName;
            return this;
        }
        public GetEdgeWorkersResourceTierResult build() {
            final var _resultValue = new GetEdgeWorkersResourceTierResult();
            _resultValue.contractId = contractId;
            _resultValue.id = id;
            _resultValue.resourceTierId = resourceTierId;
            _resultValue.resourceTierName = resourceTierName;
            return _resultValue;
        }
    }
}
