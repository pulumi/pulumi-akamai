// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `AppSecEvalRuleAction` resource to update the action for a specific rule you want to evaluate.
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
// 		_, err = akamai.NewAppSecEvalRuleAction(ctx, "ruleAction", &akamai.AppSecEvalRuleActionArgs{
// 			ConfigId:         pulumi.Int(configuration.ConfigId),
// 			Version:          pulumi.Int(configuration.LatestVersion),
// 			SecurityPolicyId: pulumi.Any(_var.Security_policy_id),
// 			RuleId:           pulumi.Any(_var.Rule_id),
// 			RuleAction:       pulumi.Any(_var.Action),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AppSecEvalRuleAction struct {
	pulumi.CustomResourceState

	// The ID of the security configuration to use.
	ConfigId   pulumi.IntOutput    `pulumi:"configId"`
	RuleAction pulumi.StringOutput `pulumi:"ruleAction"`
	// The ID of the rule being evaluated.
	RuleId pulumi.IntOutput `pulumi:"ruleId"`
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewAppSecEvalRuleAction registers a new resource with the given unique name, arguments, and options.
func NewAppSecEvalRuleAction(ctx *pulumi.Context,
	name string, args *AppSecEvalRuleActionArgs, opts ...pulumi.ResourceOption) (*AppSecEvalRuleAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.RuleAction == nil {
		return nil, errors.New("invalid value for required argument 'RuleAction'")
	}
	if args.RuleId == nil {
		return nil, errors.New("invalid value for required argument 'RuleId'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	var resource AppSecEvalRuleAction
	err := ctx.RegisterResource("akamai:index/appSecEvalRuleAction:AppSecEvalRuleAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecEvalRuleAction gets an existing AppSecEvalRuleAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecEvalRuleAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecEvalRuleActionState, opts ...pulumi.ResourceOption) (*AppSecEvalRuleAction, error) {
	var resource AppSecEvalRuleAction
	err := ctx.ReadResource("akamai:index/appSecEvalRuleAction:AppSecEvalRuleAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecEvalRuleAction resources.
type appSecEvalRuleActionState struct {
	// The ID of the security configuration to use.
	ConfigId   *int    `pulumi:"configId"`
	RuleAction *string `pulumi:"ruleAction"`
	// The ID of the rule being evaluated.
	RuleId *int `pulumi:"ruleId"`
	// The ID of the security policy to use.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version *int `pulumi:"version"`
}

type AppSecEvalRuleActionState struct {
	// The ID of the security configuration to use.
	ConfigId   pulumi.IntPtrInput
	RuleAction pulumi.StringPtrInput
	// The ID of the rule being evaluated.
	RuleId pulumi.IntPtrInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringPtrInput
	// The version number of the security configuration to use.
	Version pulumi.IntPtrInput
}

func (AppSecEvalRuleActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecEvalRuleActionState)(nil)).Elem()
}

type appSecEvalRuleActionArgs struct {
	// The ID of the security configuration to use.
	ConfigId   int    `pulumi:"configId"`
	RuleAction string `pulumi:"ruleAction"`
	// The ID of the rule being evaluated.
	RuleId int `pulumi:"ruleId"`
	// The ID of the security policy to use.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version int `pulumi:"version"`
}

// The set of arguments for constructing a AppSecEvalRuleAction resource.
type AppSecEvalRuleActionArgs struct {
	// The ID of the security configuration to use.
	ConfigId   pulumi.IntInput
	RuleAction pulumi.StringInput
	// The ID of the rule being evaluated.
	RuleId pulumi.IntInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringInput
	// The version number of the security configuration to use.
	Version pulumi.IntInput
}

func (AppSecEvalRuleActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecEvalRuleActionArgs)(nil)).Elem()
}

type AppSecEvalRuleActionInput interface {
	pulumi.Input

	ToAppSecEvalRuleActionOutput() AppSecEvalRuleActionOutput
	ToAppSecEvalRuleActionOutputWithContext(ctx context.Context) AppSecEvalRuleActionOutput
}

func (*AppSecEvalRuleAction) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecEvalRuleAction)(nil))
}

