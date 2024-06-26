// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationUnsharpMask extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationUnsharpMask Empty = new GetImagingPolicyImagePolicyTransformationUnsharpMask();

    /**
     * Set how much emphasis the filter applies to details. Higher values increase apparent sharpness of details.
     * 
     */
    @Import(name="gain")
    private @Nullable String gain;

    /**
     * @return Set how much emphasis the filter applies to details. Higher values increase apparent sharpness of details.
     * 
     */
    public Optional<String> gain() {
        return Optional.ofNullable(this.gain);
    }

    /**
     * Set how much emphasis the filter applies to details. Higher values increase apparent sharpness of details.
     * 
     */
    @Import(name="gainVar")
    private @Nullable String gainVar;

    /**
     * @return Set how much emphasis the filter applies to details. Higher values increase apparent sharpness of details.
     * 
     */
    public Optional<String> gainVar() {
        return Optional.ofNullable(this.gainVar);
    }

    /**
     * The standard deviation of the Gaussian distribution used in the in unsharp mask, measured in pixels, `1.0` by default. High values emphasize large details and low values emphasize small details.
     * 
     */
    @Import(name="sigma")
    private @Nullable String sigma;

    /**
     * @return The standard deviation of the Gaussian distribution used in the in unsharp mask, measured in pixels, `1.0` by default. High values emphasize large details and low values emphasize small details.
     * 
     */
    public Optional<String> sigma() {
        return Optional.ofNullable(this.sigma);
    }

    /**
     * The standard deviation of the Gaussian distribution used in the in unsharp mask, measured in pixels, `1.0` by default. High values emphasize large details and low values emphasize small details.
     * 
     */
    @Import(name="sigmaVar")
    private @Nullable String sigmaVar;

    /**
     * @return The standard deviation of the Gaussian distribution used in the in unsharp mask, measured in pixels, `1.0` by default. High values emphasize large details and low values emphasize small details.
     * 
     */
    public Optional<String> sigmaVar() {
        return Optional.ofNullable(this.sigmaVar);
    }

    /**
     * Set the minimum change required to include a detail in the filter. Higher values discard more changes.
     * 
     */
    @Import(name="threshold")
    private @Nullable String threshold;

    /**
     * @return Set the minimum change required to include a detail in the filter. Higher values discard more changes.
     * 
     */
    public Optional<String> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * Set the minimum change required to include a detail in the filter. Higher values discard more changes.
     * 
     */
    @Import(name="thresholdVar")
    private @Nullable String thresholdVar;

    /**
     * @return Set the minimum change required to include a detail in the filter. Higher values discard more changes.
     * 
     */
    public Optional<String> thresholdVar() {
        return Optional.ofNullable(this.thresholdVar);
    }

    private GetImagingPolicyImagePolicyTransformationUnsharpMask() {}

    private GetImagingPolicyImagePolicyTransformationUnsharpMask(GetImagingPolicyImagePolicyTransformationUnsharpMask $) {
        this.gain = $.gain;
        this.gainVar = $.gainVar;
        this.sigma = $.sigma;
        this.sigmaVar = $.sigmaVar;
        this.threshold = $.threshold;
        this.thresholdVar = $.thresholdVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationUnsharpMask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationUnsharpMask $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationUnsharpMask();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationUnsharpMask defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationUnsharpMask(Objects.requireNonNull(defaults));
        }

        /**
         * @param gain Set how much emphasis the filter applies to details. Higher values increase apparent sharpness of details.
         * 
         * @return builder
         * 
         */
        public Builder gain(@Nullable String gain) {
            $.gain = gain;
            return this;
        }

        /**
         * @param gainVar Set how much emphasis the filter applies to details. Higher values increase apparent sharpness of details.
         * 
         * @return builder
         * 
         */
        public Builder gainVar(@Nullable String gainVar) {
            $.gainVar = gainVar;
            return this;
        }

        /**
         * @param sigma The standard deviation of the Gaussian distribution used in the in unsharp mask, measured in pixels, `1.0` by default. High values emphasize large details and low values emphasize small details.
         * 
         * @return builder
         * 
         */
        public Builder sigma(@Nullable String sigma) {
            $.sigma = sigma;
            return this;
        }

        /**
         * @param sigmaVar The standard deviation of the Gaussian distribution used in the in unsharp mask, measured in pixels, `1.0` by default. High values emphasize large details and low values emphasize small details.
         * 
         * @return builder
         * 
         */
        public Builder sigmaVar(@Nullable String sigmaVar) {
            $.sigmaVar = sigmaVar;
            return this;
        }

        /**
         * @param threshold Set the minimum change required to include a detail in the filter. Higher values discard more changes.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable String threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param thresholdVar Set the minimum change required to include a detail in the filter. Higher values discard more changes.
         * 
         * @return builder
         * 
         */
        public Builder thresholdVar(@Nullable String thresholdVar) {
            $.thresholdVar = thresholdVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationUnsharpMask build() {
            return $;
        }
    }

}
