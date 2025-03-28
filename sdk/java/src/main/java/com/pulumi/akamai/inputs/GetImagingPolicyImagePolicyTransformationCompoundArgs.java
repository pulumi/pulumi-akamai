// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationCompoundArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationCompoundArgs Empty = new GetImagingPolicyImagePolicyTransformationCompoundArgs();

    @Import(name="transformations")
    private @Nullable Output<List<GetImagingPolicyImagePolicyTransformationArgs>> transformations;

    public Optional<Output<List<GetImagingPolicyImagePolicyTransformationArgs>>> transformations() {
        return Optional.ofNullable(this.transformations);
    }

    private GetImagingPolicyImagePolicyTransformationCompoundArgs() {}

    private GetImagingPolicyImagePolicyTransformationCompoundArgs(GetImagingPolicyImagePolicyTransformationCompoundArgs $) {
        this.transformations = $.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationCompoundArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationCompoundArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationCompoundArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationCompoundArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationCompoundArgs(Objects.requireNonNull(defaults));
        }

        public Builder transformations(@Nullable Output<List<GetImagingPolicyImagePolicyTransformationArgs>> transformations) {
            $.transformations = transformations;
            return this;
        }

        public Builder transformations(List<GetImagingPolicyImagePolicyTransformationArgs> transformations) {
            return transformations(Output.of(transformations));
        }

        public Builder transformations(GetImagingPolicyImagePolicyTransformationArgs... transformations) {
            return transformations(List.of(transformations));
        }

        public GetImagingPolicyImagePolicyTransformationCompoundArgs build() {
            return $;
        }
    }

}
