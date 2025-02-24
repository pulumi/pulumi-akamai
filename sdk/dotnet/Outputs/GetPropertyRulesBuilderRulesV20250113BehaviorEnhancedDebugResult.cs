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
    public sealed class GetPropertyRulesBuilderRulesV20250113BehaviorEnhancedDebugResult
    {
        /// <summary>
        /// Specifies the debug key to use for all requests processed by this property. The debug key value needs to be a 64-byte hex string. You can generate the key in one property and then reuse it in other configurations.
        /// </summary>
        public readonly string? DebugKey;
        /// <summary>
        /// Whether you want to disable the standard debugging that uses the `Pragma` request header.
        /// </summary>
        public readonly bool? DisablePragma;
        /// <summary>
        /// Enables enhanced debugging using the `Akamai-Debug` request header.
        /// </summary>
        public readonly bool? EnableDebug;
        /// <summary>
        /// Whether you want to return the Global Request Number (GRN) in the `Akamai-GRN` response header for all requests, even if the `Akamai-Debug` request header is not passed. The `Akamai-GRN` header is useful for log extraction.
        /// </summary>
        public readonly bool? GenerateGrn;
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
        private GetPropertyRulesBuilderRulesV20250113BehaviorEnhancedDebugResult(
            string? debugKey,

            bool? disablePragma,

            bool? enableDebug,

            bool? generateGrn,

            bool? locked,

            string? templateUuid,

            string? uuid)
        {
            DebugKey = debugKey;
            DisablePragma = disablePragma;
            EnableDebug = enableDebug;
            GenerateGrn = generateGrn;
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
