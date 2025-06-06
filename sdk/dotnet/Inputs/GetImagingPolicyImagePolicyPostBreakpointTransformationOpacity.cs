// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationOpacityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
        /// </summary>
        [Input("opacity")]
        public string? Opacity { get; set; }

        /// <summary>
        /// Represents alpha values on a scale of `0` to `1`. Values below `1` increase transparency, and `0` is invisible. For images that have some transparency, values above `1` increase the opacity of the transparent portions.
        /// </summary>
        [Input("opacityVar")]
        public string? OpacityVar { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationOpacityArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationOpacityArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationOpacityArgs();
    }
}
