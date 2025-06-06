// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecRatePolicyArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecRatePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecRatePolicy:AppSecRatePolicy")
public class AppSecRatePolicy extends com.pulumi.resources.CustomResource {
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
     * JSON-formatted definition of the rate policy
     * 
     */
    @Export(name="ratePolicy", refs={String.class}, tree="[0]")
    private Output<String> ratePolicy;

    /**
     * @return JSON-formatted definition of the rate policy
     * 
     */
    public Output<String> ratePolicy() {
        return this.ratePolicy;
    }
    /**
     * Unique identifier of the rate policy
     * 
     */
    @Export(name="ratePolicyId", refs={Integer.class}, tree="[0]")
    private Output<Integer> ratePolicyId;

    /**
     * @return Unique identifier of the rate policy
     * 
     */
    public Output<Integer> ratePolicyId() {
        return this.ratePolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecRatePolicy(java.lang.String name) {
        this(name, AppSecRatePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecRatePolicy(java.lang.String name, AppSecRatePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecRatePolicy(java.lang.String name, AppSecRatePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRatePolicy:AppSecRatePolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecRatePolicy(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRatePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRatePolicy:AppSecRatePolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecRatePolicyArgs makeArgs(AppSecRatePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecRatePolicyArgs.Empty : args;
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
    public static AppSecRatePolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRatePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecRatePolicy(name, id, state, options);
    }
}
