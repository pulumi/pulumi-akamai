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
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorReadTimeoutResult
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
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;
        /// <summary>
        /// The amount of time an edge server should wait for each read statement to return a response from the forward server after a connection has already been established. Larger objects may need many reads, and this timeout applies to each read separately. Any failure to complete a read within this time limit aborts the request and sends a 504 Gateway Timeout error to the client.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorReadTimeoutResult(
            bool? locked,

            string? templateUuid,

            string? uuid,

            string? value)
        {
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            Value = value;
        }
    }
}
