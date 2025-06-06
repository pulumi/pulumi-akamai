// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetGtmResources
    {
        public static Task<GetGtmResourcesResult> InvokeAsync(GetGtmResourcesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGtmResourcesResult>("akamai:index/getGtmResources:getGtmResources", args ?? new GetGtmResourcesArgs(), options.WithDefaults());

        public static Output<GetGtmResourcesResult> Invoke(GetGtmResourcesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGtmResourcesResult>("akamai:index/getGtmResources:getGtmResources", args ?? new GetGtmResourcesInvokeArgs(), options.WithDefaults());

        public static Output<GetGtmResourcesResult> Invoke(GetGtmResourcesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetGtmResourcesResult>("akamai:index/getGtmResources:getGtmResources", args ?? new GetGtmResourcesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGtmResourcesArgs : global::Pulumi.InvokeArgs
    {
        [Input("domain", required: true)]
        public string Domain { get; set; } = null!;

        [Input("resources")]
        private List<Inputs.GetGtmResourcesResourceArgs>? _resources;
        public List<Inputs.GetGtmResourcesResourceArgs> Resources
        {
            get => _resources ?? (_resources = new List<Inputs.GetGtmResourcesResourceArgs>());
            set => _resources = value;
        }

        public GetGtmResourcesArgs()
        {
        }
        public static new GetGtmResourcesArgs Empty => new GetGtmResourcesArgs();
    }

    public sealed class GetGtmResourcesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        [Input("resources")]
        private InputList<Inputs.GetGtmResourcesResourceInputArgs>? _resources;
        public InputList<Inputs.GetGtmResourcesResourceInputArgs> Resources
        {
            get => _resources ?? (_resources = new InputList<Inputs.GetGtmResourcesResourceInputArgs>());
            set => _resources = value;
        }

        public GetGtmResourcesInvokeArgs()
        {
        }
        public static new GetGtmResourcesInvokeArgs Empty => new GetGtmResourcesInvokeArgs();
    }


    [OutputType]
    public sealed class GetGtmResourcesResult
    {
        public readonly string Domain;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetGtmResourcesResourceResult> Resources;

        [OutputConstructor]
        private GetGtmResourcesResult(
            string domain,

            string id,

            ImmutableArray<Outputs.GetGtmResourcesResourceResult> resources)
        {
            Domain = domain;
            Id = id;
            Resources = resources;
        }
    }
}
