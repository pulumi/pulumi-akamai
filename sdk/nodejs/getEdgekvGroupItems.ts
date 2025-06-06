// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getEdgekvGroupItems(args: GetEdgekvGroupItemsArgs, opts?: pulumi.InvokeOptions): Promise<GetEdgekvGroupItemsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getEdgekvGroupItems:getEdgekvGroupItems", {
        "groupName": args.groupName,
        "namespaceName": args.namespaceName,
        "network": args.network,
    }, opts);
}

/**
 * A collection of arguments for invoking getEdgekvGroupItems.
 */
export interface GetEdgekvGroupItemsArgs {
    groupName: string;
    namespaceName: string;
    network: string;
}

/**
 * A collection of values returned by getEdgekvGroupItems.
 */
export interface GetEdgekvGroupItemsResult {
    readonly groupName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly items: {[key: string]: string};
    readonly namespaceName: string;
    readonly network: string;
}
export function getEdgekvGroupItemsOutput(args: GetEdgekvGroupItemsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEdgekvGroupItemsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getEdgekvGroupItems:getEdgekvGroupItems", {
        "groupName": args.groupName,
        "namespaceName": args.namespaceName,
        "network": args.network,
    }, opts);
}

/**
 * A collection of arguments for invoking getEdgekvGroupItems.
 */
export interface GetEdgekvGroupItemsOutputArgs {
    groupName: pulumi.Input<string>;
    namespaceName: pulumi.Input<string>;
    network: pulumi.Input<string>;
}
