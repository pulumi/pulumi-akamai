// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetCloudwrapperConfigurationMultiCdnSettingsDataStreamsResult
    {
        /// <summary>
        /// Unique identifiers of the Data Streams.
        /// </summary>
        public readonly ImmutableArray<int> DataStreamIds;
        /// <summary>
        /// Enables DataStream reporting.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Specifies the percentage of log data you want to collect for this configuration.
        /// </summary>
        public readonly int SamplingRate;

        [OutputConstructor]
        private GetCloudwrapperConfigurationMultiCdnSettingsDataStreamsResult(
            ImmutableArray<int> dataStreamIds,

            bool enabled,

            int samplingRate)
        {
            DataStreamIds = dataStreamIds;
            Enabled = enabled;
            SamplingRate = samplingRate;
        }
    }
}
