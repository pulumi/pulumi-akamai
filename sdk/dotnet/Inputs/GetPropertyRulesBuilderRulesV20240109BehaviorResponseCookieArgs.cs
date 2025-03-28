// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240109BehaviorResponseCookieInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the cookie, which serves as a key to determine if the cookie is set.
        /// </summary>
        [Input("cookieName")]
        public Input<string>? CookieName { get; set; }

        /// <summary>
        /// When enabled, uses the default domain value, otherwise the set specified in the `domain` field.
        /// </summary>
        [Input("defaultDomain")]
        public Input<bool>? DefaultDomain { get; set; }

        /// <summary>
        /// When enabled, uses the default path value, otherwise the set specified in the `path` field.
        /// </summary>
        [Input("defaultPath")]
        public Input<bool>? DefaultPath { get; set; }

        /// <summary>
        /// If the `defaultDomain` is disabled, this sets the domain for which the cookie is valid. For example, `example.com` makes the cookie valid for that hostname and all subdomains.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// If `expires` is set to `DURATION`, this sets the cookie's lifetime.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// Allows you to set a response cookie.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// If `expires` is set to `FIXED_DATE`, this sets when the cookie expires as a UTC date and time.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// Sets various ways to specify when the cookie expires.
        /// </summary>
        [Input("expires")]
        public Input<string>? Expires { get; set; }

        /// <summary>
        /// When the `type` of cookie is set to `UNIQUE`, this sets the date format.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// When enabled, includes the `HttpOnly` attribute in the `Set-Cookie` response header to mitigate the risk of client-side scripts accessing the protected cookie, if the browser supports it.
        /// </summary>
        [Input("httpOnly")]
        public Input<bool>? HttpOnly { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// If the `defaultPath` is disabled, sets the path component for which the cookie is valid.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// This option controls the `SameSite` cookie attribute that reduces the risk of cross-site request forgery attacks.
        /// </summary>
        [Input("sameSite")]
        public Input<string>? SameSite { get; set; }

        /// <summary>
        /// When enabled, sets the cookie's `Secure` flag to transmit it with `HTTPS`.
        /// </summary>
        [Input("secure")]
        public Input<bool>? Secure { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// What type of value to assign.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// If the cookie `type` is `FIXED`, this specifies the cookie value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public GetPropertyRulesBuilderRulesV20240109BehaviorResponseCookieInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240109BehaviorResponseCookieInputArgs Empty => new GetPropertyRulesBuilderRulesV20240109BehaviorResponseCookieInputArgs();
    }
}
