// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.ImagingPolicyImageArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.ImagingPolicyImageState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/imagingPolicyImage:ImagingPolicyImage")
public class ImagingPolicyImage extends com.pulumi.resources.CustomResource {
    /**
     * With this flag set to false, the user can perform modifications on staging without affecting the version already saved
     * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
     * it back to false only when there are any changes to the policy qualifying it for the new version.
     * 
     */
    @Export(name="activateOnProduction", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> activateOnProduction;

    /**
     * @return With this flag set to false, the user can perform modifications on staging without affecting the version already saved
     * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
     * it back to false only when there are any changes to the policy qualifying it for the new version.
     * 
     */
    public Output<Optional<Boolean>> activateOnProduction() {
        return Codegen.optional(this.activateOnProduction);
    }
    /**
     * Unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    @Export(name="contractId", refs={String.class}, tree="[0]")
    private Output<String> contractId;

    /**
     * @return Unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }
    /**
     * A JSON encoded policy
     * 
     */
    @Export(name="json", refs={String.class}, tree="[0]")
    private Output<String> json;

    /**
     * @return A JSON encoded policy
     * 
     */
    public Output<String> json() {
        return this.json;
    }
    /**
     * Unique identifier for a Policy. It is not possible to modify the id of the policy.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return Unique identifier for a Policy. It is not possible to modify the id of the policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * Unique identifier for the Image &amp; Video Manager Policy Set.
     * 
     */
    @Export(name="policysetId", refs={String.class}, tree="[0]")
    private Output<String> policysetId;

    /**
     * @return Unique identifier for the Image &amp; Video Manager Policy Set.
     * 
     */
    public Output<String> policysetId() {
        return this.policysetId;
    }
    /**
     * The version number of this policy version
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The version number of this policy version
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImagingPolicyImage(java.lang.String name) {
        this(name, ImagingPolicyImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImagingPolicyImage(java.lang.String name, ImagingPolicyImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImagingPolicyImage(java.lang.String name, ImagingPolicyImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/imagingPolicyImage:ImagingPolicyImage", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ImagingPolicyImage(java.lang.String name, Output<java.lang.String> id, @Nullable ImagingPolicyImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/imagingPolicyImage:ImagingPolicyImage", name, state, makeResourceOptions(options, id), false);
    }

    private static ImagingPolicyImageArgs makeArgs(ImagingPolicyImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ImagingPolicyImageArgs.Empty : args;
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
    public static ImagingPolicyImage get(java.lang.String name, Output<java.lang.String> id, @Nullable ImagingPolicyImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImagingPolicyImage(name, id, state, options);
    }
}
