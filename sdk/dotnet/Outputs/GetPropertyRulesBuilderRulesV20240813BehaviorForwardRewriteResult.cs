// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20240813BehaviorForwardRewriteResult
    {
        /// <summary>
        /// Identifies the Cloudlet policy.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20240813BehaviorForwardRewriteCloudletPolicyResult? CloudletPolicy;
        /// <summary>
        /// This identifies the Cloudlet shared policy to use with this behavior. You can list available shared policies with the `Cloudlets API`.
        /// </summary>
        public readonly int? CloudletSharedPolicy;
        /// <summary>
        /// Enables the Forward Rewrite Cloudlet behavior.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Whether you want to use a shared policy for a Cloudlet. Learn more about shared policies and how to create them in `Cloudlets Policy Manager`.
        /// </summary>
        public readonly bool? IsSharedPolicy;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240813BehaviorForwardRewriteResult(
            Outputs.GetPropertyRulesBuilderRulesV20240813BehaviorForwardRewriteCloudletPolicyResult? cloudletPolicy,

            int? cloudletSharedPolicy,

            bool? enabled,

            bool? isSharedPolicy,

            bool? locked,

            string? templateUuid,

            string? uuid)
        {
            CloudletPolicy = cloudletPolicy;
            CloudletSharedPolicy = cloudletSharedPolicy;
            Enabled = enabled;
            IsSharedPolicy = isSharedPolicy;
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
