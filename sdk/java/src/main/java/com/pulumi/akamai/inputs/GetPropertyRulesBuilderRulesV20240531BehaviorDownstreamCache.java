// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache Empty = new GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache();

    /**
     * Specify how the edge server calculates the downstream cache by setting the value of the `Expires` header.
     * 
     */
    @Import(name="allowBehavior")
    private @Nullable String allowBehavior;

    /**
     * @return Specify how the edge server calculates the downstream cache by setting the value of the `Expires` header.
     * 
     */
    public Optional<String> allowBehavior() {
        return Optional.ofNullable(this.allowBehavior);
    }

    /**
     * Specify the caching instructions the edge server sends to the end user&#39;s client.
     * 
     */
    @Import(name="behavior")
    private @Nullable String behavior;

    /**
     * @return Specify the caching instructions the edge server sends to the end user&#39;s client.
     * 
     */
    public Optional<String> behavior() {
        return Optional.ofNullable(this.behavior);
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
     * Specifies the HTTP headers to include in the response to the client.
     * 
     */
    @Import(name="sendHeaders")
    private @Nullable String sendHeaders;

    /**
     * @return Specifies the HTTP headers to include in the response to the client.
     * 
     */
    public Optional<String> sendHeaders() {
        return Optional.ofNullable(this.sendHeaders);
    }

    /**
     * Adds a `Cache-Control: private` header to prevent objects from being cached in a shared caching proxy.
     * 
     */
    @Import(name="sendPrivate")
    private @Nullable Boolean sendPrivate;

    /**
     * @return Adds a `Cache-Control: private` header to prevent objects from being cached in a shared caching proxy.
     * 
     */
    public Optional<Boolean> sendPrivate() {
        return Optional.ofNullable(this.sendPrivate);
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
     * Sets the duration of the cache. Setting the value to `0` equates to a `no-cache` header that forces revalidation.
     * 
     */
    @Import(name="ttl")
    private @Nullable String ttl;

    /**
     * @return Sets the duration of the cache. Setting the value to `0` equates to a `no-cache` header that forces revalidation.
     * 
     */
    public Optional<String> ttl() {
        return Optional.ofNullable(this.ttl);
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

    private GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache() {}

    private GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache(GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache $) {
        this.allowBehavior = $.allowBehavior;
        this.behavior = $.behavior;
        this.locked = $.locked;
        this.sendHeaders = $.sendHeaders;
        this.sendPrivate = $.sendPrivate;
        this.templateUuid = $.templateUuid;
        this.ttl = $.ttl;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowBehavior Specify how the edge server calculates the downstream cache by setting the value of the `Expires` header.
         * 
         * @return builder
         * 
         */
        public Builder allowBehavior(@Nullable String allowBehavior) {
            $.allowBehavior = allowBehavior;
            return this;
        }

        /**
         * @param behavior Specify the caching instructions the edge server sends to the end user&#39;s client.
         * 
         * @return builder
         * 
         */
        public Builder behavior(@Nullable String behavior) {
            $.behavior = behavior;
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
         * @param sendHeaders Specifies the HTTP headers to include in the response to the client.
         * 
         * @return builder
         * 
         */
        public Builder sendHeaders(@Nullable String sendHeaders) {
            $.sendHeaders = sendHeaders;
            return this;
        }

        /**
         * @param sendPrivate Adds a `Cache-Control: private` header to prevent objects from being cached in a shared caching proxy.
         * 
         * @return builder
         * 
         */
        public Builder sendPrivate(@Nullable Boolean sendPrivate) {
            $.sendPrivate = sendPrivate;
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
         * @param ttl Sets the duration of the cache. Setting the value to `0` equates to a `no-cache` header that forces revalidation.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable String ttl) {
            $.ttl = ttl;
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

        public GetPropertyRulesBuilderRulesV20240531BehaviorDownstreamCache build() {
            return $;
        }
    }

}
