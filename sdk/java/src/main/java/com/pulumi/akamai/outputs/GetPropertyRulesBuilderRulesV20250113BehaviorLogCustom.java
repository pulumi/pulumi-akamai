// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20250113BehaviorLogCustom {
    /**
     * @return Specifies an additional data field to append to each log line, maximum 1000 bytes, typically based on a dynamically generated built-in system variable. For example, `round-trip: {{builtin.AK_CLIENT_TURNAROUND_TIME}}ms` logs the total time to complete the response. See `Support for variables` for more information. Since this option can specify both a request and response, it overrides any `customLogField` settings in the `report` behavior.
     * 
     */
    private @Nullable String customLogField;
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    private @Nullable Boolean locked;
    /**
     * @return Whether to append additional custom data to each log line.
     * 
     */
    private @Nullable Boolean logCustomLogField;
    /**
     * @return This option is for internal usage only.
     * 
     */
    private @Nullable String templateUuid;
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20250113BehaviorLogCustom() {}
    /**
     * @return Specifies an additional data field to append to each log line, maximum 1000 bytes, typically based on a dynamically generated built-in system variable. For example, `round-trip: {{builtin.AK_CLIENT_TURNAROUND_TIME}}ms` logs the total time to complete the response. See `Support for variables` for more information. Since this option can specify both a request and response, it overrides any `customLogField` settings in the `report` behavior.
     * 
     */
    public Optional<String> customLogField() {
        return Optional.ofNullable(this.customLogField);
    }
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    /**
     * @return Whether to append additional custom data to each log line.
     * 
     */
    public Optional<Boolean> logCustomLogField() {
        return Optional.ofNullable(this.logCustomLogField);
    }
    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20250113BehaviorLogCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String customLogField;
        private @Nullable Boolean locked;
        private @Nullable Boolean logCustomLogField;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20250113BehaviorLogCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLogField = defaults.customLogField;
    	      this.locked = defaults.locked;
    	      this.logCustomLogField = defaults.logCustomLogField;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder customLogField(@Nullable String customLogField) {

            this.customLogField = customLogField;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder logCustomLogField(@Nullable Boolean logCustomLogField) {

            this.logCustomLogField = logCustomLogField;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20250113BehaviorLogCustom build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20250113BehaviorLogCustom();
            _resultValue.customLogField = customLogField;
            _resultValue.locked = locked;
            _resultValue.logCustomLogField = logCustomLogField;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
