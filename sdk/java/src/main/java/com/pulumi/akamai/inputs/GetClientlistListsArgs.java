// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientlistListsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientlistListsArgs Empty = new GetClientlistListsArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="types")
    private @Nullable Output<List<String>> types;

    public Optional<Output<List<String>>> types() {
        return Optional.ofNullable(this.types);
    }

    private GetClientlistListsArgs() {}

    private GetClientlistListsArgs(GetClientlistListsArgs $) {
        this.name = $.name;
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientlistListsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientlistListsArgs $;

        public Builder() {
            $ = new GetClientlistListsArgs();
        }

        public Builder(GetClientlistListsArgs defaults) {
            $ = new GetClientlistListsArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder types(@Nullable Output<List<String>> types) {
            $.types = types;
            return this;
        }

        public Builder types(List<String> types) {
            return types(Output.of(types));
        }

        public Builder types(String... types) {
            return types(List.of(types));
        }

        public GetClientlistListsArgs build() {
            return $;
        }
    }

}
