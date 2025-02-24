// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecAdvancedSettingsLoggingArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecAdvancedSettingsLoggingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecAdvancedSettingsLogging:AppSecAdvancedSettingsLogging")
public class AppSecAdvancedSettingsLogging extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the security configuration
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * Whether to enable, disable, or update HTTP header logging settings
     * 
     */
    @Export(name="logging", refs={String.class}, tree="[0]")
    private Output<String> logging;

    /**
     * @return Whether to enable, disable, or update HTTP header logging settings
     * 
     */
    public Output<String> logging() {
        return this.logging;
    }
    /**
     * Unique identifier of the security policy
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<Optional<String>> securityPolicyId() {
        return Codegen.optional(this.securityPolicyId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecAdvancedSettingsLogging(java.lang.String name) {
        this(name, AppSecAdvancedSettingsLoggingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecAdvancedSettingsLogging(java.lang.String name, AppSecAdvancedSettingsLoggingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecAdvancedSettingsLogging(java.lang.String name, AppSecAdvancedSettingsLoggingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecAdvancedSettingsLogging:AppSecAdvancedSettingsLogging", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecAdvancedSettingsLogging(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecAdvancedSettingsLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecAdvancedSettingsLogging:AppSecAdvancedSettingsLogging", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecAdvancedSettingsLoggingArgs makeArgs(AppSecAdvancedSettingsLoggingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecAdvancedSettingsLoggingArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AppSecAdvancedSettingsLogging get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecAdvancedSettingsLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecAdvancedSettingsLogging(name, id, state, options);
    }
}
