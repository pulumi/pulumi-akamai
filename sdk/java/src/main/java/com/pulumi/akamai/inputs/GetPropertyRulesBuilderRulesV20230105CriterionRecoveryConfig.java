// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig Empty = new GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig();

    /**
     * A unique identifier used for origin failure recovery configurations. This is the recovery method configuration name you apply when setting origin failure recovery methods and scenarios in `originFailureRecoveryMethod` and `originFailureRecoveryPolicy` behaviors. The value can contain alphanumeric characters and dashes.
     * 
     */
    @Import(name="configName")
    private @Nullable String configName;

    /**
     * @return A unique identifier used for origin failure recovery configurations. This is the recovery method configuration name you apply when setting origin failure recovery methods and scenarios in `originFailureRecoveryMethod` and `originFailureRecoveryPolicy` behaviors. The value can contain alphanumeric characters and dashes.
     * 
     */
    public Optional<String> configName() {
        return Optional.ofNullable(this.configName);
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

    private GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig(GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig $) {
        this.configName = $.configName;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig(Objects.requireNonNull(defaults));
        }

        /**
         * @param configName A unique identifier used for origin failure recovery configurations. This is the recovery method configuration name you apply when setting origin failure recovery methods and scenarios in `originFailureRecoveryMethod` and `originFailureRecoveryPolicy` behaviors. The value can contain alphanumeric characters and dashes.
         * 
         * @return builder
         * 
         */
        public Builder configName(@Nullable String configName) {
            $.configName = configName;
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

        public GetPropertyRulesBuilderRulesV20230105CriterionRecoveryConfig build() {
            return $;
        }
    }

}
