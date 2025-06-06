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
    public sealed class GetIamAccountSwitchKeysAccountSwitchKeyResult
    {
        /// <summary>
        /// Descriptive label for the account.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// The identifier for an account other than your API client's default.
        /// </summary>
        public readonly string AccountSwitchKey;

        [OutputConstructor]
        private GetIamAccountSwitchKeysAccountSwitchKeyResult(
            string accountName,

            string accountSwitchKey)
        {
            AccountName = accountName;
            AccountSwitchKey = accountSwitchKey;
        }
    }
}
