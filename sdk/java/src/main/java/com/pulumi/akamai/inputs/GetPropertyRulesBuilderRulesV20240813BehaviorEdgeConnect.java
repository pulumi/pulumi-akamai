// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect Empty = new GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect();

    /**
     * Specifies the maximum number of lines to include in each log.
     * 
     */
    @Import(name="aggregateLines")
    private @Nullable String aggregateLines;

    /**
     * @return Specifies the maximum number of lines to include in each log.
     * 
     */
    public Optional<String> aggregateLines() {
        return Optional.ofNullable(this.aggregateLines);
    }

    /**
     * Specifies the log&#39;s maximum size.
     * 
     */
    @Import(name="aggregateSize")
    private @Nullable String aggregateSize;

    /**
     * @return Specifies the log&#39;s maximum size.
     * 
     */
    public Optional<String> aggregateSize() {
        return Optional.ofNullable(this.aggregateSize);
    }

    /**
     * Specifies how often logs are generated.
     * 
     */
    @Import(name="aggregateTime")
    private @Nullable String aggregateTime;

    /**
     * @return Specifies how often logs are generated.
     * 
     */
    public Optional<String> aggregateTime() {
        return Optional.ofNullable(this.aggregateTime);
    }

    /**
     * Describes the API connector type.
     * 
     */
    @Import(name="apiConnector")
    private @Nullable String apiConnector;

    /**
     * @return Describes the API connector type.
     * 
     */
    public Optional<String> apiConnector() {
        return Optional.ofNullable(this.apiConnector);
    }

    /**
     * Specifies the data set to log.
     * 
     */
    @Import(name="apiDataElements")
    private @Nullable List<String> apiDataElements;

    /**
     * @return Specifies the data set to log.
     * 
     */
    public Optional<List<String>> apiDataElements() {
        return Optional.ofNullable(this.apiDataElements);
    }

    /**
     * Specifies the target hostname accepting push API requests.
     * 
     */
    @Import(name="destinationHostname")
    private @Nullable String destinationHostname;

    /**
     * @return Specifies the target hostname accepting push API requests.
     * 
     */
    public Optional<String> destinationHostname() {
        return Optional.ofNullable(this.destinationHostname);
    }

    /**
     * Specifies the push API&#39;s endpoint.
     * 
     */
    @Import(name="destinationPath")
    private @Nullable String destinationPath;

    /**
     * @return Specifies the push API&#39;s endpoint.
     * 
     */
    public Optional<String> destinationPath() {
        return Optional.ofNullable(this.destinationPath);
    }

    /**
     * Enables Cloud Monitor&#39;s log-publishing behavior.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Enables Cloud Monitor&#39;s log-publishing behavior.
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
     * When enabled, overrides default log settings.
     * 
     */
    @Import(name="overrideAggregateSettings")
    private @Nullable Boolean overrideAggregateSettings;

    /**
     * @return When enabled, overrides default log settings.
     * 
     */
    public Optional<Boolean> overrideAggregateSettings() {
        return Optional.ofNullable(this.overrideAggregateSettings);
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

    private GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect() {}

    private GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect(GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect $) {
        this.aggregateLines = $.aggregateLines;
        this.aggregateSize = $.aggregateSize;
        this.aggregateTime = $.aggregateTime;
        this.apiConnector = $.apiConnector;
        this.apiDataElements = $.apiDataElements;
        this.destinationHostname = $.destinationHostname;
        this.destinationPath = $.destinationPath;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.overrideAggregateSettings = $.overrideAggregateSettings;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregateLines Specifies the maximum number of lines to include in each log.
         * 
         * @return builder
         * 
         */
        public Builder aggregateLines(@Nullable String aggregateLines) {
            $.aggregateLines = aggregateLines;
            return this;
        }

        /**
         * @param aggregateSize Specifies the log&#39;s maximum size.
         * 
         * @return builder
         * 
         */
        public Builder aggregateSize(@Nullable String aggregateSize) {
            $.aggregateSize = aggregateSize;
            return this;
        }

        /**
         * @param aggregateTime Specifies how often logs are generated.
         * 
         * @return builder
         * 
         */
        public Builder aggregateTime(@Nullable String aggregateTime) {
            $.aggregateTime = aggregateTime;
            return this;
        }

        /**
         * @param apiConnector Describes the API connector type.
         * 
         * @return builder
         * 
         */
        public Builder apiConnector(@Nullable String apiConnector) {
            $.apiConnector = apiConnector;
            return this;
        }

        /**
         * @param apiDataElements Specifies the data set to log.
         * 
         * @return builder
         * 
         */
        public Builder apiDataElements(@Nullable List<String> apiDataElements) {
            $.apiDataElements = apiDataElements;
            return this;
        }

        /**
         * @param apiDataElements Specifies the data set to log.
         * 
         * @return builder
         * 
         */
        public Builder apiDataElements(String... apiDataElements) {
            return apiDataElements(List.of(apiDataElements));
        }

        /**
         * @param destinationHostname Specifies the target hostname accepting push API requests.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostname(@Nullable String destinationHostname) {
            $.destinationHostname = destinationHostname;
            return this;
        }

        /**
         * @param destinationPath Specifies the push API&#39;s endpoint.
         * 
         * @return builder
         * 
         */
        public Builder destinationPath(@Nullable String destinationPath) {
            $.destinationPath = destinationPath;
            return this;
        }

        /**
         * @param enabled Enables Cloud Monitor&#39;s log-publishing behavior.
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
         * @param overrideAggregateSettings When enabled, overrides default log settings.
         * 
         * @return builder
         * 
         */
        public Builder overrideAggregateSettings(@Nullable Boolean overrideAggregateSettings) {
            $.overrideAggregateSettings = overrideAggregateSettings;
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

        public GetPropertyRulesBuilderRulesV20240813BehaviorEdgeConnect build() {
            return $;
        }
    }

}
