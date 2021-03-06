// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `AppSecWafMode` resource to specify how your rule sets are updated. Use KRS mode to update the rule sets manually, or AAG to have them update automatically.
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
// 		wafMode, err := akamai.NewAppSecWafMode(ctx, "wafMode", &akamai.AppSecWafModeArgs{
// 			ConfigId:         pulumi.Int(configuration.ConfigId),
// 			Version:          pulumi.Int(configuration.LatestVersion),
// 			SecurityPolicyId: pulumi.Any(_var.Policy_id),
// 			Mode:             pulumi.Any(_var.Mode),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("wafModeMode", wafMode.Mode)
// 		ctx.Export("wafModeCurrentRuleset", wafMode.CurrentRuleset)
// 		ctx.Export("wafModeEvalStatus", wafMode.EvalStatus)
// 		ctx.Export("wafModeEvalRuleset", wafMode.EvalRuleset)
// 		ctx.Export("wafModeEvalExpirationDate", wafMode.EvalExpirationDate)
// 		return nil
// 	})
// }
// ```
type AppSecWafMode struct {
	pulumi.CustomResourceState

	// The ID of the security configuration to use.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// The current rule set.
	CurrentRuleset pulumi.StringOutput `pulumi:"currentRuleset"`
	// The date on which the evaluation period ends.
	EvalExpirationDate pulumi.StringOutput `pulumi:"evalExpirationDate"`
	// The rule set being evaluated if any.
	EvalRuleset pulumi.StringOutput `pulumi:"evalRuleset"`
	// Either `enabled` if an evaluation is currently in progress, or `disabled` otherwise.
	EvalStatus pulumi.StringOutput `pulumi:"evalStatus"`
	// "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// A tabular display showing the current rule set, WAF mode and evaluation status (`enabled` if a rule set is currently being evaluated, `disabled` otherwise).
	OutputText pulumi.StringOutput `pulumi:"outputText"`
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version pulumi.IntOutput `pulumi:"version"`
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
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
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
	// The ID of the security configuration to use.
	ConfigId *int `pulumi:"configId"`
	// The current rule set.
	CurrentRuleset *string `pulumi:"currentRuleset"`
	// The date on which the evaluation period ends.
	EvalExpirationDate *string `pulumi:"evalExpirationDate"`
	// The rule set being evaluated if any.
	EvalRuleset *string `pulumi:"evalRuleset"`
	// Either `enabled` if an evaluation is currently in progress, or `disabled` otherwise.
	EvalStatus *string `pulumi:"evalStatus"`
	// "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
	Mode *string `pulumi:"mode"`
	// A tabular display showing the current rule set, WAF mode and evaluation status (`enabled` if a rule set is currently being evaluated, `disabled` otherwise).
	OutputText *string `pulumi:"outputText"`
	// The ID of the security policy to use.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version *int `pulumi:"version"`
}

type AppSecWafModeState struct {
	// The ID of the security configuration to use.
	ConfigId pulumi.IntPtrInput
	// The current rule set.
	CurrentRuleset pulumi.StringPtrInput
	// The date on which the evaluation period ends.
	EvalExpirationDate pulumi.StringPtrInput
	// The rule set being evaluated if any.
	EvalRuleset pulumi.StringPtrInput
	// Either `enabled` if an evaluation is currently in progress, or `disabled` otherwise.
	EvalStatus pulumi.StringPtrInput
	// "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
	Mode pulumi.StringPtrInput
	// A tabular display showing the current rule set, WAF mode and evaluation status (`enabled` if a rule set is currently being evaluated, `disabled` otherwise).
	OutputText pulumi.StringPtrInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringPtrInput
	// The version number of the security configuration to use.
	Version pulumi.IntPtrInput
}

func (AppSecWafModeState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecWafModeState)(nil)).Elem()
}

type appSecWafModeArgs struct {
	// The ID of the security configuration to use.
	ConfigId int `pulumi:"configId"`
	// "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
	Mode string `pulumi:"mode"`
	// The ID of the security policy to use.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version int `pulumi:"version"`
}

// The set of arguments for constructing a AppSecWafMode resource.
type AppSecWafModeArgs struct {
	// The ID of the security configuration to use.
	ConfigId pulumi.IntInput
	// "KRS" to update the rule sets manually, or "AAG" to have them update automatically.
	Mode pulumi.StringInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringInput
	// The version number of the security configuration to use.
	Version pulumi.IntInput
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
	return reflect.TypeOf((*AppSecWafMode)(nil))
}

func (i *AppSecWafMode) ToAppSecWafModeOutput() AppSecWafModeOutput {
	return i.ToAppSecWafModeOutputWithContext(context.Background())
}

func (i *AppSecWafMode) ToAppSecWafModeOutputWithContext(ctx context.Context) AppSecWafModeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWafModeOutput)
}

func (i *AppSecWafMode) ToAppSecWafModePtrOutput() AppSecWafModePtrOutput {
	return i.ToAppSecWafModePtrOutputWithContext(context.Background())
}

func (i *AppSecWafMode) ToAppSecWafModePtrOutputWithContext(ctx context.Context) AppSecWafModePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWafModePtrOutput)
}

