// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecAdvancedSettingsPragmaHeader
    {
        public static Task<GetAppSecAdvancedSettingsPragmaHeaderResult> InvokeAsync(GetAppSecAdvancedSettingsPragmaHeaderArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAppSecAdvancedSettingsPragmaHeaderResult>("akamai:index/getAppSecAdvancedSettingsPragmaHeader:getAppSecAdvancedSettingsPragmaHeader", args ?? new GetAppSecAdvancedSettingsPragmaHeaderArgs(), options.WithDefaults());

        public static Output<GetAppSecAdvancedSettingsPragmaHeaderResult> Invoke(GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppSecAdvancedSettingsPragmaHeaderResult>("akamai:index/getAppSecAdvancedSettingsPragmaHeader:getAppSecAdvancedSettingsPragmaHeader", args ?? new GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs(), options.WithDefaults());

        public static Output<GetAppSecAdvancedSettingsPragmaHeaderResult> Invoke(GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAppSecAdvancedSettingsPragmaHeaderResult>("akamai:index/getAppSecAdvancedSettingsPragmaHeader:getAppSecAdvancedSettingsPragmaHeader", args ?? new GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppSecAdvancedSettingsPragmaHeaderArgs : global::Pulumi.InvokeArgs
    {
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        [Input("securityPolicyId")]
        public string? SecurityPolicyId { get; set; }

        public GetAppSecAdvancedSettingsPragmaHeaderArgs()
        {
        }
        public static new GetAppSecAdvancedSettingsPragmaHeaderArgs Empty => new GetAppSecAdvancedSettingsPragmaHeaderArgs();
    }

    public sealed class GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        public GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs()
        {
        }
        public static new GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs Empty => new GetAppSecAdvancedSettingsPragmaHeaderInvokeArgs();
    }


    [OutputType]
    public sealed class GetAppSecAdvancedSettingsPragmaHeaderResult
    {
        public readonly int ConfigId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string OutputText;
        public readonly string? SecurityPolicyId;

        [OutputConstructor]
        private GetAppSecAdvancedSettingsPragmaHeaderResult(
            int configId,

            string id,

            string json,

            string outputText,

            string? securityPolicyId)
        {
            ConfigId = configId;
            Id = id;
            Json = json;
            OutputText = outputText;
            SecurityPolicyId = securityPolicyId;
        }
    }
}
