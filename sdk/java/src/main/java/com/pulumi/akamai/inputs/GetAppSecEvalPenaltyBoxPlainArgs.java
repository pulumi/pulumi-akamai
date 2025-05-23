// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppSecEvalPenaltyBoxPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecEvalPenaltyBoxPlainArgs Empty = new GetAppSecEvalPenaltyBoxPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecEvalPenaltyBoxPlainArgs() {}

    private GetAppSecEvalPenaltyBoxPlainArgs(GetAppSecEvalPenaltyBoxPlainArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecEvalPenaltyBoxPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecEvalPenaltyBoxPlainArgs $;

        public Builder() {
            $ = new GetAppSecEvalPenaltyBoxPlainArgs();
        }

        public Builder(GetAppSecEvalPenaltyBoxPlainArgs defaults) {
            $ = new GetAppSecEvalPenaltyBoxPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetAppSecEvalPenaltyBoxPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalPenaltyBoxPlainArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppSecEvalPenaltyBoxPlainArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
