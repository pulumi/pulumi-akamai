// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetGtmDomainStatusLink;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGtmDomainStatus {
    /**
     * @return A unique identifier generated when a change occurs to the domain.
     * 
     */
    private String changeId;
    /**
     * @return Specifies the URL path that allows direct navigation to the domain.
     * 
     */
    private @Nullable List<GetGtmDomainStatusLink> links;
    /**
     * @return A notification generated when a change occurs to the domain.
     * 
     */
    private String message;
    /**
     * @return Indicates if the domain validates.
     * 
     */
    private Boolean passingValidation;
    /**
     * @return Tracks the status of the domain&#39;s propagation state.
     * 
     */
    private String propagationStatus;
    /**
     * @return An ISO 8601 timestamp indicating when a change occurs to the domain.
     * 
     */
    private String propagationStatusDate;

    private GetGtmDomainStatus() {}
    /**
     * @return A unique identifier generated when a change occurs to the domain.
     * 
     */
    public String changeId() {
        return this.changeId;
    }
    /**
     * @return Specifies the URL path that allows direct navigation to the domain.
     * 
     */
    public List<GetGtmDomainStatusLink> links() {
        return this.links == null ? List.of() : this.links;
    }
    /**
     * @return A notification generated when a change occurs to the domain.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Indicates if the domain validates.
     * 
     */
    public Boolean passingValidation() {
        return this.passingValidation;
    }
    /**
     * @return Tracks the status of the domain&#39;s propagation state.
     * 
     */
    public String propagationStatus() {
        return this.propagationStatus;
    }
    /**
     * @return An ISO 8601 timestamp indicating when a change occurs to the domain.
     * 
     */
    public String propagationStatusDate() {
        return this.propagationStatusDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGtmDomainStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String changeId;
        private @Nullable List<GetGtmDomainStatusLink> links;
        private String message;
        private Boolean passingValidation;
        private String propagationStatus;
        private String propagationStatusDate;
        public Builder() {}
        public Builder(GetGtmDomainStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeId = defaults.changeId;
    	      this.links = defaults.links;
    	      this.message = defaults.message;
    	      this.passingValidation = defaults.passingValidation;
    	      this.propagationStatus = defaults.propagationStatus;
    	      this.propagationStatusDate = defaults.propagationStatusDate;
        }

        @CustomType.Setter
        public Builder changeId(String changeId) {
            if (changeId == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainStatus", "changeId");
            }
            this.changeId = changeId;
            return this;
        }
        @CustomType.Setter
        public Builder links(@Nullable List<GetGtmDomainStatusLink> links) {

            this.links = links;
            return this;
        }
        public Builder links(GetGtmDomainStatusLink... links) {
            return links(List.of(links));
        }
        @CustomType.Setter
        public Builder message(String message) {
            if (message == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainStatus", "message");
            }
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder passingValidation(Boolean passingValidation) {
            if (passingValidation == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainStatus", "passingValidation");
            }
            this.passingValidation = passingValidation;
            return this;
        }
        @CustomType.Setter
        public Builder propagationStatus(String propagationStatus) {
            if (propagationStatus == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainStatus", "propagationStatus");
            }
            this.propagationStatus = propagationStatus;
            return this;
        }
        @CustomType.Setter
        public Builder propagationStatusDate(String propagationStatusDate) {
            if (propagationStatusDate == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainStatus", "propagationStatusDate");
            }
            this.propagationStatusDate = propagationStatusDate;
            return this;
        }
        public GetGtmDomainStatus build() {
            final var _resultValue = new GetGtmDomainStatus();
            _resultValue.changeId = changeId;
            _resultValue.links = links;
            _resultValue.message = message;
            _resultValue.passingValidation = passingValidation;
            _resultValue.propagationStatus = propagationStatus;
            _resultValue.propagationStatusDate = propagationStatusDate;
            return _resultValue;
        }
    }
}
