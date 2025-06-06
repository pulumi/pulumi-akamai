// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationArgs : global::Pulumi.InvokeArgs
    {
        [Input("backgroundColors")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationBackgroundColorArgs>? _backgroundColors;

        /// <summary>
        /// Places a transparent image on a set background color. Color is specified in the typical CSS hexadecimal format.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationBackgroundColorArgs> BackgroundColors
        {
            get => _backgroundColors ?? (_backgroundColors = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationBackgroundColorArgs>());
            set => _backgroundColors = value;
        }

        [Input("blurs")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationBlurArgs>? _blurs;

        /// <summary>
        /// Applies a Gaussian blur to the image.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationBlurArgs> Blurs
        {
            get => _blurs ?? (_blurs = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationBlurArgs>());
            set => _blurs = value;
        }

        [Input("chromaKeys")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationChromaKeyArgs>? _chromaKeys;

        /// <summary>
        /// Changes any color in an image within the specified volume of the HSL colorspace to transparent or semitransparent. This transformation applies a 'green screen' technique commonly used to isolate and remove background colors.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationChromaKeyArgs> ChromaKeys
        {
            get => _chromaKeys ?? (_chromaKeys = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationChromaKeyArgs>());
            set => _chromaKeys = value;
        }

        [Input("composites")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeArgs>? _composites;

        /// <summary>
        /// Applies another image to the source image, either as an overlay or an underlay. The image that's underneath is visible in areas that are beyond the edges of the top image or that are less than 100% opaque. A common use of an overlay composite is to add a watermark.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeArgs> Composites
        {
            get => _composites ?? (_composites = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeArgs>());
            set => _composites = value;
        }

        [Input("compounds")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompoundArgs>? _compounds;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompoundArgs> Compounds
        {
            get => _compounds ?? (_compounds = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompoundArgs>());
            set => _compounds = value;
        }

        [Input("contrasts")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationContrastArgs>? _contrasts;

        /// <summary>
        /// Adjusts both the contrast and brightness of an image.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationContrastArgs> Contrasts
        {
            get => _contrasts ?? (_contrasts = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationContrastArgs>());
            set => _contrasts = value;
        }

        [Input("goops")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs>? _goops;

        /// <summary>
        /// Distorts an image by randomly repositioning a set of control points along a specified grid. The transformed image appears _goopy_. Adjust the density of the grid and the degree of randomity. You can use this transformation to create watermarks for use in security.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs> Goops
        {
            get => _goops ?? (_goops = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationGoopArgs>());
            set => _goops = value;
        }

        [Input("grayscales")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationGrayscaleArgs>? _grayscales;

        /// <summary>
        /// Restricts image color to shades of gray only.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationGrayscaleArgs> Grayscales
        {
            get => _grayscales ?? (_grayscales = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationGrayscaleArgs>());
            set => _grayscales = value;
        }

        [Input("hsls")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationHslArgs>? _hsls;

        /// <summary>
        /// Adjusts the hue, saturation, and lightness (HSL) of an image. Hue is the number of degrees that colors rotate around the color wheel. Saturation is a multiplier to increase or decrease color saturation. Lightness is a multiplier to increase or decrease the lightness of an image. Other transformations can also affect color, such as `Grayscale` and `MaxColors`. If youre using more than one, consider the order to apply them for the desired results.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationHslArgs> Hsls
        {
            get => _hsls ?? (_hsls = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationHslArgs>());
            set => _hsls = value;
        }

        [Input("hsvs")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationHsvArgs>? _hsvs;

        /// <summary>
        /// Identical to HSL except it replaces `lightness` with `value`. For example, if you reduce the `lightness` of a light green, almost white, image, the color turns a vibrant green. Reducing the `value` turns the image a darker color, close to grey. This happens because the original image color is very close to white.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationHsvArgs> Hsvs
        {
            get => _hsvs ?? (_hsvs = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationHsvArgs>());
            set => _hsvs = value;
        }

        [Input("ifDimensions")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs>? _ifDimensions;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs> IfDimensions
        {
            get => _ifDimensions ?? (_ifDimensions = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationIfDimensionArgs>());
            set => _ifDimensions = value;
        }

        [Input("ifOrientations")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs>? _ifOrientations;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs> IfOrientations
        {
            get => _ifOrientations ?? (_ifOrientations = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationIfOrientationArgs>());
            set => _ifOrientations = value;
        }

        [Input("maxColors")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColorArgs>? _maxColors;

        /// <summary>
        /// Set the maximum number of colors in the images palette. Reducing the number of colors in an image can help to reduce file size.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColorArgs> MaxColors
        {
            get => _maxColors ?? (_maxColors = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColorArgs>());
            set => _maxColors = value;
        }

        [Input("mirrors")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMirrorArgs>? _mirrors;

        /// <summary>
        /// Flips an image horizontally, vertically, or both.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMirrorArgs> Mirrors
        {
            get => _mirrors ?? (_mirrors = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMirrorArgs>());
            set => _mirrors = value;
        }

        [Input("monoHues")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs>? _monoHues;

        /// <summary>
        /// Allows you to set all hues in an image to a single specified hue of your choosing. Mono Hue maintains the original color’s lightness and saturation but sets the hue to that of the specified value. This has the effect of making the image shades of the specified hue.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs> MonoHues
        {
            get => _monoHues ?? (_monoHues = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationMonoHueArgs>());
            set => _monoHues = value;
        }

        [Input("opacities")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationOpacityArgs>? _opacities;

        /// <summary>
        /// Adjusts the level of transparency of an image. Use this transformation to make an image more or less transparent.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationOpacityArgs> Opacities
        {
            get => _opacities ?? (_opacities = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationOpacityArgs>());
            set => _opacities = value;
        }

        [Input("removeColors")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColorArgs>? _removeColors;

        /// <summary>
        /// Removes a specified color from an image and replaces it with transparent pixels. This transformation is ideal for removing solid background colors from product images photographed on clean, consistent backgrounds without any shadows.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColorArgs> RemoveColors
        {
            get => _removeColors ?? (_removeColors = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationRemoveColorArgs>());
            set => _removeColors = value;
        }

        [Input("unsharpMasks")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationUnsharpMaskArgs>? _unsharpMasks;

        /// <summary>
        /// Emphasizes edges and details in source images without distorting the colors. Although this effect is often referred to as _sharpening_ an image, it actually creates a blurred, inverted copy of the image known as an unsharp mask. Image and Video Manager combines the unsharp mask with the source image to create an image perceived as clearer.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationUnsharpMaskArgs> UnsharpMasks
        {
            get => _unsharpMasks ?? (_unsharpMasks = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationUnsharpMaskArgs>());
            set => _unsharpMasks = value;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationArgs();
    }
}
