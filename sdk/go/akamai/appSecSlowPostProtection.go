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

type AppSecSlowPostProtection struct {
	pulumi.CustomResourceState

	// Unique identifier of the security configuration
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// Whether to enable slow POST protection
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Text representation
	OutputText pulumi.StringOutput `pulumi:"outputText"`
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
}

// NewAppSecSlowPostProtection registers a new resource with the given unique name, arguments, and options.
func NewAppSecSlowPostProtection(ctx *pulumi.Context,
	name string, args *AppSecSlowPostProtectionArgs, opts ...pulumi.ResourceOption) (*AppSecSlowPostProtection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AppSecSlowPostProtection
	err := ctx.RegisterResource("akamai:index/appSecSlowPostProtection:AppSecSlowPostProtection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecSlowPostProtection gets an existing AppSecSlowPostProtection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecSlowPostProtection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecSlowPostProtectionState, opts ...pulumi.ResourceOption) (*AppSecSlowPostProtection, error) {
	var resource AppSecSlowPostProtection
	err := ctx.ReadResource("akamai:index/appSecSlowPostProtection:AppSecSlowPostProtection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecSlowPostProtection resources.
type appSecSlowPostProtectionState struct {
	// Unique identifier of the security configuration
	ConfigId *int `pulumi:"configId"`
	// Whether to enable slow POST protection
	Enabled *bool `pulumi:"enabled"`
	// Text representation
	OutputText *string `pulumi:"outputText"`
	// Unique identifier of the security policy
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
}

type AppSecSlowPostProtectionState struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntPtrInput
	// Whether to enable slow POST protection
	Enabled pulumi.BoolPtrInput
	// Text representation
	OutputText pulumi.StringPtrInput
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringPtrInput
}

func (AppSecSlowPostProtectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecSlowPostProtectionState)(nil)).Elem()
}

type appSecSlowPostProtectionArgs struct {
	// Unique identifier of the security configuration
	ConfigId int `pulumi:"configId"`
	// Whether to enable slow POST protection
	Enabled bool `pulumi:"enabled"`
	// Unique identifier of the security policy
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// The set of arguments for constructing a AppSecSlowPostProtection resource.
type AppSecSlowPostProtectionArgs struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntInput
	// Whether to enable slow POST protection
	Enabled pulumi.BoolInput
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringInput
}

func (AppSecSlowPostProtectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecSlowPostProtectionArgs)(nil)).Elem()
}

type AppSecSlowPostProtectionInput interface {
	pulumi.Input

	ToAppSecSlowPostProtectionOutput() AppSecSlowPostProtectionOutput
	ToAppSecSlowPostProtectionOutputWithContext(ctx context.Context) AppSecSlowPostProtectionOutput
}

func (*AppSecSlowPostProtection) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecSlowPostProtection)(nil)).Elem()
}

func (i *AppSecSlowPostProtection) ToAppSecSlowPostProtectionOutput() AppSecSlowPostProtectionOutput {
	return i.ToAppSecSlowPostProtectionOutputWithContext(context.Background())
}

func (i *AppSecSlowPostProtection) ToAppSecSlowPostProtectionOutputWithContext(ctx context.Context) AppSecSlowPostProtectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecSlowPostProtectionOutput)
}

// AppSecSlowPostProtectionArrayInput is an input type that accepts AppSecSlowPostProtectionArray and AppSecSlowPostProtectionArrayOutput values.
// You can construct a concrete instance of `AppSecSlowPostProtectionArrayInput` via:
//
//	AppSecSlowPostProtectionArray{ AppSecSlowPostProtectionArgs{...} }
type AppSecSlowPostProtectionArrayInput interface {
	pulumi.Input

	ToAppSecSlowPostProtectionArrayOutput() AppSecSlowPostProtectionArrayOutput
	ToAppSecSlowPostProtectionArrayOutputWithContext(context.Context) AppSecSlowPostProtectionArrayOutput
}

type AppSecSlowPostProtectionArray []AppSecSlowPostProtectionInput

func (AppSecSlowPostProtectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecSlowPostProtection)(nil)).Elem()
}

func (i AppSecSlowPostProtectionArray) ToAppSecSlowPostProtectionArrayOutput() AppSecSlowPostProtectionArrayOutput {
	return i.ToAppSecSlowPostProtectionArrayOutputWithContext(context.Background())
}

func (i AppSecSlowPostProtectionArray) ToAppSecSlowPostProtectionArrayOutputWithContext(ctx context.Context) AppSecSlowPostProtectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecSlowPostProtectionArrayOutput)
}

