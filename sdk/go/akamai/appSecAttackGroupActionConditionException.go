// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use the `AppSecAttackGroupActionConditionException` resource to create or modify an attack group's conditions and exceptions.
type AppSecAttackGroupActionConditionException struct {
	pulumi.CustomResourceState

	// The attack group to use.
	AttackGroup pulumi.StringOutput `pulumi:"attackGroup"`
	// The name of a file containing a JSON-formatted description of the conditions and exceptions to use ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception)).
	ConditionException pulumi.StringOutput `pulumi:"conditionException"`
	// The ID of the security configuration to use.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewAppSecAttackGroupActionConditionException registers a new resource with the given unique name, arguments, and options.
func NewAppSecAttackGroupActionConditionException(ctx *pulumi.Context,
	name string, args *AppSecAttackGroupActionConditionExceptionArgs, opts ...pulumi.ResourceOption) (*AppSecAttackGroupActionConditionException, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AttackGroup == nil {
		return nil, errors.New("invalid value for required argument 'AttackGroup'")
	}
	if args.ConditionException == nil {
		return nil, errors.New("invalid value for required argument 'ConditionException'")
	}
	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	var resource AppSecAttackGroupActionConditionException
	err := ctx.RegisterResource("akamai:index/appSecAttackGroupActionConditionException:AppSecAttackGroupActionConditionException", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecAttackGroupActionConditionException gets an existing AppSecAttackGroupActionConditionException resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecAttackGroupActionConditionException(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecAttackGroupActionConditionExceptionState, opts ...pulumi.ResourceOption) (*AppSecAttackGroupActionConditionException, error) {
	var resource AppSecAttackGroupActionConditionException
	err := ctx.ReadResource("akamai:index/appSecAttackGroupActionConditionException:AppSecAttackGroupActionConditionException", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecAttackGroupActionConditionException resources.
type appSecAttackGroupActionConditionExceptionState struct {
	// The attack group to use.
	AttackGroup *string `pulumi:"attackGroup"`
	// The name of a file containing a JSON-formatted description of the conditions and exceptions to use ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception)).
	ConditionException *string `pulumi:"conditionException"`
	// The ID of the security configuration to use.
	ConfigId *int `pulumi:"configId"`
	// The ID of the security policy to use.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version *int `pulumi:"version"`
}

type AppSecAttackGroupActionConditionExceptionState struct {
	// The attack group to use.
	AttackGroup pulumi.StringPtrInput
	// The name of a file containing a JSON-formatted description of the conditions and exceptions to use ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception)).
	ConditionException pulumi.StringPtrInput
	// The ID of the security configuration to use.
	ConfigId pulumi.IntPtrInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringPtrInput
	// The version number of the security configuration to use.
	Version pulumi.IntPtrInput
}

func (AppSecAttackGroupActionConditionExceptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecAttackGroupActionConditionExceptionState)(nil)).Elem()
}

type appSecAttackGroupActionConditionExceptionArgs struct {
	// The attack group to use.
	AttackGroup string `pulumi:"attackGroup"`
	// The name of a file containing a JSON-formatted description of the conditions and exceptions to use ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception)).
	ConditionException string `pulumi:"conditionException"`
	// The ID of the security configuration to use.
	ConfigId int `pulumi:"configId"`
	// The ID of the security policy to use.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
	// The version number of the security configuration to use.
	Version int `pulumi:"version"`
}

// The set of arguments for constructing a AppSecAttackGroupActionConditionException resource.
type AppSecAttackGroupActionConditionExceptionArgs struct {
	// The attack group to use.
	AttackGroup pulumi.StringInput
	// The name of a file containing a JSON-formatted description of the conditions and exceptions to use ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception)).
	ConditionException pulumi.StringInput
	// The ID of the security configuration to use.
	ConfigId pulumi.IntInput
	// The ID of the security policy to use.
	SecurityPolicyId pulumi.StringInput
	// The version number of the security configuration to use.
	Version pulumi.IntInput
}

func (AppSecAttackGroupActionConditionExceptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecAttackGroupActionConditionExceptionArgs)(nil)).Elem()
}

type AppSecAttackGroupActionConditionExceptionInput interface {
	pulumi.Input

	ToAppSecAttackGroupActionConditionExceptionOutput() AppSecAttackGroupActionConditionExceptionOutput
	ToAppSecAttackGroupActionConditionExceptionOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionOutput
}

func (*AppSecAttackGroupActionConditionException) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecAttackGroupActionConditionException)(nil))
}

