// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImagingPolicyVideoState extends com.pulumi.resources.ResourceArgs {

    public static final ImagingPolicyVideoState Empty = new ImagingPolicyVideoState();

    /**
     * With this flag set to false, the user can perform modifications on staging without affecting the version already saved
     * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
     * it back to false only when there are any changes to the policy qualifying it for the new version.
     * 
     */
    @Import(name="activateOnProduction")
    private @Nullable Output<Boolean> activateOnProduction;

    /**
     * @return With this flag set to false, the user can perform modifications on staging without affecting the version already saved
     * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
     * it back to false only when there are any changes to the policy qualifying it for the new version.
     * 
     */
    public Optional<Output<Boolean>> activateOnProduction() {
        return Optional.ofNullable(this.activateOnProduction);
    }

    /**
     * Unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    @Import(name="contractId")
    private @Nullable Output<String> contractId;

    /**
     * @return Unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    public Optional<Output<String>> contractId() {
        return Optional.ofNullable(this.contractId);
    }

    /**
     * A JSON encoded policy
     * 
     */
    @Import(name="json")
    private @Nullable Output<String> json;

    /**
     * @return A JSON encoded policy
     * 
     */
    public Optional<Output<String>> json() {
        return Optional.ofNullable(this.json);
    }

    /**
     * Unique identifier for a Policy. It is not possible to modify the id of the policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return Unique identifier for a Policy. It is not possible to modify the id of the policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * Unique identifier for the Image &amp; Video Manager Policy Set.
     * 
     */
    @Import(name="policysetId")
    private @Nullable Output<String> policysetId;

    /**
     * @return Unique identifier for the Image &amp; Video Manager Policy Set.
     * 
     */
    public Optional<Output<String>> policysetId() {
        return Optional.ofNullable(this.policysetId);
    }

    /**
     * The version number of this policy version
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version number of this policy version
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ImagingPolicyVideoState() {}

    private ImagingPolicyVideoState(ImagingPolicyVideoState $) {
        this.activateOnProduction = $.activateOnProduction;
        this.contractId = $.contractId;
        this.json = $.json;
        this.policyId = $.policyId;
        this.policysetId = $.policysetId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImagingPolicyVideoState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImagingPolicyVideoState $;

        public Builder() {
            $ = new ImagingPolicyVideoState();
        }

        public Builder(ImagingPolicyVideoState defaults) {
            $ = new ImagingPolicyVideoState(Objects.requireNonNull(defaults));
        }

        /**
         * @param activateOnProduction With this flag set to false, the user can perform modifications on staging without affecting the version already saved
         * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
         * it back to false only when there are any changes to the policy qualifying it for the new version.
         * 
         * @return builder
         * 
         */
        public Builder activateOnProduction(@Nullable Output<Boolean> activateOnProduction) {
            $.activateOnProduction = activateOnProduction;
            return this;
        }

        /**
         * @param activateOnProduction With this flag set to false, the user can perform modifications on staging without affecting the version already saved
         * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
         * it back to false only when there are any changes to the policy qualifying it for the new version.
         * 
         * @return builder
         * 
         */
        public Builder activateOnProduction(Boolean activateOnProduction) {
            return activateOnProduction(Output.of(activateOnProduction));
        }

        /**
         * @param contractId Unique identifier for the Akamai Contract containing the Policy Set(s)
         * 
         * @return builder
         * 
         */
        public Builder contractId(@Nullable Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param contractId Unique identifier for the Akamai Contract containing the Policy Set(s)
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        /**
         * @param json A JSON encoded policy
         * 
         * @return builder
         * 
         */
        public Builder json(@Nullable Output<String> json) {
            $.json = json;
            return this;
        }

        /**
         * @param json A JSON encoded policy
         * 
         * @return builder
         * 
         */
        public Builder json(String json) {
            return json(Output.of(json));
        }

        /**
         * @param policyId Unique identifier for a Policy. It is not possible to modify the id of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId Unique identifier for a Policy. It is not possible to modify the id of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param policysetId Unique identifier for the Image &amp; Video Manager Policy Set.
         * 
         * @return builder
         * 
         */
        public Builder policysetId(@Nullable Output<String> policysetId) {
            $.policysetId = policysetId;
            return this;
        }

        /**
         * @param policysetId Unique identifier for the Image &amp; Video Manager Policy Set.
         * 
         * @return builder
         * 
         */
        public Builder policysetId(String policysetId) {
            return policysetId(Output.of(policysetId));
        }

        /**
         * @param version The version number of this policy version
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version number of this policy version
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ImagingPolicyVideoState build() {
            return $;
        }
    }

}
