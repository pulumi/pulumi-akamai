// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecFailoverHostnames
    {
        public static Task<GetAppSecFailoverHostnamesResult> InvokeAsync(GetAppSecFailoverHostnamesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAppSecFailoverHostnamesResult>("akamai:index/getAppSecFailoverHostnames:getAppSecFailoverHostnames", args ?? new GetAppSecFailoverHostnamesArgs(), options.WithDefaults());

        public static Output<GetAppSecFailoverHostnamesResult> Invoke(GetAppSecFailoverHostnamesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppSecFailoverHostnamesResult>("akamai:index/getAppSecFailoverHostnames:getAppSecFailoverHostnames", args ?? new GetAppSecFailoverHostnamesInvokeArgs(), options.WithDefaults());

        public static Output<GetAppSecFailoverHostnamesResult> Invoke(GetAppSecFailoverHostnamesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppSecFailoverHostnamesResult>("akamai:index/getAppSecFailoverHostnames:getAppSecFailoverHostnames", args ?? new GetAppSecFailoverHostnamesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppSecFailoverHostnamesArgs : global::Pulumi.InvokeArgs
    {
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        public GetAppSecFailoverHostnamesArgs()
        {
        }
        public static new GetAppSecFailoverHostnamesArgs Empty => new GetAppSecFailoverHostnamesArgs();
    }

    public sealed class GetAppSecFailoverHostnamesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        public GetAppSecFailoverHostnamesInvokeArgs()
        {
        }
        public static new GetAppSecFailoverHostnamesInvokeArgs Empty => new GetAppSecFailoverHostnamesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAppSecFailoverHostnamesResult
    {
        public readonly int ConfigId;
        public readonly ImmutableArray<string> Hostnames;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string OutputText;

        [OutputConstructor]
        private GetAppSecFailoverHostnamesResult(
            int configId,

            ImmutableArray<string> hostnames,

            string id,

            string json,

            string outputText)
        {
            ConfigId = configId;
            Hostnames = hostnames;
            Id = id;
            Json = json;
            OutputText = outputText;
        }
    }
}
