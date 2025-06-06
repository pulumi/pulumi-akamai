// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetGtmAsmapDefaultDatacenterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// For each property, an identifier for all other AS zones
        /// </summary>
        [Input("datacenterId", required: true)]
        public int DatacenterId { get; set; }

        /// <summary>
        /// A descriptive label for all other AS zones
        /// </summary>
        [Input("nickname", required: true)]
        public string Nickname { get; set; } = null!;

        public GetGtmAsmapDefaultDatacenterArgs()
        {
        }
        public static new GetGtmAsmapDefaultDatacenterArgs Empty => new GetGtmAsmapDefaultDatacenterArgs();
    }
}
