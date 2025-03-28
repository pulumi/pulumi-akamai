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
public final class GetPropertyRulesBuilderRulesV20240813BehaviorHsafEipBinding {
    /**
     * @return Whether to pull the serial number from the variable value set in the `advanced` behavior. Work with your Akamai Services team to add the `advanced` behavior earlier in your property to extract and apply the `AKA_PM_EIP_HSAF_SERIAL` variable.
     * 
     */
    private @Nullable Boolean customExtractedSerial;
    /**
     * @return Enables HSAF for Edge IP Binding customers with a large footprint.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Specifies the maximum value for the hash range, from 3 through 2046. This needs to be higher than `hashMinValue`.
     * 
     */
    private @Nullable Integer hashMaxValue;
    /**
     * @return Specifies the minimum value for the HSAF hash range, from 2 through 2045. This needs to be lower than `hashMaxValue`.
     * 
     */
    private @Nullable Integer hashMinValue;
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
     * @return Specifies where the behavior is applied.
     * 
     */
    private @Nullable String tier;
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20240813BehaviorHsafEipBinding() {}
    /**
     * @return Whether to pull the serial number from the variable value set in the `advanced` behavior. Work with your Akamai Services team to add the `advanced` behavior earlier in your property to extract and apply the `AKA_PM_EIP_HSAF_SERIAL` variable.
     * 
     */
    public Optional<Boolean> customExtractedSerial() {
        return Optional.ofNullable(this.customExtractedSerial);
    }
    /**
     * @return Enables HSAF for Edge IP Binding customers with a large footprint.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Specifies the maximum value for the hash range, from 3 through 2046. This needs to be higher than `hashMinValue`.
     * 
     */
    public Optional<Integer> hashMaxValue() {
        return Optional.ofNullable(this.hashMaxValue);
    }
    /**
     * @return Specifies the minimum value for the HSAF hash range, from 2 through 2045. This needs to be lower than `hashMaxValue`.
     * 
     */
    public Optional<Integer> hashMinValue() {
        return Optional.ofNullable(this.hashMinValue);
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
     * @return Specifies where the behavior is applied.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20240813BehaviorHsafEipBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean customExtractedSerial;
        private @Nullable Boolean enabled;
        private @Nullable Integer hashMaxValue;
        private @Nullable Integer hashMinValue;
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable String tier;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20240813BehaviorHsafEipBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customExtractedSerial = defaults.customExtractedSerial;
    	      this.enabled = defaults.enabled;
    	      this.hashMaxValue = defaults.hashMaxValue;
    	      this.hashMinValue = defaults.hashMinValue;
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.tier = defaults.tier;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder customExtractedSerial(@Nullable Boolean customExtractedSerial) {

            this.customExtractedSerial = customExtractedSerial;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder hashMaxValue(@Nullable Integer hashMaxValue) {

            this.hashMaxValue = hashMaxValue;
            return this;
        }
        @CustomType.Setter
        public Builder hashMinValue(@Nullable Integer hashMinValue) {

            this.hashMinValue = hashMinValue;
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
        public Builder tier(@Nullable String tier) {

            this.tier = tier;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20240813BehaviorHsafEipBinding build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20240813BehaviorHsafEipBinding();
            _resultValue.customExtractedSerial = customExtractedSerial;
            _resultValue.enabled = enabled;
            _resultValue.hashMaxValue = hashMaxValue;
            _resultValue.hashMinValue = hashMinValue;
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.tier = tier;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
