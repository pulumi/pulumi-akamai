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
    public sealed class GetCloudletsPolicyActivationPolicyInfoResult
    {
        /// <summary>
        /// The name of the user who activated the policy.
        /// </summary>
        public readonly string ActivatedBy;
        /// <summary>
        /// The date on which the policy was activated (in milliseconds since Epoch).
        /// </summary>
        public readonly int ActivationDate;
        /// <summary>
        /// The name of the policy.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// An integer ID that is associated with all versions of a policy.
        /// </summary>
        public readonly int PolicyId;
        /// <summary>
        /// The activation status for the policy: active, inactive, deactivated, pending or failed.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Information about the status of an activation operation.
        /// </summary>
        public readonly string StatusDetail;
        /// <summary>
        /// The version number of the activated policy.
        /// </summary>
        public readonly int Version;

        [OutputConstructor]
        private GetCloudletsPolicyActivationPolicyInfoResult(
            string activatedBy,

            int activationDate,

            string name,

            int policyId,

            string status,

            string statusDetail,

            int version)
        {
            ActivatedBy = activatedBy;
            ActivationDate = activationDate;
            Name = name;
            PolicyId = policyId;
            Status = status;
            StatusDetail = statusDetail;
            Version = version;
        }
    }
}
