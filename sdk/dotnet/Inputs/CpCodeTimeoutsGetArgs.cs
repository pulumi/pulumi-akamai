// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class CpCodeTimeoutsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("update")]
        public Input<string>? Update { get; set; }

        public CpCodeTimeoutsGetArgs()
        {
        }
        public static new CpCodeTimeoutsGetArgs Empty => new CpCodeTimeoutsGetArgs();
    }
}
