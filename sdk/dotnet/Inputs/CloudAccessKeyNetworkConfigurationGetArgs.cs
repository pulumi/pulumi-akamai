// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class CloudAccessKeyNetworkConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional type of the deployment network that the access key will be deployed to.
        /// </summary>
        [Input("additionalCdn")]
        public Input<string>? AdditionalCdn { get; set; }

        /// <summary>
        /// The API deploys the access key to this secure network
        /// </summary>
        [Input("securityNetwork", required: true)]
        public Input<string> SecurityNetwork { get; set; } = null!;

        public CloudAccessKeyNetworkConfigurationGetArgs()
        {
        }
        public static new CloudAccessKeyNetworkConfigurationGetArgs Empty => new CloudAccessKeyNetworkConfigurationGetArgs();
    }
}
