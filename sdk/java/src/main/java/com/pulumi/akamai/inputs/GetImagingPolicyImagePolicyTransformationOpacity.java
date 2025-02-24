// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationOpacity extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationOpacity Empty = new GetImagingPolicyImagePolicyTransformationOpacity();

    /**
     * Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
     * 
     */
    @Import(name="opacity")
    private @Nullable String opacity;

    /**
     * @return Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
     * 
     */
    public Optional<String> opacity() {
        return Optional.ofNullable(this.opacity);
    }

    /**
     * Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
     * 
     */
    @Import(name="opacityVar")
    private @Nullable String opacityVar;

    /**
     * @return Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
     * 
     */
    public Optional<String> opacityVar() {
        return Optional.ofNullable(this.opacityVar);
    }

    private GetImagingPolicyImagePolicyTransformationOpacity() {}

    private GetImagingPolicyImagePolicyTransformationOpacity(GetImagingPolicyImagePolicyTransformationOpacity $) {
        this.opacity = $.opacity;
        this.opacityVar = $.opacityVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationOpacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationOpacity $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationOpacity();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationOpacity defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationOpacity(Objects.requireNonNull(defaults));
        }

        /**
         * @param opacity Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
         * 
         * @return builder
         * 
         */
        public Builder opacity(@Nullable String opacity) {
            $.opacity = opacity;
            return this;
        }

        /**
         * @param opacityVar Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
         * 
         * @return builder
         * 
         */
        public Builder opacityVar(@Nullable String opacityVar) {
            $.opacityVar = opacityVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationOpacity build() {
            return $;
        }
    }

}
