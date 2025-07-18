// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetGtmResources(ctx *pulumi.Context, args *GetGtmResourcesArgs, opts ...pulumi.InvokeOption) (*GetGtmResourcesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGtmResourcesResult
	err := ctx.Invoke("akamai:index/getGtmResources:getGtmResources", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGtmResources.
type GetGtmResourcesArgs struct {
	Domain    string                    `pulumi:"domain"`
	Resources []GetGtmResourcesResource `pulumi:"resources"`
}

// A collection of values returned by getGtmResources.
type GetGtmResourcesResult struct {
	Domain string `pulumi:"domain"`
	// The provider-assigned unique ID for this managed resource.
	Id        string                    `pulumi:"id"`
	Resources []GetGtmResourcesResource `pulumi:"resources"`
}

func GetGtmResourcesOutput(ctx *pulumi.Context, args GetGtmResourcesOutputArgs, opts ...pulumi.InvokeOption) GetGtmResourcesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetGtmResourcesResultOutput, error) {
			args := v.(GetGtmResourcesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getGtmResources:getGtmResources", args, GetGtmResourcesResultOutput{}, options).(GetGtmResourcesResultOutput), nil
		}).(GetGtmResourcesResultOutput)
}

// A collection of arguments for invoking getGtmResources.
type GetGtmResourcesOutputArgs struct {
	Domain    pulumi.StringInput                `pulumi:"domain"`
	Resources GetGtmResourcesResourceArrayInput `pulumi:"resources"`
}

func (GetGtmResourcesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGtmResourcesArgs)(nil)).Elem()
}

// A collection of values returned by getGtmResources.
type GetGtmResourcesResultOutput struct{ *pulumi.OutputState }

func (GetGtmResourcesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGtmResourcesResult)(nil)).Elem()
}

func (o GetGtmResourcesResultOutput) ToGetGtmResourcesResultOutput() GetGtmResourcesResultOutput {
	return o
}

func (o GetGtmResourcesResultOutput) ToGetGtmResourcesResultOutputWithContext(ctx context.Context) GetGtmResourcesResultOutput {
	return o
}

func (o GetGtmResourcesResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v GetGtmResourcesResult) string { return v.Domain }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGtmResourcesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGtmResourcesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGtmResourcesResultOutput) Resources() GetGtmResourcesResourceArrayOutput {
	return o.ApplyT(func(v GetGtmResourcesResult) []GetGtmResourcesResource { return v.Resources }).(GetGtmResourcesResourceArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGtmResourcesResultOutput{})
}
