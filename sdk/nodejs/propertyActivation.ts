// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class PropertyActivation extends pulumi.CustomResource {
    /**
     * Get an existing PropertyActivation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PropertyActivationState, opts?: pulumi.CustomResourceOptions): PropertyActivation {
        return new PropertyActivation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/propertyActivation:PropertyActivation';

    /**
     * Returns true if the given object is an instance of PropertyActivation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PropertyActivation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PropertyActivation.__pulumiType;
    }

    public readonly activationId!: pulumi.Output<string>;
    /**
     * Automatically acknowledge all rule warnings for activation to continue. Default is false
     */
    public readonly autoAcknowledgeRuleWarnings!: pulumi.Output<boolean | undefined>;
    /**
     * Provides an audit record when activating on a production network
     */
    public readonly complianceRecord!: pulumi.Output<outputs.PropertyActivationComplianceRecord | undefined>;
    public readonly contacts!: pulumi.Output<string[]>;
    public /*out*/ readonly errors!: pulumi.Output<string>;
    public readonly network!: pulumi.Output<string | undefined>;
    /**
     * assigns a log message to the activation request
     */
    public readonly note!: pulumi.Output<string | undefined>;
    public readonly propertyId!: pulumi.Output<string>;
    public /*out*/ readonly ruleErrors!: pulumi.Output<outputs.PropertyActivationRuleError[]>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Enables to set timeout for processing
     */
    public readonly timeouts!: pulumi.Output<outputs.PropertyActivationTimeouts | undefined>;
    public readonly version!: pulumi.Output<number>;
    public /*out*/ readonly warnings!: pulumi.Output<string>;

    /**
     * Create a PropertyActivation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PropertyActivationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PropertyActivationArgs | PropertyActivationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PropertyActivationState | undefined;
            resourceInputs["activationId"] = state ? state.activationId : undefined;
            resourceInputs["autoAcknowledgeRuleWarnings"] = state ? state.autoAcknowledgeRuleWarnings : undefined;
            resourceInputs["complianceRecord"] = state ? state.complianceRecord : undefined;
            resourceInputs["contacts"] = state ? state.contacts : undefined;
            resourceInputs["errors"] = state ? state.errors : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["note"] = state ? state.note : undefined;
            resourceInputs["propertyId"] = state ? state.propertyId : undefined;
            resourceInputs["ruleErrors"] = state ? state.ruleErrors : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["warnings"] = state ? state.warnings : undefined;
        } else {
            const args = argsOrState as PropertyActivationArgs | undefined;
            if ((!args || args.contacts === undefined) && !opts.urn) {
                throw new Error("Missing required property 'contacts'");
            }
            if ((!args || args.propertyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'propertyId'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["activationId"] = args ? args.activationId : undefined;
            resourceInputs["autoAcknowledgeRuleWarnings"] = args ? args.autoAcknowledgeRuleWarnings : undefined;
            resourceInputs["complianceRecord"] = args ? args.complianceRecord : undefined;
            resourceInputs["contacts"] = args ? args.contacts : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["note"] = args ? args.note : undefined;
            resourceInputs["propertyId"] = args ? args.propertyId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["errors"] = undefined /*out*/;
            resourceInputs["ruleErrors"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["warnings"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "akamai:properties/propertyActivation:PropertyActivation" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(PropertyActivation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PropertyActivation resources.
 */
export interface PropertyActivationState {
    activationId?: pulumi.Input<string>;
    /**
     * Automatically acknowledge all rule warnings for activation to continue. Default is false
     */
    autoAcknowledgeRuleWarnings?: pulumi.Input<boolean>;
    /**
     * Provides an audit record when activating on a production network
     */
    complianceRecord?: pulumi.Input<inputs.PropertyActivationComplianceRecord>;
    contacts?: pulumi.Input<pulumi.Input<string>[]>;
    errors?: pulumi.Input<string>;
    network?: pulumi.Input<string>;
    /**
     * assigns a log message to the activation request
     */
    note?: pulumi.Input<string>;
    propertyId?: pulumi.Input<string>;
    ruleErrors?: pulumi.Input<pulumi.Input<inputs.PropertyActivationRuleError>[]>;
    status?: pulumi.Input<string>;
    /**
     * Enables to set timeout for processing
     */
    timeouts?: pulumi.Input<inputs.PropertyActivationTimeouts>;
    version?: pulumi.Input<number>;
    warnings?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PropertyActivation resource.
 */
export interface PropertyActivationArgs {
    activationId?: pulumi.Input<string>;
    /**
     * Automatically acknowledge all rule warnings for activation to continue. Default is false
     */
    autoAcknowledgeRuleWarnings?: pulumi.Input<boolean>;
    /**
     * Provides an audit record when activating on a production network
     */
    complianceRecord?: pulumi.Input<inputs.PropertyActivationComplianceRecord>;
    contacts: pulumi.Input<pulumi.Input<string>[]>;
    network?: pulumi.Input<string>;
    /**
     * assigns a log message to the activation request
     */
    note?: pulumi.Input<string>;
    propertyId: pulumi.Input<string>;
    /**
     * Enables to set timeout for processing
     */
    timeouts?: pulumi.Input<inputs.PropertyActivationTimeouts>;
    version: pulumi.Input<number>;
}
