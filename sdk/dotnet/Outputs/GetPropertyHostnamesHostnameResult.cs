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
    public sealed class GetPropertyHostnamesHostnameResult
    {
        /// <summary>
        /// Indicates the certificate's provisioning type. Either `CPS_MANAGED` for the certificates you create with the Certificate Provisioning System (CPS) API, or `DEFAULT` for the Domain Validation (DV) certificates created automatically. Note that you can't specify the `DEFAULT` value if your property hostname uses the `akamaized.net` domain suffix.
        /// </summary>
        public readonly string CertProvisioningType;
        public readonly ImmutableArray<Outputs.GetPropertyHostnamesHostnameCertStatusResult> CertStatuses;
        /// <summary>
        /// The hostname that your end users see, indicated by the Host header in end user requests.
        /// </summary>
        public readonly string CnameFrom;
        /// <summary>
        /// The edge hostname you point the property hostname to so that you can start serving traffic through Akamai servers. This member corresponds to the edge hostname object's `edgeHostnameDomain` member.
        /// </summary>
        public readonly string CnameTo;
        /// <summary>
        /// A hostname's CNAME type. Supports only the `EDGE_HOSTNAME` value.
        /// </summary>
        public readonly string CnameType;
        /// <summary>
        /// The unique identifier for the edge hostname.
        /// </summary>
        public readonly string EdgeHostnameId;

        [OutputConstructor]
        private GetPropertyHostnamesHostnameResult(
            string certProvisioningType,

            ImmutableArray<Outputs.GetPropertyHostnamesHostnameCertStatusResult> certStatuses,

            string cnameFrom,

            string cnameTo,

            string cnameType,

            string edgeHostnameId)
        {
            CertProvisioningType = certProvisioningType;
            CertStatuses = certStatuses;
            CnameFrom = cnameFrom;
            CnameTo = cnameTo;
            CnameType = cnameType;
            EdgeHostnameId = edgeHostnameId;
        }
    }
}
