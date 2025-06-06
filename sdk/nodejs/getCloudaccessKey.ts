// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getCloudaccessKey(args: GetCloudaccessKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudaccessKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getCloudaccessKey:getCloudaccessKey", {
        "accessKeyName": args.accessKeyName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudaccessKey.
 */
export interface GetCloudaccessKeyArgs {
    accessKeyName: string;
}

/**
 * A collection of values returned by getCloudaccessKey.
 */
export interface GetCloudaccessKeyResult {
    readonly accessKeyName: string;
    readonly accessKeyUid: number;
    readonly authenticationMethod: string;
    readonly createdBy: string;
    readonly createdTime: string;
    readonly groups: outputs.GetCloudaccessKeyGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly latestVersion: number;
    readonly networkConfiguration: outputs.GetCloudaccessKeyNetworkConfiguration;
}
export function getCloudaccessKeyOutput(args: GetCloudaccessKeyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCloudaccessKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getCloudaccessKey:getCloudaccessKey", {
        "accessKeyName": args.accessKeyName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudaccessKey.
 */
export interface GetCloudaccessKeyOutputArgs {
    accessKeyName: pulumi.Input<string>;
}
