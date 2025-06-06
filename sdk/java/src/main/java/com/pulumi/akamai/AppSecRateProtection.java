// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecRateProtectionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecRateProtectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecRateProtection:AppSecRateProtection")
public class AppSecRateProtection extends com.pulumi.resources.CustomResource {
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
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Text representation
     * 
     */
    @Export(name="outputText", refs={String.class}, tree="[0]")
    private Output<String> outputText;

    /**
     * @return Text representation
     * 
     */
    public Output<String> outputText() {
        return this.outputText;
    }
    /**
     * Unique identifier of the security policy
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecRateProtection(java.lang.String name) {
        this(name, AppSecRateProtectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecRateProtection(java.lang.String name, AppSecRateProtectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecRateProtection(java.lang.String name, AppSecRateProtectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRateProtection:AppSecRateProtection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecRateProtection(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRateProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRateProtection:AppSecRateProtection", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecRateProtectionArgs makeArgs(AppSecRateProtectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecRateProtectionArgs.Empty : args;
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
    public static AppSecRateProtection get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRateProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecRateProtection(name, id, state, options);
    }
}
