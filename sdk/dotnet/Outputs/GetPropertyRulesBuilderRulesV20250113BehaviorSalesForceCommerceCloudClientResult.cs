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
    public sealed class GetPropertyRulesBuilderRulesV20250113BehaviorSalesForceCommerceCloudClientResult
    {
        /// <summary>
        /// When enabled, overrides the forwarding origin's cache key.
        /// </summary>
        public readonly bool? AllowOverrideOriginCacheKey;
        /// <summary>
        /// An ID value that helps distinguish different types of traffic sent from Akamai to the Salesforce Commerce Cloud. Form the value as `instance-realm-customer`, where `instance` is either `production` or `development`, `realm` is your Salesforce Commerce Cloud service `$REALM` value, and `customer` is the name for your organization in Salesforce Commerce Cloud.  You can use alphanumeric characters, underscores, or dot characters within dash-delimited segment values.
        /// </summary>
        public readonly string? ConnectorId;
        /// <summary>
        /// Enables the Akamai Connector for Salesforce Commerce Cloud.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Specifies where the `Host` header is defined.
        /// </summary>
        public readonly string? OriginHostHeader;
        /// <summary>
        /// Specifies where the origin is.
        /// </summary>
        public readonly string? OriginType;
        /// <summary>
        /// This specifies the hostname or IP address of the custom Salesforce origin.
        /// </summary>
        public readonly string? Sf3cOriginHost;
        /// <summary>
        /// This specifies the hostname or IP address of the custom Salesforce host header.
        /// </summary>
        public readonly string? Sf3cOriginHostHeader;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20250113BehaviorSalesForceCommerceCloudClientResult(
            bool? allowOverrideOriginCacheKey,

            string? connectorId,

            bool? enabled,

            bool? locked,

            string? originHostHeader,

            string? originType,

            string? sf3cOriginHost,

            string? sf3cOriginHostHeader,

            string? templateUuid,

            string? uuid)
        {
            AllowOverrideOriginCacheKey = allowOverrideOriginCacheKey;
            ConnectorId = connectorId;
            Enabled = enabled;
            Locked = locked;
            OriginHostHeader = originHostHeader;
            OriginType = originType;
            Sf3cOriginHost = sf3cOriginHost;
            Sf3cOriginHostHeader = sf3cOriginHostHeader;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
