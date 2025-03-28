// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240212BehaviorDatastreamInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        [Input("beaconStreamTitle")]
        public Input<string>? BeaconStreamTitle { get; set; }

        /// <summary>
        /// If enabled, gathers midgress traffic data within the Akamai platform, such as between two edge servers, for all streams configured.
        /// </summary>
        [Input("collectMidgressTraffic")]
        public Input<bool>? CollectMidgressTraffic { get; set; }

        /// <summary>
        /// A set of dash-separated DataStream ID values to limit the scope of reported data. By default, all active streams report. Use the DataStream application to gather stream ID values that apply to this property configuration. Specifying IDs for any streams that don't apply to this property has no effect, and results in no data reported.
        /// </summary>
        [Input("datastreamIds")]
        public Input<string>? DatastreamIds { get; set; }

        /// <summary>
        /// Enables DataStream reporting.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Enables log collection for the property by associating it with DataStream configurations.
        /// </summary>
        [Input("logEnabled")]
        public Input<bool>? LogEnabled { get; set; }

        [Input("logStreamNames")]
        private InputList<string>? _logStreamNames;

        /// <summary>
        /// Specifies the unique IDs of streams configured for the property. For properties created with the previous version of the rule format, this option contains a string instead of an array of strings. You can use the `List streams` operation to get stream IDs.
        /// </summary>
        public InputList<string> LogStreamNames
        {
            get => _logStreamNames ?? (_logStreamNames = new InputList<string>());
            set => _logStreamNames = value;
        }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        [Input("logStreamTitle")]
        public Input<string>? LogStreamTitle { get; set; }

        /// <summary>
        /// Specifies the percentage of log data you want to collect for this property.
        /// </summary>
        [Input("samplingPercentage")]
        public Input<int>? SamplingPercentage { get; set; }

        /// <summary>
        /// Specify the DataStream type.
        /// </summary>
        [Input("streamType")]
        public Input<string>? StreamType { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20240212BehaviorDatastreamInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240212BehaviorDatastreamInputArgs Empty => new GetPropertyRulesBuilderRulesV20240212BehaviorDatastreamInputArgs();
    }
}
