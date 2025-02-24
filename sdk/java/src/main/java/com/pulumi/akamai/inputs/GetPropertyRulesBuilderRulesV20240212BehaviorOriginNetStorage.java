// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage Empty = new GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage();

    @Import(name="cpCode")
    private @Nullable Integer cpCode;

    public Optional<Integer> cpCode() {
        return Optional.ofNullable(this.cpCode);
    }

    @Import(name="downloadDomainName")
    private @Nullable String downloadDomainName;

    public Optional<String> downloadDomainName() {
        return Optional.ofNullable(this.downloadDomainName);
    }

    @Import(name="g2oToken")
    private @Nullable String g2oToken;

    public Optional<String> g2oToken() {
        return Optional.ofNullable(this.g2oToken);
    }

    private GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage() {}

    private GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage(GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage $) {
        this.cpCode = $.cpCode;
        this.downloadDomainName = $.downloadDomainName;
        this.g2oToken = $.g2oToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage(Objects.requireNonNull(defaults));
        }

        public Builder cpCode(@Nullable Integer cpCode) {
            $.cpCode = cpCode;
            return this;
        }

        public Builder downloadDomainName(@Nullable String downloadDomainName) {
            $.downloadDomainName = downloadDomainName;
            return this;
        }

        public Builder g2oToken(@Nullable String g2oToken) {
            $.g2oToken = g2oToken;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20240212BehaviorOriginNetStorage build() {
            return $;
        }
    }

}
