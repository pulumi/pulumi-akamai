// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The `resourceAkamaiAppsecRatePolicy` resource allows you to create, modify or delete rate policies for a specific security configuration version.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 * import * from "fs";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: _var.security_configuration,
 * });
 * const ratePolicy = new akamai.AppSecRatePolicy("ratePolicy", {
 *     configId: configuration.then(configuration => configuration.configId),
 *     version: configuration.then(configuration => configuration.latestVersion),
 *     ratePolicy: fs.readFileSync(`${path.module}/rate_policy.json`),
 * });
 * export const ratePolicyId = ratePolicy.ratePolicyId;
 * ```
 */
export class AppSecRatePolicy extends pulumi.CustomResource {
    /**
     * Get an existing AppSecRatePolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecRatePolicyState, opts?: pulumi.CustomResourceOptions): AppSecRatePolicy {
        return new AppSecRatePolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecRatePolicy:AppSecRatePolicy';

    /**
     * Returns true if the given object is an instance of AppSecRatePolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecRatePolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecRatePolicy.__pulumiType;
    }

    /**
     * The ID of the security configuration to use.
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * The name of a file containing a JSON-formatted rate policy definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#57c65cbd)).
     */
    public readonly ratePolicy!: pulumi.Output<string>;
    /**
     * The ID of an existing rate policy to be modified.
     */
    public /*out*/ readonly ratePolicyId!: pulumi.Output<number>;
    /**
     * The version number of the security configuration to use.
     */
    public readonly version!: pulumi.Output<number>;

    /**
     * Create a AppSecRatePolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecRatePolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecRatePolicyArgs | AppSecRatePolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecRatePolicyState | undefined;
            inputs["configId"] = state ? state.configId : undefined;
            inputs["ratePolicy"] = state ? state.ratePolicy : undefined;
            inputs["ratePolicyId"] = state ? state.ratePolicyId : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as AppSecRatePolicyArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.ratePolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ratePolicy'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            inputs["configId"] = args ? args.configId : undefined;
            inputs["ratePolicy"] = args ? args.ratePolicy : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["ratePolicyId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AppSecRatePolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecRatePolicy resources.
 */
export interface AppSecRatePolicyState {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId?: pulumi.Input<number>;
    /**
     * The name of a file containing a JSON-formatted rate policy definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#57c65cbd)).
     */
    readonly ratePolicy?: pulumi.Input<string>;
    /**
     * The ID of an existing rate policy to be modified.
     */
    readonly ratePolicyId?: pulumi.Input<number>;
    /**
     * The version number of the security configuration to use.
     */
    readonly version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AppSecRatePolicy resource.
 */
export interface AppSecRatePolicyArgs {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId: pulumi.Input<number>;
    /**
     * The name of a file containing a JSON-formatted rate policy definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#57c65cbd)).
     */
    readonly ratePolicy: pulumi.Input<string>;
    /**
     * The version number of the security configuration to use.
     */
    readonly version: pulumi.Input<number>;
}
