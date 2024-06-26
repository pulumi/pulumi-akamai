// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetGtmDomainsDomainLink;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGtmDomainsDomain {
    /**
     * @return The contract&#39;s identifier, with which the domain is associated.
     * 
     */
    private String acgId;
    /**
     * @return &#39;PENDING&#39; when a change has been made but not yet propagated; &#39;COMPLETE&#39; when the last configuration change has propagated successfully; &#39;DENIED&#39; if the domain configuration failed validation; &#39;DELETED&#39; if the domain has been deleted.
     * 
     */
    private String activationState;
    /**
     * @return UUID that identifies a version of the domain configuration.
     * 
     */
    private String changeId;
    /**
     * @return UUID for delete request during domain deletion. Null if the domain is not being deleted.
     * 
     */
    private String deleteRequestId;
    /**
     * @return An ISO 8601 timestamp that indicates the time of the last domain change.
     * 
     */
    private String lastModified;
    /**
     * @return The email address of the administrator who made the last change to the domain.
     * 
     */
    private String lastModifiedBy;
    /**
     * @return Provides a URL path that allows direct navigation to the domain.
     * 
     */
    private @Nullable List<GetGtmDomainsDomainLink> links;
    /**
     * @return A descriptive note about changes to the domain.
     * 
     */
    private String modificationComments;
    /**
     * @return A unique domain name.
     * 
     */
    private String name;
    /**
     * @return If set (true) we will sign the domain&#39;s resource records so that they can be validated by a validating resolver.
     * 
     */
    private Boolean signAndServe;
    /**
     * @return The signing algorithm to use for signAndServe. One of the following values: RSA_SHA1, RSA_SHA256, RSA_SHA512, ECDSA_P256_SHA256, ECDSA_P384_SHA384, ED25519, ED448.
     * 
     */
    private String signAndServeAlgorithm;
    /**
     * @return The current status of the domain.
     * 
     */
    private String status;

    private GetGtmDomainsDomain() {}
    /**
     * @return The contract&#39;s identifier, with which the domain is associated.
     * 
     */
    public String acgId() {
        return this.acgId;
    }
    /**
     * @return &#39;PENDING&#39; when a change has been made but not yet propagated; &#39;COMPLETE&#39; when the last configuration change has propagated successfully; &#39;DENIED&#39; if the domain configuration failed validation; &#39;DELETED&#39; if the domain has been deleted.
     * 
     */
    public String activationState() {
        return this.activationState;
    }
    /**
     * @return UUID that identifies a version of the domain configuration.
     * 
     */
    public String changeId() {
        return this.changeId;
    }
    /**
     * @return UUID for delete request during domain deletion. Null if the domain is not being deleted.
     * 
     */
    public String deleteRequestId() {
        return this.deleteRequestId;
    }
    /**
     * @return An ISO 8601 timestamp that indicates the time of the last domain change.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }
    /**
     * @return The email address of the administrator who made the last change to the domain.
     * 
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * @return Provides a URL path that allows direct navigation to the domain.
     * 
     */
    public List<GetGtmDomainsDomainLink> links() {
        return this.links == null ? List.of() : this.links;
    }
    /**
     * @return A descriptive note about changes to the domain.
     * 
     */
    public String modificationComments() {
        return this.modificationComments;
    }
    /**
     * @return A unique domain name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return If set (true) we will sign the domain&#39;s resource records so that they can be validated by a validating resolver.
     * 
     */
    public Boolean signAndServe() {
        return this.signAndServe;
    }
    /**
     * @return The signing algorithm to use for signAndServe. One of the following values: RSA_SHA1, RSA_SHA256, RSA_SHA512, ECDSA_P256_SHA256, ECDSA_P384_SHA384, ED25519, ED448.
     * 
     */
    public String signAndServeAlgorithm() {
        return this.signAndServeAlgorithm;
    }
    /**
     * @return The current status of the domain.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGtmDomainsDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acgId;
        private String activationState;
        private String changeId;
        private String deleteRequestId;
        private String lastModified;
        private String lastModifiedBy;
        private @Nullable List<GetGtmDomainsDomainLink> links;
        private String modificationComments;
        private String name;
        private Boolean signAndServe;
        private String signAndServeAlgorithm;
        private String status;
        public Builder() {}
        public Builder(GetGtmDomainsDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acgId = defaults.acgId;
    	      this.activationState = defaults.activationState;
    	      this.changeId = defaults.changeId;
    	      this.deleteRequestId = defaults.deleteRequestId;
    	      this.lastModified = defaults.lastModified;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.links = defaults.links;
    	      this.modificationComments = defaults.modificationComments;
    	      this.name = defaults.name;
    	      this.signAndServe = defaults.signAndServe;
    	      this.signAndServeAlgorithm = defaults.signAndServeAlgorithm;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder acgId(String acgId) {
            if (acgId == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "acgId");
            }
            this.acgId = acgId;
            return this;
        }
        @CustomType.Setter
        public Builder activationState(String activationState) {
            if (activationState == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "activationState");
            }
            this.activationState = activationState;
            return this;
        }
        @CustomType.Setter
        public Builder changeId(String changeId) {
            if (changeId == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "changeId");
            }
            this.changeId = changeId;
            return this;
        }
        @CustomType.Setter
        public Builder deleteRequestId(String deleteRequestId) {
            if (deleteRequestId == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "deleteRequestId");
            }
            this.deleteRequestId = deleteRequestId;
            return this;
        }
        @CustomType.Setter
        public Builder lastModified(String lastModified) {
            if (lastModified == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "lastModified");
            }
            this.lastModified = lastModified;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedBy(String lastModifiedBy) {
            if (lastModifiedBy == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "lastModifiedBy");
            }
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        @CustomType.Setter
        public Builder links(@Nullable List<GetGtmDomainsDomainLink> links) {

            this.links = links;
            return this;
        }
        public Builder links(GetGtmDomainsDomainLink... links) {
            return links(List.of(links));
        }
        @CustomType.Setter
        public Builder modificationComments(String modificationComments) {
            if (modificationComments == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "modificationComments");
            }
            this.modificationComments = modificationComments;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder signAndServe(Boolean signAndServe) {
            if (signAndServe == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "signAndServe");
            }
            this.signAndServe = signAndServe;
            return this;
        }
        @CustomType.Setter
        public Builder signAndServeAlgorithm(String signAndServeAlgorithm) {
            if (signAndServeAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "signAndServeAlgorithm");
            }
            this.signAndServeAlgorithm = signAndServeAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "status");
            }
            this.status = status;
            return this;
        }
        public GetGtmDomainsDomain build() {
            final var _resultValue = new GetGtmDomainsDomain();
            _resultValue.acgId = acgId;
            _resultValue.activationState = activationState;
            _resultValue.changeId = changeId;
            _resultValue.deleteRequestId = deleteRequestId;
            _resultValue.lastModified = lastModified;
            _resultValue.lastModifiedBy = lastModifiedBy;
            _resultValue.links = links;
            _resultValue.modificationComments = modificationComments;
            _resultValue.name = name;
            _resultValue.signAndServe = signAndServe;
            _resultValue.signAndServeAlgorithm = signAndServeAlgorithm;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
