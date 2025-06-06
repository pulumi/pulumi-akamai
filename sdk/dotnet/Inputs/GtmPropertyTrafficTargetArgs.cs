// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GtmPropertyTrafficTargetArgs : global::Pulumi.ResourceArgs
    {
        [Input("datacenterId")]
        public Input<int>? DatacenterId { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("handoutCname")]
        public Input<string>? HandoutCname { get; set; }

        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        [Input("servers")]
        private InputList<string>? _servers;
        public InputList<string> Servers
        {
            get => _servers ?? (_servers = new InputList<string>());
            set => _servers = value;
        }

        [Input("weight")]
        public Input<double>? Weight { get; set; }

        public GtmPropertyTrafficTargetArgs()
        {
        }
        public static new GtmPropertyTrafficTargetArgs Empty => new GtmPropertyTrafficTargetArgs();
    }
}
