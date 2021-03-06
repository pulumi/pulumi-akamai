// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `GtmResource` lets you create, configure, and import a GTM resource. In GTM, a resource is anything you can measure whose scarcity affects load balancing. Examples of resources include bandwidth, CPU load average, database queries per second, or disk operations per second.
//
// > **Note** Import requires an ID with this format: `existingDomainName`:
// `existingResourceName`.
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
// 		_, err := akamai.NewGtmResource(ctx, "demoResource", &akamai.GtmResourceArgs{
// 			AggregationType: pulumi.String("latest"),
// 			Domain:          pulumi.String("demo_domain.akadns.net"),
// 			Type:            pulumi.String("XML load object via HTTP"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Argument reference
//
// This resource supports these arguments:
//
// * `domain` - (Required) DNS name for the GTM Domain set that includes this property.
// * `name` - (Required) A descriptive label for the GTM resource.
// * `aggregationType` - (Required) Specifies how GTM handles different load numbers when multiple load servers are used for a data center or property.
// * `type` - (Required) Indicates the kind of `loadObject` format used to determine the load on the resource.
// * `waitOnComplete` - (Optional) A boolean indicating whether to wait for transaction to complete. Set to `true` by default.
// * `resourceInstance`  - (Optional) (multiple allowed) Contains information about the resources that constrain the properties within the data center. You can have multiple `resourceInstance` entries. Requires these arguments:
//   * `datacenterId` - (Optional) A unique identifier for an existing data center in the domain.
//   * `loadObject` - (Optional) Identifies the load object file used to report real-time information about the current load, maximum allowable load, and target load on each resource.
//   * `loadObjectPort` - (Optional) Specifies the TCP port of the `loadObject`.
//   * `loadServers` - (Optional) (List) Specifies a list of servers from which to request the load object.
//   * `useDefaultLoadObject` - (Optional) A boolean that indicates whether a default `loadObject` is used for the resources.
// * `hostHeader` - (Optional) Optionally specifies the host header used when fetching the load object.
// * `leastSquaresDecay` - (Optional) For internal use only. Unless Akamai indicates otherwise, omit the value or set it to null.
// * `upperBound` - (Optional) An optional sanity check that specifies the maximum allowed value for any component of the load object.
// * `description` - (Optional) A descriptive note to help you track what the resource constrains.
// * `leaderString` - (Optional) Specifies the text that comes before the `loadObject`.
// * `constrainedProperty` - (Optional) Specifies the name of the property that this resource constrains, enter `**` to constrain all properties.
// * `loadImbalancePercent` - (Optional) Indicates the percent of load imbalance factor (LIF) for the property.
// * `maxUMultiplicativeIncrement` - (Optional) For Akamai internal use only. You can omit the value or set it to `null`.
// * `decayRate` - (Optional) For Akamai internal use only. You can omit the value or set it to `null`.
//
// ## Schema reference
//
// You can download the GTM Resource backing schema from the [Global Traffic Management API](https://developer.akamai.com/api/web_performance/global_traffic_management/v1.html#resource) page.
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
	return reflect.TypeOf((*GtmResource)(nil))
}

func (i *GtmResource) ToGtmResourceOutput() GtmResourceOutput {
	return i.ToGtmResourceOutputWithContext(context.Background())
}

func (i *GtmResource) ToGtmResourceOutputWithContext(ctx context.Context) GtmResourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmResourceOutput)
}

func (i *GtmResource) ToGtmResourcePtrOutput() GtmResourcePtrOutput {
	return i.ToGtmResourcePtrOutputWithContext(context.Background())
}

func (i *GtmResource) ToGtmResourcePtrOutputWithContext(ctx context.Context) GtmResourcePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmResourcePtrOutput)
}

type GtmResourcePtrInput interface {
	pulumi.Input

	ToGtmResourcePtrOutput() GtmResourcePtrOutput
	ToGtmResourcePtrOutputWithContext(ctx context.Context) GtmResourcePtrOutput
}

type gtmResourcePtrType GtmResourceArgs

func (*gtmResourcePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**GtmResource)(nil))
}

func (i *gtmResourcePtrType) ToGtmResourcePtrOutput() GtmResourcePtrOutput {
	return i.ToGtmResourcePtrOutputWithContext(context.Background())
}

