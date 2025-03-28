// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost Empty = new GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost();

    /**
     * By default, POST requests also require a `Content-Length` header, or they result in a 411 error. With this option enabled with no specified `Content-Length`, the edge server relies on a `Transfer-Encoding` header to chunk the data. If neither header is present, it assumes the request has no body, and it adds a header with a `0` value to the forward request.
     * 
     */
    @Import(name="allowWithoutContentLength")
    private @Nullable Boolean allowWithoutContentLength;

    /**
     * @return By default, POST requests also require a `Content-Length` header, or they result in a 411 error. With this option enabled with no specified `Content-Length`, the edge server relies on a `Transfer-Encoding` header to chunk the data. If neither header is present, it assumes the request has no body, and it adds a header with a `0` value to the forward request.
     * 
     */
    public Optional<Boolean> allowWithoutContentLength() {
        return Optional.ofNullable(this.allowWithoutContentLength);
    }

    /**
     * Allows POST requests.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Allows POST requests.
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

    private GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost() {}

    private GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost(GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost $) {
        this.allowWithoutContentLength = $.allowWithoutContentLength;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost();
        }

        public Builder(GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost defaults) {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowWithoutContentLength By default, POST requests also require a `Content-Length` header, or they result in a 411 error. With this option enabled with no specified `Content-Length`, the edge server relies on a `Transfer-Encoding` header to chunk the data. If neither header is present, it assumes the request has no body, and it adds a header with a `0` value to the forward request.
         * 
         * @return builder
         * 
         */
        public Builder allowWithoutContentLength(@Nullable Boolean allowWithoutContentLength) {
            $.allowWithoutContentLength = allowWithoutContentLength;
            return this;
        }

        /**
         * @param enabled Allows POST requests.
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

        public GetPropertyRulesBuilderRulesV20231030BehaviorAllowPost build() {
            return $;
        }
    }

}
