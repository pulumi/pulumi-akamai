// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use the `akamai.AppSecPenaltyBox` data source to retrieve the penalty box settings for a specified security policy.
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
 * const penaltyBox = Promise.all([configuration, configuration]).then(([configuration, configuration1]) => akamai.getAppSecPenaltyBox({
 *     configId: configuration.configId,
 *     version: configuration1.latestVersion,
 *     securityPolicyId: _var.security_policy_id,
 * }));
 * export const penaltyBoxAction = penaltyBox.then(penaltyBox => penaltyBox.action);
 * export const penaltyBoxEnabled = penaltyBox.then(penaltyBox => penaltyBox.enabled);
 * export const penaltyBoxText = penaltyBox.then(penaltyBox => penaltyBox.outputText);
 * ```
 */
export function getAppSecPenaltyBox(args: GetAppSecPenaltyBoxArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecPenaltyBoxResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:index/getAppSecPenaltyBox:getAppSecPenaltyBox", {
        "configId": args.configId,
        "securityPolicyId": args.securityPolicyId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecPenaltyBox.
 */
export interface GetAppSecPenaltyBoxArgs {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId: number;
    /**
     * The ID of the security policy to use.
     */
    readonly securityPolicyId: string;
    /**
     * The version number of the security configuration to use.
     */
    readonly version: number;
}

/**
 * A collection of values returned by getAppSecPenaltyBox.
 */
export interface GetAppSecPenaltyBoxResult {
    /**
     * The action for the penalty box: `alert`, `deny`, or `none`.
     */
    readonly action: string;
    readonly configId: number;
    /**
     * Either `true` or `false`, indicating whether penalty box protection is enabled.
     */
    readonly enabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A tabular display of the `action` and `enabled` information.
     */
    readonly outputText: string;
    readonly securityPolicyId: string;
    readonly version: number;
}
