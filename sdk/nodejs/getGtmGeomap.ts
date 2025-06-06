// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getGtmGeomap(args: GetGtmGeomapArgs, opts?: pulumi.InvokeOptions): Promise<GetGtmGeomapResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getGtmGeomap:getGtmGeomap", {
        "domain": args.domain,
        "mapName": args.mapName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGtmGeomap.
 */
export interface GetGtmGeomapArgs {
    domain: string;
    mapName: string;
}

/**
 * A collection of values returned by getGtmGeomap.
 */
export interface GetGtmGeomapResult {
    readonly assignments: outputs.GetGtmGeomapAssignment[];
    readonly defaultDatacenter: outputs.GetGtmGeomapDefaultDatacenter;
    readonly domain: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly links: outputs.GetGtmGeomapLink[];
    readonly mapName: string;
}
export function getGtmGeomapOutput(args: GetGtmGeomapOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGtmGeomapResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getGtmGeomap:getGtmGeomap", {
        "domain": args.domain,
        "mapName": args.mapName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGtmGeomap.
 */
export interface GetGtmGeomapOutputArgs {
    domain: pulumi.Input<string>;
    mapName: pulumi.Input<string>;
}
