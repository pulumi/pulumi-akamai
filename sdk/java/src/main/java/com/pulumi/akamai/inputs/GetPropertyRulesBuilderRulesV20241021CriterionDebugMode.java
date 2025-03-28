// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20241021CriterionDebugMode extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20241021CriterionDebugMode Empty = new GetPropertyRulesBuilderRulesV20241021CriterionDebugMode();

    /**
     * Whether the request is being debugged using Enhanced Debug.
     * 
     */
    @Import(name="debugMode")
    private @Nullable Boolean debugMode;

    /**
     * @return Whether the request is being debugged using Enhanced Debug.
     * 
     */
    public Optional<Boolean> debugMode() {
        return Optional.ofNullable(this.debugMode);
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

    private GetPropertyRulesBuilderRulesV20241021CriterionDebugMode() {}

    private GetPropertyRulesBuilderRulesV20241021CriterionDebugMode(GetPropertyRulesBuilderRulesV20241021CriterionDebugMode $) {
        this.debugMode = $.debugMode;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20241021CriterionDebugMode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20241021CriterionDebugMode $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20241021CriterionDebugMode();
        }

        public Builder(GetPropertyRulesBuilderRulesV20241021CriterionDebugMode defaults) {
            $ = new GetPropertyRulesBuilderRulesV20241021CriterionDebugMode(Objects.requireNonNull(defaults));
        }

        /**
         * @param debugMode Whether the request is being debugged using Enhanced Debug.
         * 
         * @return builder
         * 
         */
        public Builder debugMode(@Nullable Boolean debugMode) {
            $.debugMode = debugMode;
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

        public GetPropertyRulesBuilderRulesV20241021CriterionDebugMode build() {
            return $;
        }
    }

}
