// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudletsRequestControlMatchRuleMatchRuleInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set to allow, the request is sent to origin when all conditions are true. If deny, the request is denied when all conditions are true. If denybranded, the request is denied and rerouted according to the configuration of the Request Control behavior
        /// </summary>
        [Input("allowDeny", required: true)]
        public Input<string> AllowDeny { get; set; } = null!;

        /// <summary>
        /// If set to true, disables a rule so it is not evaluated against incoming requests.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The end time for this match (in seconds since the epoch)
        /// </summary>
        [Input("end")]
        public Input<int>? End { get; set; }

        [Input("matches")]
        private InputList<Inputs.GetCloudletsRequestControlMatchRuleMatchRuleMatchInputArgs>? _matches;

        /// <summary>
        /// Defines a set of match objects
        /// </summary>
        public InputList<Inputs.GetCloudletsRequestControlMatchRuleMatchRuleMatchInputArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.GetCloudletsRequestControlMatchRuleMatchRuleMatchInputArgs>());
            set => _matches = value;
        }

        /// <summary>
        /// Is used in some cloudlets to support default rules (rule that is always matched)
        /// </summary>
        [Input("matchesAlways")]
        public Input<bool>? MatchesAlways { get; set; }

        /// <summary>
        /// The name of the rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The start time for this match (in seconds since the epoch)
        /// </summary>
        [Input("start")]
        public Input<int>? Start { get; set; }

        /// <summary>
        /// The type of Cloudlet the rule is for
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetCloudletsRequestControlMatchRuleMatchRuleInputArgs()
        {
        }
        public static new GetCloudletsRequestControlMatchRuleMatchRuleInputArgs Empty => new GetCloudletsRequestControlMatchRuleMatchRuleInputArgs();
    }
}
