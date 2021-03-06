// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `getProperties` data source to query and retrieve the list of properties for a group and contract
// based on the [EdgeGrid API client token](https://developer.akamai.com/getting-started/edgegrid) you're using.
//
// ## Example Usage
//
// Return properties associated with the EdgeGrid API client token currently used for authentication:
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
// 		ctx.Export("myPropertyList", data.Akamai_properties.Example)
// 		return nil
// 	})
// }
// ```
// ## Argument reference
//
// This data source supports these arguments:
//
// * `contractId` - (Required) A contract's unique ID, including the `ctr_` prefix.
// * `groupId` - (Required) A group's unique ID, including the `grp_` prefix.
//
// ## Attributes reference
//
// This data source returns this attribute:
//
// * `properties` - A list of properties available for the contract and group IDs provided.
func GetProperties(ctx *pulumi.Context, args *GetPropertiesArgs, opts ...pulumi.InvokeOption) (*GetPropertiesResult, error) {
	var rv GetPropertiesResult
	err := ctx.Invoke("akamai:index/getProperties:getProperties", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProperties.
type GetPropertiesArgs struct {
	ContractId string `pulumi:"contractId"`
	GroupId    string `pulumi:"groupId"`
}

// A collection of values returned by getProperties.
type GetPropertiesResult struct {
	ContractId string `pulumi:"contractId"`
	GroupId    string `pulumi:"groupId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                  `pulumi:"id"`
	Properties []GetPropertiesProperty `pulumi:"properties"`
}
