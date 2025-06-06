// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class EdgeKv extends pulumi.CustomResource {
    /**
     * Get an existing EdgeKv resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EdgeKvState, opts?: pulumi.CustomResourceOptions): EdgeKv {
        return new EdgeKv(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/edgeKv:EdgeKv';

    /**
     * Returns true if the given object is an instance of EdgeKv.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EdgeKv {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EdgeKv.__pulumiType;
    }

    /**
     * Storage location for data
     */
    public readonly geoLocation!: pulumi.Output<string | undefined>;
    /**
     * Namespace ACC group ID. It will be used in EdgeKV API v2. Not updatable.
     */
    public readonly groupId!: pulumi.Output<number>;
    /**
     * Name for the EKV namespace
     */
    public readonly namespaceName!: pulumi.Output<string>;
    /**
     * The network on which the namespace will be activated
     */
    public readonly network!: pulumi.Output<string>;
    /**
     * Retention period for data in this namespace. An update of this value will just affect new EKV items.
     */
    public readonly retentionInSeconds!: pulumi.Output<number>;

    /**
     * Create a EdgeKv resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EdgeKvArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EdgeKvArgs | EdgeKvState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EdgeKvState | undefined;
            resourceInputs["geoLocation"] = state ? state.geoLocation : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["namespaceName"] = state ? state.namespaceName : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["retentionInSeconds"] = state ? state.retentionInSeconds : undefined;
        } else {
            const args = argsOrState as EdgeKvArgs | undefined;
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.namespaceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespaceName'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            if ((!args || args.retentionInSeconds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retentionInSeconds'");
            }
            resourceInputs["geoLocation"] = args ? args.geoLocation : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["namespaceName"] = args ? args.namespaceName : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["retentionInSeconds"] = args ? args.retentionInSeconds : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EdgeKv.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EdgeKv resources.
 */
export interface EdgeKvState {
    /**
     * Storage location for data
     */
    geoLocation?: pulumi.Input<string>;
    /**
     * Namespace ACC group ID. It will be used in EdgeKV API v2. Not updatable.
     */
    groupId?: pulumi.Input<number>;
    /**
     * Name for the EKV namespace
     */
    namespaceName?: pulumi.Input<string>;
    /**
     * The network on which the namespace will be activated
     */
    network?: pulumi.Input<string>;
    /**
     * Retention period for data in this namespace. An update of this value will just affect new EKV items.
     */
    retentionInSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a EdgeKv resource.
 */
export interface EdgeKvArgs {
    /**
     * Storage location for data
     */
    geoLocation?: pulumi.Input<string>;
    /**
     * Namespace ACC group ID. It will be used in EdgeKV API v2. Not updatable.
     */
    groupId: pulumi.Input<number>;
    /**
     * Name for the EKV namespace
     */
    namespaceName: pulumi.Input<string>;
    /**
     * The network on which the namespace will be activated
     */
    network: pulumi.Input<string>;
    /**
     * Retention period for data in this namespace. An update of this value will just affect new EKV items.
     */
    retentionInSeconds: pulumi.Input<number>;
}
