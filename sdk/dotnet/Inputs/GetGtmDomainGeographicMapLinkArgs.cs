// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetGtmDomainGeographicMapLinkInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A hypermedia link to the complete URL that uniquely defines a resource.
        /// </summary>
        [Input("href", required: true)]
        public Input<string> Href { get; set; } = null!;

        /// <summary>
        /// Indicates the link relationship of the object.
        /// </summary>
        [Input("rel", required: true)]
        public Input<string> Rel { get; set; } = null!;

        public GetGtmDomainGeographicMapLinkInputArgs()
        {
        }
        public static new GetGtmDomainGeographicMapLinkInputArgs Empty => new GetGtmDomainGeographicMapLinkInputArgs();
    }
}
