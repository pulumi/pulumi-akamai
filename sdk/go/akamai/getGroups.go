// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `getGroups` data source to list groups associated with the [EdgeGrid API client token](https://developer.akamai.com/getting-started/edgegrid) you're using.
//
// ## Basic usage
//
// Return groups associated with the EdgeGrid API client token you're using:
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
// 		ctx.Export("propertyMatch", data.Akamai_groups.My-example)
// 		return nil
// 	})
// }
// ```
//
// ## Argument reference
//
// There are no arguments available for this data source.
//
// ## Attributes reference
//
// This data source returns these attributes:
//
// * `groups` - A list of supported groups, with the following attributes:
//   * `groupId` - A group's unique ID, including the `grp_` prefix.
//   * `groupName` - The name of the group.
//   * `parentGroupId` - The ID of the parent group, if applicable.
//   * `contractIds` - An array of strings listing the contract IDs for each group.
func GetGroups(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetGroupsResult, error) {
	var rv GetGroupsResult
	err := ctx.Invoke("akamai:index/getGroups:getGroups", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getGroups.
type GetGroupsResult struct {
	Groups []GetGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}
