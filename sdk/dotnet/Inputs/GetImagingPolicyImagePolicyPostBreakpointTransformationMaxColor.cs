// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The value representing the maximum number of colors to use with the source image.
        /// </summary>
        [Input("colors")]
        public string? Colors { get; set; }

        /// <summary>
        /// The value representing the maximum number of colors to use with the source image.
        /// </summary>
        [Input("colorsVar")]
        public string? ColorsVar { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColorArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColorArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColorArgs();
    }
}
