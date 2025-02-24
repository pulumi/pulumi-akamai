// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCPSEnrollmentsEnrollment;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCPSEnrollmentsResult {
    private String contractId;
    private List<GetCPSEnrollmentsEnrollment> enrollments;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetCPSEnrollmentsResult() {}
    public String contractId() {
        return this.contractId;
    }
    public List<GetCPSEnrollmentsEnrollment> enrollments() {
        return this.enrollments;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCPSEnrollmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private List<GetCPSEnrollmentsEnrollment> enrollments;
        private String id;
        public Builder() {}
        public Builder(GetCPSEnrollmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.enrollments = defaults.enrollments;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsResult", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder enrollments(List<GetCPSEnrollmentsEnrollment> enrollments) {
            if (enrollments == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsResult", "enrollments");
            }
            this.enrollments = enrollments;
            return this;
        }
        public Builder enrollments(GetCPSEnrollmentsEnrollment... enrollments) {
            return enrollments(List.of(enrollments));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCPSEnrollmentsResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetCPSEnrollmentsResult build() {
            final var _resultValue = new GetCPSEnrollmentsResult();
            _resultValue.contractId = contractId;
            _resultValue.enrollments = enrollments;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