func (i *AppSecAttackGroupActionConditionException) ToAppSecAttackGroupActionConditionExceptionOutput() AppSecAttackGroupActionConditionExceptionOutput {
	return i.ToAppSecAttackGroupActionConditionExceptionOutputWithContext(context.Background())
}

func (i *AppSecAttackGroupActionConditionException) ToAppSecAttackGroupActionConditionExceptionOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecAttackGroupActionConditionExceptionOutput)
}

func (i *AppSecAttackGroupActionConditionException) ToAppSecAttackGroupActionConditionExceptionPtrOutput() AppSecAttackGroupActionConditionExceptionPtrOutput {
	return i.ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(context.Background())
}

func (i *AppSecAttackGroupActionConditionException) ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecAttackGroupActionConditionExceptionPtrOutput)
}

type AppSecAttackGroupActionConditionExceptionPtrInput interface {
	pulumi.Input

	ToAppSecAttackGroupActionConditionExceptionPtrOutput() AppSecAttackGroupActionConditionExceptionPtrOutput
	ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionPtrOutput
}

type appSecAttackGroupActionConditionExceptionPtrType AppSecAttackGroupActionConditionExceptionArgs

func (*appSecAttackGroupActionConditionExceptionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecAttackGroupActionConditionException)(nil))
}

func (i *appSecAttackGroupActionConditionExceptionPtrType) ToAppSecAttackGroupActionConditionExceptionPtrOutput() AppSecAttackGroupActionConditionExceptionPtrOutput {
	return i.ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(context.Background())
}

func (i *appSecAttackGroupActionConditionExceptionPtrType) ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecAttackGroupActionConditionExceptionPtrOutput)
}

// AppSecAttackGroupActionConditionExceptionArrayInput is an input type that accepts AppSecAttackGroupActionConditionExceptionArray and AppSecAttackGroupActionConditionExceptionArrayOutput values.
// You can construct a concrete instance of `AppSecAttackGroupActionConditionExceptionArrayInput` via:
//
//          AppSecAttackGroupActionConditionExceptionArray{ AppSecAttackGroupActionConditionExceptionArgs{...} }
type AppSecAttackGroupActionConditionExceptionArrayInput interface {
	pulumi.Input

	ToAppSecAttackGroupActionConditionExceptionArrayOutput() AppSecAttackGroupActionConditionExceptionArrayOutput
	ToAppSecAttackGroupActionConditionExceptionArrayOutputWithContext(context.Context) AppSecAttackGroupActionConditionExceptionArrayOutput
}

type AppSecAttackGroupActionConditionExceptionArray []AppSecAttackGroupActionConditionExceptionInput

func (AppSecAttackGroupActionConditionExceptionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AppSecAttackGroupActionConditionException)(nil))
}

func (i AppSecAttackGroupActionConditionExceptionArray) ToAppSecAttackGroupActionConditionExceptionArrayOutput() AppSecAttackGroupActionConditionExceptionArrayOutput {
	return i.ToAppSecAttackGroupActionConditionExceptionArrayOutputWithContext(context.Background())
}

func (i AppSecAttackGroupActionConditionExceptionArray) ToAppSecAttackGroupActionConditionExceptionArrayOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecAttackGroupActionConditionExceptionArrayOutput)
}

// AppSecAttackGroupActionConditionExceptionMapInput is an input type that accepts AppSecAttackGroupActionConditionExceptionMap and AppSecAttackGroupActionConditionExceptionMapOutput values.
// You can construct a concrete instance of `AppSecAttackGroupActionConditionExceptionMapInput` via:
//
//          AppSecAttackGroupActionConditionExceptionMap{ "key": AppSecAttackGroupActionConditionExceptionArgs{...} }
type AppSecAttackGroupActionConditionExceptionMapInput interface {
	pulumi.Input

	ToAppSecAttackGroupActionConditionExceptionMapOutput() AppSecAttackGroupActionConditionExceptionMapOutput
	ToAppSecAttackGroupActionConditionExceptionMapOutputWithContext(context.Context) AppSecAttackGroupActionConditionExceptionMapOutput
}

type AppSecAttackGroupActionConditionExceptionMap map[string]AppSecAttackGroupActionConditionExceptionInput

func (AppSecAttackGroupActionConditionExceptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AppSecAttackGroupActionConditionException)(nil))
}

func (i AppSecAttackGroupActionConditionExceptionMap) ToAppSecAttackGroupActionConditionExceptionMapOutput() AppSecAttackGroupActionConditionExceptionMapOutput {
	return i.ToAppSecAttackGroupActionConditionExceptionMapOutputWithContext(context.Background())
}

