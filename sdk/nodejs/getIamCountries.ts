// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getIamCountries(opts?: pulumi.InvokeOptions): Promise<GetIamCountriesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("akamai:index/getIamCountries:getIamCountries", {
    }, opts);
}

/**
 * A collection of values returned by getIamCountries.
 */
export interface GetIamCountriesResult {
    readonly countries: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
export function getIamCountriesOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIamCountriesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("akamai:index/getIamCountries:getIamCountries", {
    }, opts);
}
