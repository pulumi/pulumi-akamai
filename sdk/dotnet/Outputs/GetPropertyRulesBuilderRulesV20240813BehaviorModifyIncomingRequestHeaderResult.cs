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
    public sealed class GetPropertyRulesBuilderRulesV20240813BehaviorModifyIncomingRequestHeaderResult
    {
        /// <summary>
        /// Either `ADD`, `DELETE`, `MODIFY`, or `PASS` incoming HTTP request headers.
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// When enabled with the `action` set to `MODIFY`, prevents creation of more than one instance of a header.
        /// </summary>
        public readonly bool? AvoidDuplicateHeaders;
        /// <summary>
        /// Specifies a custom field name that applies when the relevant `standard` header name is set to `OTHER`.
        /// </summary>
        public readonly string? CustomHeaderName;
        /// <summary>
        /// Specifies the new header value.
        /// </summary>
        public readonly string? HeaderValue;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Supplies an HTTP header replacement value.
        /// </summary>
        public readonly string? NewHeaderValue;
        /// <summary>
        /// If the value of `action` is `ADD`, this specifies the name of the field to add.
        /// </summary>
        public readonly string? StandardAddHeaderName;
        /// <summary>
        /// If the value of `action` is `DELETE`, this specifies the name of the field to remove.
        /// </summary>
        public readonly string? StandardDeleteHeaderName;
        /// <summary>
        /// If the value of `action` is `MODIFY`, this specifies the name of the field to modify.
        /// </summary>
        public readonly string? StandardModifyHeaderName;
        /// <summary>
        /// If the value of `action` is `PASS`, this specifies the name of the field to pass through.
        /// </summary>
        public readonly string? StandardPassHeaderName;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240813BehaviorModifyIncomingRequestHeaderResult(
            string? action,

            bool? avoidDuplicateHeaders,

            string? customHeaderName,

            string? headerValue,

            bool? locked,

            string? newHeaderValue,

            string? standardAddHeaderName,

            string? standardDeleteHeaderName,

            string? standardModifyHeaderName,

            string? standardPassHeaderName,

            string? templateUuid,

            string? uuid)
        {
            Action = action;
            AvoidDuplicateHeaders = avoidDuplicateHeaders;
            CustomHeaderName = customHeaderName;
            HeaderValue = headerValue;
            Locked = locked;
            NewHeaderValue = newHeaderValue;
            StandardAddHeaderName = standardAddHeaderName;
            StandardDeleteHeaderName = standardDeleteHeaderName;
            StandardModifyHeaderName = standardModifyHeaderName;
            StandardPassHeaderName = standardPassHeaderName;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
