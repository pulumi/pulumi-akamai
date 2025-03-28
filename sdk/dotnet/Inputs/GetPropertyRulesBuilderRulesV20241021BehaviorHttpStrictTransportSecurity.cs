// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20241021BehaviorHttpStrictTransportSecurityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Applies HSTS to this set of requests.
        /// </summary>
        [Input("enable")]
        public bool? Enable { get; set; }

        /// <summary>
        /// When enabled, applies HSTS to all subdomains.
        /// </summary>
        [Input("includeSubDomains")]
        public bool? IncludeSubDomains { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public bool? Locked { get; set; }

        /// <summary>
        /// Specifies the duration for which to apply HSTS for new browser connections.
        /// </summary>
        [Input("maxAge")]
        public string? MaxAge { get; set; }

        /// <summary>
        /// When enabled, adds this domain to the browser's preload list. You still need to declare the domain at `hstspreload.org`.
        /// </summary>
        [Input("preload")]
        public bool? Preload { get; set; }

        /// <summary>
        /// When enabled, redirects all HTTP requests to HTTPS.
        /// </summary>
        [Input("redirect")]
        public bool? Redirect { get; set; }

        /// <summary>
        /// Specifies a response code.
        /// </summary>
        [Input("redirectStatusCode")]
        public int? RedirectStatusCode { get; set; }

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

        public GetPropertyRulesBuilderRulesV20241021BehaviorHttpStrictTransportSecurityArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20241021BehaviorHttpStrictTransportSecurityArgs Empty => new GetPropertyRulesBuilderRulesV20241021BehaviorHttpStrictTransportSecurityArgs();
    }
}
