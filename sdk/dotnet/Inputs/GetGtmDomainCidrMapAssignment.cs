// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetGtmDomainCidrMapAssignmentArgs : global::Pulumi.InvokeArgs
    {
        [Input("blocks", required: true)]
        private List<string>? _blocks;

        /// <summary>
        /// Specifies an array of CIDR blocks.
        /// </summary>
        public List<string> Blocks
        {
            get => _blocks ?? (_blocks = new List<string>());
            set => _blocks = value;
        }

        /// <summary>
        /// A unique identifier for an existing data center in the domain.
        /// </summary>
        [Input("datacenterId", required: true)]
        public int DatacenterId { get; set; }

        /// <summary>
        /// A descriptive label for all other AS zones.
        /// </summary>
        [Input("nickname", required: true)]
        public string Nickname { get; set; } = null!;

        public GetGtmDomainCidrMapAssignmentArgs()
        {
        }
        public static new GetGtmDomainCidrMapAssignmentArgs Empty => new GetGtmDomainCidrMapAssignmentArgs();
    }
}
