// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationBackgroundColorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The hexadecimal CSS color value for the background.
        /// </summary>
        [Input("color")]
        public string? Color { get; set; }

        /// <summary>
        /// The hexadecimal CSS color value for the background.
        /// </summary>
        [Input("colorVar")]
        public string? ColorVar { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationBackgroundColorArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationBackgroundColorArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationBackgroundColorArgs();
    }
}
