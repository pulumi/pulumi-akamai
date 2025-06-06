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
    public sealed class GtmDatacenterDefaultLoadObject
    {
        public readonly string? LoadObject;
        public readonly int? LoadObjectPort;
        public readonly ImmutableArray<string> LoadServers;

        [OutputConstructor]
        private GtmDatacenterDefaultLoadObject(
            string? loadObject,

            int? loadObjectPort,

            ImmutableArray<string> loadServers)
        {
            LoadObject = loadObject;
            LoadObjectPort = loadObjectPort;
            LoadServers = loadServers;
        }
    }
}
