// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCloudaccessKeyVersionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudaccessKeyVersionsPlainArgs Empty = new GetCloudaccessKeyVersionsPlainArgs();

    @Import(name="accessKeyName", required=true)
    private String accessKeyName;

    public String accessKeyName() {
        return this.accessKeyName;
    }

    private GetCloudaccessKeyVersionsPlainArgs() {}

    private GetCloudaccessKeyVersionsPlainArgs(GetCloudaccessKeyVersionsPlainArgs $) {
        this.accessKeyName = $.accessKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudaccessKeyVersionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudaccessKeyVersionsPlainArgs $;

        public Builder() {
            $ = new GetCloudaccessKeyVersionsPlainArgs();
        }

        public Builder(GetCloudaccessKeyVersionsPlainArgs defaults) {
            $ = new GetCloudaccessKeyVersionsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKeyName(String accessKeyName) {
            $.accessKeyName = accessKeyName;
            return this;
        }

        public GetCloudaccessKeyVersionsPlainArgs build() {
            if ($.accessKeyName == null) {
                throw new MissingRequiredPropertyException("GetCloudaccessKeyVersionsPlainArgs", "accessKeyName");
            }
            return $;
        }
    }

}
