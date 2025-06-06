// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class BotmanCustomDefinedBot extends pulumi.CustomResource {
    /**
     * Get an existing BotmanCustomDefinedBot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BotmanCustomDefinedBotState, opts?: pulumi.CustomResourceOptions): BotmanCustomDefinedBot {
        return new BotmanCustomDefinedBot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/botmanCustomDefinedBot:BotmanCustomDefinedBot';

    /**
     * Returns true if the given object is an instance of BotmanCustomDefinedBot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BotmanCustomDefinedBot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BotmanCustomDefinedBot.__pulumiType;
    }

    public /*out*/ readonly botId!: pulumi.Output<string>;
    public readonly configId!: pulumi.Output<number>;
    public readonly customDefinedBot!: pulumi.Output<string>;

    /**
     * Create a BotmanCustomDefinedBot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BotmanCustomDefinedBotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BotmanCustomDefinedBotArgs | BotmanCustomDefinedBotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BotmanCustomDefinedBotState | undefined;
            resourceInputs["botId"] = state ? state.botId : undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["customDefinedBot"] = state ? state.customDefinedBot : undefined;
        } else {
            const args = argsOrState as BotmanCustomDefinedBotArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.customDefinedBot === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customDefinedBot'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["customDefinedBot"] = args ? args.customDefinedBot : undefined;
            resourceInputs["botId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BotmanCustomDefinedBot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BotmanCustomDefinedBot resources.
 */
export interface BotmanCustomDefinedBotState {
    botId?: pulumi.Input<string>;
    configId?: pulumi.Input<number>;
    customDefinedBot?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BotmanCustomDefinedBot resource.
 */
export interface BotmanCustomDefinedBotArgs {
    configId: pulumi.Input<number>;
    customDefinedBot: pulumi.Input<string>;
}
