// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTrafficGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifies the ticket that describes the need for the activation
        /// </summary>
        [Input("ticketId")]
        public Input<string>? TicketId { get; set; }

        public PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTrafficGetArgs()
        {
        }
        public static new PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTrafficGetArgs Empty => new PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTrafficGetArgs();
    }
}
