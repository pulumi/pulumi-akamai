// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationAppendImageUrlImageInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("transformation")]
        public Input<Inputs.GetImagingPolicyImagePolicyTransformationInputArgs>? Transformation { get; set; }

        /// <summary>
        /// The URL of the image.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// The URL of the image.
        /// </summary>
        [Input("urlVar")]
        public Input<string>? UrlVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationAppendImageUrlImageInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationAppendImageUrlImageInputArgs Empty => new GetImagingPolicyImagePolicyTransformationAppendImageUrlImageInputArgs();
    }
}
