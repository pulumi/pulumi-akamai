// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class AppsecPenaltyBoxConditions extends pulumi.CustomResource {
    /**
     * Get an existing AppsecPenaltyBoxConditions resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppsecPenaltyBoxConditionsState, opts?: pulumi.CustomResourceOptions): AppsecPenaltyBoxConditions {
        return new AppsecPenaltyBoxConditions(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appsecPenaltyBoxConditions:AppsecPenaltyBoxConditions';

    /**
     * Returns true if the given object is an instance of AppsecPenaltyBoxConditions.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppsecPenaltyBoxConditions {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppsecPenaltyBoxConditions.__pulumiType;
    }

    /**
     * Unique identifier of the security configuration
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * Describes the conditions and the operator to be applied for penalty box
     */
    public readonly penaltyBoxConditions!: pulumi.Output<string>;
    /**
     * Unique identifier of the security policy
     */
    public readonly securityPolicyId!: pulumi.Output<string>;

    /**
     * Create a AppsecPenaltyBoxConditions resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppsecPenaltyBoxConditionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppsecPenaltyBoxConditionsArgs | AppsecPenaltyBoxConditionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppsecPenaltyBoxConditionsState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["penaltyBoxConditions"] = state ? state.penaltyBoxConditions : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
        } else {
            const args = argsOrState as AppsecPenaltyBoxConditionsArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.penaltyBoxConditions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'penaltyBoxConditions'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["penaltyBoxConditions"] = args ? args.penaltyBoxConditions : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppsecPenaltyBoxConditions.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppsecPenaltyBoxConditions resources.
 */
export interface AppsecPenaltyBoxConditionsState {
    /**
     * Unique identifier of the security configuration
     */
    configId?: pulumi.Input<number>;
    /**
     * Describes the conditions and the operator to be applied for penalty box
     */
    penaltyBoxConditions?: pulumi.Input<string>;
    /**
     * Unique identifier of the security policy
     */
    securityPolicyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppsecPenaltyBoxConditions resource.
 */
export interface AppsecPenaltyBoxConditionsArgs {
    /**
     * Unique identifier of the security configuration
     */
    configId: pulumi.Input<number>;
    /**
     * Describes the conditions and the operator to be applied for penalty box
     */
    penaltyBoxConditions: pulumi.Input<string>;
    /**
     * Unique identifier of the security policy
     */
    securityPolicyId: pulumi.Input<string>;
}