// AppSecSlowPostProtectionMapInput is an input type that accepts AppSecSlowPostProtectionMap and AppSecSlowPostProtectionMapOutput values.
// You can construct a concrete instance of `AppSecSlowPostProtectionMapInput` via:
//
//	AppSecSlowPostProtectionMap{ "key": AppSecSlowPostProtectionArgs{...} }
type AppSecSlowPostProtectionMapInput interface {
	pulumi.Input

	ToAppSecSlowPostProtectionMapOutput() AppSecSlowPostProtectionMapOutput
	ToAppSecSlowPostProtectionMapOutputWithContext(context.Context) AppSecSlowPostProtectionMapOutput
}

type AppSecSlowPostProtectionMap map[string]AppSecSlowPostProtectionInput

func (AppSecSlowPostProtectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecSlowPostProtection)(nil)).Elem()
}

func (i AppSecSlowPostProtectionMap) ToAppSecSlowPostProtectionMapOutput() AppSecSlowPostProtectionMapOutput {
	return i.ToAppSecSlowPostProtectionMapOutputWithContext(context.Background())
}

func (i AppSecSlowPostProtectionMap) ToAppSecSlowPostProtectionMapOutputWithContext(ctx context.Context) AppSecSlowPostProtectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecSlowPostProtectionMapOutput)
}

type AppSecSlowPostProtectionOutput struct{ *pulumi.OutputState }

func (AppSecSlowPostProtectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecSlowPostProtection)(nil)).Elem()
}

func (o AppSecSlowPostProtectionOutput) ToAppSecSlowPostProtectionOutput() AppSecSlowPostProtectionOutput {
	return o
}

func (o AppSecSlowPostProtectionOutput) ToAppSecSlowPostProtectionOutputWithContext(ctx context.Context) AppSecSlowPostProtectionOutput {
	return o
}

// Unique identifier of the security configuration
func (o AppSecSlowPostProtectionOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v *AppSecSlowPostProtection) pulumi.IntOutput { return v.ConfigId }).(pulumi.IntOutput)
}

// Whether to enable slow POST protection
func (o AppSecSlowPostProtectionOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AppSecSlowPostProtection) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Text representation
func (o AppSecSlowPostProtectionOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecSlowPostProtection) pulumi.StringOutput { return v.OutputText }).(pulumi.StringOutput)
}

// Unique identifier of the security policy
func (o AppSecSlowPostProtectionOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecSlowPostProtection) pulumi.StringOutput { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

type AppSecSlowPostProtectionArrayOutput struct{ *pulumi.OutputState }

func (AppSecSlowPostProtectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecSlowPostProtection)(nil)).Elem()
}

func (o AppSecSlowPostProtectionArrayOutput) ToAppSecSlowPostProtectionArrayOutput() AppSecSlowPostProtectionArrayOutput {
	return o
}

func (o AppSecSlowPostProtectionArrayOutput) ToAppSecSlowPostProtectionArrayOutputWithContext(ctx context.Context) AppSecSlowPostProtectionArrayOutput {
	return o
}

func (o AppSecSlowPostProtectionArrayOutput) Index(i pulumi.IntInput) AppSecSlowPostProtectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppSecSlowPostProtection {
		return vs[0].([]*AppSecSlowPostProtection)[vs[1].(int)]
	}).(AppSecSlowPostProtectionOutput)
}

type AppSecSlowPostProtectionMapOutput struct{ *pulumi.OutputState }

func (AppSecSlowPostProtectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecSlowPostProtection)(nil)).Elem()
}

func (o AppSecSlowPostProtectionMapOutput) ToAppSecSlowPostProtectionMapOutput() AppSecSlowPostProtectionMapOutput {
	return o
}

func (o AppSecSlowPostProtectionMapOutput) ToAppSecSlowPostProtectionMapOutputWithContext(ctx context.Context) AppSecSlowPostProtectionMapOutput {
	return o
}

func (o AppSecSlowPostProtectionMapOutput) MapIndex(k pulumi.StringInput) AppSecSlowPostProtectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppSecSlowPostProtection {
		return vs[0].(map[string]*AppSecSlowPostProtection)[vs[1].(string)]
	}).(AppSecSlowPostProtectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecSlowPostProtectionInput)(nil)).Elem(), &AppSecSlowPostProtection{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecSlowPostProtectionArrayInput)(nil)).Elem(), AppSecSlowPostProtectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecSlowPostProtectionMapInput)(nil)).Elem(), AppSecSlowPostProtectionMap{})
	pulumi.RegisterOutputType(AppSecSlowPostProtectionOutput{})
	pulumi.RegisterOutputType(AppSecSlowPostProtectionArrayOutput{})
	pulumi.RegisterOutputType(AppSecSlowPostProtectionMapOutput{})
}
