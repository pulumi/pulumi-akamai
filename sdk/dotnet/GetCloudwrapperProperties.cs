// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetCloudwrapperProperties
    {
        public static Task<GetCloudwrapperPropertiesResult> InvokeAsync(GetCloudwrapperPropertiesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudwrapperPropertiesResult>("akamai:index/getCloudwrapperProperties:getCloudwrapperProperties", args ?? new GetCloudwrapperPropertiesArgs(), options.WithDefaults());

        public static Output<GetCloudwrapperPropertiesResult> Invoke(GetCloudwrapperPropertiesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudwrapperPropertiesResult>("akamai:index/getCloudwrapperProperties:getCloudwrapperProperties", args ?? new GetCloudwrapperPropertiesInvokeArgs(), options.WithDefaults());

        public static Output<GetCloudwrapperPropertiesResult> Invoke(GetCloudwrapperPropertiesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudwrapperPropertiesResult>("akamai:index/getCloudwrapperProperties:getCloudwrapperProperties", args ?? new GetCloudwrapperPropertiesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudwrapperPropertiesArgs : global::Pulumi.InvokeArgs
    {
        [Input("contractIds")]
        private List<string>? _contractIds;
        public List<string> ContractIds
        {
            get => _contractIds ?? (_contractIds = new List<string>());
            set => _contractIds = value;
        }

        [Input("properties")]
        private List<Inputs.GetCloudwrapperPropertiesPropertyArgs>? _properties;
        public List<Inputs.GetCloudwrapperPropertiesPropertyArgs> Properties
        {
            get => _properties ?? (_properties = new List<Inputs.GetCloudwrapperPropertiesPropertyArgs>());
            set => _properties = value;
        }

        [Input("unused")]
        public bool? Unused { get; set; }

        public GetCloudwrapperPropertiesArgs()
        {
        }
        public static new GetCloudwrapperPropertiesArgs Empty => new GetCloudwrapperPropertiesArgs();
    }

    public sealed class GetCloudwrapperPropertiesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("contractIds")]
        private InputList<string>? _contractIds;
        public InputList<string> ContractIds
        {
            get => _contractIds ?? (_contractIds = new InputList<string>());
            set => _contractIds = value;
        }

        [Input("properties")]
        private InputList<Inputs.GetCloudwrapperPropertiesPropertyInputArgs>? _properties;
        public InputList<Inputs.GetCloudwrapperPropertiesPropertyInputArgs> Properties
        {
            get => _properties ?? (_properties = new InputList<Inputs.GetCloudwrapperPropertiesPropertyInputArgs>());
            set => _properties = value;
        }

        [Input("unused")]
        public Input<bool>? Unused { get; set; }

        public GetCloudwrapperPropertiesInvokeArgs()
        {
        }
        public static new GetCloudwrapperPropertiesInvokeArgs Empty => new GetCloudwrapperPropertiesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudwrapperPropertiesResult
    {
        public readonly ImmutableArray<string> ContractIds;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetCloudwrapperPropertiesPropertyResult> Properties;
        public readonly bool? Unused;

        [OutputConstructor]
        private GetCloudwrapperPropertiesResult(
            ImmutableArray<string> contractIds,

            string id,

            ImmutableArray<Outputs.GetCloudwrapperPropertiesPropertyResult> properties,

            bool? unused)
        {
            ContractIds = contractIds;
            Id = id;
            Properties = properties;
            Unused = unused;
        }
    }
}
