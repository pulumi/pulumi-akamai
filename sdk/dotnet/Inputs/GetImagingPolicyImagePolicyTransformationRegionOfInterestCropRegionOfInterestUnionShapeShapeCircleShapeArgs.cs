// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines coordinates for a single point, to help define polygons and rectangles. Each point may be an object with `x`and `y` members, or a two-element array.
        /// </summary>
        [Input("center", required: true)]
        public Input<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeCenterInputArgs> Center { get; set; } = null!;

        /// <summary>
        /// The radius of the circle measured in pixels.
        /// </summary>
        [Input("radius")]
        public Input<string>? Radius { get; set; }

        /// <summary>
        /// The radius of the circle measured in pixels.
        /// </summary>
        [Input("radiusVar")]
        public Input<string>? RadiusVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeInputArgs Empty => new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeCircleShapeInputArgs();
    }
}
