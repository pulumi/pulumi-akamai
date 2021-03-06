// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecEvalHostnames
    {
        /// <summary>
        /// Use the `akamai.AppSecEvalHostnames` data source to retrieve the evaluation hostnames for a configuration version. Evaluation mode for hostnames is only available for Web Application Protector. Run hostnames in evaluation mode to see how your configuration settings protect traffic for that hostname before adding a hostname directly to a live configuration. An evaluation period lasts four weeks unless you stop the evaluation. Once you begin, the hostnames you evaluate start responding to traffic as if they are your current hostnames. However, instead of taking an action the evaluation hostnames log which action they would have taken if they were your actively-protected hostnames and not a test.
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
        ///         var evalHostnamesAppSecEvalHostnames = Output.Tuple(configuration, configuration).Apply(values =&gt;
        ///         {
        ///             var configuration = values.Item1;
        ///             var configuration1 = values.Item2;
        ///             return Output.Create(Akamai.GetAppSecEvalHostnames.InvokeAsync(new Akamai.GetAppSecEvalHostnamesArgs
        ///             {
        ///                 ConfigId = configuration.ConfigId,
        ///                 Version = configuration1.LatestVersion,
        ///             }));
        ///         });
        ///         this.EvalHostnames = evalHostnamesAppSecEvalHostnames.Apply(evalHostnamesAppSecEvalHostnames =&gt; evalHostnamesAppSecEvalHostnames.Hostnames);
        ///         this.EvalHostnamesOutput = evalHostnamesAppSecEvalHostnames.Apply(evalHostnamesAppSecEvalHostnames =&gt; evalHostnamesAppSecEvalHostnames.OutputText);
        ///         this.EvalHostnamesJson = evalHostnamesAppSecEvalHostnames.Apply(evalHostnamesAppSecEvalHostnames =&gt; evalHostnamesAppSecEvalHostnames.Json);
        ///     }
        /// 
        ///     [Output("evalHostnames")]
        ///     public Output&lt;string&gt; EvalHostnames { get; set; }
        ///     [Output("evalHostnamesOutput")]
        ///     public Output&lt;string&gt; EvalHostnamesOutput { get; set; }
        ///     [Output("evalHostnamesJson")]
        ///     public Output&lt;string&gt; EvalHostnamesJson { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAppSecEvalHostnamesResult> InvokeAsync(GetAppSecEvalHostnamesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppSecEvalHostnamesResult>("akamai:index/getAppSecEvalHostnames:getAppSecEvalHostnames", args ?? new GetAppSecEvalHostnamesArgs(), options.WithVersion());
    }


    public sealed class GetAppSecEvalHostnamesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version", required: true)]
        public int Version { get; set; }

        public GetAppSecEvalHostnamesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppSecEvalHostnamesResult
    {
        public readonly int ConfigId;
        /// <summary>
        /// A list of the evaluation hostnames.
        /// </summary>
        public readonly ImmutableArray<string> Hostnames;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A JSON-formatted list of the evaluation hostnames.
        /// </summary>
        public readonly string Json;
        /// <summary>
        /// A tabular display showing the evaluation hostnames.
        /// </summary>
        public readonly string OutputText;
        public readonly int Version;

        [OutputConstructor]
        private GetAppSecEvalHostnamesResult(
            int configId,

            ImmutableArray<string> hostnames,

            string id,

            string json,

            string outputText,

            int version)
        {
            ConfigId = configId;
            Hostnames = hostnames;
            Id = id;
            Json = json;
            OutputText = outputText;
            Version = version;
        }
    }
}
