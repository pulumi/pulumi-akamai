// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class DatastreamDeliveryConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A delimiter that you use to separate data set fields in log lines
        /// </summary>
        [Input("fieldDelimiter")]
        public Input<string>? FieldDelimiter { get; set; }

        /// <summary>
        /// The format in which logs will be received
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        /// <summary>
        /// The frequency of collecting logs from each uploader and sending these logs to a destination
        /// </summary>
        [Input("frequency", required: true)]
        public Input<Inputs.DatastreamDeliveryConfigurationFrequencyGetArgs> Frequency { get; set; } = null!;

        /// <summary>
        /// The prefix of the log file that will be send to a destination
        /// </summary>
        [Input("uploadFilePrefix")]
        public Input<string>? UploadFilePrefix { get; set; }

        /// <summary>
        /// The suffix of the log file that will be send to a destination
        /// </summary>
        [Input("uploadFileSuffix")]
        public Input<string>? UploadFileSuffix { get; set; }

        public DatastreamDeliveryConfigurationGetArgs()
        {
        }
        public static new DatastreamDeliveryConfigurationGetArgs Empty => new DatastreamDeliveryConfigurationGetArgs();
    }
}
