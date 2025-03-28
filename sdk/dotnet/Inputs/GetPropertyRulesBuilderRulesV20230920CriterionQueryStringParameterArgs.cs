// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230920CriterionQueryStringParameterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Matches when the `value` is URL-escaped.
        /// </summary>
        [Input("escapeValue")]
        public Input<bool>? EscapeValue { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Specifies the match's minimum value.
        /// </summary>
        [Input("lowerBound")]
        public Input<int>? LowerBound { get; set; }

        /// <summary>
        /// Sets a case-sensitive match for the `parameterName` field.
        /// </summary>
        [Input("matchCaseSensitiveName")]
        public Input<bool>? MatchCaseSensitiveName { get; set; }

        /// <summary>
        /// Sets a case-sensitive match for the `value` field.
        /// </summary>
        [Input("matchCaseSensitiveValue")]
        public Input<bool>? MatchCaseSensitiveValue { get; set; }

        /// <summary>
        /// Narrows the match criteria.
        /// </summary>
        [Input("matchOperator")]
        public Input<string>? MatchOperator { get; set; }

        /// <summary>
        /// Allows wildcards in the `parameterName` field, where `?` matches a single character and `*` matches zero or more characters.
        /// </summary>
        [Input("matchWildcardName")]
        public Input<bool>? MatchWildcardName { get; set; }

        /// <summary>
        /// Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
        /// </summary>
        [Input("matchWildcardValue")]
        public Input<bool>? MatchWildcardValue { get; set; }

        /// <summary>
        /// The name of the query field, for example, `q` in `?q=string`.
        /// </summary>
        [Input("parameterName")]
        public Input<string>? ParameterName { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// When the `value` is numeric, this field specifies the match's maximum value.
        /// </summary>
        [Input("upperBound")]
        public Input<int>? UpperBound { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// The value of the query field, for example, `string` in `?q=string`.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetPropertyRulesBuilderRulesV20230920CriterionQueryStringParameterInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230920CriterionQueryStringParameterInputArgs Empty => new GetPropertyRulesBuilderRulesV20230920CriterionQueryStringParameterInputArgs();
    }
}
