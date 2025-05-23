// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanChallengeInjectionRulesArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanChallengeInjectionRulesState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanChallengeInjectionRules:BotmanChallengeInjectionRules")
public class BotmanChallengeInjectionRules extends com.pulumi.resources.CustomResource {
    @Export(name="challengeInjectionRules", refs={String.class}, tree="[0]")
    private Output<String> challengeInjectionRules;

    public Output<String> challengeInjectionRules() {
        return this.challengeInjectionRules;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotmanChallengeInjectionRules(java.lang.String name) {
        this(name, BotmanChallengeInjectionRulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanChallengeInjectionRules(java.lang.String name, BotmanChallengeInjectionRulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanChallengeInjectionRules(java.lang.String name, BotmanChallengeInjectionRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanChallengeInjectionRules:BotmanChallengeInjectionRules", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BotmanChallengeInjectionRules(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanChallengeInjectionRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanChallengeInjectionRules:BotmanChallengeInjectionRules", name, state, makeResourceOptions(options, id), false);
    }

    private static BotmanChallengeInjectionRulesArgs makeArgs(BotmanChallengeInjectionRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BotmanChallengeInjectionRulesArgs.Empty : args;
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
    public static BotmanChallengeInjectionRules get(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanChallengeInjectionRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanChallengeInjectionRules(name, id, state, options);
    }
}
