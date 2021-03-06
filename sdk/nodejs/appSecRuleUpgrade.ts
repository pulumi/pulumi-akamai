// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * TBD
 * Use the `akamai.AppSecRuleUpgrade` resource to upgrade to the most recent version of the KRS rule set. Akamai periodically updates these rules to keep protections current. However, the rules you use in your security policies do not automatically upgrade to the latest version when using mode: KRS. These rules do update automatically when you have mode set to AAG. Before you upgrade, run Get upgrade details to see which rules have changed. If you want to test how these rules would operate with live traffic before committing to the upgrade, run them in evaluation mode. This applies to KRS rules only and does not allow you to make any changes to the rules themselves. The response is the same as the mode response.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: _var.security_configuration,
 * });
 * const ruleUpgrade = new akamai.AppSecRuleUpgrade("ruleUpgrade", {
 *     configId: configuration.then(configuration => configuration.configId),
 *     version: configuration.then(configuration => configuration.latestVersion),
 *     securityPolicyId: _var.security_policy_id,
 * });
 * export const ruleUpgradeCurrentRuleset = ruleUpgrade.currentRuleset;
 * export const ruleUpgradeMode = ruleUpgrade.mode;
 * export const ruleUpgradeEvalStatus = ruleUpgrade.evalStatus;
 * ```
 */
export class AppSecRuleUpgrade extends pulumi.CustomResource {
    /**
     * Get an existing AppSecRuleUpgrade resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecRuleUpgradeState, opts?: pulumi.CustomResourceOptions): AppSecRuleUpgrade {
        return new AppSecRuleUpgrade(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade';

    /**
     * Returns true if the given object is an instance of AppSecRuleUpgrade.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecRuleUpgrade {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecRuleUpgrade.__pulumiType;
    }

    /**
     * The ID of the security configuration to use.
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * A string indicating the version number and release date of the current KRS rule set.
     */
    public /*out*/ readonly currentRuleset!: pulumi.Output<string>;
    /**
     * TBD
     */
    public /*out*/ readonly evalStatus!: pulumi.Output<string>;
    /**
     * A string indicating the current mode, either "KRS" or "AAG".
     */
    public /*out*/ readonly mode!: pulumi.Output<string>;
    /**
     * The ID of the security policy to use.
     */
    public readonly securityPolicyId!: pulumi.Output<string>;
    /**
     * The version number of the security configuration to use.
     */
    public readonly version!: pulumi.Output<number>;

    /**
     * Create a AppSecRuleUpgrade resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecRuleUpgradeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecRuleUpgradeArgs | AppSecRuleUpgradeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecRuleUpgradeState | undefined;
            inputs["configId"] = state ? state.configId : undefined;
            inputs["currentRuleset"] = state ? state.currentRuleset : undefined;
            inputs["evalStatus"] = state ? state.evalStatus : undefined;
            inputs["mode"] = state ? state.mode : undefined;
            inputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as AppSecRuleUpgradeArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            inputs["configId"] = args ? args.configId : undefined;
            inputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["currentRuleset"] = undefined /*out*/;
            inputs["evalStatus"] = undefined /*out*/;
            inputs["mode"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AppSecRuleUpgrade.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecRuleUpgrade resources.
 */
export interface AppSecRuleUpgradeState {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId?: pulumi.Input<number>;
    /**
     * A string indicating the version number and release date of the current KRS rule set.
     */
    readonly currentRuleset?: pulumi.Input<string>;
    /**
     * TBD
     */
    readonly evalStatus?: pulumi.Input<string>;
    /**
     * A string indicating the current mode, either "KRS" or "AAG".
     */
    readonly mode?: pulumi.Input<string>;
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
 * The set of arguments for constructing a AppSecRuleUpgrade resource.
 */
export interface AppSecRuleUpgradeArgs {
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
