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

type GtmResource struct {
	pulumi.CustomResourceState

	AggregationType             pulumi.StringOutput                    `pulumi:"aggregationType"`
	ConstrainedProperty         pulumi.StringPtrOutput                 `pulumi:"constrainedProperty"`
	DecayRate                   pulumi.Float64PtrOutput                `pulumi:"decayRate"`
	Description                 pulumi.StringPtrOutput                 `pulumi:"description"`
	Domain                      pulumi.StringOutput                    `pulumi:"domain"`
	HostHeader                  pulumi.StringPtrOutput                 `pulumi:"hostHeader"`
	LeaderString                pulumi.StringPtrOutput                 `pulumi:"leaderString"`
	LeastSquaresDecay           pulumi.Float64PtrOutput                `pulumi:"leastSquaresDecay"`
	LoadImbalancePercentage     pulumi.Float64PtrOutput                `pulumi:"loadImbalancePercentage"`
	MaxUMultiplicativeIncrement pulumi.Float64PtrOutput                `pulumi:"maxUMultiplicativeIncrement"`
	Name                        pulumi.StringOutput                    `pulumi:"name"`
	ResourceInstances           GtmResourceResourceInstanceArrayOutput `pulumi:"resourceInstances"`
	Type                        pulumi.StringOutput                    `pulumi:"type"`
	UpperBound                  pulumi.IntPtrOutput                    `pulumi:"upperBound"`
	WaitOnComplete              pulumi.BoolPtrOutput                   `pulumi:"waitOnComplete"`
}

// NewGtmResource registers a new resource with the given unique name, arguments, and options.
func NewGtmResource(ctx *pulumi.Context,
	name string, args *GtmResourceArgs, opts ...pulumi.ResourceOption) (*GtmResource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AggregationType == nil {
		return nil, errors.New("invalid value for required argument 'AggregationType'")
	}
	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("akamai:trafficmanagement/gtmResource:GtmResource"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GtmResource
	err := ctx.RegisterResource("akamai:index/gtmResource:GtmResource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGtmResource gets an existing GtmResource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGtmResource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GtmResourceState, opts ...pulumi.ResourceOption) (*GtmResource, error) {
	var resource GtmResource
	err := ctx.ReadResource("akamai:index/gtmResource:GtmResource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GtmResource resources.
type gtmResourceState struct {
	AggregationType             *string                       `pulumi:"aggregationType"`
	ConstrainedProperty         *string                       `pulumi:"constrainedProperty"`
	DecayRate                   *float64                      `pulumi:"decayRate"`
	Description                 *string                       `pulumi:"description"`
	Domain                      *string                       `pulumi:"domain"`
	HostHeader                  *string                       `pulumi:"hostHeader"`
	LeaderString                *string                       `pulumi:"leaderString"`
	LeastSquaresDecay           *float64                      `pulumi:"leastSquaresDecay"`
	LoadImbalancePercentage     *float64                      `pulumi:"loadImbalancePercentage"`
	MaxUMultiplicativeIncrement *float64                      `pulumi:"maxUMultiplicativeIncrement"`
	Name                        *string                       `pulumi:"name"`
	ResourceInstances           []GtmResourceResourceInstance `pulumi:"resourceInstances"`
	Type                        *string                       `pulumi:"type"`
	UpperBound                  *int                          `pulumi:"upperBound"`
	WaitOnComplete              *bool                         `pulumi:"waitOnComplete"`
}

type GtmResourceState struct {
	AggregationType             pulumi.StringPtrInput
	ConstrainedProperty         pulumi.StringPtrInput
	DecayRate                   pulumi.Float64PtrInput
	Description                 pulumi.StringPtrInput
	Domain                      pulumi.StringPtrInput
	HostHeader                  pulumi.StringPtrInput
	LeaderString                pulumi.StringPtrInput
	LeastSquaresDecay           pulumi.Float64PtrInput
	LoadImbalancePercentage     pulumi.Float64PtrInput
	MaxUMultiplicativeIncrement pulumi.Float64PtrInput
	Name                        pulumi.StringPtrInput
	ResourceInstances           GtmResourceResourceInstanceArrayInput
	Type                        pulumi.StringPtrInput
	UpperBound                  pulumi.IntPtrInput
	WaitOnComplete              pulumi.BoolPtrInput
}

func (GtmResourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*gtmResourceState)(nil)).Elem()
}

type gtmResourceArgs struct {
	AggregationType             string                        `pulumi:"aggregationType"`
	ConstrainedProperty         *string                       `pulumi:"constrainedProperty"`
	DecayRate                   *float64                      `pulumi:"decayRate"`
	Description                 *string                       `pulumi:"description"`
	Domain                      string                        `pulumi:"domain"`
	HostHeader                  *string                       `pulumi:"hostHeader"`
	LeaderString                *string                       `pulumi:"leaderString"`
	LeastSquaresDecay           *float64                      `pulumi:"leastSquaresDecay"`
	LoadImbalancePercentage     *float64                      `pulumi:"loadImbalancePercentage"`
	MaxUMultiplicativeIncrement *float64                      `pulumi:"maxUMultiplicativeIncrement"`
	Name                        *string                       `pulumi:"name"`
	ResourceInstances           []GtmResourceResourceInstance `pulumi:"resourceInstances"`
	Type                        string                        `pulumi:"type"`
	UpperBound                  *int                          `pulumi:"upperBound"`
	WaitOnComplete              *bool                         `pulumi:"waitOnComplete"`
}

// The set of arguments for constructing a GtmResource resource.
type GtmResourceArgs struct {
	AggregationType             pulumi.StringInput
	ConstrainedProperty         pulumi.StringPtrInput
	DecayRate                   pulumi.Float64PtrInput
	Description                 pulumi.StringPtrInput
	Domain                      pulumi.StringInput
	HostHeader                  pulumi.StringPtrInput
	LeaderString                pulumi.StringPtrInput
	LeastSquaresDecay           pulumi.Float64PtrInput
	LoadImbalancePercentage     pulumi.Float64PtrInput
	MaxUMultiplicativeIncrement pulumi.Float64PtrInput
	Name                        pulumi.StringPtrInput
	ResourceInstances           GtmResourceResourceInstanceArrayInput
	Type                        pulumi.StringInput
	UpperBound                  pulumi.IntPtrInput
	WaitOnComplete              pulumi.BoolPtrInput
}

func (GtmResourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gtmResourceArgs)(nil)).Elem()
}

