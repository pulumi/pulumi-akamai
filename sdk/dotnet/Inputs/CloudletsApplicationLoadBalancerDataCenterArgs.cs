// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class CloudletsApplicationLoadBalancerDataCenterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The city in which the data center is located.
        /// </summary>
        [Input("city")]
        public Input<string>? City { get; set; }

        /// <summary>
        /// Describes if cloud server host header is overridden
        /// </summary>
        [Input("cloudServerHostHeaderOverride")]
        public Input<bool>? CloudServerHostHeaderOverride { get; set; }

        /// <summary>
        /// Describes if this datacenter is a cloud service
        /// </summary>
        [Input("cloudService")]
        public Input<bool>? CloudService { get; set; }

        /// <summary>
        /// The continent on which the data center is located
        /// </summary>
        [Input("continent", required: true)]
        public Input<string> Continent { get; set; } = null!;

        /// <summary>
        /// The country in which the data center is located
        /// </summary>
        [Input("country", required: true)]
        public Input<string> Country { get; set; } = null!;

        /// <summary>
        /// This should match the 'hostname' value defined for this datacenter in Property Manager
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The latitude value for the data center. This member supports six decimal places of precision.
        /// </summary>
        [Input("latitude", required: true)]
        public Input<double> Latitude { get; set; } = null!;

        [Input("livenessHosts")]
        private InputList<string>? _livenessHosts;

        /// <summary>
        /// An array of strings that represent the origin servers used to poll the data centers in an application load balancer configuration. These servers support basic HTTP polling.
        /// </summary>
        public InputList<string> LivenessHosts
        {
            get => _livenessHosts ?? (_livenessHosts = new InputList<string>());
            set => _livenessHosts = value;
        }

        /// <summary>
        /// The longitude value for the data center. This member supports six decimal places of precision.
        /// </summary>
        [Input("longitude", required: true)]
        public Input<double> Longitude { get; set; } = null!;

        /// <summary>
        /// The ID of an origin that represents the data center. The conditional origin, which is defined in the Property Manager API, must have an originType of either CUSTOMER or NET_STORAGE
        /// </summary>
        [Input("originId", required: true)]
        public Input<string> OriginId { get; set; } = null!;

        /// <summary>
        /// The percent of traffic that is sent to the data center. The total for all data centers must equal 100%.
        /// </summary>
        [Input("percent", required: true)]
        public Input<double> Percent { get; set; } = null!;

        /// <summary>
        /// The state, province, or region where the data center is located
        /// </summary>
        [Input("stateOrProvince")]
        public Input<string>? StateOrProvince { get; set; }

        public CloudletsApplicationLoadBalancerDataCenterArgs()
        {
        }
        public static new CloudletsApplicationLoadBalancerDataCenterArgs Empty => new CloudletsApplicationLoadBalancerDataCenterArgs();
    }
}
