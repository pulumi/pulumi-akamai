// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupBotmanChallengeAction(ctx *pulumi.Context, args *LookupBotmanChallengeActionArgs, opts ...pulumi.InvokeOption) (*LookupBotmanChallengeActionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBotmanChallengeActionResult
	err := ctx.Invoke("akamai:index/getBotmanChallengeAction:getBotmanChallengeAction", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBotmanChallengeAction.
type LookupBotmanChallengeActionArgs struct {
	ActionId *string `pulumi:"actionId"`
	ConfigId int     `pulumi:"configId"`
}

// A collection of values returned by getBotmanChallengeAction.
type LookupBotmanChallengeActionResult struct {
	ActionId *string `pulumi:"actionId"`
	ConfigId int     `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Json string `pulumi:"json"`
}

func LookupBotmanChallengeActionOutput(ctx *pulumi.Context, args LookupBotmanChallengeActionOutputArgs, opts ...pulumi.InvokeOption) LookupBotmanChallengeActionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupBotmanChallengeActionResultOutput, error) {
			args := v.(LookupBotmanChallengeActionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getBotmanChallengeAction:getBotmanChallengeAction", args, LookupBotmanChallengeActionResultOutput{}, options).(LookupBotmanChallengeActionResultOutput), nil
		}).(LookupBotmanChallengeActionResultOutput)
}

// A collection of arguments for invoking getBotmanChallengeAction.
type LookupBotmanChallengeActionOutputArgs struct {
	ActionId pulumi.StringPtrInput `pulumi:"actionId"`
	ConfigId pulumi.IntInput       `pulumi:"configId"`
}

func (LookupBotmanChallengeActionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanChallengeActionArgs)(nil)).Elem()
}

// A collection of values returned by getBotmanChallengeAction.
type LookupBotmanChallengeActionResultOutput struct{ *pulumi.OutputState }

func (LookupBotmanChallengeActionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanChallengeActionResult)(nil)).Elem()
}

func (o LookupBotmanChallengeActionResultOutput) ToLookupBotmanChallengeActionResultOutput() LookupBotmanChallengeActionResultOutput {
	return o
}

func (o LookupBotmanChallengeActionResultOutput) ToLookupBotmanChallengeActionResultOutputWithContext(ctx context.Context) LookupBotmanChallengeActionResultOutput {
	return o
}

func (o LookupBotmanChallengeActionResultOutput) ActionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBotmanChallengeActionResult) *string { return v.ActionId }).(pulumi.StringPtrOutput)
}

func (o LookupBotmanChallengeActionResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBotmanChallengeActionResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBotmanChallengeActionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanChallengeActionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBotmanChallengeActionResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanChallengeActionResult) string { return v.Json }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBotmanChallengeActionResultOutput{})
}