type GtmResourceInput interface {
	pulumi.Input

	ToGtmResourceOutput() GtmResourceOutput
	ToGtmResourceOutputWithContext(ctx context.Context) GtmResourceOutput
}

func (*GtmResource) ElementType() reflect.Type {
	return reflect.TypeOf((**GtmResource)(nil)).Elem()
}

func (i *GtmResource) ToGtmResourceOutput() GtmResourceOutput {
	return i.ToGtmResourceOutputWithContext(context.Background())
}

func (i *GtmResource) ToGtmResourceOutputWithContext(ctx context.Context) GtmResourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmResourceOutput)
}

// GtmResourceArrayInput is an input type that accepts GtmResourceArray and GtmResourceArrayOutput values.
// You can construct a concrete instance of `GtmResourceArrayInput` via:
//
//	GtmResourceArray{ GtmResourceArgs{...} }
type GtmResourceArrayInput interface {
	pulumi.Input

	ToGtmResourceArrayOutput() GtmResourceArrayOutput
	ToGtmResourceArrayOutputWithContext(context.Context) GtmResourceArrayOutput
}

type GtmResourceArray []GtmResourceInput

func (GtmResourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GtmResource)(nil)).Elem()
}

func (i GtmResourceArray) ToGtmResourceArrayOutput() GtmResourceArrayOutput {
	return i.ToGtmResourceArrayOutputWithContext(context.Background())
}

func (i GtmResourceArray) ToGtmResourceArrayOutputWithContext(ctx context.Context) GtmResourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmResourceArrayOutput)
}

// GtmResourceMapInput is an input type that accepts GtmResourceMap and GtmResourceMapOutput values.
// You can construct a concrete instance of `GtmResourceMapInput` via:
//
//	GtmResourceMap{ "key": GtmResourceArgs{...} }
type GtmResourceMapInput interface {
	pulumi.Input

	ToGtmResourceMapOutput() GtmResourceMapOutput
	ToGtmResourceMapOutputWithContext(context.Context) GtmResourceMapOutput
}

type GtmResourceMap map[string]GtmResourceInput

func (GtmResourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GtmResource)(nil)).Elem()
}

func (i GtmResourceMap) ToGtmResourceMapOutput() GtmResourceMapOutput {
	return i.ToGtmResourceMapOutputWithContext(context.Background())
}

