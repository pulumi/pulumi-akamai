// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230920BehaviorEdgeRedirectorCloudletPolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("id")]
        public int? Id { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        public GetPropertyRulesBuilderRulesV20230920BehaviorEdgeRedirectorCloudletPolicyArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230920BehaviorEdgeRedirectorCloudletPolicyArgs Empty => new GetPropertyRulesBuilderRulesV20230920BehaviorEdgeRedirectorCloudletPolicyArgs();
    }
}
