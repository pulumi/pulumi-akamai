// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs();

    /**
     * Enables advanced options.
     * 
     */
    @Import(name="advanced")
    private @Nullable Output<Boolean> advanced;

    /**
     * @return Enables advanced options.
     * 
     */
    public Optional<Output<Boolean>> advanced() {
        return Optional.ofNullable(this.advanced);
    }

    /**
     * Specifies the percentage for sampling.
     * 
     */
    @Import(name="beaconSamplingPercentage")
    private @Nullable Output<Double> beaconSamplingPercentage;

    /**
     * @return Specifies the percentage for sampling.
     * 
     */
    public Optional<Output<Double>> beaconSamplingPercentage() {
        return Optional.ofNullable(this.beaconSamplingPercentage);
    }

    /**
     * Enables reports on delivery of cloud hosted content at near real-time latencies.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables reports on delivery of cloud hosted content at near real-time latencies.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * This option is for internal usage only.
     * 
     */
    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    /**
     * A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs(GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs $) {
        this.advanced = $.advanced;
        this.beaconSamplingPercentage = $.beaconSamplingPercentage;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advanced Enables advanced options.
         * 
         * @return builder
         * 
         */
        public Builder advanced(@Nullable Output<Boolean> advanced) {
            $.advanced = advanced;
            return this;
        }

        /**
         * @param advanced Enables advanced options.
         * 
         * @return builder
         * 
         */
        public Builder advanced(Boolean advanced) {
            return advanced(Output.of(advanced));
        }

        /**
         * @param beaconSamplingPercentage Specifies the percentage for sampling.
         * 
         * @return builder
         * 
         */
        public Builder beaconSamplingPercentage(@Nullable Output<Double> beaconSamplingPercentage) {
            $.beaconSamplingPercentage = beaconSamplingPercentage;
            return this;
        }

        /**
         * @param beaconSamplingPercentage Specifies the percentage for sampling.
         * 
         * @return builder
         * 
         */
        public Builder beaconSamplingPercentage(Double beaconSamplingPercentage) {
            return beaconSamplingPercentage(Output.of(beaconSamplingPercentage));
        }

        /**
         * @param enabled Enables reports on delivery of cloud hosted content at near real-time latencies.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables reports on delivery of cloud hosted content at near real-time latencies.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorRealTimeReportingArgs build() {
            return $;
        }
    }

}
