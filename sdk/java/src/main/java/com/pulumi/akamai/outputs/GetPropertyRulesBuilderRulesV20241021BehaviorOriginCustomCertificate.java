// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateIssuerRdns;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateSubjectRdns;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificate {
    private @Nullable Boolean canBeCa;
    private @Nullable Boolean canBeLeaf;
    private @Nullable GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateIssuerRdns issuerRdns;
    private @Nullable Integer notAfter;
    private @Nullable Integer notBefore;
    private @Nullable String pemEncodedCert;
    private @Nullable String publicKey;
    private @Nullable String publicKeyAlgorithm;
    private @Nullable String publicKeyFormat;
    private @Nullable Boolean selfSigned;
    private @Nullable String serialNumber;
    private @Nullable String sha1Fingerprint;
    private @Nullable String sigAlgName;
    private @Nullable List<String> subjectAlternativeNames;
    private @Nullable String subjectCn;
    private @Nullable GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateSubjectRdns subjectRdns;
    private @Nullable Integer version;

    private GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificate() {}
    public Optional<Boolean> canBeCa() {
        return Optional.ofNullable(this.canBeCa);
    }
    public Optional<Boolean> canBeLeaf() {
        return Optional.ofNullable(this.canBeLeaf);
    }
    public Optional<GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateIssuerRdns> issuerRdns() {
        return Optional.ofNullable(this.issuerRdns);
    }
    public Optional<Integer> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }
    public Optional<Integer> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }
    public Optional<String> pemEncodedCert() {
        return Optional.ofNullable(this.pemEncodedCert);
    }
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    public Optional<String> publicKeyAlgorithm() {
        return Optional.ofNullable(this.publicKeyAlgorithm);
    }
    public Optional<String> publicKeyFormat() {
        return Optional.ofNullable(this.publicKeyFormat);
    }
    public Optional<Boolean> selfSigned() {
        return Optional.ofNullable(this.selfSigned);
    }
    public Optional<String> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    public Optional<String> sha1Fingerprint() {
        return Optional.ofNullable(this.sha1Fingerprint);
    }
    public Optional<String> sigAlgName() {
        return Optional.ofNullable(this.sigAlgName);
    }
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? List.of() : this.subjectAlternativeNames;
    }
    public Optional<String> subjectCn() {
        return Optional.ofNullable(this.subjectCn);
    }
    public Optional<GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateSubjectRdns> subjectRdns() {
        return Optional.ofNullable(this.subjectRdns);
    }
    public Optional<Integer> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean canBeCa;
        private @Nullable Boolean canBeLeaf;
        private @Nullable GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateIssuerRdns issuerRdns;
        private @Nullable Integer notAfter;
        private @Nullable Integer notBefore;
        private @Nullable String pemEncodedCert;
        private @Nullable String publicKey;
        private @Nullable String publicKeyAlgorithm;
        private @Nullable String publicKeyFormat;
        private @Nullable Boolean selfSigned;
        private @Nullable String serialNumber;
        private @Nullable String sha1Fingerprint;
        private @Nullable String sigAlgName;
        private @Nullable List<String> subjectAlternativeNames;
        private @Nullable String subjectCn;
        private @Nullable GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateSubjectRdns subjectRdns;
        private @Nullable Integer version;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canBeCa = defaults.canBeCa;
    	      this.canBeLeaf = defaults.canBeLeaf;
    	      this.issuerRdns = defaults.issuerRdns;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.pemEncodedCert = defaults.pemEncodedCert;
    	      this.publicKey = defaults.publicKey;
    	      this.publicKeyAlgorithm = defaults.publicKeyAlgorithm;
    	      this.publicKeyFormat = defaults.publicKeyFormat;
    	      this.selfSigned = defaults.selfSigned;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
    	      this.sigAlgName = defaults.sigAlgName;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.subjectCn = defaults.subjectCn;
    	      this.subjectRdns = defaults.subjectRdns;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder canBeCa(@Nullable Boolean canBeCa) {

            this.canBeCa = canBeCa;
            return this;
        }
        @CustomType.Setter
        public Builder canBeLeaf(@Nullable Boolean canBeLeaf) {

            this.canBeLeaf = canBeLeaf;
            return this;
        }
        @CustomType.Setter
        public Builder issuerRdns(@Nullable GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateIssuerRdns issuerRdns) {

            this.issuerRdns = issuerRdns;
            return this;
        }
        @CustomType.Setter
        public Builder notAfter(@Nullable Integer notAfter) {

            this.notAfter = notAfter;
            return this;
        }
        @CustomType.Setter
        public Builder notBefore(@Nullable Integer notBefore) {

            this.notBefore = notBefore;
            return this;
        }
        @CustomType.Setter
        public Builder pemEncodedCert(@Nullable String pemEncodedCert) {

            this.pemEncodedCert = pemEncodedCert;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(@Nullable String publicKey) {

            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder publicKeyAlgorithm(@Nullable String publicKeyAlgorithm) {

            this.publicKeyAlgorithm = publicKeyAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder publicKeyFormat(@Nullable String publicKeyFormat) {

            this.publicKeyFormat = publicKeyFormat;
            return this;
        }
        @CustomType.Setter
        public Builder selfSigned(@Nullable Boolean selfSigned) {

            this.selfSigned = selfSigned;
            return this;
        }
        @CustomType.Setter
        public Builder serialNumber(@Nullable String serialNumber) {

            this.serialNumber = serialNumber;
            return this;
        }
        @CustomType.Setter
        public Builder sha1Fingerprint(@Nullable String sha1Fingerprint) {

            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder sigAlgName(@Nullable String sigAlgName) {

            this.sigAlgName = sigAlgName;
            return this;
        }
        @CustomType.Setter
        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {

            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        @CustomType.Setter
        public Builder subjectCn(@Nullable String subjectCn) {

            this.subjectCn = subjectCn;
            return this;
        }
        @CustomType.Setter
        public Builder subjectRdns(@Nullable GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificateSubjectRdns subjectRdns) {

            this.subjectRdns = subjectRdns;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable Integer version) {

            this.version = version;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificate build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20241021BehaviorOriginCustomCertificate();
            _resultValue.canBeCa = canBeCa;
            _resultValue.canBeLeaf = canBeLeaf;
            _resultValue.issuerRdns = issuerRdns;
            _resultValue.notAfter = notAfter;
            _resultValue.notBefore = notBefore;
            _resultValue.pemEncodedCert = pemEncodedCert;
            _resultValue.publicKey = publicKey;
            _resultValue.publicKeyAlgorithm = publicKeyAlgorithm;
            _resultValue.publicKeyFormat = publicKeyFormat;
            _resultValue.selfSigned = selfSigned;
            _resultValue.serialNumber = serialNumber;
            _resultValue.sha1Fingerprint = sha1Fingerprint;
            _resultValue.sigAlgName = sigAlgName;
            _resultValue.subjectAlternativeNames = subjectAlternativeNames;
            _resultValue.subjectCn = subjectCn;
            _resultValue.subjectRdns = subjectRdns;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
