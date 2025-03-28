// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecRuleArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecRule:AppSecRule")
public class AppSecRule extends com.pulumi.resources.CustomResource {
    /**
     * JSON-formatted condition and exception information for the rule
     * 
     */
    @Export(name="conditionException", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> conditionException;

    /**
     * @return JSON-formatted condition and exception information for the rule
     * 
     */
    public Output<Optional<String>> conditionException() {
        return Codegen.optional(this.conditionException);
    }
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
     * Action to be taken when the rule is triggered
     * 
     */
    @Export(name="ruleAction", refs={String.class}, tree="[0]")
    private Output<String> ruleAction;

    /**
     * @return Action to be taken when the rule is triggered
     * 
     */
    public Output<String> ruleAction() {
        return this.ruleAction;
    }
    /**
     * Unique identifier of the rule
     * 
     */
    @Export(name="ruleId", refs={Integer.class}, tree="[0]")
    private Output<Integer> ruleId;

    /**
     * @return Unique identifier of the rule
     * 
     */
    public Output<Integer> ruleId() {
        return this.ruleId;
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
    public AppSecRule(java.lang.String name) {
        this(name, AppSecRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecRule(java.lang.String name, AppSecRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecRule(java.lang.String name, AppSecRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRule:AppSecRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecRule(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRule:AppSecRule", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecRuleArgs makeArgs(AppSecRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecRuleArgs.Empty : args;
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
    public static AppSecRule get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecRule(name, id, state, options);
    }
}
