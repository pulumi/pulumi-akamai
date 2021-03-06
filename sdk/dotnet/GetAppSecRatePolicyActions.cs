// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecRatePolicyActions
    {
        /// <summary>
        /// Use the `akamai.getAppSecRatePolicyActions` data source to retrieve a list of all rate policies associated with a given configuration version and security policy, or the actions associated with a specific rate policy.
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
        ///         var ratePolicyActionsAppSecRatePolicyActions = Output.Tuple(configuration, configuration).Apply(values =&gt;
        ///         {
        ///             var configuration = values.Item1;
        ///             var configuration1 = values.Item2;
        ///             return Output.Create(Akamai.GetAppSecRatePolicyActions.InvokeAsync(new Akamai.GetAppSecRatePolicyActionsArgs
        ///             {
        ///                 ConfigId = configuration.ConfigId,
        ///                 Version = configuration1.LatestVersion,
        ///                 SecurityPolicyId = @var.Security_policy_id,
        ///             }));
        ///         });
        ///         this.RatePolicyActions = ratePolicyActionsAppSecRatePolicyActions.Apply(ratePolicyActionsAppSecRatePolicyActions =&gt; ratePolicyActionsAppSecRatePolicyActions.OutputText);
        ///     }
        /// 
        ///     [Output("ratePolicyActions")]
        ///     public Output&lt;string&gt; RatePolicyActions { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAppSecRatePolicyActionsResult> InvokeAsync(GetAppSecRatePolicyActionsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppSecRatePolicyActionsResult>("akamai:index/getAppSecRatePolicyActions:getAppSecRatePolicyActions", args ?? new GetAppSecRatePolicyActionsArgs(), options.WithVersion());
    }


    public sealed class GetAppSecRatePolicyActionsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        /// <summary>
        /// The ID of the rate policy to use. If not supplied, information about all rate policies will be returned.
        /// </summary>
        [Input("ratePolicyId")]
        public int? RatePolicyId { get; set; }

        /// <summary>
        /// The ID of the security policy to use.
        /// </summary>
        [Input("securityPolicyId", required: true)]
        public string SecurityPolicyId { get; set; } = null!;

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version", required: true)]
        public int Version { get; set; }

        public GetAppSecRatePolicyActionsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppSecRatePolicyActionsResult
    {
        public readonly int ConfigId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A tabular display showing the ID IPv4Action and IPv6Action of the indicated security policy.
        /// </summary>
        public readonly string OutputText;
        public readonly int? RatePolicyId;
        public readonly string SecurityPolicyId;
        public readonly int Version;

        [OutputConstructor]
        private GetAppSecRatePolicyActionsResult(
            int configId,

            string id,

            string outputText,

            int? ratePolicyId,

            string securityPolicyId,

            int version)
        {
            ConfigId = configId;
            Id = id;
            OutputText = outputText;
            RatePolicyId = ratePolicyId;
            SecurityPolicyId = securityPolicyId;
            Version = version;
        }
    }
}
