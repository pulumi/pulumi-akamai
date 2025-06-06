// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The fill color of the circle. The API supports hexadecimal representation and CSS hexadecimal color values.
        /// </summary>
        [Input("color")]
        public string? Color { get; set; }

        /// <summary>
        /// The fill color of the circle. The API supports hexadecimal representation and CSS hexadecimal color values.
        /// </summary>
        [Input("colorVar")]
        public string? ColorVar { get; set; }

        /// <summary>
        /// The diameter of the circle. The diameter will be the width and the height of the image in pixels.
        /// </summary>
        [Input("diameter")]
        public string? Diameter { get; set; }

        /// <summary>
        /// The diameter of the circle. The diameter will be the width and the height of the image in pixels.
        /// </summary>
        [Input("diameterVar")]
        public string? DiameterVar { get; set; }

        [Input("transformation")]
        public Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs? Transformation { get; set; }

        /// <summary>
        /// The width of the box in pixels.
        /// </summary>
        [Input("width")]
        public string? Width { get; set; }

        /// <summary>
        /// The width of the box in pixels.
        /// </summary>
        [Input("widthVar")]
        public string? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs();
    }
}
