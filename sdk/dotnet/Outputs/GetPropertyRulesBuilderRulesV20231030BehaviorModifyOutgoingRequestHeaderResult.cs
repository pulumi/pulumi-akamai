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
    public sealed class GetPropertyRulesBuilderRulesV20231030BehaviorModifyOutgoingRequestHeaderResult
    {
        /// <summary>
        /// Either `ADD` or `DELETE` outgoing HTTP request headers, `MODIFY` their fixed values, or specify a `REGEX` pattern to transform them.
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
        /// When enabled with the `action` set to `REGEX`, replaces all occurrences of the matched regular expression, otherwise only the first match if disabled.
        /// </summary>
        public readonly bool? MatchMultiple;
        /// <summary>
        /// Specifies an HTTP header replacement value.
        /// </summary>
        public readonly string? NewHeaderValue;
        /// <summary>
        /// Specifies a Perl-compatible regular expression to match within the header value.
        /// </summary>
        public readonly string? RegexHeaderMatch;
        /// <summary>
        /// Specifies text that replaces the `regexHeaderMatch` pattern within the header value.
        /// </summary>
        public readonly string? RegexHeaderReplace;
        /// <summary>
        /// If the value of `action` is `ADD`, this specifies the name of the field to add.
        /// </summary>
        public readonly string? StandardAddHeaderName;
        /// <summary>
        /// If the value of `action` is `DELETE`, this specifies the name of the field to remove.
        /// </summary>
        public readonly string? StandardDeleteHeaderName;
        /// <summary>
        /// If the value of `action` is `MODIFY` or `REGEX`, this specifies the name of the field to modify.
        /// </summary>
        public readonly string? StandardModifyHeaderName;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20231030BehaviorModifyOutgoingRequestHeaderResult(
            string? action,

            bool? avoidDuplicateHeaders,

            string? customHeaderName,

            string? headerValue,

            bool? locked,

            bool? matchMultiple,

            string? newHeaderValue,

            string? regexHeaderMatch,

            string? regexHeaderReplace,

            string? standardAddHeaderName,

            string? standardDeleteHeaderName,

            string? standardModifyHeaderName,

            string? templateUuid,

            string? uuid)
        {
            Action = action;
            AvoidDuplicateHeaders = avoidDuplicateHeaders;
            CustomHeaderName = customHeaderName;
            HeaderValue = headerValue;
            Locked = locked;
            MatchMultiple = matchMultiple;
            NewHeaderValue = newHeaderValue;
            RegexHeaderMatch = regexHeaderMatch;
            RegexHeaderReplace = regexHeaderReplace;
            StandardAddHeaderName = standardAddHeaderName;
            StandardDeleteHeaderName = standardDeleteHeaderName;
            StandardModifyHeaderName = standardModifyHeaderName;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
