// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.CpsDvEnrollmentNetworkConfigurationClientMutualAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CpsDvEnrollmentNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CpsDvEnrollmentNetworkConfigurationArgs Empty = new CpsDvEnrollmentNetworkConfigurationArgs();

    /**
     * The trust chain configuration used for client mutual authentication
     * 
     */
    @Import(name="clientMutualAuthentication")
    private @Nullable Output<CpsDvEnrollmentNetworkConfigurationClientMutualAuthenticationArgs> clientMutualAuthentication;

    /**
     * @return The trust chain configuration used for client mutual authentication
     * 
     */
    public Optional<Output<CpsDvEnrollmentNetworkConfigurationClientMutualAuthenticationArgs>> clientMutualAuthentication() {
        return Optional.ofNullable(this.clientMutualAuthentication);
    }

    /**
     * Enable CPS to direct traffic using all the SANs listed in the SANs parameter when enrollment is created. Default is false
     * 
     */
    @Import(name="cloneDnsNames")
    private @Nullable Output<Boolean> cloneDnsNames;

    /**
     * @return Enable CPS to direct traffic using all the SANs listed in the SANs parameter when enrollment is created. Default is false
     * 
     */
    public Optional<Output<Boolean>> cloneDnsNames() {
        return Optional.ofNullable(this.cloneDnsNames);
    }

    /**
     * TLS versions which are disallowed
     * 
     */
    @Import(name="disallowedTlsVersions")
    private @Nullable Output<List<String>> disallowedTlsVersions;

    /**
     * @return TLS versions which are disallowed
     * 
     */
    public Optional<Output<List<String>>> disallowedTlsVersions() {
        return Optional.ofNullable(this.disallowedTlsVersions);
    }

    /**
     * Geography type used for enrollment
     * 
     */
    @Import(name="geography", required=true)
    private Output<String> geography;

    /**
     * @return Geography type used for enrollment
     * 
     */
    public Output<String> geography() {
        return this.geography;
    }

    /**
     * Mandatory Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    @Import(name="mustHaveCiphers")
    private @Nullable Output<String> mustHaveCiphers;

    /**
     * @return Mandatory Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    public Optional<Output<String>> mustHaveCiphers() {
        return Optional.ofNullable(this.mustHaveCiphers);
    }

    /**
     * Enable OCSP stapling. Default is &#39;on&#39;
     * 
     */
    @Import(name="ocspStapling")
    private @Nullable Output<String> ocspStapling;

    /**
     * @return Enable OCSP stapling. Default is &#39;on&#39;
     * 
     */
    public Optional<Output<String>> ocspStapling() {
        return Optional.ofNullable(this.ocspStapling);
    }

    /**
     * Preferred Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    @Import(name="preferredCiphers")
    private @Nullable Output<String> preferredCiphers;

    /**
     * @return Preferred Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
     * 
     */
    public Optional<Output<String>> preferredCiphers() {
        return Optional.ofNullable(this.preferredCiphers);
    }

    /**
     * Enable QUIC protocol. Default is false
     * 
     */
    @Import(name="quicEnabled")
    private @Nullable Output<Boolean> quicEnabled;

    /**
     * @return Enable QUIC protocol. Default is false
     * 
     */
    public Optional<Output<Boolean>> quicEnabled() {
        return Optional.ofNullable(this.quicEnabled);
    }

    private CpsDvEnrollmentNetworkConfigurationArgs() {}

    private CpsDvEnrollmentNetworkConfigurationArgs(CpsDvEnrollmentNetworkConfigurationArgs $) {
        this.clientMutualAuthentication = $.clientMutualAuthentication;
        this.cloneDnsNames = $.cloneDnsNames;
        this.disallowedTlsVersions = $.disallowedTlsVersions;
        this.geography = $.geography;
        this.mustHaveCiphers = $.mustHaveCiphers;
        this.ocspStapling = $.ocspStapling;
        this.preferredCiphers = $.preferredCiphers;
        this.quicEnabled = $.quicEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CpsDvEnrollmentNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CpsDvEnrollmentNetworkConfigurationArgs $;

        public Builder() {
            $ = new CpsDvEnrollmentNetworkConfigurationArgs();
        }

        public Builder(CpsDvEnrollmentNetworkConfigurationArgs defaults) {
            $ = new CpsDvEnrollmentNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientMutualAuthentication The trust chain configuration used for client mutual authentication
         * 
         * @return builder
         * 
         */
        public Builder clientMutualAuthentication(@Nullable Output<CpsDvEnrollmentNetworkConfigurationClientMutualAuthenticationArgs> clientMutualAuthentication) {
            $.clientMutualAuthentication = clientMutualAuthentication;
            return this;
        }

        /**
         * @param clientMutualAuthentication The trust chain configuration used for client mutual authentication
         * 
         * @return builder
         * 
         */
        public Builder clientMutualAuthentication(CpsDvEnrollmentNetworkConfigurationClientMutualAuthenticationArgs clientMutualAuthentication) {
            return clientMutualAuthentication(Output.of(clientMutualAuthentication));
        }

        /**
         * @param cloneDnsNames Enable CPS to direct traffic using all the SANs listed in the SANs parameter when enrollment is created. Default is false
         * 
         * @return builder
         * 
         */
        public Builder cloneDnsNames(@Nullable Output<Boolean> cloneDnsNames) {
            $.cloneDnsNames = cloneDnsNames;
            return this;
        }

        /**
         * @param cloneDnsNames Enable CPS to direct traffic using all the SANs listed in the SANs parameter when enrollment is created. Default is false
         * 
         * @return builder
         * 
         */
        public Builder cloneDnsNames(Boolean cloneDnsNames) {
            return cloneDnsNames(Output.of(cloneDnsNames));
        }

        /**
         * @param disallowedTlsVersions TLS versions which are disallowed
         * 
         * @return builder
         * 
         */
        public Builder disallowedTlsVersions(@Nullable Output<List<String>> disallowedTlsVersions) {
            $.disallowedTlsVersions = disallowedTlsVersions;
            return this;
        }

        /**
         * @param disallowedTlsVersions TLS versions which are disallowed
         * 
         * @return builder
         * 
         */
        public Builder disallowedTlsVersions(List<String> disallowedTlsVersions) {
            return disallowedTlsVersions(Output.of(disallowedTlsVersions));
        }

        /**
         * @param disallowedTlsVersions TLS versions which are disallowed
         * 
         * @return builder
         * 
         */
        public Builder disallowedTlsVersions(String... disallowedTlsVersions) {
            return disallowedTlsVersions(List.of(disallowedTlsVersions));
        }

        /**
         * @param geography Geography type used for enrollment
         * 
         * @return builder
         * 
         */
        public Builder geography(Output<String> geography) {
            $.geography = geography;
            return this;
        }

        /**
         * @param geography Geography type used for enrollment
         * 
         * @return builder
         * 
         */
        public Builder geography(String geography) {
            return geography(Output.of(geography));
        }

        /**
         * @param mustHaveCiphers Mandatory Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
         * 
         * @return builder
         * 
         */
        public Builder mustHaveCiphers(@Nullable Output<String> mustHaveCiphers) {
            $.mustHaveCiphers = mustHaveCiphers;
            return this;
        }

        /**
         * @param mustHaveCiphers Mandatory Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
         * 
         * @return builder
         * 
         */
        public Builder mustHaveCiphers(String mustHaveCiphers) {
            return mustHaveCiphers(Output.of(mustHaveCiphers));
        }

        /**
         * @param ocspStapling Enable OCSP stapling. Default is &#39;on&#39;
         * 
         * @return builder
         * 
         */
        public Builder ocspStapling(@Nullable Output<String> ocspStapling) {
            $.ocspStapling = ocspStapling;
            return this;
        }

        /**
         * @param ocspStapling Enable OCSP stapling. Default is &#39;on&#39;
         * 
         * @return builder
         * 
         */
        public Builder ocspStapling(String ocspStapling) {
            return ocspStapling(Output.of(ocspStapling));
        }

        /**
         * @param preferredCiphers Preferred Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
         * 
         * @return builder
         * 
         */
        public Builder preferredCiphers(@Nullable Output<String> preferredCiphers) {
            $.preferredCiphers = preferredCiphers;
            return this;
        }

        /**
         * @param preferredCiphers Preferred Ciphers which are included for enrollment. Default is &#39;ak-akamai-2020q1&#39;
         * 
         * @return builder
         * 
         */
        public Builder preferredCiphers(String preferredCiphers) {
            return preferredCiphers(Output.of(preferredCiphers));
        }

        /**
         * @param quicEnabled Enable QUIC protocol. Default is false
         * 
         * @return builder
         * 
         */
        public Builder quicEnabled(@Nullable Output<Boolean> quicEnabled) {
            $.quicEnabled = quicEnabled;
            return this;
        }

        /**
         * @param quicEnabled Enable QUIC protocol. Default is false
         * 
         * @return builder
         * 
         */
        public Builder quicEnabled(Boolean quicEnabled) {
            return quicEnabled(Output.of(quicEnabled));
        }

        public CpsDvEnrollmentNetworkConfigurationArgs build() {
            if ($.geography == null) {
                throw new MissingRequiredPropertyException("CpsDvEnrollmentNetworkConfigurationArgs", "geography");
            }
            return $;
        }
    }

}