func (i AppSecAttackGroupActionConditionExceptionMap) ToAppSecAttackGroupActionConditionExceptionMapOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecAttackGroupActionConditionExceptionMapOutput)
}

type AppSecAttackGroupActionConditionExceptionOutput struct {
	*pulumi.OutputState
}

func (AppSecAttackGroupActionConditionExceptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecAttackGroupActionConditionException)(nil))
}

func (o AppSecAttackGroupActionConditionExceptionOutput) ToAppSecAttackGroupActionConditionExceptionOutput() AppSecAttackGroupActionConditionExceptionOutput {
	return o
}

func (o AppSecAttackGroupActionConditionExceptionOutput) ToAppSecAttackGroupActionConditionExceptionOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionOutput {
	return o
}

func (o AppSecAttackGroupActionConditionExceptionOutput) ToAppSecAttackGroupActionConditionExceptionPtrOutput() AppSecAttackGroupActionConditionExceptionPtrOutput {
	return o.ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(context.Background())
}

func (o AppSecAttackGroupActionConditionExceptionOutput) ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionPtrOutput {
	return o.ApplyT(func(v AppSecAttackGroupActionConditionException) *AppSecAttackGroupActionConditionException {
		return &v
	}).(AppSecAttackGroupActionConditionExceptionPtrOutput)
}

type AppSecAttackGroupActionConditionExceptionPtrOutput struct {
	*pulumi.OutputState
}

func (AppSecAttackGroupActionConditionExceptionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecAttackGroupActionConditionException)(nil))
}

func (o AppSecAttackGroupActionConditionExceptionPtrOutput) ToAppSecAttackGroupActionConditionExceptionPtrOutput() AppSecAttackGroupActionConditionExceptionPtrOutput {
	return o
}

func (o AppSecAttackGroupActionConditionExceptionPtrOutput) ToAppSecAttackGroupActionConditionExceptionPtrOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionPtrOutput {
	return o
}

type AppSecAttackGroupActionConditionExceptionArrayOutput struct{ *pulumi.OutputState }

func (AppSecAttackGroupActionConditionExceptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppSecAttackGroupActionConditionException)(nil))
}

func (o AppSecAttackGroupActionConditionExceptionArrayOutput) ToAppSecAttackGroupActionConditionExceptionArrayOutput() AppSecAttackGroupActionConditionExceptionArrayOutput {
	return o
}

func (o AppSecAttackGroupActionConditionExceptionArrayOutput) ToAppSecAttackGroupActionConditionExceptionArrayOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionArrayOutput {
	return o
}

func (o AppSecAttackGroupActionConditionExceptionArrayOutput) Index(i pulumi.IntInput) AppSecAttackGroupActionConditionExceptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppSecAttackGroupActionConditionException {
		return vs[0].([]AppSecAttackGroupActionConditionException)[vs[1].(int)]
	}).(AppSecAttackGroupActionConditionExceptionOutput)
}

type AppSecAttackGroupActionConditionExceptionMapOutput struct{ *pulumi.OutputState }

func (AppSecAttackGroupActionConditionExceptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AppSecAttackGroupActionConditionException)(nil))
}

func (o AppSecAttackGroupActionConditionExceptionMapOutput) ToAppSecAttackGroupActionConditionExceptionMapOutput() AppSecAttackGroupActionConditionExceptionMapOutput {
	return o
}

func (o AppSecAttackGroupActionConditionExceptionMapOutput) ToAppSecAttackGroupActionConditionExceptionMapOutputWithContext(ctx context.Context) AppSecAttackGroupActionConditionExceptionMapOutput {
	return o
}

func (o AppSecAttackGroupActionConditionExceptionMapOutput) MapIndex(k pulumi.StringInput) AppSecAttackGroupActionConditionExceptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AppSecAttackGroupActionConditionException {
		return vs[0].(map[string]AppSecAttackGroupActionConditionException)[vs[1].(string)]
	}).(AppSecAttackGroupActionConditionExceptionOutput)
}

func init() {
	pulumi.RegisterOutputType(AppSecAttackGroupActionConditionExceptionOutput{})
	pulumi.RegisterOutputType(AppSecAttackGroupActionConditionExceptionPtrOutput{})
	pulumi.RegisterOutputType(AppSecAttackGroupActionConditionExceptionArrayOutput{})
	pulumi.RegisterOutputType(AppSecAttackGroupActionConditionExceptionMapOutput{})
}
