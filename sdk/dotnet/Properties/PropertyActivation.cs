// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Properties
{
    [Obsolete(@"akamai.properties.PropertyActivation has been deprecated in favor of akamai.PropertyActivation")]
    [AkamaiResourceType("akamai:properties/propertyActivation:PropertyActivation")]
    public partial class PropertyActivation : Pulumi.CustomResource
    {
        [Output("activationId")]
        public Output<string> ActivationId { get; private set; } = null!;

        /// <summary>
        /// automatically acknowledge all rule warnings for activation to continue. default is true
        /// </summary>
        [Output("autoAcknowledgeRuleWarnings")]
        public Output<bool?> AutoAcknowledgeRuleWarnings { get; private set; } = null!;

        [Output("contacts")]
        public Output<ImmutableArray<string>> Contacts { get; private set; } = null!;

        [Output("errors")]
        public Output<string> Errors { get; private set; } = null!;

        [Output("network")]
        public Output<string?> Network { get; private set; } = null!;

        [Output("property")]
        public Output<string> Property { get; private set; } = null!;

        [Output("propertyId")]
        public Output<string> PropertyId { get; private set; } = null!;

        [Output("ruleErrors")]
        public Output<ImmutableArray<Outputs.PropertyActivationRuleError>> RuleErrors { get; private set; } = null!;

        [Output("ruleWarnings")]
        public Output<ImmutableArray<Outputs.PropertyActivationRuleWarning>> RuleWarnings { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("version")]
        public Output<int> Version { get; private set; } = null!;

        [Output("warnings")]
        public Output<string> Warnings { get; private set; } = null!;


        /// <summary>
        /// Create a PropertyActivation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PropertyActivation(string name, PropertyActivationArgs args, CustomResourceOptions? options = null)
            : base("akamai:properties/propertyActivation:PropertyActivation", name, args ?? new PropertyActivationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PropertyActivation(string name, Input<string> id, PropertyActivationState? state = null, CustomResourceOptions? options = null)
            : base("akamai:properties/propertyActivation:PropertyActivation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PropertyActivation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PropertyActivation Get(string name, Input<string> id, PropertyActivationState? state = null, CustomResourceOptions? options = null)
        {
            return new PropertyActivation(name, id, state, options);
        }
    }

    public sealed class PropertyActivationArgs : Pulumi.ResourceArgs
    {
        [Input("activationId")]
        public Input<string>? ActivationId { get; set; }

        /// <summary>
        /// automatically acknowledge all rule warnings for activation to continue. default is true
        /// </summary>
        [Input("autoAcknowledgeRuleWarnings")]
        public Input<bool>? AutoAcknowledgeRuleWarnings { get; set; }

        [Input("contacts", required: true)]
        private InputList<string>? _contacts;
        public InputList<string> Contacts
        {
            get => _contacts ?? (_contacts = new InputList<string>());
            set => _contacts = value;
        }

        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("property")]
        public Input<string>? Property { get; set; }

        [Input("propertyId")]
        public Input<string>? PropertyId { get; set; }

        [Input("ruleErrors")]
        private InputList<Inputs.PropertyActivationRuleErrorArgs>? _ruleErrors;
        public InputList<Inputs.PropertyActivationRuleErrorArgs> RuleErrors
        {
            get => _ruleErrors ?? (_ruleErrors = new InputList<Inputs.PropertyActivationRuleErrorArgs>());
            set => _ruleErrors = value;
        }

        [Input("ruleWarnings")]
        private InputList<Inputs.PropertyActivationRuleWarningArgs>? _ruleWarnings;
        [Obsolete(@"Rule warnings will not be set in state anymore")]
        public InputList<Inputs.PropertyActivationRuleWarningArgs> RuleWarnings
        {
            get => _ruleWarnings ?? (_ruleWarnings = new InputList<Inputs.PropertyActivationRuleWarningArgs>());
            set => _ruleWarnings = value;
        }

        [Input("version", required: true)]
        public Input<int> Version { get; set; } = null!;

        public PropertyActivationArgs()
        {
        }
    }

    public sealed class PropertyActivationState : Pulumi.ResourceArgs
    {
        [Input("activationId")]
        public Input<string>? ActivationId { get; set; }

        /// <summary>
        /// automatically acknowledge all rule warnings for activation to continue. default is true
        /// </summary>
        [Input("autoAcknowledgeRuleWarnings")]
        public Input<bool>? AutoAcknowledgeRuleWarnings { get; set; }

        [Input("contacts")]
        private InputList<string>? _contacts;
        public InputList<string> Contacts
        {
            get => _contacts ?? (_contacts = new InputList<string>());
            set => _contacts = value;
        }

        [Input("errors")]
        public Input<string>? Errors { get; set; }

        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("property")]
        public Input<string>? Property { get; set; }

        [Input("propertyId")]
        public Input<string>? PropertyId { get; set; }

        [Input("ruleErrors")]
        private InputList<Inputs.PropertyActivationRuleErrorGetArgs>? _ruleErrors;
        public InputList<Inputs.PropertyActivationRuleErrorGetArgs> RuleErrors
        {
            get => _ruleErrors ?? (_ruleErrors = new InputList<Inputs.PropertyActivationRuleErrorGetArgs>());
            set => _ruleErrors = value;
        }

        [Input("ruleWarnings")]
        private InputList<Inputs.PropertyActivationRuleWarningGetArgs>? _ruleWarnings;
        [Obsolete(@"Rule warnings will not be set in state anymore")]
        public InputList<Inputs.PropertyActivationRuleWarningGetArgs> RuleWarnings
        {
            get => _ruleWarnings ?? (_ruleWarnings = new InputList<Inputs.PropertyActivationRuleWarningGetArgs>());
            set => _ruleWarnings = value;
        }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("version")]
        public Input<int>? Version { get; set; }

        [Input("warnings")]
        public Input<string>? Warnings { get; set; }

        public PropertyActivationState()
        {
        }
    }
}
