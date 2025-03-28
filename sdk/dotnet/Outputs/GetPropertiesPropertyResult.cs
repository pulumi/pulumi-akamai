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
    public sealed class GetPropertiesPropertyResult
    {
        public readonly string ContractId;
        public readonly string GroupId;
        public readonly int LatestVersion;
        public readonly string Note;
        public readonly int ProductionVersion;
        public readonly string PropertyId;
        public readonly string PropertyName;
        public readonly int StagingVersion;

        [OutputConstructor]
        private GetPropertiesPropertyResult(
            string contractId,

            string groupId,

            int latestVersion,

            string note,

            int productionVersion,

            string propertyId,

            string propertyName,

            int stagingVersion)
        {
            ContractId = contractId;
            GroupId = groupId;
            LatestVersion = latestVersion;
            Note = note;
            ProductionVersion = productionVersion;
            PropertyId = propertyId;
            PropertyName = propertyName;
            StagingVersion = stagingVersion;
        }
    }
}
