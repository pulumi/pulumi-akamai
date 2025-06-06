// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudletsSharedPolicyActivationsProductionInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of the activation that's currently in use on this network, or null if the policy has no activations.
        /// </summary>
        [Input("effective")]
        public Input<Inputs.GetCloudletsSharedPolicyActivationsProductionEffectiveInputArgs>? Effective { get; set; }

        /// <summary>
        /// The status of the latest activation or null if the policy has no activations.
        /// </summary>
        [Input("latest")]
        public Input<Inputs.GetCloudletsSharedPolicyActivationsProductionLatestInputArgs>? Latest { get; set; }

        public GetCloudletsSharedPolicyActivationsProductionInputArgs()
        {
        }
        public static new GetCloudletsSharedPolicyActivationsProductionInputArgs Empty => new GetCloudletsSharedPolicyActivationsProductionInputArgs();
    }
}
