// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20240531CriterionVariableErrorResult
    {
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Matches errors for the specified set of `variableNames`, otherwise matches errors from variables outside that set.
        /// </summary>
        public readonly bool? Result;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;
        /// <summary>
        /// The name of the variable whose error triggers the match, or a space- or comma-delimited list of more than one variable name. Note that if you define a variable named `VAR`, the name in this field needs to appear with its added prefix as `PMUSER_VAR`. When such a variable is inserted into other fields, it appears with an additional namespace as `{{user.PMUSER_VAR}}`. See the `setVariable` behavior for details on variable names.
        /// </summary>
        public readonly ImmutableArray<string> VariableNames;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240531CriterionVariableErrorResult(
            bool? locked,

            bool? result,

            string? templateUuid,

            string? uuid,

            ImmutableArray<string> variableNames)
        {
            Locked = locked;
            Result = result;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            VariableNames = variableNames;
        }
    }
}
