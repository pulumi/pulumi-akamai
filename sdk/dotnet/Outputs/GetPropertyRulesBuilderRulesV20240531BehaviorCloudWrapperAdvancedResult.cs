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
    public sealed class GetPropertyRulesBuilderRulesV20240531BehaviorCloudWrapperAdvancedResult
    {
        /// <summary>
        /// Specifies the custom failover map to handle Cloud Wrapper failures. Contact your account representative for more information.
        /// </summary>
        public readonly string? CustomFailoverMap;
        /// <summary>
        /// Enables failover for Cloud Wrapper.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Specifies the failover map to handle Cloud Wrapper failures. Contact your account representative for more information.
        /// </summary>
        public readonly string? FailoverMap;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240531BehaviorCloudWrapperAdvancedResult(
            string? customFailoverMap,

            bool? enabled,

            string? failoverMap,

            bool? locked,

            string? templateUuid,

            string? uuid)
        {
            CustomFailoverMap = customFailoverMap;
            Enabled = enabled;
            FailoverMap = failoverMap;
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
