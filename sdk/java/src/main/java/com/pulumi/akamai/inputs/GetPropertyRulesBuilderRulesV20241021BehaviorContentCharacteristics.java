// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics Empty = new GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics();

    /**
     * Optimize based on the total size of the content library delivered.
     * 
     */
    @Import(name="catalogSize")
    private @Nullable String catalogSize;

    /**
     * @return Optimize based on the total size of the content library delivered.
     * 
     */
    public Optional<String> catalogSize() {
        return Optional.ofNullable(this.catalogSize);
    }

    /**
     * Optimize based on the type of content.
     * 
     */
    @Import(name="contentType")
    private @Nullable String contentType;

    /**
     * @return Optimize based on the type of content.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
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
     * Optimize based on the size of the object retrieved from the origin.
     * 
     */
    @Import(name="objectSize")
    private @Nullable String objectSize;

    /**
     * @return Optimize based on the size of the object retrieved from the origin.
     * 
     */
    public Optional<String> objectSize() {
        return Optional.ofNullable(this.objectSize);
    }

    /**
     * Optimize based on the content&#39;s expected popularity.
     * 
     */
    @Import(name="popularityDistribution")
    private @Nullable String popularityDistribution;

    /**
     * @return Optimize based on the content&#39;s expected popularity.
     * 
     */
    public Optional<String> popularityDistribution() {
        return Optional.ofNullable(this.popularityDistribution);
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

    private GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics() {}

    private GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics(GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics $) {
        this.catalogSize = $.catalogSize;
        this.contentType = $.contentType;
        this.locked = $.locked;
        this.objectSize = $.objectSize;
        this.popularityDistribution = $.popularityDistribution;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics();
        }

        public Builder(GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics defaults) {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogSize Optimize based on the total size of the content library delivered.
         * 
         * @return builder
         * 
         */
        public Builder catalogSize(@Nullable String catalogSize) {
            $.catalogSize = catalogSize;
            return this;
        }

        /**
         * @param contentType Optimize based on the type of content.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable String contentType) {
            $.contentType = contentType;
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
         * @param objectSize Optimize based on the size of the object retrieved from the origin.
         * 
         * @return builder
         * 
         */
        public Builder objectSize(@Nullable String objectSize) {
            $.objectSize = objectSize;
            return this;
        }

        /**
         * @param popularityDistribution Optimize based on the content&#39;s expected popularity.
         * 
         * @return builder
         * 
         */
        public Builder popularityDistribution(@Nullable String popularityDistribution) {
            $.popularityDistribution = popularityDistribution;
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

        public GetPropertyRulesBuilderRulesV20241021BehaviorContentCharacteristics build() {
            return $;
        }
    }

}
