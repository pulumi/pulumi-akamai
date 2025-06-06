// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetGtmDomainCidrMapInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("assignments")]
        private InputList<Inputs.GetGtmDomainCidrMapAssignmentInputArgs>? _assignments;

        /// <summary>
        /// Contains information about the CIDR zone groupings of CIDR blocks.
        /// </summary>
        public InputList<Inputs.GetGtmDomainCidrMapAssignmentInputArgs> Assignments
        {
            get => _assignments ?? (_assignments = new InputList<Inputs.GetGtmDomainCidrMapAssignmentInputArgs>());
            set => _assignments = value;
        }

        /// <summary>
        /// A placeholder for all other CIDR zones, CIDR blocks not found in these CIDR zones.
        /// </summary>
        [Input("defaultDatacenter")]
        public Input<Inputs.GetGtmDomainCidrMapDefaultDatacenterInputArgs>? DefaultDatacenter { get; set; }

        [Input("links")]
        private InputList<Inputs.GetGtmDomainCidrMapLinkInputArgs>? _links;

        /// <summary>
        /// Specifies the URL path that allows direct navigation to the CIDR map.
        /// </summary>
        public InputList<Inputs.GetGtmDomainCidrMapLinkInputArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.GetGtmDomainCidrMapLinkInputArgs>());
            set => _links = value;
        }

        /// <summary>
        /// Unique name for the CIDR map.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetGtmDomainCidrMapInputArgs()
        {
        }
        public static new GetGtmDomainCidrMapInputArgs Empty => new GetGtmDomainCidrMapInputArgs();
    }
}
