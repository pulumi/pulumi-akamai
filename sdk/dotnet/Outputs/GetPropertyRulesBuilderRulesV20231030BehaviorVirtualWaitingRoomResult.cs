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
    public sealed class GetPropertyRulesBuilderRulesV20231030BehaviorVirtualWaitingRoomResult
    {
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? AccessTitle;
        /// <summary>
        /// This identifies the Visitor Waiting Room Cloudlet shared policy to use with this behavior. You can list available shared policies with the `Cloudlets API`.
        /// </summary>
        public readonly int? CloudletSharedPolicy;
        /// <summary>
        /// This specifies a domain for all session cookies. In case you configure many property hostnames, this may be their common domain. Make sure the user agent accepts the custom domain for any request matching the `virtualWaitingRoom` behavior. Don't use top level domains (TLDs).
        /// </summary>
        public readonly string? CustomCookieDomain;
        /// <summary>
        /// This specifies the domain used to establish a session with the visitor.
        /// </summary>
        public readonly string? DomainConfig;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Whether the queue session should prolong automatically when the `sessionDuration` expires  and the visitor remains active.
        /// </summary>
        public readonly bool? SessionAutoProlong;
        /// <summary>
        /// Specifies the number of seconds users remain in the waiting room queue.
        /// </summary>
        public readonly int? SessionDuration;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;
        /// <summary>
        /// This specifies the base paths to static resources such as JavaScript, CSS, or image files for the Waiting Room Main Page requests. The option supports the `*` wildcard that matches zero or more characters. Requests matching any of these paths aren't blocked, but marked as Waiting Room Assets and passed through to the origin. See the `virtualWaitingRoomRequest` match criteria to further customize these requests.
        /// </summary>
        public readonly ImmutableArray<string> WaitingRoomAssetsPaths;
        /// <summary>
        /// This specifies the path to the waiting room main page on the origin server, for example `/vp/waiting-room.html`. When the request is marked as Waiting Room Main Page and blocked, the visitor enters the waiting room. The behavior sets the outgoing request path to the `waitingRoomPath` and modifies the cache key accordingly. See the `virtualWaitingRoomRequest` match criteria to further customize these requests.
        /// </summary>
        public readonly string? WaitingRoomPath;
        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        public readonly string? WaitingRoomTitle;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20231030BehaviorVirtualWaitingRoomResult(
            string? accessTitle,

            int? cloudletSharedPolicy,

            string? customCookieDomain,

            string? domainConfig,

            bool? locked,

            bool? sessionAutoProlong,

            int? sessionDuration,

            string? templateUuid,

            string? uuid,

            ImmutableArray<string> waitingRoomAssetsPaths,

            string? waitingRoomPath,

            string? waitingRoomTitle)
        {
            AccessTitle = accessTitle;
            CloudletSharedPolicy = cloudletSharedPolicy;
            CustomCookieDomain = customCookieDomain;
            DomainConfig = domainConfig;
            Locked = locked;
            SessionAutoProlong = sessionAutoProlong;
            SessionDuration = sessionDuration;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            WaitingRoomAssetsPaths = waitingRoomAssetsPaths;
            WaitingRoomPath = waitingRoomPath;
            WaitingRoomTitle = waitingRoomTitle;
        }
    }
}
