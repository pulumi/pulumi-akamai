// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs();

    /**
     * Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
     * 
     */
    @Import(name="chaos")
    private @Nullable Output<String> chaos;

    /**
     * @return Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
     * 
     */
    public Optional<Output<String>> chaos() {
        return Optional.ofNullable(this.chaos);
    }

    /**
     * Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
     * 
     */
    @Import(name="chaosVar")
    private @Nullable Output<String> chaosVar;

    /**
     * @return Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
     * 
     */
    public Optional<Output<String>> chaosVar() {
        return Optional.ofNullable(this.chaosVar);
    }

    /**
     * Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
     * 
     */
    @Import(name="density")
    private @Nullable Output<String> density;

    /**
     * @return Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
     * 
     */
    public Optional<Output<String>> density() {
        return Optional.ofNullable(this.density);
    }

    /**
     * Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
     * 
     */
    @Import(name="densityVar")
    private @Nullable Output<String> densityVar;

    /**
     * @return Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
     * 
     */
    public Optional<Output<String>> densityVar() {
        return Optional.ofNullable(this.densityVar);
    }

    /**
     * By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
     * 
     */
    @Import(name="power")
    private @Nullable Output<String> power;

    /**
     * @return By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
     * 
     */
    public Optional<Output<String>> power() {
        return Optional.ofNullable(this.power);
    }

    /**
     * By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
     * 
     */
    @Import(name="powerVar")
    private @Nullable Output<String> powerVar;

    /**
     * @return By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
     * 
     */
    public Optional<Output<String>> powerVar() {
        return Optional.ofNullable(this.powerVar);
    }

    /**
     * Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
     * 
     */
    @Import(name="seed")
    private @Nullable Output<String> seed;

    /**
     * @return Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
     * 
     */
    public Optional<Output<String>> seed() {
        return Optional.ofNullable(this.seed);
    }

    /**
     * Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
     * 
     */
    @Import(name="seedVar")
    private @Nullable Output<String> seedVar;

    /**
     * @return Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
     * 
     */
    public Optional<Output<String>> seedVar() {
        return Optional.ofNullable(this.seedVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs(GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs $) {
        this.chaos = $.chaos;
        this.chaosVar = $.chaosVar;
        this.density = $.density;
        this.densityVar = $.densityVar;
        this.power = $.power;
        this.powerVar = $.powerVar;
        this.seed = $.seed;
        this.seedVar = $.seedVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chaos Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
         * 
         * @return builder
         * 
         */
        public Builder chaos(@Nullable Output<String> chaos) {
            $.chaos = chaos;
            return this;
        }

        /**
         * @param chaos Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
         * 
         * @return builder
         * 
         */
        public Builder chaos(String chaos) {
            return chaos(Output.of(chaos));
        }

        /**
         * @param chaosVar Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
         * 
         * @return builder
         * 
         */
        public Builder chaosVar(@Nullable Output<String> chaosVar) {
            $.chaosVar = chaosVar;
            return this;
        }

        /**
         * @param chaosVar Specifies the greatest distance control points may move from their original position. A value of `1.0` shifts control points over as far as the next one in the original grid. A value of `0.0` leaves the image unchanged. Values under `0.5` work better for subtle distortions, otherwise control points may pass each other and cause a twisting effect.
         * 
         * @return builder
         * 
         */
        public Builder chaosVar(String chaosVar) {
            return chaosVar(Output.of(chaosVar));
        }

        /**
         * @param density Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
         * 
         * @return builder
         * 
         */
        public Builder density(@Nullable Output<String> density) {
            $.density = density;
            return this;
        }

        /**
         * @param density Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
         * 
         * @return builder
         * 
         */
        public Builder density(String density) {
            return density(Output.of(density));
        }

        /**
         * @param densityVar Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
         * 
         * @return builder
         * 
         */
        public Builder densityVar(@Nullable Output<String> densityVar) {
            $.densityVar = densityVar;
            return this;
        }

        /**
         * @param densityVar Controls the density of control points used to distort the image. The largest dimension of the input image is divided up to fit this number of control points. A grid of points is extended on the smaller dimension such that each row and column of control points is equidistant from each adjacent row or column. This parameter strongly affects transformation performance. Be careful choosing values above the default if you expect to transform medium to large size images.
         * 
         * @return builder
         * 
         */
        public Builder densityVar(String densityVar) {
            return densityVar(Output.of(densityVar));
        }

        /**
         * @param power By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder power(@Nullable Output<String> power) {
            $.power = power;
            return this;
        }

        /**
         * @param power By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder power(String power) {
            return power(Output.of(power));
        }

        /**
         * @param powerVar By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder powerVar(@Nullable Output<String> powerVar) {
            $.powerVar = powerVar;
            return this;
        }

        /**
         * @param powerVar By default, the distortion algorithm relies on inverse squares to calculate distance but this allows you to change the exponent. You shouldnt need to vary the default value of `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder powerVar(String powerVar) {
            return powerVar(Output.of(powerVar));
        }

        /**
         * @param seed Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
         * 
         * @return builder
         * 
         */
        public Builder seed(@Nullable Output<String> seed) {
            $.seed = seed;
            return this;
        }

        /**
         * @param seed Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
         * 
         * @return builder
         * 
         */
        public Builder seed(String seed) {
            return seed(Output.of(seed));
        }

        /**
         * @param seedVar Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
         * 
         * @return builder
         * 
         */
        public Builder seedVar(@Nullable Output<String> seedVar) {
            $.seedVar = seedVar;
            return this;
        }

        /**
         * @param seedVar Specifies your own `seed` value as an alternative to the default, which is subject to variability. This allows for reproducible and deterministic distortions. If all parameters are kept equal and a constant seed is used, `Goop` distorts an input image consistently over many transformations. By default, this value is set to the current Epoch Time measured in milliseconds, which provides inconsistent transformation output.
         * 
         * @return builder
         * 
         */
        public Builder seedVar(String seedVar) {
            return seedVar(Output.of(seedVar));
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs build() {
            return $;
        }
    }

}
