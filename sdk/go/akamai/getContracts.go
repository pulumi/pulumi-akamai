// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `getContracts` data source to list contracts associated with the [EdgeGrid API client token](https://developer.akamai.com/getting-started/edgegrid) you're using.
//
// ## Example Usage
//
// Return contracts associated with the EdgeGrid API client token currently used for authentication:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("propertyMatch", data.Akamai_contracts.My-example)
// 		return nil
// 	})
// }
// ```
// ## Argument reference
//
// There are no arguments available for this data source.
//
// ## Attributes reference
//
// This data source returns these attributes:
//
// * `contracts` - A list of supported contracts, with the following properties:
//   * `contractId` - The contract's unique ID, including the `ctr_` prefix.
//   * `contractTypeName` - The type of contract, either `DIRECT_CUSTOMER`, `INDIRECT_CUSTOMER`, `PARENT_CUSTOMER`, `REFERRAL_PARTNER`, `TIER_1_RESELLER`, `VAR_CUSTOMER`, `VALUE_ADDED_RESELLER`, `PARTNER`, `PORTAL_PARTNER`, `STREAMING_RESELLER`, `AKAMAI_INTERNAL`, or `UNKNOWN`.
func GetContracts(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetContractsResult, error) {
	var rv GetContractsResult
	err := ctx.Invoke("akamai:index/getContracts:getContracts", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getContracts.
type GetContractsResult struct {
	Contracts []GetContractsContract `pulumi:"contracts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}
