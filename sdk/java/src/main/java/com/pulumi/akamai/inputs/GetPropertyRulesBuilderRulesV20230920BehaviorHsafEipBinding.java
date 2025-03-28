// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding Empty = new GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding();

    /**
     * Whether to pull the serial number from the variable value set in the `advanced` behavior. Work with your Akamai Services team to add the `advanced` behavior earlier in your property to extract and apply the `AKA_PM_EIP_HSAF_SERIAL` variable.
     * 
     */
    @Import(name="customExtractedSerial")
    private @Nullable Boolean customExtractedSerial;

    /**
     * @return Whether to pull the serial number from the variable value set in the `advanced` behavior. Work with your Akamai Services team to add the `advanced` behavior earlier in your property to extract and apply the `AKA_PM_EIP_HSAF_SERIAL` variable.
     * 
     */
    public Optional<Boolean> customExtractedSerial() {
        return Optional.ofNullable(this.customExtractedSerial);
    }

    /**
     * Enables HSAF for Edge IP Binding customers with a large footprint.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Enables HSAF for Edge IP Binding customers with a large footprint.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the maximum value for the hash range, from 3 through 2046. This needs to be higher than `hashMinValue`.
     * 
     */
    @Import(name="hashMaxValue")
    private @Nullable Integer hashMaxValue;

    /**
     * @return Specifies the maximum value for the hash range, from 3 through 2046. This needs to be higher than `hashMinValue`.
     * 
     */
    public Optional<Integer> hashMaxValue() {
        return Optional.ofNullable(this.hashMaxValue);
    }

    /**
     * Specifies the minimum value for the HSAF hash range, from 2 through 2045. This needs to be lower than `hashMaxValue`.
     * 
     */
    @Import(name="hashMinValue")
    private @Nullable Integer hashMinValue;

    /**
     * @return Specifies the minimum value for the HSAF hash range, from 2 through 2045. This needs to be lower than `hashMaxValue`.
     * 
     */
    public Optional<Integer> hashMinValue() {
        return Optional.ofNullable(this.hashMinValue);
    }

    /**
     * Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    @Import(name="locked")
    private @Nullable Boolean locked;

    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * This option is for internal usage only.
     * 
     */
    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    /**
     * Specifies where the behavior is applied.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    /**
     * @return Specifies where the behavior is applied.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    @Import(name="uuid")
    private @Nullable String uuid;

    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding() {}

    private GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding(GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding $) {
        this.customExtractedSerial = $.customExtractedSerial;
        this.enabled = $.enabled;
        this.hashMaxValue = $.hashMaxValue;
        this.hashMinValue = $.hashMinValue;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.tier = $.tier;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding(Objects.requireNonNull(defaults));
        }

        /**
         * @param customExtractedSerial Whether to pull the serial number from the variable value set in the `advanced` behavior. Work with your Akamai Services team to add the `advanced` behavior earlier in your property to extract and apply the `AKA_PM_EIP_HSAF_SERIAL` variable.
         * 
         * @return builder
         * 
         */
        public Builder customExtractedSerial(@Nullable Boolean customExtractedSerial) {
            $.customExtractedSerial = customExtractedSerial;
            return this;
        }

        /**
         * @param enabled Enables HSAF for Edge IP Binding customers with a large footprint.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param hashMaxValue Specifies the maximum value for the hash range, from 3 through 2046. This needs to be higher than `hashMinValue`.
         * 
         * @return builder
         * 
         */
        public Builder hashMaxValue(@Nullable Integer hashMaxValue) {
            $.hashMaxValue = hashMaxValue;
            return this;
        }

        /**
         * @param hashMinValue Specifies the minimum value for the HSAF hash range, from 2 through 2045. This needs to be lower than `hashMaxValue`.
         * 
         * @return builder
         * 
         */
        public Builder hashMinValue(@Nullable Integer hashMinValue) {
            $.hashMinValue = hashMinValue;
            return this;
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        /**
         * @param tier Specifies where the behavior is applied.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230920BehaviorHsafEipBinding build() {
            return $;
        }
    }

}
