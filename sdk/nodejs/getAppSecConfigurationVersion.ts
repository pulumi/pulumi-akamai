// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getAppSecConfigurationVersion(args: GetAppSecConfigurationVersionArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecConfigurationVersionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getAppSecConfigurationVersion:getAppSecConfigurationVersion", {
        "configId": args.configId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecConfigurationVersion.
 */
export interface GetAppSecConfigurationVersionArgs {
    configId: number;
    version?: number;
}

/**
 * A collection of values returned by getAppSecConfigurationVersion.
 */
export interface GetAppSecConfigurationVersionResult {
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly latestVersion: number;
    readonly outputText: string;
    readonly productionStatus: string;
    readonly stagingStatus: string;
    readonly version?: number;
}
export function getAppSecConfigurationVersionOutput(args: GetAppSecConfigurationVersionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppSecConfigurationVersionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getAppSecConfigurationVersion:getAppSecConfigurationVersion", {
        "configId": args.configId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecConfigurationVersion.
 */
export interface GetAppSecConfigurationVersionOutputArgs {
    configId: pulumi.Input<number>;
    version?: pulumi.Input<number>;
}
