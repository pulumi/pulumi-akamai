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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs();

    /**
     * When enabled, overrides the forwarding origin&#39;s cache key.
     * 
     */
    @Import(name="allowOverrideOriginCacheKey")
    private @Nullable Output<Boolean> allowOverrideOriginCacheKey;

    /**
     * @return When enabled, overrides the forwarding origin&#39;s cache key.
     * 
     */
    public Optional<Output<Boolean>> allowOverrideOriginCacheKey() {
        return Optional.ofNullable(this.allowOverrideOriginCacheKey);
    }

    /**
     * An ID value that helps distinguish different types of traffic sent from Akamai to the Salesforce Commerce Cloud. Form the value as `instance-realm-customer`, where `instance` is either `production` or `development`, `realm` is your Salesforce Commerce Cloud service `$REALM` value, and `customer` is the name for your organization in Salesforce Commerce Cloud.  You can use alphanumeric characters, underscores, or dot characters within dash-delimited segment values.
     * 
     */
    @Import(name="connectorId")
    private @Nullable Output<String> connectorId;

    /**
     * @return An ID value that helps distinguish different types of traffic sent from Akamai to the Salesforce Commerce Cloud. Form the value as `instance-realm-customer`, where `instance` is either `production` or `development`, `realm` is your Salesforce Commerce Cloud service `$REALM` value, and `customer` is the name for your organization in Salesforce Commerce Cloud.  You can use alphanumeric characters, underscores, or dot characters within dash-delimited segment values.
     * 
     */
    public Optional<Output<String>> connectorId() {
        return Optional.ofNullable(this.connectorId);
    }

    /**
     * Enables the Akamai Connector for Salesforce Commerce Cloud.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables the Akamai Connector for Salesforce Commerce Cloud.
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
     * Specifies where the `Host` header is defined.
     * 
     */
    @Import(name="originHostHeader")
    private @Nullable Output<String> originHostHeader;

    /**
     * @return Specifies where the `Host` header is defined.
     * 
     */
    public Optional<Output<String>> originHostHeader() {
        return Optional.ofNullable(this.originHostHeader);
    }

    /**
     * Specifies where the origin is.
     * 
     */
    @Import(name="originType")
    private @Nullable Output<String> originType;

    /**
     * @return Specifies where the origin is.
     * 
     */
    public Optional<Output<String>> originType() {
        return Optional.ofNullable(this.originType);
    }

    /**
     * This specifies the hostname or IP address of the custom Salesforce origin.
     * 
     */
    @Import(name="sf3cOriginHost")
    private @Nullable Output<String> sf3cOriginHost;

    /**
     * @return This specifies the hostname or IP address of the custom Salesforce origin.
     * 
     */
    public Optional<Output<String>> sf3cOriginHost() {
        return Optional.ofNullable(this.sf3cOriginHost);
    }

    /**
     * This specifies the hostname or IP address of the custom Salesforce host header.
     * 
     */
    @Import(name="sf3cOriginHostHeader")
    private @Nullable Output<String> sf3cOriginHostHeader;

    /**
     * @return This specifies the hostname or IP address of the custom Salesforce host header.
     * 
     */
    public Optional<Output<String>> sf3cOriginHostHeader() {
        return Optional.ofNullable(this.sf3cOriginHostHeader);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs(GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs $) {
        this.allowOverrideOriginCacheKey = $.allowOverrideOriginCacheKey;
        this.connectorId = $.connectorId;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.originHostHeader = $.originHostHeader;
        this.originType = $.originType;
        this.sf3cOriginHost = $.sf3cOriginHost;
        this.sf3cOriginHostHeader = $.sf3cOriginHostHeader;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowOverrideOriginCacheKey When enabled, overrides the forwarding origin&#39;s cache key.
         * 
         * @return builder
         * 
         */
        public Builder allowOverrideOriginCacheKey(@Nullable Output<Boolean> allowOverrideOriginCacheKey) {
            $.allowOverrideOriginCacheKey = allowOverrideOriginCacheKey;
            return this;
        }

        /**
         * @param allowOverrideOriginCacheKey When enabled, overrides the forwarding origin&#39;s cache key.
         * 
         * @return builder
         * 
         */
        public Builder allowOverrideOriginCacheKey(Boolean allowOverrideOriginCacheKey) {
            return allowOverrideOriginCacheKey(Output.of(allowOverrideOriginCacheKey));
        }

        /**
         * @param connectorId An ID value that helps distinguish different types of traffic sent from Akamai to the Salesforce Commerce Cloud. Form the value as `instance-realm-customer`, where `instance` is either `production` or `development`, `realm` is your Salesforce Commerce Cloud service `$REALM` value, and `customer` is the name for your organization in Salesforce Commerce Cloud.  You can use alphanumeric characters, underscores, or dot characters within dash-delimited segment values.
         * 
         * @return builder
         * 
         */
        public Builder connectorId(@Nullable Output<String> connectorId) {
            $.connectorId = connectorId;
            return this;
        }

        /**
         * @param connectorId An ID value that helps distinguish different types of traffic sent from Akamai to the Salesforce Commerce Cloud. Form the value as `instance-realm-customer`, where `instance` is either `production` or `development`, `realm` is your Salesforce Commerce Cloud service `$REALM` value, and `customer` is the name for your organization in Salesforce Commerce Cloud.  You can use alphanumeric characters, underscores, or dot characters within dash-delimited segment values.
         * 
         * @return builder
         * 
         */
        public Builder connectorId(String connectorId) {
            return connectorId(Output.of(connectorId));
        }

        /**
         * @param enabled Enables the Akamai Connector for Salesforce Commerce Cloud.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables the Akamai Connector for Salesforce Commerce Cloud.
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
         * @param originHostHeader Specifies where the `Host` header is defined.
         * 
         * @return builder
         * 
         */
        public Builder originHostHeader(@Nullable Output<String> originHostHeader) {
            $.originHostHeader = originHostHeader;
            return this;
        }

        /**
         * @param originHostHeader Specifies where the `Host` header is defined.
         * 
         * @return builder
         * 
         */
        public Builder originHostHeader(String originHostHeader) {
            return originHostHeader(Output.of(originHostHeader));
        }

        /**
         * @param originType Specifies where the origin is.
         * 
         * @return builder
         * 
         */
        public Builder originType(@Nullable Output<String> originType) {
            $.originType = originType;
            return this;
        }

        /**
         * @param originType Specifies where the origin is.
         * 
         * @return builder
         * 
         */
        public Builder originType(String originType) {
            return originType(Output.of(originType));
        }

        /**
         * @param sf3cOriginHost This specifies the hostname or IP address of the custom Salesforce origin.
         * 
         * @return builder
         * 
         */
        public Builder sf3cOriginHost(@Nullable Output<String> sf3cOriginHost) {
            $.sf3cOriginHost = sf3cOriginHost;
            return this;
        }

        /**
         * @param sf3cOriginHost This specifies the hostname or IP address of the custom Salesforce origin.
         * 
         * @return builder
         * 
         */
        public Builder sf3cOriginHost(String sf3cOriginHost) {
            return sf3cOriginHost(Output.of(sf3cOriginHost));
        }

        /**
         * @param sf3cOriginHostHeader This specifies the hostname or IP address of the custom Salesforce host header.
         * 
         * @return builder
         * 
         */
        public Builder sf3cOriginHostHeader(@Nullable Output<String> sf3cOriginHostHeader) {
            $.sf3cOriginHostHeader = sf3cOriginHostHeader;
            return this;
        }

        /**
         * @param sf3cOriginHostHeader This specifies the hostname or IP address of the custom Salesforce host header.
         * 
         * @return builder
         * 
         */
        public Builder sf3cOriginHostHeader(String sf3cOriginHostHeader) {
            return sf3cOriginHostHeader(Output.of(sf3cOriginHostHeader));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs build() {
            return $;
        }
    }

}
