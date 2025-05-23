// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppsecAapSelectedHostnamesState extends com.pulumi.resources.ResourceArgs {

    public static final AppsecAapSelectedHostnamesState Empty = new AppsecAapSelectedHostnamesState();

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
     * List of hostnames to be evaluated
     * 
     */
    @Import(name="evaluatedHosts")
    private @Nullable Output<List<String>> evaluatedHosts;

    /**
     * @return List of hostnames to be evaluated
     * 
     */
    public Optional<Output<List<String>>> evaluatedHosts() {
        return Optional.ofNullable(this.evaluatedHosts);
    }

    /**
     * List of hostnames to be protected
     * 
     */
    @Import(name="protectedHosts")
    private @Nullable Output<List<String>> protectedHosts;

    /**
     * @return List of hostnames to be protected
     * 
     */
    public Optional<Output<List<String>>> protectedHosts() {
        return Optional.ofNullable(this.protectedHosts);
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

    private AppsecAapSelectedHostnamesState() {}

    private AppsecAapSelectedHostnamesState(AppsecAapSelectedHostnamesState $) {
        this.configId = $.configId;
        this.evaluatedHosts = $.evaluatedHosts;
        this.protectedHosts = $.protectedHosts;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecAapSelectedHostnamesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecAapSelectedHostnamesState $;

        public Builder() {
            $ = new AppsecAapSelectedHostnamesState();
        }

        public Builder(AppsecAapSelectedHostnamesState defaults) {
            $ = new AppsecAapSelectedHostnamesState(Objects.requireNonNull(defaults));
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
         * @param evaluatedHosts List of hostnames to be evaluated
         * 
         * @return builder
         * 
         */
        public Builder evaluatedHosts(@Nullable Output<List<String>> evaluatedHosts) {
            $.evaluatedHosts = evaluatedHosts;
            return this;
        }

        /**
         * @param evaluatedHosts List of hostnames to be evaluated
         * 
         * @return builder
         * 
         */
        public Builder evaluatedHosts(List<String> evaluatedHosts) {
            return evaluatedHosts(Output.of(evaluatedHosts));
        }

        /**
         * @param evaluatedHosts List of hostnames to be evaluated
         * 
         * @return builder
         * 
         */
        public Builder evaluatedHosts(String... evaluatedHosts) {
            return evaluatedHosts(List.of(evaluatedHosts));
        }

        /**
         * @param protectedHosts List of hostnames to be protected
         * 
         * @return builder
         * 
         */
        public Builder protectedHosts(@Nullable Output<List<String>> protectedHosts) {
            $.protectedHosts = protectedHosts;
            return this;
        }

        /**
         * @param protectedHosts List of hostnames to be protected
         * 
         * @return builder
         * 
         */
        public Builder protectedHosts(List<String> protectedHosts) {
            return protectedHosts(Output.of(protectedHosts));
        }

        /**
         * @param protectedHosts List of hostnames to be protected
         * 
         * @return builder
         * 
         */
        public Builder protectedHosts(String... protectedHosts) {
            return protectedHosts(List.of(protectedHosts));
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

        public AppsecAapSelectedHostnamesState build() {
            return $;
        }
    }

}
