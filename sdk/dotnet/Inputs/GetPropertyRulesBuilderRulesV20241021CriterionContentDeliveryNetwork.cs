// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20241021CriterionContentDeliveryNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public bool? Locked { get; set; }

        /// <summary>
        /// Matches the specified `network` if set to `IS`, otherwise `IS_NOT` reverses the match.
        /// </summary>
        [Input("matchOperator")]
        public string? MatchOperator { get; set; }

        /// <summary>
        /// Match the network.
        /// </summary>
        [Input("network")]
        public string? Network { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20241021CriterionContentDeliveryNetworkArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20241021CriterionContentDeliveryNetworkArgs Empty => new GetPropertyRulesBuilderRulesV20241021CriterionContentDeliveryNetworkArgs();
    }
}
