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


public final class GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs Empty = new GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs();

    /**
     * Specifies the name of the cookie to use for authorization.
     * 
     */
    @Import(name="cookieName")
    private @Nullable Output<String> cookieName;

    /**
     * @return Specifies the name of the cookie to use for authorization.
     * 
     */
    public Optional<Output<String>> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }

    /**
     * Specify the cookie&#39;s domain, which needs to match the top-level domain of the `Host` header the origin server receives.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Specify the cookie&#39;s domain, which needs to match the top-level domain of the `Host` header the origin server receives.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Enables the cookie-authorization behavior.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables the cookie-authorization behavior.
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

    /**
     * Specifies the value of the authorization cookie.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Specifies the value of the authorization cookie.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs() {}

    private GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs(GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs $) {
        this.cookieName = $.cookieName;
        this.domain = $.domain;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cookieName Specifies the name of the cookie to use for authorization.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(@Nullable Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        /**
         * @param cookieName Specifies the name of the cookie to use for authorization.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
        }

        /**
         * @param domain Specify the cookie&#39;s domain, which needs to match the top-level domain of the `Host` header the origin server receives.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Specify the cookie&#39;s domain, which needs to match the top-level domain of the `Host` header the origin server receives.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param enabled Enables the cookie-authorization behavior.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables the cookie-authorization behavior.
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

        /**
         * @param value Specifies the value of the authorization cookie.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Specifies the value of the authorization cookie.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetPropertyRulesBuilderRulesV20240212BehaviorEdgeOriginAuthorizationArgs build() {
            return $;
        }
    }

}
