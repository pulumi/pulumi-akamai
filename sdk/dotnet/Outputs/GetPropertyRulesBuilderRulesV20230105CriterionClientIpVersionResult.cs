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
    public sealed class GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersionResult
    {
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// When connecting via a proxy server as determined by the `X-Forwarded-For` header, enabling this option matches the connecting client's IP address rather than the original end client specified in the header.
        /// </summary>
        public readonly bool? UseXForwardedFor;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;
        /// <summary>
        /// The IP version of the client request, either `IPV4` or `IPV6`.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersionResult(
            bool? locked,

            string? templateUuid,

            bool? useXForwardedFor,

            string? uuid,

            string? value)
        {
            Locked = locked;
            TemplateUuid = templateUuid;
            UseXForwardedFor = useXForwardedFor;
            Uuid = uuid;
            Value = value;
        }
    }
}
