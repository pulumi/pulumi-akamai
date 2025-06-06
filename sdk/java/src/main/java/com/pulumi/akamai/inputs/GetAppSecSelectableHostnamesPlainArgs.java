// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecSelectableHostnamesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecSelectableHostnamesPlainArgs Empty = new GetAppSecSelectableHostnamesPlainArgs();

    @Import(name="activeInProduction")
    private @Nullable Boolean activeInProduction;

    public Optional<Boolean> activeInProduction() {
        return Optional.ofNullable(this.activeInProduction);
    }

    @Import(name="activeInStaging")
    private @Nullable Boolean activeInStaging;

    public Optional<Boolean> activeInStaging() {
        return Optional.ofNullable(this.activeInStaging);
    }

    @Import(name="configId")
    private @Nullable Integer configId;

    public Optional<Integer> configId() {
        return Optional.ofNullable(this.configId);
    }

    @Import(name="contractid")
    private @Nullable String contractid;

    public Optional<String> contractid() {
        return Optional.ofNullable(this.contractid);
    }

    @Import(name="groupid")
    private @Nullable Integer groupid;

    public Optional<Integer> groupid() {
        return Optional.ofNullable(this.groupid);
    }

    private GetAppSecSelectableHostnamesPlainArgs() {}

    private GetAppSecSelectableHostnamesPlainArgs(GetAppSecSelectableHostnamesPlainArgs $) {
        this.activeInProduction = $.activeInProduction;
        this.activeInStaging = $.activeInStaging;
        this.configId = $.configId;
        this.contractid = $.contractid;
        this.groupid = $.groupid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecSelectableHostnamesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecSelectableHostnamesPlainArgs $;

        public Builder() {
            $ = new GetAppSecSelectableHostnamesPlainArgs();
        }

        public Builder(GetAppSecSelectableHostnamesPlainArgs defaults) {
            $ = new GetAppSecSelectableHostnamesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder activeInProduction(@Nullable Boolean activeInProduction) {
            $.activeInProduction = activeInProduction;
            return this;
        }

        public Builder activeInStaging(@Nullable Boolean activeInStaging) {
            $.activeInStaging = activeInStaging;
            return this;
        }

        public Builder configId(@Nullable Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder contractid(@Nullable String contractid) {
            $.contractid = contractid;
            return this;
        }

        public Builder groupid(@Nullable Integer groupid) {
            $.groupid = groupid;
            return this;
        }

        public GetAppSecSelectableHostnamesPlainArgs build() {
            return $;
        }
    }

}
