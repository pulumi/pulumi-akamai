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

type GtmDatacenter struct {
	pulumi.CustomResourceState

	City                          pulumi.StringPtrOutput                  `pulumi:"city"`
	CloneOf                       pulumi.IntPtrOutput                     `pulumi:"cloneOf"`
	CloudServerHostHeaderOverride pulumi.BoolPtrOutput                    `pulumi:"cloudServerHostHeaderOverride"`
	CloudServerTargeting          pulumi.BoolPtrOutput                    `pulumi:"cloudServerTargeting"`
	Continent                     pulumi.StringPtrOutput                  `pulumi:"continent"`
	Country                       pulumi.StringPtrOutput                  `pulumi:"country"`
	DatacenterId                  pulumi.IntOutput                        `pulumi:"datacenterId"`
	DefaultLoadObject             GtmDatacenterDefaultLoadObjectPtrOutput `pulumi:"defaultLoadObject"`
	Domain                        pulumi.StringOutput                     `pulumi:"domain"`
	Latitude                      pulumi.Float64PtrOutput                 `pulumi:"latitude"`
	Longitude                     pulumi.Float64PtrOutput                 `pulumi:"longitude"`
	Nickname                      pulumi.StringPtrOutput                  `pulumi:"nickname"`
	PingInterval                  pulumi.IntOutput                        `pulumi:"pingInterval"`
	PingPacketSize                pulumi.IntOutput                        `pulumi:"pingPacketSize"`
	ScorePenalty                  pulumi.IntOutput                        `pulumi:"scorePenalty"`
	ServermonitorLivenessCount    pulumi.IntOutput                        `pulumi:"servermonitorLivenessCount"`
	ServermonitorLoadCount        pulumi.IntOutput                        `pulumi:"servermonitorLoadCount"`
	ServermonitorPool             pulumi.StringOutput                     `pulumi:"servermonitorPool"`
	StateOrProvince               pulumi.StringPtrOutput                  `pulumi:"stateOrProvince"`
	Virtual                       pulumi.BoolOutput                       `pulumi:"virtual"`
	WaitOnComplete                pulumi.BoolPtrOutput                    `pulumi:"waitOnComplete"`
}

