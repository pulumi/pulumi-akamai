// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getBotmanCustomClientSequence(args: GetBotmanCustomClientSequenceArgs, opts?: pulumi.InvokeOptions): Promise<GetBotmanCustomClientSequenceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getBotmanCustomClientSequence:getBotmanCustomClientSequence", {
        "configId": args.configId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanCustomClientSequence.
 */
export interface GetBotmanCustomClientSequenceArgs {
    configId: number;
}

/**
 * A collection of values returned by getBotmanCustomClientSequence.
 */
export interface GetBotmanCustomClientSequenceResult {
    readonly configId: number;
    readonly customClientIds: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
export function getBotmanCustomClientSequenceOutput(args: GetBotmanCustomClientSequenceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBotmanCustomClientSequenceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getBotmanCustomClientSequence:getBotmanCustomClientSequence", {
        "configId": args.configId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanCustomClientSequence.
 */
export interface GetBotmanCustomClientSequenceOutputArgs {
    configId: pulumi.Input<number>;
}
