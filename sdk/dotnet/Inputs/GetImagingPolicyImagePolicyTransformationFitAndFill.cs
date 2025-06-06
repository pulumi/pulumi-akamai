// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationFitAndFillArgs : global::Pulumi.InvokeArgs
    {
        [Input("fillTransformation")]
        public Inputs.GetImagingPolicyImagePolicyTransformationArgs? FillTransformation { get; set; }

        /// <summary>
        /// The height value of the resized image.
        /// </summary>
        [Input("height")]
        public string? Height { get; set; }

        /// <summary>
        /// The height value of the resized image.
        /// </summary>
        [Input("heightVar")]
        public string? HeightVar { get; set; }

        /// <summary>
        /// The width value of the resized image.
        /// </summary>
        [Input("width")]
        public string? Width { get; set; }

        /// <summary>
        /// The width value of the resized image.
        /// </summary>
        [Input("widthVar")]
        public string? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationFitAndFillArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationFitAndFillArgs Empty => new GetImagingPolicyImagePolicyTransformationFitAndFillArgs();
    }
}
