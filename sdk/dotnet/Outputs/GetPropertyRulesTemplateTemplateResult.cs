// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesTemplateTemplateResult
    {
        /// <summary>
        /// Content of the template as string
        /// </summary>
        public readonly string TemplateData;
        /// <summary>
        /// Directory points to a folder, which contains snippets to include into template.
        /// </summary>
        public readonly string TemplateDir;

        [OutputConstructor]
        private GetPropertyRulesTemplateTemplateResult(
            string templateData,

            string templateDir)
        {
            TemplateData = templateData;
            TemplateDir = templateDir;
        }
    }
}
