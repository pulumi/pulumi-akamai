// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationBackgroundColorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationBackgroundColorArgs Empty = new GetImagingPolicyImagePolicyTransformationBackgroundColorArgs();

    /**
     * The hexadecimal CSS color value for the background.
     * 
     */
    @Import(name="color")
    private @Nullable Output<String> color;

    /**
     * @return The hexadecimal CSS color value for the background.
     * 
     */
    public Optional<Output<String>> color() {
        return Optional.ofNullable(this.color);
    }

    /**
     * The hexadecimal CSS color value for the background.
     * 
     */
    @Import(name="colorVar")
    private @Nullable Output<String> colorVar;

    /**
     * @return The hexadecimal CSS color value for the background.
     * 
     */
    public Optional<Output<String>> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }

    private GetImagingPolicyImagePolicyTransformationBackgroundColorArgs() {}

    private GetImagingPolicyImagePolicyTransformationBackgroundColorArgs(GetImagingPolicyImagePolicyTransformationBackgroundColorArgs $) {
        this.color = $.color;
        this.colorVar = $.colorVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationBackgroundColorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationBackgroundColorArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationBackgroundColorArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationBackgroundColorArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationBackgroundColorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param color The hexadecimal CSS color value for the background.
         * 
         * @return builder
         * 
         */
        public Builder color(@Nullable Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color The hexadecimal CSS color value for the background.
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        /**
         * @param colorVar The hexadecimal CSS color value for the background.
         * 
         * @return builder
         * 
         */
        public Builder colorVar(@Nullable Output<String> colorVar) {
            $.colorVar = colorVar;
            return this;
        }

        /**
         * @param colorVar The hexadecimal CSS color value for the background.
         * 
         * @return builder
         * 
         */
        public Builder colorVar(String colorVar) {
            return colorVar(Output.of(colorVar));
        }

        public GetImagingPolicyImagePolicyTransformationBackgroundColorArgs build() {
            return $;
        }
    }

}
