// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetBotmanChallengeInterceptionRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanChallengeInterceptionRulesArgs Empty = new GetBotmanChallengeInterceptionRulesArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private GetBotmanChallengeInterceptionRulesArgs() {}

    private GetBotmanChallengeInterceptionRulesArgs(GetBotmanChallengeInterceptionRulesArgs $) {
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanChallengeInterceptionRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanChallengeInterceptionRulesArgs $;

        public Builder() {
            $ = new GetBotmanChallengeInterceptionRulesArgs();
        }

        public Builder(GetBotmanChallengeInterceptionRulesArgs defaults) {
            $ = new GetBotmanChallengeInterceptionRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public GetBotmanChallengeInterceptionRulesArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetBotmanChallengeInterceptionRulesArgs", "configId");
            }
            return $;
        }
    }

}
