// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `getPropertyRules` data source to query and retrieve the rule tree of
// an existing property version. This data source lets you search across the contracts
// and groups you have access to.
//
// ## Basic usage
//
// This example returns the rule tree for version 3 of a property based on the selected contract and group:
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
// 		ctx.Export("propertyMatch", data.Akamai_property_rules.My-example)
// 		return nil
// 	})
// }
// ```
//
// ## Argument reference
//
// This data source supports these arguments:
//
// * `contractId` - (Required) A contract's unique ID, including the `ctr_` prefix.
// * `groupId` - (Required) A group's unique ID, including the `grp_` prefix.
// * `propertyId` - (Required) A property's unique ID, including the `prp_` prefix.
// * `version` - (Optional) The version to return. Returns the latest version by default.
//
// ## Attributes reference
//
// This data source returns these attributes:
//
// * `rules` - A JSON-encoded rule tree for the property.
// * `errors` - A list of validation errors for the rule tree object returned. For more information see [Errors](https://developer.akamai.com/api/core_features/property_manager/v1.html#errors) in the Property Manager API documentation.
func GetPropertyRules(ctx *pulumi.Context, args *GetPropertyRulesArgs, opts ...pulumi.InvokeOption) (*GetPropertyRulesResult, error) {
	var rv GetPropertyRulesResult
	err := ctx.Invoke("akamai:index/getPropertyRules:getPropertyRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPropertyRules.
type GetPropertyRulesArgs struct {
	ContractId *string `pulumi:"contractId"`
	GroupId    *string `pulumi:"groupId"`
	PropertyId string  `pulumi:"propertyId"`
	Version    *int    `pulumi:"version"`
}

// A collection of values returned by getPropertyRules.
type GetPropertyRulesResult struct {
	ContractId string `pulumi:"contractId"`
	Errors     string `pulumi:"errors"`
	GroupId    string `pulumi:"groupId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	PropertyId string `pulumi:"propertyId"`
	Rules      string `pulumi:"rules"`
	Version    int    `pulumi:"version"`
}
