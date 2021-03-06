// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `AppSecPenaltyBox` resource to update the penalty box settings for a given security policy.
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-akamai/sdk/v2/go/akamai"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := _var.Security_configuration
// 		configuration, err := akamai.LookupAppSecConfiguration(ctx, &akamai.LookupAppSecConfigurationArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = akamai.NewAppSecPenaltyBox(ctx, "penaltyBox", &akamai.AppSecPenaltyBoxArgs{
// 			ConfigId:             pulumi.Int(configuration.ConfigId),
// 			Version:              pulumi.Int(configuration.LatestVersion),
// 			SecurityPolicyId:     pulumi.Any(_var.Security_policy_id),
// 			PenaltyBoxProtection: pulumi.Bool(true),
// 			PenaltyBoxAction:     pulumi.Any(_var.Action),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AppSecPenaltyBox struct {
	pulumi.CustomResourceState

	// The ID of the security configuration to use.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// The action to take when penalty box protection is triggered: `alert` to record the trigger event, `deny` to block the request, `deny_custom_{custom_deny_id}` to execute a custom deny action, or `none` to take no action. Ignored if `penaltyBoxProtection` is set to `false`.
	PenaltyBoxAction pulumi.StringOutput `pulumi:"penaltyBoxAction"`
	// A boolean value indicating whether to enable penalty box protection.
	PenaltyBoxProtection pulumi.BoolOutput `pulumi:"penaltyBoxProtection"`
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewAppSecPenaltyBox registers a new resource with the given unique name, arguments, and options.
func NewAppSecPenaltyBox(ctx *pulumi.Context,
	name string, args *AppSecPenaltyBoxArgs, opts ...pulumi.ResourceOption) (*AppSecPenaltyBox, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.PenaltyBoxAction == nil {
		return nil, errors.New("invalid value for required argument 'PenaltyBoxAction'")
	}
	if args.PenaltyBoxProtection == nil {
		return nil, errors.New("invalid value for required argument 'PenaltyBoxProtection'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	var resource AppSecPenaltyBox
	err := ctx.RegisterResource("akamai:index/appSecPenaltyBox:AppSecPenaltyBox", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecPenaltyBox gets an existing AppSecPenaltyBox resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecPenaltyBox(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecPenaltyBoxState, opts ...pulumi.ResourceOption) (*AppSecPenaltyBox, error) {
	var resource AppSecPenaltyBox
	err := ctx.ReadResource("akamai:index/appSecPenaltyBox:AppSecPenaltyBox", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecPenaltyBox resources.
type appSecPenaltyBoxState struct {
	// The ID of the security configuration to use.
	ConfigId *int `pulumi:"configId"`
	// The action to take when penalty box protection is triggered: `alert` to record the trigger event, `deny` to block the request, `deny_custom_{custom_deny_id}` to execute a custom deny action, or `none` to take no action. Ignored if `penaltyBoxProtection` is set to `false`.
	PenaltyBoxAction *string `pulumi:"penaltyBoxAction"`
	// A boolean value indicating whether to enable penalty box protection.
	PenaltyBoxProtection *bool `pulumi:"penaltyBoxProtection"`
	// The ID of the security policy to use.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version *int `pulumi:"version"`
}

type AppSecPenaltyBoxState struct {
	// The ID of the security configuration to use.
	ConfigId pulumi.IntPtrInput
	// The action to take when penalty box protection is triggered: `alert` to record the trigger event, `deny` to block the request, `deny_custom_{custom_deny_id}` to execute a custom deny action, or `none` to take no action. Ignored if `penaltyBoxProtection` is set to `false`.
	PenaltyBoxAction pulumi.StringPtrInput
	// A boolean value indicating whether to enable penalty box protection.
	PenaltyBoxProtection pulumi.BoolPtrInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringPtrInput
	// The version number of the security configuration to use.
	Version pulumi.IntPtrInput
}

func (AppSecPenaltyBoxState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecPenaltyBoxState)(nil)).Elem()
}

type appSecPenaltyBoxArgs struct {
	// The ID of the security configuration to use.
	ConfigId int `pulumi:"configId"`
	// The action to take when penalty box protection is triggered: `alert` to record the trigger event, `deny` to block the request, `deny_custom_{custom_deny_id}` to execute a custom deny action, or `none` to take no action. Ignored if `penaltyBoxProtection` is set to `false`.
	PenaltyBoxAction string `pulumi:"penaltyBoxAction"`
	// A boolean value indicating whether to enable penalty box protection.
	PenaltyBoxProtection bool `pulumi:"penaltyBoxProtection"`
	// The ID of the security policy to use.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version int `pulumi:"version"`
}

// The set of arguments for constructing a AppSecPenaltyBox resource.
type AppSecPenaltyBoxArgs struct {
	// The ID of the security configuration to use.
	ConfigId pulumi.IntInput
	// The action to take when penalty box protection is triggered: `alert` to record the trigger event, `deny` to block the request, `deny_custom_{custom_deny_id}` to execute a custom deny action, or `none` to take no action. Ignored if `penaltyBoxProtection` is set to `false`.
	PenaltyBoxAction pulumi.StringInput
	// A boolean value indicating whether to enable penalty box protection.
	PenaltyBoxProtection pulumi.BoolInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringInput
	// The version number of the security configuration to use.
	Version pulumi.IntInput
}

func (AppSecPenaltyBoxArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecPenaltyBoxArgs)(nil)).Elem()
}

type AppSecPenaltyBoxInput interface {
	pulumi.Input

	ToAppSecPenaltyBoxOutput() AppSecPenaltyBoxOutput
	ToAppSecPenaltyBoxOutputWithContext(ctx context.Context) AppSecPenaltyBoxOutput
}

func (*AppSecPenaltyBox) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecPenaltyBox)(nil))
}

