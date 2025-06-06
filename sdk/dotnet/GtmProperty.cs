// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/gtmProperty:GtmProperty")]
    public partial class GtmProperty : global::Pulumi.CustomResource
    {
        [Output("backupCname")]
        public Output<string?> BackupCname { get; private set; } = null!;

        [Output("backupIp")]
        public Output<string?> BackupIp { get; private set; } = null!;

        [Output("balanceByDownloadScore")]
        public Output<bool?> BalanceByDownloadScore { get; private set; } = null!;

        [Output("cname")]
        public Output<string?> Cname { get; private set; } = null!;

        [Output("comments")]
        public Output<string?> Comments { get; private set; } = null!;

        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        [Output("dynamicTtl")]
        public Output<int?> DynamicTtl { get; private set; } = null!;

        [Output("failbackDelay")]
        public Output<int?> FailbackDelay { get; private set; } = null!;

        [Output("failoverDelay")]
        public Output<int?> FailoverDelay { get; private set; } = null!;

        [Output("ghostDemandReporting")]
        public Output<bool?> GhostDemandReporting { get; private set; } = null!;

        [Output("handoutLimit")]
        public Output<int> HandoutLimit { get; private set; } = null!;

        [Output("handoutMode")]
        public Output<string> HandoutMode { get; private set; } = null!;

        [Output("healthMax")]
        public Output<double?> HealthMax { get; private set; } = null!;

        [Output("healthMultiplier")]
        public Output<double?> HealthMultiplier { get; private set; } = null!;

        [Output("healthThreshold")]
        public Output<double?> HealthThreshold { get; private set; } = null!;

        [Output("ipv6")]
        public Output<bool?> Ipv6 { get; private set; } = null!;

        [Output("livenessTests")]
        public Output<ImmutableArray<Outputs.GtmPropertyLivenessTest>> LivenessTests { get; private set; } = null!;

        [Output("loadImbalancePercentage")]
        public Output<double?> LoadImbalancePercentage { get; private set; } = null!;

        [Output("mapName")]
        public Output<string?> MapName { get; private set; } = null!;

        [Output("maxUnreachablePenalty")]
        public Output<int?> MaxUnreachablePenalty { get; private set; } = null!;

        [Output("minLiveFraction")]
        public Output<double?> MinLiveFraction { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("scoreAggregationType")]
        public Output<string> ScoreAggregationType { get; private set; } = null!;

        [Output("staticRrSets")]
        public Output<ImmutableArray<Outputs.GtmPropertyStaticRrSet>> StaticRrSets { get; private set; } = null!;

        [Output("stickinessBonusConstant")]
        public Output<int?> StickinessBonusConstant { get; private set; } = null!;

        [Output("stickinessBonusPercentage")]
        public Output<int?> StickinessBonusPercentage { get; private set; } = null!;

        [Output("trafficTargets")]
        public Output<ImmutableArray<Outputs.GtmPropertyTrafficTarget>> TrafficTargets { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("unreachableThreshold")]
        public Output<double?> UnreachableThreshold { get; private set; } = null!;

        [Output("useComputedTargets")]
        public Output<bool?> UseComputedTargets { get; private set; } = null!;

        [Output("waitOnComplete")]
        public Output<bool?> WaitOnComplete { get; private set; } = null!;

        [Output("weightedHashBitsForIpv4")]
        public Output<int> WeightedHashBitsForIpv4 { get; private set; } = null!;

        [Output("weightedHashBitsForIpv6")]
        public Output<int> WeightedHashBitsForIpv6 { get; private set; } = null!;


        /// <summary>
        /// Create a GtmProperty resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GtmProperty(string name, GtmPropertyArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/gtmProperty:GtmProperty", name, args ?? new GtmPropertyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GtmProperty(string name, Input<string> id, GtmPropertyState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/gtmProperty:GtmProperty", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "akamai:trafficmanagement/gtmProperty:GtmProperty" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GtmProperty resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GtmProperty Get(string name, Input<string> id, GtmPropertyState? state = null, CustomResourceOptions? options = null)
        {
            return new GtmProperty(name, id, state, options);
        }
    }

    public sealed class GtmPropertyArgs : global::Pulumi.ResourceArgs
    {
        [Input("backupCname")]
        public Input<string>? BackupCname { get; set; }

        [Input("backupIp")]
        public Input<string>? BackupIp { get; set; }

        [Input("balanceByDownloadScore")]
        public Input<bool>? BalanceByDownloadScore { get; set; }

        [Input("cname")]
        public Input<string>? Cname { get; set; }

        [Input("comments")]
        public Input<string>? Comments { get; set; }

        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        [Input("dynamicTtl")]
        public Input<int>? DynamicTtl { get; set; }

        [Input("failbackDelay")]
        public Input<int>? FailbackDelay { get; set; }

        [Input("failoverDelay")]
        public Input<int>? FailoverDelay { get; set; }

        [Input("ghostDemandReporting")]
        public Input<bool>? GhostDemandReporting { get; set; }

        [Input("handoutLimit", required: true)]
        public Input<int> HandoutLimit { get; set; } = null!;

        [Input("handoutMode", required: true)]
        public Input<string> HandoutMode { get; set; } = null!;

        [Input("healthMax")]
        public Input<double>? HealthMax { get; set; }

        [Input("healthMultiplier")]
        public Input<double>? HealthMultiplier { get; set; }

        [Input("healthThreshold")]
        public Input<double>? HealthThreshold { get; set; }

        [Input("ipv6")]
        public Input<bool>? Ipv6 { get; set; }

        [Input("livenessTests")]
        private InputList<Inputs.GtmPropertyLivenessTestArgs>? _livenessTests;
        public InputList<Inputs.GtmPropertyLivenessTestArgs> LivenessTests
        {
            get => _livenessTests ?? (_livenessTests = new InputList<Inputs.GtmPropertyLivenessTestArgs>());
            set => _livenessTests = value;
        }

        [Input("loadImbalancePercentage")]
        public Input<double>? LoadImbalancePercentage { get; set; }

        [Input("mapName")]
        public Input<string>? MapName { get; set; }

        [Input("maxUnreachablePenalty")]
        public Input<int>? MaxUnreachablePenalty { get; set; }

        [Input("minLiveFraction")]
        public Input<double>? MinLiveFraction { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scoreAggregationType", required: true)]
        public Input<string> ScoreAggregationType { get; set; } = null!;

        [Input("staticRrSets")]
        private InputList<Inputs.GtmPropertyStaticRrSetArgs>? _staticRrSets;
        public InputList<Inputs.GtmPropertyStaticRrSetArgs> StaticRrSets
        {
            get => _staticRrSets ?? (_staticRrSets = new InputList<Inputs.GtmPropertyStaticRrSetArgs>());
            set => _staticRrSets = value;
        }

        [Input("stickinessBonusConstant")]
        public Input<int>? StickinessBonusConstant { get; set; }

        [Input("stickinessBonusPercentage")]
        public Input<int>? StickinessBonusPercentage { get; set; }

        [Input("trafficTargets")]
        private InputList<Inputs.GtmPropertyTrafficTargetArgs>? _trafficTargets;
        public InputList<Inputs.GtmPropertyTrafficTargetArgs> TrafficTargets
        {
            get => _trafficTargets ?? (_trafficTargets = new InputList<Inputs.GtmPropertyTrafficTargetArgs>());
            set => _trafficTargets = value;
        }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("unreachableThreshold")]
        public Input<double>? UnreachableThreshold { get; set; }

        [Input("useComputedTargets")]
        public Input<bool>? UseComputedTargets { get; set; }

        [Input("waitOnComplete")]
        public Input<bool>? WaitOnComplete { get; set; }

        public GtmPropertyArgs()
        {
        }
        public static new GtmPropertyArgs Empty => new GtmPropertyArgs();
    }

    public sealed class GtmPropertyState : global::Pulumi.ResourceArgs
    {
        [Input("backupCname")]
        public Input<string>? BackupCname { get; set; }

        [Input("backupIp")]
        public Input<string>? BackupIp { get; set; }

        [Input("balanceByDownloadScore")]
        public Input<bool>? BalanceByDownloadScore { get; set; }

        [Input("cname")]
        public Input<string>? Cname { get; set; }

        [Input("comments")]
        public Input<string>? Comments { get; set; }

        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("dynamicTtl")]
        public Input<int>? DynamicTtl { get; set; }

        [Input("failbackDelay")]
        public Input<int>? FailbackDelay { get; set; }

        [Input("failoverDelay")]
        public Input<int>? FailoverDelay { get; set; }

        [Input("ghostDemandReporting")]
        public Input<bool>? GhostDemandReporting { get; set; }

        [Input("handoutLimit")]
        public Input<int>? HandoutLimit { get; set; }

        [Input("handoutMode")]
        public Input<string>? HandoutMode { get; set; }

        [Input("healthMax")]
        public Input<double>? HealthMax { get; set; }

        [Input("healthMultiplier")]
        public Input<double>? HealthMultiplier { get; set; }

        [Input("healthThreshold")]
        public Input<double>? HealthThreshold { get; set; }

        [Input("ipv6")]
        public Input<bool>? Ipv6 { get; set; }

        [Input("livenessTests")]
        private InputList<Inputs.GtmPropertyLivenessTestGetArgs>? _livenessTests;
        public InputList<Inputs.GtmPropertyLivenessTestGetArgs> LivenessTests
        {
            get => _livenessTests ?? (_livenessTests = new InputList<Inputs.GtmPropertyLivenessTestGetArgs>());
            set => _livenessTests = value;
        }

        [Input("loadImbalancePercentage")]
        public Input<double>? LoadImbalancePercentage { get; set; }

        [Input("mapName")]
        public Input<string>? MapName { get; set; }

        [Input("maxUnreachablePenalty")]
        public Input<int>? MaxUnreachablePenalty { get; set; }

        [Input("minLiveFraction")]
        public Input<double>? MinLiveFraction { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scoreAggregationType")]
        public Input<string>? ScoreAggregationType { get; set; }

        [Input("staticRrSets")]
        private InputList<Inputs.GtmPropertyStaticRrSetGetArgs>? _staticRrSets;
        public InputList<Inputs.GtmPropertyStaticRrSetGetArgs> StaticRrSets
        {
            get => _staticRrSets ?? (_staticRrSets = new InputList<Inputs.GtmPropertyStaticRrSetGetArgs>());
            set => _staticRrSets = value;
        }

        [Input("stickinessBonusConstant")]
        public Input<int>? StickinessBonusConstant { get; set; }

        [Input("stickinessBonusPercentage")]
        public Input<int>? StickinessBonusPercentage { get; set; }

        [Input("trafficTargets")]
        private InputList<Inputs.GtmPropertyTrafficTargetGetArgs>? _trafficTargets;
        public InputList<Inputs.GtmPropertyTrafficTargetGetArgs> TrafficTargets
        {
            get => _trafficTargets ?? (_trafficTargets = new InputList<Inputs.GtmPropertyTrafficTargetGetArgs>());
            set => _trafficTargets = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("unreachableThreshold")]
        public Input<double>? UnreachableThreshold { get; set; }

        [Input("useComputedTargets")]
        public Input<bool>? UseComputedTargets { get; set; }

        [Input("waitOnComplete")]
        public Input<bool>? WaitOnComplete { get; set; }

        [Input("weightedHashBitsForIpv4")]
        public Input<int>? WeightedHashBitsForIpv4 { get; set; }

        [Input("weightedHashBitsForIpv6")]
        public Input<int>? WeightedHashBitsForIpv6 { get; set; }

        public GtmPropertyState()
        {
        }
        public static new GtmPropertyState Empty => new GtmPropertyState();
    }
}
