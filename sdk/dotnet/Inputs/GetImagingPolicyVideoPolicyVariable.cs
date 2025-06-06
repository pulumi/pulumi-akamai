// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyVideoPolicyVariableArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The default value of the variable if no query parameter is provided. It needs to be one of the `enumOptions` if any are provided.
        /// </summary>
        [Input("defaultValue", required: true)]
        public string DefaultValue { get; set; } = null!;

        [Input("enumOptions")]
        private List<Inputs.GetImagingPolicyVideoPolicyVariableEnumOptionArgs>? _enumOptions;
        public List<Inputs.GetImagingPolicyVideoPolicyVariableEnumOptionArgs> EnumOptions
        {
            get => _enumOptions ?? (_enumOptions = new List<Inputs.GetImagingPolicyVideoPolicyVariableEnumOptionArgs>());
            set => _enumOptions = value;
        }

        /// <summary>
        /// The name of the variable, also available as the query parameter name to set the variable's value dynamically. Use up to 50 alphanumeric characters.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// A postfix added to the value provided for the variable, or to the default value.
        /// </summary>
        [Input("postfix")]
        public string? Postfix { get; set; }

        /// <summary>
        /// A prefix added to the value provided for the variable, or to the default value.
        /// </summary>
        [Input("prefix")]
        public string? Prefix { get; set; }

        /// <summary>
        /// The type of value for the variable.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetImagingPolicyVideoPolicyVariableArgs()
        {
        }
        public static new GetImagingPolicyVideoPolicyVariableArgs Empty => new GetImagingPolicyVideoPolicyVariableArgs();
    }
}