func (i *gtmResourcePtrType) ToGtmResourcePtrOutputWithContext(ctx context.Context) GtmResourcePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmResourcePtrOutput)
}

// GtmResourceArrayInput is an input type that accepts GtmResourceArray and GtmResourceArrayOutput values.
// You can construct a concrete instance of `GtmResourceArrayInput` via:
//
//          GtmResourceArray{ GtmResourceArgs{...} }
type GtmResourceArrayInput interface {
	pulumi.Input

	ToGtmResourceArrayOutput() GtmResourceArrayOutput
	ToGtmResourceArrayOutputWithContext(context.Context) GtmResourceArrayOutput
}

type GtmResourceArray []GtmResourceInput

func (GtmResourceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*GtmResource)(nil))
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
//          GtmResourceMap{ "key": GtmResourceArgs{...} }
type GtmResourceMapInput interface {
	pulumi.Input

	ToGtmResourceMapOutput() GtmResourceMapOutput
	ToGtmResourceMapOutputWithContext(context.Context) GtmResourceMapOutput
}

type GtmResourceMap map[string]GtmResourceInput

func (GtmResourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*GtmResource)(nil))
}

func (i GtmResourceMap) ToGtmResourceMapOutput() GtmResourceMapOutput {
	return i.ToGtmResourceMapOutputWithContext(context.Background())
}

func (i GtmResourceMap) ToGtmResourceMapOutputWithContext(ctx context.Context) GtmResourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GtmResourceMapOutput)
}

type GtmResourceOutput struct {
	*pulumi.OutputState
}

func (GtmResourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GtmResource)(nil))
}

func (o GtmResourceOutput) ToGtmResourceOutput() GtmResourceOutput {
	return o
}

func (o GtmResourceOutput) ToGtmResourceOutputWithContext(ctx context.Context) GtmResourceOutput {
	return o
}

func (o GtmResourceOutput) ToGtmResourcePtrOutput() GtmResourcePtrOutput {
	return o.ToGtmResourcePtrOutputWithContext(context.Background())
}

func (o GtmResourceOutput) ToGtmResourcePtrOutputWithContext(ctx context.Context) GtmResourcePtrOutput {
	return o.ApplyT(func(v GtmResource) *GtmResource {
		return &v
	}).(GtmResourcePtrOutput)
}

type GtmResourcePtrOutput struct {
	*pulumi.OutputState
}

func (GtmResourcePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GtmResource)(nil))
}

func (o GtmResourcePtrOutput) ToGtmResourcePtrOutput() GtmResourcePtrOutput {
	return o
}

func (o GtmResourcePtrOutput) ToGtmResourcePtrOutputWithContext(ctx context.Context) GtmResourcePtrOutput {
	return o
}

type GtmResourceArrayOutput struct{ *pulumi.OutputState }

func (GtmResourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GtmResource)(nil))
}

func (o GtmResourceArrayOutput) ToGtmResourceArrayOutput() GtmResourceArrayOutput {
	return o
}

func (o GtmResourceArrayOutput) ToGtmResourceArrayOutputWithContext(ctx context.Context) GtmResourceArrayOutput {
	return o
}

func (o GtmResourceArrayOutput) Index(i pulumi.IntInput) GtmResourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GtmResource {
		return vs[0].([]GtmResource)[vs[1].(int)]
	}).(GtmResourceOutput)
}

type GtmResourceMapOutput struct{ *pulumi.OutputState }

func (GtmResourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]GtmResource)(nil))
}

func (o GtmResourceMapOutput) ToGtmResourceMapOutput() GtmResourceMapOutput {
	return o
}

func (o GtmResourceMapOutput) ToGtmResourceMapOutputWithContext(ctx context.Context) GtmResourceMapOutput {
	return o
}

func (o GtmResourceMapOutput) MapIndex(k pulumi.StringInput) GtmResourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) GtmResource {
		return vs[0].(map[string]GtmResource)[vs[1].(string)]
	}).(GtmResourceOutput)
}

func init() {
	pulumi.RegisterOutputType(GtmResourceOutput{})
	pulumi.RegisterOutputType(GtmResourcePtrOutput{})
	pulumi.RegisterOutputType(GtmResourceArrayOutput{})
	pulumi.RegisterOutputType(GtmResourceMapOutput{})
}
