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
    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationHslResult
    {
        /// <summary>
        /// The number of degrees to rotate colors around the color wheel, `0` by default.
        /// </summary>
        public readonly string? Hue;
        /// <summary>
        /// The number of degrees to rotate colors around the color wheel, `0` by default.
        /// </summary>
        public readonly string? HueVar;
        /// <summary>
        /// A multiplier to adjust the lightness of colors in the image. Note that lightness is distinct from brightness. For example, reducing the lightness of a light green might give you a lime green whereas reducing the brightness of a light green might give you a darker shade of the same green. Values less than `1.0` decrease the lightness of colors in the image. Values greater than `1.0` increase the lightness of colors in the image.
        /// </summary>
        public readonly string? Lightness;
        /// <summary>
        /// A multiplier to adjust the lightness of colors in the image. Note that lightness is distinct from brightness. For example, reducing the lightness of a light green might give you a lime green whereas reducing the brightness of a light green might give you a darker shade of the same green. Values less than `1.0` decrease the lightness of colors in the image. Values greater than `1.0` increase the lightness of colors in the image.
        /// </summary>
        public readonly string? LightnessVar;
        /// <summary>
        /// A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
        /// </summary>
        public readonly string? Saturation;
        /// <summary>
        /// A multiplier to adjust the saturation of colors in the image. Values less than `1.0` decrease saturation and values greater than `1.0` increase the saturation. A value of `0.0` removes all color from the image.
        /// </summary>
        public readonly string? SaturationVar;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyPostBreakpointTransformationHslResult(
            string? hue,

            string? hueVar,

            string? lightness,

            string? lightnessVar,

            string? saturation,

            string? saturationVar)
        {
            Hue = hue;
            HueVar = hueVar;
            Lightness = lightness;
            LightnessVar = lightnessVar;
            Saturation = saturation;
            SaturationVar = saturationVar;
        }
    }
}
