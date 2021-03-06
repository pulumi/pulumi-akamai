// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `AppSecConfigurationRename` resource allows you to rename an existing security configuration.
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
// 		configurationAppSecConfiguration, err := akamai.LookupAppSecConfiguration(ctx, &akamai.LookupAppSecConfigurationArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = akamai.NewAppSecConfigurationRename(ctx, "configurationAppSecConfigurationRename", &akamai.AppSecConfigurationRenameArgs{
// 			ConfigId:    pulumi.Int(configurationAppSecConfiguration.ConfigId),
// 			Description: pulumi.Any(_var.Description),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AppSecConfigurationRename struct {
	pulumi.CustomResourceState

	// The ID of the security configuration to be renamed.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// The description to be applied to the configuration.
	Description pulumi.StringOutput `pulumi:"description"`
	// The new name to be given to the configuration.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewAppSecConfigurationRename registers a new resource with the given unique name, arguments, and options.
func NewAppSecConfigurationRename(ctx *pulumi.Context,
	name string, args *AppSecConfigurationRenameArgs, opts ...pulumi.ResourceOption) (*AppSecConfigurationRename, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	var resource AppSecConfigurationRename
	err := ctx.RegisterResource("akamai:index/appSecConfigurationRename:AppSecConfigurationRename", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecConfigurationRename gets an existing AppSecConfigurationRename resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecConfigurationRename(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecConfigurationRenameState, opts ...pulumi.ResourceOption) (*AppSecConfigurationRename, error) {
	var resource AppSecConfigurationRename
	err := ctx.ReadResource("akamai:index/appSecConfigurationRename:AppSecConfigurationRename", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecConfigurationRename resources.
type appSecConfigurationRenameState struct {
	// The ID of the security configuration to be renamed.
	ConfigId *int `pulumi:"configId"`
	// The description to be applied to the configuration.
	Description *string `pulumi:"description"`
	// The new name to be given to the configuration.
	Name *string `pulumi:"name"`
}

type AppSecConfigurationRenameState struct {
	// The ID of the security configuration to be renamed.
	ConfigId pulumi.IntPtrInput
	// The description to be applied to the configuration.
	Description pulumi.StringPtrInput
	// The new name to be given to the configuration.
	Name pulumi.StringPtrInput
}

func (AppSecConfigurationRenameState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecConfigurationRenameState)(nil)).Elem()
}

type appSecConfigurationRenameArgs struct {
	// The ID of the security configuration to be renamed.
	ConfigId int `pulumi:"configId"`
	// The description to be applied to the configuration.
	Description string `pulumi:"description"`
	// The new name to be given to the configuration.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AppSecConfigurationRename resource.
type AppSecConfigurationRenameArgs struct {
	// The ID of the security configuration to be renamed.
	ConfigId pulumi.IntInput
	// The description to be applied to the configuration.
	Description pulumi.StringInput
	// The new name to be given to the configuration.
	Name pulumi.StringPtrInput
}

func (AppSecConfigurationRenameArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecConfigurationRenameArgs)(nil)).Elem()
}

type AppSecConfigurationRenameInput interface {
	pulumi.Input

	ToAppSecConfigurationRenameOutput() AppSecConfigurationRenameOutput
	ToAppSecConfigurationRenameOutputWithContext(ctx context.Context) AppSecConfigurationRenameOutput
}

func (*AppSecConfigurationRename) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecConfigurationRename)(nil))
}

func (i *AppSecConfigurationRename) ToAppSecConfigurationRenameOutput() AppSecConfigurationRenameOutput {
	return i.ToAppSecConfigurationRenameOutputWithContext(context.Background())
}

func (i *AppSecConfigurationRename) ToAppSecConfigurationRenameOutputWithContext(ctx context.Context) AppSecConfigurationRenameOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecConfigurationRenameOutput)
}

func (i *AppSecConfigurationRename) ToAppSecConfigurationRenamePtrOutput() AppSecConfigurationRenamePtrOutput {
	return i.ToAppSecConfigurationRenamePtrOutputWithContext(context.Background())
}

func (i *AppSecConfigurationRename) ToAppSecConfigurationRenamePtrOutputWithContext(ctx context.Context) AppSecConfigurationRenamePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecConfigurationRenamePtrOutput)
}

type AppSecConfigurationRenamePtrInput interface {
	pulumi.Input

	ToAppSecConfigurationRenamePtrOutput() AppSecConfigurationRenamePtrOutput
	ToAppSecConfigurationRenamePtrOutputWithContext(ctx context.Context) AppSecConfigurationRenamePtrOutput
}

type appSecConfigurationRenamePtrType AppSecConfigurationRenameArgs

func (*appSecConfigurationRenamePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecConfigurationRename)(nil))
}

func (i *appSecConfigurationRenamePtrType) ToAppSecConfigurationRenamePtrOutput() AppSecConfigurationRenamePtrOutput {
	return i.ToAppSecConfigurationRenamePtrOutputWithContext(context.Background())
}

func (i *appSecConfigurationRenamePtrType) ToAppSecConfigurationRenamePtrOutputWithContext(ctx context.Context) AppSecConfigurationRenamePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecConfigurationRenamePtrOutput)
}

// AppSecConfigurationRenameArrayInput is an input type that accepts AppSecConfigurationRenameArray and AppSecConfigurationRenameArrayOutput values.
// You can construct a concrete instance of `AppSecConfigurationRenameArrayInput` via:
//
//          AppSecConfigurationRenameArray{ AppSecConfigurationRenameArgs{...} }
type AppSecConfigurationRenameArrayInput interface {
	pulumi.Input

	ToAppSecConfigurationRenameArrayOutput() AppSecConfigurationRenameArrayOutput
	ToAppSecConfigurationRenameArrayOutputWithContext(context.Context) AppSecConfigurationRenameArrayOutput
}

