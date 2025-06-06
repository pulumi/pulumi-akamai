// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class AppSecSiemSettings extends pulumi.CustomResource {
    /**
     * Get an existing AppSecSiemSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecSiemSettingsState, opts?: pulumi.CustomResourceOptions): AppSecSiemSettings {
        return new AppSecSiemSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecSiemSettings:AppSecSiemSettings';

    /**
     * Returns true if the given object is an instance of AppSecSiemSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecSiemSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecSiemSettings.__pulumiType;
    }

    /**
     * Unique identifier of the security configuration
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * Whether Bot Manager events should be included in SIEM events
     */
    public readonly enableBotmanSiem!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to enable SIEM on all security policies in the security configuration
     */
    public readonly enableForAllPolicies!: pulumi.Output<boolean>;
    /**
     * Whether to enable SIEM
     */
    public readonly enableSiem!: pulumi.Output<boolean>;
    /**
     * Describes all the protections and actions to be excluded from SIEM events
     */
    public readonly exceptions!: pulumi.Output<outputs.AppSecSiemSettingsExceptions | undefined>;
    /**
     * List of IDs of security policy for which SIEM integration is to be enabled
     */
    public readonly securityPolicyIds!: pulumi.Output<string[] | undefined>;
    /**
     * Unique identifier of the SIEM settings being modified
     */
    public readonly siemId!: pulumi.Output<number>;

    /**
     * Create a AppSecSiemSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecSiemSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecSiemSettingsArgs | AppSecSiemSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecSiemSettingsState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["enableBotmanSiem"] = state ? state.enableBotmanSiem : undefined;
            resourceInputs["enableForAllPolicies"] = state ? state.enableForAllPolicies : undefined;
            resourceInputs["enableSiem"] = state ? state.enableSiem : undefined;
            resourceInputs["exceptions"] = state ? state.exceptions : undefined;
            resourceInputs["securityPolicyIds"] = state ? state.securityPolicyIds : undefined;
            resourceInputs["siemId"] = state ? state.siemId : undefined;
        } else {
            const args = argsOrState as AppSecSiemSettingsArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.enableForAllPolicies === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enableForAllPolicies'");
            }
            if ((!args || args.enableSiem === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enableSiem'");
            }
            if ((!args || args.siemId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siemId'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["enableBotmanSiem"] = args ? args.enableBotmanSiem : undefined;
            resourceInputs["enableForAllPolicies"] = args ? args.enableForAllPolicies : undefined;
            resourceInputs["enableSiem"] = args ? args.enableSiem : undefined;
            resourceInputs["exceptions"] = args ? args.exceptions : undefined;
            resourceInputs["securityPolicyIds"] = args ? args.securityPolicyIds : undefined;
            resourceInputs["siemId"] = args ? args.siemId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppSecSiemSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecSiemSettings resources.
 */
export interface AppSecSiemSettingsState {
    /**
     * Unique identifier of the security configuration
     */
    configId?: pulumi.Input<number>;
    /**
     * Whether Bot Manager events should be included in SIEM events
     */
    enableBotmanSiem?: pulumi.Input<boolean>;
    /**
     * Whether to enable SIEM on all security policies in the security configuration
     */
    enableForAllPolicies?: pulumi.Input<boolean>;
    /**
     * Whether to enable SIEM
     */
    enableSiem?: pulumi.Input<boolean>;
    /**
     * Describes all the protections and actions to be excluded from SIEM events
     */
    exceptions?: pulumi.Input<inputs.AppSecSiemSettingsExceptions>;
    /**
     * List of IDs of security policy for which SIEM integration is to be enabled
     */
    securityPolicyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the SIEM settings being modified
     */
    siemId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AppSecSiemSettings resource.
 */
export interface AppSecSiemSettingsArgs {
    /**
     * Unique identifier of the security configuration
     */
    configId: pulumi.Input<number>;
    /**
     * Whether Bot Manager events should be included in SIEM events
     */
    enableBotmanSiem?: pulumi.Input<boolean>;
    /**
     * Whether to enable SIEM on all security policies in the security configuration
     */
    enableForAllPolicies: pulumi.Input<boolean>;
    /**
     * Whether to enable SIEM
     */
    enableSiem: pulumi.Input<boolean>;
    /**
     * Describes all the protections and actions to be excluded from SIEM events
     */
    exceptions?: pulumi.Input<inputs.AppSecSiemSettingsExceptions>;
    /**
     * List of IDs of security policy for which SIEM integration is to be enabled
     */
    securityPolicyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Unique identifier of the SIEM settings being modified
     */
    siemId: pulumi.Input<number>;
}
