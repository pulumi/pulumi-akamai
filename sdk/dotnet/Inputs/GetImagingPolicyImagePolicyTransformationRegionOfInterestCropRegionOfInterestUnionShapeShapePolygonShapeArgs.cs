// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("points", required: true)]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointInputArgs>? _points;

        /// <summary>
        /// Series of PointShapeType objects. The last and first points connect to close the shape automatically.
        /// </summary>
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointInputArgs> Points
        {
            get => _points ?? (_points = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapePointInputArgs>());
            set => _points = value;
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeInputArgs Empty => new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePolygonShapeInputArgs();
    }
}