func (i *AppSecPenaltyBox) ToAppSecPenaltyBoxOutput() AppSecPenaltyBoxOutput {
	return i.ToAppSecPenaltyBoxOutputWithContext(context.Background())
}

func (i *AppSecPenaltyBox) ToAppSecPenaltyBoxOutputWithContext(ctx context.Context) AppSecPenaltyBoxOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecPenaltyBoxOutput)
}

func (i *AppSecPenaltyBox) ToAppSecPenaltyBoxPtrOutput() AppSecPenaltyBoxPtrOutput {
	return i.ToAppSecPenaltyBoxPtrOutputWithContext(context.Background())
}

func (i *AppSecPenaltyBox) ToAppSecPenaltyBoxPtrOutputWithContext(ctx context.Context) AppSecPenaltyBoxPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecPenaltyBoxPtrOutput)
}

type AppSecPenaltyBoxPtrInput interface {
	pulumi.Input

	ToAppSecPenaltyBoxPtrOutput() AppSecPenaltyBoxPtrOutput
	ToAppSecPenaltyBoxPtrOutputWithContext(ctx context.Context) AppSecPenaltyBoxPtrOutput
}

type appSecPenaltyBoxPtrType AppSecPenaltyBoxArgs

func (*appSecPenaltyBoxPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecPenaltyBox)(nil))
}

func (i *appSecPenaltyBoxPtrType) ToAppSecPenaltyBoxPtrOutput() AppSecPenaltyBoxPtrOutput {
	return i.ToAppSecPenaltyBoxPtrOutputWithContext(context.Background())
}

func (i *appSecPenaltyBoxPtrType) ToAppSecPenaltyBoxPtrOutputWithContext(ctx context.Context) AppSecPenaltyBoxPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecPenaltyBoxPtrOutput)
}

// AppSecPenaltyBoxArrayInput is an input type that accepts AppSecPenaltyBoxArray and AppSecPenaltyBoxArrayOutput values.
// You can construct a concrete instance of `AppSecPenaltyBoxArrayInput` via:
//
//          AppSecPenaltyBoxArray{ AppSecPenaltyBoxArgs{...} }
type AppSecPenaltyBoxArrayInput interface {
	pulumi.Input

	ToAppSecPenaltyBoxArrayOutput() AppSecPenaltyBoxArrayOutput
	ToAppSecPenaltyBoxArrayOutputWithContext(context.Context) AppSecPenaltyBoxArrayOutput
}

type AppSecPenaltyBoxArray []AppSecPenaltyBoxInput

func (AppSecPenaltyBoxArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AppSecPenaltyBox)(nil))
}

func (i AppSecPenaltyBoxArray) ToAppSecPenaltyBoxArrayOutput() AppSecPenaltyBoxArrayOutput {
	return i.ToAppSecPenaltyBoxArrayOutputWithContext(context.Background())
}

func (i AppSecPenaltyBoxArray) ToAppSecPenaltyBoxArrayOutputWithContext(ctx context.Context) AppSecPenaltyBoxArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecPenaltyBoxArrayOutput)
}

// AppSecPenaltyBoxMapInput is an input type that accepts AppSecPenaltyBoxMap and AppSecPenaltyBoxMapOutput values.
// You can construct a concrete instance of `AppSecPenaltyBoxMapInput` via:
//
//          AppSecPenaltyBoxMap{ "key": AppSecPenaltyBoxArgs{...} }
type AppSecPenaltyBoxMapInput interface {
	pulumi.Input

	ToAppSecPenaltyBoxMapOutput() AppSecPenaltyBoxMapOutput
	ToAppSecPenaltyBoxMapOutputWithContext(context.Context) AppSecPenaltyBoxMapOutput
}

