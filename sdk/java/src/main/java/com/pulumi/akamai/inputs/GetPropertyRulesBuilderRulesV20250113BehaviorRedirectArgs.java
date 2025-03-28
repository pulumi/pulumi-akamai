// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs Empty = new GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs();

    /**
     * Specify how to change the requested hostname, independently from the pathname.
     * 
     */
    @Import(name="destinationHostname")
    private @Nullable Output<String> destinationHostname;

    /**
     * @return Specify how to change the requested hostname, independently from the pathname.
     * 
     */
    public Optional<Output<String>> destinationHostname() {
        return Optional.ofNullable(this.destinationHostname);
    }

    /**
     * Specifies the full hostname with which to replace the current hostname.
     * 
     */
    @Import(name="destinationHostnameOther")
    private @Nullable Output<String> destinationHostnameOther;

    /**
     * @return Specifies the full hostname with which to replace the current hostname.
     * 
     */
    public Optional<Output<String>> destinationHostnameOther() {
        return Optional.ofNullable(this.destinationHostnameOther);
    }

    /**
     * Specifies the subdomain with which to replace to the current hostname&#39;s leftmost subdomain. For example, a value of `m` changes `www.example.com` to `m.example.com`.
     * 
     */
    @Import(name="destinationHostnameSibling")
    private @Nullable Output<String> destinationHostnameSibling;

    /**
     * @return Specifies the subdomain with which to replace to the current hostname&#39;s leftmost subdomain. For example, a value of `m` changes `www.example.com` to `m.example.com`.
     * 
     */
    public Optional<Output<String>> destinationHostnameSibling() {
        return Optional.ofNullable(this.destinationHostnameSibling);
    }

    /**
     * Specifies a subdomain to prepend to the current hostname. For example, a value of `m` changes `www.example.com` to `m.www.example.com`.
     * 
     */
    @Import(name="destinationHostnameSubdomain")
    private @Nullable Output<String> destinationHostnameSubdomain;

    /**
     * @return Specifies a subdomain to prepend to the current hostname. For example, a value of `m` changes `www.example.com` to `m.www.example.com`.
     * 
     */
    public Optional<Output<String>> destinationHostnameSubdomain() {
        return Optional.ofNullable(this.destinationHostnameSubdomain);
    }

    /**
     * Specify how to change the requested pathname, independently from the hostname.
     * 
     */
    @Import(name="destinationPath")
    private @Nullable Output<String> destinationPath;

    /**
     * @return Specify how to change the requested pathname, independently from the hostname.
     * 
     */
    public Optional<Output<String>> destinationPath() {
        return Optional.ofNullable(this.destinationPath);
    }

    /**
     * When `destinationPath` is set to `PREFIX_REQUEST`, this replaces the current path.
     * 
     */
    @Import(name="destinationPathOther")
    private @Nullable Output<String> destinationPathOther;

    /**
     * @return When `destinationPath` is set to `PREFIX_REQUEST`, this replaces the current path.
     * 
     */
    public Optional<Output<String>> destinationPathOther() {
        return Optional.ofNullable(this.destinationPathOther);
    }

    /**
     * When `destinationPath` is set to `PREFIX_REQUEST`, this prepends the current path. For example, a value of `/prefix/path` changes `/example/index.html` to `/prefix/path/example/index.html`.
     * 
     */
    @Import(name="destinationPathPrefix")
    private @Nullable Output<String> destinationPathPrefix;

    /**
     * @return When `destinationPath` is set to `PREFIX_REQUEST`, this prepends the current path. For example, a value of `/prefix/path` changes `/example/index.html` to `/prefix/path/example/index.html`.
     * 
     */
    public Optional<Output<String>> destinationPathPrefix() {
        return Optional.ofNullable(this.destinationPathPrefix);
    }

    /**
     * When `destinationPath` is set to `PREFIX_REQUEST` and `destinationPathSuffixStatus` is set to `SUFFIX`, this specifies the suffix to append to the path.
     * 
     */
    @Import(name="destinationPathSuffix")
    private @Nullable Output<String> destinationPathSuffix;

    /**
     * @return When `destinationPath` is set to `PREFIX_REQUEST` and `destinationPathSuffixStatus` is set to `SUFFIX`, this specifies the suffix to append to the path.
     * 
     */
    public Optional<Output<String>> destinationPathSuffix() {
        return Optional.ofNullable(this.destinationPathSuffix);
    }

    /**
     * When `destinationPath` is set to `PREFIX_REQUEST`, this gives you the option of adding a suffix.
     * 
     */
    @Import(name="destinationPathSuffixStatus")
    private @Nullable Output<String> destinationPathSuffixStatus;

    /**
     * @return When `destinationPath` is set to `PREFIX_REQUEST`, this gives you the option of adding a suffix.
     * 
     */
    public Optional<Output<String>> destinationPathSuffixStatus() {
        return Optional.ofNullable(this.destinationPathSuffixStatus);
    }

    /**
     * Choose the protocol for the redirect URL.
     * 
     */
    @Import(name="destinationProtocol")
    private @Nullable Output<String> destinationProtocol;

    /**
     * @return Choose the protocol for the redirect URL.
     * 
     */
    public Optional<Output<String>> destinationProtocol() {
        return Optional.ofNullable(this.destinationProtocol);
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
     * Either specify a default response for mobile browsers, or customize your own.
     * 
     */
    @Import(name="mobileDefaultChoice")
    private @Nullable Output<String> mobileDefaultChoice;

    /**
     * @return Either specify a default response for mobile browsers, or customize your own.
     * 
     */
    public Optional<Output<String>> mobileDefaultChoice() {
        return Optional.ofNullable(this.mobileDefaultChoice);
    }

    /**
     * When set to `APPEND`, passes incoming query string parameters as part of the redirect URL. Otherwise set this to `IGNORE`.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<String> queryString;

    /**
     * @return When set to `APPEND`, passes incoming query string parameters as part of the redirect URL. Otherwise set this to `IGNORE`.
     * 
     */
    public Optional<Output<String>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Specify the redirect&#39;s response code.
     * 
     */
    @Import(name="responseCode")
    private @Nullable Output<Integer> responseCode;

    /**
     * @return Specify the redirect&#39;s response code.
     * 
     */
    public Optional<Output<Integer>> responseCode() {
        return Optional.ofNullable(this.responseCode);
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

    private GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs() {}

    private GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs(GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs $) {
        this.destinationHostname = $.destinationHostname;
        this.destinationHostnameOther = $.destinationHostnameOther;
        this.destinationHostnameSibling = $.destinationHostnameSibling;
        this.destinationHostnameSubdomain = $.destinationHostnameSubdomain;
        this.destinationPath = $.destinationPath;
        this.destinationPathOther = $.destinationPathOther;
        this.destinationPathPrefix = $.destinationPathPrefix;
        this.destinationPathSuffix = $.destinationPathSuffix;
        this.destinationPathSuffixStatus = $.destinationPathSuffixStatus;
        this.destinationProtocol = $.destinationProtocol;
        this.locked = $.locked;
        this.mobileDefaultChoice = $.mobileDefaultChoice;
        this.queryString = $.queryString;
        this.responseCode = $.responseCode;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationHostname Specify how to change the requested hostname, independently from the pathname.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostname(@Nullable Output<String> destinationHostname) {
            $.destinationHostname = destinationHostname;
            return this;
        }

        /**
         * @param destinationHostname Specify how to change the requested hostname, independently from the pathname.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostname(String destinationHostname) {
            return destinationHostname(Output.of(destinationHostname));
        }

        /**
         * @param destinationHostnameOther Specifies the full hostname with which to replace the current hostname.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostnameOther(@Nullable Output<String> destinationHostnameOther) {
            $.destinationHostnameOther = destinationHostnameOther;
            return this;
        }

        /**
         * @param destinationHostnameOther Specifies the full hostname with which to replace the current hostname.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostnameOther(String destinationHostnameOther) {
            return destinationHostnameOther(Output.of(destinationHostnameOther));
        }

        /**
         * @param destinationHostnameSibling Specifies the subdomain with which to replace to the current hostname&#39;s leftmost subdomain. For example, a value of `m` changes `www.example.com` to `m.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostnameSibling(@Nullable Output<String> destinationHostnameSibling) {
            $.destinationHostnameSibling = destinationHostnameSibling;
            return this;
        }

        /**
         * @param destinationHostnameSibling Specifies the subdomain with which to replace to the current hostname&#39;s leftmost subdomain. For example, a value of `m` changes `www.example.com` to `m.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostnameSibling(String destinationHostnameSibling) {
            return destinationHostnameSibling(Output.of(destinationHostnameSibling));
        }

        /**
         * @param destinationHostnameSubdomain Specifies a subdomain to prepend to the current hostname. For example, a value of `m` changes `www.example.com` to `m.www.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostnameSubdomain(@Nullable Output<String> destinationHostnameSubdomain) {
            $.destinationHostnameSubdomain = destinationHostnameSubdomain;
            return this;
        }

        /**
         * @param destinationHostnameSubdomain Specifies a subdomain to prepend to the current hostname. For example, a value of `m` changes `www.example.com` to `m.www.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder destinationHostnameSubdomain(String destinationHostnameSubdomain) {
            return destinationHostnameSubdomain(Output.of(destinationHostnameSubdomain));
        }

        /**
         * @param destinationPath Specify how to change the requested pathname, independently from the hostname.
         * 
         * @return builder
         * 
         */
        public Builder destinationPath(@Nullable Output<String> destinationPath) {
            $.destinationPath = destinationPath;
            return this;
        }

        /**
         * @param destinationPath Specify how to change the requested pathname, independently from the hostname.
         * 
         * @return builder
         * 
         */
        public Builder destinationPath(String destinationPath) {
            return destinationPath(Output.of(destinationPath));
        }

        /**
         * @param destinationPathOther When `destinationPath` is set to `PREFIX_REQUEST`, this replaces the current path.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathOther(@Nullable Output<String> destinationPathOther) {
            $.destinationPathOther = destinationPathOther;
            return this;
        }

        /**
         * @param destinationPathOther When `destinationPath` is set to `PREFIX_REQUEST`, this replaces the current path.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathOther(String destinationPathOther) {
            return destinationPathOther(Output.of(destinationPathOther));
        }

        /**
         * @param destinationPathPrefix When `destinationPath` is set to `PREFIX_REQUEST`, this prepends the current path. For example, a value of `/prefix/path` changes `/example/index.html` to `/prefix/path/example/index.html`.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathPrefix(@Nullable Output<String> destinationPathPrefix) {
            $.destinationPathPrefix = destinationPathPrefix;
            return this;
        }

        /**
         * @param destinationPathPrefix When `destinationPath` is set to `PREFIX_REQUEST`, this prepends the current path. For example, a value of `/prefix/path` changes `/example/index.html` to `/prefix/path/example/index.html`.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathPrefix(String destinationPathPrefix) {
            return destinationPathPrefix(Output.of(destinationPathPrefix));
        }

        /**
         * @param destinationPathSuffix When `destinationPath` is set to `PREFIX_REQUEST` and `destinationPathSuffixStatus` is set to `SUFFIX`, this specifies the suffix to append to the path.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathSuffix(@Nullable Output<String> destinationPathSuffix) {
            $.destinationPathSuffix = destinationPathSuffix;
            return this;
        }

        /**
         * @param destinationPathSuffix When `destinationPath` is set to `PREFIX_REQUEST` and `destinationPathSuffixStatus` is set to `SUFFIX`, this specifies the suffix to append to the path.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathSuffix(String destinationPathSuffix) {
            return destinationPathSuffix(Output.of(destinationPathSuffix));
        }

        /**
         * @param destinationPathSuffixStatus When `destinationPath` is set to `PREFIX_REQUEST`, this gives you the option of adding a suffix.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathSuffixStatus(@Nullable Output<String> destinationPathSuffixStatus) {
            $.destinationPathSuffixStatus = destinationPathSuffixStatus;
            return this;
        }

        /**
         * @param destinationPathSuffixStatus When `destinationPath` is set to `PREFIX_REQUEST`, this gives you the option of adding a suffix.
         * 
         * @return builder
         * 
         */
        public Builder destinationPathSuffixStatus(String destinationPathSuffixStatus) {
            return destinationPathSuffixStatus(Output.of(destinationPathSuffixStatus));
        }

        /**
         * @param destinationProtocol Choose the protocol for the redirect URL.
         * 
         * @return builder
         * 
         */
        public Builder destinationProtocol(@Nullable Output<String> destinationProtocol) {
            $.destinationProtocol = destinationProtocol;
            return this;
        }

        /**
         * @param destinationProtocol Choose the protocol for the redirect URL.
         * 
         * @return builder
         * 
         */
        public Builder destinationProtocol(String destinationProtocol) {
            return destinationProtocol(Output.of(destinationProtocol));
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
         * @param mobileDefaultChoice Either specify a default response for mobile browsers, or customize your own.
         * 
         * @return builder
         * 
         */
        public Builder mobileDefaultChoice(@Nullable Output<String> mobileDefaultChoice) {
            $.mobileDefaultChoice = mobileDefaultChoice;
            return this;
        }

        /**
         * @param mobileDefaultChoice Either specify a default response for mobile browsers, or customize your own.
         * 
         * @return builder
         * 
         */
        public Builder mobileDefaultChoice(String mobileDefaultChoice) {
            return mobileDefaultChoice(Output.of(mobileDefaultChoice));
        }

        /**
         * @param queryString When set to `APPEND`, passes incoming query string parameters as part of the redirect URL. Otherwise set this to `IGNORE`.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString When set to `APPEND`, passes incoming query string parameters as part of the redirect URL. Otherwise set this to `IGNORE`.
         * 
         * @return builder
         * 
         */
        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param responseCode Specify the redirect&#39;s response code.
         * 
         * @return builder
         * 
         */
        public Builder responseCode(@Nullable Output<Integer> responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        /**
         * @param responseCode Specify the redirect&#39;s response code.
         * 
         * @return builder
         * 
         */
        public Builder responseCode(Integer responseCode) {
            return responseCode(Output.of(responseCode));
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

        public GetPropertyRulesBuilderRulesV20250113BehaviorRedirectArgs build() {
            return $;
        }
    }

}
