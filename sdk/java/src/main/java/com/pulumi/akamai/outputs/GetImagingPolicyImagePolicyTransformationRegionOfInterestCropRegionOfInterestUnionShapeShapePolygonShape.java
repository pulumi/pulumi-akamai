// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePoint;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShape {
    /**
     * @return Series of PointShapeType objects. The last and first points connect to close the shape automatically.
     * 
     */
    private List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePoint> points;

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShape() {}
    /**
     * @return Series of PointShapeType objects. The last and first points connect to close the shape automatically.
     * 
     */
    public List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePoint> points() {
        return this.points;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShape defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePoint> points;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShape defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.points = defaults.points;
        }

        @CustomType.Setter
        public Builder points(List<GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePoint> points) {
            if (points == null) {
              throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShape", "points");
            }
            this.points = points;
            return this;
        }
        public Builder points(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePoint... points) {
            return points(List.of(points));
        }
        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShape build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShape();
            _resultValue.points = points;
            return _resultValue;
        }
    }
}
