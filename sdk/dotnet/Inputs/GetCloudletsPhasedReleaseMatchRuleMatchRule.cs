// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudletsPhasedReleaseMatchRuleMatchRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If set to true, disables a rule so it is not evaluated against incoming requests.
        /// </summary>
        [Input("disabled")]
        public bool? Disabled { get; set; }

        /// <summary>
        /// The end time for this match (in seconds since the epoch)
        /// </summary>
        [Input("end")]
        public int? End { get; set; }

        /// <summary>
        /// This property defines data used to construct a new request URL if all conditions are met. If all of the conditions you set are true, then the Edge Server returns an HTTP response from the rewritten URL
        /// </summary>
        [Input("forwardSettings", required: true)]
        public Inputs.GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettingsArgs ForwardSettings { get; set; } = null!;

        /// <summary>
        /// If using a URL match, this property is the URL that the Cloudlet uses to match the incoming request
        /// </summary>
        [Input("matchUrl")]
        public string? MatchUrl { get; set; }

        [Input("matches")]
        private List<Inputs.GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchArgs>? _matches;

        /// <summary>
        /// Defines a set of match objects
        /// </summary>
        public List<Inputs.GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchArgs> Matches
        {
            get => _matches ?? (_matches = new List<Inputs.GetCloudletsPhasedReleaseMatchRuleMatchRuleMatchArgs>());
            set => _matches = value;
        }

        /// <summary>
        /// Is used in some cloudlets to support default rules (rule that is always matched)
        /// </summary>
        [Input("matchesAlways")]
        public bool? MatchesAlways { get; set; }

        /// <summary>
        /// The name of the rule
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The start time for this match (in seconds since the epoch)
        /// </summary>
        [Input("start")]
        public int? Start { get; set; }

        /// <summary>
        /// The type of Cloudlet the rule is for. It is known as Continuous Deployment (CD) too.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetCloudletsPhasedReleaseMatchRuleMatchRuleArgs()
        {
        }
        public static new GetCloudletsPhasedReleaseMatchRuleMatchRuleArgs Empty => new GetCloudletsPhasedReleaseMatchRuleMatchRuleArgs();
    }
}
