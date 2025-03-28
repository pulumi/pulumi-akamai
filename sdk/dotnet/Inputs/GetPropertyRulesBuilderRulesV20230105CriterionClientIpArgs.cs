// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105CriterionClientIpInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Matches the contents of `values` if set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
        /// </summary>
        [Input("matchOperator")]
        public Input<string>? MatchOperator { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// When connecting via a proxy server as determined by the `X-Forwarded-For` header, enabling this option matches the connecting client's IP address rather than the original end client specified in the header.
        /// </summary>
        [Input("useHeaders")]
        public Input<bool>? UseHeaders { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// IP or CIDR block, for example: `71.92.0.0/14`.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionClientIpInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105CriterionClientIpInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105CriterionClientIpInputArgs();
    }
}
