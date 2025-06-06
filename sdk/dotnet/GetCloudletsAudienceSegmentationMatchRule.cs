// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetCloudletsAudienceSegmentationMatchRule
    {
        public static Task<GetCloudletsAudienceSegmentationMatchRuleResult> InvokeAsync(GetCloudletsAudienceSegmentationMatchRuleArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudletsAudienceSegmentationMatchRuleResult>("akamai:index/getCloudletsAudienceSegmentationMatchRule:getCloudletsAudienceSegmentationMatchRule", args ?? new GetCloudletsAudienceSegmentationMatchRuleArgs(), options.WithDefaults());

        public static Output<GetCloudletsAudienceSegmentationMatchRuleResult> Invoke(GetCloudletsAudienceSegmentationMatchRuleInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudletsAudienceSegmentationMatchRuleResult>("akamai:index/getCloudletsAudienceSegmentationMatchRule:getCloudletsAudienceSegmentationMatchRule", args ?? new GetCloudletsAudienceSegmentationMatchRuleInvokeArgs(), options.WithDefaults());

        public static Output<GetCloudletsAudienceSegmentationMatchRuleResult> Invoke(GetCloudletsAudienceSegmentationMatchRuleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudletsAudienceSegmentationMatchRuleResult>("akamai:index/getCloudletsAudienceSegmentationMatchRule:getCloudletsAudienceSegmentationMatchRule", args ?? new GetCloudletsAudienceSegmentationMatchRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudletsAudienceSegmentationMatchRuleArgs : global::Pulumi.InvokeArgs
    {
        [Input("matchRules")]
        private List<Inputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleArgs>? _matchRules;
        public List<Inputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleArgs> MatchRules
        {
            get => _matchRules ?? (_matchRules = new List<Inputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleArgs>());
            set => _matchRules = value;
        }

        public GetCloudletsAudienceSegmentationMatchRuleArgs()
        {
        }
        public static new GetCloudletsAudienceSegmentationMatchRuleArgs Empty => new GetCloudletsAudienceSegmentationMatchRuleArgs();
    }

    public sealed class GetCloudletsAudienceSegmentationMatchRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("matchRules")]
        private InputList<Inputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleInputArgs>? _matchRules;
        public InputList<Inputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleInputArgs> MatchRules
        {
            get => _matchRules ?? (_matchRules = new InputList<Inputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleInputArgs>());
            set => _matchRules = value;
        }

        public GetCloudletsAudienceSegmentationMatchRuleInvokeArgs()
        {
        }
        public static new GetCloudletsAudienceSegmentationMatchRuleInvokeArgs Empty => new GetCloudletsAudienceSegmentationMatchRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudletsAudienceSegmentationMatchRuleResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly ImmutableArray<Outputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleResult> MatchRules;

        [OutputConstructor]
        private GetCloudletsAudienceSegmentationMatchRuleResult(
            string id,

            string json,

            ImmutableArray<Outputs.GetCloudletsAudienceSegmentationMatchRuleMatchRuleResult> matchRules)
        {
            Id = id;
            Json = json;
            MatchRules = matchRules;
        }
    }
}
