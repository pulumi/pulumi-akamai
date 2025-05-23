// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationHsvArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationHsvArgs Empty = new GetImagingPolicyImagePolicyTransformationHsvArgs();

    /**
     * The number of degrees to rotate colors around the color wheel, `0.0` by default.
     * 
     */
    @Import(name="hue")
    private @Nullable Output<String> hue;

    /**
     * @return The number of degrees to rotate colors around the color wheel, `0.0` by default.
     * 
     */
    public Optional<Output<String>> hue() {
        return Optional.ofNullable(this.hue);
    }

    /**
     * The number of degrees to rotate colors around the color wheel, `0.0` by default.
     * 
     */
    @Import(name="hueVar")
    private @Nullable Output<String> hueVar;

    /**
     * @return The number of degrees to rotate colors around the color wheel, `0.0` by default.
     * 
     */
    public Optional<Output<String>> hueVar() {
        return Optional.ofNullable(this.hueVar);
    }

    /**
     * A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
     * 
     */
    @Import(name="saturation")
    private @Nullable Output<String> saturation;

    /**
     * @return A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
     * 
     */
    public Optional<Output<String>> saturation() {
        return Optional.ofNullable(this.saturation);
    }

    /**
     * A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
     * 
     */
    @Import(name="saturationVar")
    private @Nullable Output<String> saturationVar;

    /**
     * @return A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
     * 
     */
    public Optional<Output<String>> saturationVar() {
        return Optional.ofNullable(this.saturationVar);
    }

    /**
     * A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
     * 
     */
    @Import(name="valueVar")
    private @Nullable Output<String> valueVar;

    /**
     * @return A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
     * 
     */
    public Optional<Output<String>> valueVar() {
        return Optional.ofNullable(this.valueVar);
    }

    private GetImagingPolicyImagePolicyTransformationHsvArgs() {}

    private GetImagingPolicyImagePolicyTransformationHsvArgs(GetImagingPolicyImagePolicyTransformationHsvArgs $) {
        this.hue = $.hue;
        this.hueVar = $.hueVar;
        this.saturation = $.saturation;
        this.saturationVar = $.saturationVar;
        this.value = $.value;
        this.valueVar = $.valueVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationHsvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationHsvArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationHsvArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationHsvArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationHsvArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hue The number of degrees to rotate colors around the color wheel, `0.0` by default.
         * 
         * @return builder
         * 
         */
        public Builder hue(@Nullable Output<String> hue) {
            $.hue = hue;
            return this;
        }

        /**
         * @param hue The number of degrees to rotate colors around the color wheel, `0.0` by default.
         * 
         * @return builder
         * 
         */
        public Builder hue(String hue) {
            return hue(Output.of(hue));
        }

        /**
         * @param hueVar The number of degrees to rotate colors around the color wheel, `0.0` by default.
         * 
         * @return builder
         * 
         */
        public Builder hueVar(@Nullable Output<String> hueVar) {
            $.hueVar = hueVar;
            return this;
        }

        /**
         * @param hueVar The number of degrees to rotate colors around the color wheel, `0.0` by default.
         * 
         * @return builder
         * 
         */
        public Builder hueVar(String hueVar) {
            return hueVar(Output.of(hueVar));
        }

        /**
         * @param saturation A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
         * 
         * @return builder
         * 
         */
        public Builder saturation(@Nullable Output<String> saturation) {
            $.saturation = saturation;
            return this;
        }

        /**
         * @param saturation A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
         * 
         * @return builder
         * 
         */
        public Builder saturation(String saturation) {
            return saturation(Output.of(saturation));
        }

        /**
         * @param saturationVar A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
         * 
         * @return builder
         * 
         */
        public Builder saturationVar(@Nullable Output<String> saturationVar) {
            $.saturationVar = saturationVar;
            return this;
        }

        /**
         * @param saturationVar A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
         * 
         * @return builder
         * 
         */
        public Builder saturationVar(String saturationVar) {
            return saturationVar(Output.of(saturationVar));
        }

        /**
         * @param value A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueVar A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
         * 
         * @return builder
         * 
         */
        public Builder valueVar(@Nullable Output<String> valueVar) {
            $.valueVar = valueVar;
            return this;
        }

        /**
         * @param valueVar A multiplier to adjust the lightness or darkness of the images base color. Values less than 1.0 decrease the base colors in the image, making them appear darker. Values greater than 1.0 increase the base colors in the image, making them appear lighter.
         * 
         * @return builder
         * 
         */
        public Builder valueVar(String valueVar) {
            return valueVar(Output.of(valueVar));
        }

        public GetImagingPolicyImagePolicyTransformationHsvArgs build() {
            return $;
        }
    }

}
