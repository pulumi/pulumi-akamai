// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupBotmanCustomBotCategoryAction(ctx *pulumi.Context, args *LookupBotmanCustomBotCategoryActionArgs, opts ...pulumi.InvokeOption) (*LookupBotmanCustomBotCategoryActionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBotmanCustomBotCategoryActionResult
	err := ctx.Invoke("akamai:index/getBotmanCustomBotCategoryAction:getBotmanCustomBotCategoryAction", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBotmanCustomBotCategoryAction.
type LookupBotmanCustomBotCategoryActionArgs struct {
	CategoryId       *string `pulumi:"categoryId"`
	ConfigId         int     `pulumi:"configId"`
	SecurityPolicyId string  `pulumi:"securityPolicyId"`
}

// A collection of values returned by getBotmanCustomBotCategoryAction.
type LookupBotmanCustomBotCategoryActionResult struct {
	CategoryId *string `pulumi:"categoryId"`
	ConfigId   int     `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	Json             string `pulumi:"json"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

func LookupBotmanCustomBotCategoryActionOutput(ctx *pulumi.Context, args LookupBotmanCustomBotCategoryActionOutputArgs, opts ...pulumi.InvokeOption) LookupBotmanCustomBotCategoryActionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupBotmanCustomBotCategoryActionResultOutput, error) {
			args := v.(LookupBotmanCustomBotCategoryActionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getBotmanCustomBotCategoryAction:getBotmanCustomBotCategoryAction", args, LookupBotmanCustomBotCategoryActionResultOutput{}, options).(LookupBotmanCustomBotCategoryActionResultOutput), nil
		}).(LookupBotmanCustomBotCategoryActionResultOutput)
}

// A collection of arguments for invoking getBotmanCustomBotCategoryAction.
type LookupBotmanCustomBotCategoryActionOutputArgs struct {
	CategoryId       pulumi.StringPtrInput `pulumi:"categoryId"`
	ConfigId         pulumi.IntInput       `pulumi:"configId"`
	SecurityPolicyId pulumi.StringInput    `pulumi:"securityPolicyId"`
}

func (LookupBotmanCustomBotCategoryActionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanCustomBotCategoryActionArgs)(nil)).Elem()
}

// A collection of values returned by getBotmanCustomBotCategoryAction.
type LookupBotmanCustomBotCategoryActionResultOutput struct{ *pulumi.OutputState }

func (LookupBotmanCustomBotCategoryActionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanCustomBotCategoryActionResult)(nil)).Elem()
}

func (o LookupBotmanCustomBotCategoryActionResultOutput) ToLookupBotmanCustomBotCategoryActionResultOutput() LookupBotmanCustomBotCategoryActionResultOutput {
	return o
}

func (o LookupBotmanCustomBotCategoryActionResultOutput) ToLookupBotmanCustomBotCategoryActionResultOutputWithContext(ctx context.Context) LookupBotmanCustomBotCategoryActionResultOutput {
	return o
}

func (o LookupBotmanCustomBotCategoryActionResultOutput) CategoryId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBotmanCustomBotCategoryActionResult) *string { return v.CategoryId }).(pulumi.StringPtrOutput)
}

func (o LookupBotmanCustomBotCategoryActionResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBotmanCustomBotCategoryActionResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBotmanCustomBotCategoryActionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanCustomBotCategoryActionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBotmanCustomBotCategoryActionResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanCustomBotCategoryActionResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o LookupBotmanCustomBotCategoryActionResultOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanCustomBotCategoryActionResult) string { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBotmanCustomBotCategoryActionResultOutput{})
}
