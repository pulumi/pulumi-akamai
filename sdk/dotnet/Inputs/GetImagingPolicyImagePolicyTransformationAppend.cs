// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationAppendArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies where to place the `image` relative to the source image. The available values represent the eight cardinal directions (`North`, `South`, `East`, `West`, `NorthEast`, `NorthWest`, `SouthEast`, `SouthWest`) and a `Center` by default.
        /// </summary>
        [Input("gravity")]
        public string? Gravity { get; set; }

        /// <summary>
        /// Determines the exact placement of the `image` when `gravity` is `Center` or a diagonal. The value is either `horizontal` or `vertical`. Use `horizontal` to append an `image` east or west of the source image. This aligns the `image` on the vertical gravity component, placing `Center` gravity east. Use `vertical` to append an `image` north or south of the source image. This aligns the `image` on the horizontal gravity component, placing `Center` gravity south.
        /// </summary>
        [Input("gravityPriority")]
        public string? GravityPriority { get; set; }

        /// <summary>
        /// Determines the exact placement of the `image` when `gravity` is `Center` or a diagonal. The value is either `horizontal` or `vertical`. Use `horizontal` to append an `image` east or west of the source image. This aligns the `image` on the vertical gravity component, placing `Center` gravity east. Use `vertical` to append an `image` north or south of the source image. This aligns the `image` on the horizontal gravity component, placing `Center` gravity south.
        /// </summary>
        [Input("gravityPriorityVar")]
        public string? GravityPriorityVar { get; set; }

        /// <summary>
        /// Specifies where to place the `image` relative to the source image. The available values represent the eight cardinal directions (`North`, `South`, `East`, `West`, `NorthEast`, `NorthWest`, `SouthEast`, `SouthWest`) and a `Center` by default.
        /// </summary>
        [Input("gravityVar")]
        public string? GravityVar { get; set; }

        [Input("image", required: true)]
        public Inputs.GetImagingPolicyImagePolicyTransformationAppendImageArgs Image { get; set; } = null!;

        /// <summary>
        /// Whether to preserve the source image's minor dimension, `false` by default. The minor dimension is the dimension opposite the dimension that the appending `image` is placed. For example, the dimensions of the source image are 100 &amp;times; 100 pixels. The dimensions of the appending `image` are 50 &amp;times; 150 pixels. The `gravity` is set to `East`. This makes the major dimension horizontal and the source image's minor dimension vertical. To preserve the source image's minor dimension at 100 pixels, the `preserveMinorDimension` is set to `true`. As a result of the append, the major dimension expanded with the appended image to 150 pixels. The source image's minor dimension was maintained at 100 pixels. The total combined dimension of the image is 150 &amp;times; 100 pixels.
        /// </summary>
        [Input("preserveMinorDimension")]
        public string? PreserveMinorDimension { get; set; }

        /// <summary>
        /// Whether to preserve the source image's minor dimension, `false` by default. The minor dimension is the dimension opposite the dimension that the appending `image` is placed. For example, the dimensions of the source image are 100 &amp;times; 100 pixels. The dimensions of the appending `image` are 50 &amp;times; 150 pixels. The `gravity` is set to `East`. This makes the major dimension horizontal and the source image's minor dimension vertical. To preserve the source image's minor dimension at 100 pixels, the `preserveMinorDimension` is set to `true`. As a result of the append, the major dimension expanded with the appended image to 150 pixels. The source image's minor dimension was maintained at 100 pixels. The total combined dimension of the image is 150 &amp;times; 100 pixels.
        /// </summary>
        [Input("preserveMinorDimensionVar")]
        public string? PreserveMinorDimensionVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationAppendArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationAppendArgs Empty => new GetImagingPolicyImagePolicyTransformationAppendArgs();
    }
}
