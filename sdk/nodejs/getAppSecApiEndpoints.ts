// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use the `akamai.getAppSecApiEndpoints` data source to retrieve information about the API Endpoints associated with a security policy or configuration version. The information available is described [here](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getapiendpoints).
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const apiEndpoints = pulumi.output(akamai.getAppSecApiEndpoints({
 *     apiName: "TestEndpoint",
 *     configId: 43253,
 *     version: 7,
 * }, { async: true }));
 * ```
 */
export function getAppSecApiEndpoints(args: GetAppSecApiEndpointsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecApiEndpointsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:index/getAppSecApiEndpoints:getAppSecApiEndpoints", {
        "apiName": args.apiName,
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecApiEndpoints.
 */
export interface GetAppSecApiEndpointsArgs {
    /**
     * The name of a specific endpoint.
     */
    readonly apiName?: string;
    /**
     * The configuration ID.
     */
    readonly configId: number;
    /**
     * The ID of the security policy to use.
     */
    readonly securityPolicyId?: string;
    /**
     * The version number of the configuration.
     */
    readonly version: number;
}

/**
 * A collection of values returned by getAppSecApiEndpoints.
 */
export interface GetAppSecApiEndpointsResult {
    readonly apiName?: string;
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of IDs of the API endpoints.
     */
    readonly idLists: number[];
    /**
     * A JSON-formatted list of information about the API endpoints.
     */
    readonly json: string;
    /**
     * A tabular display showing the ID and name of the API endpoints.
     */
    readonly outputText: string;
    readonly securityPolicyId?: string;
    readonly version: number;
}
