// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetAppSecExportConfiguration(ctx *pulumi.Context, args *GetAppSecExportConfigurationArgs, opts ...pulumi.InvokeOption) (*GetAppSecExportConfigurationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAppSecExportConfigurationResult
	err := ctx.Invoke("akamai:index/getAppSecExportConfiguration:getAppSecExportConfiguration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppSecExportConfiguration.
type GetAppSecExportConfigurationArgs struct {
	ConfigId int      `pulumi:"configId"`
	Searches []string `pulumi:"searches"`
	Version  int      `pulumi:"version"`
}

// A collection of values returned by getAppSecExportConfiguration.
type GetAppSecExportConfigurationResult struct {
	ConfigId int `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Json       string   `pulumi:"json"`
	OutputText string   `pulumi:"outputText"`
	Searches   []string `pulumi:"searches"`
	Version    int      `pulumi:"version"`
}

func GetAppSecExportConfigurationOutput(ctx *pulumi.Context, args GetAppSecExportConfigurationOutputArgs, opts ...pulumi.InvokeOption) GetAppSecExportConfigurationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAppSecExportConfigurationResultOutput, error) {
			args := v.(GetAppSecExportConfigurationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getAppSecExportConfiguration:getAppSecExportConfiguration", args, GetAppSecExportConfigurationResultOutput{}, options).(GetAppSecExportConfigurationResultOutput), nil
		}).(GetAppSecExportConfigurationResultOutput)
}

// A collection of arguments for invoking getAppSecExportConfiguration.
type GetAppSecExportConfigurationOutputArgs struct {
	ConfigId pulumi.IntInput         `pulumi:"configId"`
	Searches pulumi.StringArrayInput `pulumi:"searches"`
	Version  pulumi.IntInput         `pulumi:"version"`
}

func (GetAppSecExportConfigurationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppSecExportConfigurationArgs)(nil)).Elem()
}

// A collection of values returned by getAppSecExportConfiguration.
type GetAppSecExportConfigurationResultOutput struct{ *pulumi.OutputState }

func (GetAppSecExportConfigurationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppSecExportConfigurationResult)(nil)).Elem()
}

func (o GetAppSecExportConfigurationResultOutput) ToGetAppSecExportConfigurationResultOutput() GetAppSecExportConfigurationResultOutput {
	return o
}

func (o GetAppSecExportConfigurationResultOutput) ToGetAppSecExportConfigurationResultOutputWithContext(ctx context.Context) GetAppSecExportConfigurationResultOutput {
	return o
}

func (o GetAppSecExportConfigurationResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppSecExportConfigurationResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAppSecExportConfigurationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecExportConfigurationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppSecExportConfigurationResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecExportConfigurationResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetAppSecExportConfigurationResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecExportConfigurationResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o GetAppSecExportConfigurationResultOutput) Searches() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAppSecExportConfigurationResult) []string { return v.Searches }).(pulumi.StringArrayOutput)
}

func (o GetAppSecExportConfigurationResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v GetAppSecExportConfigurationResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppSecExportConfigurationResultOutput{})
}
