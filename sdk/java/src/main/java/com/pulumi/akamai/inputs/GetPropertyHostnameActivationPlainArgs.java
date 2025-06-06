// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyHostnameActivationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyHostnameActivationPlainArgs Empty = new GetPropertyHostnameActivationPlainArgs();

    @Import(name="contractId")
    private @Nullable String contractId;

    public Optional<String> contractId() {
        return Optional.ofNullable(this.contractId);
    }

    @Import(name="groupId")
    private @Nullable String groupId;

    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="hostnameActivationId", required=true)
    private String hostnameActivationId;

    public String hostnameActivationId() {
        return this.hostnameActivationId;
    }

    @Import(name="includeHostnames")
    private @Nullable Boolean includeHostnames;

    public Optional<Boolean> includeHostnames() {
        return Optional.ofNullable(this.includeHostnames);
    }

    @Import(name="propertyId", required=true)
    private String propertyId;

    public String propertyId() {
        return this.propertyId;
    }

    private GetPropertyHostnameActivationPlainArgs() {}

    private GetPropertyHostnameActivationPlainArgs(GetPropertyHostnameActivationPlainArgs $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.hostnameActivationId = $.hostnameActivationId;
        this.includeHostnames = $.includeHostnames;
        this.propertyId = $.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyHostnameActivationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyHostnameActivationPlainArgs $;

        public Builder() {
            $ = new GetPropertyHostnameActivationPlainArgs();
        }

        public Builder(GetPropertyHostnameActivationPlainArgs defaults) {
            $ = new GetPropertyHostnameActivationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(@Nullable String contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder groupId(@Nullable String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder hostnameActivationId(String hostnameActivationId) {
            $.hostnameActivationId = hostnameActivationId;
            return this;
        }

        public Builder includeHostnames(@Nullable Boolean includeHostnames) {
            $.includeHostnames = includeHostnames;
            return this;
        }

        public Builder propertyId(String propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public GetPropertyHostnameActivationPlainArgs build() {
            if ($.hostnameActivationId == null) {
                throw new MissingRequiredPropertyException("GetPropertyHostnameActivationPlainArgs", "hostnameActivationId");
            }
            if ($.propertyId == null) {
                throw new MissingRequiredPropertyException("GetPropertyHostnameActivationPlainArgs", "propertyId");
            }
            return $;
        }
    }

}
