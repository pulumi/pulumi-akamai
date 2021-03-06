// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecAdvancedSettingsPrefetch
    {
        /// <summary>
        /// Use the `akamai.AppSecAdvancedSettingsPrefetch` data source to retrieve information the prefetch request settings for a security configuration. The information available is described [here](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getprefetchrequestsforaconfiguration).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic usage:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Akamai = Pulumi.Akamai;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var configuration = Output.Create(Akamai.GetAppSecConfiguration.InvokeAsync(new Akamai.GetAppSecConfigurationArgs
        ///         {
        ///             Name = @var.Security_configuration,
        ///         }));
        ///         var prefetch = Output.Tuple(configuration, configuration).Apply(values =&gt;
        ///         {
        ///             var configuration = values.Item1;
        ///             var configuration1 = values.Item2;
        ///             return Output.Create(Akamai.GetAppSecAdvancedSettingsPrefetch.InvokeAsync(new Akamai.GetAppSecAdvancedSettingsPrefetchArgs
        ///             {
        ///                 ConfigId = configuration.ConfigId,
        ///                 Version = configuration1.LatestVersion,
        ///             }));
        ///         });
        ///         this.AdvancedSettingsPrefetchOutput = prefetch.Apply(prefetch =&gt; prefetch.OutputText);
        ///         this.AdvancedSettingsPrefetchJson = prefetch.Apply(prefetch =&gt; prefetch.Json);
        ///     }
        /// 
        ///     [Output("advancedSettingsPrefetchOutput")]
        ///     public Output&lt;string&gt; AdvancedSettingsPrefetchOutput { get; set; }
        ///     [Output("advancedSettingsPrefetchJson")]
        ///     public Output&lt;string&gt; AdvancedSettingsPrefetchJson { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAppSecAdvancedSettingsPrefetchResult> InvokeAsync(GetAppSecAdvancedSettingsPrefetchArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppSecAdvancedSettingsPrefetchResult>("akamai:index/getAppSecAdvancedSettingsPrefetch:getAppSecAdvancedSettingsPrefetch", args ?? new GetAppSecAdvancedSettingsPrefetchArgs(), options.WithVersion());
    }


    public sealed class GetAppSecAdvancedSettingsPrefetchArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The configuration ID.
        /// </summary>
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        /// <summary>
        /// The version number of the configuration.
        /// </summary>
        [Input("version", required: true)]
        public int Version { get; set; }

        public GetAppSecAdvancedSettingsPrefetchArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppSecAdvancedSettingsPrefetchResult
    {
        public readonly int ConfigId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A JSON-formatted list of information about the prefetch request settings.
        /// </summary>
        public readonly string Json;
        /// <summary>
        /// A tabular display showing the prefetch request settings.
        /// </summary>
        public readonly string OutputText;
        public readonly int Version;

        [OutputConstructor]
        private GetAppSecAdvancedSettingsPrefetchResult(
            int configId,

            string id,

            string json,

            string outputText,

            int version)
        {
            ConfigId = configId;
            Id = id;
            Json = json;
            OutputText = outputText;
            Version = version;
        }
    }
}
