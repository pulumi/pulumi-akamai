// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/appSecRule:AppSecRule")]
    public partial class AppSecRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// JSON-formatted condition and exception information for the rule
        /// </summary>
        [Output("conditionException")]
        public Output<string?> ConditionException { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the security configuration
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// Action to be taken when the rule is triggered
        /// </summary>
        [Output("ruleAction")]
        public Output<string> RuleAction { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the rule
        /// </summary>
        [Output("ruleId")]
        public Output<int> RuleId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the security policy
        /// </summary>
        [Output("securityPolicyId")]
        public Output<string> SecurityPolicyId { get; private set; } = null!;


        /// <summary>
        /// Create a AppSecRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppSecRule(string name, AppSecRuleArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/appSecRule:AppSecRule", name, args ?? new AppSecRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppSecRule(string name, Input<string> id, AppSecRuleState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/appSecRule:AppSecRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppSecRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppSecRule Get(string name, Input<string> id, AppSecRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new AppSecRule(name, id, state, options);
        }
    }

    public sealed class AppSecRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JSON-formatted condition and exception information for the rule
        /// </summary>
        [Input("conditionException")]
        public Input<string>? ConditionException { get; set; }

        /// <summary>
        /// Unique identifier of the security configuration
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// Action to be taken when the rule is triggered
        /// </summary>
        [Input("ruleAction")]
        public Input<string>? RuleAction { get; set; }

        /// <summary>
        /// Unique identifier of the rule
        /// </summary>
        [Input("ruleId", required: true)]
        public Input<int> RuleId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the security policy
        /// </summary>
        [Input("securityPolicyId", required: true)]
        public Input<string> SecurityPolicyId { get; set; } = null!;

        public AppSecRuleArgs()
        {
        }
        public static new AppSecRuleArgs Empty => new AppSecRuleArgs();
    }

    public sealed class AppSecRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JSON-formatted condition and exception information for the rule
        /// </summary>
        [Input("conditionException")]
        public Input<string>? ConditionException { get; set; }

        /// <summary>
        /// Unique identifier of the security configuration
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// Action to be taken when the rule is triggered
        /// </summary>
        [Input("ruleAction")]
        public Input<string>? RuleAction { get; set; }

        /// <summary>
        /// Unique identifier of the rule
        /// </summary>
        [Input("ruleId")]
        public Input<int>? RuleId { get; set; }

        /// <summary>
        /// Unique identifier of the security policy
        /// </summary>
        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        public AppSecRuleState()
        {
        }
        public static new AppSecRuleState Empty => new AppSecRuleState();
    }
}
