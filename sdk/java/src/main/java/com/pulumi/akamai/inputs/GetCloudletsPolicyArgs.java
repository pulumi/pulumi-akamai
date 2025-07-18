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


public final class GetCloudletsPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsPolicyArgs Empty = new GetCloudletsPolicyArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="policyId")
    private @Nullable Output<Integer> policyId;

    public Optional<Output<Integer>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetCloudletsPolicyArgs() {}

    private GetCloudletsPolicyArgs(GetCloudletsPolicyArgs $) {
        this.name = $.name;
        this.policyId = $.policyId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsPolicyArgs $;

        public Builder() {
            $ = new GetCloudletsPolicyArgs();
        }

        public Builder(GetCloudletsPolicyArgs defaults) {
            $ = new GetCloudletsPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policyId(@Nullable Output<Integer> policyId) {
            $.policyId = policyId;
            return this;
        }

        public Builder policyId(Integer policyId) {
            return policyId(Output.of(policyId));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetCloudletsPolicyArgs build() {
            return $;
        }
    }

}
