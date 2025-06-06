// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.CpsDvEnrollmentNetworkConfigurationClientMutualAuthentication;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CpsDvEnrollmentNetworkConfiguration {
    /**
     * @return The trust chain configuration used for client mutual authentication
     * 
     */
    private @Nullable CpsDvEnrollmentNetworkConfigurationClientMutualAuthentication clientMutualAuthentication;
    /**
     * @return Enable CPS to direct traffic using all the SANs listed in the SANs parameter when enrollment is created. Default is false
     * 
     */
    private @Nullable Boolean cloneDnsNames;
    /**
     * @return TLS versions which are disallowed
     * 
     */
    private @Nullable List<String> disallowedTlsVersions;
    /**
     * @return Geography type used for enrollment
     * 
     */
    private String geography;
    /**
     * @return Mandatory Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    private @Nullable String mustHaveCiphers;
    /**
     * @return Enable OCSP stapling. Default is &#39;on&#39;
     * 
     */
    private @Nullable String ocspStapling;
    /**
     * @return Preferred Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    private @Nullable String preferredCiphers;
    /**
     * @return Enable QUIC protocol. Default is false
     * 
     */
    private @Nullable Boolean quicEnabled;

    private CpsDvEnrollmentNetworkConfiguration() {}
    /**
     * @return The trust chain configuration used for client mutual authentication
     * 
     */
    public Optional<CpsDvEnrollmentNetworkConfigurationClientMutualAuthentication> clientMutualAuthentication() {
        return Optional.ofNullable(this.clientMutualAuthentication);
    }
    /**
     * @return Enable CPS to direct traffic using all the SANs listed in the SANs parameter when enrollment is created. Default is false
     * 
     */
    public Optional<Boolean> cloneDnsNames() {
        return Optional.ofNullable(this.cloneDnsNames);
    }
    /**
     * @return TLS versions which are disallowed
     * 
     */
    public List<String> disallowedTlsVersions() {
        return this.disallowedTlsVersions == null ? List.of() : this.disallowedTlsVersions;
    }
    /**
     * @return Geography type used for enrollment
     * 
     */
    public String geography() {
        return this.geography;
    }
    /**
     * @return Mandatory Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    public Optional<String> mustHaveCiphers() {
        return Optional.ofNullable(this.mustHaveCiphers);
    }
    /**
     * @return Enable OCSP stapling. Default is &#39;on&#39;
     * 
     */
    public Optional<String> ocspStapling() {
        return Optional.ofNullable(this.ocspStapling);
    }
    /**
     * @return Preferred Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    public Optional<String> preferredCiphers() {
        return Optional.ofNullable(this.preferredCiphers);
    }
    /**
     * @return Enable QUIC protocol. Default is false
     * 
     */
    public Optional<Boolean> quicEnabled() {
        return Optional.ofNullable(this.quicEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpsDvEnrollmentNetworkConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CpsDvEnrollmentNetworkConfigurationClientMutualAuthentication clientMutualAuthentication;
        private @Nullable Boolean cloneDnsNames;
        private @Nullable List<String> disallowedTlsVersions;
        private String geography;
        private @Nullable String mustHaveCiphers;
        private @Nullable String ocspStapling;
        private @Nullable String preferredCiphers;
        private @Nullable Boolean quicEnabled;
        public Builder() {}
        public Builder(CpsDvEnrollmentNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientMutualAuthentication = defaults.clientMutualAuthentication;
    	      this.cloneDnsNames = defaults.cloneDnsNames;
    	      this.disallowedTlsVersions = defaults.disallowedTlsVersions;
    	      this.geography = defaults.geography;
    	      this.mustHaveCiphers = defaults.mustHaveCiphers;
    	      this.ocspStapling = defaults.ocspStapling;
    	      this.preferredCiphers = defaults.preferredCiphers;
    	      this.quicEnabled = defaults.quicEnabled;
        }

        @CustomType.Setter
        public Builder clientMutualAuthentication(@Nullable CpsDvEnrollmentNetworkConfigurationClientMutualAuthentication clientMutualAuthentication) {

            this.clientMutualAuthentication = clientMutualAuthentication;
            return this;
        }
        @CustomType.Setter
        public Builder cloneDnsNames(@Nullable Boolean cloneDnsNames) {

            this.cloneDnsNames = cloneDnsNames;
            return this;
        }
        @CustomType.Setter
        public Builder disallowedTlsVersions(@Nullable List<String> disallowedTlsVersions) {

            this.disallowedTlsVersions = disallowedTlsVersions;
            return this;
        }
        public Builder disallowedTlsVersions(String... disallowedTlsVersions) {
            return disallowedTlsVersions(List.of(disallowedTlsVersions));
        }
        @CustomType.Setter
        public Builder geography(String geography) {
            if (geography == null) {
              throw new MissingRequiredPropertyException("CpsDvEnrollmentNetworkConfiguration", "geography");
            }
            this.geography = geography;
            return this;
        }
        @CustomType.Setter
        public Builder mustHaveCiphers(@Nullable String mustHaveCiphers) {

            this.mustHaveCiphers = mustHaveCiphers;
            return this;
        }
        @CustomType.Setter
        public Builder ocspStapling(@Nullable String ocspStapling) {

            this.ocspStapling = ocspStapling;
            return this;
        }
        @CustomType.Setter
        public Builder preferredCiphers(@Nullable String preferredCiphers) {

            this.preferredCiphers = preferredCiphers;
            return this;
        }
        @CustomType.Setter
        public Builder quicEnabled(@Nullable Boolean quicEnabled) {

            this.quicEnabled = quicEnabled;
            return this;
        }
        public CpsDvEnrollmentNetworkConfiguration build() {
            final var _resultValue = new CpsDvEnrollmentNetworkConfiguration();
            _resultValue.clientMutualAuthentication = clientMutualAuthentication;
            _resultValue.cloneDnsNames = cloneDnsNames;
            _resultValue.disallowedTlsVersions = disallowedTlsVersions;
            _resultValue.geography = geography;
            _resultValue.mustHaveCiphers = mustHaveCiphers;
            _resultValue.ocspStapling = ocspStapling;
            _resultValue.preferredCiphers = preferredCiphers;
            _resultValue.quicEnabled = quicEnabled;
            return _resultValue;
        }
    }
}
