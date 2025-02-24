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
public final class GetBotmanBotEndpointCoverageReportResult {
    private @Nullable Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;
    private @Nullable String operationId;

    private GetBotmanBotEndpointCoverageReportResult() {}
    public Optional<Integer> configId() {
        return Optional.ofNullable(this.configId);
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
    public Optional<String> operationId() {
        return Optional.ofNullable(this.operationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanBotEndpointCoverageReportResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer configId;
        private String id;
        private String json;
        private @Nullable String operationId;
        public Builder() {}
        public Builder(GetBotmanBotEndpointCoverageReportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.operationId = defaults.operationId;
        }

        @CustomType.Setter
        public Builder configId(@Nullable Integer configId) {

            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotEndpointCoverageReportResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotEndpointCoverageReportResult", "json");
            }
            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder operationId(@Nullable String operationId) {

            this.operationId = operationId;
            return this;
        }
        public GetBotmanBotEndpointCoverageReportResult build() {
            final var _resultValue = new GetBotmanBotEndpointCoverageReportResult();
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.operationId = operationId;
            return _resultValue;
        }
    }
}
