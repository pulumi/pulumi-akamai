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
public final class GetPropertyRulesBuilderRulesV20230920BehaviorSimulateErrorCode {
    /**
     * @return Specifies the type of error.
     * 
     */
    private @Nullable String errorType;
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    private @Nullable Boolean locked;
    /**
     * @return This option is for internal usage only.
     * 
     */
    private @Nullable String templateUuid;
    /**
     * @return When the `errorType` is `ERR_CONNECT_TIMEOUT`, `ERR_DNS_TIMEOUT`, `ERR_SUREROUTE_DNS_FAIL`, or `ERR_READ_TIMEOUT`, generates an error after the specified amount of time from the initial request.
     * 
     */
    private @Nullable String timeout;
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230920BehaviorSimulateErrorCode() {}
    /**
     * @return Specifies the type of error.
     * 
     */
    public Optional<String> errorType() {
        return Optional.ofNullable(this.errorType);
    }
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    /**
     * @return When the `errorType` is `ERR_CONNECT_TIMEOUT`, `ERR_DNS_TIMEOUT`, `ERR_SUREROUTE_DNS_FAIL`, or `ERR_READ_TIMEOUT`, generates an error after the specified amount of time from the initial request.
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230920BehaviorSimulateErrorCode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String errorType;
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable String timeout;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230920BehaviorSimulateErrorCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorType = defaults.errorType;
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.timeout = defaults.timeout;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder errorType(@Nullable String errorType) {

            this.errorType = errorType;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable String timeout) {

            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230920BehaviorSimulateErrorCode build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230920BehaviorSimulateErrorCode();
            _resultValue.errorType = errorType;
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.timeout = timeout;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
