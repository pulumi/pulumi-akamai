// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudwrapperCapacitiesCapacityApprovedArgs : global::Pulumi.InvokeArgs
    {
        [Input("unit", required: true)]
        public string Unit { get; set; } = null!;

        [Input("value", required: true)]
        public int Value { get; set; }

        public GetCloudwrapperCapacitiesCapacityApprovedArgs()
        {
        }
        public static new GetCloudwrapperCapacitiesCapacityApprovedArgs Empty => new GetCloudwrapperCapacitiesCapacityApprovedArgs();
    }
}
