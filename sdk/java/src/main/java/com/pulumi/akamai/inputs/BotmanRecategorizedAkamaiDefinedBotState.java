// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotmanRecategorizedAkamaiDefinedBotState extends com.pulumi.resources.ResourceArgs {

    public static final BotmanRecategorizedAkamaiDefinedBotState Empty = new BotmanRecategorizedAkamaiDefinedBotState();

    @Import(name="botId")
    private @Nullable Output<String> botId;

    public Optional<Output<String>> botId() {
        return Optional.ofNullable(this.botId);
    }

    @Import(name="categoryId")
    private @Nullable Output<String> categoryId;

    public Optional<Output<String>> categoryId() {
        return Optional.ofNullable(this.categoryId);
    }

    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    private BotmanRecategorizedAkamaiDefinedBotState() {}

    private BotmanRecategorizedAkamaiDefinedBotState(BotmanRecategorizedAkamaiDefinedBotState $) {
        this.botId = $.botId;
        this.categoryId = $.categoryId;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanRecategorizedAkamaiDefinedBotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanRecategorizedAkamaiDefinedBotState $;

        public Builder() {
            $ = new BotmanRecategorizedAkamaiDefinedBotState();
        }

        public Builder(BotmanRecategorizedAkamaiDefinedBotState defaults) {
            $ = new BotmanRecategorizedAkamaiDefinedBotState(Objects.requireNonNull(defaults));
        }

        public Builder botId(@Nullable Output<String> botId) {
            $.botId = botId;
            return this;
        }

        public Builder botId(String botId) {
            return botId(Output.of(botId));
        }

        public Builder categoryId(@Nullable Output<String> categoryId) {
            $.categoryId = categoryId;
            return this;
        }

        public Builder categoryId(String categoryId) {
            return categoryId(Output.of(categoryId));
        }

        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public BotmanRecategorizedAkamaiDefinedBotState build() {
            return $;
        }
    }

}
