// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanContentProtectionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanContentProtectionRuleArgs Empty = new BotmanContentProtectionRuleArgs();

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
     * The content protection rule
     * 
     */
    @Import(name="contentProtectionRule", required=true)
    private Output<String> contentProtectionRule;

    /**
     * @return The content protection rule
     * 
     */
    public Output<String> contentProtectionRule() {
        return this.contentProtectionRule;
    }

    /**
     * Unique identifier of the security policy
     * 
     */
    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private BotmanContentProtectionRuleArgs() {}

    private BotmanContentProtectionRuleArgs(BotmanContentProtectionRuleArgs $) {
        this.configId = $.configId;
        this.contentProtectionRule = $.contentProtectionRule;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanContentProtectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanContentProtectionRuleArgs $;

        public Builder() {
            $ = new BotmanContentProtectionRuleArgs();
        }

        public Builder(BotmanContentProtectionRuleArgs defaults) {
            $ = new BotmanContentProtectionRuleArgs(Objects.requireNonNull(defaults));
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
         * @param contentProtectionRule The content protection rule
         * 
         * @return builder
         * 
         */
        public Builder contentProtectionRule(Output<String> contentProtectionRule) {
            $.contentProtectionRule = contentProtectionRule;
            return this;
        }

        /**
         * @param contentProtectionRule The content protection rule
         * 
         * @return builder
         * 
         */
        public Builder contentProtectionRule(String contentProtectionRule) {
            return contentProtectionRule(Output.of(contentProtectionRule));
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(Output<String> securityPolicyId) {
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

        public BotmanContentProtectionRuleArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("BotmanContentProtectionRuleArgs", "configId");
            }
            if ($.contentProtectionRule == null) {
                throw new MissingRequiredPropertyException("BotmanContentProtectionRuleArgs", "contentProtectionRule");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("BotmanContentProtectionRuleArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
