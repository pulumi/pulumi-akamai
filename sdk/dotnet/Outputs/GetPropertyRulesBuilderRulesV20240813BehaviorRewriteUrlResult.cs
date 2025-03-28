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
    public sealed class GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlResult
    {
        /// <summary>
        /// The action to perform on the path.
        /// </summary>
        public readonly string? Behavior;
        /// <summary>
        /// When enabled, retains the original path's query parameters.
        /// </summary>
        public readonly bool? KeepQueryString;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// When `behavior` is `REMOVE` or `REPLACE`, specifies the part of the incoming path you'd like to remove or modify.
        /// </summary>
        public readonly string? Match;
        /// <summary>
        /// When enabled, replaces all potential matches rather than only the first.
        /// </summary>
        public readonly bool? MatchMultiple;
        /// <summary>
        /// When `behavior` is set to `REGEX_REPLACE`, specifies the Perl-compatible regular expression to replace with `targetRegex`.
        /// </summary>
        public readonly string? MatchRegex;
        /// <summary>
        /// When `behavior` is set to `REPLACE`, this path replaces whatever the `match` field matches in the incoming request's path.
        /// </summary>
        public readonly string? TargetPath;
        /// <summary>
        /// When `behavior` is set to `PREPEND`, specifies a path to prepend to the incoming request's URL.
        /// </summary>
        public readonly string? TargetPathPrepend;
        /// <summary>
        /// When `behavior` is set to `REGEX_REPLACE`, this replaces whatever the `matchRegex` field matches, along with any captured sequences from `\$1` through `\$9`.
        /// </summary>
        public readonly string? TargetRegex;
        /// <summary>
        /// When `behavior` is set to `REWRITE`, specifies the full path to request from the origin.
        /// </summary>
        public readonly string? TargetUrl;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlResult(
            string? behavior,

            bool? keepQueryString,

            bool? locked,

            string? match,

            bool? matchMultiple,

            string? matchRegex,

            string? targetPath,

            string? targetPathPrepend,

            string? targetRegex,

            string? targetUrl,

            string? templateUuid,

            string? uuid)
        {
            Behavior = behavior;
            KeepQueryString = keepQueryString;
            Locked = locked;
            Match = match;
            MatchMultiple = matchMultiple;
            MatchRegex = matchRegex;
            TargetPath = targetPath;
            TargetPathPrepend = targetPathPrepend;
            TargetRegex = targetRegex;
            TargetUrl = targetUrl;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
