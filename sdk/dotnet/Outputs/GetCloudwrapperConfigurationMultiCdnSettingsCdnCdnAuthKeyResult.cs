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
    public sealed class GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKeyResult
    {
        /// <summary>
        /// The name of the auth key.
        /// </summary>
        public readonly string AuthKeyName;
        /// <summary>
        /// The expirty date of an auth key.
        /// </summary>
        public readonly string ExpiryDate;
        /// <summary>
        /// The header name of an auth key.
        /// </summary>
        public readonly string HeaderName;
        /// <summary>
        /// The secret of an auth key.
        /// </summary>
        public readonly string Secret;

        [OutputConstructor]
        private GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKeyResult(
            string authKeyName,

            string expiryDate,

            string headerName,

            string secret)
        {
            AuthKeyName = authKeyName;
            ExpiryDate = expiryDate;
            HeaderName = headerName;
            Secret = secret;
        }
    }
}
