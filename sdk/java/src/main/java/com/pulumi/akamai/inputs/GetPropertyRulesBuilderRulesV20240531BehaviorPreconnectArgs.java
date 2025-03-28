// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs Empty = new GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs();

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
     * Specifies the set of hostnames to which to preconnect over HTTP2.
     * 
     */
    @Import(name="preconnectlists")
    private @Nullable Output<List<String>> preconnectlists;

    /**
     * @return Specifies the set of hostnames to which to preconnect over HTTP2.
     * 
     */
    public Optional<Output<List<String>>> preconnectlists() {
        return Optional.ofNullable(this.preconnectlists);
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

    private GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs() {}

    private GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs(GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs $) {
        this.locked = $.locked;
        this.preconnectlists = $.preconnectlists;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs(Objects.requireNonNull(defaults));
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
         * @param preconnectlists Specifies the set of hostnames to which to preconnect over HTTP2.
         * 
         * @return builder
         * 
         */
        public Builder preconnectlists(@Nullable Output<List<String>> preconnectlists) {
            $.preconnectlists = preconnectlists;
            return this;
        }

        /**
         * @param preconnectlists Specifies the set of hostnames to which to preconnect over HTTP2.
         * 
         * @return builder
         * 
         */
        public Builder preconnectlists(List<String> preconnectlists) {
            return preconnectlists(Output.of(preconnectlists));
        }

        /**
         * @param preconnectlists Specifies the set of hostnames to which to preconnect over HTTP2.
         * 
         * @return builder
         * 
         */
        public Builder preconnectlists(String... preconnectlists) {
            return preconnectlists(List.of(preconnectlists));
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

        public GetPropertyRulesBuilderRulesV20240531BehaviorPreconnectArgs build() {
            return $;
        }
    }

}
