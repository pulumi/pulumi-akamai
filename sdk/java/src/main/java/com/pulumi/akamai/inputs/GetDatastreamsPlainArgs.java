// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatastreamsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatastreamsPlainArgs Empty = new GetDatastreamsPlainArgs();

    @Import(name="groupId")
    private @Nullable Integer groupId;

    public Optional<Integer> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    private GetDatastreamsPlainArgs() {}

    private GetDatastreamsPlainArgs(GetDatastreamsPlainArgs $) {
        this.groupId = $.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatastreamsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatastreamsPlainArgs $;

        public Builder() {
            $ = new GetDatastreamsPlainArgs();
        }

        public Builder(GetDatastreamsPlainArgs defaults) {
            $ = new GetDatastreamsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupId(@Nullable Integer groupId) {
            $.groupId = groupId;
            return this;
        }

        public GetDatastreamsPlainArgs build() {
            return $;
        }
    }

}
