// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/botmanBotManagementSettings:BotmanBotManagementSettings")]
    public partial class BotmanBotManagementSettings : global::Pulumi.CustomResource
    {
        [Output("botManagementSettings")]
        public Output<string> BotManagementSettings { get; private set; } = null!;

        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        [Output("securityPolicyId")]
        public Output<string> SecurityPolicyId { get; private set; } = null!;


        /// <summary>
        /// Create a BotmanBotManagementSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BotmanBotManagementSettings(string name, BotmanBotManagementSettingsArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/botmanBotManagementSettings:BotmanBotManagementSettings", name, args ?? new BotmanBotManagementSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BotmanBotManagementSettings(string name, Input<string> id, BotmanBotManagementSettingsState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/botmanBotManagementSettings:BotmanBotManagementSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BotmanBotManagementSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BotmanBotManagementSettings Get(string name, Input<string> id, BotmanBotManagementSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new BotmanBotManagementSettings(name, id, state, options);
        }
    }

    public sealed class BotmanBotManagementSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("botManagementSettings", required: true)]
        public Input<string> BotManagementSettings { get; set; } = null!;

        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        [Input("securityPolicyId", required: true)]
        public Input<string> SecurityPolicyId { get; set; } = null!;

        public BotmanBotManagementSettingsArgs()
        {
        }
        public static new BotmanBotManagementSettingsArgs Empty => new BotmanBotManagementSettingsArgs();
    }

    public sealed class BotmanBotManagementSettingsState : global::Pulumi.ResourceArgs
    {
        [Input("botManagementSettings")]
        public Input<string>? BotManagementSettings { get; set; }

        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        public BotmanBotManagementSettingsState()
        {
        }
        public static new BotmanBotManagementSettingsState Empty => new BotmanBotManagementSettingsState();
    }
}
