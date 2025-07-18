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

type BotmanCustomDenyAction struct {
	pulumi.CustomResourceState

	ActionId         pulumi.StringOutput `pulumi:"actionId"`
	ConfigId         pulumi.IntOutput    `pulumi:"configId"`
	CustomDenyAction pulumi.StringOutput `pulumi:"customDenyAction"`
}

// NewBotmanCustomDenyAction registers a new resource with the given unique name, arguments, and options.
func NewBotmanCustomDenyAction(ctx *pulumi.Context,
	name string, args *BotmanCustomDenyActionArgs, opts ...pulumi.ResourceOption) (*BotmanCustomDenyAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.CustomDenyAction == nil {
		return nil, errors.New("invalid value for required argument 'CustomDenyAction'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BotmanCustomDenyAction
	err := ctx.RegisterResource("akamai:index/botmanCustomDenyAction:BotmanCustomDenyAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBotmanCustomDenyAction gets an existing BotmanCustomDenyAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBotmanCustomDenyAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BotmanCustomDenyActionState, opts ...pulumi.ResourceOption) (*BotmanCustomDenyAction, error) {
	var resource BotmanCustomDenyAction
	err := ctx.ReadResource("akamai:index/botmanCustomDenyAction:BotmanCustomDenyAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BotmanCustomDenyAction resources.
type botmanCustomDenyActionState struct {
	ActionId         *string `pulumi:"actionId"`
	ConfigId         *int    `pulumi:"configId"`
	CustomDenyAction *string `pulumi:"customDenyAction"`
}

type BotmanCustomDenyActionState struct {
	ActionId         pulumi.StringPtrInput
	ConfigId         pulumi.IntPtrInput
	CustomDenyAction pulumi.StringPtrInput
}

func (BotmanCustomDenyActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*botmanCustomDenyActionState)(nil)).Elem()
}

type botmanCustomDenyActionArgs struct {
	ConfigId         int    `pulumi:"configId"`
	CustomDenyAction string `pulumi:"customDenyAction"`
}

// The set of arguments for constructing a BotmanCustomDenyAction resource.
type BotmanCustomDenyActionArgs struct {
	ConfigId         pulumi.IntInput
	CustomDenyAction pulumi.StringInput
}

func (BotmanCustomDenyActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*botmanCustomDenyActionArgs)(nil)).Elem()
}

type BotmanCustomDenyActionInput interface {
	pulumi.Input

	ToBotmanCustomDenyActionOutput() BotmanCustomDenyActionOutput
	ToBotmanCustomDenyActionOutputWithContext(ctx context.Context) BotmanCustomDenyActionOutput
}

func (*BotmanCustomDenyAction) ElementType() reflect.Type {
	return reflect.TypeOf((**BotmanCustomDenyAction)(nil)).Elem()
}

func (i *BotmanCustomDenyAction) ToBotmanCustomDenyActionOutput() BotmanCustomDenyActionOutput {
	return i.ToBotmanCustomDenyActionOutputWithContext(context.Background())
}

func (i *BotmanCustomDenyAction) ToBotmanCustomDenyActionOutputWithContext(ctx context.Context) BotmanCustomDenyActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BotmanCustomDenyActionOutput)
}

// BotmanCustomDenyActionArrayInput is an input type that accepts BotmanCustomDenyActionArray and BotmanCustomDenyActionArrayOutput values.
// You can construct a concrete instance of `BotmanCustomDenyActionArrayInput` via:
//
//	BotmanCustomDenyActionArray{ BotmanCustomDenyActionArgs{...} }
type BotmanCustomDenyActionArrayInput interface {
	pulumi.Input

	ToBotmanCustomDenyActionArrayOutput() BotmanCustomDenyActionArrayOutput
	ToBotmanCustomDenyActionArrayOutputWithContext(context.Context) BotmanCustomDenyActionArrayOutput
}

type BotmanCustomDenyActionArray []BotmanCustomDenyActionInput

func (BotmanCustomDenyActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BotmanCustomDenyAction)(nil)).Elem()
}

func (i BotmanCustomDenyActionArray) ToBotmanCustomDenyActionArrayOutput() BotmanCustomDenyActionArrayOutput {
	return i.ToBotmanCustomDenyActionArrayOutputWithContext(context.Background())
}

func (i BotmanCustomDenyActionArray) ToBotmanCustomDenyActionArrayOutputWithContext(ctx context.Context) BotmanCustomDenyActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BotmanCustomDenyActionArrayOutput)
}

