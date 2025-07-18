// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupAppsecPenaltyBoxConditions(ctx *pulumi.Context, args *LookupAppsecPenaltyBoxConditionsArgs, opts ...pulumi.InvokeOption) (*LookupAppsecPenaltyBoxConditionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAppsecPenaltyBoxConditionsResult
	err := ctx.Invoke("akamai:index/getAppsecPenaltyBoxConditions:getAppsecPenaltyBoxConditions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppsecPenaltyBoxConditions.
type LookupAppsecPenaltyBoxConditionsArgs struct {
	ConfigId         int    `pulumi:"configId"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// A collection of values returned by getAppsecPenaltyBoxConditions.
type LookupAppsecPenaltyBoxConditionsResult struct {
	ConfigId int `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	Json             string `pulumi:"json"`
	OutputText       string `pulumi:"outputText"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

func LookupAppsecPenaltyBoxConditionsOutput(ctx *pulumi.Context, args LookupAppsecPenaltyBoxConditionsOutputArgs, opts ...pulumi.InvokeOption) LookupAppsecPenaltyBoxConditionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAppsecPenaltyBoxConditionsResultOutput, error) {
			args := v.(LookupAppsecPenaltyBoxConditionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getAppsecPenaltyBoxConditions:getAppsecPenaltyBoxConditions", args, LookupAppsecPenaltyBoxConditionsResultOutput{}, options).(LookupAppsecPenaltyBoxConditionsResultOutput), nil
		}).(LookupAppsecPenaltyBoxConditionsResultOutput)
}

// A collection of arguments for invoking getAppsecPenaltyBoxConditions.
type LookupAppsecPenaltyBoxConditionsOutputArgs struct {
	ConfigId         pulumi.IntInput    `pulumi:"configId"`
	SecurityPolicyId pulumi.StringInput `pulumi:"securityPolicyId"`
}

func (LookupAppsecPenaltyBoxConditionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppsecPenaltyBoxConditionsArgs)(nil)).Elem()
}

// A collection of values returned by getAppsecPenaltyBoxConditions.
type LookupAppsecPenaltyBoxConditionsResultOutput struct{ *pulumi.OutputState }

func (LookupAppsecPenaltyBoxConditionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppsecPenaltyBoxConditionsResult)(nil)).Elem()
}

func (o LookupAppsecPenaltyBoxConditionsResultOutput) ToLookupAppsecPenaltyBoxConditionsResultOutput() LookupAppsecPenaltyBoxConditionsResultOutput {
	return o
}

func (o LookupAppsecPenaltyBoxConditionsResultOutput) ToLookupAppsecPenaltyBoxConditionsResultOutputWithContext(ctx context.Context) LookupAppsecPenaltyBoxConditionsResultOutput {
	return o
}

func (o LookupAppsecPenaltyBoxConditionsResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAppsecPenaltyBoxConditionsResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppsecPenaltyBoxConditionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppsecPenaltyBoxConditionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAppsecPenaltyBoxConditionsResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppsecPenaltyBoxConditionsResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o LookupAppsecPenaltyBoxConditionsResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppsecPenaltyBoxConditionsResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o LookupAppsecPenaltyBoxConditionsResultOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppsecPenaltyBoxConditionsResult) string { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppsecPenaltyBoxConditionsResultOutput{})
}
