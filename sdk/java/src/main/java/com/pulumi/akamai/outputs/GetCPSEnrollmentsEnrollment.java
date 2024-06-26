// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCPSEnrollmentsEnrollmentAdminContact;
import com.pulumi.akamai.outputs.GetCPSEnrollmentsEnrollmentCsr;
import com.pulumi.akamai.outputs.GetCPSEnrollmentsEnrollmentNetworkConfiguration;
import com.pulumi.akamai.outputs.GetCPSEnrollmentsEnrollmentOrganization;
import com.pulumi.akamai.outputs.GetCPSEnrollmentsEnrollmentTechContact;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCPSEnrollmentsEnrollment {
    /**
     * @return Contact information for the certificate administrator used at organization
     * 
     */
    private List<GetCPSEnrollmentsEnrollmentAdminContact> adminContacts;
    /**
     * @return Slots where the certificate either will be deployed or is already deployed
     * 
     */
    private List<Integer> assignedSlots;
    /**
     * @return Certificate trust chain type
     * 
     */
    private String certificateChainType;
    /**
     * @return Certificate type of enrollment
     * 
     */
    private String certificateType;
    /**
     * @return Common name used for enrollment
     * 
     */
    private String commonName;
    /**
     * @return Data used for generation of Certificate Signing Request
     * 
     */
    private List<GetCPSEnrollmentsEnrollmentCsr> csrs;
    /**
     * @return Enable Dual-Stacked certificate deployment for enrollment
     * 
     */
    private Boolean enableMultiStackedCertificates;
    /**
     * @return The unique identifier of enrollment
     * 
     */
    private Integer enrollmentId;
    /**
     * @return Settings containing network information and TLS metadata used by CPS
     * 
     */
    private List<GetCPSEnrollmentsEnrollmentNetworkConfiguration> networkConfigurations;
    /**
     * @return The Digicert unique identifier for the organization
     * 
     */
    private Integer orgId;
    /**
     * @return Organization information
     * 
     */
    private List<GetCPSEnrollmentsEnrollmentOrganization> organizations;
    /**
     * @return Whether some changes are pending
     * 
     */
    private Boolean pendingChanges;
    /**
     * @return Slots where the certificate is deployed on the production network
     * 
     */
    private List<Integer> productionSlots;
    /**
     * @return The registration authority or certificate authority (CA) used to obtain a certificate
     * 
     */
    private String registrationAuthority;
    /**
     * @return List of SANs
     * 
     */
    private List<String> sans;
    /**
     * @return Type of TLS deployment network
     * 
     */
    private String secureNetwork;
    /**
     * @return SHA algorithm type
     * 
     */
    private String signatureAlgorithm;
    /**
     * @return Whether Server Name Indication is used for enrollment
     * 
     */
    private Boolean sniOnly;
    /**
     * @return Slots where the certificate is deployed on the staging network
     * 
     */
    private List<Integer> stagingSlots;
    /**
     * @return Contact information for an administrator at Akamai
     * 
     */
    private List<GetCPSEnrollmentsEnrollmentTechContact> techContacts;
    /**
     * @return Enrolment validation type
     * 
     */
    private String validationType;

    private GetCPSEnrollmentsEnrollment() {}
    /**
     * @return Contact information for the certificate administrator used at organization
     * 
     */
    public List<GetCPSEnrollmentsEnrollmentAdminContact> adminContacts() {
        return this.adminContacts;
    }
    /**
     * @return Slots where the certificate either will be deployed or is already deployed
     * 
     */
    public List<Integer> assignedSlots() {
        return this.assignedSlots;
    }
    /**
     * @return Certificate trust chain type
     * 
     */
    public String certificateChainType() {
        return this.certificateChainType;
    }
    /**
     * @return Certificate type of enrollment
     * 
     */
    public String certificateType() {
        return this.certificateType;
    }
    /**
     * @return Common name used for enrollment
     * 
     */
    public String commonName() {
        return this.commonName;
    }
    /**
     * @return Data used for generation of Certificate Signing Request
     * 
     */
    public List<GetCPSEnrollmentsEnrollmentCsr> csrs() {
        return this.csrs;
    }
    /**
     * @return Enable Dual-Stacked certificate deployment for enrollment
     * 
     */
    public Boolean enableMultiStackedCertificates() {
        return this.enableMultiStackedCertificates;
    }
    /**
     * @return The unique identifier of enrollment
     * 
     */
    public Integer enrollmentId() {
        return this.enrollmentId;
    }
    /**
     * @return Settings containing network information and TLS metadata used by CPS
     * 
     */
    public List<GetCPSEnrollmentsEnrollmentNetworkConfiguration> networkConfigurations() {
        return this.networkConfigurations;
    }
    /**
     * @return The Digicert unique identifier for the organization
     * 
     */
    public Integer orgId() {
        return this.orgId;
    }
    /**
     * @return Organization information
     * 
     */
    public List<GetCPSEnrollmentsEnrollmentOrganization> organizations() {
        return this.organizations;
    }
    /**
     * @return Whether some changes are pending
     * 
     */
    public Boolean pendingChanges() {
        return this.pendingChanges;
    }
    /**
     * @return Slots where the certificate is deployed on the production network
     * 
     */
    public List<Integer> productionSlots() {
        return this.productionSlots;
    }
    /**
     * @return The registration authority or certificate authority (CA) used to obtain a certificate
     * 
     */
    public String registrationAuthority() {
        return this.registrationAuthority;
    }
    /**
     * @return List of SANs
     * 
     */
    public List<String> sans() {
        return this.sans;
    }
    /**
     * @return Type of TLS deployment network
     * 
     */
    public String secureNetwork() {
        return this.secureNetwork;
    }
    /**
     * @return SHA algorithm type
     * 
     */
    public String signatureAlgorithm() {
        return this.signatureAlgorithm;
    }
    /**
     * @return Whether Server Name Indication is used for enrollment
     * 
     */
    public Boolean sniOnly() {
        return this.sniOnly;
    }
    /**
     * @return Slots where the certificate is deployed on the staging network
     * 
     */
    public List<Integer> stagingSlots() {
        return this.stagingSlots;
    }
    /**
     * @return Contact information for an administrator at Akamai
     * 
     */
    public List<GetCPSEnrollmentsEnrollmentTechContact> techContacts() {
        return this.techContacts;
    }
    /**
     * @return Enrolment validation type
     * 
     */
    public String validationType() {
        return this.validationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCPSEnrollmentsEnrollment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCPSEnrollmentsEnrollmentAdminContact> adminContacts;
        private List<Integer> assignedSlots;
        private String certificateChainType;
        private String certificateType;
        private String commonName;
        private List<GetCPSEnrollmentsEnrollmentCsr> csrs;
        private Boolean enableMultiStackedCertificates;
        private Integer enrollmentId;
        private List<GetCPSEnrollmentsEnrollmentNetworkConfiguration> networkConfigurations;
        private Integer orgId;
        private List<GetCPSEnrollmentsEnrollmentOrganization> organizations;
        private Boolean pendingChanges;
        private List<Integer> productionSlots;
        private String registrationAuthority;
        private List<String> sans;
        private String secureNetwork;
        private String signatureAlgorithm;
        private Boolean sniOnly;
        private List<Integer> stagingSlots;
        private List<GetCPSEnrollmentsEnrollmentTechContact> techContacts;
        private String validationType;
        public Builder() {}
        public Builder(GetCPSEnrollmentsEnrollment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminContacts = defaults.adminContacts;
    	      this.assignedSlots = defaults.assignedSlots;
    	      this.certificateChainType = defaults.certificateChainType;
    	      this.certificateType = defaults.certificateType;
    	      this.commonName = defaults.commonName;
    	      this.csrs = defaults.csrs;
    	      this.enableMultiStackedCertificates = defaults.enableMultiStackedCertificates;
    	      this.enrollmentId = defaults.enrollmentId;
    	      this.networkConfigurations = defaults.networkConfigurations;
    	      this.orgId = defaults.orgId;
    	      this.organizations = defaults.organizations;
    	      this.pendingChanges = defaults.pendingChanges;
    	      this.productionSlots = defaults.productionSlots;
    	      this.registrationAuthority = defaults.registrationAuthority;
    	      this.sans = defaults.sans;
    	      this.secureNetwork = defaults.secureNetwork;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
    	      this.sniOnly = defaults.sniOnly;
    	      this.stagingSlots = defaults.stagingSlots;
    	      this.techContacts = defaults.techContacts;
    	      this.validationType = defaults.validationType;
        }

        @CustomType.Setter
        public Builder adminContacts(List<GetCPSEnrollmentsEnrollmentAdminContact> adminContacts) {
            if (adminContacts == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "adminContacts");
            }
            this.adminContacts = adminContacts;
            return this;
        }
        public Builder adminContacts(GetCPSEnrollmentsEnrollmentAdminContact... adminContacts) {
            return adminContacts(List.of(adminContacts));
        }
        @CustomType.Setter
        public Builder assignedSlots(List<Integer> assignedSlots) {
            if (assignedSlots == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "assignedSlots");
            }
            this.assignedSlots = assignedSlots;
            return this;
        }
        public Builder assignedSlots(Integer... assignedSlots) {
            return assignedSlots(List.of(assignedSlots));
        }
        @CustomType.Setter
        public Builder certificateChainType(String certificateChainType) {
            if (certificateChainType == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "certificateChainType");
            }
            this.certificateChainType = certificateChainType;
            return this;
        }
        @CustomType.Setter
        public Builder certificateType(String certificateType) {
            if (certificateType == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "certificateType");
            }
            this.certificateType = certificateType;
            return this;
        }
        @CustomType.Setter
        public Builder commonName(String commonName) {
            if (commonName == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "commonName");
            }
            this.commonName = commonName;
            return this;
        }
        @CustomType.Setter
        public Builder csrs(List<GetCPSEnrollmentsEnrollmentCsr> csrs) {
            if (csrs == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "csrs");
            }
            this.csrs = csrs;
            return this;
        }
        public Builder csrs(GetCPSEnrollmentsEnrollmentCsr... csrs) {
            return csrs(List.of(csrs));
        }
        @CustomType.Setter
        public Builder enableMultiStackedCertificates(Boolean enableMultiStackedCertificates) {
            if (enableMultiStackedCertificates == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "enableMultiStackedCertificates");
            }
            this.enableMultiStackedCertificates = enableMultiStackedCertificates;
            return this;
        }
        @CustomType.Setter
        public Builder enrollmentId(Integer enrollmentId) {
            if (enrollmentId == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "enrollmentId");
            }
            this.enrollmentId = enrollmentId;
            return this;
        }
        @CustomType.Setter
        public Builder networkConfigurations(List<GetCPSEnrollmentsEnrollmentNetworkConfiguration> networkConfigurations) {
            if (networkConfigurations == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "networkConfigurations");
            }
            this.networkConfigurations = networkConfigurations;
            return this;
        }
        public Builder networkConfigurations(GetCPSEnrollmentsEnrollmentNetworkConfiguration... networkConfigurations) {
            return networkConfigurations(List.of(networkConfigurations));
        }
        @CustomType.Setter
        public Builder orgId(Integer orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder organizations(List<GetCPSEnrollmentsEnrollmentOrganization> organizations) {
            if (organizations == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "organizations");
            }
            this.organizations = organizations;
            return this;
        }
        public Builder organizations(GetCPSEnrollmentsEnrollmentOrganization... organizations) {
            return organizations(List.of(organizations));
        }
        @CustomType.Setter
        public Builder pendingChanges(Boolean pendingChanges) {
            if (pendingChanges == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "pendingChanges");
            }
            this.pendingChanges = pendingChanges;
            return this;
        }
        @CustomType.Setter
        public Builder productionSlots(List<Integer> productionSlots) {
            if (productionSlots == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "productionSlots");
            }
            this.productionSlots = productionSlots;
            return this;
        }
        public Builder productionSlots(Integer... productionSlots) {
            return productionSlots(List.of(productionSlots));
        }
        @CustomType.Setter
        public Builder registrationAuthority(String registrationAuthority) {
            if (registrationAuthority == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "registrationAuthority");
            }
            this.registrationAuthority = registrationAuthority;
            return this;
        }
        @CustomType.Setter
        public Builder sans(List<String> sans) {
            if (sans == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "sans");
            }
            this.sans = sans;
            return this;
        }
        public Builder sans(String... sans) {
            return sans(List.of(sans));
        }
        @CustomType.Setter
        public Builder secureNetwork(String secureNetwork) {
            if (secureNetwork == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "secureNetwork");
            }
            this.secureNetwork = secureNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            if (signatureAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "signatureAlgorithm");
            }
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder sniOnly(Boolean sniOnly) {
            if (sniOnly == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "sniOnly");
            }
            this.sniOnly = sniOnly;
            return this;
        }
        @CustomType.Setter
        public Builder stagingSlots(List<Integer> stagingSlots) {
            if (stagingSlots == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "stagingSlots");
            }
            this.stagingSlots = stagingSlots;
            return this;
        }
        public Builder stagingSlots(Integer... stagingSlots) {
            return stagingSlots(List.of(stagingSlots));
        }
        @CustomType.Setter
        public Builder techContacts(List<GetCPSEnrollmentsEnrollmentTechContact> techContacts) {
            if (techContacts == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "techContacts");
            }
            this.techContacts = techContacts;
            return this;
        }
        public Builder techContacts(GetCPSEnrollmentsEnrollmentTechContact... techContacts) {
            return techContacts(List.of(techContacts));
        }
        @CustomType.Setter
        public Builder validationType(String validationType) {
            if (validationType == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsEnrollment", "validationType");
            }
            this.validationType = validationType;
            return this;
        }
        public GetCPSEnrollmentsEnrollment build() {
            final var _resultValue = new GetCPSEnrollmentsEnrollment();
            _resultValue.adminContacts = adminContacts;
            _resultValue.assignedSlots = assignedSlots;
            _resultValue.certificateChainType = certificateChainType;
            _resultValue.certificateType = certificateType;
            _resultValue.commonName = commonName;
            _resultValue.csrs = csrs;
            _resultValue.enableMultiStackedCertificates = enableMultiStackedCertificates;
            _resultValue.enrollmentId = enrollmentId;
            _resultValue.networkConfigurations = networkConfigurations;
            _resultValue.orgId = orgId;
            _resultValue.organizations = organizations;
            _resultValue.pendingChanges = pendingChanges;
            _resultValue.productionSlots = productionSlots;
            _resultValue.registrationAuthority = registrationAuthority;
            _resultValue.sans = sans;
            _resultValue.secureNetwork = secureNetwork;
            _resultValue.signatureAlgorithm = signatureAlgorithm;
            _resultValue.sniOnly = sniOnly;
            _resultValue.stagingSlots = stagingSlots;
            _resultValue.techContacts = techContacts;
            _resultValue.validationType = validationType;
            return _resultValue;
        }
    }
}
