// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package properties

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Deprecated: akamai.properties.getProperty has been deprecated in favor of akamai.getProperty
func LookupProperty(ctx *pulumi.Context, args *LookupPropertyArgs, opts ...pulumi.InvokeOption) (*LookupPropertyResult, error) {
	var rv LookupPropertyResult
	err := ctx.Invoke("akamai:properties/getProperty:getProperty", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProperty.
type LookupPropertyArgs struct {
	Name    string `pulumi:"name"`
	Version *int   `pulumi:"version"`
}

// A collection of values returned by getProperty.
type LookupPropertyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id      string `pulumi:"id"`
	Name    string `pulumi:"name"`
	Rules   string `pulumi:"rules"`
	Version *int   `pulumi:"version"`
}
