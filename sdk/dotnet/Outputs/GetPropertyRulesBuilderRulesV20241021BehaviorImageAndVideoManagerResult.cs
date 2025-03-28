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
    public sealed class GetPropertyRulesBuilderRulesV20241021BehaviorImageAndVideoManagerResult
    {
        public readonly bool? ApplyBestFileType;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20241021BehaviorImageAndVideoManagerCpCodeOriginalResult? CpCodeOriginal;
        public readonly Outputs.GetPropertyRulesBuilderRulesV20241021BehaviorImageAndVideoManagerCpCodeTransformedResult? CpCodeTransformed;
        public readonly bool? Enabled;
        public readonly string? ImageSet;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        public readonly string? PolicySetType;
        public readonly bool? Resize;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;
        public readonly string? VideoSet;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20241021BehaviorImageAndVideoManagerResult(
            bool? applyBestFileType,

            Outputs.GetPropertyRulesBuilderRulesV20241021BehaviorImageAndVideoManagerCpCodeOriginalResult? cpCodeOriginal,

            Outputs.GetPropertyRulesBuilderRulesV20241021BehaviorImageAndVideoManagerCpCodeTransformedResult? cpCodeTransformed,

            bool? enabled,

            string? imageSet,

            bool? locked,

            string? policySetType,

            bool? resize,

            string? templateUuid,

            string? uuid,

            string? videoSet)
        {
            ApplyBestFileType = applyBestFileType;
            CpCodeOriginal = cpCodeOriginal;
            CpCodeTransformed = cpCodeTransformed;
            Enabled = enabled;
            ImageSet = imageSet;
            Locked = locked;
            PolicySetType = policySetType;
            Resize = resize;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            VideoSet = videoSet;
        }
    }
}
