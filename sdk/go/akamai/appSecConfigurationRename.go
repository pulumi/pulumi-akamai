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

type AppSecConfigurationRename struct {
	pulumi.CustomResourceState

	// Unique identifier of the security configuration
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// Brief description of the security configuration
	Description pulumi.StringOutput `pulumi:"description"`
	// New name for the security configuration
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Unique identifier of the security configuration
	ConfigId *int `pulumi:"configId"`
	// Brief description of the security configuration
	Description *string `pulumi:"description"`
	// New name for the security configuration
	Name *string `pulumi:"name"`
}

type AppSecConfigurationRenameState struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntPtrInput
	// Brief description of the security configuration
	Description pulumi.StringPtrInput
	// New name for the security configuration
	Name pulumi.StringPtrInput
}

func (AppSecConfigurationRenameState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecConfigurationRenameState)(nil)).Elem()
}

type appSecConfigurationRenameArgs struct {
	// Unique identifier of the security configuration
	ConfigId int `pulumi:"configId"`
	// Brief description of the security configuration
	Description string `pulumi:"description"`
	// New name for the security configuration
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a AppSecConfigurationRename resource.
type AppSecConfigurationRenameArgs struct {
	// Unique identifier of the security configuration
	ConfigId pulumi.IntInput
	// Brief description of the security configuration
	Description pulumi.StringInput
	// New name for the security configuration
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
	return reflect.TypeOf((**AppSecConfigurationRename)(nil)).Elem()
}

func (i *AppSecConfigurationRename) ToAppSecConfigurationRenameOutput() AppSecConfigurationRenameOutput {
	return i.ToAppSecConfigurationRenameOutputWithContext(context.Background())
}

func (i *AppSecConfigurationRename) ToAppSecConfigurationRenameOutputWithContext(ctx context.Context) AppSecConfigurationRenameOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecConfigurationRenameOutput)
}

// AppSecConfigurationRenameArrayInput is an input type that accepts AppSecConfigurationRenameArray and AppSecConfigurationRenameArrayOutput values.
// You can construct a concrete instance of `AppSecConfigurationRenameArrayInput` via:
//
//	AppSecConfigurationRenameArray{ AppSecConfigurationRenameArgs{...} }
type AppSecConfigurationRenameArrayInput interface {
	pulumi.Input

	ToAppSecConfigurationRenameArrayOutput() AppSecConfigurationRenameArrayOutput
	ToAppSecConfigurationRenameArrayOutputWithContext(context.Context) AppSecConfigurationRenameArrayOutput
}

type AppSecConfigurationRenameArray []AppSecConfigurationRenameInput

func (AppSecConfigurationRenameArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecConfigurationRename)(nil)).Elem()
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
//	AppSecConfigurationRenameMap{ "key": AppSecConfigurationRenameArgs{...} }
type AppSecConfigurationRenameMapInput interface {
	pulumi.Input

	ToAppSecConfigurationRenameMapOutput() AppSecConfigurationRenameMapOutput
	ToAppSecConfigurationRenameMapOutputWithContext(context.Context) AppSecConfigurationRenameMapOutput
}

type AppSecConfigurationRenameMap map[string]AppSecConfigurationRenameInput

func (AppSecConfigurationRenameMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecConfigurationRename)(nil)).Elem()
}

func (i AppSecConfigurationRenameMap) ToAppSecConfigurationRenameMapOutput() AppSecConfigurationRenameMapOutput {
	return i.ToAppSecConfigurationRenameMapOutputWithContext(context.Background())
}

func (i AppSecConfigurationRenameMap) ToAppSecConfigurationRenameMapOutputWithContext(ctx context.Context) AppSecConfigurationRenameMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecConfigurationRenameMapOutput)
}

type AppSecConfigurationRenameOutput struct{ *pulumi.OutputState }

func (AppSecConfigurationRenameOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecConfigurationRename)(nil)).Elem()
}

func (o AppSecConfigurationRenameOutput) ToAppSecConfigurationRenameOutput() AppSecConfigurationRenameOutput {
	return o
}

func (o AppSecConfigurationRenameOutput) ToAppSecConfigurationRenameOutputWithContext(ctx context.Context) AppSecConfigurationRenameOutput {
	return o
}

// Unique identifier of the security configuration
func (o AppSecConfigurationRenameOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v *AppSecConfigurationRename) pulumi.IntOutput { return v.ConfigId }).(pulumi.IntOutput)
}

// Brief description of the security configuration
func (o AppSecConfigurationRenameOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecConfigurationRename) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// New name for the security configuration
func (o AppSecConfigurationRenameOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AppSecConfigurationRename) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type AppSecConfigurationRenameArrayOutput struct{ *pulumi.OutputState }

func (AppSecConfigurationRenameArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecConfigurationRename)(nil)).Elem()
}

func (o AppSecConfigurationRenameArrayOutput) ToAppSecConfigurationRenameArrayOutput() AppSecConfigurationRenameArrayOutput {
	return o
}

func (o AppSecConfigurationRenameArrayOutput) ToAppSecConfigurationRenameArrayOutputWithContext(ctx context.Context) AppSecConfigurationRenameArrayOutput {
	return o
}

func (o AppSecConfigurationRenameArrayOutput) Index(i pulumi.IntInput) AppSecConfigurationRenameOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppSecConfigurationRename {
		return vs[0].([]*AppSecConfigurationRename)[vs[1].(int)]
	}).(AppSecConfigurationRenameOutput)
}

type AppSecConfigurationRenameMapOutput struct{ *pulumi.OutputState }

func (AppSecConfigurationRenameMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecConfigurationRename)(nil)).Elem()
}

func (o AppSecConfigurationRenameMapOutput) ToAppSecConfigurationRenameMapOutput() AppSecConfigurationRenameMapOutput {
	return o
}

func (o AppSecConfigurationRenameMapOutput) ToAppSecConfigurationRenameMapOutputWithContext(ctx context.Context) AppSecConfigurationRenameMapOutput {
	return o
}

func (o AppSecConfigurationRenameMapOutput) MapIndex(k pulumi.StringInput) AppSecConfigurationRenameOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppSecConfigurationRename {
		return vs[0].(map[string]*AppSecConfigurationRename)[vs[1].(string)]
	}).(AppSecConfigurationRenameOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecConfigurationRenameInput)(nil)).Elem(), &AppSecConfigurationRename{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecConfigurationRenameArrayInput)(nil)).Elem(), AppSecConfigurationRenameArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecConfigurationRenameMapInput)(nil)).Elem(), AppSecConfigurationRenameMap{})
	pulumi.RegisterOutputType(AppSecConfigurationRenameOutput{})
	pulumi.RegisterOutputType(AppSecConfigurationRenameArrayOutput{})
	pulumi.RegisterOutputType(AppSecConfigurationRenameMapOutput{})
}
