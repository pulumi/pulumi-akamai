// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs : global::Pulumi.InvokeArgs
    {
        [Input("transformation")]
        public Inputs.GetImagingPolicyImagePolicyTransformationArgs? Transformation { get; set; }

        /// <summary>
        /// The URL of the image.
        /// </summary>
        [Input("url")]
        public string? Url { get; set; }

        /// <summary>
        /// The URL of the image.
        /// </summary>
        [Input("urlVar")]
        public string? UrlVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs Empty => new GetImagingPolicyImagePolicyTransformationAppendImageUrlImageArgs();
    }
}
