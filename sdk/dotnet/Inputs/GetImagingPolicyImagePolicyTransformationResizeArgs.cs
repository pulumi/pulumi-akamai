// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationResizeInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Preserves the aspect ratio. Select `fit` to make the image fit entirely within the selected width and height. When using `fit`, the resulting image has the largest possible size for the specified dimensions. Select `fill` to size the image so it both completely fills the dimensions and has the smallest possible file size. Otherwise `ignore` changes the original aspect ratio to fit within an arbitrarily shaped rectangle.
        /// </summary>
        [Input("aspect")]
        public Input<string>? Aspect { get; set; }

        /// <summary>
        /// Preserves the aspect ratio. Select `fit` to make the image fit entirely within the selected width and height. When using `fit`, the resulting image has the largest possible size for the specified dimensions. Select `fill` to size the image so it both completely fills the dimensions and has the smallest possible file size. Otherwise `ignore` changes the original aspect ratio to fit within an arbitrarily shaped rectangle.
        /// </summary>
        [Input("aspectVar")]
        public Input<string>? AspectVar { get; set; }

        /// <summary>
        /// The height to resize the source image to. Must be set if height is not specified.
        /// </summary>
        [Input("height")]
        public Input<string>? Height { get; set; }

        /// <summary>
        /// The height to resize the source image to. Must be set if height is not specified.
        /// </summary>
        [Input("heightVar")]
        public Input<string>? HeightVar { get; set; }

        /// <summary>
        /// Sets constraints for the image resize. Select `normal` to resize in all cases, either increasing or decreasing the dimensions. Select `downsize` to ignore this transformation if the result would be larger than the original. Select `upsize` to ignore this transformation if the result would be smaller.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Sets constraints for the image resize. Select `normal` to resize in all cases, either increasing or decreasing the dimensions. Select `downsize` to ignore this transformation if the result would be larger than the original. Select `upsize` to ignore this transformation if the result would be smaller.
        /// </summary>
        [Input("typeVar")]
        public Input<string>? TypeVar { get; set; }

        /// <summary>
        /// The width to resize the source image to. Must be set if width is not specified.
        /// </summary>
        [Input("width")]
        public Input<string>? Width { get; set; }

        /// <summary>
        /// The width to resize the source image to. Must be set if width is not specified.
        /// </summary>
        [Input("widthVar")]
        public Input<string>? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationResizeInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationResizeInputArgs Empty => new GetImagingPolicyImagePolicyTransformationResizeInputArgs();
    }
}
