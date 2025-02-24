// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs();

    @Import(name="default")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> default_;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> default_() {
        return Optional.ofNullable(this.default_);
    }

    @Import(name="landscape")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> landscape;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> landscape() {
        return Optional.ofNullable(this.landscape);
    }

    @Import(name="portrait")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> portrait;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> portrait() {
        return Optional.ofNullable(this.portrait);
    }

    @Import(name="square")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> square;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> square() {
        return Optional.ofNullable(this.square);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs(GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs $) {
        this.default_ = $.default_;
        this.landscape = $.landscape;
        this.portrait = $.portrait;
        this.square = $.square;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs default_) {
            return default_(Output.of(default_));
        }

        public Builder landscape(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> landscape) {
            $.landscape = landscape;
            return this;
        }

        public Builder landscape(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs landscape) {
            return landscape(Output.of(landscape));
        }

        public Builder portrait(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> portrait) {
            $.portrait = portrait;
            return this;
        }

        public Builder portrait(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs portrait) {
            return portrait(Output.of(portrait));
        }

        public Builder square(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> square) {
            $.square = square;
            return this;
        }

        public Builder square(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs square) {
            return square(Output.of(square));
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs build() {
            return $;
        }
    }

}
