// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupAppSecAdvancedSettingsPragmaHeader(ctx *pulumi.Context, args *LookupAppSecAdvancedSettingsPragmaHeaderArgs, opts ...pulumi.InvokeOption) (*LookupAppSecAdvancedSettingsPragmaHeaderResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppSecAdvancedSettingsPragmaHeaderResult
	err := ctx.Invoke("akamai:index/getAppSecAdvancedSettingsPragmaHeader:getAppSecAdvancedSettingsPragmaHeader", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppSecAdvancedSettingsPragmaHeader.
type LookupAppSecAdvancedSettingsPragmaHeaderArgs struct {
	ConfigId         int     `pulumi:"configId"`
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
}

// A collection of values returned by getAppSecAdvancedSettingsPragmaHeader.
type LookupAppSecAdvancedSettingsPragmaHeaderResult struct {
	ConfigId int `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id               string  `pulumi:"id"`
	Json             string  `pulumi:"json"`
	OutputText       string  `pulumi:"outputText"`
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
}

func LookupAppSecAdvancedSettingsPragmaHeaderOutput(ctx *pulumi.Context, args LookupAppSecAdvancedSettingsPragmaHeaderOutputArgs, opts ...pulumi.InvokeOption) LookupAppSecAdvancedSettingsPragmaHeaderResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAppSecAdvancedSettingsPragmaHeaderResultOutput, error) {
			args := v.(LookupAppSecAdvancedSettingsPragmaHeaderArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getAppSecAdvancedSettingsPragmaHeader:getAppSecAdvancedSettingsPragmaHeader", args, LookupAppSecAdvancedSettingsPragmaHeaderResultOutput{}, options).(LookupAppSecAdvancedSettingsPragmaHeaderResultOutput), nil
		}).(LookupAppSecAdvancedSettingsPragmaHeaderResultOutput)
}

// A collection of arguments for invoking getAppSecAdvancedSettingsPragmaHeader.
type LookupAppSecAdvancedSettingsPragmaHeaderOutputArgs struct {
	ConfigId         pulumi.IntInput       `pulumi:"configId"`
	SecurityPolicyId pulumi.StringPtrInput `pulumi:"securityPolicyId"`
}

func (LookupAppSecAdvancedSettingsPragmaHeaderOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppSecAdvancedSettingsPragmaHeaderArgs)(nil)).Elem()
}

// A collection of values returned by getAppSecAdvancedSettingsPragmaHeader.
type LookupAppSecAdvancedSettingsPragmaHeaderResultOutput struct{ *pulumi.OutputState }

func (LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppSecAdvancedSettingsPragmaHeaderResult)(nil)).Elem()
}

func (o LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) ToLookupAppSecAdvancedSettingsPragmaHeaderResultOutput() LookupAppSecAdvancedSettingsPragmaHeaderResultOutput {
	return o
}

func (o LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) ToLookupAppSecAdvancedSettingsPragmaHeaderResultOutputWithContext(ctx context.Context) LookupAppSecAdvancedSettingsPragmaHeaderResultOutput {
	return o
}

func (o LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAppSecAdvancedSettingsPragmaHeaderResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecAdvancedSettingsPragmaHeaderResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecAdvancedSettingsPragmaHeaderResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecAdvancedSettingsPragmaHeaderResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o LookupAppSecAdvancedSettingsPragmaHeaderResultOutput) SecurityPolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAppSecAdvancedSettingsPragmaHeaderResult) *string { return v.SecurityPolicyId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppSecAdvancedSettingsPragmaHeaderResultOutput{})
}
