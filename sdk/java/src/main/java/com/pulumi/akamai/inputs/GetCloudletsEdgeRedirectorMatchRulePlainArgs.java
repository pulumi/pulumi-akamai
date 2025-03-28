// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsEdgeRedirectorMatchRuleMatchRule;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsEdgeRedirectorMatchRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsEdgeRedirectorMatchRulePlainArgs Empty = new GetCloudletsEdgeRedirectorMatchRulePlainArgs();

    @Import(name="matchRules")
    private @Nullable List<GetCloudletsEdgeRedirectorMatchRuleMatchRule> matchRules;

    public Optional<List<GetCloudletsEdgeRedirectorMatchRuleMatchRule>> matchRules() {
        return Optional.ofNullable(this.matchRules);
    }

    private GetCloudletsEdgeRedirectorMatchRulePlainArgs() {}

    private GetCloudletsEdgeRedirectorMatchRulePlainArgs(GetCloudletsEdgeRedirectorMatchRulePlainArgs $) {
        this.matchRules = $.matchRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsEdgeRedirectorMatchRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsEdgeRedirectorMatchRulePlainArgs $;

        public Builder() {
            $ = new GetCloudletsEdgeRedirectorMatchRulePlainArgs();
        }

        public Builder(GetCloudletsEdgeRedirectorMatchRulePlainArgs defaults) {
            $ = new GetCloudletsEdgeRedirectorMatchRulePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder matchRules(@Nullable List<GetCloudletsEdgeRedirectorMatchRuleMatchRule> matchRules) {
            $.matchRules = matchRules;
            return this;
        }

        public Builder matchRules(GetCloudletsEdgeRedirectorMatchRuleMatchRule... matchRules) {
            return matchRules(List.of(matchRules));
        }

        public GetCloudletsEdgeRedirectorMatchRulePlainArgs build() {
            return $;
        }
    }

}
