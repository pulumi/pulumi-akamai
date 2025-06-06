// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/iamCidrBlock:IamCidrBlock")]
    public partial class IamCidrBlock : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies activities available for the CIDR block.
        /// </summary>
        [Output("actions")]
        public Output<Outputs.IamCidrBlockActions> Actions { get; private set; } = null!;

        /// <summary>
        /// The value of an IP address or IP address range.
        /// </summary>
        [Output("cidrBlock")]
        public Output<string> CidrBlock { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for each CIDR block.
        /// </summary>
        [Output("cidrBlockId")]
        public Output<int> CidrBlockId { get; private set; } = null!;

        /// <summary>
        /// Descriptive label you provide for the CIDR block.
        /// </summary>
        [Output("comments")]
        public Output<string?> Comments { get; private set; } = null!;

        /// <summary>
        /// The user who created the CIDR block.
        /// </summary>
        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        /// <summary>
        /// ISO 8601 timestamp indicating when the CIDR block was created.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// Enables the CIDR block on the account.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The user who last edited the CIDR block.
        /// </summary>
        [Output("modifiedBy")]
        public Output<string> ModifiedBy { get; private set; } = null!;

        /// <summary>
        /// ISO 8601 timestamp indicating when the CIDR block was last modified.
        /// </summary>
        [Output("modifiedDate")]
        public Output<string> ModifiedDate { get; private set; } = null!;


        /// <summary>
        /// Create a IamCidrBlock resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IamCidrBlock(string name, IamCidrBlockArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/iamCidrBlock:IamCidrBlock", name, args ?? new IamCidrBlockArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IamCidrBlock(string name, Input<string> id, IamCidrBlockState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/iamCidrBlock:IamCidrBlock", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing IamCidrBlock resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IamCidrBlock Get(string name, Input<string> id, IamCidrBlockState? state = null, CustomResourceOptions? options = null)
        {
            return new IamCidrBlock(name, id, state, options);
        }
    }

    public sealed class IamCidrBlockArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value of an IP address or IP address range.
        /// </summary>
        [Input("cidrBlock", required: true)]
        public Input<string> CidrBlock { get; set; } = null!;

        /// <summary>
        /// Descriptive label you provide for the CIDR block.
        /// </summary>
        [Input("comments")]
        public Input<string>? Comments { get; set; }

        /// <summary>
        /// Enables the CIDR block on the account.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public IamCidrBlockArgs()
        {
        }
        public static new IamCidrBlockArgs Empty => new IamCidrBlockArgs();
    }

    public sealed class IamCidrBlockState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies activities available for the CIDR block.
        /// </summary>
        [Input("actions")]
        public Input<Inputs.IamCidrBlockActionsGetArgs>? Actions { get; set; }

        /// <summary>
        /// The value of an IP address or IP address range.
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// Unique identifier for each CIDR block.
        /// </summary>
        [Input("cidrBlockId")]
        public Input<int>? CidrBlockId { get; set; }

        /// <summary>
        /// Descriptive label you provide for the CIDR block.
        /// </summary>
        [Input("comments")]
        public Input<string>? Comments { get; set; }

        /// <summary>
        /// The user who created the CIDR block.
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// ISO 8601 timestamp indicating when the CIDR block was created.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        /// <summary>
        /// Enables the CIDR block on the account.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The user who last edited the CIDR block.
        /// </summary>
        [Input("modifiedBy")]
        public Input<string>? ModifiedBy { get; set; }

        /// <summary>
        /// ISO 8601 timestamp indicating when the CIDR block was last modified.
        /// </summary>
        [Input("modifiedDate")]
        public Input<string>? ModifiedDate { get; set; }

        public IamCidrBlockState()
        {
        }
        public static new IamCidrBlockState Empty => new IamCidrBlockState();
    }
}
