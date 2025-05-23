// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanBotDetectionActionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanBotDetectionActionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanBotDetectionAction:BotmanBotDetectionAction")
public class BotmanBotDetectionAction extends com.pulumi.resources.CustomResource {
    @Export(name="botDetectionAction", refs={String.class}, tree="[0]")
    private Output<String> botDetectionAction;

    public Output<String> botDetectionAction() {
        return this.botDetectionAction;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }
    @Export(name="detectionId", refs={String.class}, tree="[0]")
    private Output<String> detectionId;

    public Output<String> detectionId() {
        return this.detectionId;
    }
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotmanBotDetectionAction(java.lang.String name) {
        this(name, BotmanBotDetectionActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanBotDetectionAction(java.lang.String name, BotmanBotDetectionActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanBotDetectionAction(java.lang.String name, BotmanBotDetectionActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotDetectionAction:BotmanBotDetectionAction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BotmanBotDetectionAction(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanBotDetectionActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotDetectionAction:BotmanBotDetectionAction", name, state, makeResourceOptions(options, id), false);
    }

    private static BotmanBotDetectionActionArgs makeArgs(BotmanBotDetectionActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BotmanBotDetectionActionArgs.Empty : args;
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
    public static BotmanBotDetectionAction get(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanBotDetectionActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanBotDetectionAction(name, id, state, options);
    }
}
