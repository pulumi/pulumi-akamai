// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class AppSecConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing AppSecConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecConfigurationState, opts?: pulumi.CustomResourceOptions): AppSecConfiguration {
        return new AppSecConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecConfiguration:AppSecConfiguration';

    /**
     * Returns true if the given object is an instance of AppSecConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecConfiguration.__pulumiType;
    }

    /**
     * Unique identifier of the new security configuration
     */
    public /*out*/ readonly configId!: pulumi.Output<number>;
    /**
     * Unique identifier of the Akamai contract associated with the new configuration
     */
    public readonly contractId!: pulumi.Output<string>;
    /**
     * Unique identifier of the existing configuration being cloned to create the new configuration
     */
    public readonly createFromConfigId!: pulumi.Output<number | undefined>;
    /**
     * Version number of the existing configuration being cloned to create the new configuration
     */
    public readonly createFromVersion!: pulumi.Output<number | undefined>;
    /**
     * Brief description of the new configuration
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Unique identifier of the contract group associated with the new configuration
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * Hostnames to be protected by the new configuration
     */
    public readonly hostNames!: pulumi.Output<string[]>;
    /**
     * Name of the new configuration
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a AppSecConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecConfigurationArgs | AppSecConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecConfigurationState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["contractId"] = state ? state.contractId : undefined;
            resourceInputs["createFromConfigId"] = state ? state.createFromConfigId : undefined;
            resourceInputs["createFromVersion"] = state ? state.createFromVersion : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["hostNames"] = state ? state.hostNames : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as AppSecConfigurationArgs | undefined;
            if ((!args || args.contractId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'contractId'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.hostNames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostNames'");
            }
            resourceInputs["contractId"] = args ? args.contractId : undefined;
            resourceInputs["createFromConfigId"] = args ? args.createFromConfigId : undefined;
            resourceInputs["createFromVersion"] = args ? args.createFromVersion : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["hostNames"] = args ? args.hostNames : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["configId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppSecConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecConfiguration resources.
 */
export interface AppSecConfigurationState {
    /**
     * Unique identifier of the new security configuration
     */
    configId?: pulumi.Input<number>;
    /**
     * Unique identifier of the Akamai contract associated with the new configuration
     */
    contractId?: pulumi.Input<string>;
    /**
     * Unique identifier of the existing configuration being cloned to create the new configuration
     */
    createFromConfigId?: pulumi.Input<number>;
    /**
     * Version number of the existing configuration being cloned to create the new configuration
     */
    createFromVersion?: pulumi.Input<number>;
    /**
     * Brief description of the new configuration
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the contract group associated with the new configuration
     */
    groupId?: pulumi.Input<string>;
    /**
     * Hostnames to be protected by the new configuration
     */
    hostNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the new configuration
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppSecConfiguration resource.
 */
export interface AppSecConfigurationArgs {
    /**
     * Unique identifier of the Akamai contract associated with the new configuration
     */
    contractId: pulumi.Input<string>;
    /**
     * Unique identifier of the existing configuration being cloned to create the new configuration
     */
    createFromConfigId?: pulumi.Input<number>;
    /**
     * Version number of the existing configuration being cloned to create the new configuration
     */
    createFromVersion?: pulumi.Input<number>;
    /**
     * Brief description of the new configuration
     */
    description: pulumi.Input<string>;
    /**
     * Unique identifier of the contract group associated with the new configuration
     */
    groupId: pulumi.Input<string>;
    /**
     * Hostnames to be protected by the new configuration
     */
    hostNames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the new configuration
     */
    name?: pulumi.Input<string>;
}
