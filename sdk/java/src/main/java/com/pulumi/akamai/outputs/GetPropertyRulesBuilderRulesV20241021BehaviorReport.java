// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20241021BehaviorReport {
    /**
     * @return This specifies the set of cookies names whose values you want to log.
     * 
     */
    private @Nullable List<String> cookies;
    /**
     * @return Specifies an additional data field to append to each log line, maximum 1000 bytes, typically based on a dynamically generated built-in system variable. For example, `round-trip: {{builtin.AK_CLIENT_TURNAROUND_TIME}}ms` logs the total time to complete the response. See `Support for variables` for more information. If you enable the `logCustom` behavior, it overrides the `customLogField` option.
     * 
     */
    private @Nullable String customLogField;
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    private @Nullable Boolean locked;
    /**
     * @return Log the `Accept-Language` header.
     * 
     */
    private @Nullable Boolean logAcceptLanguage;
    /**
     * @return Specifies the set of cookies to log.
     * 
     */
    private @Nullable String logCookies;
    /**
     * @return Whether to append additional custom data to each log line.
     * 
     */
    private @Nullable Boolean logCustomLogField;
    /**
     * @return Whether to log the IP address of the Akamai edge server that served the response to the client.
     * 
     */
    private @Nullable Boolean logEdgeIp;
    /**
     * @return Log the `Host` header.
     * 
     */
    private @Nullable Boolean logHost;
    /**
     * @return Log the `Referer` header.
     * 
     */
    private @Nullable Boolean logReferer;
    /**
     * @return Log the `User-Agent` header.
     * 
     */
    private @Nullable Boolean logUserAgent;
    /**
     * @return Log any `X-Forwarded-For` request header.
     * 
     */
    private @Nullable Boolean logXForwardedFor;
    /**
     * @return This option is for internal usage only.
     * 
     */
    private @Nullable String templateUuid;
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20241021BehaviorReport() {}
    /**
     * @return This specifies the set of cookies names whose values you want to log.
     * 
     */
    public List<String> cookies() {
        return this.cookies == null ? List.of() : this.cookies;
    }
    /**
     * @return Specifies an additional data field to append to each log line, maximum 1000 bytes, typically based on a dynamically generated built-in system variable. For example, `round-trip: {{builtin.AK_CLIENT_TURNAROUND_TIME}}ms` logs the total time to complete the response. See `Support for variables` for more information. If you enable the `logCustom` behavior, it overrides the `customLogField` option.
     * 
     */
    public Optional<String> customLogField() {
        return Optional.ofNullable(this.customLogField);
    }
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    /**
     * @return Log the `Accept-Language` header.
     * 
     */
    public Optional<Boolean> logAcceptLanguage() {
        return Optional.ofNullable(this.logAcceptLanguage);
    }
    /**
     * @return Specifies the set of cookies to log.
     * 
     */
    public Optional<String> logCookies() {
        return Optional.ofNullable(this.logCookies);
    }
    /**
     * @return Whether to append additional custom data to each log line.
     * 
     */
    public Optional<Boolean> logCustomLogField() {
        return Optional.ofNullable(this.logCustomLogField);
    }
    /**
     * @return Whether to log the IP address of the Akamai edge server that served the response to the client.
     * 
     */
    public Optional<Boolean> logEdgeIp() {
        return Optional.ofNullable(this.logEdgeIp);
    }
    /**
     * @return Log the `Host` header.
     * 
     */
    public Optional<Boolean> logHost() {
        return Optional.ofNullable(this.logHost);
    }
    /**
     * @return Log the `Referer` header.
     * 
     */
    public Optional<Boolean> logReferer() {
        return Optional.ofNullable(this.logReferer);
    }
    /**
     * @return Log the `User-Agent` header.
     * 
     */
    public Optional<Boolean> logUserAgent() {
        return Optional.ofNullable(this.logUserAgent);
    }
    /**
     * @return Log any `X-Forwarded-For` request header.
     * 
     */
    public Optional<Boolean> logXForwardedFor() {
        return Optional.ofNullable(this.logXForwardedFor);
    }
    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20241021BehaviorReport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cookies;
        private @Nullable String customLogField;
        private @Nullable Boolean locked;
        private @Nullable Boolean logAcceptLanguage;
        private @Nullable String logCookies;
        private @Nullable Boolean logCustomLogField;
        private @Nullable Boolean logEdgeIp;
        private @Nullable Boolean logHost;
        private @Nullable Boolean logReferer;
        private @Nullable Boolean logUserAgent;
        private @Nullable Boolean logXForwardedFor;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20241021BehaviorReport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.customLogField = defaults.customLogField;
    	      this.locked = defaults.locked;
    	      this.logAcceptLanguage = defaults.logAcceptLanguage;
    	      this.logCookies = defaults.logCookies;
    	      this.logCustomLogField = defaults.logCustomLogField;
    	      this.logEdgeIp = defaults.logEdgeIp;
    	      this.logHost = defaults.logHost;
    	      this.logReferer = defaults.logReferer;
    	      this.logUserAgent = defaults.logUserAgent;
    	      this.logXForwardedFor = defaults.logXForwardedFor;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cookies(@Nullable List<String> cookies) {

            this.cookies = cookies;
            return this;
        }
        public Builder cookies(String... cookies) {
            return cookies(List.of(cookies));
        }
        @CustomType.Setter
        public Builder customLogField(@Nullable String customLogField) {

            this.customLogField = customLogField;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder logAcceptLanguage(@Nullable Boolean logAcceptLanguage) {

            this.logAcceptLanguage = logAcceptLanguage;
            return this;
        }
        @CustomType.Setter
        public Builder logCookies(@Nullable String logCookies) {

            this.logCookies = logCookies;
            return this;
        }
        @CustomType.Setter
        public Builder logCustomLogField(@Nullable Boolean logCustomLogField) {

            this.logCustomLogField = logCustomLogField;
            return this;
        }
        @CustomType.Setter
        public Builder logEdgeIp(@Nullable Boolean logEdgeIp) {

            this.logEdgeIp = logEdgeIp;
            return this;
        }
        @CustomType.Setter
        public Builder logHost(@Nullable Boolean logHost) {

            this.logHost = logHost;
            return this;
        }
        @CustomType.Setter
        public Builder logReferer(@Nullable Boolean logReferer) {

            this.logReferer = logReferer;
            return this;
        }
        @CustomType.Setter
        public Builder logUserAgent(@Nullable Boolean logUserAgent) {

            this.logUserAgent = logUserAgent;
            return this;
        }
        @CustomType.Setter
        public Builder logXForwardedFor(@Nullable Boolean logXForwardedFor) {

            this.logXForwardedFor = logXForwardedFor;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20241021BehaviorReport build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20241021BehaviorReport();
            _resultValue.cookies = cookies;
            _resultValue.customLogField = customLogField;
            _resultValue.locked = locked;
            _resultValue.logAcceptLanguage = logAcceptLanguage;
            _resultValue.logCookies = logCookies;
            _resultValue.logCustomLogField = logCustomLogField;
            _resultValue.logEdgeIp = logEdgeIp;
            _resultValue.logHost = logHost;
            _resultValue.logReferer = logReferer;
            _resultValue.logUserAgent = logUserAgent;
            _resultValue.logXForwardedFor = logXForwardedFor;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
