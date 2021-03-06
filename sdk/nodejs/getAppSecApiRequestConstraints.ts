// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use the `akamai.AppSecApiRequestConstraints` data source to retrieve a list of APIs with their constraints and associated actions, or the constraints and actions for a particular API. The information available is described [here](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getapirequestconstraints).
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
 * const apisRequestConstraints = Promise.all([configuration, configuration]).then(([configuration, configuration1]) => akamai.getAppSecApiRequestConstraints({
 *     configId: configuration.configId,
 *     version: configuration1.latestVersion,
 *     securityPolicyId: _var.security_policy_id,
 * }));
 * export const apisConstraintsText = apisRequestConstraints.then(apisRequestConstraints => apisRequestConstraints.outputText);
 * export const apisConstraintsJson = apisRequestConstraints.then(apisRequestConstraints => apisRequestConstraints.json);
 * const apiRequestConstraints = Promise.all([configuration, configuration]).then(([configuration, configuration1]) => akamai.getAppSecApiRequestConstraints({
 *     configId: configuration.configId,
 *     version: configuration1.latestVersion,
 *     securityPolicyId: _var.security_policy_id,
 *     apiId: _var.api_id,
 * }));
 * export const apiConstraintsText = apiRequestConstraints.then(apiRequestConstraints => apiRequestConstraints.outputText);
 * export const apiConstraintsJson = apiRequestConstraints.then(apiRequestConstraints => apiRequestConstraints.json);
 * ```
 */
export function getAppSecApiRequestConstraints(args: GetAppSecApiRequestConstraintsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecApiRequestConstraintsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:index/getAppSecApiRequestConstraints:getAppSecApiRequestConstraints", {
        "apiId": args.apiId,
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecApiRequestConstraints.
 */
export interface GetAppSecApiRequestConstraintsArgs {
    /**
     * The ID of a specific API for which to retrieve constraint information.
     */
    readonly apiId?: number;
    /**
     * The configuration ID to use.
     */
    readonly configId: number;
    /**
     * The ID of the security policy to use.
     */
    readonly securityPolicyId: string;
    /**
     * The version number of the configuration to use.
     */
    readonly version: number;
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
    /**
     * A JSON-formatted list of information about the APIs and their constraints and actions.
     */
    readonly json: string;
    /**
     * A tabular display showing the APIs and their constraints and actions.
     */
    readonly outputText: string;
    readonly securityPolicyId: string;
    readonly version: number;
}
