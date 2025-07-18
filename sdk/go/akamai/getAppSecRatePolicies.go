// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAppSecRatePolicies(ctx *pulumi.Context, args *GetAppSecRatePoliciesArgs, opts ...pulumi.InvokeOption) (*GetAppSecRatePoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAppSecRatePoliciesResult
	err := ctx.Invoke("akamai:index/getAppSecRatePolicies:getAppSecRatePolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppSecRatePolicies.
type GetAppSecRatePoliciesArgs struct {
	ConfigId     int  `pulumi:"configId"`
	RatePolicyId *int `pulumi:"ratePolicyId"`
}

// A collection of values returned by getAppSecRatePolicies.
type GetAppSecRatePoliciesResult struct {
	ConfigId int `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	Json         string `pulumi:"json"`
	OutputText   string `pulumi:"outputText"`
	RatePolicyId *int   `pulumi:"ratePolicyId"`
}

func GetAppSecRatePoliciesOutput(ctx *pulumi.Context, args GetAppSecRatePoliciesOutputArgs, opts ...pulumi.InvokeOption) GetAppSecRatePoliciesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAppSecRatePoliciesResultOutput, error) {
			args := v.(GetAppSecRatePoliciesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getAppSecRatePolicies:getAppSecRatePolicies", args, GetAppSecRatePoliciesResultOutput{}, options).(GetAppSecRatePoliciesResultOutput), nil
		}).(GetAppSecRatePoliciesResultOutput)
}

// A collection of arguments for invoking getAppSecRatePolicies.
type GetAppSecRatePoliciesOutputArgs struct {
	ConfigId     pulumi.IntInput    `pulumi:"configId"`
	RatePolicyId pulumi.IntPtrInput `pulumi:"ratePolicyId"`
}

func (GetAppSecRatePoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppSecRatePoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getAppSecRatePolicies.
type GetAppSecRatePoliciesResultOutput struct{ *pulumi.OutputState }

func (GetAppSecRatePoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppSecRatePoliciesResult)(nil)).Elem()
}

func (o GetAppSecRatePoliciesResultOutput) ToGetAppSecRatePoliciesResultOutput() GetAppSecRatePoliciesResultOutput {
	return o
}

func (o GetAppSecRatePoliciesResultOutput) ToGetAppSecRatePoliciesResultOutputWithContext(ctx context.Context) GetAppSecRatePoliciesResultOutput {
	return o
}

func (o GetAppSecRatePoliciesResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppSecRatePoliciesResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAppSecRatePoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecRatePoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppSecRatePoliciesResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecRatePoliciesResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetAppSecRatePoliciesResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecRatePoliciesResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o GetAppSecRatePoliciesResultOutput) RatePolicyId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetAppSecRatePoliciesResult) *int { return v.RatePolicyId }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppSecRatePoliciesResultOutput{})
}
