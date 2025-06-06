// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetGtmDomainStatusResult
    {
        /// <summary>
        /// A unique identifier generated when a change occurs to the domain.
        /// </summary>
        public readonly string ChangeId;
        /// <summary>
        /// Specifies the URL path that allows direct navigation to the domain.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGtmDomainStatusLinkResult> Links;
        /// <summary>
        /// A notification generated when a change occurs to the domain.
        /// </summary>
        public readonly string Message;
        /// <summary>
        /// Indicates if the domain validates.
        /// </summary>
        public readonly bool PassingValidation;
        /// <summary>
        /// Tracks the status of the domain's propagation state.
        /// </summary>
        public readonly string PropagationStatus;
        /// <summary>
        /// An ISO 8601 timestamp indicating when a change occurs to the domain.
        /// </summary>
        public readonly string PropagationStatusDate;

        [OutputConstructor]
        private GetGtmDomainStatusResult(
            string changeId,

            ImmutableArray<Outputs.GetGtmDomainStatusLinkResult> links,

            string message,

            bool passingValidation,

            string propagationStatus,

            string propagationStatusDate)
        {
            ChangeId = changeId;
            Links = links;
            Message = message;
            PassingValidation = passingValidation;
            PropagationStatus = propagationStatus;
            PropagationStatusDate = propagationStatusDate;
        }
    }
}
