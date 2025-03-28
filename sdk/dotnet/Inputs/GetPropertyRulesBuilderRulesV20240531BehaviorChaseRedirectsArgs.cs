// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240531BehaviorChaseRedirectsInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allows edge servers to chase redirects.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies, as a string, the maximum number of redirects to follow.
        /// </summary>
        [Input("limit")]
        public Input<string>? Limit { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Once the redirect `limit` is reached, enabling this option serves an HTTP `404` (Not Found) error instead of the last redirect.
        /// </summary>
        [Input("serve404")]
        public Input<bool>? Serve404 { get; set; }

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

        public GetPropertyRulesBuilderRulesV20240531BehaviorChaseRedirectsInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240531BehaviorChaseRedirectsInputArgs Empty => new GetPropertyRulesBuilderRulesV20240531BehaviorChaseRedirectsInputArgs();
    }
}
