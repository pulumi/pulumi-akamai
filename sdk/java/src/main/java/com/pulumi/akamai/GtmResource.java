// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.GtmResourceArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.GtmResourceState;
import com.pulumi.akamai.outputs.GtmResourceResourceInstance;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/gtmResource:GtmResource")
public class GtmResource extends com.pulumi.resources.CustomResource {
    @Export(name="aggregationType", refs={String.class}, tree="[0]")
    private Output<String> aggregationType;

    public Output<String> aggregationType() {
        return this.aggregationType;
    }
    @Export(name="constrainedProperty", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> constrainedProperty;

    public Output<Optional<String>> constrainedProperty() {
        return Codegen.optional(this.constrainedProperty);
    }
    @Export(name="decayRate", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> decayRate;

    public Output<Optional<Double>> decayRate() {
        return Codegen.optional(this.decayRate);
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }
    @Export(name="hostHeader", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostHeader;

    public Output<Optional<String>> hostHeader() {
        return Codegen.optional(this.hostHeader);
    }
    @Export(name="leaderString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> leaderString;

    public Output<Optional<String>> leaderString() {
        return Codegen.optional(this.leaderString);
    }
    @Export(name="leastSquaresDecay", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> leastSquaresDecay;

    public Output<Optional<Double>> leastSquaresDecay() {
        return Codegen.optional(this.leastSquaresDecay);
    }
    @Export(name="loadImbalancePercentage", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> loadImbalancePercentage;

    public Output<Optional<Double>> loadImbalancePercentage() {
        return Codegen.optional(this.loadImbalancePercentage);
    }
    @Export(name="maxUMultiplicativeIncrement", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> maxUMultiplicativeIncrement;

    public Output<Optional<Double>> maxUMultiplicativeIncrement() {
        return Codegen.optional(this.maxUMultiplicativeIncrement);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="resourceInstances", refs={List.class,GtmResourceResourceInstance.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GtmResourceResourceInstance>> resourceInstances;

    public Output<Optional<List<GtmResourceResourceInstance>>> resourceInstances() {
        return Codegen.optional(this.resourceInstances);
    }
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }
    @Export(name="upperBound", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> upperBound;

    public Output<Optional<Integer>> upperBound() {
        return Codegen.optional(this.upperBound);
    }
    @Export(name="waitOnComplete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitOnComplete;

    public Output<Optional<Boolean>> waitOnComplete() {
        return Codegen.optional(this.waitOnComplete);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GtmResource(java.lang.String name) {
        this(name, GtmResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GtmResource(java.lang.String name, GtmResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GtmResource(java.lang.String name, GtmResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/gtmResource:GtmResource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GtmResource(java.lang.String name, Output<java.lang.String> id, @Nullable GtmResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/gtmResource:GtmResource", name, state, makeResourceOptions(options, id), false);
    }

    private static GtmResourceArgs makeArgs(GtmResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GtmResourceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("akamai:trafficmanagement/gtmResource:GtmResource").build())
            ))
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
    public static GtmResource get(java.lang.String name, Output<java.lang.String> id, @Nullable GtmResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GtmResource(name, id, state, options);
    }
}
