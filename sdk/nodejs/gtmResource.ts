// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class GtmResource extends pulumi.CustomResource {
    /**
     * Get an existing GtmResource resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GtmResourceState, opts?: pulumi.CustomResourceOptions): GtmResource {
        return new GtmResource(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/gtmResource:GtmResource';

    /**
     * Returns true if the given object is an instance of GtmResource.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GtmResource {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GtmResource.__pulumiType;
    }

    public readonly aggregationType!: pulumi.Output<string>;
    public readonly constrainedProperty!: pulumi.Output<string | undefined>;
    public readonly decayRate!: pulumi.Output<number | undefined>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly domain!: pulumi.Output<string>;
    public readonly hostHeader!: pulumi.Output<string | undefined>;
    public readonly leaderString!: pulumi.Output<string | undefined>;
    public readonly leastSquaresDecay!: pulumi.Output<number | undefined>;
    public readonly loadImbalancePercentage!: pulumi.Output<number | undefined>;
    public readonly maxUMultiplicativeIncrement!: pulumi.Output<number | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly resourceInstances!: pulumi.Output<outputs.GtmResourceResourceInstance[] | undefined>;
    public readonly type!: pulumi.Output<string>;
    public readonly upperBound!: pulumi.Output<number | undefined>;
    public readonly waitOnComplete!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GtmResource resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GtmResourceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GtmResourceArgs | GtmResourceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GtmResourceState | undefined;
            resourceInputs["aggregationType"] = state ? state.aggregationType : undefined;
            resourceInputs["constrainedProperty"] = state ? state.constrainedProperty : undefined;
            resourceInputs["decayRate"] = state ? state.decayRate : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["hostHeader"] = state ? state.hostHeader : undefined;
            resourceInputs["leaderString"] = state ? state.leaderString : undefined;
            resourceInputs["leastSquaresDecay"] = state ? state.leastSquaresDecay : undefined;
            resourceInputs["loadImbalancePercentage"] = state ? state.loadImbalancePercentage : undefined;
            resourceInputs["maxUMultiplicativeIncrement"] = state ? state.maxUMultiplicativeIncrement : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceInstances"] = state ? state.resourceInstances : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["upperBound"] = state ? state.upperBound : undefined;
            resourceInputs["waitOnComplete"] = state ? state.waitOnComplete : undefined;
        } else {
            const args = argsOrState as GtmResourceArgs | undefined;
            if ((!args || args.aggregationType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregationType'");
            }
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["aggregationType"] = args ? args.aggregationType : undefined;
            resourceInputs["constrainedProperty"] = args ? args.constrainedProperty : undefined;
            resourceInputs["decayRate"] = args ? args.decayRate : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["hostHeader"] = args ? args.hostHeader : undefined;
            resourceInputs["leaderString"] = args ? args.leaderString : undefined;
            resourceInputs["leastSquaresDecay"] = args ? args.leastSquaresDecay : undefined;
            resourceInputs["loadImbalancePercentage"] = args ? args.loadImbalancePercentage : undefined;
            resourceInputs["maxUMultiplicativeIncrement"] = args ? args.maxUMultiplicativeIncrement : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceInstances"] = args ? args.resourceInstances : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["upperBound"] = args ? args.upperBound : undefined;
            resourceInputs["waitOnComplete"] = args ? args.waitOnComplete : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "akamai:trafficmanagement/gtmResource:GtmResource" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(GtmResource.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GtmResource resources.
 */
export interface GtmResourceState {
    aggregationType?: pulumi.Input<string>;
    constrainedProperty?: pulumi.Input<string>;
    decayRate?: pulumi.Input<number>;
    description?: pulumi.Input<string>;
    domain?: pulumi.Input<string>;
    hostHeader?: pulumi.Input<string>;
    leaderString?: pulumi.Input<string>;
    leastSquaresDecay?: pulumi.Input<number>;
    loadImbalancePercentage?: pulumi.Input<number>;
    maxUMultiplicativeIncrement?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    resourceInstances?: pulumi.Input<pulumi.Input<inputs.GtmResourceResourceInstance>[]>;
    type?: pulumi.Input<string>;
    upperBound?: pulumi.Input<number>;
    waitOnComplete?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GtmResource resource.
 */
export interface GtmResourceArgs {
    aggregationType: pulumi.Input<string>;
    constrainedProperty?: pulumi.Input<string>;
    decayRate?: pulumi.Input<number>;
    description?: pulumi.Input<string>;
    domain: pulumi.Input<string>;
    hostHeader?: pulumi.Input<string>;
    leaderString?: pulumi.Input<string>;
    leastSquaresDecay?: pulumi.Input<number>;
    loadImbalancePercentage?: pulumi.Input<number>;
    maxUMultiplicativeIncrement?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    resourceInstances?: pulumi.Input<pulumi.Input<inputs.GtmResourceResourceInstance>[]>;
    type: pulumi.Input<string>;
    upperBound?: pulumi.Input<number>;
    waitOnComplete?: pulumi.Input<boolean>;
}
