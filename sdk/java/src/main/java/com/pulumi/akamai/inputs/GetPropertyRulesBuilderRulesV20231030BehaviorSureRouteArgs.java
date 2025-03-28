// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs Empty = new GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs();

    @Import(name="allowFcmParentOverride")
    private @Nullable Output<Boolean> allowFcmParentOverride;

    public Optional<Output<Boolean>> allowFcmParentOverride() {
        return Optional.ofNullable(this.allowFcmParentOverride);
    }

    /**
     * If `type` is `CUSTOM_MAP`, this specifies the map string provided to you by Akamai Professional Services, or included as part of the `Site Shield` product.
     * 
     */
    @Import(name="customMap")
    private @Nullable Output<String> customMap;

    /**
     * @return If `type` is `CUSTOM_MAP`, this specifies the map string provided to you by Akamai Professional Services, or included as part of the `Site Shield` product.
     * 
     */
    public Optional<Output<String>> customMap() {
        return Optional.ofNullable(this.customMap);
    }

    /**
     * This specifies a hostname under which to cache race results. This may be useful when a property corresponds to many origin hostnames. By default, SureRoute would launch races for each origin, but consolidating under a single hostname runs only one race.
     * 
     */
    @Import(name="customStatKey")
    private @Nullable Output<String> customStatKey;

    /**
     * @return This specifies a hostname under which to cache race results. This may be useful when a property corresponds to many origin hostnames. By default, SureRoute would launch races for each origin, but consolidating under a single hostname runs only one race.
     * 
     */
    public Optional<Output<String>> customStatKey() {
        return Optional.ofNullable(this.customStatKey);
    }

    /**
     * When disabled, caches race results under the race destination&#39;s hostname. If enabled, use `customStatKey` to specify a custom hostname.
     * 
     */
    @Import(name="enableCustomKey")
    private @Nullable Output<Boolean> enableCustomKey;

    /**
     * @return When disabled, caches race results under the race destination&#39;s hostname. If enabled, use `customStatKey` to specify a custom hostname.
     * 
     */
    public Optional<Output<Boolean>> enableCustomKey() {
        return Optional.ofNullable(this.enableCustomKey);
    }

    /**
     * Enables the SureRoute behavior, to optimize delivery of non-cached content.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables the SureRoute behavior, to optimize delivery of non-cached content.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Forces SureRoute to use SSL when requesting the origin&#39;s test object, appropriate if your origin does not respond to HTTP requests, or responds with a redirect to HTTPS.
     * 
     */
    @Import(name="forceSslForward")
    private @Nullable Output<Boolean> forceSslForward;

    /**
     * @return Forces SureRoute to use SSL when requesting the origin&#39;s test object, appropriate if your origin does not respond to HTTP requests, or responds with a redirect to HTTPS.
     * 
     */
    public Optional<Output<Boolean>> forceSslForward() {
        return Optional.ofNullable(this.forceSslForward);
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
     * Specifies the time-to-live to preserve SureRoute race results, typically `30m`. If traffic exceeds a certain threshold after TTL expires, the overflow is routed directly to the origin, not necessarily optimally. If traffic remains under the threshold, the route is determined by the winner of the most recent race.
     * 
     */
    @Import(name="raceStatTtl")
    private @Nullable Output<String> raceStatTtl;

    /**
     * @return Specifies the time-to-live to preserve SureRoute race results, typically `30m`. If traffic exceeds a certain threshold after TTL expires, the overflow is routed directly to the origin, not necessarily optimally. If traffic remains under the threshold, the route is determined by the winner of the most recent race.
     * 
     */
    public Optional<Output<String>> raceStatTtl() {
        return Optional.ofNullable(this.raceStatTtl);
    }

    /**
     * This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    @Import(name="srDownloadLinkTitle")
    private @Nullable Output<String> srDownloadLinkTitle;

    /**
     * @return This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    public Optional<Output<String>> srDownloadLinkTitle() {
        return Optional.ofNullable(this.srDownloadLinkTitle);
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
     * Specifies the path and filename for your origin&#39;s test object to use in races to test routes.
     * 
     */
    @Import(name="testObjectUrl")
    private @Nullable Output<String> testObjectUrl;

    /**
     * @return Specifies the path and filename for your origin&#39;s test object to use in races to test routes.
     * 
     */
    public Optional<Output<String>> testObjectUrl() {
        return Optional.ofNullable(this.testObjectUrl);
    }

    /**
     * If `toHostStatus` is `OTHER`, this specifies the custom `Host` header to use when requesting the SureRoute test object.
     * 
     */
    @Import(name="toHost")
    private @Nullable Output<String> toHost;

    /**
     * @return If `toHostStatus` is `OTHER`, this specifies the custom `Host` header to use when requesting the SureRoute test object.
     * 
     */
    public Optional<Output<String>> toHost() {
        return Optional.ofNullable(this.toHost);
    }

    /**
     * Specifies which hostname to use.
     * 
     */
    @Import(name="toHostStatus")
    private @Nullable Output<String> toHostStatus;

    /**
     * @return Specifies which hostname to use.
     * 
     */
    public Optional<Output<String>> toHostStatus() {
        return Optional.ofNullable(this.toHostStatus);
    }

    /**
     * Specifies the set of edge servers used to test routes.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the set of edge servers used to test routes.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
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

    private GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs() {}

    private GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs(GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs $) {
        this.allowFcmParentOverride = $.allowFcmParentOverride;
        this.customMap = $.customMap;
        this.customStatKey = $.customStatKey;
        this.enableCustomKey = $.enableCustomKey;
        this.enabled = $.enabled;
        this.forceSslForward = $.forceSslForward;
        this.locked = $.locked;
        this.raceStatTtl = $.raceStatTtl;
        this.srDownloadLinkTitle = $.srDownloadLinkTitle;
        this.templateUuid = $.templateUuid;
        this.testObjectUrl = $.testObjectUrl;
        this.toHost = $.toHost;
        this.toHostStatus = $.toHostStatus;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowFcmParentOverride(@Nullable Output<Boolean> allowFcmParentOverride) {
            $.allowFcmParentOverride = allowFcmParentOverride;
            return this;
        }

        public Builder allowFcmParentOverride(Boolean allowFcmParentOverride) {
            return allowFcmParentOverride(Output.of(allowFcmParentOverride));
        }

        /**
         * @param customMap If `type` is `CUSTOM_MAP`, this specifies the map string provided to you by Akamai Professional Services, or included as part of the `Site Shield` product.
         * 
         * @return builder
         * 
         */
        public Builder customMap(@Nullable Output<String> customMap) {
            $.customMap = customMap;
            return this;
        }

        /**
         * @param customMap If `type` is `CUSTOM_MAP`, this specifies the map string provided to you by Akamai Professional Services, or included as part of the `Site Shield` product.
         * 
         * @return builder
         * 
         */
        public Builder customMap(String customMap) {
            return customMap(Output.of(customMap));
        }

        /**
         * @param customStatKey This specifies a hostname under which to cache race results. This may be useful when a property corresponds to many origin hostnames. By default, SureRoute would launch races for each origin, but consolidating under a single hostname runs only one race.
         * 
         * @return builder
         * 
         */
        public Builder customStatKey(@Nullable Output<String> customStatKey) {
            $.customStatKey = customStatKey;
            return this;
        }

        /**
         * @param customStatKey This specifies a hostname under which to cache race results. This may be useful when a property corresponds to many origin hostnames. By default, SureRoute would launch races for each origin, but consolidating under a single hostname runs only one race.
         * 
         * @return builder
         * 
         */
        public Builder customStatKey(String customStatKey) {
            return customStatKey(Output.of(customStatKey));
        }

        /**
         * @param enableCustomKey When disabled, caches race results under the race destination&#39;s hostname. If enabled, use `customStatKey` to specify a custom hostname.
         * 
         * @return builder
         * 
         */
        public Builder enableCustomKey(@Nullable Output<Boolean> enableCustomKey) {
            $.enableCustomKey = enableCustomKey;
            return this;
        }

        /**
         * @param enableCustomKey When disabled, caches race results under the race destination&#39;s hostname. If enabled, use `customStatKey` to specify a custom hostname.
         * 
         * @return builder
         * 
         */
        public Builder enableCustomKey(Boolean enableCustomKey) {
            return enableCustomKey(Output.of(enableCustomKey));
        }

        /**
         * @param enabled Enables the SureRoute behavior, to optimize delivery of non-cached content.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables the SureRoute behavior, to optimize delivery of non-cached content.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param forceSslForward Forces SureRoute to use SSL when requesting the origin&#39;s test object, appropriate if your origin does not respond to HTTP requests, or responds with a redirect to HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder forceSslForward(@Nullable Output<Boolean> forceSslForward) {
            $.forceSslForward = forceSslForward;
            return this;
        }

        /**
         * @param forceSslForward Forces SureRoute to use SSL when requesting the origin&#39;s test object, appropriate if your origin does not respond to HTTP requests, or responds with a redirect to HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder forceSslForward(Boolean forceSslForward) {
            return forceSslForward(Output.of(forceSslForward));
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
         * @param raceStatTtl Specifies the time-to-live to preserve SureRoute race results, typically `30m`. If traffic exceeds a certain threshold after TTL expires, the overflow is routed directly to the origin, not necessarily optimally. If traffic remains under the threshold, the route is determined by the winner of the most recent race.
         * 
         * @return builder
         * 
         */
        public Builder raceStatTtl(@Nullable Output<String> raceStatTtl) {
            $.raceStatTtl = raceStatTtl;
            return this;
        }

        /**
         * @param raceStatTtl Specifies the time-to-live to preserve SureRoute race results, typically `30m`. If traffic exceeds a certain threshold after TTL expires, the overflow is routed directly to the origin, not necessarily optimally. If traffic remains under the threshold, the route is determined by the winner of the most recent race.
         * 
         * @return builder
         * 
         */
        public Builder raceStatTtl(String raceStatTtl) {
            return raceStatTtl(Output.of(raceStatTtl));
        }

        /**
         * @param srDownloadLinkTitle This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
         * 
         * @return builder
         * 
         */
        public Builder srDownloadLinkTitle(@Nullable Output<String> srDownloadLinkTitle) {
            $.srDownloadLinkTitle = srDownloadLinkTitle;
            return this;
        }

        /**
         * @param srDownloadLinkTitle This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
         * 
         * @return builder
         * 
         */
        public Builder srDownloadLinkTitle(String srDownloadLinkTitle) {
            return srDownloadLinkTitle(Output.of(srDownloadLinkTitle));
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
         * @param testObjectUrl Specifies the path and filename for your origin&#39;s test object to use in races to test routes.
         * 
         * @return builder
         * 
         */
        public Builder testObjectUrl(@Nullable Output<String> testObjectUrl) {
            $.testObjectUrl = testObjectUrl;
            return this;
        }

        /**
         * @param testObjectUrl Specifies the path and filename for your origin&#39;s test object to use in races to test routes.
         * 
         * @return builder
         * 
         */
        public Builder testObjectUrl(String testObjectUrl) {
            return testObjectUrl(Output.of(testObjectUrl));
        }

        /**
         * @param toHost If `toHostStatus` is `OTHER`, this specifies the custom `Host` header to use when requesting the SureRoute test object.
         * 
         * @return builder
         * 
         */
        public Builder toHost(@Nullable Output<String> toHost) {
            $.toHost = toHost;
            return this;
        }

        /**
         * @param toHost If `toHostStatus` is `OTHER`, this specifies the custom `Host` header to use when requesting the SureRoute test object.
         * 
         * @return builder
         * 
         */
        public Builder toHost(String toHost) {
            return toHost(Output.of(toHost));
        }

        /**
         * @param toHostStatus Specifies which hostname to use.
         * 
         * @return builder
         * 
         */
        public Builder toHostStatus(@Nullable Output<String> toHostStatus) {
            $.toHostStatus = toHostStatus;
            return this;
        }

        /**
         * @param toHostStatus Specifies which hostname to use.
         * 
         * @return builder
         * 
         */
        public Builder toHostStatus(String toHostStatus) {
            return toHostStatus(Output.of(toHostStatus));
        }

        /**
         * @param type Specifies the set of edge servers used to test routes.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the set of edge servers used to test routes.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
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

        public GetPropertyRulesBuilderRulesV20231030BehaviorSureRouteArgs build() {
            return $;
        }
    }

}
