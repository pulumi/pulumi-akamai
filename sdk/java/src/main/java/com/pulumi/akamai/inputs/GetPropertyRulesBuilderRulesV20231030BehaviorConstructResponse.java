// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse Empty = new GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse();

    /**
     * HTML response of up to 2000 characters to send to the end-user client.
     * 
     */
    @Import(name="body")
    private @Nullable String body;

    /**
     * @return HTML response of up to 2000 characters to send to the end-user client.
     * 
     */
    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Serves the custom response.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Serves the custom response.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * For GET requests from clients, this forces edge servers to evict the underlying object from cache. Defaults to `false`.
     * 
     */
    @Import(name="forceEviction")
    private @Nullable Boolean forceEviction;

    /**
     * @return For GET requests from clients, this forces edge servers to evict the underlying object from cache. Defaults to `false`.
     * 
     */
    public Optional<Boolean> forceEviction() {
        return Optional.ofNullable(this.forceEviction);
    }

    /**
     * Whether to ignore the custom response when purging.
     * 
     */
    @Import(name="ignorePurge")
    private @Nullable Boolean ignorePurge;

    /**
     * @return Whether to ignore the custom response when purging.
     * 
     */
    public Optional<Boolean> ignorePurge() {
        return Optional.ofNullable(this.ignorePurge);
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
     * The HTTP response code to send to the end-user client.
     * 
     */
    @Import(name="responseCode")
    private @Nullable Integer responseCode;

    /**
     * @return The HTTP response code to send to the end-user client.
     * 
     */
    public Optional<Integer> responseCode() {
        return Optional.ofNullable(this.responseCode);
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

    private GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse() {}

    private GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse(GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse $) {
        this.body = $.body;
        this.enabled = $.enabled;
        this.forceEviction = $.forceEviction;
        this.ignorePurge = $.ignorePurge;
        this.locked = $.locked;
        this.responseCode = $.responseCode;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse();
        }

        public Builder(GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse defaults) {
            $ = new GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param body HTML response of up to 2000 characters to send to the end-user client.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable String body) {
            $.body = body;
            return this;
        }

        /**
         * @param enabled Serves the custom response.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param forceEviction For GET requests from clients, this forces edge servers to evict the underlying object from cache. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder forceEviction(@Nullable Boolean forceEviction) {
            $.forceEviction = forceEviction;
            return this;
        }

        /**
         * @param ignorePurge Whether to ignore the custom response when purging.
         * 
         * @return builder
         * 
         */
        public Builder ignorePurge(@Nullable Boolean ignorePurge) {
            $.ignorePurge = ignorePurge;
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
         * @param responseCode The HTTP response code to send to the end-user client.
         * 
         * @return builder
         * 
         */
        public Builder responseCode(@Nullable Integer responseCode) {
            $.responseCode = responseCode;
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

        public GetPropertyRulesBuilderRulesV20231030BehaviorConstructResponse build() {
            return $;
        }
    }

}
