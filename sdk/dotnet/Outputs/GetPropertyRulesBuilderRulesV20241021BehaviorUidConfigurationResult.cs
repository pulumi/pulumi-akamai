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
    public sealed class GetPropertyRulesBuilderRulesV20241021BehaviorUidConfigurationResult
    {
        /// <summary>
        /// Allows you to extract UIDs from client requests.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Where to extract the UID value from.
        /// </summary>
        public readonly string? ExtractLocation;
        /// <summary>
        /// This specifies the name of the HTTP header from which to extract the UID value.
        /// </summary>
        public readonly string? HeaderName;
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? LegalText;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// This specifies the name of the query parameter from which to extract the UID value.
        /// </summary>
        public readonly string? QueryParameterName;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;
        /// <summary>
        /// This specifies the name of the rule tree variable from which to extract the UID value.
        /// </summary>
        public readonly string? VariableName;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20241021BehaviorUidConfigurationResult(
            bool? enabled,

            string? extractLocation,

            string? headerName,

            string? legalText,

            bool? locked,

            string? queryParameterName,

            string? templateUuid,

            string? uuid,

            string? variableName)
        {
            Enabled = enabled;
            ExtractLocation = extractLocation;
            HeaderName = headerName;
            LegalText = legalText;
            Locked = locked;
            QueryParameterName = queryParameterName;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            VariableName = variableName;
        }
    }
}
