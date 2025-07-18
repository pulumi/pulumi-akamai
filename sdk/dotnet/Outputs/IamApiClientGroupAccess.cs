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
    public sealed class IamApiClientGroupAccess
    {
        /// <summary>
        /// Sets the API client's group access the same as the authorized user.
        /// </summary>
        public readonly bool CloneAuthorizedUserGroups;
        /// <summary>
        /// Groups the API client can access.
        /// </summary>
        public readonly ImmutableArray<Outputs.IamApiClientGroupAccessGroup> Groups;

        [OutputConstructor]
        private IamApiClientGroupAccess(
            bool cloneAuthorizedUserGroups,

            ImmutableArray<Outputs.IamApiClientGroupAccessGroup> groups)
        {
            CloneAuthorizedUserGroups = cloneAuthorizedUserGroups;
            Groups = groups;
        }
    }
}
