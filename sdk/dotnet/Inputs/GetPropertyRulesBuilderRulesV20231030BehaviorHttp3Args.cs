// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20231030BehaviorHttp3InputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This enables HTTP/3 connections between requesting clients and Akamai edge servers. You also need to enable QUIC and TLS 1.3 in your certificate deployment settings. See the `Property Manager documentation` for more details.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20231030BehaviorHttp3InputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20231030BehaviorHttp3InputArgs Empty => new GetPropertyRulesBuilderRulesV20231030BehaviorHttp3InputArgs();
    }
}
