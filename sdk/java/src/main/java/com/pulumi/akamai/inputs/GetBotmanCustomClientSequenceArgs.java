// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetBotmanCustomClientSequenceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanCustomClientSequenceArgs Empty = new GetBotmanCustomClientSequenceArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private GetBotmanCustomClientSequenceArgs() {}

    private GetBotmanCustomClientSequenceArgs(GetBotmanCustomClientSequenceArgs $) {
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanCustomClientSequenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanCustomClientSequenceArgs $;

        public Builder() {
            $ = new GetBotmanCustomClientSequenceArgs();
        }

        public Builder(GetBotmanCustomClientSequenceArgs defaults) {
            $ = new GetBotmanCustomClientSequenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public GetBotmanCustomClientSequenceArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetBotmanCustomClientSequenceArgs", "configId");
            }
            return $;
        }
    }

}
