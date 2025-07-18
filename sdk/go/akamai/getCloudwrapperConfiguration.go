// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupCloudwrapperConfiguration(ctx *pulumi.Context, args *LookupCloudwrapperConfigurationArgs, opts ...pulumi.InvokeOption) (*LookupCloudwrapperConfigurationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCloudwrapperConfigurationResult
	err := ctx.Invoke("akamai:index/getCloudwrapperConfiguration:getCloudwrapperConfiguration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCloudwrapperConfiguration.
type LookupCloudwrapperConfigurationArgs struct {
	Id               int                                           `pulumi:"id"`
	Locations        []GetCloudwrapperConfigurationLocation        `pulumi:"locations"`
	MultiCdnSettings *GetCloudwrapperConfigurationMultiCdnSettings `pulumi:"multiCdnSettings"`
}

// A collection of values returned by getCloudwrapperConfiguration.
type LookupCloudwrapperConfigurationResult struct {
	CapacityAlertsThreshold int                                           `pulumi:"capacityAlertsThreshold"`
	Comments                string                                        `pulumi:"comments"`
	ConfigName              string                                        `pulumi:"configName"`
	ContractId              string                                        `pulumi:"contractId"`
	Id                      int                                           `pulumi:"id"`
	LastActivatedBy         string                                        `pulumi:"lastActivatedBy"`
	LastActivatedDate       string                                        `pulumi:"lastActivatedDate"`
	LastUpdatedBy           string                                        `pulumi:"lastUpdatedBy"`
	LastUpdatedDate         string                                        `pulumi:"lastUpdatedDate"`
	Locations               []GetCloudwrapperConfigurationLocation        `pulumi:"locations"`
	MultiCdnSettings        *GetCloudwrapperConfigurationMultiCdnSettings `pulumi:"multiCdnSettings"`
	NotificationEmails      []string                                      `pulumi:"notificationEmails"`
	PropertyIds             []string                                      `pulumi:"propertyIds"`
	RetainIdleObjects       bool                                          `pulumi:"retainIdleObjects"`
	Status                  string                                        `pulumi:"status"`
}

func LookupCloudwrapperConfigurationOutput(ctx *pulumi.Context, args LookupCloudwrapperConfigurationOutputArgs, opts ...pulumi.InvokeOption) LookupCloudwrapperConfigurationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCloudwrapperConfigurationResultOutput, error) {
			args := v.(LookupCloudwrapperConfigurationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("akamai:index/getCloudwrapperConfiguration:getCloudwrapperConfiguration", args, LookupCloudwrapperConfigurationResultOutput{}, options).(LookupCloudwrapperConfigurationResultOutput), nil
		}).(LookupCloudwrapperConfigurationResultOutput)
}

// A collection of arguments for invoking getCloudwrapperConfiguration.
type LookupCloudwrapperConfigurationOutputArgs struct {
	Id               pulumi.IntInput                                      `pulumi:"id"`
	Locations        GetCloudwrapperConfigurationLocationArrayInput       `pulumi:"locations"`
	MultiCdnSettings GetCloudwrapperConfigurationMultiCdnSettingsPtrInput `pulumi:"multiCdnSettings"`
}

func (LookupCloudwrapperConfigurationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudwrapperConfigurationArgs)(nil)).Elem()
}

// A collection of values returned by getCloudwrapperConfiguration.
type LookupCloudwrapperConfigurationResultOutput struct{ *pulumi.OutputState }

func (LookupCloudwrapperConfigurationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCloudwrapperConfigurationResult)(nil)).Elem()
}

func (o LookupCloudwrapperConfigurationResultOutput) ToLookupCloudwrapperConfigurationResultOutput() LookupCloudwrapperConfigurationResultOutput {
	return o
}

func (o LookupCloudwrapperConfigurationResultOutput) ToLookupCloudwrapperConfigurationResultOutputWithContext(ctx context.Context) LookupCloudwrapperConfigurationResultOutput {
	return o
}

func (o LookupCloudwrapperConfigurationResultOutput) CapacityAlertsThreshold() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) int { return v.CapacityAlertsThreshold }).(pulumi.IntOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) Comments() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.Comments }).(pulumi.StringOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) ConfigName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.ConfigName }).(pulumi.StringOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) ContractId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.ContractId }).(pulumi.StringOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) int { return v.Id }).(pulumi.IntOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) LastActivatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.LastActivatedBy }).(pulumi.StringOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) LastActivatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.LastActivatedDate }).(pulumi.StringOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) LastUpdatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.LastUpdatedBy }).(pulumi.StringOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) LastUpdatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.LastUpdatedDate }).(pulumi.StringOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) Locations() GetCloudwrapperConfigurationLocationArrayOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) []GetCloudwrapperConfigurationLocation {
		return v.Locations
	}).(GetCloudwrapperConfigurationLocationArrayOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) MultiCdnSettings() GetCloudwrapperConfigurationMultiCdnSettingsPtrOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) *GetCloudwrapperConfigurationMultiCdnSettings {
		return v.MultiCdnSettings
	}).(GetCloudwrapperConfigurationMultiCdnSettingsPtrOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) NotificationEmails() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) []string { return v.NotificationEmails }).(pulumi.StringArrayOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) PropertyIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) []string { return v.PropertyIds }).(pulumi.StringArrayOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) RetainIdleObjects() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) bool { return v.RetainIdleObjects }).(pulumi.BoolOutput)
}

func (o LookupCloudwrapperConfigurationResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCloudwrapperConfigurationResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCloudwrapperConfigurationResultOutput{})
}
