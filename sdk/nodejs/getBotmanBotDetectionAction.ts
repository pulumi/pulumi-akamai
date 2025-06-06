// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getBotmanBotDetectionAction(args: GetBotmanBotDetectionActionArgs, opts?: pulumi.InvokeOptions): Promise<GetBotmanBotDetectionActionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getBotmanBotDetectionAction:getBotmanBotDetectionAction", {
        "configId": args.configId,
        "detectionId": args.detectionId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanBotDetectionAction.
 */
export interface GetBotmanBotDetectionActionArgs {
    configId: number;
    detectionId?: string;
    securityPolicyId: string;
}

/**
 * A collection of values returned by getBotmanBotDetectionAction.
 */
export interface GetBotmanBotDetectionActionResult {
    readonly configId: number;
    readonly detectionId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly securityPolicyId: string;
}
export function getBotmanBotDetectionActionOutput(args: GetBotmanBotDetectionActionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBotmanBotDetectionActionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getBotmanBotDetectionAction:getBotmanBotDetectionAction", {
        "configId": args.configId,
        "detectionId": args.detectionId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBotmanBotDetectionAction.
 */
export interface GetBotmanBotDetectionActionOutputArgs {
    configId: pulumi.Input<number>;
    detectionId?: pulumi.Input<string>;
    securityPolicyId: pulumi.Input<string>;
}
