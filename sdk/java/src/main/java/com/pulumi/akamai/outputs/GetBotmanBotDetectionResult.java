// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBotmanBotDetectionResult {
    private @Nullable String detectionName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;

    private GetBotmanBotDetectionResult() {}
    public Optional<String> detectionName() {
        return Optional.ofNullable(this.detectionName);
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanBotDetectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String detectionName;
        private String id;
        private String json;
        public Builder() {}
        public Builder(GetBotmanBotDetectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectionName = defaults.detectionName;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
        }

        @CustomType.Setter
        public Builder detectionName(@Nullable String detectionName) {

            this.detectionName = detectionName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotDetectionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetBotmanBotDetectionResult", "json");
            }
            this.json = json;
            return this;
        }
        public GetBotmanBotDetectionResult build() {
            final var _resultValue = new GetBotmanBotDetectionResult();
            _resultValue.detectionName = detectionName;
            _resultValue.id = id;
            _resultValue.json = json;
            return _resultValue;
        }
    }
}