// NewGtmDatacenter registers a new resource with the given unique name, arguments, and options.
func NewGtmDatacenter(ctx *pulumi.Context,
	name string, args *GtmDatacenterArgs, opts ...pulumi.ResourceOption) (*GtmDatacenter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("akamai:trafficmanagement/gtmDatacenter:GtmDatacenter"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GtmDatacenter
	err := ctx.RegisterResource("akamai:index/gtmDatacenter:GtmDatacenter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGtmDatacenter gets an existing GtmDatacenter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGtmDatacenter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GtmDatacenterState, opts ...pulumi.ResourceOption) (*GtmDatacenter, error) {
	var resource GtmDatacenter
	err := ctx.ReadResource("akamai:index/gtmDatacenter:GtmDatacenter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GtmDatacenter resources.
type gtmDatacenterState struct {
	City                          *string                         `pulumi:"city"`
	CloneOf                       *int                            `pulumi:"cloneOf"`
	CloudServerHostHeaderOverride *bool                           `pulumi:"cloudServerHostHeaderOverride"`
	CloudServerTargeting          *bool                           `pulumi:"cloudServerTargeting"`
	Continent                     *string                         `pulumi:"continent"`
	Country                       *string                         `pulumi:"country"`
	DatacenterId                  *int                            `pulumi:"datacenterId"`
	DefaultLoadObject             *GtmDatacenterDefaultLoadObject `pulumi:"defaultLoadObject"`
	Domain                        *string                         `pulumi:"domain"`
	Latitude                      *float64                        `pulumi:"latitude"`
	Longitude                     *float64                        `pulumi:"longitude"`
	Nickname                      *string                         `pulumi:"nickname"`
	PingInterval                  *int                            `pulumi:"pingInterval"`
	PingPacketSize                *int                            `pulumi:"pingPacketSize"`
	ScorePenalty                  *int                            `pulumi:"scorePenalty"`
	ServermonitorLivenessCount    *int                            `pulumi:"servermonitorLivenessCount"`
	ServermonitorLoadCount        *int                            `pulumi:"servermonitorLoadCount"`
	ServermonitorPool             *string                         `pulumi:"servermonitorPool"`
	StateOrProvince               *string                         `pulumi:"stateOrProvince"`
	Virtual                       *bool                           `pulumi:"virtual"`
	WaitOnComplete                *bool                           `pulumi:"waitOnComplete"`
}

type GtmDatacenterState struct {
	City                          pulumi.StringPtrInput
	CloneOf                       pulumi.IntPtrInput
	CloudServerHostHeaderOverride pulumi.BoolPtrInput
	CloudServerTargeting          pulumi.BoolPtrInput
	Continent                     pulumi.StringPtrInput
	Country                       pulumi.StringPtrInput
	DatacenterId                  pulumi.IntPtrInput
	DefaultLoadObject             GtmDatacenterDefaultLoadObjectPtrInput
	Domain                        pulumi.StringPtrInput
	Latitude                      pulumi.Float64PtrInput
	Longitude                     pulumi.Float64PtrInput
	Nickname                      pulumi.StringPtrInput
	PingInterval                  pulumi.IntPtrInput
	PingPacketSize                pulumi.IntPtrInput
	ScorePenalty                  pulumi.IntPtrInput
	ServermonitorLivenessCount    pulumi.IntPtrInput
	ServermonitorLoadCount        pulumi.IntPtrInput
	ServermonitorPool             pulumi.StringPtrInput
	StateOrProvince               pulumi.StringPtrInput
	Virtual                       pulumi.BoolPtrInput
	WaitOnComplete                pulumi.BoolPtrInput
}

func (GtmDatacenterState) ElementType() reflect.Type {
	return reflect.TypeOf((*gtmDatacenterState)(nil)).Elem()
}

type gtmDatacenterArgs struct {
	City                          *string                         `pulumi:"city"`
	CloneOf                       *int                            `pulumi:"cloneOf"`
	CloudServerHostHeaderOverride *bool                           `pulumi:"cloudServerHostHeaderOverride"`
	CloudServerTargeting          *bool                           `pulumi:"cloudServerTargeting"`
	Continent                     *string                         `pulumi:"continent"`
	Country                       *string                         `pulumi:"country"`
	DefaultLoadObject             *GtmDatacenterDefaultLoadObject `pulumi:"defaultLoadObject"`
	Domain                        string                          `pulumi:"domain"`
	Latitude                      *float64                        `pulumi:"latitude"`
	Longitude                     *float64                        `pulumi:"longitude"`
	Nickname                      *string                         `pulumi:"nickname"`
	StateOrProvince               *string                         `pulumi:"stateOrProvince"`
	WaitOnComplete                *bool                           `pulumi:"waitOnComplete"`
}

// The set of arguments for constructing a GtmDatacenter resource.
type GtmDatacenterArgs struct {
	City                          pulumi.StringPtrInput
	CloneOf                       pulumi.IntPtrInput
	CloudServerHostHeaderOverride pulumi.BoolPtrInput
	CloudServerTargeting          pulumi.BoolPtrInput
	Continent                     pulumi.StringPtrInput
	Country                       pulumi.StringPtrInput
	DefaultLoadObject             GtmDatacenterDefaultLoadObjectPtrInput
	Domain                        pulumi.StringInput
	Latitude                      pulumi.Float64PtrInput
	Longitude                     pulumi.Float64PtrInput
	Nickname                      pulumi.StringPtrInput
	StateOrProvince               pulumi.StringPtrInput
	WaitOnComplete                pulumi.BoolPtrInput
}

func (GtmDatacenterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gtmDatacenterArgs)(nil)).Elem()
}

type GtmDatacenterInput interface {
	pulumi.Input

	ToGtmDatacenterOutput() GtmDatacenterOutput
	ToGtmDatacenterOutputWithContext(ctx context.Context) GtmDatacenterOutput
}

func (*GtmDatacenter) ElementType() reflect.Type {
	return reflect.TypeOf((**GtmDatacenter)(nil)).Elem()
}

func (i *GtmDatacenter) ToGtmDatacenterOutput() GtmDatacenterOutput {
	return i.ToGtmDatacenterOutputWithContext(context.Background())
}

func (i *GtmDatacenter) ToGtmDatacenterOutputWithContext(ctx context.Context) GtmDatacenterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmDatacenterOutput)
}

