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


public final class GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection Empty = new GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection();

    /**
     * Specifies a set of two-character ISO 3166 country codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
     * 
     */
    @Import(name="countries")
    private @Nullable List<String> countries;

    /**
     * @return Specifies a set of two-character ISO 3166 country codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
     * 
     */
    public Optional<List<String>> countries() {
        return Optional.ofNullable(this.countries);
    }

    /**
     * Specifies the set of Designated Market Area codes from which to allow or deny traffic.  See `EdgeScape Data Codes` for a list.
     * 
     */
    @Import(name="dmas")
    private @Nullable List<String> dmas;

    /**
     * @return Specifies the set of Designated Market Area codes from which to allow or deny traffic.  See `EdgeScape Data Codes` for a list.
     * 
     */
    public Optional<List<String>> dmas() {
        return Optional.ofNullable(this.dmas);
    }

    /**
     * When enabled, verifies IP addresses are unique to specific geographic regions.
     * 
     */
    @Import(name="enableGeoProtection")
    private @Nullable Boolean enableGeoProtection;

    /**
     * @return When enabled, verifies IP addresses are unique to specific geographic regions.
     * 
     */
    public Optional<Boolean> enableGeoProtection() {
        return Optional.ofNullable(this.enableGeoProtection);
    }

    /**
     * When enabled, redirects denied requests rather than responding with an error code.
     * 
     */
    @Import(name="enableGeoRedirectOnDeny")
    private @Nullable Boolean enableGeoRedirectOnDeny;

    /**
     * @return When enabled, redirects denied requests rather than responding with an error code.
     * 
     */
    public Optional<Boolean> enableGeoRedirectOnDeny() {
        return Optional.ofNullable(this.enableGeoRedirectOnDeny);
    }

    /**
     * Allows you to control access to your content from specific sets of IP addresses and CIDR blocks.
     * 
     */
    @Import(name="enableIpProtection")
    private @Nullable Boolean enableIpProtection;

    /**
     * @return Allows you to control access to your content from specific sets of IP addresses and CIDR blocks.
     * 
     */
    public Optional<Boolean> enableIpProtection() {
        return Optional.ofNullable(this.enableIpProtection);
    }

    /**
     * When enabled, redirects denied requests rather than responding with an error code.
     * 
     */
    @Import(name="enableIpRedirectOnDeny")
    private @Nullable Boolean enableIpRedirectOnDeny;

    /**
     * @return When enabled, redirects denied requests rather than responding with an error code.
     * 
     */
    public Optional<Boolean> enableIpRedirectOnDeny() {
        return Optional.ofNullable(this.enableIpRedirectOnDeny);
    }

    /**
     * Allows you allow traffic from certain referring websites, and disallow traffic from unauthorized sites that hijack those links.
     * 
     */
    @Import(name="enableReferrerProtection")
    private @Nullable Boolean enableReferrerProtection;

    /**
     * @return Allows you allow traffic from certain referring websites, and disallow traffic from unauthorized sites that hijack those links.
     * 
     */
    public Optional<Boolean> enableReferrerProtection() {
        return Optional.ofNullable(this.enableReferrerProtection);
    }

    /**
     * When enabled, redirects denied requests rather than responding with an error code.
     * 
     */
    @Import(name="enableReferrerRedirectOnDeny")
    private @Nullable Boolean enableReferrerRedirectOnDeny;

    /**
     * @return When enabled, redirects denied requests rather than responding with an error code.
     * 
     */
    public Optional<Boolean> enableReferrerRedirectOnDeny() {
        return Optional.ofNullable(this.enableReferrerRedirectOnDeny);
    }

    /**
     * Enables the Content Targeting feature.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Enables the Content Targeting feature.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies how to handle requests.
     * 
     */
    @Import(name="geoProtectionMode")
    private @Nullable String geoProtectionMode;

    /**
     * @return Specifies how to handle requests.
     * 
     */
    public Optional<String> geoProtectionMode() {
        return Optional.ofNullable(this.geoProtectionMode);
    }

    /**
     * This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    @Import(name="geoProtectionTitle")
    private @Nullable String geoProtectionTitle;

    /**
     * @return This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    public Optional<String> geoProtectionTitle() {
        return Optional.ofNullable(this.geoProtectionTitle);
    }

    /**
     * This specifies the full URL to the redirect page for denied requests.
     * 
     */
    @Import(name="geoRedirectUrl")
    private @Nullable String geoRedirectUrl;

    /**
     * @return This specifies the full URL to the redirect page for denied requests.
     * 
     */
    public Optional<String> geoRedirectUrl() {
        return Optional.ofNullable(this.geoRedirectUrl);
    }

    /**
     * Specify a set of IP addresses or CIDR blocks to allow or deny.
     * 
     */
    @Import(name="ipAddresses")
    private @Nullable List<String> ipAddresses;

    /**
     * @return Specify a set of IP addresses or CIDR blocks to allow or deny.
     * 
     */
    public Optional<List<String>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * Specifies how to handle requests.
     * 
     */
    @Import(name="ipProtectionMode")
    private @Nullable String ipProtectionMode;

    /**
     * @return Specifies how to handle requests.
     * 
     */
    public Optional<String> ipProtectionMode() {
        return Optional.ofNullable(this.ipProtectionMode);
    }

    /**
     * This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    @Import(name="ipProtectionTitle")
    private @Nullable String ipProtectionTitle;

    /**
     * @return This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    public Optional<String> ipProtectionTitle() {
        return Optional.ofNullable(this.ipProtectionTitle);
    }

    /**
     * This specifies the full URL to the redirect page for denied requests.
     * 
     */
    @Import(name="ipRedirectUrl")
    private @Nullable String ipRedirectUrl;

    /**
     * @return This specifies the full URL to the redirect page for denied requests.
     * 
     */
    public Optional<String> ipRedirectUrl() {
        return Optional.ofNullable(this.ipRedirectUrl);
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
     * Specify a set of IP addresses or CIDR blocks that exceptions to the set of included or excluded areas.
     * 
     */
    @Import(name="overrideIpAddresses")
    private @Nullable List<String> overrideIpAddresses;

    /**
     * @return Specify a set of IP addresses or CIDR blocks that exceptions to the set of included or excluded areas.
     * 
     */
    public Optional<List<String>> overrideIpAddresses() {
        return Optional.ofNullable(this.overrideIpAddresses);
    }

    /**
     * Specifies the set of domains from which to allow or deny traffic.
     * 
     */
    @Import(name="referrerDomains")
    private @Nullable List<String> referrerDomains;

    /**
     * @return Specifies the set of domains from which to allow or deny traffic.
     * 
     */
    public Optional<List<String>> referrerDomains() {
        return Optional.ofNullable(this.referrerDomains);
    }

    /**
     * Specify the action to take.
     * 
     */
    @Import(name="referrerProtectionMode")
    private @Nullable String referrerProtectionMode;

    /**
     * @return Specify the action to take.
     * 
     */
    public Optional<String> referrerProtectionMode() {
        return Optional.ofNullable(this.referrerProtectionMode);
    }

    /**
     * This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    @Import(name="referrerProtectionTitle")
    private @Nullable String referrerProtectionTitle;

    /**
     * @return This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
     * 
     */
    public Optional<String> referrerProtectionTitle() {
        return Optional.ofNullable(this.referrerProtectionTitle);
    }

    /**
     * This specifies the full URL to the redirect page for denied requests.
     * 
     */
    @Import(name="referrerRedirectUrl")
    private @Nullable String referrerRedirectUrl;

    /**
     * @return This specifies the full URL to the redirect page for denied requests.
     * 
     */
    public Optional<String> referrerRedirectUrl() {
        return Optional.ofNullable(this.referrerRedirectUrl);
    }

    /**
     * Specifies a set of ISO 3166-2 regional codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
     * 
     */
    @Import(name="regions")
    private @Nullable List<String> regions;

    /**
     * @return Specifies a set of ISO 3166-2 regional codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
     * 
     */
    public Optional<List<String>> regions() {
        return Optional.ofNullable(this.regions);
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

    private GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection() {}

    private GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection(GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection $) {
        this.countries = $.countries;
        this.dmas = $.dmas;
        this.enableGeoProtection = $.enableGeoProtection;
        this.enableGeoRedirectOnDeny = $.enableGeoRedirectOnDeny;
        this.enableIpProtection = $.enableIpProtection;
        this.enableIpRedirectOnDeny = $.enableIpRedirectOnDeny;
        this.enableReferrerProtection = $.enableReferrerProtection;
        this.enableReferrerRedirectOnDeny = $.enableReferrerRedirectOnDeny;
        this.enabled = $.enabled;
        this.geoProtectionMode = $.geoProtectionMode;
        this.geoProtectionTitle = $.geoProtectionTitle;
        this.geoRedirectUrl = $.geoRedirectUrl;
        this.ipAddresses = $.ipAddresses;
        this.ipProtectionMode = $.ipProtectionMode;
        this.ipProtectionTitle = $.ipProtectionTitle;
        this.ipRedirectUrl = $.ipRedirectUrl;
        this.locked = $.locked;
        this.overrideIpAddresses = $.overrideIpAddresses;
        this.referrerDomains = $.referrerDomains;
        this.referrerProtectionMode = $.referrerProtectionMode;
        this.referrerProtectionTitle = $.referrerProtectionTitle;
        this.referrerRedirectUrl = $.referrerRedirectUrl;
        this.regions = $.regions;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection(Objects.requireNonNull(defaults));
        }

        /**
         * @param countries Specifies a set of two-character ISO 3166 country codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
         * 
         * @return builder
         * 
         */
        public Builder countries(@Nullable List<String> countries) {
            $.countries = countries;
            return this;
        }

        /**
         * @param countries Specifies a set of two-character ISO 3166 country codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
         * 
         * @return builder
         * 
         */
        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }

        /**
         * @param dmas Specifies the set of Designated Market Area codes from which to allow or deny traffic.  See `EdgeScape Data Codes` for a list.
         * 
         * @return builder
         * 
         */
        public Builder dmas(@Nullable List<String> dmas) {
            $.dmas = dmas;
            return this;
        }

        /**
         * @param dmas Specifies the set of Designated Market Area codes from which to allow or deny traffic.  See `EdgeScape Data Codes` for a list.
         * 
         * @return builder
         * 
         */
        public Builder dmas(String... dmas) {
            return dmas(List.of(dmas));
        }

        /**
         * @param enableGeoProtection When enabled, verifies IP addresses are unique to specific geographic regions.
         * 
         * @return builder
         * 
         */
        public Builder enableGeoProtection(@Nullable Boolean enableGeoProtection) {
            $.enableGeoProtection = enableGeoProtection;
            return this;
        }

        /**
         * @param enableGeoRedirectOnDeny When enabled, redirects denied requests rather than responding with an error code.
         * 
         * @return builder
         * 
         */
        public Builder enableGeoRedirectOnDeny(@Nullable Boolean enableGeoRedirectOnDeny) {
            $.enableGeoRedirectOnDeny = enableGeoRedirectOnDeny;
            return this;
        }

        /**
         * @param enableIpProtection Allows you to control access to your content from specific sets of IP addresses and CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder enableIpProtection(@Nullable Boolean enableIpProtection) {
            $.enableIpProtection = enableIpProtection;
            return this;
        }

        /**
         * @param enableIpRedirectOnDeny When enabled, redirects denied requests rather than responding with an error code.
         * 
         * @return builder
         * 
         */
        public Builder enableIpRedirectOnDeny(@Nullable Boolean enableIpRedirectOnDeny) {
            $.enableIpRedirectOnDeny = enableIpRedirectOnDeny;
            return this;
        }

        /**
         * @param enableReferrerProtection Allows you allow traffic from certain referring websites, and disallow traffic from unauthorized sites that hijack those links.
         * 
         * @return builder
         * 
         */
        public Builder enableReferrerProtection(@Nullable Boolean enableReferrerProtection) {
            $.enableReferrerProtection = enableReferrerProtection;
            return this;
        }

        /**
         * @param enableReferrerRedirectOnDeny When enabled, redirects denied requests rather than responding with an error code.
         * 
         * @return builder
         * 
         */
        public Builder enableReferrerRedirectOnDeny(@Nullable Boolean enableReferrerRedirectOnDeny) {
            $.enableReferrerRedirectOnDeny = enableReferrerRedirectOnDeny;
            return this;
        }

        /**
         * @param enabled Enables the Content Targeting feature.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param geoProtectionMode Specifies how to handle requests.
         * 
         * @return builder
         * 
         */
        public Builder geoProtectionMode(@Nullable String geoProtectionMode) {
            $.geoProtectionMode = geoProtectionMode;
            return this;
        }

        /**
         * @param geoProtectionTitle This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
         * 
         * @return builder
         * 
         */
        public Builder geoProtectionTitle(@Nullable String geoProtectionTitle) {
            $.geoProtectionTitle = geoProtectionTitle;
            return this;
        }

        /**
         * @param geoRedirectUrl This specifies the full URL to the redirect page for denied requests.
         * 
         * @return builder
         * 
         */
        public Builder geoRedirectUrl(@Nullable String geoRedirectUrl) {
            $.geoRedirectUrl = geoRedirectUrl;
            return this;
        }

        /**
         * @param ipAddresses Specify a set of IP addresses or CIDR blocks to allow or deny.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses Specify a set of IP addresses or CIDR blocks to allow or deny.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param ipProtectionMode Specifies how to handle requests.
         * 
         * @return builder
         * 
         */
        public Builder ipProtectionMode(@Nullable String ipProtectionMode) {
            $.ipProtectionMode = ipProtectionMode;
            return this;
        }

        /**
         * @param ipProtectionTitle This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
         * 
         * @return builder
         * 
         */
        public Builder ipProtectionTitle(@Nullable String ipProtectionTitle) {
            $.ipProtectionTitle = ipProtectionTitle;
            return this;
        }

        /**
         * @param ipRedirectUrl This specifies the full URL to the redirect page for denied requests.
         * 
         * @return builder
         * 
         */
        public Builder ipRedirectUrl(@Nullable String ipRedirectUrl) {
            $.ipRedirectUrl = ipRedirectUrl;
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
         * @param overrideIpAddresses Specify a set of IP addresses or CIDR blocks that exceptions to the set of included or excluded areas.
         * 
         * @return builder
         * 
         */
        public Builder overrideIpAddresses(@Nullable List<String> overrideIpAddresses) {
            $.overrideIpAddresses = overrideIpAddresses;
            return this;
        }

        /**
         * @param overrideIpAddresses Specify a set of IP addresses or CIDR blocks that exceptions to the set of included or excluded areas.
         * 
         * @return builder
         * 
         */
        public Builder overrideIpAddresses(String... overrideIpAddresses) {
            return overrideIpAddresses(List.of(overrideIpAddresses));
        }

        /**
         * @param referrerDomains Specifies the set of domains from which to allow or deny traffic.
         * 
         * @return builder
         * 
         */
        public Builder referrerDomains(@Nullable List<String> referrerDomains) {
            $.referrerDomains = referrerDomains;
            return this;
        }

        /**
         * @param referrerDomains Specifies the set of domains from which to allow or deny traffic.
         * 
         * @return builder
         * 
         */
        public Builder referrerDomains(String... referrerDomains) {
            return referrerDomains(List.of(referrerDomains));
        }

        /**
         * @param referrerProtectionMode Specify the action to take.
         * 
         * @return builder
         * 
         */
        public Builder referrerProtectionMode(@Nullable String referrerProtectionMode) {
            $.referrerProtectionMode = referrerProtectionMode;
            return this;
        }

        /**
         * @param referrerProtectionTitle This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
         * 
         * @return builder
         * 
         */
        public Builder referrerProtectionTitle(@Nullable String referrerProtectionTitle) {
            $.referrerProtectionTitle = referrerProtectionTitle;
            return this;
        }

        /**
         * @param referrerRedirectUrl This specifies the full URL to the redirect page for denied requests.
         * 
         * @return builder
         * 
         */
        public Builder referrerRedirectUrl(@Nullable String referrerRedirectUrl) {
            $.referrerRedirectUrl = referrerRedirectUrl;
            return this;
        }

        /**
         * @param regions Specifies a set of ISO 3166-2 regional codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable List<String> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions Specifies a set of ISO 3166-2 regional codes from which to allow or deny traffic. See `EdgeScape Data Codes` for a list.
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
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

        public GetPropertyRulesBuilderRulesV20240813BehaviorContentTargetingProtection build() {
            return $;
        }
    }

}
