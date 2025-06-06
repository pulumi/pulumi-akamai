// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class CloudwrapperConfigurationLocationCapacityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unit of capacity. Can be either 'GB' or 'TB'.
        /// </summary>
        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        /// <summary>
        /// Value of capacity.
        /// </summary>
        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public CloudwrapperConfigurationLocationCapacityArgs()
        {
        }
        public static new CloudwrapperConfigurationLocationCapacityArgs Empty => new CloudwrapperConfigurationLocationCapacityArgs();
    }
}
