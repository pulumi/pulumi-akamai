// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupBotmanBotCategoryException(ctx *pulumi.Context, args *LookupBotmanBotCategoryExceptionArgs, opts ...pulumi.InvokeOption) (*LookupBotmanBotCategoryExceptionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBotmanBotCategoryExceptionResult
	err := ctx.Invoke("akamai:index/getBotmanBotCategoryException:getBotmanBotCategoryException", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBotmanBotCategoryException.
type LookupBotmanBotCategoryExceptionArgs struct {
	ConfigId         int    `pulumi:"configId"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// A collection of values returned by getBotmanBotCategoryException.
type LookupBotmanBotCategoryExceptionResult struct {
	ConfigId int `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	Json             string `pulumi:"json"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

func LookupBotmanBotCategoryExceptionOutput(ctx *pulumi.Context, args LookupBotmanBotCategoryExceptionOutputArgs, opts ...pulumi.InvokeOption) LookupBotmanBotCategoryExceptionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupBotmanBotCategoryExceptionResultOutput, error) {
			args := v.(LookupBotmanBotCategoryExceptionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getBotmanBotCategoryException:getBotmanBotCategoryException", args, LookupBotmanBotCategoryExceptionResultOutput{}, options).(LookupBotmanBotCategoryExceptionResultOutput), nil
		}).(LookupBotmanBotCategoryExceptionResultOutput)
}

// A collection of arguments for invoking getBotmanBotCategoryException.
type LookupBotmanBotCategoryExceptionOutputArgs struct {
	ConfigId         pulumi.IntInput    `pulumi:"configId"`
	SecurityPolicyId pulumi.StringInput `pulumi:"securityPolicyId"`
}

func (LookupBotmanBotCategoryExceptionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanBotCategoryExceptionArgs)(nil)).Elem()
}

// A collection of values returned by getBotmanBotCategoryException.
type LookupBotmanBotCategoryExceptionResultOutput struct{ *pulumi.OutputState }

func (LookupBotmanBotCategoryExceptionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanBotCategoryExceptionResult)(nil)).Elem()
}

func (o LookupBotmanBotCategoryExceptionResultOutput) ToLookupBotmanBotCategoryExceptionResultOutput() LookupBotmanBotCategoryExceptionResultOutput {
	return o
}

func (o LookupBotmanBotCategoryExceptionResultOutput) ToLookupBotmanBotCategoryExceptionResultOutputWithContext(ctx context.Context) LookupBotmanBotCategoryExceptionResultOutput {
	return o
}

func (o LookupBotmanBotCategoryExceptionResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBotmanBotCategoryExceptionResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBotmanBotCategoryExceptionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanBotCategoryExceptionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBotmanBotCategoryExceptionResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanBotCategoryExceptionResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o LookupBotmanBotCategoryExceptionResultOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanBotCategoryExceptionResult) string { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBotmanBotCategoryExceptionResultOutput{})
}
