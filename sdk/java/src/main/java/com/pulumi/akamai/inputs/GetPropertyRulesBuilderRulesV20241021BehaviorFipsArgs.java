// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs Empty = new GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs();

    /**
     * When enabled, supports the use of FIPS-validated ciphers in the connection between this delivery configuration and your origin server.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return When enabled, supports the use of FIPS-validated ciphers in the connection between this delivery configuration and your origin server.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * This option is for internal usage only.
     * 
     */
    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    /**
     * A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs() {}

    private GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs(GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs $) {
        this.enable = $.enable;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable When enabled, supports the use of FIPS-validated ciphers in the connection between this delivery configuration and your origin server.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable When enabled, supports the use of FIPS-validated ciphers in the connection between this delivery configuration and your origin server.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20241021BehaviorFipsArgs build() {
            return $;
        }
    }

}
