// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationCloudletPolicyArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationNetStorageArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationThrottledCpCodeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs Empty = new GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs();

    /**
     * Specifies the alternate response&#39;s time to live in the cache, `5` minutes by default.
     * 
     */
    @Import(name="alternateResponseCacheTtl")
    private @Nullable Output<Integer> alternateResponseCacheTtl;

    /**
     * @return Specifies the alternate response&#39;s time to live in the cache, `5` minutes by default.
     * 
     */
    public Optional<Output<Integer>> alternateResponseCacheTtl() {
        return Optional.ofNullable(this.alternateResponseCacheTtl);
    }

    /**
     * Identifies the Cloudlet policy.
     * 
     */
    @Import(name="cloudletPolicy")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationCloudletPolicyArgs> cloudletPolicy;

    /**
     * @return Identifies the Cloudlet policy.
     * 
     */
    public Optional<Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationCloudletPolicyArgs>> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    /**
     * Identifies the Cloudlet shared policy to use with this behavior. Use the `Cloudlets API` to list available shared policies.
     * 
     */
    @Import(name="cloudletSharedPolicy")
    private @Nullable Output<Integer> cloudletSharedPolicy;

    /**
     * @return Identifies the Cloudlet shared policy to use with this behavior. Use the `Cloudlets API` to list available shared policies.
     * 
     */
    public Optional<Output<Integer>> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }

    /**
     * Activates the API Prioritization feature.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Activates the API Prioritization feature.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Whether you want to apply the Cloudlet shared policy to an unlimited number of properties within your account. Learn more about shared policies and how to create them in `Cloudlets Policy Manager`.
     * 
     */
    @Import(name="isSharedPolicy")
    private @Nullable Output<Boolean> isSharedPolicy;

    /**
     * @return Whether you want to apply the Cloudlet shared policy to an unlimited number of properties within your account. Learn more about shared policies and how to create them in `Cloudlets Policy Manager`.
     * 
     */
    public Optional<Output<Boolean>> isSharedPolicy() {
        return Optional.ofNullable(this.isSharedPolicy);
    }

    /**
     * A label to distinguish this API Prioritization policy from any others in the same property.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A label to distinguish this API Prioritization policy from any others in the same property.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
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
     * Specify the NetStorage domain that contains the alternate response.
     * 
     */
    @Import(name="netStorage")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationNetStorageArgs> netStorage;

    /**
     * @return Specify the NetStorage domain that contains the alternate response.
     * 
     */
    public Optional<Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationNetStorageArgs>> netStorage() {
        return Optional.ofNullable(this.netStorage);
    }

    /**
     * Specify the full NetStorage path for the alternate response, including trailing file name.
     * 
     */
    @Import(name="netStoragePath")
    private @Nullable Output<String> netStoragePath;

    /**
     * @return Specify the full NetStorage path for the alternate response, including trailing file name.
     * 
     */
    public Optional<Output<String>> netStoragePath() {
        return Optional.ofNullable(this.netStoragePath);
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
     * Specifies the CP code as an object. You only need to provide the initial `id`, stripping any `cpc_` prefix to pass the integer to the rule tree. Additional CP code details may reflect back in subsequent read-only data.
     * 
     */
    @Import(name="throttledCpCode")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationThrottledCpCodeArgs> throttledCpCode;

    /**
     * @return Specifies the CP code as an object. You only need to provide the initial `id`, stripping any `cpc_` prefix to pass the integer to the rule tree. Additional CP code details may reflect back in subsequent read-only data.
     * 
     */
    public Optional<Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationThrottledCpCodeArgs>> throttledCpCode() {
        return Optional.ofNullable(this.throttledCpCode);
    }

    /**
     * Specifies the HTTP response code for requests that receive the alternate response.
     * 
     */
    @Import(name="throttledStatusCode")
    private @Nullable Output<Integer> throttledStatusCode;

    /**
     * @return Specifies the HTTP response code for requests that receive the alternate response.
     * 
     */
    public Optional<Output<Integer>> throttledStatusCode() {
        return Optional.ofNullable(this.throttledStatusCode);
    }

    /**
     * Specifies whether to apply an alternative CP code for requests served the alternate response.
     * 
     */
    @Import(name="useThrottledCpCode")
    private @Nullable Output<Boolean> useThrottledCpCode;

    /**
     * @return Specifies whether to apply an alternative CP code for requests served the alternate response.
     * 
     */
    public Optional<Output<Boolean>> useThrottledCpCode() {
        return Optional.ofNullable(this.useThrottledCpCode);
    }

    /**
     * Allows you to assign a specific HTTP response code to a throttled request.
     * 
     */
    @Import(name="useThrottledStatusCode")
    private @Nullable Output<Boolean> useThrottledStatusCode;

    /**
     * @return Allows you to assign a specific HTTP response code to a throttled request.
     * 
     */
    public Optional<Output<Boolean>> useThrottledStatusCode() {
        return Optional.ofNullable(this.useThrottledStatusCode);
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

    private GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs() {}

    private GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs(GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs $) {
        this.alternateResponseCacheTtl = $.alternateResponseCacheTtl;
        this.cloudletPolicy = $.cloudletPolicy;
        this.cloudletSharedPolicy = $.cloudletSharedPolicy;
        this.enabled = $.enabled;
        this.isSharedPolicy = $.isSharedPolicy;
        this.label = $.label;
        this.locked = $.locked;
        this.netStorage = $.netStorage;
        this.netStoragePath = $.netStoragePath;
        this.templateUuid = $.templateUuid;
        this.throttledCpCode = $.throttledCpCode;
        this.throttledStatusCode = $.throttledStatusCode;
        this.useThrottledCpCode = $.useThrottledCpCode;
        this.useThrottledStatusCode = $.useThrottledStatusCode;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternateResponseCacheTtl Specifies the alternate response&#39;s time to live in the cache, `5` minutes by default.
         * 
         * @return builder
         * 
         */
        public Builder alternateResponseCacheTtl(@Nullable Output<Integer> alternateResponseCacheTtl) {
            $.alternateResponseCacheTtl = alternateResponseCacheTtl;
            return this;
        }

        /**
         * @param alternateResponseCacheTtl Specifies the alternate response&#39;s time to live in the cache, `5` minutes by default.
         * 
         * @return builder
         * 
         */
        public Builder alternateResponseCacheTtl(Integer alternateResponseCacheTtl) {
            return alternateResponseCacheTtl(Output.of(alternateResponseCacheTtl));
        }

        /**
         * @param cloudletPolicy Identifies the Cloudlet policy.
         * 
         * @return builder
         * 
         */
        public Builder cloudletPolicy(@Nullable Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationCloudletPolicyArgs> cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        /**
         * @param cloudletPolicy Identifies the Cloudlet policy.
         * 
         * @return builder
         * 
         */
        public Builder cloudletPolicy(GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationCloudletPolicyArgs cloudletPolicy) {
            return cloudletPolicy(Output.of(cloudletPolicy));
        }

        /**
         * @param cloudletSharedPolicy Identifies the Cloudlet shared policy to use with this behavior. Use the `Cloudlets API` to list available shared policies.
         * 
         * @return builder
         * 
         */
        public Builder cloudletSharedPolicy(@Nullable Output<Integer> cloudletSharedPolicy) {
            $.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }

        /**
         * @param cloudletSharedPolicy Identifies the Cloudlet shared policy to use with this behavior. Use the `Cloudlets API` to list available shared policies.
         * 
         * @return builder
         * 
         */
        public Builder cloudletSharedPolicy(Integer cloudletSharedPolicy) {
            return cloudletSharedPolicy(Output.of(cloudletSharedPolicy));
        }

        /**
         * @param enabled Activates the API Prioritization feature.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Activates the API Prioritization feature.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param isSharedPolicy Whether you want to apply the Cloudlet shared policy to an unlimited number of properties within your account. Learn more about shared policies and how to create them in `Cloudlets Policy Manager`.
         * 
         * @return builder
         * 
         */
        public Builder isSharedPolicy(@Nullable Output<Boolean> isSharedPolicy) {
            $.isSharedPolicy = isSharedPolicy;
            return this;
        }

        /**
         * @param isSharedPolicy Whether you want to apply the Cloudlet shared policy to an unlimited number of properties within your account. Learn more about shared policies and how to create them in `Cloudlets Policy Manager`.
         * 
         * @return builder
         * 
         */
        public Builder isSharedPolicy(Boolean isSharedPolicy) {
            return isSharedPolicy(Output.of(isSharedPolicy));
        }

        /**
         * @param label A label to distinguish this API Prioritization policy from any others in the same property.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A label to distinguish this API Prioritization policy from any others in the same property.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
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
         * @param netStorage Specify the NetStorage domain that contains the alternate response.
         * 
         * @return builder
         * 
         */
        public Builder netStorage(@Nullable Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationNetStorageArgs> netStorage) {
            $.netStorage = netStorage;
            return this;
        }

        /**
         * @param netStorage Specify the NetStorage domain that contains the alternate response.
         * 
         * @return builder
         * 
         */
        public Builder netStorage(GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationNetStorageArgs netStorage) {
            return netStorage(Output.of(netStorage));
        }

        /**
         * @param netStoragePath Specify the full NetStorage path for the alternate response, including trailing file name.
         * 
         * @return builder
         * 
         */
        public Builder netStoragePath(@Nullable Output<String> netStoragePath) {
            $.netStoragePath = netStoragePath;
            return this;
        }

        /**
         * @param netStoragePath Specify the full NetStorage path for the alternate response, including trailing file name.
         * 
         * @return builder
         * 
         */
        public Builder netStoragePath(String netStoragePath) {
            return netStoragePath(Output.of(netStoragePath));
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
         * @param throttledCpCode Specifies the CP code as an object. You only need to provide the initial `id`, stripping any `cpc_` prefix to pass the integer to the rule tree. Additional CP code details may reflect back in subsequent read-only data.
         * 
         * @return builder
         * 
         */
        public Builder throttledCpCode(@Nullable Output<GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationThrottledCpCodeArgs> throttledCpCode) {
            $.throttledCpCode = throttledCpCode;
            return this;
        }

        /**
         * @param throttledCpCode Specifies the CP code as an object. You only need to provide the initial `id`, stripping any `cpc_` prefix to pass the integer to the rule tree. Additional CP code details may reflect back in subsequent read-only data.
         * 
         * @return builder
         * 
         */
        public Builder throttledCpCode(GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationThrottledCpCodeArgs throttledCpCode) {
            return throttledCpCode(Output.of(throttledCpCode));
        }

        /**
         * @param throttledStatusCode Specifies the HTTP response code for requests that receive the alternate response.
         * 
         * @return builder
         * 
         */
        public Builder throttledStatusCode(@Nullable Output<Integer> throttledStatusCode) {
            $.throttledStatusCode = throttledStatusCode;
            return this;
        }

        /**
         * @param throttledStatusCode Specifies the HTTP response code for requests that receive the alternate response.
         * 
         * @return builder
         * 
         */
        public Builder throttledStatusCode(Integer throttledStatusCode) {
            return throttledStatusCode(Output.of(throttledStatusCode));
        }

        /**
         * @param useThrottledCpCode Specifies whether to apply an alternative CP code for requests served the alternate response.
         * 
         * @return builder
         * 
         */
        public Builder useThrottledCpCode(@Nullable Output<Boolean> useThrottledCpCode) {
            $.useThrottledCpCode = useThrottledCpCode;
            return this;
        }

        /**
         * @param useThrottledCpCode Specifies whether to apply an alternative CP code for requests served the alternate response.
         * 
         * @return builder
         * 
         */
        public Builder useThrottledCpCode(Boolean useThrottledCpCode) {
            return useThrottledCpCode(Output.of(useThrottledCpCode));
        }

        /**
         * @param useThrottledStatusCode Allows you to assign a specific HTTP response code to a throttled request.
         * 
         * @return builder
         * 
         */
        public Builder useThrottledStatusCode(@Nullable Output<Boolean> useThrottledStatusCode) {
            $.useThrottledStatusCode = useThrottledStatusCode;
            return this;
        }

        /**
         * @param useThrottledStatusCode Allows you to assign a specific HTTP response code to a throttled request.
         * 
         * @return builder
         * 
         */
        public Builder useThrottledStatusCode(Boolean useThrottledStatusCode) {
            return useThrottledStatusCode(Output.of(useThrottledStatusCode));
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

        public GetPropertyRulesBuilderRulesV20240813BehaviorApiPrioritizationArgs build() {
            return $;
        }
    }

}
