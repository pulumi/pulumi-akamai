// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationFaceCropInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the type of algorithm used to detect faces in the image, either `cascade` for the cascade classifier algorithm or `dnn` for the deep neural network algorithm, `cascade` by default.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        /// <summary>
        /// Specifies the type of algorithm used to detect faces in the image, either `cascade` for the cascade classifier algorithm or `dnn` for the deep neural network algorithm, `cascade` by default.
        /// </summary>
        [Input("algorithmVar")]
        public Input<string>? AlgorithmVar { get; set; }

        /// <summary>
        /// With `algorithm` set to `dnn`, specifies the minimum confidence needed to detect faces in the image. Values range from `0` to `1` for increased confidence, and possibly fewer faces detected.
        /// </summary>
        [Input("confidence")]
        public Input<string>? Confidence { get; set; }

        /// <summary>
        /// With `algorithm` set to `dnn`, specifies the minimum confidence needed to detect faces in the image. Values range from `0` to `1` for increased confidence, and possibly fewer faces detected.
        /// </summary>
        [Input("confidenceVar")]
        public Input<string>? ConfidenceVar { get; set; }

        /// <summary>
        /// Controls placement of the crop if Image and Video Manager does not detect any faces in the image. Directions are relative to the edges of the image being transformed.
        /// </summary>
        [Input("failGravity")]
        public Input<string>? FailGravity { get; set; }

        /// <summary>
        /// Controls placement of the crop if Image and Video Manager does not detect any faces in the image. Directions are relative to the edges of the image being transformed.
        /// </summary>
        [Input("failGravityVar")]
        public Input<string>? FailGravityVar { get; set; }

        /// <summary>
        /// Distinguishes the faces detected, either `biggestFace` or `allFaces` to place the crop rectangle around the full set of faces, `all` by default.
        /// </summary>
        [Input("focus")]
        public Input<string>? Focus { get; set; }

        /// <summary>
        /// Distinguishes the faces detected, either `biggestFace` or `allFaces` to place the crop rectangle around the full set of faces, `all` by default.
        /// </summary>
        [Input("focusVar")]
        public Input<string>? FocusVar { get; set; }

        /// <summary>
        /// Controls placement of the crop. Directions are relative to the face(s) plus padding.
        /// </summary>
        [Input("gravity")]
        public Input<string>? Gravity { get; set; }

        /// <summary>
        /// Controls placement of the crop. Directions are relative to the face(s) plus padding.
        /// </summary>
        [Input("gravityVar")]
        public Input<string>? GravityVar { get; set; }

        /// <summary>
        /// The height of the output image in pixels relative to the specified `style` value.
        /// </summary>
        [Input("height")]
        public Input<string>? Height { get; set; }

        /// <summary>
        /// The height of the output image in pixels relative to the specified `style` value.
        /// </summary>
        [Input("heightVar")]
        public Input<string>? HeightVar { get; set; }

        /// <summary>
        /// The padding ratio based on the dimensions of the biggest face detected, `0.5` by default. Larger values increase padding.
        /// </summary>
        [Input("padding")]
        public Input<string>? Padding { get; set; }

        /// <summary>
        /// The padding ratio based on the dimensions of the biggest face detected, `0.5` by default. Larger values increase padding.
        /// </summary>
        [Input("paddingVar")]
        public Input<string>? PaddingVar { get; set; }

        /// <summary>
        /// Specifies how to crop or scale a crop area for the faces detected in the source image, `zoom` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places a raw crop around the faces, relative to the specified `gravity` value.  A value of `fill` scales the crop area to include as much of the image and faces as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the faces, relative to the specified `width` and `height` values. Allows Variable substitution.
        /// </summary>
        [Input("style")]
        public Input<string>? Style { get; set; }

        /// <summary>
        /// Specifies how to crop or scale a crop area for the faces detected in the source image, `zoom` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places a raw crop around the faces, relative to the specified `gravity` value.  A value of `fill` scales the crop area to include as much of the image and faces as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the faces, relative to the specified `width` and `height` values. Allows Variable substitution.
        /// </summary>
        [Input("styleVar")]
        public Input<string>? StyleVar { get; set; }

        /// <summary>
        /// The width of the output image in pixels relative to the specified `style` value.
        /// </summary>
        [Input("width")]
        public Input<string>? Width { get; set; }

        /// <summary>
        /// The width of the output image in pixels relative to the specified `style` value.
        /// </summary>
        [Input("widthVar")]
        public Input<string>? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationFaceCropInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationFaceCropInputArgs Empty => new GetImagingPolicyImagePolicyTransformationFaceCropInputArgs();
    }
}
