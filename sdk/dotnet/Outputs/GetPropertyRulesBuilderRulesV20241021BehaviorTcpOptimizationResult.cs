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
    public sealed class GetPropertyRulesBuilderRulesV20241021BehaviorTcpOptimizationResult
    {
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? Display;
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
        private GetPropertyRulesBuilderRulesV20241021BehaviorTcpOptimizationResult(
            string? display,

            bool? locked,

            string? templateUuid,

            string? uuid)
        {
            Display = display;
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