func (i GtmResourceMap) ToGtmResourceMapOutputWithContext(ctx context.Context) GtmResourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmResourceMapOutput)
}

type GtmResourceOutput struct{ *pulumi.OutputState }

func (GtmResourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GtmResource)(nil)).Elem()
}

func (o GtmResourceOutput) ToGtmResourceOutput() GtmResourceOutput {
	return o
}

func (o GtmResourceOutput) ToGtmResourceOutputWithContext(ctx context.Context) GtmResourceOutput {
	return o
}

func (o GtmResourceOutput) AggregationType() pulumi.StringOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringOutput { return v.AggregationType }).(pulumi.StringOutput)
}

func (o GtmResourceOutput) ConstrainedProperty() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringPtrOutput { return v.ConstrainedProperty }).(pulumi.StringPtrOutput)
}

func (o GtmResourceOutput) DecayRate() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.Float64PtrOutput { return v.DecayRate }).(pulumi.Float64PtrOutput)
}

func (o GtmResourceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o GtmResourceOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

func (o GtmResourceOutput) HostHeader() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringPtrOutput { return v.HostHeader }).(pulumi.StringPtrOutput)
}

func (o GtmResourceOutput) LeaderString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringPtrOutput { return v.LeaderString }).(pulumi.StringPtrOutput)
}

func (o GtmResourceOutput) LeastSquaresDecay() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.Float64PtrOutput { return v.LeastSquaresDecay }).(pulumi.Float64PtrOutput)
}

func (o GtmResourceOutput) LoadImbalancePercentage() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.Float64PtrOutput { return v.LoadImbalancePercentage }).(pulumi.Float64PtrOutput)
}

func (o GtmResourceOutput) MaxUMultiplicativeIncrement() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.Float64PtrOutput { return v.MaxUMultiplicativeIncrement }).(pulumi.Float64PtrOutput)
}

func (o GtmResourceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o GtmResourceOutput) ResourceInstances() GtmResourceResourceInstanceArrayOutput {
	return o.ApplyT(func(v *GtmResource) GtmResourceResourceInstanceArrayOutput { return v.ResourceInstances }).(GtmResourceResourceInstanceArrayOutput)
}

func (o GtmResourceOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o GtmResourceOutput) UpperBound() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.IntPtrOutput { return v.UpperBound }).(pulumi.IntPtrOutput)
}

func (o GtmResourceOutput) WaitOnComplete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GtmResource) pulumi.BoolPtrOutput { return v.WaitOnComplete }).(pulumi.BoolPtrOutput)
}

type GtmResourceArrayOutput struct{ *pulumi.OutputState }

func (GtmResourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GtmResource)(nil)).Elem()
}

func (o GtmResourceArrayOutput) ToGtmResourceArrayOutput() GtmResourceArrayOutput {
	return o
}

func (o GtmResourceArrayOutput) ToGtmResourceArrayOutputWithContext(ctx context.Context) GtmResourceArrayOutput {
	return o
}

func (o GtmResourceArrayOutput) Index(i pulumi.IntInput) GtmResourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GtmResource {
		return vs[0].([]*GtmResource)[vs[1].(int)]
	}).(GtmResourceOutput)
}

type GtmResourceMapOutput struct{ *pulumi.OutputState }

func (GtmResourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GtmResource)(nil)).Elem()
}

func (o GtmResourceMapOutput) ToGtmResourceMapOutput() GtmResourceMapOutput {
	return o
}

func (o GtmResourceMapOutput) ToGtmResourceMapOutputWithContext(ctx context.Context) GtmResourceMapOutput {
	return o
}

func (o GtmResourceMapOutput) MapIndex(k pulumi.StringInput) GtmResourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GtmResource {
		return vs[0].(map[string]*GtmResource)[vs[1].(string)]
	}).(GtmResourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GtmResourceInput)(nil)).Elem(), &GtmResource{})
	pulumi.RegisterInputType(reflect.TypeOf((*GtmResourceArrayInput)(nil)).Elem(), GtmResourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GtmResourceMapInput)(nil)).Elem(), GtmResourceMap{})
	pulumi.RegisterOutputType(GtmResourceOutput{})
	pulumi.RegisterOutputType(GtmResourceArrayOutput{})
	pulumi.RegisterOutputType(GtmResourceMapOutput{})
}