func (i *AppSecEvalRuleAction) ToAppSecEvalRuleActionOutput() AppSecEvalRuleActionOutput {
	return i.ToAppSecEvalRuleActionOutputWithContext(context.Background())
}

func (i *AppSecEvalRuleAction) ToAppSecEvalRuleActionOutputWithContext(ctx context.Context) AppSecEvalRuleActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalRuleActionOutput)
}

func (i *AppSecEvalRuleAction) ToAppSecEvalRuleActionPtrOutput() AppSecEvalRuleActionPtrOutput {
	return i.ToAppSecEvalRuleActionPtrOutputWithContext(context.Background())
}

func (i *AppSecEvalRuleAction) ToAppSecEvalRuleActionPtrOutputWithContext(ctx context.Context) AppSecEvalRuleActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalRuleActionPtrOutput)
}

type AppSecEvalRuleActionPtrInput interface {
	pulumi.Input

	ToAppSecEvalRuleActionPtrOutput() AppSecEvalRuleActionPtrOutput
	ToAppSecEvalRuleActionPtrOutputWithContext(ctx context.Context) AppSecEvalRuleActionPtrOutput
}

type appSecEvalRuleActionPtrType AppSecEvalRuleActionArgs

func (*appSecEvalRuleActionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecEvalRuleAction)(nil))
}

func (i *appSecEvalRuleActionPtrType) ToAppSecEvalRuleActionPtrOutput() AppSecEvalRuleActionPtrOutput {
	return i.ToAppSecEvalRuleActionPtrOutputWithContext(context.Background())
}

func (i *appSecEvalRuleActionPtrType) ToAppSecEvalRuleActionPtrOutputWithContext(ctx context.Context) AppSecEvalRuleActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalRuleActionPtrOutput)
}

// AppSecEvalRuleActionArrayInput is an input type that accepts AppSecEvalRuleActionArray and AppSecEvalRuleActionArrayOutput values.
// You can construct a concrete instance of `AppSecEvalRuleActionArrayInput` via:
//
//          AppSecEvalRuleActionArray{ AppSecEvalRuleActionArgs{...} }
type AppSecEvalRuleActionArrayInput interface {
	pulumi.Input

	ToAppSecEvalRuleActionArrayOutput() AppSecEvalRuleActionArrayOutput
	ToAppSecEvalRuleActionArrayOutputWithContext(context.Context) AppSecEvalRuleActionArrayOutput
}

type AppSecEvalRuleActionArray []AppSecEvalRuleActionInput

func (AppSecEvalRuleActionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AppSecEvalRuleAction)(nil))
}

func (i AppSecEvalRuleActionArray) ToAppSecEvalRuleActionArrayOutput() AppSecEvalRuleActionArrayOutput {
	return i.ToAppSecEvalRuleActionArrayOutputWithContext(context.Background())
}

func (i AppSecEvalRuleActionArray) ToAppSecEvalRuleActionArrayOutputWithContext(ctx context.Context) AppSecEvalRuleActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalRuleActionArrayOutput)
}

// AppSecEvalRuleActionMapInput is an input type that accepts AppSecEvalRuleActionMap and AppSecEvalRuleActionMapOutput values.
// You can construct a concrete instance of `AppSecEvalRuleActionMapInput` via:
//
//          AppSecEvalRuleActionMap{ "key": AppSecEvalRuleActionArgs{...} }
type AppSecEvalRuleActionMapInput interface {
	pulumi.Input

	ToAppSecEvalRuleActionMapOutput() AppSecEvalRuleActionMapOutput
	ToAppSecEvalRuleActionMapOutputWithContext(context.Context) AppSecEvalRuleActionMapOutput
}

type AppSecEvalRuleActionMap map[string]AppSecEvalRuleActionInput

func (AppSecEvalRuleActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AppSecEvalRuleAction)(nil))
}

