// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20250113CriterionFilenameArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public bool? Locked { get; set; }

        /// <summary>
        /// Sets a case-sensitive match for the `values` field.
        /// </summary>
        [Input("matchCaseSensitive")]
        public bool? MatchCaseSensitive { get; set; }

        /// <summary>
        /// If set to `IS_ONE_OF` or `IS_NOT_ONE_OF`, matches whether the filename matches one of the `values`. If set to `IS_EMPTY` or `IS_NOT_EMPTY`, matches whether the specified filename is part of the path.
        /// </summary>
        [Input("matchOperator")]
        public string? MatchOperator { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public string? Uuid { get; set; }

        [Input("values")]
        private List<string>? _values;

        /// <summary>
        /// Matches the filename component of the request URL. Allows wildcards, where `?` matches a single character and `*` matches zero or more characters. For example, specify `filename.*` to accept any extension.
        /// </summary>
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetPropertyRulesBuilderRulesV20250113CriterionFilenameArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20250113CriterionFilenameArgs Empty => new GetPropertyRulesBuilderRulesV20250113CriterionFilenameArgs();
    }
}
