// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs Empty = new GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs();

    /**
     * If using session persistence, this specifies the value of the cookie named in the corresponding `edgeLoadBalancingOrigin` behavior&#39;s `cookie_name` option.
     * 
     */
    @Import(name="cookieName")
    private @Nullable Output<String> cookieName;

    /**
     * @return If using session persistence, this specifies the value of the cookie named in the corresponding `edgeLoadBalancingOrigin` behavior&#39;s `cookie_name` option.
     * 
     */
    public Optional<Output<String>> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }

    /**
     * Provides a description for the ELB data center, for your own reference.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Provides a description for the ELB data center, for your own reference.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Allows you to specify failover rules.
     * 
     */
    @Import(name="enableFailover")
    private @Nullable Output<Boolean> enableFailover;

    /**
     * @return Allows you to specify failover rules.
     * 
     */
    public Optional<Output<Boolean>> enableFailover() {
        return Optional.ofNullable(this.enableFailover);
    }

    /**
     * Provides up to four failover rules to apply in the specified order.
     * 
     */
    @Import(name="failoverRules")
    private @Nullable Output<List<GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs>> failoverRules;

    /**
     * @return Provides up to four failover rules to apply in the specified order.
     * 
     */
    public Optional<Output<List<GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs>>> failoverRules() {
        return Optional.ofNullable(this.failoverRules);
    }

    /**
     * This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    @Import(name="failoverTitle")
    private @Nullable Output<String> failoverTitle;

    /**
     * @return This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    public Optional<Output<String>> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }

    /**
     * Specifies the data center&#39;s hostname.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Specifies the data center&#39;s hostname.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Specifies this data center&#39;s IP address.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return Specifies this data center&#39;s IP address.
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
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
     * Corresponds to the `id` specified by the `edgeLoadBalancingOrigin` behavior associated with this data center.
     * 
     */
    @Import(name="originId")
    private @Nullable Output<String> originId;

    /**
     * @return Corresponds to the `id` specified by the `edgeLoadBalancingOrigin` behavior associated with this data center.
     * 
     */
    public Optional<Output<String>> originId() {
        return Optional.ofNullable(this.originId);
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

    private GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs() {}

    private GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs(GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs $) {
        this.cookieName = $.cookieName;
        this.description = $.description;
        this.enableFailover = $.enableFailover;
        this.failoverRules = $.failoverRules;
        this.failoverTitle = $.failoverTitle;
        this.hostname = $.hostname;
        this.ip = $.ip;
        this.locked = $.locked;
        this.originId = $.originId;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cookieName If using session persistence, this specifies the value of the cookie named in the corresponding `edgeLoadBalancingOrigin` behavior&#39;s `cookie_name` option.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(@Nullable Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        /**
         * @param cookieName If using session persistence, this specifies the value of the cookie named in the corresponding `edgeLoadBalancingOrigin` behavior&#39;s `cookie_name` option.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
        }

        /**
         * @param description Provides a description for the ELB data center, for your own reference.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Provides a description for the ELB data center, for your own reference.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableFailover Allows you to specify failover rules.
         * 
         * @return builder
         * 
         */
        public Builder enableFailover(@Nullable Output<Boolean> enableFailover) {
            $.enableFailover = enableFailover;
            return this;
        }

        /**
         * @param enableFailover Allows you to specify failover rules.
         * 
         * @return builder
         * 
         */
        public Builder enableFailover(Boolean enableFailover) {
            return enableFailover(Output.of(enableFailover));
        }

        /**
         * @param failoverRules Provides up to four failover rules to apply in the specified order.
         * 
         * @return builder
         * 
         */
        public Builder failoverRules(@Nullable Output<List<GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs>> failoverRules) {
            $.failoverRules = failoverRules;
            return this;
        }

        /**
         * @param failoverRules Provides up to four failover rules to apply in the specified order.
         * 
         * @return builder
         * 
         */
        public Builder failoverRules(List<GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs> failoverRules) {
            return failoverRules(Output.of(failoverRules));
        }

        /**
         * @param failoverRules Provides up to four failover rules to apply in the specified order.
         * 
         * @return builder
         * 
         */
        public Builder failoverRules(GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs... failoverRules) {
            return failoverRules(List.of(failoverRules));
        }

        /**
         * @param failoverTitle This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
         * 
         * @return builder
         * 
         */
        public Builder failoverTitle(@Nullable Output<String> failoverTitle) {
            $.failoverTitle = failoverTitle;
            return this;
        }

        /**
         * @param failoverTitle This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
         * 
         * @return builder
         * 
         */
        public Builder failoverTitle(String failoverTitle) {
            return failoverTitle(Output.of(failoverTitle));
        }

        /**
         * @param hostname Specifies the data center&#39;s hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Specifies the data center&#39;s hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ip Specifies this data center&#39;s IP address.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip Specifies this data center&#39;s IP address.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
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
         * @param originId Corresponds to the `id` specified by the `edgeLoadBalancingOrigin` behavior associated with this data center.
         * 
         * @return builder
         * 
         */
        public Builder originId(@Nullable Output<String> originId) {
            $.originId = originId;
            return this;
        }

        /**
         * @param originId Corresponds to the `id` specified by the `edgeLoadBalancingOrigin` behavior associated with this data center.
         * 
         * @return builder
         * 
         */
        public Builder originId(String originId) {
            return originId(Output.of(originId));
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

        public GetPropertyRulesBuilderRulesV20240531BehaviorEdgeLoadBalancingDataCenterArgs build() {
            return $;
        }
    }

}
