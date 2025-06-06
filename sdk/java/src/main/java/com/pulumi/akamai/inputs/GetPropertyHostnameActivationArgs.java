// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyHostnameActivationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyHostnameActivationArgs Empty = new GetPropertyHostnameActivationArgs();

    @Import(name="contractId")
    private @Nullable Output<String> contractId;

    public Optional<Output<String>> contractId() {
        return Optional.ofNullable(this.contractId);
    }

    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="hostnameActivationId", required=true)
    private Output<String> hostnameActivationId;

    public Output<String> hostnameActivationId() {
        return this.hostnameActivationId;
    }

    @Import(name="includeHostnames")
    private @Nullable Output<Boolean> includeHostnames;

    public Optional<Output<Boolean>> includeHostnames() {
        return Optional.ofNullable(this.includeHostnames);
    }

    @Import(name="propertyId", required=true)
    private Output<String> propertyId;

    public Output<String> propertyId() {
        return this.propertyId;
    }

    private GetPropertyHostnameActivationArgs() {}

    private GetPropertyHostnameActivationArgs(GetPropertyHostnameActivationArgs $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.hostnameActivationId = $.hostnameActivationId;
        this.includeHostnames = $.includeHostnames;
        this.propertyId = $.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyHostnameActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyHostnameActivationArgs $;

        public Builder() {
            $ = new GetPropertyHostnameActivationArgs();
        }

        public Builder(GetPropertyHostnameActivationArgs defaults) {
            $ = new GetPropertyHostnameActivationArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(@Nullable Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder hostnameActivationId(Output<String> hostnameActivationId) {
            $.hostnameActivationId = hostnameActivationId;
            return this;
        }

        public Builder hostnameActivationId(String hostnameActivationId) {
            return hostnameActivationId(Output.of(hostnameActivationId));
        }

        public Builder includeHostnames(@Nullable Output<Boolean> includeHostnames) {
            $.includeHostnames = includeHostnames;
            return this;
        }

        public Builder includeHostnames(Boolean includeHostnames) {
            return includeHostnames(Output.of(includeHostnames));
        }

        public Builder propertyId(Output<String> propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public Builder propertyId(String propertyId) {
            return propertyId(Output.of(propertyId));
        }

        public GetPropertyHostnameActivationArgs build() {
            if ($.hostnameActivationId == null) {
                throw new MissingRequiredPropertyException("GetPropertyHostnameActivationArgs", "hostnameActivationId");
            }
            if ($.propertyId == null) {
                throw new MissingRequiredPropertyException("GetPropertyHostnameActivationArgs", "propertyId");
            }
            return $;
        }
    }

}
