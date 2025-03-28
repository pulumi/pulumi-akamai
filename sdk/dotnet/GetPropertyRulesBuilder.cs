// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetPropertyRulesBuilder
    {
        public static Task<GetPropertyRulesBuilderResult> InvokeAsync(GetPropertyRulesBuilderArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPropertyRulesBuilderResult>("akamai:index/getPropertyRulesBuilder:getPropertyRulesBuilder", args ?? new GetPropertyRulesBuilderArgs(), options.WithDefaults());

        public static Output<GetPropertyRulesBuilderResult> Invoke(GetPropertyRulesBuilderInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPropertyRulesBuilderResult>("akamai:index/getPropertyRulesBuilder:getPropertyRulesBuilder", args ?? new GetPropertyRulesBuilderInvokeArgs(), options.WithDefaults());

        public static Output<GetPropertyRulesBuilderResult> Invoke(GetPropertyRulesBuilderInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetPropertyRulesBuilderResult>("akamai:index/getPropertyRulesBuilder:getPropertyRulesBuilder", args ?? new GetPropertyRulesBuilderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPropertyRulesBuilderArgs : global::Pulumi.InvokeArgs
    {
        [Input("rulesV20230105")]
        public Inputs.GetPropertyRulesBuilderRulesV20230105Args? RulesV20230105 { get; set; }

        [Input("rulesV20230530")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530Args? RulesV20230530 { get; set; }

        [Input("rulesV20230920")]
        public Inputs.GetPropertyRulesBuilderRulesV20230920Args? RulesV20230920 { get; set; }

        [Input("rulesV20231030")]
        public Inputs.GetPropertyRulesBuilderRulesV20231030Args? RulesV20231030 { get; set; }

        [Input("rulesV20240109")]
        public Inputs.GetPropertyRulesBuilderRulesV20240109Args? RulesV20240109 { get; set; }

        [Input("rulesV20240212")]
        public Inputs.GetPropertyRulesBuilderRulesV20240212Args? RulesV20240212 { get; set; }

        [Input("rulesV20240531")]
        public Inputs.GetPropertyRulesBuilderRulesV20240531Args? RulesV20240531 { get; set; }

        [Input("rulesV20240813")]
        public Inputs.GetPropertyRulesBuilderRulesV20240813Args? RulesV20240813 { get; set; }

        [Input("rulesV20241021")]
        public Inputs.GetPropertyRulesBuilderRulesV20241021Args? RulesV20241021 { get; set; }

        [Input("rulesV20250113")]
        public Inputs.GetPropertyRulesBuilderRulesV20250113Args? RulesV20250113 { get; set; }

        public GetPropertyRulesBuilderArgs()
        {
        }
        public static new GetPropertyRulesBuilderArgs Empty => new GetPropertyRulesBuilderArgs();
    }

    public sealed class GetPropertyRulesBuilderInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("rulesV20230105")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230105InputArgs>? RulesV20230105 { get; set; }

        [Input("rulesV20230530")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530InputArgs>? RulesV20230530 { get; set; }

        [Input("rulesV20230920")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230920InputArgs>? RulesV20230920 { get; set; }

        [Input("rulesV20231030")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20231030InputArgs>? RulesV20231030 { get; set; }

        [Input("rulesV20240109")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240109InputArgs>? RulesV20240109 { get; set; }

        [Input("rulesV20240212")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240212InputArgs>? RulesV20240212 { get; set; }

        [Input("rulesV20240531")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240531InputArgs>? RulesV20240531 { get; set; }

        [Input("rulesV20240813")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813InputArgs>? RulesV20240813 { get; set; }

        [Input("rulesV20241021")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20241021InputArgs>? RulesV20241021 { get; set; }

        [Input("rulesV20250113")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20250113InputArgs>? RulesV20250113 { get; set; }

        public GetPropertyRulesBuilderInvokeArgs()
        {
        }
        public static new GetPropertyRulesBuilderInvokeArgs Empty => new GetPropertyRulesBuilderInvokeArgs();
    }


    [OutputType]
    public sealed class GetPropertyRulesBuilderResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string RuleFormat;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230105Result? RulesV20230105;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230530Result? RulesV20230530;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920Result? RulesV20230920;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20231030Result? RulesV20231030;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20240109Result? RulesV20240109;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20240212Result? RulesV20240212;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20240531Result? RulesV20240531;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20240813Result? RulesV20240813;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20241021Result? RulesV20241021;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20250113Result? RulesV20250113;

        [OutputConstructor]
        private GetPropertyRulesBuilderResult(
            string id,

            string json,

            string ruleFormat,

            Outputs.GetPropertyRulesBuilderRulesV20230105Result? rulesV20230105,

            Outputs.GetPropertyRulesBuilderRulesV20230530Result? rulesV20230530,

            Outputs.GetPropertyRulesBuilderRulesV20230920Result? rulesV20230920,

            Outputs.GetPropertyRulesBuilderRulesV20231030Result? rulesV20231030,

            Outputs.GetPropertyRulesBuilderRulesV20240109Result? rulesV20240109,

            Outputs.GetPropertyRulesBuilderRulesV20240212Result? rulesV20240212,

            Outputs.GetPropertyRulesBuilderRulesV20240531Result? rulesV20240531,

            Outputs.GetPropertyRulesBuilderRulesV20240813Result? rulesV20240813,

            Outputs.GetPropertyRulesBuilderRulesV20241021Result? rulesV20241021,

            Outputs.GetPropertyRulesBuilderRulesV20250113Result? rulesV20250113)
        {
            Id = id;
            Json = json;
            RuleFormat = ruleFormat;
            RulesV20230105 = rulesV20230105;
            RulesV20230530 = rulesV20230530;
            RulesV20230920 = rulesV20230920;
            RulesV20231030 = rulesV20231030;
            RulesV20240109 = rulesV20240109;
            RulesV20240212 = rulesV20240212;
            RulesV20240531 = rulesV20240531;
            RulesV20240813 = rulesV20240813;
            RulesV20241021 = rulesV20241021;
            RulesV20250113 = rulesV20250113;
        }
    }
}
