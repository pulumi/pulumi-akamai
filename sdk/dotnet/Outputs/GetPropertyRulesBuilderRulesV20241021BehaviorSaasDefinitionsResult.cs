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
    public sealed class GetPropertyRulesBuilderRulesV20241021BehaviorSaasDefinitionsResult
    {
        /// <summary>
        /// Specifies the request component that identifies a SaaS application.
        /// </summary>
        public readonly string? ApplicationAction;
        /// <summary>
        /// Enabling this allows you to identify applications using a `CNAME chain` rather than a single hostname.
        /// </summary>
        public readonly bool? ApplicationCnameEnabled;
        /// <summary>
        /// Specifies the number of CNAMEs to use in the chain.
        /// </summary>
        public readonly int? ApplicationCnameLevel;
        /// <summary>
        /// This specifies the name of the cookie that identifies the application.
        /// </summary>
        public readonly string? ApplicationCookie;
        /// <summary>
        /// This names the query parameter that identifies the application.
        /// </summary>
        public readonly string? ApplicationQueryString;
        /// <summary>
        /// Specifies a Perl-compatible regular expression with which to substitute the request's application ID.
        /// </summary>
        public readonly string? ApplicationRegex;
        /// <summary>
        /// Specifies a string to replace the request's application ID matched by `applicationRegex`.
        /// </summary>
        public readonly string? ApplicationReplace;
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? ApplicationTitle;
        /// <summary>
        /// Specifies the request component that identifies a SaaS customer.
        /// </summary>
        public readonly string? CustomerAction;
        /// <summary>
        /// Enabling this allows you to identify customers using a `CNAME chain` rather than a single hostname.
        /// </summary>
        public readonly bool? CustomerCnameEnabled;
        /// <summary>
        /// Specifies the number of CNAMEs to use in the chain.
        /// </summary>
        public readonly int? CustomerCnameLevel;
        /// <summary>
        /// This specifies the name of the cookie that identifies the customer.
        /// </summary>
        public readonly string? CustomerCookie;
        /// <summary>
        /// This names the query parameter that identifies the customer.
        /// </summary>
        public readonly string? CustomerQueryString;
        /// <summary>
        /// Specifies a Perl-compatible regular expression with which to substitute the request's customer ID.
        /// </summary>
        public readonly string? CustomerRegex;
        /// <summary>
        /// Specifies a string to replace the request's customer ID matched by `customerRegex`.
        /// </summary>
        public readonly string? CustomerReplace;
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? CustomerTitle;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// Specifies the request component that identifies a SaaS user.
        /// </summary>
        public readonly string? UsersAction;
        /// <summary>
        /// Enabling this allows you to identify users using a `CNAME chain` rather than a single hostname.
        /// </summary>
        public readonly bool? UsersCnameEnabled;
        /// <summary>
        /// Specifies the number of CNAMEs to use in the chain.
        /// </summary>
        public readonly int? UsersCnameLevel;
        /// <summary>
        /// This specifies the name of the cookie that identifies the user.
        /// </summary>
        public readonly string? UsersCookie;
        /// <summary>
        /// This names the query parameter that identifies the user.
        /// </summary>
        public readonly string? UsersQueryString;
        /// <summary>
        /// Specifies a Perl-compatible regular expression with which to substitute the request's user ID.
        /// </summary>
        public readonly string? UsersRegex;
        /// <summary>
        /// Specifies a string to replace the request's user ID matched by `usersRegex`.
        /// </summary>
        public readonly string? UsersReplace;
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? UsersTitle;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20241021BehaviorSaasDefinitionsResult(
            string? applicationAction,

            bool? applicationCnameEnabled,

            int? applicationCnameLevel,

            string? applicationCookie,

            string? applicationQueryString,

            string? applicationRegex,

            string? applicationReplace,

            string? applicationTitle,

            string? customerAction,

            bool? customerCnameEnabled,

            int? customerCnameLevel,

            string? customerCookie,

            string? customerQueryString,

            string? customerRegex,

            string? customerReplace,

            string? customerTitle,

            bool? locked,

            string? templateUuid,

            string? usersAction,

            bool? usersCnameEnabled,

            int? usersCnameLevel,

            string? usersCookie,

            string? usersQueryString,

            string? usersRegex,

            string? usersReplace,

            string? usersTitle,

            string? uuid)
        {
            ApplicationAction = applicationAction;
            ApplicationCnameEnabled = applicationCnameEnabled;
            ApplicationCnameLevel = applicationCnameLevel;
            ApplicationCookie = applicationCookie;
            ApplicationQueryString = applicationQueryString;
            ApplicationRegex = applicationRegex;
            ApplicationReplace = applicationReplace;
            ApplicationTitle = applicationTitle;
            CustomerAction = customerAction;
            CustomerCnameEnabled = customerCnameEnabled;
            CustomerCnameLevel = customerCnameLevel;
            CustomerCookie = customerCookie;
            CustomerQueryString = customerQueryString;
            CustomerRegex = customerRegex;
            CustomerReplace = customerReplace;
            CustomerTitle = customerTitle;
            Locked = locked;
            TemplateUuid = templateUuid;
            UsersAction = usersAction;
            UsersCnameEnabled = usersCnameEnabled;
            UsersCnameLevel = usersCnameLevel;
            UsersCookie = usersCookie;
            UsersQueryString = usersQueryString;
            UsersRegex = usersRegex;
            UsersReplace = usersReplace;
            UsersTitle = usersTitle;
            Uuid = uuid;
        }
    }
}
