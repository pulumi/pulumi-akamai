// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AppSecCustomRuleAction struct {
	pulumi.CustomResourceState

	// Unique identifier of the security configuration
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// Action to be taken when the custom rule is invoked
	CustomRuleAction pulumi.StringOutput `pulumi:"customRuleAction"`
	// Unique identifier of the custom rule whose action is being modified
	CustomRuleId pulumi.IntOutput `pulumi:"customRuleId"`
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
}

// NewAppSecCustomRuleAction registers a new resource with the given unique name, arguments, and options.
func NewAppSecCustomRuleAction(ctx *pulumi.Context,
	name string, args *AppSecCustomRuleActionArgs, opts ...pulumi.ResourceOption) (*AppSecCustomRuleAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.CustomRuleAction == nil {
		return nil, errors.New("invalid value for required argument 'CustomRuleAction'")
	}
	if args.CustomRuleId == nil {
		return nil, errors.New("invalid value for required argument 'CustomRuleId'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AppSecCustomRuleAction
	err := ctx.RegisterResource("akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecCustomRuleAction gets an existing AppSecCustomRuleAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecCustomRuleAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecCustomRuleActionState, opts ...pulumi.ResourceOption) (*AppSecCustomRuleAction, error) {
	var resource AppSecCustomRuleAction
	err := ctx.ReadResource("akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecCustomRuleAction resources.
type appSecCustomRuleActionState struct {
	// Unique identifier of the security configuration
	ConfigId *int `pulumi:"configId"`
	// Action to be taken when the custom rule is invoked
	CustomRuleAction *string `pulumi:"customRuleAction"`
	// Unique identifier of the custom rule whose action is being modified
	CustomRuleId *int `pulumi:"customRuleId"`
	// Unique identifier of the security policy
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
}

type AppSecCustomRuleActionState struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntPtrInput
	// Action to be taken when the custom rule is invoked
	CustomRuleAction pulumi.StringPtrInput
	// Unique identifier of the custom rule whose action is being modified
	CustomRuleId pulumi.IntPtrInput
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringPtrInput
}

func (AppSecCustomRuleActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecCustomRuleActionState)(nil)).Elem()
}

type appSecCustomRuleActionArgs struct {
	// Unique identifier of the security configuration
	ConfigId int `pulumi:"configId"`
	// Action to be taken when the custom rule is invoked
	CustomRuleAction string `pulumi:"customRuleAction"`
	// Unique identifier of the custom rule whose action is being modified
	CustomRuleId int `pulumi:"customRuleId"`
	// Unique identifier of the security policy
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// The set of arguments for constructing a AppSecCustomRuleAction resource.
type AppSecCustomRuleActionArgs struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntInput
	// Action to be taken when the custom rule is invoked
	CustomRuleAction pulumi.StringInput
	// Unique identifier of the custom rule whose action is being modified
	CustomRuleId pulumi.IntInput
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringInput
}

func (AppSecCustomRuleActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecCustomRuleActionArgs)(nil)).Elem()
}

type AppSecCustomRuleActionInput interface {
	pulumi.Input

	ToAppSecCustomRuleActionOutput() AppSecCustomRuleActionOutput
	ToAppSecCustomRuleActionOutputWithContext(ctx context.Context) AppSecCustomRuleActionOutput
}

func (*AppSecCustomRuleAction) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecCustomRuleAction)(nil)).Elem()
}

func (i *AppSecCustomRuleAction) ToAppSecCustomRuleActionOutput() AppSecCustomRuleActionOutput {
	return i.ToAppSecCustomRuleActionOutputWithContext(context.Background())
}

func (i *AppSecCustomRuleAction) ToAppSecCustomRuleActionOutputWithContext(ctx context.Context) AppSecCustomRuleActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRuleActionOutput)
}

// AppSecCustomRuleActionArrayInput is an input type that accepts AppSecCustomRuleActionArray and AppSecCustomRuleActionArrayOutput values.
// You can construct a concrete instance of `AppSecCustomRuleActionArrayInput` via:
//
//	AppSecCustomRuleActionArray{ AppSecCustomRuleActionArgs{...} }
type AppSecCustomRuleActionArrayInput interface {
	pulumi.Input

	ToAppSecCustomRuleActionArrayOutput() AppSecCustomRuleActionArrayOutput
	ToAppSecCustomRuleActionArrayOutputWithContext(context.Context) AppSecCustomRuleActionArrayOutput
}

type AppSecCustomRuleActionArray []AppSecCustomRuleActionInput

func (AppSecCustomRuleActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecCustomRuleAction)(nil)).Elem()
}

func (i AppSecCustomRuleActionArray) ToAppSecCustomRuleActionArrayOutput() AppSecCustomRuleActionArrayOutput {
	return i.ToAppSecCustomRuleActionArrayOutputWithContext(context.Background())
}

func (i AppSecCustomRuleActionArray) ToAppSecCustomRuleActionArrayOutputWithContext(ctx context.Context) AppSecCustomRuleActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRuleActionArrayOutput)
}

