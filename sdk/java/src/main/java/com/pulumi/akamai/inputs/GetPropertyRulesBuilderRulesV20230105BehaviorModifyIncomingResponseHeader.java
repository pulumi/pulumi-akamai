// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader();

    /**
     * Either `ADD`, `DELETE`, `MODIFY`, or `PASS` incoming HTTP response headers.
     * 
     */
    @Import(name="action")
    private @Nullable String action;

    /**
     * @return Either `ADD`, `DELETE`, `MODIFY`, or `PASS` incoming HTTP response headers.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * When enabled with the `action` set to `MODIFY`, prevents creation of more than one instance of a header.
     * 
     */
    @Import(name="avoidDuplicateHeaders")
    private @Nullable Boolean avoidDuplicateHeaders;

    /**
     * @return When enabled with the `action` set to `MODIFY`, prevents creation of more than one instance of a header.
     * 
     */
    public Optional<Boolean> avoidDuplicateHeaders() {
        return Optional.ofNullable(this.avoidDuplicateHeaders);
    }

    /**
     * Specifies a custom field name that applies when the relevant `standard` header name is set to `OTHER`.
     * 
     */
    @Import(name="customHeaderName")
    private @Nullable String customHeaderName;

    /**
     * @return Specifies a custom field name that applies when the relevant `standard` header name is set to `OTHER`.
     * 
     */
    public Optional<String> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }

    /**
     * Specifies the header&#39;s new value.
     * 
     */
    @Import(name="headerValue")
    private @Nullable String headerValue;

    /**
     * @return Specifies the header&#39;s new value.
     * 
     */
    public Optional<String> headerValue() {
        return Optional.ofNullable(this.headerValue);
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
     * Specifies an HTTP header replacement value.
     * 
     */
    @Import(name="newHeaderValue")
    private @Nullable String newHeaderValue;

    /**
     * @return Specifies an HTTP header replacement value.
     * 
     */
    public Optional<String> newHeaderValue() {
        return Optional.ofNullable(this.newHeaderValue);
    }

    /**
     * If the value of `action` is `ADD`, this specifies the name of the field to add.
     * 
     */
    @Import(name="standardAddHeaderName")
    private @Nullable String standardAddHeaderName;

    /**
     * @return If the value of `action` is `ADD`, this specifies the name of the field to add.
     * 
     */
    public Optional<String> standardAddHeaderName() {
        return Optional.ofNullable(this.standardAddHeaderName);
    }

    /**
     * If the value of `action` is `DELETE`, this specifies the name of the field to remove.
     * 
     */
    @Import(name="standardDeleteHeaderName")
    private @Nullable String standardDeleteHeaderName;

    /**
     * @return If the value of `action` is `DELETE`, this specifies the name of the field to remove.
     * 
     */
    public Optional<String> standardDeleteHeaderName() {
        return Optional.ofNullable(this.standardDeleteHeaderName);
    }

    /**
     * If the value of `action` is `MODIFY`, this specifies the name of the field to modify.
     * 
     */
    @Import(name="standardModifyHeaderName")
    private @Nullable String standardModifyHeaderName;

    /**
     * @return If the value of `action` is `MODIFY`, this specifies the name of the field to modify.
     * 
     */
    public Optional<String> standardModifyHeaderName() {
        return Optional.ofNullable(this.standardModifyHeaderName);
    }

    /**
     * If the value of `action` is `PASS`, this specifies the name of the field to pass through.
     * 
     */
    @Import(name="standardPassHeaderName")
    private @Nullable String standardPassHeaderName;

    /**
     * @return If the value of `action` is `PASS`, this specifies the name of the field to pass through.
     * 
     */
    public Optional<String> standardPassHeaderName() {
        return Optional.ofNullable(this.standardPassHeaderName);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader(GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader $) {
        this.action = $.action;
        this.avoidDuplicateHeaders = $.avoidDuplicateHeaders;
        this.customHeaderName = $.customHeaderName;
        this.headerValue = $.headerValue;
        this.locked = $.locked;
        this.newHeaderValue = $.newHeaderValue;
        this.standardAddHeaderName = $.standardAddHeaderName;
        this.standardDeleteHeaderName = $.standardDeleteHeaderName;
        this.standardModifyHeaderName = $.standardModifyHeaderName;
        this.standardPassHeaderName = $.standardPassHeaderName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Either `ADD`, `DELETE`, `MODIFY`, or `PASS` incoming HTTP response headers.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable String action) {
            $.action = action;
            return this;
        }

        /**
         * @param avoidDuplicateHeaders When enabled with the `action` set to `MODIFY`, prevents creation of more than one instance of a header.
         * 
         * @return builder
         * 
         */
        public Builder avoidDuplicateHeaders(@Nullable Boolean avoidDuplicateHeaders) {
            $.avoidDuplicateHeaders = avoidDuplicateHeaders;
            return this;
        }

        /**
         * @param customHeaderName Specifies a custom field name that applies when the relevant `standard` header name is set to `OTHER`.
         * 
         * @return builder
         * 
         */
        public Builder customHeaderName(@Nullable String customHeaderName) {
            $.customHeaderName = customHeaderName;
            return this;
        }

        /**
         * @param headerValue Specifies the header&#39;s new value.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(@Nullable String headerValue) {
            $.headerValue = headerValue;
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
         * @param newHeaderValue Specifies an HTTP header replacement value.
         * 
         * @return builder
         * 
         */
        public Builder newHeaderValue(@Nullable String newHeaderValue) {
            $.newHeaderValue = newHeaderValue;
            return this;
        }

        /**
         * @param standardAddHeaderName If the value of `action` is `ADD`, this specifies the name of the field to add.
         * 
         * @return builder
         * 
         */
        public Builder standardAddHeaderName(@Nullable String standardAddHeaderName) {
            $.standardAddHeaderName = standardAddHeaderName;
            return this;
        }

        /**
         * @param standardDeleteHeaderName If the value of `action` is `DELETE`, this specifies the name of the field to remove.
         * 
         * @return builder
         * 
         */
        public Builder standardDeleteHeaderName(@Nullable String standardDeleteHeaderName) {
            $.standardDeleteHeaderName = standardDeleteHeaderName;
            return this;
        }

        /**
         * @param standardModifyHeaderName If the value of `action` is `MODIFY`, this specifies the name of the field to modify.
         * 
         * @return builder
         * 
         */
        public Builder standardModifyHeaderName(@Nullable String standardModifyHeaderName) {
            $.standardModifyHeaderName = standardModifyHeaderName;
            return this;
        }

        /**
         * @param standardPassHeaderName If the value of `action` is `PASS`, this specifies the name of the field to pass through.
         * 
         * @return builder
         * 
         */
        public Builder standardPassHeaderName(@Nullable String standardPassHeaderName) {
            $.standardPassHeaderName = standardPassHeaderName;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorModifyIncomingResponseHeader build() {
            return $;
        }
    }

}