type AppSecWafModePtrInput interface {
	pulumi.Input

	ToAppSecWafModePtrOutput() AppSecWafModePtrOutput
	ToAppSecWafModePtrOutputWithContext(ctx context.Context) AppSecWafModePtrOutput
}

type appSecWafModePtrType AppSecWafModeArgs

func (*appSecWafModePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecWafMode)(nil))
}

func (i *appSecWafModePtrType) ToAppSecWafModePtrOutput() AppSecWafModePtrOutput {
	return i.ToAppSecWafModePtrOutputWithContext(context.Background())
}

func (i *appSecWafModePtrType) ToAppSecWafModePtrOutputWithContext(ctx context.Context) AppSecWafModePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWafModePtrOutput)
}

// AppSecWafModeArrayInput is an input type that accepts AppSecWafModeArray and AppSecWafModeArrayOutput values.
// You can construct a concrete instance of `AppSecWafModeArrayInput` via:
//
//          AppSecWafModeArray{ AppSecWafModeArgs{...} }
type AppSecWafModeArrayInput interface {
	pulumi.Input

	ToAppSecWafModeArrayOutput() AppSecWafModeArrayOutput
	ToAppSecWafModeArrayOutputWithContext(context.Context) AppSecWafModeArrayOutput
}

type AppSecWafModeArray []AppSecWafModeInput

func (AppSecWafModeArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AppSecWafMode)(nil))
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
//          AppSecWafModeMap{ "key": AppSecWafModeArgs{...} }
type AppSecWafModeMapInput interface {
	pulumi.Input

	ToAppSecWafModeMapOutput() AppSecWafModeMapOutput
	ToAppSecWafModeMapOutputWithContext(context.Context) AppSecWafModeMapOutput
}

type AppSecWafModeMap map[string]AppSecWafModeInput

func (AppSecWafModeMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AppSecWafMode)(nil))
}

func (i AppSecWafModeMap) ToAppSecWafModeMapOutput() AppSecWafModeMapOutput {
	return i.ToAppSecWafModeMapOutputWithContext(context.Background())
}

func (i AppSecWafModeMap) ToAppSecWafModeMapOutputWithContext(ctx context.Context) AppSecWafModeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecWafModeMapOutput)
}

type AppSecWafModeOutput struct {
	*pulumi.OutputState
}

func (AppSecWafModeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecWafMode)(nil))
}

func (o AppSecWafModeOutput) ToAppSecWafModeOutput() AppSecWafModeOutput {
	return o
}

func (o AppSecWafModeOutput) ToAppSecWafModeOutputWithContext(ctx context.Context) AppSecWafModeOutput {
	return o
}

func (o AppSecWafModeOutput) ToAppSecWafModePtrOutput() AppSecWafModePtrOutput {
	return o.ToAppSecWafModePtrOutputWithContext(context.Background())
}

func (o AppSecWafModeOutput) ToAppSecWafModePtrOutputWithContext(ctx context.Context) AppSecWafModePtrOutput {
	return o.ApplyT(func(v AppSecWafMode) *AppSecWafMode {
		return &v
	}).(AppSecWafModePtrOutput)
}

type AppSecWafModePtrOutput struct {
	*pulumi.OutputState
}

func (AppSecWafModePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecWafMode)(nil))
}

func (o AppSecWafModePtrOutput) ToAppSecWafModePtrOutput() AppSecWafModePtrOutput {
	return o
}

func (o AppSecWafModePtrOutput) ToAppSecWafModePtrOutputWithContext(ctx context.Context) AppSecWafModePtrOutput {
	return o
}

type AppSecWafModeArrayOutput struct{ *pulumi.OutputState }

func (AppSecWafModeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppSecWafMode)(nil))
}

func (o AppSecWafModeArrayOutput) ToAppSecWafModeArrayOutput() AppSecWafModeArrayOutput {
	return o
}

func (o AppSecWafModeArrayOutput) ToAppSecWafModeArrayOutputWithContext(ctx context.Context) AppSecWafModeArrayOutput {
	return o
}

func (o AppSecWafModeArrayOutput) Index(i pulumi.IntInput) AppSecWafModeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppSecWafMode {
		return vs[0].([]AppSecWafMode)[vs[1].(int)]
	}).(AppSecWafModeOutput)
}

type AppSecWafModeMapOutput struct{ *pulumi.OutputState }

func (AppSecWafModeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AppSecWafMode)(nil))
}

func (o AppSecWafModeMapOutput) ToAppSecWafModeMapOutput() AppSecWafModeMapOutput {
	return o
}

func (o AppSecWafModeMapOutput) ToAppSecWafModeMapOutputWithContext(ctx context.Context) AppSecWafModeMapOutput {
	return o
}

func (o AppSecWafModeMapOutput) MapIndex(k pulumi.StringInput) AppSecWafModeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AppSecWafMode {
		return vs[0].(map[string]AppSecWafMode)[vs[1].(string)]
	}).(AppSecWafModeOutput)
}

func init() {
	pulumi.RegisterOutputType(AppSecWafModeOutput{})
	pulumi.RegisterOutputType(AppSecWafModePtrOutput{})
	pulumi.RegisterOutputType(AppSecWafModeArrayOutput{})
	pulumi.RegisterOutputType(AppSecWafModeMapOutput{})
}
