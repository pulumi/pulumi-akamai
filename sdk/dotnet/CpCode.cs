// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/cpCode:CpCode")]
    public partial class CpCode : global::Pulumi.CustomResource
    {
        [Output("contractId")]
        public Output<string> ContractId { get; private set; } = null!;

        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("productId")]
        public Output<string> ProductId { get; private set; } = null!;

        /// <summary>
        /// Enables to set timeout for processing
        /// </summary>
        [Output("timeouts")]
        public Output<Outputs.CpCodeTimeouts?> Timeouts { get; private set; } = null!;


        /// <summary>
        /// Create a CpCode resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CpCode(string name, CpCodeArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/cpCode:CpCode", name, args ?? new CpCodeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CpCode(string name, Input<string> id, CpCodeState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/cpCode:CpCode", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "akamai:properties/cpCode:CpCode" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CpCode resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CpCode Get(string name, Input<string> id, CpCodeState? state = null, CustomResourceOptions? options = null)
        {
            return new CpCode(name, id, state, options);
        }
    }

    public sealed class CpCodeArgs : global::Pulumi.ResourceArgs
    {
        [Input("contractId", required: true)]
        public Input<string> ContractId { get; set; } = null!;

        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("productId")]
        public Input<string>? ProductId { get; set; }

        /// <summary>
        /// Enables to set timeout for processing
        /// </summary>
        [Input("timeouts")]
        public Input<Inputs.CpCodeTimeoutsArgs>? Timeouts { get; set; }

        public CpCodeArgs()
        {
        }
        public static new CpCodeArgs Empty => new CpCodeArgs();
    }

    public sealed class CpCodeState : global::Pulumi.ResourceArgs
    {
        [Input("contractId")]
        public Input<string>? ContractId { get; set; }

        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("productId")]
        public Input<string>? ProductId { get; set; }

        /// <summary>
        /// Enables to set timeout for processing
        /// </summary>
        [Input("timeouts")]
        public Input<Inputs.CpCodeTimeoutsGetArgs>? Timeouts { get; set; }

        public CpCodeState()
        {
        }
        public static new CpCodeState Empty => new CpCodeState();
    }
}
