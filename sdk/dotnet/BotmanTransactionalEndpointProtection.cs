// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/botmanTransactionalEndpointProtection:BotmanTransactionalEndpointProtection")]
    public partial class BotmanTransactionalEndpointProtection : global::Pulumi.CustomResource
    {
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        [Output("transactionalEndpointProtection")]
        public Output<string> TransactionalEndpointProtection { get; private set; } = null!;


        /// <summary>
        /// Create a BotmanTransactionalEndpointProtection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BotmanTransactionalEndpointProtection(string name, BotmanTransactionalEndpointProtectionArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/botmanTransactionalEndpointProtection:BotmanTransactionalEndpointProtection", name, args ?? new BotmanTransactionalEndpointProtectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BotmanTransactionalEndpointProtection(string name, Input<string> id, BotmanTransactionalEndpointProtectionState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/botmanTransactionalEndpointProtection:BotmanTransactionalEndpointProtection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BotmanTransactionalEndpointProtection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BotmanTransactionalEndpointProtection Get(string name, Input<string> id, BotmanTransactionalEndpointProtectionState? state = null, CustomResourceOptions? options = null)
        {
            return new BotmanTransactionalEndpointProtection(name, id, state, options);
        }
    }

    public sealed class BotmanTransactionalEndpointProtectionArgs : global::Pulumi.ResourceArgs
    {
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        [Input("transactionalEndpointProtection", required: true)]
        public Input<string> TransactionalEndpointProtection { get; set; } = null!;

        public BotmanTransactionalEndpointProtectionArgs()
        {
        }
        public static new BotmanTransactionalEndpointProtectionArgs Empty => new BotmanTransactionalEndpointProtectionArgs();
    }

    public sealed class BotmanTransactionalEndpointProtectionState : global::Pulumi.ResourceArgs
    {
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        [Input("transactionalEndpointProtection")]
        public Input<string>? TransactionalEndpointProtection { get; set; }

        public BotmanTransactionalEndpointProtectionState()
        {
        }
        public static new BotmanTransactionalEndpointProtectionState Empty => new BotmanTransactionalEndpointProtectionState();
    }
}
