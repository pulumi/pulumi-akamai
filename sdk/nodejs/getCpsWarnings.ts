// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getCpsWarnings(opts?: pulumi.InvokeOptions): Promise<GetCpsWarningsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getCpsWarnings:getCpsWarnings", {
    }, opts);
}

/**
 * A collection of values returned by getCpsWarnings.
 */
export interface GetCpsWarningsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly warnings: {[key: string]: string};
}
export function getCpsWarningsOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCpsWarningsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getCpsWarnings:getCpsWarnings", {
    }, opts);
}
