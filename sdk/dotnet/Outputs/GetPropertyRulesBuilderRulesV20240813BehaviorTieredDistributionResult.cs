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
    public sealed class GetPropertyRulesBuilderRulesV20240813BehaviorTieredDistributionResult
    {
        /// <summary>
        /// When enabled, activates tiered distribution.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// Optionally map the tiered parent server's location close to your origin. A narrower local map minimizes the origin server's load, and increases the likelihood the requested object is cached. A wider global map reduces end-user latency, but decreases the likelihood the requested object is in any given parent server's cache.  This option cannot apply if the property is marked as secure. See `Secure property requirements` for guidance.
        /// </summary>
        public readonly string? TieredDistributionMap;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240813BehaviorTieredDistributionResult(
            bool? enabled,

            bool? locked,

            string? templateUuid,

            string? tieredDistributionMap,

            string? uuid)
        {
            Enabled = enabled;
            Locked = locked;
            TemplateUuid = templateUuid;
            TieredDistributionMap = tieredDistributionMap;
            Uuid = uuid;
        }
    }
}
