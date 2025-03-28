// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient Empty = new GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient();

    /**
     * Specifies the ID of data source&#39;s beacon.
     * 
     */
    @Import(name="beaconId")
    private @Nullable String beaconId;

    /**
     * @return Specifies the ID of data source&#39;s beacon.
     * 
     */
    public Optional<String> beaconId() {
        return Optional.ofNullable(this.beaconId);
    }

    /**
     * Enables client-side download analytics.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Enables client-side download analytics.
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
     * Enables the hybrid HTTP/UDP protocol.
     * 
     */
    @Import(name="useHybridHttpUdp")
    private @Nullable Boolean useHybridHttpUdp;

    /**
     * @return Enables the hybrid HTTP/UDP protocol.
     * 
     */
    public Optional<Boolean> useHybridHttpUdp() {
        return Optional.ofNullable(this.useHybridHttpUdp);
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

    private GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient() {}

    private GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient(GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient $) {
        this.beaconId = $.beaconId;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.useHybridHttpUdp = $.useHybridHttpUdp;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient();
        }

        public Builder(GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient defaults) {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient(Objects.requireNonNull(defaults));
        }

        /**
         * @param beaconId Specifies the ID of data source&#39;s beacon.
         * 
         * @return builder
         * 
         */
        public Builder beaconId(@Nullable String beaconId) {
            $.beaconId = beaconId;
            return this;
        }

        /**
         * @param enabled Enables client-side download analytics.
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
         * @param useHybridHttpUdp Enables the hybrid HTTP/UDP protocol.
         * 
         * @return builder
         * 
         */
        public Builder useHybridHttpUdp(@Nullable Boolean useHybridHttpUdp) {
            $.useHybridHttpUdp = useHybridHttpUdp;
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

        public GetPropertyRulesBuilderRulesV20250113BehaviorMediaClient build() {
            return $;
        }
    }

}