type AppSecConfigurationRenameArray []AppSecConfigurationRenameInput

func (AppSecConfigurationRenameArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AppSecConfigurationRename)(nil))
}

func (i AppSecConfigurationRenameArray) ToAppSecConfigurationRenameArrayOutput() AppSecConfigurationRenameArrayOutput {
	return i.ToAppSecConfigurationRenameArrayOutputWithContext(context.Background())
}

func (i AppSecConfigurationRenameArray) ToAppSecConfigurationRenameArrayOutputWithContext(ctx context.Context) AppSecConfigurationRenameArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecConfigurationRenameArrayOutput)
}

// AppSecConfigurationRenameMapInput is an input type that accepts AppSecConfigurationRenameMap and AppSecConfigurationRenameMapOutput values.
// You can construct a concrete instance of `AppSecConfigurationRenameMapInput` via:
//
//          AppSecConfigurationRenameMap{ "key": AppSecConfigurationRenameArgs{...} }
type AppSecConfigurationRenameMapInput interface {
	pulumi.Input

	ToAppSecConfigurationRenameMapOutput() AppSecConfigurationRenameMapOutput
	ToAppSecConfigurationRenameMapOutputWithContext(context.Context) AppSecConfigurationRenameMapOutput
}

type AppSecConfigurationRenameMap map[string]AppSecConfigurationRenameInput

func (AppSecConfigurationRenameMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AppSecConfigurationRename)(nil))
}

func (i AppSecConfigurationRenameMap) ToAppSecConfigurationRenameMapOutput() AppSecConfigurationRenameMapOutput {
	return i.ToAppSecConfigurationRenameMapOutputWithContext(context.Background())
}

func (i AppSecConfigurationRenameMap) ToAppSecConfigurationRenameMapOutputWithContext(ctx context.Context) AppSecConfigurationRenameMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecConfigurationRenameMapOutput)
}

type AppSecConfigurationRenameOutput struct {
	*pulumi.OutputState
}

func (AppSecConfigurationRenameOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AppSecConfigurationRename)(nil))
}

func (o AppSecConfigurationRenameOutput) ToAppSecConfigurationRenameOutput() AppSecConfigurationRenameOutput {
	return o
}

func (o AppSecConfigurationRenameOutput) ToAppSecConfigurationRenameOutputWithContext(ctx context.Context) AppSecConfigurationRenameOutput {
	return o
}

func (o AppSecConfigurationRenameOutput) ToAppSecConfigurationRenamePtrOutput() AppSecConfigurationRenamePtrOutput {
	return o.ToAppSecConfigurationRenamePtrOutputWithContext(context.Background())
}

func (o AppSecConfigurationRenameOutput) ToAppSecConfigurationRenamePtrOutputWithContext(ctx context.Context) AppSecConfigurationRenamePtrOutput {
	return o.ApplyT(func(v AppSecConfigurationRename) *AppSecConfigurationRename {
		return &v
	}).(AppSecConfigurationRenamePtrOutput)
}

type AppSecConfigurationRenamePtrOutput struct {
	*pulumi.OutputState
}

func (AppSecConfigurationRenamePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecConfigurationRename)(nil))
}

func (o AppSecConfigurationRenamePtrOutput) ToAppSecConfigurationRenamePtrOutput() AppSecConfigurationRenamePtrOutput {
	return o
}

func (o AppSecConfigurationRenamePtrOutput) ToAppSecConfigurationRenamePtrOutputWithContext(ctx context.Context) AppSecConfigurationRenamePtrOutput {
	return o
}

type AppSecConfigurationRenameArrayOutput struct{ *pulumi.OutputState }

func (AppSecConfigurationRenameArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AppSecConfigurationRename)(nil))
}

func (o AppSecConfigurationRenameArrayOutput) ToAppSecConfigurationRenameArrayOutput() AppSecConfigurationRenameArrayOutput {
	return o
}

func (o AppSecConfigurationRenameArrayOutput) ToAppSecConfigurationRenameArrayOutputWithContext(ctx context.Context) AppSecConfigurationRenameArrayOutput {
	return o
}

func (o AppSecConfigurationRenameArrayOutput) Index(i pulumi.IntInput) AppSecConfigurationRenameOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AppSecConfigurationRename {
		return vs[0].([]AppSecConfigurationRename)[vs[1].(int)]
	}).(AppSecConfigurationRenameOutput)
}

type AppSecConfigurationRenameMapOutput struct{ *pulumi.OutputState }

func (AppSecConfigurationRenameMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AppSecConfigurationRename)(nil))
}

func (o AppSecConfigurationRenameMapOutput) ToAppSecConfigurationRenameMapOutput() AppSecConfigurationRenameMapOutput {
	return o
}

func (o AppSecConfigurationRenameMapOutput) ToAppSecConfigurationRenameMapOutputWithContext(ctx context.Context) AppSecConfigurationRenameMapOutput {
	return o
}

func (o AppSecConfigurationRenameMapOutput) MapIndex(k pulumi.StringInput) AppSecConfigurationRenameOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AppSecConfigurationRename {
		return vs[0].(map[string]AppSecConfigurationRename)[vs[1].(string)]
	}).(AppSecConfigurationRenameOutput)
}

func init() {
	pulumi.RegisterOutputType(AppSecConfigurationRenameOutput{})
	pulumi.RegisterOutputType(AppSecConfigurationRenamePtrOutput{})
	pulumi.RegisterOutputType(AppSecConfigurationRenameArrayOutput{})
	pulumi.RegisterOutputType(AppSecConfigurationRenameMapOutput{})
}
