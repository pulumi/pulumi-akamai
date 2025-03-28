// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20250113BehaviorEdgeLoadBalancingDataCenterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If using session persistence, this specifies the value of the cookie named in the corresponding `edgeLoadBalancingOrigin` behavior's `cookie_name` option.
        /// </summary>
        [Input("cookieName")]
        public Input<string>? CookieName { get; set; }

        /// <summary>
        /// Provides a description for the ELB data center, for your own reference.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Allows you to specify failover rules.
        /// </summary>
        [Input("enableFailover")]
        public Input<bool>? EnableFailover { get; set; }

        [Input("failoverRules")]
        private InputList<Inputs.GetPropertyRulesBuilderRulesV20250113BehaviorEdgeLoadBalancingDataCenterFailoverRuleInputArgs>? _failoverRules;

        /// <summary>
        /// Provides up to four failover rules to apply in the specified order.
        /// </summary>
        public InputList<Inputs.GetPropertyRulesBuilderRulesV20250113BehaviorEdgeLoadBalancingDataCenterFailoverRuleInputArgs> FailoverRules
        {
            get => _failoverRules ?? (_failoverRules = new InputList<Inputs.GetPropertyRulesBuilderRulesV20250113BehaviorEdgeLoadBalancingDataCenterFailoverRuleInputArgs>());
            set => _failoverRules = value;
        }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        [Input("failoverTitle")]
        public Input<string>? FailoverTitle { get; set; }

        /// <summary>
        /// Specifies the data center's hostname.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Specifies this data center's IP address.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Corresponds to the `id` specified by the `edgeLoadBalancingOrigin` behavior associated with this data center.
        /// </summary>
        [Input("originId")]
        public Input<string>? OriginId { get; set; }

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

        public GetPropertyRulesBuilderRulesV20250113BehaviorEdgeLoadBalancingDataCenterInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20250113BehaviorEdgeLoadBalancingDataCenterInputArgs Empty => new GetPropertyRulesBuilderRulesV20250113BehaviorEdgeLoadBalancingDataCenterInputArgs();
    }
}
