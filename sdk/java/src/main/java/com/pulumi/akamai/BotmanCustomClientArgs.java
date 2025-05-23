// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanCustomClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanCustomClientArgs Empty = new BotmanCustomClientArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="customClient", required=true)
    private Output<String> customClient;

    public Output<String> customClient() {
        return this.customClient;
    }

    private BotmanCustomClientArgs() {}

    private BotmanCustomClientArgs(BotmanCustomClientArgs $) {
        this.configId = $.configId;
        this.customClient = $.customClient;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanCustomClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanCustomClientArgs $;

        public Builder() {
            $ = new BotmanCustomClientArgs();
        }

        public Builder(BotmanCustomClientArgs defaults) {
            $ = new BotmanCustomClientArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder customClient(Output<String> customClient) {
            $.customClient = customClient;
            return this;
        }

        public Builder customClient(String customClient) {
            return customClient(Output.of(customClient));
        }

        public BotmanCustomClientArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("BotmanCustomClientArgs", "configId");
            }
            if ($.customClient == null) {
                throw new MissingRequiredPropertyException("BotmanCustomClientArgs", "customClient");
            }
            return $;
        }
    }

}
