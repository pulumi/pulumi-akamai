// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the full path of the branded 403 page, including the filename, but excluding the NetStorage CP code path component.
        /// </summary>
        [Input("branded403File")]
        public string? Branded403File { get; set; }

        /// <summary>
        /// Specifies the response status code for the branded deny action.
        /// </summary>
        [Input("branded403StatusCode")]
        public int? Branded403StatusCode { get; set; }

        /// <summary>
        /// Specifies the redirect URL for the branded deny action.
        /// </summary>
        [Input("branded403Url")]
        public string? Branded403Url { get; set; }

        /// <summary>
        /// Specifies the branded response page's time to live in the cache, `5` minutes by default.
        /// </summary>
        [Input("brandedDenyCacheTtl")]
        public int? BrandedDenyCacheTtl { get; set; }

        /// <summary>
        /// Identifies the Cloudlet policy.
        /// </summary>
        [Input("cloudletPolicy")]
        public Inputs.GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlCloudletPolicyArgs? CloudletPolicy { get; set; }

        /// <summary>
        /// Identifies the Cloudlet shared policy to use with this behavior. Use the `Cloudlets API` to list available shared policies.
        /// </summary>
        [Input("cloudletSharedPolicy")]
        public int? CloudletSharedPolicy { get; set; }

        /// <summary>
        /// If enabled, serves a branded 403 page for this Cloudlet instance.
        /// </summary>
        [Input("enableBranded403")]
        public bool? EnableBranded403 { get; set; }

        /// <summary>
        /// Enables the Request Control Cloudlet.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        /// <summary>
        /// Whether you want to apply the Cloudlet shared policy to an unlimited number of properties within your account. Learn more about shared policies and how to create them in `Cloudlets Policy Manager`.
        /// </summary>
        [Input("isSharedPolicy")]
        public bool? IsSharedPolicy { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public bool? Locked { get; set; }

        /// <summary>
        /// Specifies the NetStorage domain that contains the branded 403 page.
        /// </summary>
        [Input("netStorage")]
        public Inputs.GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlNetStorageArgs? NetStorage { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlArgs Empty => new GetPropertyRulesBuilderRulesV20240531BehaviorRequestControlArgs();
    }
}
