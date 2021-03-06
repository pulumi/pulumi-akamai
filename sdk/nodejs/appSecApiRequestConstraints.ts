// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `resourceAkamaiAppsecApiRequestConstraints` resource allows you to update what action to take when the API request constraint triggers. This operation modifies an individual API constraint action. To use this operation, use the `akamai.getAppSecApiEndpoints` data source to list one or all API endpoints, and use the ID of the selected endpoint. Use the `action` paameter to specify how the alert should be handled.
 */
export class AppSecApiRequestConstraints extends pulumi.CustomResource {
    /**
     * Get an existing AppSecApiRequestConstraints resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecApiRequestConstraintsState, opts?: pulumi.CustomResourceOptions): AppSecApiRequestConstraints {
        return new AppSecApiRequestConstraints(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecApiRequestConstraints:AppSecApiRequestConstraints';

    /**
     * Returns true if the given object is an instance of AppSecApiRequestConstraints.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecApiRequestConstraints {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecApiRequestConstraints.__pulumiType;
    }

    /**
     * The action to assign to API request constraints: either `alert`, `deny`, or `none`.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The ID of the API endpoint to use. If not supplied, the request constraint action will be updated for all APIs.
     */
    public readonly apiEndpointId!: pulumi.Output<number | undefined>;
    /**
     * The ID of the security configuration to use.
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * The ID of the security policy to use.
     */
    public readonly securityPolicyId!: pulumi.Output<string>;
    /**
     * The version number of the security configuration to use.
     */
    public readonly version!: pulumi.Output<number>;

    /**
     * Create a AppSecApiRequestConstraints resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecApiRequestConstraintsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecApiRequestConstraintsArgs | AppSecApiRequestConstraintsState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecApiRequestConstraintsState | undefined;
            inputs["action"] = state ? state.action : undefined;
            inputs["apiEndpointId"] = state ? state.apiEndpointId : undefined;
            inputs["configId"] = state ? state.configId : undefined;
            inputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as AppSecApiRequestConstraintsArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            inputs["action"] = args ? args.action : undefined;
            inputs["apiEndpointId"] = args ? args.apiEndpointId : undefined;
            inputs["configId"] = args ? args.configId : undefined;
            inputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
            inputs["version"] = args ? args.version : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AppSecApiRequestConstraints.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecApiRequestConstraints resources.
 */
export interface AppSecApiRequestConstraintsState {
    /**
     * The action to assign to API request constraints: either `alert`, `deny`, or `none`.
     */
    readonly action?: pulumi.Input<string>;
    /**
     * The ID of the API endpoint to use. If not supplied, the request constraint action will be updated for all APIs.
     */
    readonly apiEndpointId?: pulumi.Input<number>;
    /**
     * The ID of the security configuration to use.
     */
    readonly configId?: pulumi.Input<number>;
    /**
     * The ID of the security policy to use.
     */
    readonly securityPolicyId?: pulumi.Input<string>;
    /**
     * The version number of the security configuration to use.
     */
    readonly version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AppSecApiRequestConstraints resource.
 */
export interface AppSecApiRequestConstraintsArgs {
    /**
     * The action to assign to API request constraints: either `alert`, `deny`, or `none`.
     */
    readonly action: pulumi.Input<string>;
    /**
     * The ID of the API endpoint to use. If not supplied, the request constraint action will be updated for all APIs.
     */
    readonly apiEndpointId?: pulumi.Input<number>;
    /**
     * The ID of the security configuration to use.
     */
    readonly configId: pulumi.Input<number>;
    /**
     * The ID of the security policy to use.
     */
    readonly securityPolicyId: pulumi.Input<string>;
    /**
     * The version number of the security configuration to use.
     */
    readonly version: pulumi.Input<number>;
}
