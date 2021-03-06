// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/** @deprecated akamai.trafficmanagement.getGtmDefaultDatacenter has been deprecated in favor of akamai.getGtmDefaultDatacenter */
export function getGtmDefaultDatacenter(args: GetGtmDefaultDatacenterArgs, opts?: pulumi.InvokeOptions): Promise<GetGtmDefaultDatacenterResult> {
    pulumi.log.warn("getGtmDefaultDatacenter is deprecated: akamai.trafficmanagement.getGtmDefaultDatacenter has been deprecated in favor of akamai.getGtmDefaultDatacenter")
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("akamai:trafficmanagement/getGtmDefaultDatacenter:getGtmDefaultDatacenter", {
        "datacenter": args.datacenter,
        "domain": args.domain,
    }, opts);
}

/**
 * A collection of arguments for invoking getGtmDefaultDatacenter.
 */
export interface GetGtmDefaultDatacenterArgs {
    readonly datacenter?: number;
    readonly domain: string;
}

/**
 * A collection of values returned by getGtmDefaultDatacenter.
 */
export interface GetGtmDefaultDatacenterResult {
    readonly datacenter?: number;
    readonly datacenterId: number;
    readonly domain: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly nickname: string;
}
