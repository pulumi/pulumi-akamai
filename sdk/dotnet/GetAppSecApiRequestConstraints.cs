// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecApiRequestConstraints
    {
        public static Task<GetAppSecApiRequestConstraintsResult> InvokeAsync(GetAppSecApiRequestConstraintsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAppSecApiRequestConstraintsResult>("akamai:index/getAppSecApiRequestConstraints:getAppSecApiRequestConstraints", args ?? new GetAppSecApiRequestConstraintsArgs(), options.WithDefaults());

        public static Output<GetAppSecApiRequestConstraintsResult> Invoke(GetAppSecApiRequestConstraintsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppSecApiRequestConstraintsResult>("akamai:index/getAppSecApiRequestConstraints:getAppSecApiRequestConstraints", args ?? new GetAppSecApiRequestConstraintsInvokeArgs(), options.WithDefaults());

        public static Output<GetAppSecApiRequestConstraintsResult> Invoke(GetAppSecApiRequestConstraintsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppSecApiRequestConstraintsResult>("akamai:index/getAppSecApiRequestConstraints:getAppSecApiRequestConstraints", args ?? new GetAppSecApiRequestConstraintsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppSecApiRequestConstraintsArgs : global::Pulumi.InvokeArgs
    {
        [Input("apiId")]
        public int? ApiId { get; set; }

        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        [Input("securityPolicyId", required: true)]
        public string SecurityPolicyId { get; set; } = null!;

        public GetAppSecApiRequestConstraintsArgs()
        {
        }
        public static new GetAppSecApiRequestConstraintsArgs Empty => new GetAppSecApiRequestConstraintsArgs();
    }

    public sealed class GetAppSecApiRequestConstraintsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("apiId")]
        public Input<int>? ApiId { get; set; }

        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        [Input("securityPolicyId", required: true)]
        public Input<string> SecurityPolicyId { get; set; } = null!;

        public GetAppSecApiRequestConstraintsInvokeArgs()
        {
        }
        public static new GetAppSecApiRequestConstraintsInvokeArgs Empty => new GetAppSecApiRequestConstraintsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAppSecApiRequestConstraintsResult
    {
        public readonly int? ApiId;
        public readonly int ConfigId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string OutputText;
        public readonly string SecurityPolicyId;

        [OutputConstructor]
        private GetAppSecApiRequestConstraintsResult(
            int? apiId,

            int configId,

            string id,

            string json,

            string outputText,

            string securityPolicyId)
        {
            ApiId = apiId;
            ConfigId = configId;
            Id = id;
            Json = json;
            OutputText = outputText;
            SecurityPolicyId = securityPolicyId;
        }
    }
}
