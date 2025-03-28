// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs();

    /**
     * Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
     * 
     */
    @Import(name="hue")
    private @Nullable Output<String> hue;

    /**
     * @return Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
     * 
     */
    public Optional<Output<String>> hue() {
        return Optional.ofNullable(this.hue);
    }

    /**
     * Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
     * 
     */
    @Import(name="hueVar")
    private @Nullable Output<String> hueVar;

    /**
     * @return Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
     * 
     */
    public Optional<Output<String>> hueVar() {
        return Optional.ofNullable(this.hueVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs(GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs $) {
        this.hue = $.hue;
        this.hueVar = $.hueVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hue Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
         * 
         * @return builder
         * 
         */
        public Builder hue(@Nullable Output<String> hue) {
            $.hue = hue;
            return this;
        }

        /**
         * @param hue Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
         * 
         * @return builder
         * 
         */
        public Builder hue(String hue) {
            return hue(Output.of(hue));
        }

        /**
         * @param hueVar Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
         * 
         * @return builder
         * 
         */
        public Builder hueVar(@Nullable Output<String> hueVar) {
            $.hueVar = hueVar;
            return this;
        }

        /**
         * @param hueVar Specify a hue by indicating the degree of rotation between 0 and 360 degrees around the color wheel. By default Mono Hue applies a red hue, 0.0 on the color wheel.
         * 
         * @return builder
         * 
         */
        public Builder hueVar(String hueVar) {
            return hueVar(Output.of(hueVar));
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs build() {
            return $;
        }
    }

}
