// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getAppSecSiemDefinitions(args?: GetAppSecSiemDefinitionsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecSiemDefinitionsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getAppSecSiemDefinitions:getAppSecSiemDefinitions", {
        "siemDefinitionName": args.siemDefinitionName,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecSiemDefinitions.
 */
export interface GetAppSecSiemDefinitionsArgs {
    siemDefinitionName?: string;
}

/**
 * A collection of values returned by getAppSecSiemDefinitions.
 */
export interface GetAppSecSiemDefinitionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly outputText: string;
    readonly siemDefinitionName?: string;
}
export function getAppSecSiemDefinitionsOutput(args?: GetAppSecSiemDefinitionsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppSecSiemDefinitionsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getAppSecSiemDefinitions:getAppSecSiemDefinitions", {
        "siemDefinitionName": args.siemDefinitionName,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecSiemDefinitions.
 */
export interface GetAppSecSiemDefinitionsOutputArgs {
    siemDefinitionName?: pulumi.Input<string>;
}
