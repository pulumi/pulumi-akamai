// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyHostnameActivationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyHostnameActivationsPlainArgs Empty = new GetPropertyHostnameActivationsPlainArgs();

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

    @Import(name="network")
    private @Nullable String network;

    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="propertyId", required=true)
    private String propertyId;

    public String propertyId() {
        return this.propertyId;
    }

    private GetPropertyHostnameActivationsPlainArgs() {}

    private GetPropertyHostnameActivationsPlainArgs(GetPropertyHostnameActivationsPlainArgs $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.network = $.network;
        this.propertyId = $.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyHostnameActivationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyHostnameActivationsPlainArgs $;

        public Builder() {
            $ = new GetPropertyHostnameActivationsPlainArgs();
        }

        public Builder(GetPropertyHostnameActivationsPlainArgs defaults) {
            $ = new GetPropertyHostnameActivationsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(@Nullable String contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder groupId(@Nullable String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder network(@Nullable String network) {
            $.network = network;
            return this;
        }

        public Builder propertyId(String propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public GetPropertyHostnameActivationsPlainArgs build() {
            if ($.propertyId == null) {
                throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsPlainArgs", "propertyId");
            }
            return $;
        }
    }

}
