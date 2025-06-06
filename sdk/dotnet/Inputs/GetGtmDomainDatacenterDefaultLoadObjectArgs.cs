// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetGtmDomainDatacenterDefaultLoadObjectInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the load object that GTM requests.
        /// </summary>
        [Input("loadObject", required: true)]
        public Input<string> LoadObject { get; set; } = null!;

        /// <summary>
        /// Specifies the TCP port to connect to when requesting the load object.
        /// </summary>
        [Input("loadObjectPort", required: true)]
        public Input<int> LoadObjectPort { get; set; } = null!;

        [Input("loadServers", required: true)]
        private InputList<string>? _loadServers;

        /// <summary>
        /// Specifies the list of servers to requests the load object from.
        /// </summary>
        public InputList<string> LoadServers
        {
            get => _loadServers ?? (_loadServers = new InputList<string>());
            set => _loadServers = value;
        }

        public GetGtmDomainDatacenterDefaultLoadObjectInputArgs()
        {
        }
        public static new GetGtmDomainDatacenterDefaultLoadObjectInputArgs Empty => new GetGtmDomainDatacenterDefaultLoadObjectInputArgs();
    }
}