type AppSecPenaltyBoxMap map[string]AppSecPenaltyBoxInput

func (AppSecPenaltyBoxMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AppSecPenaltyBox)(nil))
}

func (i AppSecPenaltyBoxMap) ToAppSecPenaltyBoxMapOutput() AppSecPenaltyBoxMapOutput {
	return i.ToAppSecPenaltyBoxMapOutputWithContext(context.Background())
}

func (i AppSecPenaltyBoxMap) ToAppSecPenaltyBoxMapOutputWithContext(ctx context.Context) AppSecPenaltyBoxMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecPenaltyBoxMapOutput)
}

type AppSecPenaltyBoxOutput struct {
	*pulumi.OutputState
}

func (AppSecPenaltyBoxOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecPenaltyBox)(nil))
}

func (o AppSecPenaltyBoxOutput) ToAppSecPenaltyBoxOutput() AppSecPenaltyBoxOutput {
	return o
}

func (o AppSecPenaltyBoxOutput) ToAppSecPenaltyBoxOutputWithContext(ctx context.Context) AppSecPenaltyBoxOutput {
	return o
}

func (o AppSecPenaltyBoxOutput) ToAppSecPenaltyBoxPtrOutput() AppSecPenaltyBoxPtrOutput {
	return o.ToAppSecPenaltyBoxPtrOutputWithContext(context.Background())
}

func (o AppSecPenaltyBoxOutput) ToAppSecPenaltyBoxPtrOutputWithContext(ctx context.Context) AppSecPenaltyBoxPtrOutput {
	return o.ApplyT(func(v AppSecPenaltyBox) *AppSecPenaltyBox {
		return &v
	}).(AppSecPenaltyBoxPtrOutput)
}

type AppSecPenaltyBoxPtrOutput struct {
	*pulumi.OutputState
}

func (AppSecPenaltyBoxPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecPenaltyBox)(nil))
}

func (o AppSecPenaltyBoxPtrOutput) ToAppSecPenaltyBoxPtrOutput() AppSecPenaltyBoxPtrOutput {
	return o
}

func (o AppSecPenaltyBoxPtrOutput) ToAppSecPenaltyBoxPtrOutputWithContext(ctx context.Context) AppSecPenaltyBoxPtrOutput {
	return o
}

type AppSecPenaltyBoxArrayOutput struct{ *pulumi.OutputState }

func (AppSecPenaltyBoxArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppSecPenaltyBox)(nil))
}

func (o AppSecPenaltyBoxArrayOutput) ToAppSecPenaltyBoxArrayOutput() AppSecPenaltyBoxArrayOutput {
	return o
}

func (o AppSecPenaltyBoxArrayOutput) ToAppSecPenaltyBoxArrayOutputWithContext(ctx context.Context) AppSecPenaltyBoxArrayOutput {
	return o
}

func (o AppSecPenaltyBoxArrayOutput) Index(i pulumi.IntInput) AppSecPenaltyBoxOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppSecPenaltyBox {
		return vs[0].([]AppSecPenaltyBox)[vs[1].(int)]
	}).(AppSecPenaltyBoxOutput)
}

type AppSecPenaltyBoxMapOutput struct{ *pulumi.OutputState }

func (AppSecPenaltyBoxMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AppSecPenaltyBox)(nil))
}

func (o AppSecPenaltyBoxMapOutput) ToAppSecPenaltyBoxMapOutput() AppSecPenaltyBoxMapOutput {
	return o
}

func (o AppSecPenaltyBoxMapOutput) ToAppSecPenaltyBoxMapOutputWithContext(ctx context.Context) AppSecPenaltyBoxMapOutput {
	return o
}

func (o AppSecPenaltyBoxMapOutput) MapIndex(k pulumi.StringInput) AppSecPenaltyBoxOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AppSecPenaltyBox {
		return vs[0].(map[string]AppSecPenaltyBox)[vs[1].(string)]
	}).(AppSecPenaltyBoxOutput)
}

func init() {
	pulumi.RegisterOutputType(AppSecPenaltyBoxOutput{})
	pulumi.RegisterOutputType(AppSecPenaltyBoxPtrOutput{})
	pulumi.RegisterOutputType(AppSecPenaltyBoxArrayOutput{})
	pulumi.RegisterOutputType(AppSecPenaltyBoxMapOutput{})
}
