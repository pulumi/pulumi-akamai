// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class NetworkListSubscription extends pulumi.CustomResource {
    /**
     * Get an existing NetworkListSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkListSubscriptionState, opts?: pulumi.CustomResourceOptions): NetworkListSubscription {
        return new NetworkListSubscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/networkListSubscription:NetworkListSubscription';

    /**
     * Returns true if the given object is an instance of NetworkListSubscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkListSubscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkListSubscription.__pulumiType;
    }

    public readonly networkLists!: pulumi.Output<string[]>;
    public readonly recipients!: pulumi.Output<string[]>;

    /**
     * Create a NetworkListSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkListSubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkListSubscriptionArgs | NetworkListSubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkListSubscriptionState | undefined;
            resourceInputs["networkLists"] = state ? state.networkLists : undefined;
            resourceInputs["recipients"] = state ? state.recipients : undefined;
        } else {
            const args = argsOrState as NetworkListSubscriptionArgs | undefined;
            if ((!args || args.networkLists === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkLists'");
            }
            if ((!args || args.recipients === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recipients'");
            }
            resourceInputs["networkLists"] = args ? args.networkLists : undefined;
            resourceInputs["recipients"] = args ? args.recipients : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkListSubscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkListSubscription resources.
 */
export interface NetworkListSubscriptionState {
    networkLists?: pulumi.Input<pulumi.Input<string>[]>;
    recipients?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a NetworkListSubscription resource.
 */
export interface NetworkListSubscriptionArgs {
    networkLists: pulumi.Input<pulumi.Input<string>[]>;
    recipients: pulumi.Input<pulumi.Input<string>[]>;
}
