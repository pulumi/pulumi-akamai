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


public final class GetPropertyRulesBuilderRulesV20231030CriterionBucket extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20231030CriterionBucket Empty = new GetPropertyRulesBuilderRulesV20231030CriterionBucket();

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
     * Specifies the percentage of requests to match.
     * 
     */
    @Import(name="percentage")
    private @Nullable Integer percentage;

    /**
     * @return Specifies the percentage of requests to match.
     * 
     */
    public Optional<Integer> percentage() {
        return Optional.ofNullable(this.percentage);
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

    private GetPropertyRulesBuilderRulesV20231030CriterionBucket() {}

    private GetPropertyRulesBuilderRulesV20231030CriterionBucket(GetPropertyRulesBuilderRulesV20231030CriterionBucket $) {
        this.locked = $.locked;
        this.percentage = $.percentage;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20231030CriterionBucket defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20231030CriterionBucket $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20231030CriterionBucket();
        }

        public Builder(GetPropertyRulesBuilderRulesV20231030CriterionBucket defaults) {
            $ = new GetPropertyRulesBuilderRulesV20231030CriterionBucket(Objects.requireNonNull(defaults));
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
         * @param percentage Specifies the percentage of requests to match.
         * 
         * @return builder
         * 
         */
        public Builder percentage(@Nullable Integer percentage) {
            $.percentage = percentage;
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

        public GetPropertyRulesBuilderRulesV20231030CriterionBucket build() {
            return $;
        }
    }

}
