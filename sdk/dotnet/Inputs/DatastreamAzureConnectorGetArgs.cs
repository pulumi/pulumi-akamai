// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class DatastreamAzureConnectorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey", required: true)]
        private Input<string>? _accessKey;

        /// <summary>
        /// Access keys associated with Azure Storage account
        /// </summary>
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the Azure Storage account name
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        /// <summary>
        /// Indicates whether the logs should be compressed
        /// </summary>
        [Input("compressLogs")]
        public Input<bool>? CompressLogs { get; set; }

        /// <summary>
        /// Specifies the Azure Storage container name
        /// </summary>
        [Input("containerName", required: true)]
        public Input<string> ContainerName { get; set; } = null!;

        /// <summary>
        /// The name of the connector
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The path to the folder within Azure Storage container where logs will be stored
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public DatastreamAzureConnectorGetArgs()
        {
        }
        public static new DatastreamAzureConnectorGetArgs Empty => new DatastreamAzureConnectorGetArgs();
    }
}
