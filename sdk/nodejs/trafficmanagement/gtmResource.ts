// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * @deprecated akamai.trafficmanagement.GtmResource has been deprecated in favor of akamai.GtmResource
 */
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
        pulumi.log.warn("GtmResource is deprecated: akamai.trafficmanagement.GtmResource has been deprecated in favor of akamai.GtmResource")
        return new GtmResource(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:trafficmanagement/gtmResource:GtmResource';

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
    public readonly resourceInstances!: pulumi.Output<outputs.trafficmanagement.GtmResourceResourceInstance[] | undefined>;
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
    /** @deprecated akamai.trafficmanagement.GtmResource has been deprecated in favor of akamai.GtmResource */
    constructor(name: string, args: GtmResourceArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated akamai.trafficmanagement.GtmResource has been deprecated in favor of akamai.GtmResource */
    constructor(name: string, argsOrState?: GtmResourceArgs | GtmResourceState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("GtmResource is deprecated: akamai.trafficmanagement.GtmResource has been deprecated in favor of akamai.GtmResource")
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GtmResourceState | undefined;
            inputs["aggregationType"] = state ? state.aggregationType : undefined;
            inputs["constrainedProperty"] = state ? state.constrainedProperty : undefined;
            inputs["decayRate"] = state ? state.decayRate : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["domain"] = state ? state.domain : undefined;
            inputs["hostHeader"] = state ? state.hostHeader : undefined;
            inputs["leaderString"] = state ? state.leaderString : undefined;
            inputs["leastSquaresDecay"] = state ? state.leastSquaresDecay : undefined;
            inputs["loadImbalancePercentage"] = state ? state.loadImbalancePercentage : undefined;
            inputs["maxUMultiplicativeIncrement"] = state ? state.maxUMultiplicativeIncrement : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceInstances"] = state ? state.resourceInstances : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["upperBound"] = state ? state.upperBound : undefined;
            inputs["waitOnComplete"] = state ? state.waitOnComplete : undefined;
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
            inputs["aggregationType"] = args ? args.aggregationType : undefined;
            inputs["constrainedProperty"] = args ? args.constrainedProperty : undefined;
            inputs["decayRate"] = args ? args.decayRate : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["domain"] = args ? args.domain : undefined;
            inputs["hostHeader"] = args ? args.hostHeader : undefined;
            inputs["leaderString"] = args ? args.leaderString : undefined;
            inputs["leastSquaresDecay"] = args ? args.leastSquaresDecay : undefined;
            inputs["loadImbalancePercentage"] = args ? args.loadImbalancePercentage : undefined;
            inputs["maxUMultiplicativeIncrement"] = args ? args.maxUMultiplicativeIncrement : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["resourceInstances"] = args ? args.resourceInstances : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["upperBound"] = args ? args.upperBound : undefined;
            inputs["waitOnComplete"] = args ? args.waitOnComplete : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(GtmResource.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GtmResource resources.
 */
export interface GtmResourceState {
    readonly aggregationType?: pulumi.Input<string>;
    readonly constrainedProperty?: pulumi.Input<string>;
    readonly decayRate?: pulumi.Input<number>;
    readonly description?: pulumi.Input<string>;
    readonly domain?: pulumi.Input<string>;
    readonly hostHeader?: pulumi.Input<string>;
    readonly leaderString?: pulumi.Input<string>;
    readonly leastSquaresDecay?: pulumi.Input<number>;
    readonly loadImbalancePercentage?: pulumi.Input<number>;
    readonly maxUMultiplicativeIncrement?: pulumi.Input<number>;
    readonly name?: pulumi.Input<string>;
    readonly resourceInstances?: pulumi.Input<pulumi.Input<inputs.trafficmanagement.GtmResourceResourceInstance>[]>;
    readonly type?: pulumi.Input<string>;
    readonly upperBound?: pulumi.Input<number>;
    readonly waitOnComplete?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GtmResource resource.
 */
export interface GtmResourceArgs {
    readonly aggregationType: pulumi.Input<string>;
    readonly constrainedProperty?: pulumi.Input<string>;
    readonly decayRate?: pulumi.Input<number>;
    readonly description?: pulumi.Input<string>;
    readonly domain: pulumi.Input<string>;
    readonly hostHeader?: pulumi.Input<string>;
    readonly leaderString?: pulumi.Input<string>;
    readonly leastSquaresDecay?: pulumi.Input<number>;
    readonly loadImbalancePercentage?: pulumi.Input<number>;
    readonly maxUMultiplicativeIncrement?: pulumi.Input<number>;
    readonly name?: pulumi.Input<string>;
    readonly resourceInstances?: pulumi.Input<pulumi.Input<inputs.trafficmanagement.GtmResourceResourceInstance>[]>;
    readonly type: pulumi.Input<string>;
    readonly upperBound?: pulumi.Input<number>;
    readonly waitOnComplete?: pulumi.Input<boolean>;
}
