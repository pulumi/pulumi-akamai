// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppsecRapidRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppsecRapidRulesPlainArgs Empty = new GetAppsecRapidRulesPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="ruleId")
    private @Nullable Integer ruleId;

    public Optional<Integer> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppsecRapidRulesPlainArgs() {}

    private GetAppsecRapidRulesPlainArgs(GetAppsecRapidRulesPlainArgs $) {
        this.configId = $.configId;
        this.ruleId = $.ruleId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppsecRapidRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppsecRapidRulesPlainArgs $;

        public Builder() {
            $ = new GetAppsecRapidRulesPlainArgs();
        }

        public Builder(GetAppsecRapidRulesPlainArgs defaults) {
            $ = new GetAppsecRapidRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder ruleId(@Nullable Integer ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetAppsecRapidRulesPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppsecRapidRulesPlainArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppsecRapidRulesPlainArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