// AppSecCustomRuleActionMapInput is an input type that accepts AppSecCustomRuleActionMap and AppSecCustomRuleActionMapOutput values.
// You can construct a concrete instance of `AppSecCustomRuleActionMapInput` via:
//
//	AppSecCustomRuleActionMap{ "key": AppSecCustomRuleActionArgs{...} }
type AppSecCustomRuleActionMapInput interface {
	pulumi.Input

	ToAppSecCustomRuleActionMapOutput() AppSecCustomRuleActionMapOutput
	ToAppSecCustomRuleActionMapOutputWithContext(context.Context) AppSecCustomRuleActionMapOutput
}

type AppSecCustomRuleActionMap map[string]AppSecCustomRuleActionInput

func (AppSecCustomRuleActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecCustomRuleAction)(nil)).Elem()
}

func (i AppSecCustomRuleActionMap) ToAppSecCustomRuleActionMapOutput() AppSecCustomRuleActionMapOutput {
	return i.ToAppSecCustomRuleActionMapOutputWithContext(context.Background())
}

func (i AppSecCustomRuleActionMap) ToAppSecCustomRuleActionMapOutputWithContext(ctx context.Context) AppSecCustomRuleActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecCustomRuleActionMapOutput)
}

type AppSecCustomRuleActionOutput struct{ *pulumi.OutputState }

func (AppSecCustomRuleActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecCustomRuleAction)(nil)).Elem()
}

func (o AppSecCustomRuleActionOutput) ToAppSecCustomRuleActionOutput() AppSecCustomRuleActionOutput {
	return o
}

func (o AppSecCustomRuleActionOutput) ToAppSecCustomRuleActionOutputWithContext(ctx context.Context) AppSecCustomRuleActionOutput {
	return o
}

// Unique identifier of the security configuration
func (o AppSecCustomRuleActionOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v *AppSecCustomRuleAction) pulumi.IntOutput { return v.ConfigId }).(pulumi.IntOutput)
}

// Action to be taken when the custom rule is invoked
func (o AppSecCustomRuleActionOutput) CustomRuleAction() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecCustomRuleAction) pulumi.StringOutput { return v.CustomRuleAction }).(pulumi.StringOutput)
}

// Unique identifier of the custom rule whose action is being modified
func (o AppSecCustomRuleActionOutput) CustomRuleId() pulumi.IntOutput {
	return o.ApplyT(func(v *AppSecCustomRuleAction) pulumi.IntOutput { return v.CustomRuleId }).(pulumi.IntOutput)
}

// Unique identifier of the security policy
func (o AppSecCustomRuleActionOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecCustomRuleAction) pulumi.StringOutput { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

type AppSecCustomRuleActionArrayOutput struct{ *pulumi.OutputState }

func (AppSecCustomRuleActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecCustomRuleAction)(nil)).Elem()
}

func (o AppSecCustomRuleActionArrayOutput) ToAppSecCustomRuleActionArrayOutput() AppSecCustomRuleActionArrayOutput {
	return o
}

func (o AppSecCustomRuleActionArrayOutput) ToAppSecCustomRuleActionArrayOutputWithContext(ctx context.Context) AppSecCustomRuleActionArrayOutput {
	return o
}

func (o AppSecCustomRuleActionArrayOutput) Index(i pulumi.IntInput) AppSecCustomRuleActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppSecCustomRuleAction {
		return vs[0].([]*AppSecCustomRuleAction)[vs[1].(int)]
	}).(AppSecCustomRuleActionOutput)
}

type AppSecCustomRuleActionMapOutput struct{ *pulumi.OutputState }

func (AppSecCustomRuleActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecCustomRuleAction)(nil)).Elem()
}

func (o AppSecCustomRuleActionMapOutput) ToAppSecCustomRuleActionMapOutput() AppSecCustomRuleActionMapOutput {
	return o
}

func (o AppSecCustomRuleActionMapOutput) ToAppSecCustomRuleActionMapOutputWithContext(ctx context.Context) AppSecCustomRuleActionMapOutput {
	return o
}

func (o AppSecCustomRuleActionMapOutput) MapIndex(k pulumi.StringInput) AppSecCustomRuleActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppSecCustomRuleAction {
		return vs[0].(map[string]*AppSecCustomRuleAction)[vs[1].(string)]
	}).(AppSecCustomRuleActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecCustomRuleActionInput)(nil)).Elem(), &AppSecCustomRuleAction{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecCustomRuleActionArrayInput)(nil)).Elem(), AppSecCustomRuleActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecCustomRuleActionMapInput)(nil)).Elem(), AppSecCustomRuleActionMap{})
	pulumi.RegisterOutputType(AppSecCustomRuleActionOutput{})
	pulumi.RegisterOutputType(AppSecCustomRuleActionArrayOutput{})
	pulumi.RegisterOutputType(AppSecCustomRuleActionMapOutput{})
}
