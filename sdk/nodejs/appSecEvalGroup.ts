// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class AppSecEvalGroup extends pulumi.CustomResource {
    /**
     * Get an existing AppSecEvalGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecEvalGroupState, opts?: pulumi.CustomResourceOptions): AppSecEvalGroup {
        return new AppSecEvalGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecEvalGroup:AppSecEvalGroup';

    /**
     * Returns true if the given object is an instance of AppSecEvalGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecEvalGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecEvalGroup.__pulumiType;
    }

    /**
     * Unique identifier of the evaluation attack group being modified
     */
    public readonly attackGroup!: pulumi.Output<string>;
    /**
     * Action to be taken when the attack group is triggered
     */
    public readonly attackGroupAction!: pulumi.Output<string>;
    /**
     * JSON-formatted condition and exception information for the evaluation attack group
     */
    public readonly conditionException!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the security configuration
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * Unique identifier of the security policy
     */
    public readonly securityPolicyId!: pulumi.Output<string>;

    /**
     * Create a AppSecEvalGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecEvalGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecEvalGroupArgs | AppSecEvalGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecEvalGroupState | undefined;
            resourceInputs["attackGroup"] = state ? state.attackGroup : undefined;
            resourceInputs["attackGroupAction"] = state ? state.attackGroupAction : undefined;
            resourceInputs["conditionException"] = state ? state.conditionException : undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
        } else {
            const args = argsOrState as AppSecEvalGroupArgs | undefined;
            if ((!args || args.attackGroup === undefined) && !opts.urn) {
                throw new Error("Missing required property 'attackGroup'");
            }
            if ((!args || args.attackGroupAction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'attackGroupAction'");
            }
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            resourceInputs["attackGroup"] = args ? args.attackGroup : undefined;
            resourceInputs["attackGroupAction"] = args ? args.attackGroupAction : undefined;
            resourceInputs["conditionException"] = args ? args.conditionException : undefined;
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppSecEvalGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecEvalGroup resources.
 */
export interface AppSecEvalGroupState {
    /**
     * Unique identifier of the evaluation attack group being modified
     */
    attackGroup?: pulumi.Input<string>;
    /**
     * Action to be taken when the attack group is triggered
     */
    attackGroupAction?: pulumi.Input<string>;
    /**
     * JSON-formatted condition and exception information for the evaluation attack group
     */
    conditionException?: pulumi.Input<string>;
    /**
     * Unique identifier of the security configuration
     */
    configId?: pulumi.Input<number>;
    /**
     * Unique identifier of the security policy
     */
    securityPolicyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppSecEvalGroup resource.
 */
export interface AppSecEvalGroupArgs {
    /**
     * Unique identifier of the evaluation attack group being modified
     */
    attackGroup: pulumi.Input<string>;
    /**
     * Action to be taken when the attack group is triggered
     */
    attackGroupAction: pulumi.Input<string>;
    /**
     * JSON-formatted condition and exception information for the evaluation attack group
     */
    conditionException?: pulumi.Input<string>;
    /**
     * Unique identifier of the security configuration
     */
    configId: pulumi.Input<number>;
    /**
     * Unique identifier of the security policy
     */
    securityPolicyId: pulumi.Input<string>;
}
