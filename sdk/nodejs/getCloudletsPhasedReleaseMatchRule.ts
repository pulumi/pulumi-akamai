// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getCloudletsPhasedReleaseMatchRule(args?: GetCloudletsPhasedReleaseMatchRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudletsPhasedReleaseMatchRuleResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getCloudletsPhasedReleaseMatchRule:getCloudletsPhasedReleaseMatchRule", {
        "matchRules": args.matchRules,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudletsPhasedReleaseMatchRule.
 */
export interface GetCloudletsPhasedReleaseMatchRuleArgs {
    matchRules?: inputs.GetCloudletsPhasedReleaseMatchRuleMatchRule[];
}

/**
 * A collection of values returned by getCloudletsPhasedReleaseMatchRule.
 */
export interface GetCloudletsPhasedReleaseMatchRuleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly json: string;
    readonly matchRules?: outputs.GetCloudletsPhasedReleaseMatchRuleMatchRule[];
}
export function getCloudletsPhasedReleaseMatchRuleOutput(args?: GetCloudletsPhasedReleaseMatchRuleOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCloudletsPhasedReleaseMatchRuleResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getCloudletsPhasedReleaseMatchRule:getCloudletsPhasedReleaseMatchRule", {
        "matchRules": args.matchRules,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudletsPhasedReleaseMatchRule.
 */
export interface GetCloudletsPhasedReleaseMatchRuleOutputArgs {
    matchRules?: pulumi.Input<pulumi.Input<inputs.GetCloudletsPhasedReleaseMatchRuleMatchRuleArgs>[]>;
}
