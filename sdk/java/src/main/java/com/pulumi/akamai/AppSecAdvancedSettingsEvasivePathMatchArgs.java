// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecAdvancedSettingsEvasivePathMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSecAdvancedSettingsEvasivePathMatchArgs Empty = new AppSecAdvancedSettingsEvasivePathMatchArgs();

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * Whether to enable the evasive path match setting
     * 
     */
    @Import(name="enablePathMatch", required=true)
    private Output<Boolean> enablePathMatch;

    /**
     * @return Whether to enable the evasive path match setting
     * 
     */
    public Output<Boolean> enablePathMatch() {
        return this.enablePathMatch;
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

    private AppSecAdvancedSettingsEvasivePathMatchArgs() {}

    private AppSecAdvancedSettingsEvasivePathMatchArgs(AppSecAdvancedSettingsEvasivePathMatchArgs $) {
        this.configId = $.configId;
        this.enablePathMatch = $.enablePathMatch;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecAdvancedSettingsEvasivePathMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecAdvancedSettingsEvasivePathMatchArgs $;

        public Builder() {
            $ = new AppSecAdvancedSettingsEvasivePathMatchArgs();
        }

        public Builder(AppSecAdvancedSettingsEvasivePathMatchArgs defaults) {
            $ = new AppSecAdvancedSettingsEvasivePathMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
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
         * @param enablePathMatch Whether to enable the evasive path match setting
         * 
         * @return builder
         * 
         */
        public Builder enablePathMatch(Output<Boolean> enablePathMatch) {
            $.enablePathMatch = enablePathMatch;
            return this;
        }

        /**
         * @param enablePathMatch Whether to enable the evasive path match setting
         * 
         * @return builder
         * 
         */
        public Builder enablePathMatch(Boolean enablePathMatch) {
            return enablePathMatch(Output.of(enablePathMatch));
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

        public AppSecAdvancedSettingsEvasivePathMatchArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("AppSecAdvancedSettingsEvasivePathMatchArgs", "configId");
            }
            if ($.enablePathMatch == null) {
                throw new MissingRequiredPropertyException("AppSecAdvancedSettingsEvasivePathMatchArgs", "enablePathMatch");
            }
            return $;
        }
    }

}