// GtmDatacenterArrayInput is an input type that accepts GtmDatacenterArray and GtmDatacenterArrayOutput values.
// You can construct a concrete instance of `GtmDatacenterArrayInput` via:
//
//	GtmDatacenterArray{ GtmDatacenterArgs{...} }
type GtmDatacenterArrayInput interface {
	pulumi.Input

	ToGtmDatacenterArrayOutput() GtmDatacenterArrayOutput
	ToGtmDatacenterArrayOutputWithContext(context.Context) GtmDatacenterArrayOutput
}

type GtmDatacenterArray []GtmDatacenterInput

func (GtmDatacenterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GtmDatacenter)(nil)).Elem()
}

func (i GtmDatacenterArray) ToGtmDatacenterArrayOutput() GtmDatacenterArrayOutput {
	return i.ToGtmDatacenterArrayOutputWithContext(context.Background())
}

func (i GtmDatacenterArray) ToGtmDatacenterArrayOutputWithContext(ctx context.Context) GtmDatacenterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmDatacenterArrayOutput)
}

// GtmDatacenterMapInput is an input type that accepts GtmDatacenterMap and GtmDatacenterMapOutput values.
// You can construct a concrete instance of `GtmDatacenterMapInput` via:
//
//	GtmDatacenterMap{ "key": GtmDatacenterArgs{...} }
type GtmDatacenterMapInput interface {
	pulumi.Input

	ToGtmDatacenterMapOutput() GtmDatacenterMapOutput
	ToGtmDatacenterMapOutputWithContext(context.Context) GtmDatacenterMapOutput
}

type GtmDatacenterMap map[string]GtmDatacenterInput

func (GtmDatacenterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GtmDatacenter)(nil)).Elem()
}

func (i GtmDatacenterMap) ToGtmDatacenterMapOutput() GtmDatacenterMapOutput {
	return i.ToGtmDatacenterMapOutputWithContext(context.Background())
}

func (i GtmDatacenterMap) ToGtmDatacenterMapOutputWithContext(ctx context.Context) GtmDatacenterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmDatacenterMapOutput)
}

type GtmDatacenterOutput struct{ *pulumi.OutputState }

func (GtmDatacenterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GtmDatacenter)(nil)).Elem()
}

func (o GtmDatacenterOutput) ToGtmDatacenterOutput() GtmDatacenterOutput {
	return o
}

func (o GtmDatacenterOutput) ToGtmDatacenterOutputWithContext(ctx context.Context) GtmDatacenterOutput {
	return o
}

func (o GtmDatacenterOutput) City() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.StringPtrOutput { return v.City }).(pulumi.StringPtrOutput)
}

func (o GtmDatacenterOutput) CloneOf() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.IntPtrOutput { return v.CloneOf }).(pulumi.IntPtrOutput)
}

func (o GtmDatacenterOutput) CloudServerHostHeaderOverride() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.BoolPtrOutput { return v.CloudServerHostHeaderOverride }).(pulumi.BoolPtrOutput)
}

func (o GtmDatacenterOutput) CloudServerTargeting() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.BoolPtrOutput { return v.CloudServerTargeting }).(pulumi.BoolPtrOutput)
}

func (o GtmDatacenterOutput) Continent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.StringPtrOutput { return v.Continent }).(pulumi.StringPtrOutput)
}

func (o GtmDatacenterOutput) Country() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.StringPtrOutput { return v.Country }).(pulumi.StringPtrOutput)
}

func (o GtmDatacenterOutput) DatacenterId() pulumi.IntOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.IntOutput { return v.DatacenterId }).(pulumi.IntOutput)
}

func (o GtmDatacenterOutput) DefaultLoadObject() GtmDatacenterDefaultLoadObjectPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) GtmDatacenterDefaultLoadObjectPtrOutput { return v.DefaultLoadObject }).(GtmDatacenterDefaultLoadObjectPtrOutput)
}

