// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use the `akamai.AppSecWafMode` resource to specify how your rule sets are updated. Use KRS mode to update the rule sets manually, or AAG to have them update automatically.
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
 * const wafMode = new akamai.AppSecWafMode("wafMode", {
 *     configId: configuration.then(configuration => configuration.configId),
 *     version: configuration.then(configuration => configuration.latestVersion),
 *     securityPolicyId: _var.policy_id,
 *     mode: _var.mode,
 * });
 * export const wafModeMode = wafMode.mode;
 * export const wafModeCurrentRuleset = wafMode.currentRuleset;
 * export const wafModeEvalStatus = wafMode.evalStatus;
 * export const wafModeEvalRuleset = wafMode.evalRuleset;
 * export const wafModeEvalExpirationDate = wafMode.evalExpirationDate;
 * ```
 */
export class AppSecWafMode extends pulumi.CustomResource {
    /**
     * Get an existing AppSecWafMode resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecWafModeState, opts?: pulumi.CustomResourceOptions): AppSecWafMode {
        return new AppSecWafMode(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecWafMode:AppSecWafMode';

    /**
     * Returns true if the given object is an instance of AppSecWafMode.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecWafMode {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecWafMode.__pulumiType;
    }

    /**
     * The ID of the security configuration to use.
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * The current rule set.
     */
    public /*out*/ readonly currentRuleset!: pulumi.Output<string>;
    /**
     * The date on which the evaluation period ends.
     */
    public /*out*/ readonly evalExpirationDate!: pulumi.Output<string>;
    /**
     * The rule set being evaluated if any.
     */
    public /*out*/ readonly evalRuleset!: pulumi.Output<string>;
    /**
     * Either `enabled` if an evaluation is currently in progress, or `disabled` otherwise.
     */
    public /*out*/ readonly evalStatus!: pulumi.Output<string>;
    /**
     * "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * A tabular display showing the current rule set, WAF mode and evaluation status (`enabled` if a rule set is currently being evaluated, `disabled` otherwise).
     */
    public /*out*/ readonly outputText!: pulumi.Output<string>;
    /**
     * The ID of the security policy to use.
     */
    public readonly securityPolicyId!: pulumi.Output<string>;
    /**
     * The version number of the security configuration to use.
     */
    public readonly version!: pulumi.Output<number>;

    /**
     * Create a AppSecWafMode resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecWafModeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecWafModeArgs | AppSecWafModeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecWafModeState | undefined;
            inputs["configId"] = state ? state.configId : undefined;
            inputs["currentRuleset"] = state ? state.currentRuleset : undefined;
            inputs["evalExpirationDate"] = state ? state.evalExpirationDate : undefined;
            inputs["evalRuleset"] = state ? state.evalRuleset : undefined;
            inputs["evalStatus"] = state ? state.evalStatus : undefined;
            inputs["mode"] = state ? state.mode : undefined;
            inputs["outputText"] = state ? state.outputText : undefined;
            inputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as AppSecWafModeArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.mode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mode'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            inputs["configId"] = args ? args.configId : undefined;
            inputs["mode"] = args ? args.mode : undefined;
            inputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["currentRuleset"] = undefined /*out*/;
            inputs["evalExpirationDate"] = undefined /*out*/;
            inputs["evalRuleset"] = undefined /*out*/;
            inputs["evalStatus"] = undefined /*out*/;
            inputs["outputText"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AppSecWafMode.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecWafMode resources.
 */
export interface AppSecWafModeState {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId?: pulumi.Input<number>;
    /**
     * The current rule set.
     */
    readonly currentRuleset?: pulumi.Input<string>;
    /**
     * The date on which the evaluation period ends.
     */
    readonly evalExpirationDate?: pulumi.Input<string>;
    /**
     * The rule set being evaluated if any.
     */
    readonly evalRuleset?: pulumi.Input<string>;
    /**
     * Either `enabled` if an evaluation is currently in progress, or `disabled` otherwise.
     */
    readonly evalStatus?: pulumi.Input<string>;
    /**
     * "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
     */
    readonly mode?: pulumi.Input<string>;
    /**
     * A tabular display showing the current rule set, WAF mode and evaluation status (`enabled` if a rule set is currently being evaluated, `disabled` otherwise).
     */
    readonly outputText?: pulumi.Input<string>;
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
 * The set of arguments for constructing a AppSecWafMode resource.
 */
export interface AppSecWafModeArgs {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId: pulumi.Input<number>;
    /**
     * "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
     */
    readonly mode: pulumi.Input<string>;
    /**
     * The ID of the security policy to use.
     */
    readonly securityPolicyId: pulumi.Input<string>;
    /**
     * The version number of the security configuration to use.
     */
    readonly version: pulumi.Input<number>;
}
