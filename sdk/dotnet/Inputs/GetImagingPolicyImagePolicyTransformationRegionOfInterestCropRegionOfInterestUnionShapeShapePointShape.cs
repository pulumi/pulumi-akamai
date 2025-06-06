// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The horizontal position of the point, measured in pixels.
        /// </summary>
        [Input("x")]
        public string? X { get; set; }

        /// <summary>
        /// The horizontal position of the point, measured in pixels.
        /// </summary>
        [Input("xVar")]
        public string? XVar { get; set; }

        /// <summary>
        /// The vertical position of the point, measured in pixels.
        /// </summary>
        [Input("y")]
        public string? Y { get; set; }

        /// <summary>
        /// The vertical position of the point, measured in pixels.
        /// </summary>
        [Input("yVar")]
        public string? YVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs Empty => new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapePointShapeArgs();
    }
}
