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
    public sealed class GetPropertyRulesBuilderRulesV20240531CriterionMatchAdvancedResult
    {
        /// <summary>
        /// An XML string that closes the relevant block.
        /// </summary>
        public readonly string? CloseXml;
        /// <summary>
        /// A human-readable description of what the XML block does.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// An XML string that opens the relevant block.
        /// </summary>
        public readonly string? OpenXml;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240531CriterionMatchAdvancedResult(
            string? closeXml,

            string? description,

            bool? locked,

            string? openXml,

            string? templateUuid,

            string? uuid)
        {
            CloseXml = closeXml;
            Description = description;
            Locked = locked;
            OpenXml = openXml;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
