// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use the `akamai.getAppSecHostnameCoverage` data source to retrieve a list of hostnames in the account with their current protections, activation statuses, and other summary information. The information available is described [here](https://developer.akamai.com/api/cloud_security/application_security/v1.html#8eb23096).
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: _var.security_configuration,
 * });
 * const hostnameCoverage = akamai.getAppSecHostnameCoverage({});
 * export const hostnameCoverageListJson = hostnameCoverage.then(hostnameCoverage => hostnameCoverage.json);
 * export const hostnameCoverageListOutput = hostnameCoverage.then(hostnameCoverage => hostnameCoverage.outputText);
 * ```
 */
export function getAppSecHostnameCoverage(opts?: pulumi.InvokeOptions): Promise<GetAppSecHostnameCoverageResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:index/getAppSecHostnameCoverage:getAppSecHostnameCoverage", {
    }, opts);
}

/**
 * A collection of values returned by getAppSecHostnameCoverage.
 */
export interface GetAppSecHostnameCoverageResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A JSON-formatted list of the hostname coverage information.
     */
    readonly json: string;
    /**
     * A tabular display of the hostname coverage information.
     */
    readonly outputText: string;
}
