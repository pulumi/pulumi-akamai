// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getBotmanConditionalAction(args: GetBotmanConditionalActionArgs, opts?: pulumi.InvokeOptions): Promise<GetBotmanConditionalActionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getBotmanConditionalAction:getBotmanConditionalAction", {
        "actionId": args.actionId,
        "configId": args.configId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanConditionalAction.
 */
export interface GetBotmanConditionalActionArgs {
    actionId?: string;
    configId: number;
}

/**
 * A collection of values returned by getBotmanConditionalAction.
 */
export interface GetBotmanConditionalActionResult {
    readonly actionId?: string;
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
}
export function getBotmanConditionalActionOutput(args: GetBotmanConditionalActionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBotmanConditionalActionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getBotmanConditionalAction:getBotmanConditionalAction", {
        "actionId": args.actionId,
        "configId": args.configId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanConditionalAction.
 */
export interface GetBotmanConditionalActionOutputArgs {
    actionId?: pulumi.Input<string>;
    configId: pulumi.Input<number>;
}
