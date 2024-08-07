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


public final class BotmanBotDetectionActionState extends com.pulumi.resources.ResourceArgs {

    public static final BotmanBotDetectionActionState Empty = new BotmanBotDetectionActionState();

    @Import(name="botDetectionAction")
    private @Nullable Output<String> botDetectionAction;

    public Optional<Output<String>> botDetectionAction() {
        return Optional.ofNullable(this.botDetectionAction);
    }

    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    @Import(name="detectionId")
    private @Nullable Output<String> detectionId;

    public Optional<Output<String>> detectionId() {
        return Optional.ofNullable(this.detectionId);
    }

    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    private BotmanBotDetectionActionState() {}

    private BotmanBotDetectionActionState(BotmanBotDetectionActionState $) {
        this.botDetectionAction = $.botDetectionAction;
        this.configId = $.configId;
        this.detectionId = $.detectionId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanBotDetectionActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanBotDetectionActionState $;

        public Builder() {
            $ = new BotmanBotDetectionActionState();
        }

        public Builder(BotmanBotDetectionActionState defaults) {
            $ = new BotmanBotDetectionActionState(Objects.requireNonNull(defaults));
        }

        public Builder botDetectionAction(@Nullable Output<String> botDetectionAction) {
            $.botDetectionAction = botDetectionAction;
            return this;
        }

        public Builder botDetectionAction(String botDetectionAction) {
            return botDetectionAction(Output.of(botDetectionAction));
        }

        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder detectionId(@Nullable Output<String> detectionId) {
            $.detectionId = detectionId;
            return this;
        }

        public Builder detectionId(String detectionId) {
            return detectionId(Output.of(detectionId));
        }

        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public BotmanBotDetectionActionState build() {
            return $;
        }
    }

}
