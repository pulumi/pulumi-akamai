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
public final class GetBotmanChallengeActionResult {
    private @Nullable String actionId;
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;

    private GetBotmanChallengeActionResult() {}
    public Optional<String> actionId() {
        return Optional.ofNullable(this.actionId);
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanChallengeActionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String actionId;
        private Integer configId;
        private String id;
        private String json;
        public Builder() {}
        public Builder(GetBotmanChallengeActionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionId = defaults.actionId;
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
        }

        @CustomType.Setter
        public Builder actionId(@Nullable String actionId) {

            this.actionId = actionId;
            return this;
        }
        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetBotmanChallengeActionResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBotmanChallengeActionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetBotmanChallengeActionResult", "json");
            }
            this.json = json;
            return this;
        }
        public GetBotmanChallengeActionResult build() {
            final var _resultValue = new GetBotmanChallengeActionResult();
            _resultValue.actionId = actionId;
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            return _resultValue;
        }
    }
}
