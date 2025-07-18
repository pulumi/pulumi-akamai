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

type PropertyBootstrap struct {
	pulumi.CustomResourceState

	// ID of the property in the Identity and Access Management API.
	AssetId pulumi.StringOutput `pulumi:"assetId"`
	// Contract ID to be assigned to the Property
	ContractId pulumi.StringOutput `pulumi:"contractId"`
	// Group ID to be assigned to the Property
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// Name to give to the Property (must be unique)
	Name pulumi.StringOutput `pulumi:"name"`
	// Product ID to be assigned to the Property
	ProductId pulumi.StringOutput `pulumi:"productId"`
	// Specifies whether hostname bucket is used with this property. It allows you to add or remove property hostnames without
	// incrementing property versions.
	UseHostnameBucket pulumi.BoolOutput `pulumi:"useHostnameBucket"`
}

// NewPropertyBootstrap registers a new resource with the given unique name, arguments, and options.
func NewPropertyBootstrap(ctx *pulumi.Context,
	name string, args *PropertyBootstrapArgs, opts ...pulumi.ResourceOption) (*PropertyBootstrap, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContractId == nil {
		return nil, errors.New("invalid value for required argument 'ContractId'")
	}
	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.ProductId == nil {
		return nil, errors.New("invalid value for required argument 'ProductId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PropertyBootstrap
	err := ctx.RegisterResource("akamai:index/propertyBootstrap:PropertyBootstrap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPropertyBootstrap gets an existing PropertyBootstrap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPropertyBootstrap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PropertyBootstrapState, opts ...pulumi.ResourceOption) (*PropertyBootstrap, error) {
	var resource PropertyBootstrap
	err := ctx.ReadResource("akamai:index/propertyBootstrap:PropertyBootstrap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PropertyBootstrap resources.
type propertyBootstrapState struct {
	// ID of the property in the Identity and Access Management API.
	AssetId *string `pulumi:"assetId"`
	// Contract ID to be assigned to the Property
	ContractId *string `pulumi:"contractId"`
	// Group ID to be assigned to the Property
	GroupId *string `pulumi:"groupId"`
	// Name to give to the Property (must be unique)
	Name *string `pulumi:"name"`
	// Product ID to be assigned to the Property
	ProductId *string `pulumi:"productId"`
	// Specifies whether hostname bucket is used with this property. It allows you to add or remove property hostnames without
	// incrementing property versions.
	UseHostnameBucket *bool `pulumi:"useHostnameBucket"`
}

type PropertyBootstrapState struct {
	// ID of the property in the Identity and Access Management API.
	AssetId pulumi.StringPtrInput
	// Contract ID to be assigned to the Property
	ContractId pulumi.StringPtrInput
	// Group ID to be assigned to the Property
	GroupId pulumi.StringPtrInput
	// Name to give to the Property (must be unique)
	Name pulumi.StringPtrInput
	// Product ID to be assigned to the Property
	ProductId pulumi.StringPtrInput
	// Specifies whether hostname bucket is used with this property. It allows you to add or remove property hostnames without
	// incrementing property versions.
	UseHostnameBucket pulumi.BoolPtrInput
}

func (PropertyBootstrapState) ElementType() reflect.Type {
	return reflect.TypeOf((*propertyBootstrapState)(nil)).Elem()
}

type propertyBootstrapArgs struct {
	// Contract ID to be assigned to the Property
	ContractId string `pulumi:"contractId"`
	// Group ID to be assigned to the Property
	GroupId string `pulumi:"groupId"`
	// Name to give to the Property (must be unique)
	Name *string `pulumi:"name"`
	// Product ID to be assigned to the Property
	ProductId string `pulumi:"productId"`
	// Specifies whether hostname bucket is used with this property. It allows you to add or remove property hostnames without
	// incrementing property versions.
	UseHostnameBucket *bool `pulumi:"useHostnameBucket"`
}

// The set of arguments for constructing a PropertyBootstrap resource.
type PropertyBootstrapArgs struct {
	// Contract ID to be assigned to the Property
	ContractId pulumi.StringInput
	// Group ID to be assigned to the Property
	GroupId pulumi.StringInput
	// Name to give to the Property (must be unique)
	Name pulumi.StringPtrInput
	// Product ID to be assigned to the Property
	ProductId pulumi.StringInput
	// Specifies whether hostname bucket is used with this property. It allows you to add or remove property hostnames without
	// incrementing property versions.
	UseHostnameBucket pulumi.BoolPtrInput
}

func (PropertyBootstrapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*propertyBootstrapArgs)(nil)).Elem()
}

type PropertyBootstrapInput interface {
	pulumi.Input

	ToPropertyBootstrapOutput() PropertyBootstrapOutput
	ToPropertyBootstrapOutputWithContext(ctx context.Context) PropertyBootstrapOutput
}

func (*PropertyBootstrap) ElementType() reflect.Type {
	return reflect.TypeOf((**PropertyBootstrap)(nil)).Elem()
}

func (i *PropertyBootstrap) ToPropertyBootstrapOutput() PropertyBootstrapOutput {
	return i.ToPropertyBootstrapOutputWithContext(context.Background())
}

func (i *PropertyBootstrap) ToPropertyBootstrapOutputWithContext(ctx context.Context) PropertyBootstrapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PropertyBootstrapOutput)
}

// PropertyBootstrapArrayInput is an input type that accepts PropertyBootstrapArray and PropertyBootstrapArrayOutput values.
// You can construct a concrete instance of `PropertyBootstrapArrayInput` via:
//
//	PropertyBootstrapArray{ PropertyBootstrapArgs{...} }
type PropertyBootstrapArrayInput interface {
	pulumi.Input

	ToPropertyBootstrapArrayOutput() PropertyBootstrapArrayOutput
	ToPropertyBootstrapArrayOutputWithContext(context.Context) PropertyBootstrapArrayOutput
}

type PropertyBootstrapArray []PropertyBootstrapInput

func (PropertyBootstrapArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PropertyBootstrap)(nil)).Elem()
}

