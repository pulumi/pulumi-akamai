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
    public sealed class GetCPSEnrollmentsEnrollmentResult
    {
        /// <summary>
        /// Contact information for the certificate administrator used at organization
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentAdminContactResult> AdminContacts;
        /// <summary>
        /// Slots where the certificate either will be deployed or is already deployed
        /// </summary>
        public readonly ImmutableArray<int> AssignedSlots;
        /// <summary>
        /// Certificate trust chain type
        /// </summary>
        public readonly string CertificateChainType;
        /// <summary>
        /// Certificate type of enrollment
        /// </summary>
        public readonly string CertificateType;
        /// <summary>
        /// Common name used for enrollment
        /// </summary>
        public readonly string CommonName;
        /// <summary>
        /// Data used for generation of Certificate Signing Request
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentCsrResult> Csrs;
        /// <summary>
        /// Enable Dual-Stacked certificate deployment for enrollment
        /// </summary>
        public readonly bool EnableMultiStackedCertificates;
        /// <summary>
        /// The unique identifier of enrollment
        /// </summary>
        public readonly int EnrollmentId;
        /// <summary>
        /// Settings containing network information and TLS metadata used by CPS
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentNetworkConfigurationResult> NetworkConfigurations;
        /// <summary>
        /// The Digicert unique identifier for the organization
        /// </summary>
        public readonly int OrgId;
        /// <summary>
        /// Organization information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentOrganizationResult> Organizations;
        /// <summary>
        /// Whether some changes are pending
        /// </summary>
        public readonly bool PendingChanges;
        /// <summary>
        /// Slots where the certificate is deployed on the production network
        /// </summary>
        public readonly ImmutableArray<int> ProductionSlots;
        /// <summary>
        /// The registration authority or certificate authority (CA) used to obtain a certificate
        /// </summary>
        public readonly string RegistrationAuthority;
        /// <summary>
        /// List of SANs
        /// </summary>
        public readonly ImmutableArray<string> Sans;
        /// <summary>
        /// Type of TLS deployment network
        /// </summary>
        public readonly string SecureNetwork;
        /// <summary>
        /// SHA algorithm type
        /// </summary>
        public readonly string SignatureAlgorithm;
        /// <summary>
        /// Whether Server Name Indication is used for enrollment
        /// </summary>
        public readonly bool SniOnly;
        /// <summary>
        /// Slots where the certificate is deployed on the staging network
        /// </summary>
        public readonly ImmutableArray<int> StagingSlots;
        /// <summary>
        /// Contact information for an administrator at Akamai
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentTechContactResult> TechContacts;
        /// <summary>
        /// Enrolment validation type
        /// </summary>
        public readonly string ValidationType;

        [OutputConstructor]
        private GetCPSEnrollmentsEnrollmentResult(
            ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentAdminContactResult> adminContacts,

            ImmutableArray<int> assignedSlots,

            string certificateChainType,

            string certificateType,

            string commonName,

            ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentCsrResult> csrs,

            bool enableMultiStackedCertificates,

            int enrollmentId,

            ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentNetworkConfigurationResult> networkConfigurations,

            int orgId,

            ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentOrganizationResult> organizations,

            bool pendingChanges,

            ImmutableArray<int> productionSlots,

            string registrationAuthority,

            ImmutableArray<string> sans,

            string secureNetwork,

            string signatureAlgorithm,

            bool sniOnly,

            ImmutableArray<int> stagingSlots,

            ImmutableArray<Outputs.GetCPSEnrollmentsEnrollmentTechContactResult> techContacts,

            string validationType)
        {
            AdminContacts = adminContacts;
            AssignedSlots = assignedSlots;
            CertificateChainType = certificateChainType;
            CertificateType = certificateType;
            CommonName = commonName;
            Csrs = csrs;
            EnableMultiStackedCertificates = enableMultiStackedCertificates;
            EnrollmentId = enrollmentId;
            NetworkConfigurations = networkConfigurations;
            OrgId = orgId;
            Organizations = organizations;
            PendingChanges = pendingChanges;
            ProductionSlots = productionSlots;
            RegistrationAuthority = registrationAuthority;
            Sans = sans;
            SecureNetwork = secureNetwork;
            SignatureAlgorithm = signatureAlgorithm;
            SniOnly = sniOnly;
            StagingSlots = stagingSlots;
            TechContacts = techContacts;
            ValidationType = validationType;
        }
    }
}
