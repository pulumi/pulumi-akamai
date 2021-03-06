// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `AppSecCustomRule` resource allows you to create or modify a custom rule associated with a given security configuration.
type AppSecCustomRule struct {
	pulumi.CustomResourceState

	// The ID of the security configuration to use.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// The name of a JSON file containing a custom rule definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#postcustomrules)).
	CustomRule pulumi.StringOutput `pulumi:"customRule"`
	// The ID of the custom rule.
	CustomRuleId pulumi.IntOutput `pulumi:"customRuleId"`
}

// NewAppSecCustomRule registers a new resource with the given unique name, arguments, and options.
func NewAppSecCustomRule(ctx *pulumi.Context,
	name string, args *AppSecCustomRuleArgs, opts ...pulumi.ResourceOption) (*AppSecCustomRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.CustomRule == nil {
		return nil, errors.New("invalid value for required argument 'CustomRule'")
	}
	var resource AppSecCustomRule
	err := ctx.RegisterResource("akamai:index/appSecCustomRule:AppSecCustomRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecCustomRule gets an existing AppSecCustomRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecCustomRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecCustomRuleState, opts ...pulumi.ResourceOption) (*AppSecCustomRule, error) {
	var resource AppSecCustomRule
	err := ctx.ReadResource("akamai:index/appSecCustomRule:AppSecCustomRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecCustomRule resources.
type appSecCustomRuleState struct {
	// The ID of the security configuration to use.
	ConfigId *int `pulumi:"configId"`
	// The name of a JSON file containing a custom rule definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#postcustomrules)).
	CustomRule *string `pulumi:"customRule"`
	// The ID of the custom rule.
	CustomRuleId *int `pulumi:"customRuleId"`
}

type AppSecCustomRuleState struct {
	// The ID of the security configuration to use.
	ConfigId pulumi.IntPtrInput
	// The name of a JSON file containing a custom rule definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#postcustomrules)).
	CustomRule pulumi.StringPtrInput
	// The ID of the custom rule.
	CustomRuleId pulumi.IntPtrInput
}

func (AppSecCustomRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecCustomRuleState)(nil)).Elem()
}

type appSecCustomRuleArgs struct {
	// The ID of the security configuration to use.
	ConfigId int `pulumi:"configId"`
	// The name of a JSON file containing a custom rule definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#postcustomrules)).
	CustomRule string `pulumi:"customRule"`
}

// The set of arguments for constructing a AppSecCustomRule resource.
type AppSecCustomRuleArgs struct {
	// The ID of the security configuration to use.
	ConfigId pulumi.IntInput
	// The name of a JSON file containing a custom rule definition ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#postcustomrules)).
	CustomRule pulumi.StringInput
}

func (AppSecCustomRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecCustomRuleArgs)(nil)).Elem()
}

type AppSecCustomRuleInput interface {
	pulumi.Input

	ToAppSecCustomRuleOutput() AppSecCustomRuleOutput
	ToAppSecCustomRuleOutputWithContext(ctx context.Context) AppSecCustomRuleOutput
}

func (*AppSecCustomRule) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecCustomRule)(nil))
}

func (i *AppSecCustomRule) ToAppSecCustomRuleOutput() AppSecCustomRuleOutput {
	return i.ToAppSecCustomRuleOutputWithContext(context.Background())
}

func (i *AppSecCustomRule) ToAppSecCustomRuleOutputWithContext(ctx context.Context) AppSecCustomRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRuleOutput)
}

func (i *AppSecCustomRule) ToAppSecCustomRulePtrOutput() AppSecCustomRulePtrOutput {
	return i.ToAppSecCustomRulePtrOutputWithContext(context.Background())
}

func (i *AppSecCustomRule) ToAppSecCustomRulePtrOutputWithContext(ctx context.Context) AppSecCustomRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRulePtrOutput)
}

type AppSecCustomRulePtrInput interface {
	pulumi.Input

	ToAppSecCustomRulePtrOutput() AppSecCustomRulePtrOutput
	ToAppSecCustomRulePtrOutputWithContext(ctx context.Context) AppSecCustomRulePtrOutput
}

type appSecCustomRulePtrType AppSecCustomRuleArgs

func (*appSecCustomRulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecCustomRule)(nil))
}

func (i *appSecCustomRulePtrType) ToAppSecCustomRulePtrOutput() AppSecCustomRulePtrOutput {
	return i.ToAppSecCustomRulePtrOutputWithContext(context.Background())
}

func (i *appSecCustomRulePtrType) ToAppSecCustomRulePtrOutputWithContext(ctx context.Context) AppSecCustomRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRulePtrOutput)
}

// AppSecCustomRuleArrayInput is an input type that accepts AppSecCustomRuleArray and AppSecCustomRuleArrayOutput values.
// You can construct a concrete instance of `AppSecCustomRuleArrayInput` via:
//
//          AppSecCustomRuleArray{ AppSecCustomRuleArgs{...} }
type AppSecCustomRuleArrayInput interface {
	pulumi.Input

	ToAppSecCustomRuleArrayOutput() AppSecCustomRuleArrayOutput
	ToAppSecCustomRuleArrayOutputWithContext(context.Context) AppSecCustomRuleArrayOutput
}

