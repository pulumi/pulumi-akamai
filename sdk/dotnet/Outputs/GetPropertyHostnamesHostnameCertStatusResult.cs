// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyHostnamesHostnameCertStatusResult
    {
        public readonly string Hostname;
        public readonly string ProductionStatus;
        public readonly string StagingStatus;
        public readonly string Target;

        [OutputConstructor]
        private GetPropertyHostnamesHostnameCertStatusResult(
            string hostname,

            string productionStatus,

            string stagingStatus,

            string target)
        {
            Hostname = hostname;
            ProductionStatus = productionStatus;
            StagingStatus = stagingStatus;
            Target = target;
        }
    }
}
