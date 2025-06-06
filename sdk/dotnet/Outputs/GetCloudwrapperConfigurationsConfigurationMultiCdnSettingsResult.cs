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
    public sealed class GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsResult
    {
        /// <summary>
        /// Specify diagnostic data beacons details.
        /// </summary>
        public readonly Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccResult? Bocc;
        /// <summary>
        /// List of CDN added for the configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnResult> Cdns;
        /// <summary>
        /// Specifies data streams details.
        /// </summary>
        public readonly Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreamsResult? DataStreams;
        /// <summary>
        /// Option to opt out of alerts based on soft limits of bandwidth usage.
        /// </summary>
        public readonly bool EnableSoftAlerts;
        /// <summary>
        /// List of origins corresponding to the properties selected in the configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOriginResult> Origins;

        [OutputConstructor]
        private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsResult(
            Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsBoccResult? bocc,

            ImmutableArray<Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnResult> cdns,

            Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsDataStreamsResult? dataStreams,

            bool enableSoftAlerts,

            ImmutableArray<Outputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsOriginResult> origins)
        {
            Bocc = bocc;
            Cdns = cdns;
            DataStreams = dataStreams;
            EnableSoftAlerts = enableSoftAlerts;
            Origins = origins;
        }
    }
}
