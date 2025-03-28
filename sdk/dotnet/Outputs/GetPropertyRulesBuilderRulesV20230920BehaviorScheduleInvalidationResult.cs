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
    public sealed class GetPropertyRulesBuilderRulesV20230920BehaviorScheduleInvalidationResult
    {
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Specifies how to invalidate the content.
        /// </summary>
        public readonly string? RefreshMethod;
        /// <summary>
        /// When enabled, invalidation recurs periodically from the `start` time based on the `repeatInterval` time.
        /// </summary>
        public readonly bool? Repeat;
        /// <summary>
        /// Specifies how often to invalidate content from the `start` time, expressed in seconds. For example, an expiration set to midnight and an interval of `86400` seconds invalidates content once a day.  Repeating intervals of less than 5 minutes are not allowed for `NetStorage` origins.
        /// </summary>
        public readonly string? RepeatInterval;
        /// <summary>
        /// The UTC date and time when matching cached content is to expire.
        /// </summary>
        public readonly string? Start;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230920BehaviorScheduleInvalidationResult(
            bool? locked,

            string? refreshMethod,

            bool? repeat,

            string? repeatInterval,

            string? start,

            string? templateUuid,

            string? uuid)
        {
            Locked = locked;
            RefreshMethod = refreshMethod;
            Repeat = repeat;
            RepeatInterval = repeatInterval;
            Start = start;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
