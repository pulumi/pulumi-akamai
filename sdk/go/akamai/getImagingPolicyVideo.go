// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupImagingPolicyVideo(ctx *pulumi.Context, args *LookupImagingPolicyVideoArgs, opts ...pulumi.InvokeOption) (*LookupImagingPolicyVideoResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupImagingPolicyVideoResult
	err := ctx.Invoke("akamai:index/getImagingPolicyVideo:getImagingPolicyVideo", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImagingPolicyVideo.
type LookupImagingPolicyVideoArgs struct {
	Policy GetImagingPolicyVideoPolicy `pulumi:"policy"`
}

// A collection of values returned by getImagingPolicyVideo.
type LookupImagingPolicyVideoResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id     string                      `pulumi:"id"`
	Json   string                      `pulumi:"json"`
	Policy GetImagingPolicyVideoPolicy `pulumi:"policy"`
}

func LookupImagingPolicyVideoOutput(ctx *pulumi.Context, args LookupImagingPolicyVideoOutputArgs, opts ...pulumi.InvokeOption) LookupImagingPolicyVideoResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupImagingPolicyVideoResultOutput, error) {
			args := v.(LookupImagingPolicyVideoArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getImagingPolicyVideo:getImagingPolicyVideo", args, LookupImagingPolicyVideoResultOutput{}, options).(LookupImagingPolicyVideoResultOutput), nil
		}).(LookupImagingPolicyVideoResultOutput)
}

// A collection of arguments for invoking getImagingPolicyVideo.
type LookupImagingPolicyVideoOutputArgs struct {
	Policy GetImagingPolicyVideoPolicyInput `pulumi:"policy"`
}

func (LookupImagingPolicyVideoOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImagingPolicyVideoArgs)(nil)).Elem()
}

// A collection of values returned by getImagingPolicyVideo.
type LookupImagingPolicyVideoResultOutput struct{ *pulumi.OutputState }

func (LookupImagingPolicyVideoResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImagingPolicyVideoResult)(nil)).Elem()
}

func (o LookupImagingPolicyVideoResultOutput) ToLookupImagingPolicyVideoResultOutput() LookupImagingPolicyVideoResultOutput {
	return o
}

func (o LookupImagingPolicyVideoResultOutput) ToLookupImagingPolicyVideoResultOutputWithContext(ctx context.Context) LookupImagingPolicyVideoResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupImagingPolicyVideoResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImagingPolicyVideoResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupImagingPolicyVideoResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImagingPolicyVideoResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o LookupImagingPolicyVideoResultOutput) Policy() GetImagingPolicyVideoPolicyOutput {
	return o.ApplyT(func(v LookupImagingPolicyVideoResult) GetImagingPolicyVideoPolicy { return v.Policy }).(GetImagingPolicyVideoPolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupImagingPolicyVideoResultOutput{})
}
