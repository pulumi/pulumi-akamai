// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorResponseCode {
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    private @Nullable Boolean locked;
    /**
     * @return Allows any specified `200` success code to override a `206` partial-content code, in which case the response&#39;s content length matches the requested range length.
     * 
     */
    private @Nullable Boolean override206;
    /**
     * @return The HTTP status code to replace the existing one.
     * 
     */
    private @Nullable Integer statusCode;
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorResponseCode() {}
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    /**
     * @return Allows any specified `200` success code to override a `206` partial-content code, in which case the response&#39;s content length matches the requested range length.
     * 
     */
    public Optional<Boolean> override206() {
        return Optional.ofNullable(this.override206);
    }
    /**
     * @return The HTTP status code to replace the existing one.
     * 
     */
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorResponseCode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable Boolean override206;
        private @Nullable Integer statusCode;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorResponseCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.override206 = defaults.override206;
    	      this.statusCode = defaults.statusCode;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder override206(@Nullable Boolean override206) {

            this.override206 = override206;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {

            this.statusCode = statusCode;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorResponseCode build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorResponseCode();
            _resultValue.locked = locked;
            _resultValue.override206 = override206;
            _resultValue.statusCode = statusCode;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
