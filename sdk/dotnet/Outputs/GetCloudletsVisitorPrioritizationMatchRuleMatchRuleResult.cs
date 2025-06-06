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
    public sealed class GetCloudletsVisitorPrioritizationMatchRuleMatchRuleResult
    {
        /// <summary>
        /// If set to true, disables a rule so it is not evaluated against incoming requests.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// The end time for this match (in seconds since the epoch)
        /// </summary>
        public readonly int? End;
        /// <summary>
        /// If using a URL match, this property is the URL that the Cloudlet uses to match the incoming request
        /// </summary>
        public readonly string? MatchUrl;
        /// <summary>
        /// Defines a set of match objects
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchResult> Matches;
        /// <summary>
        /// The name of the rule
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The range 0.0: 99.0 specifies the percentage of requests that pass through to the origin. The value of 100 means the request always passes through to the origin. A value of -1 means send everyone to the waiting room.
        /// </summary>
        public readonly double PassThroughPercent;
        /// <summary>
        /// The start time for this match (in seconds since the epoch)
        /// </summary>
        public readonly int? Start;
        /// <summary>
        /// The type of Cloudlet the rule is for
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleResult(
            bool? disabled,

            int? end,

            string? matchUrl,

            ImmutableArray<Outputs.GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchResult> matches,

            string? name,

            double passThroughPercent,

            int? start,

            string type)
        {
            Disabled = disabled;
            End = end;
            MatchUrl = matchUrl;
            Matches = matches;
            Name = name;
            PassThroughPercent = passThroughPercent;
            Start = start;
            Type = type;
        }
    }
}
