// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    /// <summary>
    /// Use the `akamai.GtmProperty` resource provides the resource for creating, configuring and importing a GTM property, a set of IP addresses or CNAMEs that GTM provides in response to DNS queries based on a set of rules.
    /// 
    /// &gt; **Note** Import requires an ID with this format: `existing_domain_name`:`existing_property_name`.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Akamai = Pulumi.Akamai;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var demoProperty = new Akamai.GtmProperty("demoProperty", new Akamai.GtmPropertyArgs
    ///         {
    ///             Domain = "demo_domain.akadns.net",
    ///             HandoutLimit = 5,
    ///             HandoutMode = "normal",
    ///             ScoreAggregationType = "median",
    ///             TrafficTargets = 
    ///             {
    ///                 new Akamai.Inputs.GtmPropertyTrafficTargetArgs
    ///                 {
    ///                     DatacenterId = 3131,
    ///                 },
    ///             },
    ///             Type = "weighted-round-robin",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Argument reference
    /// 
    /// This resource supports these arguments:
    /// 
    /// * `domain` - (Required) DNS name for the GTM Domain set that includes this Property.
    /// * `name` - (Required) DNS name for a collection of IP address or CNAME responses. The value, together with the GTM domainName, forms the Property’s hostname.
    /// * `type` - (Required) Specifies the load balancing behavior for the property. Either failover, geographic, cidrmapping, weighted-round-robin, weighted-hashed, weighted-round-robin-load-feedback, qtr, or performance.
    /// * `score_aggregation_type` - (Required) Specifies how GTM aggregates liveness test scores across different tests, when multiple tests are configured.
    /// * `handout_limit` - (Required) Indicates the limit for the number of live IPs handed out to a DNS request.
    /// * `handout_mode` - (Required) Specifies how IPs are returned when more than one IP is alive and available.
    /// * `traffic_target` - (Required) Contains information about where to direct data center traffic. You can have multiple `traffic_target` arguments. If used, requires these arguments:
    ///   * `datacenter_id` - (Required) A unique identifier for an existing data center in the domain.
    ///   * `enabled` - (Required) A boolean indicating whether the traffic target is used. You can also omit the traffic target, which has the same result as the false value.
    ///   * `weight` - (Required) Specifies the traffic weight for the target.
    ///   * `servers` - (Required) (List) Identifies the IP address or the hostnames of the servers.
    ///   * `name` - (Required) An alternative label for the traffic target.
    ///   * `handout_cname` - (Required) Specifies an optional data center for the property. Used when there are no servers configured for the property.
    /// * `liveness_test` - (Optional) Contains information about the liveness tests, which are run periodically to determine whether your servers respond to requests. You can have multiple `liveness_test` arguments. If used, requires these arguments:
    ///   * `name` - (Optional) A descriptive name for the liveness test.
    ///   * `test_interval` - (Optional) Indicates the interval at which the liveness test is run, in seconds. Requires a minimum of 10 seconds.
    ///   * `test_object_protocol` - (Optional) Specifies the test protocol. Possible values include `DNS`, `HTTP`, `HTTPS`, `FTP`, `POP`, `POPS`, `SMTP`, `SMTPS`, `TCP`, or `TCPS`.
    ///   * `test_timeout` - (Optional) Specifies the duration of the liveness test before it fails. The range is from 0.001 to 60 seconds.
    ///   * `answers_required` - (Optional) If `test_object_protocol` is DNS, enter a boolean value if an answer is needed for the DNS query to be successful.
    ///   * `disabled` - (Optional) A boolean indicating whether the liveness test is disabled. When disabled, GTM stops running the test, effectively treating it as if it no longer exists.
    ///   * `disable_nonstandard_port_warning` - (Optional) A boolean that if set to `true`, disables warnings when non-standard ports are used.
    ///   * `error_penalty` - (Optional) Specifies the score that’s reported if the liveness test encounters an error other than timeout, such as connection refused, and 404.
    ///   * `http_header` - (Optional) Contains HTTP headers to send if the `test_object_protocol` is `http` or `https`. You can have multiple `http_header` entries. Requires these arguments:
    ///     * `name` - Name of HTTP header.
    ///     * `value` - Value of HTTP header.
    ///   * `http_error3xx` - (Optional) A boolean that if set to `true`, treats a 3xx HTTP response as a failure if the `test_object_protocol` is `http`, `https`, or `ftp`.
    ///   * `http_error4xx` - (Optional) A boolean that if set to `true`, treats a 4xx HTTP response as a failure if the `test_object_protocol` is `http`, `https`, or `ftp`.
    ///   * `http_error5xx` - (Optional) A boolean that if set to `true`, treats a 5xx HTTP response as a failure if the `test_object_protocol` is `http`, `https`, or `ftp`.
    ///   * `peer_certificate_verification` - (Optional) A boolean that if set to `true`, validates the origin certificate. Applies only to tests with `test_object_protocol` of https.
    ///   * `recursion_requested` - (Optional) A boolean indicating whether the `test_object_protocol` is DNS. The DNS query is recursive.
    ///   * `request_string` - (Optional) Specifies a request string.
    ///   * `resource_type` - (Optional) Specifies the query type, if `test_object_protocol` is DNS.
    ///   * `response_string` - (Optional) Specifies a response string.
    ///   * `ssl_client_certificate` - (Optional) Indicates a Base64-encoded certificate. SSL client certificates are available for livenessTests that use secure protocols.
    ///   * `ssl_client_private_key` - (Optional) Indicates a Base64-encoded private key. The private key used to generate or request a certificate for livenessTests can’t have a passphrase nor be used for any other purpose.
    ///   * `test_object` - (Optional) Specifies the static text that acts as a stand-in for the data that you’re sending on the network.
    ///   * `test_object_password` - (Optional) Specifies the test object’s password. It is required if testObjectProtocol is ftp.
    ///   * `test_object_port` - (Optional) Specifies the port number for the testObject.
    ///   * `test_object_username` - (Optional) A descriptive name for the testObject.
    ///   * `timeout_penalty`- (Optional) Specifies the score to be reported if the liveness test times out.
    /// * `wait_on_complete` - (Optional) A boolean indicating whether to wait for transaction to complete. Set to `true` by default.
    /// * `failover_delay` - (Optional) Specifies the failover delay in seconds.
    /// * `failback_delay` - (Optional) Specifies the failback delay in seconds.
    /// * `ipv6` - (Optional) A boolean that indicates the type of IP address handed out by a GTM property.
    /// * `stickiness_bonus_percentage` - (Optional) Specifies a percentage used to configure data center affinity.
    /// * `stickiness_bonus_constant` - (Optional) Specifies a constant used to configure data center affinity.
    /// * `health_threshold` - (Optional) Configures a cutoff value that is computed from the median scores.
    /// * `use_computed_targets` - (Optional) For load-feedback domains only, a boolean that indicates whether you want GTM to automatically compute target load.
    /// * `backup_ip` - Specifies a backup IP. When GTM declares that all of the targets are down, the backupIP is handed out.
    /// * `balance_by_download_score` - (Optional) A boolean that indicates whether download score based load balancing is enabled.
    /// * `unreachable_threshold` - (Optional) For performance domains, this specifies a penalty value that’s added to liveness test scores when data centers have an aggregated loss fraction higher than this value.
    /// * `health_multiplier` - (Optional) Configures a cutoff value that is computed from the median scores.
    /// * `dynamic_ttl` - (Optional) Indicates the TTL in seconds for records that might change dynamically based on liveness and load balancing such as A and AAAA records, and CNAMEs.
    /// * `max_unreachable_penalty` - (Optional) For performance domains, this specifies a penalty value that’s added to liveness test scores when data centers show an aggregated loss fraction higher than the penalty value.
    /// * `map_name` - (Optional) A descriptive label for a GeographicMap or a CidrMap that’s required if the property is either geographic or cidrmapping, in which case mapName needs to reference either an existing GeographicMap or CidrMap in the same domain.
    /// * `load_imbalance_percentage` - (Optional) Indicates the percent of load imbalance factor (LIF) for the property.
    /// * `health_max` - (Optional) Defines the absolute limit beyond which IPs are declared unhealthy.
    /// * `cname` - (Optional) Indicates the fully qualified name aliased to a particular property.
    /// * `comments` - (Optional) A descriptive note about changes to the domain. The maximum is 4000 characters.
    /// * `ghost_demand_reporting` - (Optional) Use load estimates from Akamai Ghost utilization messages.
    /// * `min_live_fraction` - (Optional) Specifies what fraction of the servers need to respond to requests so GTM considers the data center up and able to receive traffic.
    /// * `static_rr_set` - (Optional) Contains static record sets. You can have multiple `static_rr_set` entries. Requires these arguments:
    ///   * `type` - (Optional) The record type.
    ///   * `ttl` - (Optional) The number of seconds that this record should live in a resolver’s cache before being refetched.
    ///   * `rdata` - (Optional) (List) An array of data strings, representing multiple records within a set.
    /// 
    /// ## Attribute reference
    /// 
    /// This resource returns these computed attributes in the state file:
    /// 
    /// * `weighted_hash_bits_for_ipv4`
    /// * `weighted_hash_bits_for_ipv6`
    /// 
    /// ## Schema reference
    /// 
    /// You can download the GTM Property backing schema from the [Global Traffic Management API](https://developer.akamai.com/api/web_performance/global_traffic_management/v1.html#property) page.
    /// </summary>
    [AkamaiResourceType("akamai:index/gtmProperty:GtmProperty")]
    public partial class GtmProperty : Pulumi.CustomResource
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

        [Output("staticTtl")]
        public Output<int?> StaticTtl { get; private set; } = null!;

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
                    new Pulumi.Alias { Type = "akamai:trafficmanagement/gtmProperty:GtmProperty"},
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

    public sealed class GtmPropertyArgs : Pulumi.ResourceArgs
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

        [Input("staticTtl")]
        public Input<int>? StaticTtl { get; set; }

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
    }

    public sealed class GtmPropertyState : Pulumi.ResourceArgs
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

        [Input("staticTtl")]
        public Input<int>? StaticTtl { get; set; }

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
    }
}
