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


public final class BotmanCustomDenyActionState extends com.pulumi.resources.ResourceArgs {

    public static final BotmanCustomDenyActionState Empty = new BotmanCustomDenyActionState();

    @Import(name="actionId")
    private @Nullable Output<String> actionId;

    public Optional<Output<String>> actionId() {
        return Optional.ofNullable(this.actionId);
    }

    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    @Import(name="customDenyAction")
    private @Nullable Output<String> customDenyAction;

    public Optional<Output<String>> customDenyAction() {
        return Optional.ofNullable(this.customDenyAction);
    }

    private BotmanCustomDenyActionState() {}

    private BotmanCustomDenyActionState(BotmanCustomDenyActionState $) {
        this.actionId = $.actionId;
        this.configId = $.configId;
        this.customDenyAction = $.customDenyAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanCustomDenyActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanCustomDenyActionState $;

        public Builder() {
            $ = new BotmanCustomDenyActionState();
        }

        public Builder(BotmanCustomDenyActionState defaults) {
            $ = new BotmanCustomDenyActionState(Objects.requireNonNull(defaults));
        }

        public Builder actionId(@Nullable Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder customDenyAction(@Nullable Output<String> customDenyAction) {
            $.customDenyAction = customDenyAction;
            return this;
        }

        public Builder customDenyAction(String customDenyAction) {
            return customDenyAction(Output.of(customDenyAction));
        }

        public BotmanCustomDenyActionState build() {
            return $;
        }
    }

}
