// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs();

    /**
     * The unit of measurement, either `SECONDS` of the elapsed download time, or `BYTES` of the file size.
     * 
     */
    @Import(name="thresholdUnit")
    private @Nullable Output<String> thresholdUnit;

    /**
     * @return The unit of measurement, either `SECONDS` of the elapsed download time, or `BYTES` of the file size.
     * 
     */
    public Optional<Output<String>> thresholdUnit() {
        return Optional.ofNullable(this.thresholdUnit);
    }

    /**
     * The numeric indicator of the minimum file size or elapsed download time.
     * 
     */
    @Import(name="thresholdValue")
    private @Nullable Output<Integer> thresholdValue;

    /**
     * @return The numeric indicator of the minimum file size or elapsed download time.
     * 
     */
    public Optional<Output<Integer>> thresholdValue() {
        return Optional.ofNullable(this.thresholdValue);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs $) {
        this.thresholdUnit = $.thresholdUnit;
        this.thresholdValue = $.thresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param thresholdUnit The unit of measurement, either `SECONDS` of the elapsed download time, or `BYTES` of the file size.
         * 
         * @return builder
         * 
         */
        public Builder thresholdUnit(@Nullable Output<String> thresholdUnit) {
            $.thresholdUnit = thresholdUnit;
            return this;
        }

        /**
         * @param thresholdUnit The unit of measurement, either `SECONDS` of the elapsed download time, or `BYTES` of the file size.
         * 
         * @return builder
         * 
         */
        public Builder thresholdUnit(String thresholdUnit) {
            return thresholdUnit(Output.of(thresholdUnit));
        }

        /**
         * @param thresholdValue The numeric indicator of the minimum file size or elapsed download time.
         * 
         * @return builder
         * 
         */
        public Builder thresholdValue(@Nullable Output<Integer> thresholdValue) {
            $.thresholdValue = thresholdValue;
            return this;
        }

        /**
         * @param thresholdValue The numeric indicator of the minimum file size or elapsed download time.
         * 
         * @return builder
         * 
         */
        public Builder thresholdValue(Integer thresholdValue) {
            return thresholdValue(Output.of(thresholdValue));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateThresholdTableArgs build() {
            return $;
        }
    }

}
