// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetIamApiClient
    {
        public static Task<GetIamApiClientResult> InvokeAsync(GetIamApiClientArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIamApiClientResult>("akamai:index/getIamApiClient:getIamApiClient", args ?? new GetIamApiClientArgs(), options.WithDefaults());

        public static Output<GetIamApiClientResult> Invoke(GetIamApiClientInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamApiClientResult>("akamai:index/getIamApiClient:getIamApiClient", args ?? new GetIamApiClientInvokeArgs(), options.WithDefaults());

        public static Output<GetIamApiClientResult> Invoke(GetIamApiClientInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamApiClientResult>("akamai:index/getIamApiClient:getIamApiClient", args ?? new GetIamApiClientInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIamApiClientArgs : global::Pulumi.InvokeArgs
    {
        [Input("clientId")]
        public string? ClientId { get; set; }

        public GetIamApiClientArgs()
        {
        }
        public static new GetIamApiClientArgs Empty => new GetIamApiClientArgs();
    }

    public sealed class GetIamApiClientInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        public GetIamApiClientInvokeArgs()
        {
        }
        public static new GetIamApiClientInvokeArgs Empty => new GetIamApiClientInvokeArgs();
    }


    [OutputType]
    public sealed class GetIamApiClientResult
    {
        public readonly string AccessToken;
        public readonly Outputs.GetIamApiClientActionsResult Actions;
        public readonly int ActiveCredentialCount;
        public readonly bool AllowAccountSwitch;
        public readonly Outputs.GetIamApiClientApiAccessResult ApiAccess;
        public readonly ImmutableArray<string> AuthorizedUsers;
        public readonly string BaseUrl;
        public readonly bool CanAutoCreateCredential;
        public readonly string ClientDescription;
        public readonly string? ClientId;
        public readonly string ClientName;
        public readonly string ClientType;
        public readonly string CreatedBy;
        public readonly string CreatedDate;
        public readonly ImmutableArray<Outputs.GetIamApiClientCredentialResult> Credentials;
        public readonly Outputs.GetIamApiClientGroupAccessResult GroupAccess;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetIamApiClientIpAclResult IpAcl;
        public readonly bool IsLocked;
        public readonly ImmutableArray<string> NotificationEmails;
        public readonly Outputs.GetIamApiClientPurgeOptionsResult PurgeOptions;

        [OutputConstructor]
        private GetIamApiClientResult(
            string accessToken,

            Outputs.GetIamApiClientActionsResult actions,

            int activeCredentialCount,

            bool allowAccountSwitch,

            Outputs.GetIamApiClientApiAccessResult apiAccess,

            ImmutableArray<string> authorizedUsers,

            string baseUrl,

            bool canAutoCreateCredential,

            string clientDescription,

            string? clientId,

            string clientName,

            string clientType,

            string createdBy,

            string createdDate,

            ImmutableArray<Outputs.GetIamApiClientCredentialResult> credentials,

            Outputs.GetIamApiClientGroupAccessResult groupAccess,

            string id,

            Outputs.GetIamApiClientIpAclResult ipAcl,

            bool isLocked,

            ImmutableArray<string> notificationEmails,

            Outputs.GetIamApiClientPurgeOptionsResult purgeOptions)
        {
            AccessToken = accessToken;
            Actions = actions;
            ActiveCredentialCount = activeCredentialCount;
            AllowAccountSwitch = allowAccountSwitch;
            ApiAccess = apiAccess;
            AuthorizedUsers = authorizedUsers;
            BaseUrl = baseUrl;
            CanAutoCreateCredential = canAutoCreateCredential;
            ClientDescription = clientDescription;
            ClientId = clientId;
            ClientName = clientName;
            ClientType = clientType;
            CreatedBy = createdBy;
            CreatedDate = createdDate;
            Credentials = credentials;
            GroupAccess = groupAccess;
            Id = id;
            IpAcl = ipAcl;
            IsLocked = isLocked;
            NotificationEmails = notificationEmails;
            PurgeOptions = purgeOptions;
        }
    }
}
