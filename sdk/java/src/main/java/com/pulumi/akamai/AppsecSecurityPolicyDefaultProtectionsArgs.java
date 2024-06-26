// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AppsecSecurityPolicyDefaultProtectionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppsecSecurityPolicyDefaultProtectionsArgs Empty = new AppsecSecurityPolicyDefaultProtectionsArgs();

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
     * Name of the new security policy
     * 
     */
    @Import(name="securityPolicyName", required=true)
    private Output<String> securityPolicyName;

    /**
     * @return Name of the new security policy
     * 
     */
    public Output<String> securityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * Four-character alphanumeric string prefix used in creating the security policy ID
     * 
     */
    @Import(name="securityPolicyPrefix", required=true)
    private Output<String> securityPolicyPrefix;

    /**
     * @return Four-character alphanumeric string prefix used in creating the security policy ID
     * 
     */
    public Output<String> securityPolicyPrefix() {
        return this.securityPolicyPrefix;
    }

    private AppsecSecurityPolicyDefaultProtectionsArgs() {}

    private AppsecSecurityPolicyDefaultProtectionsArgs(AppsecSecurityPolicyDefaultProtectionsArgs $) {
        this.configId = $.configId;
        this.securityPolicyName = $.securityPolicyName;
        this.securityPolicyPrefix = $.securityPolicyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppsecSecurityPolicyDefaultProtectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppsecSecurityPolicyDefaultProtectionsArgs $;

        public Builder() {
            $ = new AppsecSecurityPolicyDefaultProtectionsArgs();
        }

        public Builder(AppsecSecurityPolicyDefaultProtectionsArgs defaults) {
            $ = new AppsecSecurityPolicyDefaultProtectionsArgs(Objects.requireNonNull(defaults));
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
         * @param securityPolicyName Name of the new security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyName(Output<String> securityPolicyName) {
            $.securityPolicyName = securityPolicyName;
            return this;
        }

        /**
         * @param securityPolicyName Name of the new security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyName(String securityPolicyName) {
            return securityPolicyName(Output.of(securityPolicyName));
        }

        /**
         * @param securityPolicyPrefix Four-character alphanumeric string prefix used in creating the security policy ID
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyPrefix(Output<String> securityPolicyPrefix) {
            $.securityPolicyPrefix = securityPolicyPrefix;
            return this;
        }

        /**
         * @param securityPolicyPrefix Four-character alphanumeric string prefix used in creating the security policy ID
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyPrefix(String securityPolicyPrefix) {
            return securityPolicyPrefix(Output.of(securityPolicyPrefix));
        }

        public AppsecSecurityPolicyDefaultProtectionsArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("AppsecSecurityPolicyDefaultProtectionsArgs", "configId");
            }
            if ($.securityPolicyName == null) {
                throw new MissingRequiredPropertyException("AppsecSecurityPolicyDefaultProtectionsArgs", "securityPolicyName");
            }
            if ($.securityPolicyPrefix == null) {
                throw new MissingRequiredPropertyException("AppsecSecurityPolicyDefaultProtectionsArgs", "securityPolicyPrefix");
            }
            return $;
        }
    }

}
