// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class DatastreamSplunkConnectorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("caCert")]
        private Input<string>? _caCert;

        /// <summary>
        /// The certification authority (CA) certificate used to verify the origin server's certificate. If the certificate is not signed by a well-known certification authority, enter the CA certificate in the PEM format for verification.
        /// </summary>
        public Input<string>? CaCert
        {
            get => _caCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _caCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clientCert")]
        private Input<string>? _clientCert;

        /// <summary>
        /// The digital certificate in the PEM format you want to use to authenticate requests to your destination. If you want to use mutual authentication, you need to provide both the client certificate and the client key (in the PEM format).
        /// </summary>
        public Input<string>? ClientCert
        {
            get => _clientCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clientKey")]
        private Input<string>? _clientKey;

        /// <summary>
        /// The private key in the non-encrypted PKCS8 format you want to use to authenticate with the back-end server. If you want to use mutual authentication, you need to provide both the client certificate and the client key.
        /// </summary>
        public Input<string>? ClientKey
        {
            get => _clientKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates whether the logs should be compressed
        /// </summary>
        [Input("compressLogs")]
        public Input<bool>? CompressLogs { get; set; }

        /// <summary>
        /// The name of custom header passed with the request to the destination
        /// </summary>
        [Input("customHeaderName")]
        public Input<string>? CustomHeaderName { get; set; }

        /// <summary>
        /// The custom header's contents passed with the request to the destination
        /// </summary>
        [Input("customHeaderValue")]
        public Input<string>? CustomHeaderValue { get; set; }

        /// <summary>
        /// The name of the connector
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The raw event Splunk URL where logs will be stored
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        [Input("eventCollectorToken", required: true)]
        private Input<string>? _eventCollectorToken;

        /// <summary>
        /// The Event Collector token associated with Splunk account
        /// </summary>
        public Input<string>? EventCollectorToken
        {
            get => _eventCollectorToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _eventCollectorToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Indicates whether mTLS is enabled or not.
        /// </summary>
        [Input("mTls")]
        public Input<bool>? MTls { get; set; }

        /// <summary>
        /// The hostname that verifies the server's certificate and matches the Subject Alternative Names (SANs) in the certificate. If not provided, DataStream fetches the hostname from the endpoint URL.
        /// </summary>
        [Input("tlsHostname")]
        public Input<string>? TlsHostname { get; set; }

        public DatastreamSplunkConnectorGetArgs()
        {
        }
        public static new DatastreamSplunkConnectorGetArgs Empty => new DatastreamSplunkConnectorGetArgs();
    }
}
