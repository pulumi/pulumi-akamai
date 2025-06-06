// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The sampling frequency of requests and forwards for EDGE, MIDGRESS, and ORIGIN beacons.
        /// </summary>
        [Input("conditionalSamplingFrequency", required: true)]
        public Input<string> ConditionalSamplingFrequency { get; set; } = null!;

        /// <summary>
        /// Enable diagnostic data beacons for consumption by the Broadcast Operations Control Center.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Select whether to beacon diagnostics data for internal ORIGIN_ONLY, MIDGRESS_ONLY, or both ORIGIN_AND_MIDGRESS forwards.
        /// </summary>
        [Input("forwardType", required: true)]
        public Input<string> ForwardType { get; set; } = null!;

        /// <summary>
        /// Select whether to beacon diagnostics data for EDGE_ONLY or EDGE_AND_MIDGRESS requests.
        /// </summary>
        [Input("requestType", required: true)]
        public Input<string> RequestType { get; set; } = null!;

        /// <summary>
        /// The sampling frequency of requests and forwards for EDGE, MIDGRESS, and ORIGIN beacons.
        /// </summary>
        [Input("samplingFrequency", required: true)]
        public Input<string> SamplingFrequency { get; set; } = null!;

        public GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccInputArgs()
        {
        }
        public static new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccInputArgs Empty => new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccInputArgs();
    }
}
