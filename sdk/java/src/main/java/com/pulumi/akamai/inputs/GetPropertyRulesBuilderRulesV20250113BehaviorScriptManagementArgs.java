// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs Empty = new GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs();

    /**
     * Enables the Script Management feature.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables the Script Management feature.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
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
     * Script Management uses a JavaScript service worker called `akam-sw.js`. It applies a policy that helps you manage scripts.
     * 
     */
    @Import(name="serviceworker")
    private @Nullable Output<String> serviceworker;

    /**
     * @return Script Management uses a JavaScript service worker called `akam-sw.js`. It applies a policy that helps you manage scripts.
     * 
     */
    public Optional<Output<String>> serviceworker() {
        return Optional.ofNullable(this.serviceworker);
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
     * A read-only epoch timestamp that represents the last time a Script Management policy was synchronized with its Ion property.
     * 
     */
    @Import(name="timestamp")
    private @Nullable Output<Integer> timestamp;

    /**
     * @return A read-only epoch timestamp that represents the last time a Script Management policy was synchronized with its Ion property.
     * 
     */
    public Optional<Output<Integer>> timestamp() {
        return Optional.ofNullable(this.timestamp);
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

    private GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs() {}

    private GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs(GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs $) {
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.serviceworker = $.serviceworker;
        this.templateUuid = $.templateUuid;
        this.timestamp = $.timestamp;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enables the Script Management feature.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables the Script Management feature.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
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
         * @param serviceworker Script Management uses a JavaScript service worker called `akam-sw.js`. It applies a policy that helps you manage scripts.
         * 
         * @return builder
         * 
         */
        public Builder serviceworker(@Nullable Output<String> serviceworker) {
            $.serviceworker = serviceworker;
            return this;
        }

        /**
         * @param serviceworker Script Management uses a JavaScript service worker called `akam-sw.js`. It applies a policy that helps you manage scripts.
         * 
         * @return builder
         * 
         */
        public Builder serviceworker(String serviceworker) {
            return serviceworker(Output.of(serviceworker));
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
         * @param timestamp A read-only epoch timestamp that represents the last time a Script Management policy was synchronized with its Ion property.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(@Nullable Output<Integer> timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param timestamp A read-only epoch timestamp that represents the last time a Script Management policy was synchronized with its Ion property.
         * 
         * @return builder
         * 
         */
        public Builder timestamp(Integer timestamp) {
            return timestamp(Output.of(timestamp));
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

        public GetPropertyRulesBuilderRulesV20250113BehaviorScriptManagementArgs build() {
            return $;
        }
    }

}
