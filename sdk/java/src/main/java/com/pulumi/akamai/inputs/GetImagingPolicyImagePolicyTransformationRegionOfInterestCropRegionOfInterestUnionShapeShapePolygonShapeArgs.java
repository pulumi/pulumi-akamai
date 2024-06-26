// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs Empty = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs();

    /**
     * Series of PointShapeType objects. The last and first points connect to close the shape automatically.
     * 
     */
    @Import(name="points", required=true)
    private Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointArgs>> points;

    /**
     * @return Series of PointShapeType objects. The last and first points connect to close the shape automatically.
     * 
     */
    public Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointArgs>> points() {
        return this.points;
    }

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs() {}

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs $) {
        this.points = $.points;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param points Series of PointShapeType objects. The last and first points connect to close the shape automatically.
         * 
         * @return builder
         * 
         */
        public Builder points(Output<List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointArgs>> points) {
            $.points = points;
            return this;
        }

        /**
         * @param points Series of PointShapeType objects. The last and first points connect to close the shape automatically.
         * 
         * @return builder
         * 
         */
        public Builder points(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointArgs> points) {
            return points(Output.of(points));
        }

        /**
         * @param points Series of PointShapeType objects. The last and first points connect to close the shape automatically.
         * 
         * @return builder
         * 
         */
        public Builder points(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointArgs... points) {
            return points(List.of(points));
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs build() {
            if ($.points == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeArgs", "points");
            }
            return $;
        }
    }

}
