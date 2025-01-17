// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecEvalArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecEvalState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecEval:AppSecEval")
public class AppSecEval extends com.pulumi.resources.CustomResource {
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
     * Versioning information for the Kona Rule Set currently in use in production
     * 
     */
    @Export(name="currentRuleset", refs={String.class}, tree="[0]")
    private Output<String> currentRuleset;

    /**
     * @return Versioning information for the Kona Rule Set currently in use in production
     * 
     */
    public Output<String> currentRuleset() {
        return this.currentRuleset;
    }
    /**
     * Evaluation mode (ASE_AUTO or ASE_MANUAL)
     * 
     */
    @Export(name="evalMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> evalMode;

    /**
     * @return Evaluation mode (ASE_AUTO or ASE_MANUAL)
     * 
     */
    public Output<Optional<String>> evalMode() {
        return Codegen.optional(this.evalMode);
    }
    /**
     * Evaluation mode operation (START, STOP, RESTART, UPDATE or COMPLETE)
     * 
     */
    @Export(name="evalOperation", refs={String.class}, tree="[0]")
    private Output<String> evalOperation;

    /**
     * @return Evaluation mode operation (START, STOP, RESTART, UPDATE or COMPLETE)
     * 
     */
    public Output<String> evalOperation() {
        return this.evalOperation;
    }
    /**
     * Whether an evaluation is currently in progress
     * 
     */
    @Export(name="evalStatus", refs={String.class}, tree="[0]")
    private Output<String> evalStatus;

    /**
     * @return Whether an evaluation is currently in progress
     * 
     */
    public Output<String> evalStatus() {
        return this.evalStatus;
    }
    /**
     * Versioning information for the Kona Rule Set being evaluated
     * 
     */
    @Export(name="evaluatingRuleset", refs={String.class}, tree="[0]")
    private Output<String> evaluatingRuleset;

    /**
     * @return Versioning information for the Kona Rule Set being evaluated
     * 
     */
    public Output<String> evaluatingRuleset() {
        return this.evaluatingRuleset;
    }
    /**
     * Date when the evaluation period ends
     * 
     */
    @Export(name="expirationDate", refs={String.class}, tree="[0]")
    private Output<String> expirationDate;

    /**
     * @return Date when the evaluation period ends
     * 
     */
    public Output<String> expirationDate() {
        return this.expirationDate;
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
    public AppSecEval(java.lang.String name) {
        this(name, AppSecEvalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecEval(java.lang.String name, AppSecEvalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecEval(java.lang.String name, AppSecEvalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecEval:AppSecEval", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecEval(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecEvalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecEval:AppSecEval", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecEvalArgs makeArgs(AppSecEvalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecEvalArgs.Empty : args;
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
    public static AppSecEval get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecEvalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecEval(name, id, state, options);
    }
}
