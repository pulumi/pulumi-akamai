// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingDataCenterResult
    {
        /// <summary>
        /// If using session persistence, this specifies the value of the cookie named in the corresponding `edgeLoadBalancingOrigin` behavior's `cookie_name` option.
        /// </summary>
        public readonly string? CookieName;
        /// <summary>
        /// Provides a description for the ELB data center, for your own reference.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Allows you to specify failover rules.
        /// </summary>
        public readonly bool? EnableFailover;
        /// <summary>
        /// Provides up to four failover rules to apply in the specified order.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingDataCenterFailoverRuleResult> FailoverRules;
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? FailoverTitle;
        /// <summary>
        /// Specifies the data center's hostname.
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// Specifies this data center's IP address.
        /// </summary>
        public readonly string? Ip;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Corresponds to the `id` specified by the `edgeLoadBalancingOrigin` behavior associated with this data center.
        /// </summary>
        public readonly string? OriginId;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingDataCenterResult(
            string? cookieName,

            string? description,

            bool? enableFailover,

            ImmutableArray<Outputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingDataCenterFailoverRuleResult> failoverRules,

            string? failoverTitle,

            string? hostname,

            string? ip,

            bool? locked,

            string? originId,

            string? templateUuid,

            string? uuid)
        {
            CookieName = cookieName;
            Description = description;
            EnableFailover = enableFailover;
            FailoverRules = failoverRules;
            FailoverTitle = failoverTitle;
            Hostname = hostname;
            Ip = ip;
            Locked = locked;
            OriginId = originId;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
