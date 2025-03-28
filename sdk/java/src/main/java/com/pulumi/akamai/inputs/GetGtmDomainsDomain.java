// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetGtmDomainsDomainLink;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGtmDomainsDomain extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmDomainsDomain Empty = new GetGtmDomainsDomain();

    /**
     * The contract&#39;s identifier, with which the domain is associated.
     * 
     */
    @Import(name="acgId", required=true)
    private String acgId;

    /**
     * @return The contract&#39;s identifier, with which the domain is associated.
     * 
     */
    public String acgId() {
        return this.acgId;
    }

    /**
     * &#39;PENDING&#39; when a change has been made but not yet propagated; &#39;COMPLETE&#39; when the last configuration change has propagated successfully; &#39;DENIED&#39; if the domain configuration failed validation; &#39;DELETED&#39; if the domain has been deleted.
     * 
     */
    @Import(name="activationState", required=true)
    private String activationState;

    /**
     * @return &#39;PENDING&#39; when a change has been made but not yet propagated; &#39;COMPLETE&#39; when the last configuration change has propagated successfully; &#39;DENIED&#39; if the domain configuration failed validation; &#39;DELETED&#39; if the domain has been deleted.
     * 
     */
    public String activationState() {
        return this.activationState;
    }

    /**
     * UUID that identifies a version of the domain configuration.
     * 
     */
    @Import(name="changeId", required=true)
    private String changeId;

    /**
     * @return UUID that identifies a version of the domain configuration.
     * 
     */
    public String changeId() {
        return this.changeId;
    }

    /**
     * UUID for delete request during domain deletion. Null if the domain is not being deleted.
     * 
     */
    @Import(name="deleteRequestId", required=true)
    private String deleteRequestId;

    /**
     * @return UUID for delete request during domain deletion. Null if the domain is not being deleted.
     * 
     */
    public String deleteRequestId() {
        return this.deleteRequestId;
    }

    /**
     * An ISO 8601 timestamp that indicates the time of the last domain change.
     * 
     */
    @Import(name="lastModified", required=true)
    private String lastModified;

    /**
     * @return An ISO 8601 timestamp that indicates the time of the last domain change.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * The email address of the administrator who made the last change to the domain.
     * 
     */
    @Import(name="lastModifiedBy", required=true)
    private String lastModifiedBy;

    /**
     * @return The email address of the administrator who made the last change to the domain.
     * 
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Provides a URL path that allows direct navigation to the domain.
     * 
     */
    @Import(name="links")
    private @Nullable List<GetGtmDomainsDomainLink> links;

    /**
     * @return Provides a URL path that allows direct navigation to the domain.
     * 
     */
    public Optional<List<GetGtmDomainsDomainLink>> links() {
        return Optional.ofNullable(this.links);
    }

    /**
     * A descriptive note about changes to the domain.
     * 
     */
    @Import(name="modificationComments", required=true)
    private String modificationComments;

    /**
     * @return A descriptive note about changes to the domain.
     * 
     */
    public String modificationComments() {
        return this.modificationComments;
    }

    /**
     * A unique domain name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return A unique domain name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * If set (true) we will sign the domain&#39;s resource records so that they can be validated by a validating resolver.
     * 
     */
    @Import(name="signAndServe", required=true)
    private Boolean signAndServe;

    /**
     * @return If set (true) we will sign the domain&#39;s resource records so that they can be validated by a validating resolver.
     * 
     */
    public Boolean signAndServe() {
        return this.signAndServe;
    }

    /**
     * The signing algorithm to use for signAndServe. One of the following values: RSA_SHA1, RSA_SHA256, RSA_SHA512, ECDSA_P256_SHA256, ECDSA_P384_SHA384, ED25519, ED448.
     * 
     */
    @Import(name="signAndServeAlgorithm", required=true)
    private String signAndServeAlgorithm;

    /**
     * @return The signing algorithm to use for signAndServe. One of the following values: RSA_SHA1, RSA_SHA256, RSA_SHA512, ECDSA_P256_SHA256, ECDSA_P384_SHA384, ED25519, ED448.
     * 
     */
    public String signAndServeAlgorithm() {
        return this.signAndServeAlgorithm;
    }

    /**
     * The current status of the domain.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The current status of the domain.
     * 
     */
    public String status() {
        return this.status;
    }

    private GetGtmDomainsDomain() {}

    private GetGtmDomainsDomain(GetGtmDomainsDomain $) {
        this.acgId = $.acgId;
        this.activationState = $.activationState;
        this.changeId = $.changeId;
        this.deleteRequestId = $.deleteRequestId;
        this.lastModified = $.lastModified;
        this.lastModifiedBy = $.lastModifiedBy;
        this.links = $.links;
        this.modificationComments = $.modificationComments;
        this.name = $.name;
        this.signAndServe = $.signAndServe;
        this.signAndServeAlgorithm = $.signAndServeAlgorithm;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDomainsDomain defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDomainsDomain $;

        public Builder() {
            $ = new GetGtmDomainsDomain();
        }

        public Builder(GetGtmDomainsDomain defaults) {
            $ = new GetGtmDomainsDomain(Objects.requireNonNull(defaults));
        }

        /**
         * @param acgId The contract&#39;s identifier, with which the domain is associated.
         * 
         * @return builder
         * 
         */
        public Builder acgId(String acgId) {
            $.acgId = acgId;
            return this;
        }

        /**
         * @param activationState &#39;PENDING&#39; when a change has been made but not yet propagated; &#39;COMPLETE&#39; when the last configuration change has propagated successfully; &#39;DENIED&#39; if the domain configuration failed validation; &#39;DELETED&#39; if the domain has been deleted.
         * 
         * @return builder
         * 
         */
        public Builder activationState(String activationState) {
            $.activationState = activationState;
            return this;
        }

        /**
         * @param changeId UUID that identifies a version of the domain configuration.
         * 
         * @return builder
         * 
         */
        public Builder changeId(String changeId) {
            $.changeId = changeId;
            return this;
        }

        /**
         * @param deleteRequestId UUID for delete request during domain deletion. Null if the domain is not being deleted.
         * 
         * @return builder
         * 
         */
        public Builder deleteRequestId(String deleteRequestId) {
            $.deleteRequestId = deleteRequestId;
            return this;
        }

        /**
         * @param lastModified An ISO 8601 timestamp that indicates the time of the last domain change.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(String lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        /**
         * @param lastModifiedBy The email address of the administrator who made the last change to the domain.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedBy(String lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        /**
         * @param links Provides a URL path that allows direct navigation to the domain.
         * 
         * @return builder
         * 
         */
        public Builder links(@Nullable List<GetGtmDomainsDomainLink> links) {
            $.links = links;
            return this;
        }

        /**
         * @param links Provides a URL path that allows direct navigation to the domain.
         * 
         * @return builder
         * 
         */
        public Builder links(GetGtmDomainsDomainLink... links) {
            return links(List.of(links));
        }

        /**
         * @param modificationComments A descriptive note about changes to the domain.
         * 
         * @return builder
         * 
         */
        public Builder modificationComments(String modificationComments) {
            $.modificationComments = modificationComments;
            return this;
        }

        /**
         * @param name A unique domain name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param signAndServe If set (true) we will sign the domain&#39;s resource records so that they can be validated by a validating resolver.
         * 
         * @return builder
         * 
         */
        public Builder signAndServe(Boolean signAndServe) {
            $.signAndServe = signAndServe;
            return this;
        }

        /**
         * @param signAndServeAlgorithm The signing algorithm to use for signAndServe. One of the following values: RSA_SHA1, RSA_SHA256, RSA_SHA512, ECDSA_P256_SHA256, ECDSA_P384_SHA384, ED25519, ED448.
         * 
         * @return builder
         * 
         */
        public Builder signAndServeAlgorithm(String signAndServeAlgorithm) {
            $.signAndServeAlgorithm = signAndServeAlgorithm;
            return this;
        }

        /**
         * @param status The current status of the domain.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public GetGtmDomainsDomain build() {
            if ($.acgId == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "acgId");
            }
            if ($.activationState == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "activationState");
            }
            if ($.changeId == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "changeId");
            }
            if ($.deleteRequestId == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "deleteRequestId");
            }
            if ($.lastModified == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "lastModified");
            }
            if ($.lastModifiedBy == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "lastModifiedBy");
            }
            if ($.modificationComments == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "modificationComments");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "name");
            }
            if ($.signAndServe == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "signAndServe");
            }
            if ($.signAndServeAlgorithm == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "signAndServeAlgorithm");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainsDomain", "status");
            }
            return $;
        }
    }

}
