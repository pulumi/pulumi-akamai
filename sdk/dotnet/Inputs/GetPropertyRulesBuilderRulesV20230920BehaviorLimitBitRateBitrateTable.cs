// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230920BehaviorLimitBitRateBitrateTableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unit of measurement, either `KBPS`, `MBPS`, or `GBPS`.
        /// </summary>
        [Input("bitrateUnit")]
        public string? BitrateUnit { get; set; }

        /// <summary>
        /// The numeric indicator of the download rate.
        /// </summary>
        [Input("bitrateValue")]
        public double? BitrateValue { get; set; }

        public GetPropertyRulesBuilderRulesV20230920BehaviorLimitBitRateBitrateTableArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230920BehaviorLimitBitRateBitrateTableArgs Empty => new GetPropertyRulesBuilderRulesV20230920BehaviorLimitBitRateBitrateTableArgs();
    }
}