func (i PropertyBootstrapArray) ToPropertyBootstrapArrayOutput() PropertyBootstrapArrayOutput {
	return i.ToPropertyBootstrapArrayOutputWithContext(context.Background())
}

func (i PropertyBootstrapArray) ToPropertyBootstrapArrayOutputWithContext(ctx context.Context) PropertyBootstrapArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PropertyBootstrapArrayOutput)
}

// PropertyBootstrapMapInput is an input type that accepts PropertyBootstrapMap and PropertyBootstrapMapOutput values.
// You can construct a concrete instance of `PropertyBootstrapMapInput` via:
//
//	PropertyBootstrapMap{ "key": PropertyBootstrapArgs{...} }
type PropertyBootstrapMapInput interface {
	pulumi.Input

	ToPropertyBootstrapMapOutput() PropertyBootstrapMapOutput
	ToPropertyBootstrapMapOutputWithContext(context.Context) PropertyBootstrapMapOutput
}

type PropertyBootstrapMap map[string]PropertyBootstrapInput

func (PropertyBootstrapMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PropertyBootstrap)(nil)).Elem()
}

func (i PropertyBootstrapMap) ToPropertyBootstrapMapOutput() PropertyBootstrapMapOutput {
	return i.ToPropertyBootstrapMapOutputWithContext(context.Background())
}

func (i PropertyBootstrapMap) ToPropertyBootstrapMapOutputWithContext(ctx context.Context) PropertyBootstrapMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PropertyBootstrapMapOutput)
}

type PropertyBootstrapOutput struct{ *pulumi.OutputState }

func (PropertyBootstrapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PropertyBootstrap)(nil)).Elem()
}

func (o PropertyBootstrapOutput) ToPropertyBootstrapOutput() PropertyBootstrapOutput {
	return o
}

func (o PropertyBootstrapOutput) ToPropertyBootstrapOutputWithContext(ctx context.Context) PropertyBootstrapOutput {
	return o
}

// ID of the property in the Identity and Access Management API.
func (o PropertyBootstrapOutput) AssetId() pulumi.StringOutput {
	return o.ApplyT(func(v *PropertyBootstrap) pulumi.StringOutput { return v.AssetId }).(pulumi.StringOutput)
}

// Contract ID to be assigned to the Property
func (o PropertyBootstrapOutput) ContractId() pulumi.StringOutput {
	return o.ApplyT(func(v *PropertyBootstrap) pulumi.StringOutput { return v.ContractId }).(pulumi.StringOutput)
}

// Group ID to be assigned to the Property
func (o PropertyBootstrapOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *PropertyBootstrap) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// Name to give to the Property (must be unique)
func (o PropertyBootstrapOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PropertyBootstrap) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Product ID to be assigned to the Property
func (o PropertyBootstrapOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v *PropertyBootstrap) pulumi.StringOutput { return v.ProductId }).(pulumi.StringOutput)
}

// Specifies whether hostname bucket is used with this property. It allows you to add or remove property hostnames without
// incrementing property versions.
func (o PropertyBootstrapOutput) UseHostnameBucket() pulumi.BoolOutput {
	return o.ApplyT(func(v *PropertyBootstrap) pulumi.BoolOutput { return v.UseHostnameBucket }).(pulumi.BoolOutput)
}

type PropertyBootstrapArrayOutput struct{ *pulumi.OutputState }

func (PropertyBootstrapArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PropertyBootstrap)(nil)).Elem()
}

func (o PropertyBootstrapArrayOutput) ToPropertyBootstrapArrayOutput() PropertyBootstrapArrayOutput {
	return o
}

func (o PropertyBootstrapArrayOutput) ToPropertyBootstrapArrayOutputWithContext(ctx context.Context) PropertyBootstrapArrayOutput {
	return o
}

func (o PropertyBootstrapArrayOutput) Index(i pulumi.IntInput) PropertyBootstrapOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PropertyBootstrap {
		return vs[0].([]*PropertyBootstrap)[vs[1].(int)]
	}).(PropertyBootstrapOutput)
}

type PropertyBootstrapMapOutput struct{ *pulumi.OutputState }

func (PropertyBootstrapMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PropertyBootstrap)(nil)).Elem()
}

func (o PropertyBootstrapMapOutput) ToPropertyBootstrapMapOutput() PropertyBootstrapMapOutput {
	return o
}

func (o PropertyBootstrapMapOutput) ToPropertyBootstrapMapOutputWithContext(ctx context.Context) PropertyBootstrapMapOutput {
	return o
}

func (o PropertyBootstrapMapOutput) MapIndex(k pulumi.StringInput) PropertyBootstrapOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PropertyBootstrap {
		return vs[0].(map[string]*PropertyBootstrap)[vs[1].(string)]
	}).(PropertyBootstrapOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PropertyBootstrapInput)(nil)).Elem(), &PropertyBootstrap{})
	pulumi.RegisterInputType(reflect.TypeOf((*PropertyBootstrapArrayInput)(nil)).Elem(), PropertyBootstrapArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PropertyBootstrapMapInput)(nil)).Elem(), PropertyBootstrapMap{})
	pulumi.RegisterOutputType(PropertyBootstrapOutput{})
	pulumi.RegisterOutputType(PropertyBootstrapArrayOutput{})
	pulumi.RegisterOutputType(PropertyBootstrapMapOutput{})
}
