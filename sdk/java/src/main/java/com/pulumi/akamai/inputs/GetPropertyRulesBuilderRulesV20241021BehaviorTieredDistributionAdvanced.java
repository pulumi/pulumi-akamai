// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced Empty = new GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced();

    @Import(name="allowall")
    private @Nullable Boolean allowall;

    public Optional<Boolean> allowall() {
        return Optional.ofNullable(this.allowall);
    }

    /**
     * When enabled, activates tiered distribution.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return When enabled, activates tiered distribution.
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

    @Import(name="method")
    private @Nullable String method;

    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }

    @Import(name="policy")
    private @Nullable String policy;

    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
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
     * Optionally map the tiered parent server&#39;s location close to your origin: `CHEU2` for Europe; `CHAUS` for Australia; `CHAPAC` for China and the Asian Pacific area; `CHWUS2`, `CHCUS2`, and `CHEUS2` for different parts of the United States. Choose `CH` or `CH2` for a more global map. A narrower local map minimizes the origin server&#39;s load, and increases the likelihood the requested object is cached. A wider global map reduces end-user latency, but decreases the likelihood the requested object is in any given parent server&#39;s cache.  This option cannot apply if the property is marked as secure. See `Secure property requirements` for guidance.
     * 
     */
    @Import(name="tieredDistributionMap")
    private @Nullable String tieredDistributionMap;

    /**
     * @return Optionally map the tiered parent server&#39;s location close to your origin: `CHEU2` for Europe; `CHAUS` for Australia; `CHAPAC` for China and the Asian Pacific area; `CHWUS2`, `CHCUS2`, and `CHEUS2` for different parts of the United States. Choose `CH` or `CH2` for a more global map. A narrower local map minimizes the origin server&#39;s load, and increases the likelihood the requested object is cached. A wider global map reduces end-user latency, but decreases the likelihood the requested object is in any given parent server&#39;s cache.  This option cannot apply if the property is marked as secure. See `Secure property requirements` for guidance.
     * 
     */
    public Optional<String> tieredDistributionMap() {
        return Optional.ofNullable(this.tieredDistributionMap);
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

    private GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced() {}

    private GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced(GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced $) {
        this.allowall = $.allowall;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.method = $.method;
        this.policy = $.policy;
        this.templateUuid = $.templateUuid;
        this.tieredDistributionMap = $.tieredDistributionMap;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced();
        }

        public Builder(GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced defaults) {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced(Objects.requireNonNull(defaults));
        }

        public Builder allowall(@Nullable Boolean allowall) {
            $.allowall = allowall;
            return this;
        }

        /**
         * @param enabled When enabled, activates tiered distribution.
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

        public Builder method(@Nullable String method) {
            $.method = method;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            $.policy = policy;
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
         * @param tieredDistributionMap Optionally map the tiered parent server&#39;s location close to your origin: `CHEU2` for Europe; `CHAUS` for Australia; `CHAPAC` for China and the Asian Pacific area; `CHWUS2`, `CHCUS2`, and `CHEUS2` for different parts of the United States. Choose `CH` or `CH2` for a more global map. A narrower local map minimizes the origin server&#39;s load, and increases the likelihood the requested object is cached. A wider global map reduces end-user latency, but decreases the likelihood the requested object is in any given parent server&#39;s cache.  This option cannot apply if the property is marked as secure. See `Secure property requirements` for guidance.
         * 
         * @return builder
         * 
         */
        public Builder tieredDistributionMap(@Nullable String tieredDistributionMap) {
            $.tieredDistributionMap = tieredDistributionMap;
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

        public GetPropertyRulesBuilderRulesV20241021BehaviorTieredDistributionAdvanced build() {
            return $;
        }
    }

}
