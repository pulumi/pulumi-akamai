// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getAppSecAdvancedSettingsLogging(args: GetAppSecAdvancedSettingsLoggingArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecAdvancedSettingsLoggingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getAppSecAdvancedSettingsLogging:getAppSecAdvancedSettingsLogging", {
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecAdvancedSettingsLogging.
 */
export interface GetAppSecAdvancedSettingsLoggingArgs {
    configId: number;
    securityPolicyId?: string;
}

/**
 * A collection of values returned by getAppSecAdvancedSettingsLogging.
 */
export interface GetAppSecAdvancedSettingsLoggingResult {
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly outputText: string;
    readonly securityPolicyId?: string;
}
export function getAppSecAdvancedSettingsLoggingOutput(args: GetAppSecAdvancedSettingsLoggingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppSecAdvancedSettingsLoggingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getAppSecAdvancedSettingsLogging:getAppSecAdvancedSettingsLogging", {
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecAdvancedSettingsLogging.
 */
export interface GetAppSecAdvancedSettingsLoggingOutputArgs {
    configId: pulumi.Input<number>;
    securityPolicyId?: pulumi.Input<string>;
}
