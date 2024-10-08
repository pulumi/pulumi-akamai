// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs Empty = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs();

    /**
     * Defines coordinates for a single point, to help define polygons and rectangles. Each point may be an object with `x`and `y` members, or a two-element array.
     * 
     */
    @Import(name="center", required=true)
    private Output<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs> center;

    /**
     * @return Defines coordinates for a single point, to help define polygons and rectangles. Each point may be an object with `x`and `y` members, or a two-element array.
     * 
     */
    public Output<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs> center() {
        return this.center;
    }

    /**
     * The radius of the circle measured in pixels.
     * 
     */
    @Import(name="radius")
    private @Nullable Output<String> radius;

    /**
     * @return The radius of the circle measured in pixels.
     * 
     */
    public Optional<Output<String>> radius() {
        return Optional.ofNullable(this.radius);
    }

    /**
     * The radius of the circle measured in pixels.
     * 
     */
    @Import(name="radiusVar")
    private @Nullable Output<String> radiusVar;

    /**
     * @return The radius of the circle measured in pixels.
     * 
     */
    public Optional<Output<String>> radiusVar() {
        return Optional.ofNullable(this.radiusVar);
    }

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs() {}

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs $) {
        this.center = $.center;
        this.radius = $.radius;
        this.radiusVar = $.radiusVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param center Defines coordinates for a single point, to help define polygons and rectangles. Each point may be an object with `x`and `y` members, or a two-element array.
         * 
         * @return builder
         * 
         */
        public Builder center(Output<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs> center) {
            $.center = center;
            return this;
        }

        /**
         * @param center Defines coordinates for a single point, to help define polygons and rectangles. Each point may be an object with `x`and `y` members, or a two-element array.
         * 
         * @return builder
         * 
         */
        public Builder center(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs center) {
            return center(Output.of(center));
        }

        /**
         * @param radius The radius of the circle measured in pixels.
         * 
         * @return builder
         * 
         */
        public Builder radius(@Nullable Output<String> radius) {
            $.radius = radius;
            return this;
        }

        /**
         * @param radius The radius of the circle measured in pixels.
         * 
         * @return builder
         * 
         */
        public Builder radius(String radius) {
            return radius(Output.of(radius));
        }

        /**
         * @param radiusVar The radius of the circle measured in pixels.
         * 
         * @return builder
         * 
         */
        public Builder radiusVar(@Nullable Output<String> radiusVar) {
            $.radiusVar = radiusVar;
            return this;
        }

        /**
         * @param radiusVar The radius of the circle measured in pixels.
         * 
         * @return builder
         * 
         */
        public Builder radiusVar(String radiusVar) {
            return radiusVar(Output.of(radiusVar));
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs build() {
            if ($.center == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeArgs", "center");
            }
            return $;
        }
    }

}
