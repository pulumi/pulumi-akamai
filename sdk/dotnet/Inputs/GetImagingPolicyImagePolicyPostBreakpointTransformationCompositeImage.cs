// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs : global::Pulumi.InvokeArgs
    {
        [Input("boxImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs>? _boxImages;

        /// <summary>
        /// A rectangular box, with a specified color and applied transformation.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs> BoxImages
        {
            get => _boxImages ?? (_boxImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs>());
            set => _boxImages = value;
        }

        [Input("circleImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs>? _circleImages;

        /// <summary>
        /// A rectangular box, with a specified color and applied transformation.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs> CircleImages
        {
            get => _circleImages ?? (_circleImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs>());
            set => _circleImages = value;
        }

        [Input("textImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs>? _textImages;

        /// <summary>
        /// A snippet of text. Defines font family and size, fill color, and outline stroke width and color.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs> TextImages
        {
            get => _textImages ?? (_textImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs>());
            set => _textImages = value;
        }

        [Input("urlImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs>? _urlImages;

        /// <summary>
        /// An image loaded from a URL.
        /// </summary>
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs> UrlImages
        {
            get => _urlImages ?? (_urlImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs>());
            set => _urlImages = value;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs();
    }
}
