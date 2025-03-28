// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.CpsUploadCertificateTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CpsUploadCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final CpsUploadCertificateState Empty = new CpsUploadCertificateState();

    /**
     * Whether to acknowledge change management
     * 
     */
    @Import(name="acknowledgeChangeManagement")
    private @Nullable Output<Boolean> acknowledgeChangeManagement;

    /**
     * @return Whether to acknowledge change management
     * 
     */
    public Optional<Output<Boolean>> acknowledgeChangeManagement() {
        return Optional.ofNullable(this.acknowledgeChangeManagement);
    }

    /**
     * Whether to acknowledge post-verification warnings
     * 
     */
    @Import(name="acknowledgePostVerificationWarnings")
    private @Nullable Output<Boolean> acknowledgePostVerificationWarnings;

    /**
     * @return Whether to acknowledge post-verification warnings
     * 
     */
    public Optional<Output<Boolean>> acknowledgePostVerificationWarnings() {
        return Optional.ofNullable(this.acknowledgePostVerificationWarnings);
    }

    /**
     * List of post-verification warnings to be automatically acknowledged
     * 
     */
    @Import(name="autoApproveWarnings")
    private @Nullable Output<List<String>> autoApproveWarnings;

    /**
     * @return List of post-verification warnings to be automatically acknowledged
     * 
     */
    public Optional<Output<List<String>>> autoApproveWarnings() {
        return Optional.ofNullable(this.autoApproveWarnings);
    }

    /**
     * ECDSA certificate in pem format to be uploaded
     * 
     */
    @Import(name="certificateEcdsaPem")
    private @Nullable Output<String> certificateEcdsaPem;

    /**
     * @return ECDSA certificate in pem format to be uploaded
     * 
     */
    public Optional<Output<String>> certificateEcdsaPem() {
        return Optional.ofNullable(this.certificateEcdsaPem);
    }

    /**
     * RSA certificate in pem format to be uploaded
     * 
     */
    @Import(name="certificateRsaPem")
    private @Nullable Output<String> certificateRsaPem;

    /**
     * @return RSA certificate in pem format to be uploaded
     * 
     */
    public Optional<Output<String>> certificateRsaPem() {
        return Optional.ofNullable(this.certificateRsaPem);
    }

    /**
     * The unique identifier of the enrollment
     * 
     */
    @Import(name="enrollmentId")
    private @Nullable Output<Integer> enrollmentId;

    /**
     * @return The unique identifier of the enrollment
     * 
     */
    public Optional<Output<Integer>> enrollmentId() {
        return Optional.ofNullable(this.enrollmentId);
    }

    /**
     * Enables to set timeout for processing
     * 
     */
    @Import(name="timeouts")
    private @Nullable Output<CpsUploadCertificateTimeoutsArgs> timeouts;

    /**
     * @return Enables to set timeout for processing
     * 
     */
    public Optional<Output<CpsUploadCertificateTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * Trust chain in pem format for provided ECDSA certificate
     * 
     */
    @Import(name="trustChainEcdsaPem")
    private @Nullable Output<String> trustChainEcdsaPem;

    /**
     * @return Trust chain in pem format for provided ECDSA certificate
     * 
     */
    public Optional<Output<String>> trustChainEcdsaPem() {
        return Optional.ofNullable(this.trustChainEcdsaPem);
    }

    /**
     * Trust chain in pem format for provided RSA certificate
     * 
     */
    @Import(name="trustChainRsaPem")
    private @Nullable Output<String> trustChainRsaPem;

    /**
     * @return Trust chain in pem format for provided RSA certificate
     * 
     */
    public Optional<Output<String>> trustChainRsaPem() {
        return Optional.ofNullable(this.trustChainRsaPem);
    }

    /**
     * Whether to wait for certificate to be deployed
     * 
     */
    @Import(name="waitForDeployment")
    private @Nullable Output<Boolean> waitForDeployment;

    /**
     * @return Whether to wait for certificate to be deployed
     * 
     */
    public Optional<Output<Boolean>> waitForDeployment() {
        return Optional.ofNullable(this.waitForDeployment);
    }

    private CpsUploadCertificateState() {}

    private CpsUploadCertificateState(CpsUploadCertificateState $) {
        this.acknowledgeChangeManagement = $.acknowledgeChangeManagement;
        this.acknowledgePostVerificationWarnings = $.acknowledgePostVerificationWarnings;
        this.autoApproveWarnings = $.autoApproveWarnings;
        this.certificateEcdsaPem = $.certificateEcdsaPem;
        this.certificateRsaPem = $.certificateRsaPem;
        this.enrollmentId = $.enrollmentId;
        this.timeouts = $.timeouts;
        this.trustChainEcdsaPem = $.trustChainEcdsaPem;
        this.trustChainRsaPem = $.trustChainRsaPem;
        this.waitForDeployment = $.waitForDeployment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CpsUploadCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CpsUploadCertificateState $;

        public Builder() {
            $ = new CpsUploadCertificateState();
        }

        public Builder(CpsUploadCertificateState defaults) {
            $ = new CpsUploadCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acknowledgeChangeManagement Whether to acknowledge change management
         * 
         * @return builder
         * 
         */
        public Builder acknowledgeChangeManagement(@Nullable Output<Boolean> acknowledgeChangeManagement) {
            $.acknowledgeChangeManagement = acknowledgeChangeManagement;
            return this;
        }

        /**
         * @param acknowledgeChangeManagement Whether to acknowledge change management
         * 
         * @return builder
         * 
         */
        public Builder acknowledgeChangeManagement(Boolean acknowledgeChangeManagement) {
            return acknowledgeChangeManagement(Output.of(acknowledgeChangeManagement));
        }

        /**
         * @param acknowledgePostVerificationWarnings Whether to acknowledge post-verification warnings
         * 
         * @return builder
         * 
         */
        public Builder acknowledgePostVerificationWarnings(@Nullable Output<Boolean> acknowledgePostVerificationWarnings) {
            $.acknowledgePostVerificationWarnings = acknowledgePostVerificationWarnings;
            return this;
        }

        /**
         * @param acknowledgePostVerificationWarnings Whether to acknowledge post-verification warnings
         * 
         * @return builder
         * 
         */
        public Builder acknowledgePostVerificationWarnings(Boolean acknowledgePostVerificationWarnings) {
            return acknowledgePostVerificationWarnings(Output.of(acknowledgePostVerificationWarnings));
        }

        /**
         * @param autoApproveWarnings List of post-verification warnings to be automatically acknowledged
         * 
         * @return builder
         * 
         */
        public Builder autoApproveWarnings(@Nullable Output<List<String>> autoApproveWarnings) {
            $.autoApproveWarnings = autoApproveWarnings;
            return this;
        }

        /**
         * @param autoApproveWarnings List of post-verification warnings to be automatically acknowledged
         * 
         * @return builder
         * 
         */
        public Builder autoApproveWarnings(List<String> autoApproveWarnings) {
            return autoApproveWarnings(Output.of(autoApproveWarnings));
        }

        /**
         * @param autoApproveWarnings List of post-verification warnings to be automatically acknowledged
         * 
         * @return builder
         * 
         */
        public Builder autoApproveWarnings(String... autoApproveWarnings) {
            return autoApproveWarnings(List.of(autoApproveWarnings));
        }

        /**
         * @param certificateEcdsaPem ECDSA certificate in pem format to be uploaded
         * 
         * @return builder
         * 
         */
        public Builder certificateEcdsaPem(@Nullable Output<String> certificateEcdsaPem) {
            $.certificateEcdsaPem = certificateEcdsaPem;
            return this;
        }

        /**
         * @param certificateEcdsaPem ECDSA certificate in pem format to be uploaded
         * 
         * @return builder
         * 
         */
        public Builder certificateEcdsaPem(String certificateEcdsaPem) {
            return certificateEcdsaPem(Output.of(certificateEcdsaPem));
        }

        /**
         * @param certificateRsaPem RSA certificate in pem format to be uploaded
         * 
         * @return builder
         * 
         */
        public Builder certificateRsaPem(@Nullable Output<String> certificateRsaPem) {
            $.certificateRsaPem = certificateRsaPem;
            return this;
        }

        /**
         * @param certificateRsaPem RSA certificate in pem format to be uploaded
         * 
         * @return builder
         * 
         */
        public Builder certificateRsaPem(String certificateRsaPem) {
            return certificateRsaPem(Output.of(certificateRsaPem));
        }

        /**
         * @param enrollmentId The unique identifier of the enrollment
         * 
         * @return builder
         * 
         */
        public Builder enrollmentId(@Nullable Output<Integer> enrollmentId) {
            $.enrollmentId = enrollmentId;
            return this;
        }

        /**
         * @param enrollmentId The unique identifier of the enrollment
         * 
         * @return builder
         * 
         */
        public Builder enrollmentId(Integer enrollmentId) {
            return enrollmentId(Output.of(enrollmentId));
        }

        /**
         * @param timeouts Enables to set timeout for processing
         * 
         * @return builder
         * 
         */
        public Builder timeouts(@Nullable Output<CpsUploadCertificateTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        /**
         * @param timeouts Enables to set timeout for processing
         * 
         * @return builder
         * 
         */
        public Builder timeouts(CpsUploadCertificateTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param trustChainEcdsaPem Trust chain in pem format for provided ECDSA certificate
         * 
         * @return builder
         * 
         */
        public Builder trustChainEcdsaPem(@Nullable Output<String> trustChainEcdsaPem) {
            $.trustChainEcdsaPem = trustChainEcdsaPem;
            return this;
        }

        /**
         * @param trustChainEcdsaPem Trust chain in pem format for provided ECDSA certificate
         * 
         * @return builder
         * 
         */
        public Builder trustChainEcdsaPem(String trustChainEcdsaPem) {
            return trustChainEcdsaPem(Output.of(trustChainEcdsaPem));
        }

        /**
         * @param trustChainRsaPem Trust chain in pem format for provided RSA certificate
         * 
         * @return builder
         * 
         */
        public Builder trustChainRsaPem(@Nullable Output<String> trustChainRsaPem) {
            $.trustChainRsaPem = trustChainRsaPem;
            return this;
        }

        /**
         * @param trustChainRsaPem Trust chain in pem format for provided RSA certificate
         * 
         * @return builder
         * 
         */
        public Builder trustChainRsaPem(String trustChainRsaPem) {
            return trustChainRsaPem(Output.of(trustChainRsaPem));
        }

        /**
         * @param waitForDeployment Whether to wait for certificate to be deployed
         * 
         * @return builder
         * 
         */
        public Builder waitForDeployment(@Nullable Output<Boolean> waitForDeployment) {
            $.waitForDeployment = waitForDeployment;
            return this;
        }

        /**
         * @param waitForDeployment Whether to wait for certificate to be deployed
         * 
         * @return builder
         * 
         */
        public Builder waitForDeployment(Boolean waitForDeployment) {
            return waitForDeployment(Output.of(waitForDeployment));
        }

        public CpsUploadCertificateState build() {
            return $;
        }
    }

}
