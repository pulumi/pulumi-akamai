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
public final class GetAppSecAdvancedSettingsLoggingResult {
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;
    private String outputText;
    private @Nullable String securityPolicyId;

    private GetAppSecAdvancedSettingsLoggingResult() {}
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
    public Optional<String> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSecAdvancedSettingsLoggingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private String id;
        private String json;
        private String outputText;
        private @Nullable String securityPolicyId;
        public Builder() {}
        public Builder(GetAppSecAdvancedSettingsLoggingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.outputText = defaults.outputText;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetAppSecAdvancedSettingsLoggingResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppSecAdvancedSettingsLoggingResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetAppSecAdvancedSettingsLoggingResult", "json");
            }
            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder outputText(String outputText) {
            if (outputText == null) {
              throw new MissingRequiredPropertyException("GetAppSecAdvancedSettingsLoggingResult", "outputText");
            }
            this.outputText = outputText;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(@Nullable String securityPolicyId) {

            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public GetAppSecAdvancedSettingsLoggingResult build() {
            final var _resultValue = new GetAppSecAdvancedSettingsLoggingResult();
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.outputText = outputText;
            _resultValue.securityPolicyId = securityPolicyId;
            return _resultValue;
        }
    }
}
