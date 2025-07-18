// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetIamTimezones(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetIamTimezonesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIamTimezonesResult
	err := ctx.Invoke("akamai:index/getIamTimezones:getIamTimezones", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getIamTimezones.
type GetIamTimezonesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string                    `pulumi:"id"`
	Timezones []GetIamTimezonesTimezone `pulumi:"timezones"`
}

func GetIamTimezonesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetIamTimezonesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetIamTimezonesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("akamai:index/getIamTimezones:getIamTimezones", nil, GetIamTimezonesResultOutput{}, options).(GetIamTimezonesResultOutput), nil
	}).(GetIamTimezonesResultOutput)
}

// A collection of values returned by getIamTimezones.
type GetIamTimezonesResultOutput struct{ *pulumi.OutputState }

func (GetIamTimezonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIamTimezonesResult)(nil)).Elem()
}

func (o GetIamTimezonesResultOutput) ToGetIamTimezonesResultOutput() GetIamTimezonesResultOutput {
	return o
}

func (o GetIamTimezonesResultOutput) ToGetIamTimezonesResultOutputWithContext(ctx context.Context) GetIamTimezonesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetIamTimezonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamTimezonesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIamTimezonesResultOutput) Timezones() GetIamTimezonesTimezoneArrayOutput {
	return o.ApplyT(func(v GetIamTimezonesResult) []GetIamTimezonesTimezone { return v.Timezones }).(GetIamTimezonesTimezoneArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIamTimezonesResultOutput{})
}
