// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use the `akamai.getAppSecConfigurationVersion` data source to retrieve information about the versions of a security configuration, or about a specific version.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const specificConfiguration = akamai.getAppSecConfiguration({
 *     name: "Akamai Tools",
 * });
 * const versions = specificConfiguration.then(specificConfiguration => akamai.getAppSecConfigurationVersion({
 *     configId: specificConfiguration.configId,
 * }));
 * export const versionsOutputText = versions.then(versions => versions.outputText);
 * export const versionsLatest = versions.then(versions => versions.latestVersion);
 * const specificVersion = specificConfiguration.then(specificConfiguration => akamai.getAppSecConfigurationVersion({
 *     configId: specificConfiguration.configId,
 *     version: 42,
 * }));
 * export const specificVersionVersion = specificVersion.then(specificVersion => specificVersion.version);
 * export const specificVersionStaging = specificVersion.then(specificVersion => specificVersion.stagingStatus);
 * export const specificVersionProduction = specificVersion.then(specificVersion => specificVersion.productionStatus);
 * ```
 */
export function getAppSecConfigurationVersion(args: GetAppSecConfigurationVersionArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecConfigurationVersionResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:index/getAppSecConfigurationVersion:getAppSecConfigurationVersion", {
        "configId": args.configId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecConfigurationVersion.
 */
export interface GetAppSecConfigurationVersionArgs {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId: number;
    /**
     * The version number of the security configuration to use. If not supplied, information about all versions of the specified security configuration is returned.
     */
    readonly version?: number;
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
    /**
     * The last version of the security configuration created.
     */
    readonly latestVersion: number;
    /**
     * A tabular display showing the following information about all versions of the security configuration: version number, staging status, and production status.
     */
    readonly outputText: string;
    /**
     * The status of the specified version in production: "Active", "Inactive", or "Deactivated". Returned only if `version` was specified.
     */
    readonly productionStatus: string;
    /**
     * The status of the specified version in staging: "Active", "Inactive", or "Deactivated". Returned only if `version` was specified.
     */
    readonly stagingStatus: string;
    readonly version?: number;
}
