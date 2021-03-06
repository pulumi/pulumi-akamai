// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package properties

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Deprecated: akamai.properties.EdgeHostName has been deprecated in favor of akamai.EdgeHostName
type EdgeHostName struct {
	pulumi.CustomResourceState

	Certificate pulumi.IntPtrOutput `pulumi:"certificate"`
	// Deprecated: The setting "contract" has been deprecated.
	Contract     pulumi.StringOutput `pulumi:"contract"`
	ContractId   pulumi.StringOutput `pulumi:"contractId"`
	EdgeHostname pulumi.StringOutput `pulumi:"edgeHostname"`
	// Deprecated: The setting "group" has been deprecated.
	Group      pulumi.StringOutput `pulumi:"group"`
	GroupId    pulumi.StringOutput `pulumi:"groupId"`
	IpBehavior pulumi.StringOutput `pulumi:"ipBehavior"`
	// Deprecated: The setting "product" has been deprecated.
	Product   pulumi.StringOutput `pulumi:"product"`
	ProductId pulumi.StringOutput `pulumi:"productId"`
}

// NewEdgeHostName registers a new resource with the given unique name, arguments, and options.
func NewEdgeHostName(ctx *pulumi.Context,
	name string, args *EdgeHostNameArgs, opts ...pulumi.ResourceOption) (*EdgeHostName, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EdgeHostname == nil {
		return nil, errors.New("invalid value for required argument 'EdgeHostname'")
	}
	if args.IpBehavior == nil {
		return nil, errors.New("invalid value for required argument 'IpBehavior'")
	}
	var resource EdgeHostName
	err := ctx.RegisterResource("akamai:properties/edgeHostName:EdgeHostName", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEdgeHostName gets an existing EdgeHostName resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEdgeHostName(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EdgeHostNameState, opts ...pulumi.ResourceOption) (*EdgeHostName, error) {
	var resource EdgeHostName
	err := ctx.ReadResource("akamai:properties/edgeHostName:EdgeHostName", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EdgeHostName resources.
type edgeHostNameState struct {
	Certificate *int `pulumi:"certificate"`
	// Deprecated: The setting "contract" has been deprecated.
	Contract     *string `pulumi:"contract"`
	ContractId   *string `pulumi:"contractId"`
	EdgeHostname *string `pulumi:"edgeHostname"`
	// Deprecated: The setting "group" has been deprecated.
	Group      *string `pulumi:"group"`
	GroupId    *string `pulumi:"groupId"`
	IpBehavior *string `pulumi:"ipBehavior"`
	// Deprecated: The setting "product" has been deprecated.
	Product   *string `pulumi:"product"`
	ProductId *string `pulumi:"productId"`
}

type EdgeHostNameState struct {
	Certificate pulumi.IntPtrInput
	// Deprecated: The setting "contract" has been deprecated.
	Contract     pulumi.StringPtrInput
	ContractId   pulumi.StringPtrInput
	EdgeHostname pulumi.StringPtrInput
	// Deprecated: The setting "group" has been deprecated.
	Group      pulumi.StringPtrInput
	GroupId    pulumi.StringPtrInput
	IpBehavior pulumi.StringPtrInput
	// Deprecated: The setting "product" has been deprecated.
	Product   pulumi.StringPtrInput
	ProductId pulumi.StringPtrInput
}

func (EdgeHostNameState) ElementType() reflect.Type {
	return reflect.TypeOf((*edgeHostNameState)(nil)).Elem()
}

type edgeHostNameArgs struct {
	Certificate *int `pulumi:"certificate"`
	// Deprecated: The setting "contract" has been deprecated.
	Contract     *string `pulumi:"contract"`
	ContractId   *string `pulumi:"contractId"`
	EdgeHostname string  `pulumi:"edgeHostname"`
	// Deprecated: The setting "group" has been deprecated.
	Group      *string `pulumi:"group"`
	GroupId    *string `pulumi:"groupId"`
	IpBehavior string  `pulumi:"ipBehavior"`
	// Deprecated: The setting "product" has been deprecated.
	Product   *string `pulumi:"product"`
	ProductId *string `pulumi:"productId"`
}

// The set of arguments for constructing a EdgeHostName resource.
type EdgeHostNameArgs struct {
	Certificate pulumi.IntPtrInput
	// Deprecated: The setting "contract" has been deprecated.
	Contract     pulumi.StringPtrInput
	ContractId   pulumi.StringPtrInput
	EdgeHostname pulumi.StringInput
	// Deprecated: The setting "group" has been deprecated.
	Group      pulumi.StringPtrInput
	GroupId    pulumi.StringPtrInput
	IpBehavior pulumi.StringInput
	// Deprecated: The setting "product" has been deprecated.
	Product   pulumi.StringPtrInput
	ProductId pulumi.StringPtrInput
}

func (EdgeHostNameArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*edgeHostNameArgs)(nil)).Elem()
}

type EdgeHostNameInput interface {
	pulumi.Input

	ToEdgeHostNameOutput() EdgeHostNameOutput
	ToEdgeHostNameOutputWithContext(ctx context.Context) EdgeHostNameOutput
}

func (*EdgeHostName) ElementType() reflect.Type {
	return reflect.TypeOf((*EdgeHostName)(nil))
}

func (i *EdgeHostName) ToEdgeHostNameOutput() EdgeHostNameOutput {
	return i.ToEdgeHostNameOutputWithContext(context.Background())
}

func (i *EdgeHostName) ToEdgeHostNameOutputWithContext(ctx context.Context) EdgeHostNameOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgeHostNameOutput)
}

