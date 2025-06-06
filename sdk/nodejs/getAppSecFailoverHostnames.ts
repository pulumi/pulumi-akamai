// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getAppSecFailoverHostnames(args: GetAppSecFailoverHostnamesArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecFailoverHostnamesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getAppSecFailoverHostnames:getAppSecFailoverHostnames", {
        "configId": args.configId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecFailoverHostnames.
 */
export interface GetAppSecFailoverHostnamesArgs {
    configId: number;
}

/**
 * A collection of values returned by getAppSecFailoverHostnames.
 */
export interface GetAppSecFailoverHostnamesResult {
    readonly configId: number;
    readonly hostnames: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly outputText: string;
}
export function getAppSecFailoverHostnamesOutput(args: GetAppSecFailoverHostnamesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppSecFailoverHostnamesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getAppSecFailoverHostnames:getAppSecFailoverHostnames", {
        "configId": args.configId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecFailoverHostnames.
 */
export interface GetAppSecFailoverHostnamesOutputArgs {
    configId: pulumi.Input<number>;
}
