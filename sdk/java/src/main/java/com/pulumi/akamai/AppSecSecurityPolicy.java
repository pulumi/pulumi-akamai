// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecSecurityPolicyArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecSecurityPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecSecurityPolicy:AppSecSecurityPolicy")
public class AppSecSecurityPolicy extends com.pulumi.resources.CustomResource {
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
     * Unique identifier of the existing security policy being cloned
     * 
     */
    @Export(name="createFromSecurityPolicyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> createFromSecurityPolicyId;

    /**
     * @return Unique identifier of the existing security policy being cloned
     * 
     */
    public Output<Optional<String>> createFromSecurityPolicyId() {
        return Codegen.optional(this.createFromSecurityPolicyId);
    }
    /**
     * Whether to assign default settings to the new security policy
     * 
     */
    @Export(name="defaultSettings", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> defaultSettings;

    /**
     * @return Whether to assign default settings to the new security policy
     * 
     */
    public Output<Optional<Boolean>> defaultSettings() {
        return Codegen.optional(this.defaultSettings);
    }
    /**
     * Unique identifier of the new security policy
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the new security policy
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }
    /**
     * Name of the new security policy
     * 
     */
    @Export(name="securityPolicyName", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyName;

    /**
     * @return Name of the new security policy
     * 
     */
    public Output<String> securityPolicyName() {
        return this.securityPolicyName;
    }
    /**
     * Four-character alphanumeric string prefix used in creating the security policy ID
     * 
     */
    @Export(name="securityPolicyPrefix", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyPrefix;

    /**
     * @return Four-character alphanumeric string prefix used in creating the security policy ID
     * 
     */
    public Output<String> securityPolicyPrefix() {
        return this.securityPolicyPrefix;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecSecurityPolicy(java.lang.String name) {
        this(name, AppSecSecurityPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecSecurityPolicy(java.lang.String name, AppSecSecurityPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecSecurityPolicy(java.lang.String name, AppSecSecurityPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecSecurityPolicy:AppSecSecurityPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecSecurityPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecSecurityPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecSecurityPolicy:AppSecSecurityPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecSecurityPolicyArgs makeArgs(AppSecSecurityPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecSecurityPolicyArgs.Empty : args;
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
    public static AppSecSecurityPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecSecurityPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecSecurityPolicy(name, id, state, options);
    }
}
