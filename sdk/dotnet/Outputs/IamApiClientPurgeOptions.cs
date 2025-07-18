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
    public sealed class IamApiClientPurgeOptions
    {
        /// <summary>
        /// Whether the API client can purge content by cache tag.
        /// </summary>
        public readonly bool CanPurgeByCacheTag;
        /// <summary>
        /// Whether the API client can purge content by CP code.
        /// </summary>
        public readonly bool CanPurgeByCpCode;
        /// <summary>
        /// CP codes the API client can purge.
        /// </summary>
        public readonly Outputs.IamApiClientPurgeOptionsCpCodeAccess CpCodeAccess;

        [OutputConstructor]
        private IamApiClientPurgeOptions(
            bool canPurgeByCacheTag,

            bool canPurgeByCpCode,

            Outputs.IamApiClientPurgeOptionsCpCodeAccess cpCodeAccess)
        {
            CanPurgeByCacheTag = canPurgeByCacheTag;
            CanPurgeByCpCode = canPurgeByCpCode;
            CpCodeAccess = cpCodeAccess;
        }
    }
}
