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


public final class GetBotmanCustomDefinedBotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanCustomDefinedBotPlainArgs Empty = new GetBotmanCustomDefinedBotPlainArgs();

    @Import(name="botId")
    private @Nullable String botId;

    public Optional<String> botId() {
        return Optional.ofNullable(this.botId);
    }

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    private GetBotmanCustomDefinedBotPlainArgs() {}

    private GetBotmanCustomDefinedBotPlainArgs(GetBotmanCustomDefinedBotPlainArgs $) {
        this.botId = $.botId;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanCustomDefinedBotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanCustomDefinedBotPlainArgs $;

        public Builder() {
            $ = new GetBotmanCustomDefinedBotPlainArgs();
        }

        public Builder(GetBotmanCustomDefinedBotPlainArgs defaults) {
            $ = new GetBotmanCustomDefinedBotPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder botId(@Nullable String botId) {
            $.botId = botId;
            return this;
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public GetBotmanCustomDefinedBotPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetBotmanCustomDefinedBotPlainArgs", "configId");
            }
            return $;
        }
    }

}
