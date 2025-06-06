// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/botmanBotCategoryException:BotmanBotCategoryException")]
    public partial class BotmanBotCategoryException : global::Pulumi.CustomResource
    {
        [Output("botCategoryException")]
        public Output<string> BotCategoryException { get; private set; } = null!;

        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        [Output("securityPolicyId")]
        public Output<string> SecurityPolicyId { get; private set; } = null!;


        /// <summary>
        /// Create a BotmanBotCategoryException resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BotmanBotCategoryException(string name, BotmanBotCategoryExceptionArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/botmanBotCategoryException:BotmanBotCategoryException", name, args ?? new BotmanBotCategoryExceptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BotmanBotCategoryException(string name, Input<string> id, BotmanBotCategoryExceptionState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/botmanBotCategoryException:BotmanBotCategoryException", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BotmanBotCategoryException resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BotmanBotCategoryException Get(string name, Input<string> id, BotmanBotCategoryExceptionState? state = null, CustomResourceOptions? options = null)
        {
            return new BotmanBotCategoryException(name, id, state, options);
        }
    }

    public sealed class BotmanBotCategoryExceptionArgs : global::Pulumi.ResourceArgs
    {
        [Input("botCategoryException", required: true)]
        public Input<string> BotCategoryException { get; set; } = null!;

        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        [Input("securityPolicyId", required: true)]
        public Input<string> SecurityPolicyId { get; set; } = null!;

        public BotmanBotCategoryExceptionArgs()
        {
        }
        public static new BotmanBotCategoryExceptionArgs Empty => new BotmanBotCategoryExceptionArgs();
    }

    public sealed class BotmanBotCategoryExceptionState : global::Pulumi.ResourceArgs
    {
        [Input("botCategoryException")]
        public Input<string>? BotCategoryException { get; set; }

        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        public BotmanBotCategoryExceptionState()
        {
        }
        public static new BotmanBotCategoryExceptionState Empty => new BotmanBotCategoryExceptionState();
    }
}
