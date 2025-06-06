// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getAppSecApiRequestConstraints(args: GetAppSecApiRequestConstraintsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecApiRequestConstraintsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getAppSecApiRequestConstraints:getAppSecApiRequestConstraints", {
        "apiId": args.apiId,
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecApiRequestConstraints.
 */
export interface GetAppSecApiRequestConstraintsArgs {
    apiId?: number;
    configId: number;
    securityPolicyId: string;
}

/**
 * A collection of values returned by getAppSecApiRequestConstraints.
 */
export interface GetAppSecApiRequestConstraintsResult {
    readonly apiId?: number;
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly outputText: string;
    readonly securityPolicyId: string;
}
export function getAppSecApiRequestConstraintsOutput(args: GetAppSecApiRequestConstraintsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppSecApiRequestConstraintsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getAppSecApiRequestConstraints:getAppSecApiRequestConstraints", {
        "apiId": args.apiId,
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecApiRequestConstraints.
 */
export interface GetAppSecApiRequestConstraintsOutputArgs {
    apiId?: pulumi.Input<number>;
    configId: pulumi.Input<number>;
    securityPolicyId: pulumi.Input<string>;
}