func (i AppSecEvalRuleActionMap) ToAppSecEvalRuleActionMapOutput() AppSecEvalRuleActionMapOutput {
	return i.ToAppSecEvalRuleActionMapOutputWithContext(context.Background())
}

func (i AppSecEvalRuleActionMap) ToAppSecEvalRuleActionMapOutputWithContext(ctx context.Context) AppSecEvalRuleActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalRuleActionMapOutput)
}

type AppSecEvalRuleActionOutput struct {
	*pulumi.OutputState
}

func (AppSecEvalRuleActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecEvalRuleAction)(nil))
}

func (o AppSecEvalRuleActionOutput) ToAppSecEvalRuleActionOutput() AppSecEvalRuleActionOutput {
	return o
}

func (o AppSecEvalRuleActionOutput) ToAppSecEvalRuleActionOutputWithContext(ctx context.Context) AppSecEvalRuleActionOutput {
	return o
}

func (o AppSecEvalRuleActionOutput) ToAppSecEvalRuleActionPtrOutput() AppSecEvalRuleActionPtrOutput {
	return o.ToAppSecEvalRuleActionPtrOutputWithContext(context.Background())
}

func (o AppSecEvalRuleActionOutput) ToAppSecEvalRuleActionPtrOutputWithContext(ctx context.Context) AppSecEvalRuleActionPtrOutput {
	return o.ApplyT(func(v AppSecEvalRuleAction) *AppSecEvalRuleAction {
		return &v
	}).(AppSecEvalRuleActionPtrOutput)
}

type AppSecEvalRuleActionPtrOutput struct {
	*pulumi.OutputState
}

func (AppSecEvalRuleActionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecEvalRuleAction)(nil))
}

func (o AppSecEvalRuleActionPtrOutput) ToAppSecEvalRuleActionPtrOutput() AppSecEvalRuleActionPtrOutput {
	return o
}

func (o AppSecEvalRuleActionPtrOutput) ToAppSecEvalRuleActionPtrOutputWithContext(ctx context.Context) AppSecEvalRuleActionPtrOutput {
	return o
}

type AppSecEvalRuleActionArrayOutput struct{ *pulumi.OutputState }

func (AppSecEvalRuleActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppSecEvalRuleAction)(nil))
}

func (o AppSecEvalRuleActionArrayOutput) ToAppSecEvalRuleActionArrayOutput() AppSecEvalRuleActionArrayOutput {
	return o
}

func (o AppSecEvalRuleActionArrayOutput) ToAppSecEvalRuleActionArrayOutputWithContext(ctx context.Context) AppSecEvalRuleActionArrayOutput {
	return o
}

func (o AppSecEvalRuleActionArrayOutput) Index(i pulumi.IntInput) AppSecEvalRuleActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppSecEvalRuleAction {
		return vs[0].([]AppSecEvalRuleAction)[vs[1].(int)]
	}).(AppSecEvalRuleActionOutput)
}

type AppSecEvalRuleActionMapOutput struct{ *pulumi.OutputState }

func (AppSecEvalRuleActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AppSecEvalRuleAction)(nil))
}

func (o AppSecEvalRuleActionMapOutput) ToAppSecEvalRuleActionMapOutput() AppSecEvalRuleActionMapOutput {
	return o
}

func (o AppSecEvalRuleActionMapOutput) ToAppSecEvalRuleActionMapOutputWithContext(ctx context.Context) AppSecEvalRuleActionMapOutput {
	return o
}

func (o AppSecEvalRuleActionMapOutput) MapIndex(k pulumi.StringInput) AppSecEvalRuleActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AppSecEvalRuleAction {
		return vs[0].(map[string]AppSecEvalRuleAction)[vs[1].(string)]
	}).(AppSecEvalRuleActionOutput)
}

func init() {
	pulumi.RegisterOutputType(AppSecEvalRuleActionOutput{})
	pulumi.RegisterOutputType(AppSecEvalRuleActionPtrOutput{})
	pulumi.RegisterOutputType(AppSecEvalRuleActionArrayOutput{})
	pulumi.RegisterOutputType(AppSecEvalRuleActionMapOutput{})
}
