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
    public sealed class IamApiClientCredentialActions
    {
        /// <summary>
        /// Whether you can activate the credential.
        /// </summary>
        public readonly bool? Activate;
        /// <summary>
        /// Whether you can deactivate the credential.
        /// </summary>
        public readonly bool? Deactivate;
        /// <summary>
        /// Whether you can remove the credential.
        /// </summary>
        public readonly bool? Delete;
        /// <summary>
        /// Whether you can modify the credential's description.
        /// </summary>
        public readonly bool? EditDescription;
        /// <summary>
        /// Whether you can modify the credential's expiration date.
        /// </summary>
        public readonly bool? EditExpiration;

        [OutputConstructor]
        private IamApiClientCredentialActions(
            bool? activate,

            bool? deactivate,

            bool? delete,

            bool? editDescription,

            bool? editExpiration)
        {
            Activate = activate;
            Deactivate = deactivate;
            Delete = delete;
            EditDescription = editDescription;
            EditExpiration = editExpiration;
        }
    }
}
