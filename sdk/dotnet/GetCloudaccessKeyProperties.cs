// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetCloudaccessKeyProperties
    {
        public static Task<GetCloudaccessKeyPropertiesResult> InvokeAsync(GetCloudaccessKeyPropertiesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudaccessKeyPropertiesResult>("akamai:index/getCloudaccessKeyProperties:getCloudaccessKeyProperties", args ?? new GetCloudaccessKeyPropertiesArgs(), options.WithDefaults());

        public static Output<GetCloudaccessKeyPropertiesResult> Invoke(GetCloudaccessKeyPropertiesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudaccessKeyPropertiesResult>("akamai:index/getCloudaccessKeyProperties:getCloudaccessKeyProperties", args ?? new GetCloudaccessKeyPropertiesInvokeArgs(), options.WithDefaults());

        public static Output<GetCloudaccessKeyPropertiesResult> Invoke(GetCloudaccessKeyPropertiesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudaccessKeyPropertiesResult>("akamai:index/getCloudaccessKeyProperties:getCloudaccessKeyProperties", args ?? new GetCloudaccessKeyPropertiesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudaccessKeyPropertiesArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessKeyName", required: true)]
        public string AccessKeyName { get; set; } = null!;

        public GetCloudaccessKeyPropertiesArgs()
        {
        }
        public static new GetCloudaccessKeyPropertiesArgs Empty => new GetCloudaccessKeyPropertiesArgs();
    }

    public sealed class GetCloudaccessKeyPropertiesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("accessKeyName", required: true)]
        public Input<string> AccessKeyName { get; set; } = null!;

        public GetCloudaccessKeyPropertiesInvokeArgs()
        {
        }
        public static new GetCloudaccessKeyPropertiesInvokeArgs Empty => new GetCloudaccessKeyPropertiesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudaccessKeyPropertiesResult
    {
        public readonly string AccessKeyName;
        public readonly int AccessKeyUid;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetCloudaccessKeyPropertiesPropertyResult> Properties;

        [OutputConstructor]
        private GetCloudaccessKeyPropertiesResult(
            string accessKeyName,

            int accessKeyUid,

            string id,

            ImmutableArray<Outputs.GetCloudaccessKeyPropertiesPropertyResult> properties)
        {
            AccessKeyName = accessKeyName;
            AccessKeyUid = accessKeyUid;
            Id = id;
            Properties = properties;
        }
    }
}
