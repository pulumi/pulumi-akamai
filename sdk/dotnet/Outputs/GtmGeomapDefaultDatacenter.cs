// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GtmGeomapDefaultDatacenter
    {
        public readonly int DatacenterId;
        public readonly string? Nickname;

        [OutputConstructor]
        private GtmGeomapDefaultDatacenter(
            int datacenterId,

            string? nickname)
        {
            DatacenterId = datacenterId;
            Nickname = nickname;
        }
    }
}
