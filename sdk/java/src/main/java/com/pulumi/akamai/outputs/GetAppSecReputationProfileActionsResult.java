// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSecReputationProfileActionsResult {
    private String action;
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;
    private String outputText;
    private @Nullable Integer reputationProfileId;
    private String securityPolicyId;

    private GetAppSecReputationProfileActionsResult() {}
    public String action() {
        return this.action;
    }
    public Integer configId() {
        return this.configId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String json() {
        return this.json;
    }
    public String outputText() {
        return this.outputText;
    }
    public Optional<Integer> reputationProfileId() {
        return Optional.ofNullable(this.reputationProfileId);
    }
    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSecReputationProfileActionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private Integer configId;
        private String id;
        private String json;
        private String outputText;
        private @Nullable Integer reputationProfileId;
        private String securityPolicyId;
        public Builder() {}
        public Builder(GetAppSecReputationProfileActionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.outputText = defaults.outputText;
    	      this.reputationProfileId = defaults.reputationProfileId;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetAppSecReputationProfileActionsResult", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetAppSecReputationProfileActionsResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppSecReputationProfileActionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetAppSecReputationProfileActionsResult", "json");
            }
            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder outputText(String outputText) {
            if (outputText == null) {
              throw new MissingRequiredPropertyException("GetAppSecReputationProfileActionsResult", "outputText");
            }
            this.outputText = outputText;
            return this;
        }
        @CustomType.Setter
        public Builder reputationProfileId(@Nullable Integer reputationProfileId) {

            this.reputationProfileId = reputationProfileId;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(String securityPolicyId) {
            if (securityPolicyId == null) {
              throw new MissingRequiredPropertyException("GetAppSecReputationProfileActionsResult", "securityPolicyId");
            }
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public GetAppSecReputationProfileActionsResult build() {
            final var _resultValue = new GetAppSecReputationProfileActionsResult();
            _resultValue.action = action;
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.outputText = outputText;
            _resultValue.reputationProfileId = reputationProfileId;
            _resultValue.securityPolicyId = securityPolicyId;
            return _resultValue;
        }
    }
}
