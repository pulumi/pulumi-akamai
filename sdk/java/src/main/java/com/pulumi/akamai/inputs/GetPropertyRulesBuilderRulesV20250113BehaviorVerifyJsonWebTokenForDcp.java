// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp Empty = new GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp();

    /**
     * This specifies the authorization group name.
     * 
     */
    @Import(name="authorizations")
    private @Nullable String authorizations;

    /**
     * @return This specifies the authorization group name.
     * 
     */
    public Optional<String> authorizations() {
        return Optional.ofNullable(this.authorizations);
    }

    /**
     * This specifies the claim name.
     * 
     */
    @Import(name="clientId")
    private @Nullable String clientId;

    /**
     * @return This specifies the claim name.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The JWT value comes from the `X-Akamai-DCP-Token` header by default.  Enabling this option allows you to extract it from another header name that you specify.
     * 
     */
    @Import(name="customHeader")
    private @Nullable Boolean customHeader;

    /**
     * @return The JWT value comes from the `X-Akamai-DCP-Token` header by default.  Enabling this option allows you to extract it from another header name that you specify.
     * 
     */
    public Optional<Boolean> customHeader() {
        return Optional.ofNullable(this.customHeader);
    }

    /**
     * Verifies JWTs signed with the ES256 algorithm. This signature helps to ensure that the token hasn&#39;t been tampered with.
     * 
     */
    @Import(name="enableEs256")
    private @Nullable Boolean enableEs256;

    /**
     * @return Verifies JWTs signed with the ES256 algorithm. This signature helps to ensure that the token hasn&#39;t been tampered with.
     * 
     */
    public Optional<Boolean> enableEs256() {
        return Optional.ofNullable(this.enableEs256);
    }

    /**
     * Verifies JWTs signed with the RS256 algorithm. This signature helps to ensure that the token hasn&#39;t been tampered with.
     * 
     */
    @Import(name="enableRs256")
    private @Nullable Boolean enableRs256;

    /**
     * @return Verifies JWTs signed with the RS256 algorithm. This signature helps to ensure that the token hasn&#39;t been tampered with.
     * 
     */
    public Optional<Boolean> enableRs256() {
        return Optional.ofNullable(this.enableRs256);
    }

    /**
     * Allows you to extract the authorization groups stored in the JWT.
     * 
     */
    @Import(name="extractAuthorizations")
    private @Nullable Boolean extractAuthorizations;

    /**
     * @return Allows you to extract the authorization groups stored in the JWT.
     * 
     */
    public Optional<Boolean> extractAuthorizations() {
        return Optional.ofNullable(this.extractAuthorizations);
    }

    /**
     * Allows you to extract the client ID claim name stored in JWT.
     * 
     */
    @Import(name="extractClientId")
    private @Nullable Boolean extractClientId;

    /**
     * @return Allows you to extract the client ID claim name stored in JWT.
     * 
     */
    public Optional<Boolean> extractClientId() {
        return Optional.ofNullable(this.extractClientId);
    }

    /**
     * Specifies where to get the JWT value from.
     * 
     */
    @Import(name="extractLocation")
    private @Nullable String extractLocation;

    /**
     * @return Specifies where to get the JWT value from.
     * 
     */
    public Optional<String> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }

    /**
     * Allows you to extract the user name stored in the JWT.
     * 
     */
    @Import(name="extractUserName")
    private @Nullable Boolean extractUserName;

    /**
     * @return Allows you to extract the user name stored in the JWT.
     * 
     */
    public Optional<Boolean> extractUserName() {
        return Optional.ofNullable(this.extractUserName);
    }

    /**
     * This specifies the name of the header to extract the JWT value from.
     * 
     */
    @Import(name="headerName")
    private @Nullable String headerName;

    /**
     * @return This specifies the name of the header to extract the JWT value from.
     * 
     */
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    /**
     * An identifier for the JWT keys collection.
     * 
     */
    @Import(name="jwt")
    private @Nullable String jwt;

    /**
     * @return An identifier for the JWT keys collection.
     * 
     */
    public Optional<String> jwt() {
        return Optional.ofNullable(this.jwt);
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
     * Specifies the primary location to extract the JWT value from. If the specified option doesn&#39;t include the JWTs, the system checks the secondary one.
     * 
     */
    @Import(name="primaryLocation")
    private @Nullable String primaryLocation;

    /**
     * @return Specifies the primary location to extract the JWT value from. If the specified option doesn&#39;t include the JWTs, the system checks the secondary one.
     * 
     */
    public Optional<String> primaryLocation() {
        return Optional.ofNullable(this.primaryLocation);
    }

    /**
     * Specifies the name of the query parameter from which to extract the JWT value.
     * 
     */
    @Import(name="queryParameterName")
    private @Nullable String queryParameterName;

    /**
     * @return Specifies the name of the query parameter from which to extract the JWT value.
     * 
     */
    public Optional<String> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
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
     * This specifies the user name.
     * 
     */
    @Import(name="userName")
    private @Nullable String userName;

    /**
     * @return This specifies the user name.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
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

    private GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp() {}

    private GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp(GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp $) {
        this.authorizations = $.authorizations;
        this.clientId = $.clientId;
        this.customHeader = $.customHeader;
        this.enableEs256 = $.enableEs256;
        this.enableRs256 = $.enableRs256;
        this.extractAuthorizations = $.extractAuthorizations;
        this.extractClientId = $.extractClientId;
        this.extractLocation = $.extractLocation;
        this.extractUserName = $.extractUserName;
        this.headerName = $.headerName;
        this.jwt = $.jwt;
        this.locked = $.locked;
        this.primaryLocation = $.primaryLocation;
        this.queryParameterName = $.queryParameterName;
        this.templateUuid = $.templateUuid;
        this.userName = $.userName;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp();
        }

        public Builder(GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp defaults) {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizations This specifies the authorization group name.
         * 
         * @return builder
         * 
         */
        public Builder authorizations(@Nullable String authorizations) {
            $.authorizations = authorizations;
            return this;
        }

        /**
         * @param clientId This specifies the claim name.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable String clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param customHeader The JWT value comes from the `X-Akamai-DCP-Token` header by default.  Enabling this option allows you to extract it from another header name that you specify.
         * 
         * @return builder
         * 
         */
        public Builder customHeader(@Nullable Boolean customHeader) {
            $.customHeader = customHeader;
            return this;
        }

        /**
         * @param enableEs256 Verifies JWTs signed with the ES256 algorithm. This signature helps to ensure that the token hasn&#39;t been tampered with.
         * 
         * @return builder
         * 
         */
        public Builder enableEs256(@Nullable Boolean enableEs256) {
            $.enableEs256 = enableEs256;
            return this;
        }

        /**
         * @param enableRs256 Verifies JWTs signed with the RS256 algorithm. This signature helps to ensure that the token hasn&#39;t been tampered with.
         * 
         * @return builder
         * 
         */
        public Builder enableRs256(@Nullable Boolean enableRs256) {
            $.enableRs256 = enableRs256;
            return this;
        }

        /**
         * @param extractAuthorizations Allows you to extract the authorization groups stored in the JWT.
         * 
         * @return builder
         * 
         */
        public Builder extractAuthorizations(@Nullable Boolean extractAuthorizations) {
            $.extractAuthorizations = extractAuthorizations;
            return this;
        }

        /**
         * @param extractClientId Allows you to extract the client ID claim name stored in JWT.
         * 
         * @return builder
         * 
         */
        public Builder extractClientId(@Nullable Boolean extractClientId) {
            $.extractClientId = extractClientId;
            return this;
        }

        /**
         * @param extractLocation Specifies where to get the JWT value from.
         * 
         * @return builder
         * 
         */
        public Builder extractLocation(@Nullable String extractLocation) {
            $.extractLocation = extractLocation;
            return this;
        }

        /**
         * @param extractUserName Allows you to extract the user name stored in the JWT.
         * 
         * @return builder
         * 
         */
        public Builder extractUserName(@Nullable Boolean extractUserName) {
            $.extractUserName = extractUserName;
            return this;
        }

        /**
         * @param headerName This specifies the name of the header to extract the JWT value from.
         * 
         * @return builder
         * 
         */
        public Builder headerName(@Nullable String headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param jwt An identifier for the JWT keys collection.
         * 
         * @return builder
         * 
         */
        public Builder jwt(@Nullable String jwt) {
            $.jwt = jwt;
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
         * @param primaryLocation Specifies the primary location to extract the JWT value from. If the specified option doesn&#39;t include the JWTs, the system checks the secondary one.
         * 
         * @return builder
         * 
         */
        public Builder primaryLocation(@Nullable String primaryLocation) {
            $.primaryLocation = primaryLocation;
            return this;
        }

        /**
         * @param queryParameterName Specifies the name of the query parameter from which to extract the JWT value.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterName(@Nullable String queryParameterName) {
            $.queryParameterName = queryParameterName;
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
         * @param userName This specifies the user name.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable String userName) {
            $.userName = userName;
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

        public GetPropertyRulesBuilderRulesV20250113BehaviorVerifyJsonWebTokenForDcp build() {
            return $;
        }
    }

}
