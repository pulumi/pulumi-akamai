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
    public sealed class GetPropertyRulesBuilderRulesV20240531BehaviorRedirectResult
    {
        /// <summary>
        /// Specify how to change the requested hostname, independently from the pathname.
        /// </summary>
        public readonly string? DestinationHostname;
        /// <summary>
        /// Specifies the full hostname with which to replace the current hostname.
        /// </summary>
        public readonly string? DestinationHostnameOther;
        /// <summary>
        /// Specifies the subdomain with which to replace to the current hostname's leftmost subdomain. For example, a value of `m` changes `www.example.com` to `m.example.com`.
        /// </summary>
        public readonly string? DestinationHostnameSibling;
        /// <summary>
        /// Specifies a subdomain to prepend to the current hostname. For example, a value of `m` changes `www.example.com` to `m.www.example.com`.
        /// </summary>
        public readonly string? DestinationHostnameSubdomain;
        /// <summary>
        /// Specify how to change the requested pathname, independently from the hostname.
        /// </summary>
        public readonly string? DestinationPath;
        /// <summary>
        /// When `destinationPath` is set to `PREFIX_REQUEST`, this replaces the current path.
        /// </summary>
        public readonly string? DestinationPathOther;
        /// <summary>
        /// When `destinationPath` is set to `PREFIX_REQUEST`, this prepends the current path. For example, a value of `/prefix/path` changes `/example/index.html` to `/prefix/path/example/index.html`.
        /// </summary>
        public readonly string? DestinationPathPrefix;
        /// <summary>
        /// When `destinationPath` is set to `PREFIX_REQUEST` and `destinationPathSuffixStatus` is set to `SUFFIX`, this specifies the suffix to append to the path.
        /// </summary>
        public readonly string? DestinationPathSuffix;
        /// <summary>
        /// When `destinationPath` is set to `PREFIX_REQUEST`, this gives you the option of adding a suffix.
        /// </summary>
        public readonly string? DestinationPathSuffixStatus;
        /// <summary>
        /// Choose the protocol for the redirect URL.
        /// </summary>
        public readonly string? DestinationProtocol;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Either specify a default response for mobile browsers, or customize your own.
        /// </summary>
        public readonly string? MobileDefaultChoice;
        /// <summary>
        /// When set to `APPEND`, passes incoming query string parameters as part of the redirect URL. Otherwise set this to `IGNORE`.
        /// </summary>
        public readonly string? QueryString;
        /// <summary>
        /// Specify the redirect's response code.
        /// </summary>
        public readonly int? ResponseCode;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240531BehaviorRedirectResult(
            string? destinationHostname,

            string? destinationHostnameOther,

            string? destinationHostnameSibling,

            string? destinationHostnameSubdomain,

            string? destinationPath,

            string? destinationPathOther,

            string? destinationPathPrefix,

            string? destinationPathSuffix,

            string? destinationPathSuffixStatus,

            string? destinationProtocol,

            bool? locked,

            string? mobileDefaultChoice,

            string? queryString,

            int? responseCode,

            string? templateUuid,

            string? uuid)
        {
            DestinationHostname = destinationHostname;
            DestinationHostnameOther = destinationHostnameOther;
            DestinationHostnameSibling = destinationHostnameSibling;
            DestinationHostnameSubdomain = destinationHostnameSubdomain;
            DestinationPath = destinationPath;
            DestinationPathOther = destinationPathOther;
            DestinationPathPrefix = destinationPathPrefix;
            DestinationPathSuffix = destinationPathSuffix;
            DestinationPathSuffixStatus = destinationPathSuffixStatus;
            DestinationProtocol = destinationProtocol;
            Locked = locked;
            MobileDefaultChoice = mobileDefaultChoice;
            QueryString = queryString;
            ResponseCode = responseCode;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