func (i *EdgeHostName) ToEdgeHostNamePtrOutput() EdgeHostNamePtrOutput {
	return i.ToEdgeHostNamePtrOutputWithContext(context.Background())
}

func (i *EdgeHostName) ToEdgeHostNamePtrOutputWithContext(ctx context.Context) EdgeHostNamePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgeHostNamePtrOutput)
}

type EdgeHostNamePtrInput interface {
	pulumi.Input

	ToEdgeHostNamePtrOutput() EdgeHostNamePtrOutput
	ToEdgeHostNamePtrOutputWithContext(ctx context.Context) EdgeHostNamePtrOutput
}

type edgeHostNamePtrType EdgeHostNameArgs

func (*edgeHostNamePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EdgeHostName)(nil))
}

func (i *edgeHostNamePtrType) ToEdgeHostNamePtrOutput() EdgeHostNamePtrOutput {
	return i.ToEdgeHostNamePtrOutputWithContext(context.Background())
}

func (i *edgeHostNamePtrType) ToEdgeHostNamePtrOutputWithContext(ctx context.Context) EdgeHostNamePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgeHostNamePtrOutput)
}

// EdgeHostNameArrayInput is an input type that accepts EdgeHostNameArray and EdgeHostNameArrayOutput values.
// You can construct a concrete instance of `EdgeHostNameArrayInput` via:
//
//          EdgeHostNameArray{ EdgeHostNameArgs{...} }
type EdgeHostNameArrayInput interface {
	pulumi.Input

	ToEdgeHostNameArrayOutput() EdgeHostNameArrayOutput
	ToEdgeHostNameArrayOutputWithContext(context.Context) EdgeHostNameArrayOutput
}

type EdgeHostNameArray []EdgeHostNameInput

func (EdgeHostNameArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*EdgeHostName)(nil))
}

func (i EdgeHostNameArray) ToEdgeHostNameArrayOutput() EdgeHostNameArrayOutput {
	return i.ToEdgeHostNameArrayOutputWithContext(context.Background())
}

func (i EdgeHostNameArray) ToEdgeHostNameArrayOutputWithContext(ctx context.Context) EdgeHostNameArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgeHostNameArrayOutput)
}

