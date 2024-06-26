// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCpsDeploymentsResult {
    private String autoRenewalStartTime;
    private Integer enrollmentId;
    private String expiryDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String productionCertificateEcdsa;
    private String productionCertificateRsa;
    private String stagingCertificateEcdsa;
    private String stagingCertificateRsa;

    private GetCpsDeploymentsResult() {}
    public String autoRenewalStartTime() {
        return this.autoRenewalStartTime;
    }
    public Integer enrollmentId() {
        return this.enrollmentId;
    }
    public String expiryDate() {
        return this.expiryDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String productionCertificateEcdsa() {
        return this.productionCertificateEcdsa;
    }
    public String productionCertificateRsa() {
        return this.productionCertificateRsa;
    }
    public String stagingCertificateEcdsa() {
        return this.stagingCertificateEcdsa;
    }
    public String stagingCertificateRsa() {
        return this.stagingCertificateRsa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCpsDeploymentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoRenewalStartTime;
        private Integer enrollmentId;
        private String expiryDate;
        private String id;
        private String productionCertificateEcdsa;
        private String productionCertificateRsa;
        private String stagingCertificateEcdsa;
        private String stagingCertificateRsa;
        public Builder() {}
        public Builder(GetCpsDeploymentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenewalStartTime = defaults.autoRenewalStartTime;
    	      this.enrollmentId = defaults.enrollmentId;
    	      this.expiryDate = defaults.expiryDate;
    	      this.id = defaults.id;
    	      this.productionCertificateEcdsa = defaults.productionCertificateEcdsa;
    	      this.productionCertificateRsa = defaults.productionCertificateRsa;
    	      this.stagingCertificateEcdsa = defaults.stagingCertificateEcdsa;
    	      this.stagingCertificateRsa = defaults.stagingCertificateRsa;
        }

        @CustomType.Setter
        public Builder autoRenewalStartTime(String autoRenewalStartTime) {
            if (autoRenewalStartTime == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "autoRenewalStartTime");
            }
            this.autoRenewalStartTime = autoRenewalStartTime;
            return this;
        }
        @CustomType.Setter
        public Builder enrollmentId(Integer enrollmentId) {
            if (enrollmentId == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "enrollmentId");
            }
            this.enrollmentId = enrollmentId;
            return this;
        }
        @CustomType.Setter
        public Builder expiryDate(String expiryDate) {
            if (expiryDate == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "expiryDate");
            }
            this.expiryDate = expiryDate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder productionCertificateEcdsa(String productionCertificateEcdsa) {
            if (productionCertificateEcdsa == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "productionCertificateEcdsa");
            }
            this.productionCertificateEcdsa = productionCertificateEcdsa;
            return this;
        }
        @CustomType.Setter
        public Builder productionCertificateRsa(String productionCertificateRsa) {
            if (productionCertificateRsa == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "productionCertificateRsa");
            }
            this.productionCertificateRsa = productionCertificateRsa;
            return this;
        }
        @CustomType.Setter
        public Builder stagingCertificateEcdsa(String stagingCertificateEcdsa) {
            if (stagingCertificateEcdsa == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "stagingCertificateEcdsa");
            }
            this.stagingCertificateEcdsa = stagingCertificateEcdsa;
            return this;
        }
        @CustomType.Setter
        public Builder stagingCertificateRsa(String stagingCertificateRsa) {
            if (stagingCertificateRsa == null) {
              throw new MissingRequiredPropertyException("GetCpsDeploymentsResult", "stagingCertificateRsa");
            }
            this.stagingCertificateRsa = stagingCertificateRsa;
            return this;
        }
        public GetCpsDeploymentsResult build() {
            final var _resultValue = new GetCpsDeploymentsResult();
            _resultValue.autoRenewalStartTime = autoRenewalStartTime;
            _resultValue.enrollmentId = enrollmentId;
            _resultValue.expiryDate = expiryDate;
            _resultValue.id = id;
            _resultValue.productionCertificateEcdsa = productionCertificateEcdsa;
            _resultValue.productionCertificateRsa = productionCertificateRsa;
            _resultValue.stagingCertificateEcdsa = stagingCertificateEcdsa;
            _resultValue.stagingCertificateRsa = stagingCertificateRsa;
            return _resultValue;
        }
    }
}
