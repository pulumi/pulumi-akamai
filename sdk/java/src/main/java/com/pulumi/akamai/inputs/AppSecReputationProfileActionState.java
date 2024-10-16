// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecReputationProfileActionState extends com.pulumi.resources.ResourceArgs {

    public static final AppSecReputationProfileActionState Empty = new AppSecReputationProfileActionState();

    /**
     * Action to be taken when the reputation profile is triggered
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Action to be taken when the reputation profile is triggered
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Unique identifier of the reputation profile
     * 
     */
    @Import(name="reputationProfileId")
    private @Nullable Output<Integer> reputationProfileId;

    /**
     * @return Unique identifier of the reputation profile
     * 
     */
    public Optional<Output<Integer>> reputationProfileId() {
        return Optional.ofNullable(this.reputationProfileId);
    }

    /**
     * Unique identifier of the security policy
     * 
     */
    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    private AppSecReputationProfileActionState() {}

    private AppSecReputationProfileActionState(AppSecReputationProfileActionState $) {
        this.action = $.action;
        this.configId = $.configId;
        this.reputationProfileId = $.reputationProfileId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecReputationProfileActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecReputationProfileActionState $;

        public Builder() {
            $ = new AppSecReputationProfileActionState();
        }

        public Builder(AppSecReputationProfileActionState defaults) {
            $ = new AppSecReputationProfileActionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to be taken when the reputation profile is triggered
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to be taken when the reputation profile is triggered
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param reputationProfileId Unique identifier of the reputation profile
         * 
         * @return builder
         * 
         */
        public Builder reputationProfileId(@Nullable Output<Integer> reputationProfileId) {
            $.reputationProfileId = reputationProfileId;
            return this;
        }

        /**
         * @param reputationProfileId Unique identifier of the reputation profile
         * 
         * @return builder
         * 
         */
        public Builder reputationProfileId(Integer reputationProfileId) {
            return reputationProfileId(Output.of(reputationProfileId));
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public AppSecReputationProfileActionState build() {
            return $;
        }
    }

}
