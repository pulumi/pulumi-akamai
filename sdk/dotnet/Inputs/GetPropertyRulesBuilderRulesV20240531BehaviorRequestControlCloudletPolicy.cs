// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlCloudletPolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("id")]
        public int? Id { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        public GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlCloudletPolicyArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlCloudletPolicyArgs Empty => new GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlCloudletPolicyArgs();
    }
}