func (o GtmDatacenterOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

func (o GtmDatacenterOutput) Latitude() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.Float64PtrOutput { return v.Latitude }).(pulumi.Float64PtrOutput)
}

func (o GtmDatacenterOutput) Longitude() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.Float64PtrOutput { return v.Longitude }).(pulumi.Float64PtrOutput)
}

func (o GtmDatacenterOutput) Nickname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.StringPtrOutput { return v.Nickname }).(pulumi.StringPtrOutput)
}

func (o GtmDatacenterOutput) PingInterval() pulumi.IntOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.IntOutput { return v.PingInterval }).(pulumi.IntOutput)
}

func (o GtmDatacenterOutput) PingPacketSize() pulumi.IntOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.IntOutput { return v.PingPacketSize }).(pulumi.IntOutput)
}

func (o GtmDatacenterOutput) ScorePenalty() pulumi.IntOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.IntOutput { return v.ScorePenalty }).(pulumi.IntOutput)
}

func (o GtmDatacenterOutput) ServermonitorLivenessCount() pulumi.IntOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.IntOutput { return v.ServermonitorLivenessCount }).(pulumi.IntOutput)
}

func (o GtmDatacenterOutput) ServermonitorLoadCount() pulumi.IntOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.IntOutput { return v.ServermonitorLoadCount }).(pulumi.IntOutput)
}

func (o GtmDatacenterOutput) ServermonitorPool() pulumi.StringOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.StringOutput { return v.ServermonitorPool }).(pulumi.StringOutput)
}

func (o GtmDatacenterOutput) StateOrProvince() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.StringPtrOutput { return v.StateOrProvince }).(pulumi.StringPtrOutput)
}

func (o GtmDatacenterOutput) Virtual() pulumi.BoolOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.BoolOutput { return v.Virtual }).(pulumi.BoolOutput)
}

func (o GtmDatacenterOutput) WaitOnComplete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GtmDatacenter) pulumi.BoolPtrOutput { return v.WaitOnComplete }).(pulumi.BoolPtrOutput)
}

type GtmDatacenterArrayOutput struct{ *pulumi.OutputState }

func (GtmDatacenterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GtmDatacenter)(nil)).Elem()
}

func (o GtmDatacenterArrayOutput) ToGtmDatacenterArrayOutput() GtmDatacenterArrayOutput {
	return o
}

func (o GtmDatacenterArrayOutput) ToGtmDatacenterArrayOutputWithContext(ctx context.Context) GtmDatacenterArrayOutput {
	return o
}

func (o GtmDatacenterArrayOutput) Index(i pulumi.IntInput) GtmDatacenterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GtmDatacenter {
		return vs[0].([]*GtmDatacenter)[vs[1].(int)]
	}).(GtmDatacenterOutput)
}

type GtmDatacenterMapOutput struct{ *pulumi.OutputState }

func (GtmDatacenterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GtmDatacenter)(nil)).Elem()
}

func (o GtmDatacenterMapOutput) ToGtmDatacenterMapOutput() GtmDatacenterMapOutput {
	return o
}

func (o GtmDatacenterMapOutput) ToGtmDatacenterMapOutputWithContext(ctx context.Context) GtmDatacenterMapOutput {
	return o
}

func (o GtmDatacenterMapOutput) MapIndex(k pulumi.StringInput) GtmDatacenterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GtmDatacenter {
		return vs[0].(map[string]*GtmDatacenter)[vs[1].(string)]
	}).(GtmDatacenterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GtmDatacenterInput)(nil)).Elem(), &GtmDatacenter{})
	pulumi.RegisterInputType(reflect.TypeOf((*GtmDatacenterArrayInput)(nil)).Elem(), GtmDatacenterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GtmDatacenterMapInput)(nil)).Elem(), GtmDatacenterMap{})
	pulumi.RegisterOutputType(GtmDatacenterOutput{})
	pulumi.RegisterOutputType(GtmDatacenterArrayOutput{})
	pulumi.RegisterOutputType(GtmDatacenterMapOutput{})
}
