// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v9/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetIamRoles(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetIamRolesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIamRolesResult
	err := ctx.Invoke("akamai:index/getIamRoles:getIamRoles", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getIamRoles.
type GetIamRolesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id    string            `pulumi:"id"`
	Roles []GetIamRolesRole `pulumi:"roles"`
}

func GetIamRolesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetIamRolesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetIamRolesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("akamai:index/getIamRoles:getIamRoles", nil, GetIamRolesResultOutput{}, options).(GetIamRolesResultOutput), nil
	}).(GetIamRolesResultOutput)
}

// A collection of values returned by getIamRoles.
type GetIamRolesResultOutput struct{ *pulumi.OutputState }

func (GetIamRolesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIamRolesResult)(nil)).Elem()
}

func (o GetIamRolesResultOutput) ToGetIamRolesResultOutput() GetIamRolesResultOutput {
	return o
}

func (o GetIamRolesResultOutput) ToGetIamRolesResultOutputWithContext(ctx context.Context) GetIamRolesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetIamRolesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIamRolesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIamRolesResultOutput) Roles() GetIamRolesRoleArrayOutput {
	return o.ApplyT(func(v GetIamRolesResult) []GetIamRolesRole { return v.Roles }).(GetIamRolesRoleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIamRolesResultOutput{})
}