type AppSecCustomRuleArray []AppSecCustomRuleInput

func (AppSecCustomRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AppSecCustomRule)(nil))
}

func (i AppSecCustomRuleArray) ToAppSecCustomRuleArrayOutput() AppSecCustomRuleArrayOutput {
	return i.ToAppSecCustomRuleArrayOutputWithContext(context.Background())
}

func (i AppSecCustomRuleArray) ToAppSecCustomRuleArrayOutputWithContext(ctx context.Context) AppSecCustomRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRuleArrayOutput)
}

// AppSecCustomRuleMapInput is an input type that accepts AppSecCustomRuleMap and AppSecCustomRuleMapOutput values.
// You can construct a concrete instance of `AppSecCustomRuleMapInput` via:
//
//          AppSecCustomRuleMap{ "key": AppSecCustomRuleArgs{...} }
type AppSecCustomRuleMapInput interface {
	pulumi.Input

	ToAppSecCustomRuleMapOutput() AppSecCustomRuleMapOutput
	ToAppSecCustomRuleMapOutputWithContext(context.Context) AppSecCustomRuleMapOutput
}

type AppSecCustomRuleMap map[string]AppSecCustomRuleInput

func (AppSecCustomRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AppSecCustomRule)(nil))
}

func (i AppSecCustomRuleMap) ToAppSecCustomRuleMapOutput() AppSecCustomRuleMapOutput {
	return i.ToAppSecCustomRuleMapOutputWithContext(context.Background())
}

func (i AppSecCustomRuleMap) ToAppSecCustomRuleMapOutputWithContext(ctx context.Context) AppSecCustomRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRuleMapOutput)
}

type AppSecCustomRuleOutput struct {
	*pulumi.OutputState
}

func (AppSecCustomRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecCustomRule)(nil))
}

func (o AppSecCustomRuleOutput) ToAppSecCustomRuleOutput() AppSecCustomRuleOutput {
	return o
}

func (o AppSecCustomRuleOutput) ToAppSecCustomRuleOutputWithContext(ctx context.Context) AppSecCustomRuleOutput {
	return o
}

func (o AppSecCustomRuleOutput) ToAppSecCustomRulePtrOutput() AppSecCustomRulePtrOutput {
	return o.ToAppSecCustomRulePtrOutputWithContext(context.Background())
}

func (o AppSecCustomRuleOutput) ToAppSecCustomRulePtrOutputWithContext(ctx context.Context) AppSecCustomRulePtrOutput {
	return o.ApplyT(func(v AppSecCustomRule) *AppSecCustomRule {
		return &v
	}).(AppSecCustomRulePtrOutput)
}

type AppSecCustomRulePtrOutput struct {
	*pulumi.OutputState
}

func (AppSecCustomRulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecCustomRule)(nil))
}

func (o AppSecCustomRulePtrOutput) ToAppSecCustomRulePtrOutput() AppSecCustomRulePtrOutput {
	return o
}

func (o AppSecCustomRulePtrOutput) ToAppSecCustomRulePtrOutputWithContext(ctx context.Context) AppSecCustomRulePtrOutput {
	return o
}

type AppSecCustomRuleArrayOutput struct{ *pulumi.OutputState }

func (AppSecCustomRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppSecCustomRule)(nil))
}

func (o AppSecCustomRuleArrayOutput) ToAppSecCustomRuleArrayOutput() AppSecCustomRuleArrayOutput {
	return o
}

func (o AppSecCustomRuleArrayOutput) ToAppSecCustomRuleArrayOutputWithContext(ctx context.Context) AppSecCustomRuleArrayOutput {
	return o
}

func (o AppSecCustomRuleArrayOutput) Index(i pulumi.IntInput) AppSecCustomRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppSecCustomRule {
		return vs[0].([]AppSecCustomRule)[vs[1].(int)]
	}).(AppSecCustomRuleOutput)
}

type AppSecCustomRuleMapOutput struct{ *pulumi.OutputState }

func (AppSecCustomRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AppSecCustomRule)(nil))
}

func (o AppSecCustomRuleMapOutput) ToAppSecCustomRuleMapOutput() AppSecCustomRuleMapOutput {
	return o
}

func (o AppSecCustomRuleMapOutput) ToAppSecCustomRuleMapOutputWithContext(ctx context.Context) AppSecCustomRuleMapOutput {
	return o
}

func (o AppSecCustomRuleMapOutput) MapIndex(k pulumi.StringInput) AppSecCustomRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AppSecCustomRule {
		return vs[0].(map[string]AppSecCustomRule)[vs[1].(string)]
	}).(AppSecCustomRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(AppSecCustomRuleOutput{})
	pulumi.RegisterOutputType(AppSecCustomRulePtrOutput{})
	pulumi.RegisterOutputType(AppSecCustomRuleArrayOutput{})
	pulumi.RegisterOutputType(AppSecCustomRuleMapOutput{})
}
