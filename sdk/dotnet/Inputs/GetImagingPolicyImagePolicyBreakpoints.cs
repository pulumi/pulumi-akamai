// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyBreakpointsArgs : global::Pulumi.InvokeArgs
    {
        [Input("widths")]
        private List<int>? _widths;
        public List<int> Widths
        {
            get => _widths ?? (_widths = new List<int>());
            set => _widths = value;
        }

        public GetImagingPolicyImagePolicyBreakpointsArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyBreakpointsArgs Empty => new GetImagingPolicyImagePolicyBreakpointsArgs();
    }
}
