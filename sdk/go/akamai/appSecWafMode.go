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

type AppSecWafMode struct {
	pulumi.CustomResourceState

	// Unique identifier of the security configuration
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// Versioning information for the current Kona Rule Set
	CurrentRuleset pulumi.StringOutput `pulumi:"currentRuleset"`
	// Date on which the evaluation period ends, if applicable
	EvalExpirationDate pulumi.StringOutput `pulumi:"evalExpirationDate"`
	// Versioning information for the Kona Rule Set being evaluated, if applicable
	EvalRuleset pulumi.StringOutput `pulumi:"evalRuleset"`
	// Whether an evaluation is currently in progress
	EvalStatus pulumi.StringOutput `pulumi:"evalStatus"`
	// How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
	Mode pulumi.StringOutput `pulumi:"mode"`
	// Text representation
	OutputText pulumi.StringOutput `pulumi:"outputText"`
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
}

// NewAppSecWafMode registers a new resource with the given unique name, arguments, and options.
func NewAppSecWafMode(ctx *pulumi.Context,
	name string, args *AppSecWafModeArgs, opts ...pulumi.ResourceOption) (*AppSecWafMode, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.Mode == nil {
		return nil, errors.New("invalid value for required argument 'Mode'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AppSecWafMode
	err := ctx.RegisterResource("akamai:index/appSecWafMode:AppSecWafMode", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecWafMode gets an existing AppSecWafMode resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecWafMode(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecWafModeState, opts ...pulumi.ResourceOption) (*AppSecWafMode, error) {
	var resource AppSecWafMode
	err := ctx.ReadResource("akamai:index/appSecWafMode:AppSecWafMode", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecWafMode resources.
type appSecWafModeState struct {
	// Unique identifier of the security configuration
	ConfigId *int `pulumi:"configId"`
	// Versioning information for the current Kona Rule Set
	CurrentRuleset *string `pulumi:"currentRuleset"`
	// Date on which the evaluation period ends, if applicable
	EvalExpirationDate *string `pulumi:"evalExpirationDate"`
	// Versioning information for the Kona Rule Set being evaluated, if applicable
	EvalRuleset *string `pulumi:"evalRuleset"`
	// Whether an evaluation is currently in progress
	EvalStatus *string `pulumi:"evalStatus"`
	// How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
	Mode *string `pulumi:"mode"`
	// Text representation
	OutputText *string `pulumi:"outputText"`
	// Unique identifier of the security policy
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
}

type AppSecWafModeState struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntPtrInput
	// Versioning information for the current Kona Rule Set
	CurrentRuleset pulumi.StringPtrInput
	// Date on which the evaluation period ends, if applicable
	EvalExpirationDate pulumi.StringPtrInput
	// Versioning information for the Kona Rule Set being evaluated, if applicable
	EvalRuleset pulumi.StringPtrInput
	// Whether an evaluation is currently in progress
	EvalStatus pulumi.StringPtrInput
	// How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
	Mode pulumi.StringPtrInput
	// Text representation
	OutputText pulumi.StringPtrInput
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringPtrInput
}

func (AppSecWafModeState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecWafModeState)(nil)).Elem()
}

type appSecWafModeArgs struct {
	// Unique identifier of the security configuration
	ConfigId int `pulumi:"configId"`
	// How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
	Mode string `pulumi:"mode"`
	// Unique identifier of the security policy
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// The set of arguments for constructing a AppSecWafMode resource.
type AppSecWafModeArgs struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntInput
	// How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
	Mode pulumi.StringInput
	// Unique identifier of the security policy
	SecurityPolicyId pulumi.StringInput
}

func (AppSecWafModeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecWafModeArgs)(nil)).Elem()
}

type AppSecWafModeInput interface {
	pulumi.Input

	ToAppSecWafModeOutput() AppSecWafModeOutput
	ToAppSecWafModeOutputWithContext(ctx context.Context) AppSecWafModeOutput
}

func (*AppSecWafMode) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecWafMode)(nil)).Elem()
}

func (i *AppSecWafMode) ToAppSecWafModeOutput() AppSecWafModeOutput {
	return i.ToAppSecWafModeOutputWithContext(context.Background())
}

func (i *AppSecWafMode) ToAppSecWafModeOutputWithContext(ctx context.Context) AppSecWafModeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWafModeOutput)
}

// AppSecWafModeArrayInput is an input type that accepts AppSecWafModeArray and AppSecWafModeArrayOutput values.
// You can construct a concrete instance of `AppSecWafModeArrayInput` via:
//
//	AppSecWafModeArray{ AppSecWafModeArgs{...} }
type AppSecWafModeArrayInput interface {
	pulumi.Input

	ToAppSecWafModeArrayOutput() AppSecWafModeArrayOutput
	ToAppSecWafModeArrayOutputWithContext(context.Context) AppSecWafModeArrayOutput
}

type AppSecWafModeArray []AppSecWafModeInput

func (AppSecWafModeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecWafMode)(nil)).Elem()
}

