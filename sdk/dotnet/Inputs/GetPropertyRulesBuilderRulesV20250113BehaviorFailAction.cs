// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20250113BehaviorFailActionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the basic action to take when there is a failure to contact the origin.
        /// </summary>
        [Input("actionType")]
        public string? ActionType { get; set; }

        [Input("allowFcmParentOverride")]
        public bool? AllowFcmParentOverride { get; set; }

        /// <summary>
        /// Specifies a custom path.
        /// </summary>
        [Input("cexCustomPath")]
        public bool? CexCustomPath { get; set; }

        /// <summary>
        /// Specifies a hostname.
        /// </summary>
        [Input("cexHostname")]
        public string? CexHostname { get; set; }

        /// <summary>
        /// Specifies a custom path.
        /// </summary>
        [Input("cexPath")]
        public string? CexPath { get; set; }

        /// <summary>
        /// Specifies a custom redirect path.
        /// </summary>
        [Input("contentCustomPath")]
        public bool? ContentCustomPath { get; set; }

        /// <summary>
        /// Specifies the static hostname for the alternate redirect.
        /// </summary>
        [Input("contentHostname")]
        public string? ContentHostname { get; set; }

        /// <summary>
        /// Specifies a custom redirect path.
        /// </summary>
        [Input("contentPath")]
        public string? ContentPath { get; set; }

        /// <summary>
        /// Specifies a CP code for which to log errors for the NetStorage location. You only need to provide the initial `id`, stripping any `cpc_` prefix to pass the integer to the rule tree. Additional CP code details may reflect back in subsequent read-only data.
        /// </summary>
        [Input("cpCode")]
        public Inputs.GetPropertyRulesBuilderRulesV20250113BehaviorFailActionCpCodeArgs? CpCode { get; set; }

        /// <summary>
        /// Allows you to modify the original requested path.
        /// </summary>
        [Input("dynamicCustomPath")]
        public bool? DynamicCustomPath { get; set; }

        /// <summary>
        /// Specifies the redirect method.
        /// </summary>
        [Input("dynamicMethod")]
        public string? DynamicMethod { get; set; }

        /// <summary>
        /// Specifies the new path.
        /// </summary>
        [Input("dynamicPath")]
        public string? DynamicPath { get; set; }

        /// <summary>
        /// When enabled in case of a failure to contact the origin, the current behavior applies.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public bool? Locked { get; set; }

        /// <summary>
        /// Modifies the redirect's protocol using the value of the `protocol` field.
        /// </summary>
        [Input("modifyProtocol")]
        public bool? ModifyProtocol { get; set; }

        /// <summary>
        /// When the `actionType` is `RECREATED_NS`, specifies the `NetStorage` origin to serve the alternate content. Contact Akamai Professional Services for your NetStorage origin's `id`.
        /// </summary>
        [Input("netStorageHostname")]
        public Inputs.GetPropertyRulesBuilderRulesV20250113BehaviorFailActionNetStorageHostnameArgs? NetStorageHostname { get; set; }

        /// <summary>
        /// When the `actionType` is `RECREATED_NS`, specifies the path for the `NetStorage` request.
        /// </summary>
        [Input("netStoragePath")]
        public string? NetStoragePath { get; set; }

        /// <summary>
        /// When using either `contentCustomPath`, `cexCustomPath`, `dynamicCustomPath`, or `redirectCustomPath` to specify a custom path, enabling this passes in the original request's query string as part of the path.
        /// </summary>
        [Input("preserveQueryString")]
        public bool? PreserveQueryString { get; set; }

        /// <summary>
        /// When the `actionType` is `REDIRECT` and `modifyProtocol` is enabled, this specifies the redirect's protocol.
        /// </summary>
        [Input("protocol")]
        public string? Protocol { get; set; }

        /// <summary>
        /// Uses the `redirectPath` to customize a new path.
        /// </summary>
        [Input("redirectCustomPath")]
        public bool? RedirectCustomPath { get; set; }

        /// <summary>
        /// When the `actionType` is `REDIRECT` and the `redirectHostnameType` is `ALTERNATE`, this specifies the hostname for the redirect.
        /// </summary>
        [Input("redirectHostname")]
        public string? RedirectHostname { get; set; }

        /// <summary>
        /// Whether to preserve or customize the hostname.
        /// </summary>
        [Input("redirectHostnameType")]
        public string? RedirectHostnameType { get; set; }

        /// <summary>
        /// Specifies the HTTP response code.
        /// </summary>
        [Input("redirectMethod")]
        public int? RedirectMethod { get; set; }

        /// <summary>
        /// Specifies a new path.
        /// </summary>
        [Input("redirectPath")]
        public string? RedirectPath { get; set; }

        /// <summary>
        /// Specifies whether to use a CNAME chain to determine the hostname for the SaaS dynamic failaction.
        /// </summary>
        [Input("saasCnameEnabled")]
        public bool? SaasCnameEnabled { get; set; }

        /// <summary>
        /// Specifies the number of elements in the CNAME chain backwards from the edge hostname that determines the hostname for the SaaS dynamic failaction.
        /// </summary>
        [Input("saasCnameLevel")]
        public int? SaasCnameLevel { get; set; }

        /// <summary>
        /// Specifies the name of the cookie that identifies this SaaS dynamic failaction.
        /// </summary>
        [Input("saasCookie")]
        public string? SaasCookie { get; set; }

        /// <summary>
        /// Specifies the name of the query parameter that identifies this SaaS dynamic failaction.
        /// </summary>
        [Input("saasQueryString")]
        public string? SaasQueryString { get; set; }

        /// <summary>
        /// Specifies the substitution pattern (a Perl-compatible regular expression) that defines the SaaS dynamic failaction.
        /// </summary>
        [Input("saasRegex")]
        public string? SaasRegex { get; set; }

        /// <summary>
        /// Specifies the replacement pattern that defines the SaaS dynamic failaction.
        /// </summary>
        [Input("saasReplace")]
        public string? SaasReplace { get; set; }

        /// <summary>
        /// Specifies the static portion of the SaaS dynamic failaction.
        /// </summary>
        [Input("saasSuffix")]
        public string? SaasSuffix { get; set; }

        /// <summary>
        /// Identifies the component of the request that identifies the SaaS dynamic fail action.
        /// </summary>
        [Input("saasType")]
        public string? SaasType { get; set; }

        /// <summary>
        /// Assigns a new HTTP status code to the failure response.
        /// </summary>
        [Input("statusCode")]
        public int? StatusCode { get; set; }

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

        public GetPropertyRulesBuilderRulesV20250113BehaviorFailActionArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20250113BehaviorFailActionArgs Empty => new GetPropertyRulesBuilderRulesV20250113BehaviorFailActionArgs();
    }
}
