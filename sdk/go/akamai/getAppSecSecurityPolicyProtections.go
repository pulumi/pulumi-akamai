// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `AppSecSecurityPolicyProtections` data source to retrieve the protections in effect for a given security policy.
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-akamai/sdk/v2/go/akamai"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := _var.Security_configuration
// 		configuration, err := akamai.LookupAppSecConfiguration(ctx, &akamai.LookupAppSecConfigurationArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		protections, err := akamai.LookupAppSecSecurityPolicyProtections(ctx, &akamai.LookupAppSecSecurityPolicyProtectionsArgs{
// 			ConfigId:         configuration.ConfigId,
// 			Version:          configuration.LatestVersion,
// 			SecurityPolicyId: _var.Security_policy_id,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("protectionsJson", protections.Json)
// 		ctx.Export("protectionsApplyApiConstraints", protections.ApplyApiConstraints)
// 		ctx.Export("protectionsApplyApplicationLayerControls", protections.ApplyApplicationLayerControls)
// 		ctx.Export("protectionsApplyBotmanControls", protections.ApplyBotmanControls)
// 		ctx.Export("protectionsApplyNetworkLayerControls", protections.ApplyNetworkLayerControls)
// 		ctx.Export("protectionsApplyRateControls", protections.ApplyRateControls)
// 		ctx.Export("protectionsApplyReputationControls", protections.ApplyReputationControls)
// 		ctx.Export("protectionsApplySlowPostControls", protections.ApplySlowPostControls)
// 		return nil
// 	})
// }
// ```
func LookupAppSecSecurityPolicyProtections(ctx *pulumi.Context, args *LookupAppSecSecurityPolicyProtectionsArgs, opts ...pulumi.InvokeOption) (*LookupAppSecSecurityPolicyProtectionsResult, error) {
	var rv LookupAppSecSecurityPolicyProtectionsResult
	err := ctx.Invoke("akamai:index/getAppSecSecurityPolicyProtections:getAppSecSecurityPolicyProtections", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppSecSecurityPolicyProtections.
type LookupAppSecSecurityPolicyProtectionsArgs struct {
	// The ID of the security configuration to use.
	ConfigId int `pulumi:"configId"`
	// The ID of the security policy to use.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version int `pulumi:"version"`
}

// A collection of values returned by getAppSecSecurityPolicyProtections.
type LookupAppSecSecurityPolicyProtectionsResult struct {
	// `true` or `false`, indicating whether API constraints are in effect.
	ApplyApiConstraints bool `pulumi:"applyApiConstraints"`
	// `true` or `false`, indicating whether application layer controls are in effect.
	ApplyApplicationLayerControls bool `pulumi:"applyApplicationLayerControls"`
	// `true` or `false`, indicating whether botman controls are in effect.
	ApplyBotmanControls bool `pulumi:"applyBotmanControls"`
	// `true` or `false`, indicating whether network layer controls are in effect.
	ApplyNetworkLayerControls bool `pulumi:"applyNetworkLayerControls"`
	// `true` or `false`, indicating whether rate controls are in effect.
	ApplyRateControls bool `pulumi:"applyRateControls"`
	// `true` or `false`, indicating whether reputation controls are in effect.
	ApplyReputationControls bool `pulumi:"applyReputationControls"`
	// `true` or `false`, indicating whether slow post controls are in effect.
	ApplySlowPostControls bool `pulumi:"applySlowPostControls"`
	ConfigId              int  `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// a JSON-formatted list showing the status of the protection settings
	Json string `pulumi:"json"`
	// a tabular display showing the status of the protection settings
	OutputText       string `pulumi:"outputText"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
	Version          int    `pulumi:"version"`
}
