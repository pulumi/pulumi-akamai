// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupPropertyActivation(ctx *pulumi.Context, args *LookupPropertyActivationArgs, opts ...pulumi.InvokeOption) (*LookupPropertyActivationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPropertyActivationResult
	err := ctx.Invoke("akamai:index/getPropertyActivation:getPropertyActivation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPropertyActivation.
type LookupPropertyActivationArgs struct {
	Network    *string `pulumi:"network"`
	PropertyId string  `pulumi:"propertyId"`
	Version    *int    `pulumi:"version"`
}

// A collection of values returned by getPropertyActivation.
type LookupPropertyActivationResult struct {
	ActivationId string   `pulumi:"activationId"`
	Contacts     []string `pulumi:"contacts"`
	Errors       string   `pulumi:"errors"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	Network    *string `pulumi:"network"`
	Note       string  `pulumi:"note"`
	PropertyId string  `pulumi:"propertyId"`
	Status     string  `pulumi:"status"`
	Version    *int    `pulumi:"version"`
	Warnings   string  `pulumi:"warnings"`
}

func LookupPropertyActivationOutput(ctx *pulumi.Context, args LookupPropertyActivationOutputArgs, opts ...pulumi.InvokeOption) LookupPropertyActivationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPropertyActivationResultOutput, error) {
			args := v.(LookupPropertyActivationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getPropertyActivation:getPropertyActivation", args, LookupPropertyActivationResultOutput{}, options).(LookupPropertyActivationResultOutput), nil
		}).(LookupPropertyActivationResultOutput)
}

// A collection of arguments for invoking getPropertyActivation.
type LookupPropertyActivationOutputArgs struct {
	Network    pulumi.StringPtrInput `pulumi:"network"`
	PropertyId pulumi.StringInput    `pulumi:"propertyId"`
	Version    pulumi.IntPtrInput    `pulumi:"version"`
}

func (LookupPropertyActivationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPropertyActivationArgs)(nil)).Elem()
}

// A collection of values returned by getPropertyActivation.
type LookupPropertyActivationResultOutput struct{ *pulumi.OutputState }

func (LookupPropertyActivationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPropertyActivationResult)(nil)).Elem()
}

func (o LookupPropertyActivationResultOutput) ToLookupPropertyActivationResultOutput() LookupPropertyActivationResultOutput {
	return o
}

func (o LookupPropertyActivationResultOutput) ToLookupPropertyActivationResultOutputWithContext(ctx context.Context) LookupPropertyActivationResultOutput {
	return o
}

func (o LookupPropertyActivationResultOutput) ActivationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) string { return v.ActivationId }).(pulumi.StringOutput)
}

func (o LookupPropertyActivationResultOutput) Contacts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) []string { return v.Contacts }).(pulumi.StringArrayOutput)
}

func (o LookupPropertyActivationResultOutput) Errors() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) string { return v.Errors }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPropertyActivationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPropertyActivationResultOutput) Network() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) *string { return v.Network }).(pulumi.StringPtrOutput)
}

func (o LookupPropertyActivationResultOutput) Note() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) string { return v.Note }).(pulumi.StringOutput)
}

func (o LookupPropertyActivationResultOutput) PropertyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) string { return v.PropertyId }).(pulumi.StringOutput)
}

func (o LookupPropertyActivationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) string { return v.Status }).(pulumi.StringOutput)
}

func (o LookupPropertyActivationResultOutput) Version() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) *int { return v.Version }).(pulumi.IntPtrOutput)
}

func (o LookupPropertyActivationResultOutput) Warnings() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPropertyActivationResult) string { return v.Warnings }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPropertyActivationResultOutput{})
}
