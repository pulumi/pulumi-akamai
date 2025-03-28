// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240813BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// When enabled, interprets the path specified by `context_root` as an absolute server path, for example to reference a site-down page. Otherwise when disabled, the path is appended to the request.
        /// </summary>
        [Input("absolutePath")]
        public bool? AbsolutePath { get; set; }

        /// <summary>
        /// Specifies the path to use in the forwarding request, typically the root (`/`) when failing over to a different data center, or a full path such as `/static/error.html` when failing over to an error page.
        /// </summary>
        [Input("contextRoot")]
        public string? ContextRoot { get; set; }

        /// <summary>
        /// The hostname of the data center to fail over to.
        /// </summary>
        [Input("failoverHostname")]
        public string? FailoverHostname { get; set; }

        /// <summary>
        /// Allows you to modify the request's hostname or path.
        /// </summary>
        [Input("modifyRequest")]
        public bool? ModifyRequest { get; set; }

        /// <summary>
        /// Overrides the request's hostname with the `failover_hostname`.
        /// </summary>
        [Input("overrideHostname")]
        public bool? OverrideHostname { get; set; }

        public GetPropertyRulesBuilderRulesV20240813BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240813BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs Empty => new GetPropertyRulesBuilderRulesV20240813BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs();
    }
}
