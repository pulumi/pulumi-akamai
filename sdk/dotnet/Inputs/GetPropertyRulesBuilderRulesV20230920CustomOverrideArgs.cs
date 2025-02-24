// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230920CustomOverrideInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of a custom override
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of a custom override
        /// </summary>
        [Input("overrideId")]
        public Input<string>? OverrideId { get; set; }

        public GetPropertyRulesBuilderRulesV20230920CustomOverrideInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230920CustomOverrideInputArgs Empty => new GetPropertyRulesBuilderRulesV20230920CustomOverrideInputArgs();
    }
}
