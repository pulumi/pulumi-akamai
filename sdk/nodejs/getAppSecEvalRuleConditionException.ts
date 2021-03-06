// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use the `akamai.AppSecEvalRuleConditionException` data source to list the conditions and exceptions to a rule you want to evaluate.
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
 * const conditionException = Promise.all([configuration, configuration]).then(([configuration, configuration1]) => akamai.getAppSecEvalRuleConditionException({
 *     configId: configuration.configId,
 *     version: configuration1.latestVersion,
 *     securityPolicyId: _var.security_policy_id,
 *     ruleId: _var.rule_id,
 * }));
 * export const conditionExceptionText = conditionException.then(conditionException => conditionException.outputText);
 * export const conditionExceptionJson = conditionException.then(conditionException => conditionException.json);
 * ```
 */
export function getAppSecEvalRuleConditionException(args: GetAppSecEvalRuleConditionExceptionArgs, opts?: pulumi.InvokeOptions): Promise<GetAppSecEvalRuleConditionExceptionResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:index/getAppSecEvalRuleConditionException:getAppSecEvalRuleConditionException", {
        "configId": args.configId,
        "ruleId": args.ruleId,
        "securityPolicyId": args.securityPolicyId,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppSecEvalRuleConditionException.
 */
export interface GetAppSecEvalRuleConditionExceptionArgs {
    /**
     * The ID of the security configuration to use.
     */
    readonly configId: number;
    /**
     * The ID of the rule to use.
     */
    readonly ruleId: number;
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
 * A collection of values returned by getAppSecEvalRuleConditionException.
 */
export interface GetAppSecEvalRuleConditionExceptionResult {
    readonly configId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A JSON-formatted list of the condition and exception information for the specified rule.
     */
    readonly json: string;
    /**
     * A tabular display showing boolean values indicating whether conditions and exceptions are present.
     */
    readonly outputText: string;
    readonly ruleId: number;
    readonly securityPolicyId: string;
    readonly version: number;
}