func (i AppSecWafModeArray) ToAppSecWafModeArrayOutput() AppSecWafModeArrayOutput {
	return i.ToAppSecWafModeArrayOutputWithContext(context.Background())
}

func (i AppSecWafModeArray) ToAppSecWafModeArrayOutputWithContext(ctx context.Context) AppSecWafModeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWafModeArrayOutput)
}

// AppSecWafModeMapInput is an input type that accepts AppSecWafModeMap and AppSecWafModeMapOutput values.
// You can construct a concrete instance of `AppSecWafModeMapInput` via:
//
//	AppSecWafModeMap{ "key": AppSecWafModeArgs{...} }
type AppSecWafModeMapInput interface {
	pulumi.Input

	ToAppSecWafModeMapOutput() AppSecWafModeMapOutput
	ToAppSecWafModeMapOutputWithContext(context.Context) AppSecWafModeMapOutput
}

type AppSecWafModeMap map[string]AppSecWafModeInput

func (AppSecWafModeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecWafMode)(nil)).Elem()
}

func (i AppSecWafModeMap) ToAppSecWafModeMapOutput() AppSecWafModeMapOutput {
	return i.ToAppSecWafModeMapOutputWithContext(context.Background())
}

func (i AppSecWafModeMap) ToAppSecWafModeMapOutputWithContext(ctx context.Context) AppSecWafModeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWafModeMapOutput)
}

type AppSecWafModeOutput struct{ *pulumi.OutputState }

func (AppSecWafModeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecWafMode)(nil)).Elem()
}

func (o AppSecWafModeOutput) ToAppSecWafModeOutput() AppSecWafModeOutput {
	return o
}

func (o AppSecWafModeOutput) ToAppSecWafModeOutputWithContext(ctx context.Context) AppSecWafModeOutput {
	return o
}

// Unique identifier of the security configuration
func (o AppSecWafModeOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.IntOutput { return v.ConfigId }).(pulumi.IntOutput)
}

// Versioning information for the current Kona Rule Set
func (o AppSecWafModeOutput) CurrentRuleset() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.StringOutput { return v.CurrentRuleset }).(pulumi.StringOutput)
}

// Date on which the evaluation period ends, if applicable
func (o AppSecWafModeOutput) EvalExpirationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.StringOutput { return v.EvalExpirationDate }).(pulumi.StringOutput)
}

// Versioning information for the Kona Rule Set being evaluated, if applicable
func (o AppSecWafModeOutput) EvalRuleset() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.StringOutput { return v.EvalRuleset }).(pulumi.StringOutput)
}

// Whether an evaluation is currently in progress
func (o AppSecWafModeOutput) EvalStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.StringOutput { return v.EvalStatus }).(pulumi.StringOutput)
}

// How Kona Rule Set rules should be upgraded (KRS, AAG, ASE_MANUAL or ASE_AUTO)
func (o AppSecWafModeOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// Text representation
func (o AppSecWafModeOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.StringOutput { return v.OutputText }).(pulumi.StringOutput)
}

// Unique identifier of the security policy
func (o AppSecWafModeOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecWafMode) pulumi.StringOutput { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

type AppSecWafModeArrayOutput struct{ *pulumi.OutputState }

func (AppSecWafModeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecWafMode)(nil)).Elem()
}

func (o AppSecWafModeArrayOutput) ToAppSecWafModeArrayOutput() AppSecWafModeArrayOutput {
	return o
}

func (o AppSecWafModeArrayOutput) ToAppSecWafModeArrayOutputWithContext(ctx context.Context) AppSecWafModeArrayOutput {
	return o
}

func (o AppSecWafModeArrayOutput) Index(i pulumi.IntInput) AppSecWafModeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppSecWafMode {
		return vs[0].([]*AppSecWafMode)[vs[1].(int)]
	}).(AppSecWafModeOutput)
}

type AppSecWafModeMapOutput struct{ *pulumi.OutputState }

func (AppSecWafModeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecWafMode)(nil)).Elem()
}

func (o AppSecWafModeMapOutput) ToAppSecWafModeMapOutput() AppSecWafModeMapOutput {
	return o
}

func (o AppSecWafModeMapOutput) ToAppSecWafModeMapOutputWithContext(ctx context.Context) AppSecWafModeMapOutput {
	return o
}

func (o AppSecWafModeMapOutput) MapIndex(k pulumi.StringInput) AppSecWafModeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppSecWafMode {
		return vs[0].(map[string]*AppSecWafMode)[vs[1].(string)]
	}).(AppSecWafModeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecWafModeInput)(nil)).Elem(), &AppSecWafMode{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecWafModeArrayInput)(nil)).Elem(), AppSecWafModeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecWafModeMapInput)(nil)).Elem(), AppSecWafModeMap{})
	pulumi.RegisterOutputType(AppSecWafModeOutput{})
	pulumi.RegisterOutputType(AppSecWafModeArrayOutput{})
	pulumi.RegisterOutputType(AppSecWafModeMapOutput{})
}