// EdgeHostNameMapInput is an input type that accepts EdgeHostNameMap and EdgeHostNameMapOutput values.
// You can construct a concrete instance of `EdgeHostNameMapInput` via:
//
//          EdgeHostNameMap{ "key": EdgeHostNameArgs{...} }
type EdgeHostNameMapInput interface {
	pulumi.Input

	ToEdgeHostNameMapOutput() EdgeHostNameMapOutput
	ToEdgeHostNameMapOutputWithContext(context.Context) EdgeHostNameMapOutput
}

type EdgeHostNameMap map[string]EdgeHostNameInput

func (EdgeHostNameMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*EdgeHostName)(nil))
}

func (i EdgeHostNameMap) ToEdgeHostNameMapOutput() EdgeHostNameMapOutput {
	return i.ToEdgeHostNameMapOutputWithContext(context.Background())
}

func (i EdgeHostNameMap) ToEdgeHostNameMapOutputWithContext(ctx context.Context) EdgeHostNameMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgeHostNameMapOutput)
}

type EdgeHostNameOutput struct {
	*pulumi.OutputState
}

func (EdgeHostNameOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EdgeHostName)(nil))
}

func (o EdgeHostNameOutput) ToEdgeHostNameOutput() EdgeHostNameOutput {
	return o
}

func (o EdgeHostNameOutput) ToEdgeHostNameOutputWithContext(ctx context.Context) EdgeHostNameOutput {
	return o
}

func (o EdgeHostNameOutput) ToEdgeHostNamePtrOutput() EdgeHostNamePtrOutput {
	return o.ToEdgeHostNamePtrOutputWithContext(context.Background())
}

func (o EdgeHostNameOutput) ToEdgeHostNamePtrOutputWithContext(ctx context.Context) EdgeHostNamePtrOutput {
	return o.ApplyT(func(v EdgeHostName) *EdgeHostName {
		return &v
	}).(EdgeHostNamePtrOutput)
}

type EdgeHostNamePtrOutput struct {
	*pulumi.OutputState
}

func (EdgeHostNamePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EdgeHostName)(nil))
}

func (o EdgeHostNamePtrOutput) ToEdgeHostNamePtrOutput() EdgeHostNamePtrOutput {
	return o
}

func (o EdgeHostNamePtrOutput) ToEdgeHostNamePtrOutputWithContext(ctx context.Context) EdgeHostNamePtrOutput {
	return o
}

type EdgeHostNameArrayOutput struct{ *pulumi.OutputState }

func (EdgeHostNameArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EdgeHostName)(nil))
}

func (o EdgeHostNameArrayOutput) ToEdgeHostNameArrayOutput() EdgeHostNameArrayOutput {
	return o
}

func (o EdgeHostNameArrayOutput) ToEdgeHostNameArrayOutputWithContext(ctx context.Context) EdgeHostNameArrayOutput {
	return o
}

func (o EdgeHostNameArrayOutput) Index(i pulumi.IntInput) EdgeHostNameOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) EdgeHostName {
		return vs[0].([]EdgeHostName)[vs[1].(int)]
	}).(EdgeHostNameOutput)
}

type EdgeHostNameMapOutput struct{ *pulumi.OutputState }

func (EdgeHostNameMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]EdgeHostName)(nil))
}

func (o EdgeHostNameMapOutput) ToEdgeHostNameMapOutput() EdgeHostNameMapOutput {
	return o
}

func (o EdgeHostNameMapOutput) ToEdgeHostNameMapOutputWithContext(ctx context.Context) EdgeHostNameMapOutput {
	return o
}

func (o EdgeHostNameMapOutput) MapIndex(k pulumi.StringInput) EdgeHostNameOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) EdgeHostName {
		return vs[0].(map[string]EdgeHostName)[vs[1].(string)]
	}).(EdgeHostNameOutput)
}

func init() {
	pulumi.RegisterOutputType(EdgeHostNameOutput{})
	pulumi.RegisterOutputType(EdgeHostNamePtrOutput{})
	pulumi.RegisterOutputType(EdgeHostNameArrayOutput{})
	pulumi.RegisterOutputType(EdgeHostNameMapOutput{})
}
