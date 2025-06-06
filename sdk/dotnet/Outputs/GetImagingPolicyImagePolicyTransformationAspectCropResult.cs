// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetImagingPolicyImagePolicyTransformationAspectCropResult
    {
        /// <summary>
        /// Increases the size of the image canvas to achieve the requested aspect ratio instead of cropping the image. Use the Horizontal Offset and Vertical Offset settings to determine where to add the fully transparent pixels on the expanded image canvas.
        /// </summary>
        public readonly string? AllowExpansion;
        /// <summary>
        /// Increases the size of the image canvas to achieve the requested aspect ratio instead of cropping the image. Use the Horizontal Offset and Vertical Offset settings to determine where to add the fully transparent pixels on the expanded image canvas.
        /// </summary>
        public readonly string? AllowExpansionVar;
        /// <summary>
        /// The height term of the aspect ratio to crop.
        /// </summary>
        public readonly string? Height;
        /// <summary>
        /// The height term of the aspect ratio to crop.
        /// </summary>
        public readonly string? HeightVar;
        /// <summary>
        /// The width term of the aspect ratio to crop.
        /// </summary>
        public readonly string? Width;
        /// <summary>
        /// The width term of the aspect ratio to crop.
        /// </summary>
        public readonly string? WidthVar;
        /// <summary>
        /// Specifies the horizontal portion of the image you want to keep when the aspect ratio cropping is applied. When using Allow Expansion this setting defines the horizontal position of the image on the new expanded image canvas.
        /// </summary>
        public readonly string? XPosition;
        /// <summary>
        /// Specifies the horizontal portion of the image you want to keep when the aspect ratio cropping is applied. When using Allow Expansion this setting defines the horizontal position of the image on the new expanded image canvas.
        /// </summary>
        public readonly string? XPositionVar;
        /// <summary>
        /// Specifies the horizontal portion of the image you want to keep when the aspect ratio cropping is applied. When using Allow Expansion this setting defines the horizontal position of the image on the new expanded image canvas.
        /// </summary>
        public readonly string? YPosition;
        /// <summary>
        /// Specifies the horizontal portion of the image you want to keep when the aspect ratio cropping is applied. When using Allow Expansion this setting defines the horizontal position of the image on the new expanded image canvas.
        /// </summary>
        public readonly string? YPositionVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyTransformationAspectCropResult(
            string? allowExpansion,

            string? allowExpansionVar,

            string? height,

            string? heightVar,

            string? width,

            string? widthVar,

            string? xPosition,

            string? xPositionVar,

            string? yPosition,

            string? yPositionVar)
        {
            AllowExpansion = allowExpansion;
            AllowExpansionVar = allowExpansionVar;
            Height = height;
            HeightVar = heightVar;
            Width = width;
            WidthVar = widthVar;
            XPosition = xPosition;
            XPositionVar = xPositionVar;
            YPosition = yPosition;
            YPositionVar = yPositionVar;
        }
    }
}
