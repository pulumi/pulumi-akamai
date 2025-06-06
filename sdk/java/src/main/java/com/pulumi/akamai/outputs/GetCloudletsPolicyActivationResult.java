// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudletsPolicyActivationResult {
    private @Nullable List<String> associatedProperties;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String network;
    private Integer policyId;
    private String status;
    private Integer version;

    private GetCloudletsPolicyActivationResult() {}
    public List<String> associatedProperties() {
        return this.associatedProperties == null ? List.of() : this.associatedProperties;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String network() {
        return this.network;
    }
    public Integer policyId() {
        return this.policyId;
    }
    public String status() {
        return this.status;
    }
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudletsPolicyActivationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> associatedProperties;
        private String id;
        private String network;
        private Integer policyId;
        private String status;
        private Integer version;
        public Builder() {}
        public Builder(GetCloudletsPolicyActivationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedProperties = defaults.associatedProperties;
    	      this.id = defaults.id;
    	      this.network = defaults.network;
    	      this.policyId = defaults.policyId;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder associatedProperties(@Nullable List<String> associatedProperties) {

            this.associatedProperties = associatedProperties;
            return this;
        }
        public Builder associatedProperties(String... associatedProperties) {
            return associatedProperties(List.of(associatedProperties));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudletsPolicyActivationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetCloudletsPolicyActivationResult", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder policyId(Integer policyId) {
            if (policyId == null) {
              throw new MissingRequiredPropertyException("GetCloudletsPolicyActivationResult", "policyId");
            }
            this.policyId = policyId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetCloudletsPolicyActivationResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetCloudletsPolicyActivationResult", "version");
            }
            this.version = version;
            return this;
        }
        public GetCloudletsPolicyActivationResult build() {
            final var _resultValue = new GetCloudletsPolicyActivationResult();
            _resultValue.associatedProperties = associatedProperties;
            _resultValue.id = id;
            _resultValue.network = network;
            _resultValue.policyId = policyId;
            _resultValue.status = status;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
