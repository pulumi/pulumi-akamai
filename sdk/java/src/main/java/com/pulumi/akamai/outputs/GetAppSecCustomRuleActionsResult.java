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
public final class GetAppSecCustomRuleActionsResult {
    private Integer configId;
    private @Nullable Integer customRuleId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String outputText;
    private String securityPolicyId;

    private GetAppSecCustomRuleActionsResult() {}
    public Integer configId() {
        return this.configId;
    }
    public Optional<Integer> customRuleId() {
        return Optional.ofNullable(this.customRuleId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String outputText() {
        return this.outputText;
    }
    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSecCustomRuleActionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private @Nullable Integer customRuleId;
        private String id;
        private String outputText;
        private String securityPolicyId;
        public Builder() {}
        public Builder(GetAppSecCustomRuleActionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.customRuleId = defaults.customRuleId;
    	      this.id = defaults.id;
    	      this.outputText = defaults.outputText;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetAppSecCustomRuleActionsResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder customRuleId(@Nullable Integer customRuleId) {

            this.customRuleId = customRuleId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppSecCustomRuleActionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder outputText(String outputText) {
            if (outputText == null) {
              throw new MissingRequiredPropertyException("GetAppSecCustomRuleActionsResult", "outputText");
            }
            this.outputText = outputText;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(String securityPolicyId) {
            if (securityPolicyId == null) {
              throw new MissingRequiredPropertyException("GetAppSecCustomRuleActionsResult", "securityPolicyId");
            }
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public GetAppSecCustomRuleActionsResult build() {
            final var _resultValue = new GetAppSecCustomRuleActionsResult();
            _resultValue.configId = configId;
            _resultValue.customRuleId = customRuleId;
            _resultValue.id = id;
            _resultValue.outputText = outputText;
            _resultValue.securityPolicyId = securityPolicyId;
            return _resultValue;
        }
    }
}