// BotmanCustomDenyActionMapInput is an input type that accepts BotmanCustomDenyActionMap and BotmanCustomDenyActionMapOutput values.
// You can construct a concrete instance of `BotmanCustomDenyActionMapInput` via:
//
//	BotmanCustomDenyActionMap{ "key": BotmanCustomDenyActionArgs{...} }
type BotmanCustomDenyActionMapInput interface {
	pulumi.Input

	ToBotmanCustomDenyActionMapOutput() BotmanCustomDenyActionMapOutput
	ToBotmanCustomDenyActionMapOutputWithContext(context.Context) BotmanCustomDenyActionMapOutput
}

type BotmanCustomDenyActionMap map[string]BotmanCustomDenyActionInput

func (BotmanCustomDenyActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BotmanCustomDenyAction)(nil)).Elem()
}

func (i BotmanCustomDenyActionMap) ToBotmanCustomDenyActionMapOutput() BotmanCustomDenyActionMapOutput {
	return i.ToBotmanCustomDenyActionMapOutputWithContext(context.Background())
}

func (i BotmanCustomDenyActionMap) ToBotmanCustomDenyActionMapOutputWithContext(ctx context.Context) BotmanCustomDenyActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BotmanCustomDenyActionMapOutput)
}

type BotmanCustomDenyActionOutput struct{ *pulumi.OutputState }

func (BotmanCustomDenyActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BotmanCustomDenyAction)(nil)).Elem()
}

func (o BotmanCustomDenyActionOutput) ToBotmanCustomDenyActionOutput() BotmanCustomDenyActionOutput {
	return o
}

func (o BotmanCustomDenyActionOutput) ToBotmanCustomDenyActionOutputWithContext(ctx context.Context) BotmanCustomDenyActionOutput {
	return o
}

func (o BotmanCustomDenyActionOutput) ActionId() pulumi.StringOutput {
	return o.ApplyT(func(v *BotmanCustomDenyAction) pulumi.StringOutput { return v.ActionId }).(pulumi.StringOutput)
}

func (o BotmanCustomDenyActionOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v *BotmanCustomDenyAction) pulumi.IntOutput { return v.ConfigId }).(pulumi.IntOutput)
}

func (o BotmanCustomDenyActionOutput) CustomDenyAction() pulumi.StringOutput {
	return o.ApplyT(func(v *BotmanCustomDenyAction) pulumi.StringOutput { return v.CustomDenyAction }).(pulumi.StringOutput)
}

type BotmanCustomDenyActionArrayOutput struct{ *pulumi.OutputState }

func (BotmanCustomDenyActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BotmanCustomDenyAction)(nil)).Elem()
}

func (o BotmanCustomDenyActionArrayOutput) ToBotmanCustomDenyActionArrayOutput() BotmanCustomDenyActionArrayOutput {
	return o
}

func (o BotmanCustomDenyActionArrayOutput) ToBotmanCustomDenyActionArrayOutputWithContext(ctx context.Context) BotmanCustomDenyActionArrayOutput {
	return o
}

func (o BotmanCustomDenyActionArrayOutput) Index(i pulumi.IntInput) BotmanCustomDenyActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BotmanCustomDenyAction {
		return vs[0].([]*BotmanCustomDenyAction)[vs[1].(int)]
	}).(BotmanCustomDenyActionOutput)
}

type BotmanCustomDenyActionMapOutput struct{ *pulumi.OutputState }

func (BotmanCustomDenyActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BotmanCustomDenyAction)(nil)).Elem()
}

func (o BotmanCustomDenyActionMapOutput) ToBotmanCustomDenyActionMapOutput() BotmanCustomDenyActionMapOutput {
	return o
}

func (o BotmanCustomDenyActionMapOutput) ToBotmanCustomDenyActionMapOutputWithContext(ctx context.Context) BotmanCustomDenyActionMapOutput {
	return o
}

func (o BotmanCustomDenyActionMapOutput) MapIndex(k pulumi.StringInput) BotmanCustomDenyActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BotmanCustomDenyAction {
		return vs[0].(map[string]*BotmanCustomDenyAction)[vs[1].(string)]
	}).(BotmanCustomDenyActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BotmanCustomDenyActionInput)(nil)).Elem(), &BotmanCustomDenyAction{})
	pulumi.RegisterInputType(reflect.TypeOf((*BotmanCustomDenyActionArrayInput)(nil)).Elem(), BotmanCustomDenyActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BotmanCustomDenyActionMapInput)(nil)).Elem(), BotmanCustomDenyActionMap{})
	pulumi.RegisterOutputType(BotmanCustomDenyActionOutput{})
	pulumi.RegisterOutputType(BotmanCustomDenyActionArrayOutput{})
	pulumi.RegisterOutputType(BotmanCustomDenyActionMapOutput{})
}
