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


public final class GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting Empty = new GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting();

    /**
     * Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    @Import(name="attribute1")
    private @Nullable String attribute1;

    /**
     * @return Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    public Optional<String> attribute1() {
        return Optional.ofNullable(this.attribute1);
    }

    /**
     * Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    @Import(name="attribute2")
    private @Nullable String attribute2;

    /**
     * @return Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    public Optional<String> attribute2() {
        return Optional.ofNullable(this.attribute2);
    }

    /**
     * Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    @Import(name="attribute3")
    private @Nullable String attribute3;

    /**
     * @return Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    public Optional<String> attribute3() {
        return Optional.ofNullable(this.attribute3);
    }

    /**
     * Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    @Import(name="attribute4")
    private @Nullable String attribute4;

    /**
     * @return Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
     * 
     */
    public Optional<String> attribute4() {
        return Optional.ofNullable(this.attribute4);
    }

    /**
     * The number of attributes to include in the report, ranging from 1 to 4.
     * 
     */
    @Import(name="attributesCount")
    private @Nullable Integer attributesCount;

    /**
     * @return The number of attributes to include in the report, ranging from 1 to 4.
     * 
     */
    public Optional<Integer> attributesCount() {
        return Optional.ofNullable(this.attributesCount);
    }

    /**
     * Enables aggregated reporting.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Enables aggregated reporting.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
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
     * The unique name of the aggregated report within the property. If you reconfigure any attributes or variables in the aggregated reporting behavior, update this field to a unique value to enable logging data in a new instance of the report.
     * 
     */
    @Import(name="reportName")
    private @Nullable String reportName;

    /**
     * @return The unique name of the aggregated report within the property. If you reconfigure any attributes or variables in the aggregated reporting behavior, update this field to a unique value to enable logging data in a new instance of the report.
     * 
     */
    public Optional<String> reportName() {
        return Optional.ofNullable(this.reportName);
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

    private GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting() {}

    private GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting(GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting $) {
        this.attribute1 = $.attribute1;
        this.attribute2 = $.attribute2;
        this.attribute3 = $.attribute3;
        this.attribute4 = $.attribute4;
        this.attributesCount = $.attributesCount;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.reportName = $.reportName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting();
        }

        public Builder(GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting defaults) {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute1 Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
         * 
         * @return builder
         * 
         */
        public Builder attribute1(@Nullable String attribute1) {
            $.attribute1 = attribute1;
            return this;
        }

        /**
         * @param attribute2 Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
         * 
         * @return builder
         * 
         */
        public Builder attribute2(@Nullable String attribute2) {
            $.attribute2 = attribute2;
            return this;
        }

        /**
         * @param attribute3 Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
         * 
         * @return builder
         * 
         */
        public Builder attribute3(@Nullable String attribute3) {
            $.attribute3 = attribute3;
            return this;
        }

        /**
         * @param attribute4 Specify a previously user-defined variable name as a report attribute. The values extracted for all attributes range from 0 to 20 characters.
         * 
         * @return builder
         * 
         */
        public Builder attribute4(@Nullable String attribute4) {
            $.attribute4 = attribute4;
            return this;
        }

        /**
         * @param attributesCount The number of attributes to include in the report, ranging from 1 to 4.
         * 
         * @return builder
         * 
         */
        public Builder attributesCount(@Nullable Integer attributesCount) {
            $.attributesCount = attributesCount;
            return this;
        }

        /**
         * @param enabled Enables aggregated reporting.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
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
         * @param reportName The unique name of the aggregated report within the property. If you reconfigure any attributes or variables in the aggregated reporting behavior, update this field to a unique value to enable logging data in a new instance of the report.
         * 
         * @return builder
         * 
         */
        public Builder reportName(@Nullable String reportName) {
            $.reportName = reportName;
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
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20231030BehaviorAggregatedReporting build() {
            return $;
        }
    }

}
