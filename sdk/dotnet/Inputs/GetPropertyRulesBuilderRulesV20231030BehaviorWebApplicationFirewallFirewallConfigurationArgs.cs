// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20231030BehaviorWebApplicationFirewallFirewallConfigurationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior
        /// </summary>
        [Input("fileName")]
        public Input<string>? FileName { get; set; }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior
        /// </summary>
        [Input("productionStatus")]
        public Input<string>? ProductionStatus { get; set; }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior
        /// </summary>
        [Input("productionVersion")]
        public Input<int>? ProductionVersion { get; set; }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior
        /// </summary>
        [Input("stagingStatus")]
        public Input<string>? StagingStatus { get; set; }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior
        /// </summary>
        [Input("stagingVersion")]
        public Input<int>? StagingVersion { get; set; }

        public GetPropertyRulesBuilderRulesV20231030BehaviorWebApplicationFirewallFirewallConfigurationInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20231030BehaviorWebApplicationFirewallFirewallConfigurationInputArgs Empty => new GetPropertyRulesBuilderRulesV20231030BehaviorWebApplicationFirewallFirewallConfigurationInputArgs();
    }
}
