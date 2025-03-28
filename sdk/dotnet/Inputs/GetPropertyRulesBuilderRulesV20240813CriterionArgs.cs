// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240813CriterionInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Matches whether the `imageManager` behavior already applies to the current set of requests. This criterion can be used in includes.
        /// </summary>
        [Input("advancedImMatch")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionAdvancedImMatchInputArgs>? AdvancedImMatch { get; set; }

        /// <summary>
        /// This matches a specified percentage of requests when used with the accompanying behavior. Contact Akamai Professional Services for help configuring it. This criterion can be used in includes.
        /// </summary>
        [Input("bucket")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionBucketInputArgs>? Bucket { get; set; }

        /// <summary>
        /// Matches the current cache state.  Note that any `NO_STORE` or `BYPASS_CACHE` HTTP headers set on the origin's content overrides properties' `caching` instructions, in which case this criteria does not apply. This criterion can be used in includes.
        /// </summary>
        [Input("cacheability")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionCacheabilityInputArgs>? Cacheability { get; set; }

        /// <summary>
        /// Identifies traffic deployed over Akamai's regional ChinaCDN infrastructure. This criterion can be used in includes.
        /// </summary>
        [Input("chinaCdnRegion")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionChinaCdnRegionInputArgs>? ChinaCdnRegion { get; set; }

        /// <summary>
        /// Matches whether you have configured a client certificate to authenticate requests to edge servers. This criterion can be used in includes.
        /// </summary>
        [Input("clientCertificate")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionClientCertificateInputArgs>? ClientCertificate { get; set; }

        /// <summary>
        /// Matches the IP number of the requesting client. To use this condition to match end-user IP addresses, apply it together with the `requestType` matching on the `CLIENT_REQ` value. This criterion can be used in includes.
        /// </summary>
        [Input("clientIp")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionClientIpInputArgs>? ClientIp { get; set; }

        /// <summary>
        /// Matches the version of the IP protocol used by the requesting client. This criterion can be used in includes.
        /// </summary>
        [Input("clientIpVersion")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionClientIpVersionInputArgs>? ClientIpVersion { get; set; }

        /// <summary>
        /// Allows Cloudlets Origins, referenced by label, to define their own criteria to assign custom origin definitions. The criteria may match, for example, for a specified percentage of requests defined by the cloudlet to use an alternative version of a website. This criterion can be used in includes.
        /// </summary>
        [Input("cloudletsOrigin")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionCloudletsOriginInputArgs>? CloudletsOrigin { get; set; }

        /// <summary>
        /// Specifies the type of Akamai network handling the request. This criterion can be used in includes.
        /// </summary>
        [Input("contentDeliveryNetwork")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionContentDeliveryNetworkInputArgs>? ContentDeliveryNetwork { get; set; }

        /// <summary>
        /// Matches the HTTP response header's `Content-Type`. This criterion can be used in includes.
        /// </summary>
        [Input("contentType")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionContentTypeInputArgs>? ContentType { get; set; }

        /// <summary>
        /// Match various aspects of the device or browser making the request. Based on the value of the `characteristic` option, the expected value is either a boolean, a number, or a string, possibly representing a version number. Each type of value requires a different field. This criterion can be used in includes.
        /// </summary>
        [Input("deviceCharacteristic")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionDeviceCharacteristicInputArgs>? DeviceCharacteristic { get; set; }

        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        [Input("ecmdAuthGroups")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionEcmdAuthGroupsInputArgs>? EcmdAuthGroups { get; set; }

        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        [Input("ecmdAuthScheme")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionEcmdAuthSchemeInputArgs>? EcmdAuthScheme { get; set; }

        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        [Input("ecmdIsAuthenticated")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionEcmdIsAuthenticatedInputArgs>? EcmdIsAuthenticated { get; set; }

        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        [Input("ecmdUsername")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionEcmdUsernameInputArgs>? EcmdUsername { get; set; }

        /// <summary>
        /// Checks the EdgeWorkers execution status and detects whether a customer's JavaScript failed on edge servers. This criterion can be used in includes.
        /// </summary>
        [Input("edgeWorkersFailure")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionEdgeWorkersFailureInputArgs>? EdgeWorkersFailure { get; set; }

        /// <summary>
        /// Matches the requested filename's extension, if present. This criterion can be used in includes.
        /// </summary>
        [Input("fileExtension")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionFileExtensionInputArgs>? FileExtension { get; set; }

        /// <summary>
        /// Matches the requested filename, or test whether it is present. This criterion can be used in includes.
        /// </summary>
        [Input("filename")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionFilenameInputArgs>? Filename { get; set; }

        /// <summary>
        /// Matches the requested hostname. This criterion can be used in includes.
        /// </summary>
        [Input("hostname")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionHostnameInputArgs>? Hostname { get; set; }

        /// <summary>
        /// This specifies match criteria using Akamai XML metadata. It can only be configured on your behalf by Akamai Professional Services. This criterion is for internal usage only. This criterion can be used in includes.
        /// </summary>
        [Input("matchAdvanced")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionMatchAdvancedInputArgs>? MatchAdvanced { get; set; }

        /// <summary>
        /// Match the assigned content provider code. This criterion can be used in includes.
        /// </summary>
        [Input("matchCpCode")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionMatchCpCodeInputArgs>? MatchCpCode { get; set; }

        /// <summary>
        /// Match a set or range of HTTP response codes. This criterion can be used in includes.
        /// </summary>
        [Input("matchResponseCode")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionMatchResponseCodeInputArgs>? MatchResponseCode { get; set; }

        /// <summary>
        /// Matches a built-in variable, or a custom variable pre-declared within the rule tree by the `setVariable` behavior.  See `Support for variables` for more information on this feature. This criterion can be used in includes.
        /// </summary>
        [Input("matchVariable")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionMatchVariableInputArgs>? MatchVariable { get; set; }

        /// <summary>
        /// Matches how the current rule corresponds to low-level syntax elements in translated XML metadata, indicating progressive stages as each edge server handles the request and response.  To use this match, you need to be thoroughly familiar with how Akamai edge servers process requests. Contact your Akamai Technical representative if you need help, and test thoroughly on staging before activating on production. This criterion can be used in includes.
        /// </summary>
        [Input("metadataStage")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionMetadataStageInputArgs>? MetadataStage { get; set; }

        /// <summary>
        /// Matches when the origin responds with a timeout error. This criterion can be used in includes.
        /// </summary>
        [Input("originTimeout")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionOriginTimeoutInputArgs>? OriginTimeout { get; set; }

        /// <summary>
        /// Matches the URL's non-hostname path component. This criterion can be used in includes.
        /// </summary>
        [Input("path")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionPathInputArgs>? Path { get; set; }

        /// <summary>
        /// Matches query string field names or values. This criterion can be used in includes.
        /// </summary>
        [Input("queryStringParameter")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionQueryStringParameterInputArgs>? QueryStringParameter { get; set; }

        /// <summary>
        /// Matches a specified percentage of requests. Use this match to apply behaviors to a percentage of your incoming requests that differ from the remainder, useful for A/b testing, or to offload traffic onto different servers. This criterion can be used in includes.
        /// </summary>
        [Input("random")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRandomInputArgs>? Random { get; set; }

        /// <summary>
        /// Matches on specified origin recovery scenarios. The `originFailureRecoveryPolicy` behavior defines the scenarios that trigger the recovery or retry methods you set in the `originFailureRecoveryMethod` rule. If the origin fails, the system checks the name of the recovery method applied to your policy. It then either redirects the requesting client to a backup origin or returns predefined HTTP response codes. This criterion can be used in includes.
        /// </summary>
        [Input("recoveryConfig")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRecoveryConfigInputArgs>? RecoveryConfig { get; set; }

        /// <summary>
        /// Matches a regular expression against a string, especially to apply behaviors flexibly based on the contents of dynamic `variables`. This criterion can be used in includes.
        /// </summary>
        [Input("regularExpression")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRegularExpressionInputArgs>? RegularExpression { get; set; }

        /// <summary>
        /// Match the cookie name or value passed with the request. This criterion can be used in includes.
        /// </summary>
        [Input("requestCookie")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRequestCookieInputArgs>? RequestCookie { get; set; }

        /// <summary>
        /// Match HTTP header names or values. This criterion can be used in includes.
        /// </summary>
        [Input("requestHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRequestHeaderInputArgs>? RequestHeader { get; set; }

        /// <summary>
        /// Specify the request's HTTP verb. Also supports WebDAV methods and common Akamai operations. This criterion can be used in includes.
        /// </summary>
        [Input("requestMethod")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRequestMethodInputArgs>? RequestMethod { get; set; }

        /// <summary>
        /// Matches whether the request uses the HTTP or HTTPS protocol. This criterion can be used in includes.
        /// </summary>
        [Input("requestProtocol")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRequestProtocolInputArgs>? RequestProtocol { get; set; }

        /// <summary>
        /// Matches the basic type of request. To use this match, you need to be thoroughly familiar with how Akamai edge servers process requests. Contact your Akamai Technical representative if you need help, and test thoroughly on staging before activating on production. This criterion can be used in includes.
        /// </summary>
        [Input("requestType")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionRequestTypeInputArgs>? RequestType { get; set; }

        /// <summary>
        /// Match HTTP header names or values. This criterion can be used in includes.
        /// </summary>
        [Input("responseHeader")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionResponseHeaderInputArgs>? ResponseHeader { get; set; }

        /// <summary>
        /// The location of the Akamai server handling the request. This criterion can be used in includes.
        /// </summary>
        [Input("serverLocation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionServerLocationInputArgs>? ServerLocation { get; set; }

        /// <summary>
        /// Specifies ranges of times during which the request occurred. This criterion can be used in includes.
        /// </summary>
        [Input("time")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionTimeInputArgs>? Time { get; set; }

        /// <summary>
        /// Match on Auth Token 2.0 verification results. This criterion can be used in includes.
        /// </summary>
        [Input("tokenAuthorization")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionTokenAuthorizationInputArgs>? TokenAuthorization { get; set; }

        /// <summary>
        /// Matches the user agent string that helps identify the client browser and device. This criterion can be used in includes.
        /// </summary>
        [Input("userAgent")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionUserAgentInputArgs>? UserAgent { get; set; }

        /// <summary>
        /// The client browser's approximate geographic location, determined by looking up the IP address in a database. This criterion can be used in includes.
        /// </summary>
        [Input("userLocation")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionUserLocationInputArgs>? UserLocation { get; set; }

        /// <summary>
        /// Matches details of the network over which the request was made, determined by looking up the IP address in a database. This criterion can be used in includes.
        /// </summary>
        [Input("userNetwork")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionUserNetworkInputArgs>? UserNetwork { get; set; }

        /// <summary>
        /// Matches any runtime errors that occur on edge servers based on the configuration of a `setVariable` behavior. See `Support for variables` section for more information on this feature. This criterion can be used in includes.
        /// </summary>
        [Input("variableError")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionVariableErrorInputArgs>? VariableError { get; set; }

        /// <summary>
        /// Helps to customize the requests identified by the `virtualWaitingRoom` behavior. Use this match criteria to define the `originServer` behavior for the waiting room. This criterion cannot be used in includes.
        /// </summary>
        [Input("virtualWaitingRoomRequest")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionVirtualWaitingRoomRequestInputArgs>? VirtualWaitingRoomRequest { get; set; }

        /// <summary>
        /// Helps to customize the requests identified by the `visitorPrioritizationFifo` behavior. The basic use case for this match criteria is to define the `originServer` behavior for the waiting room. This criterion cannot be used in includes.
        /// </summary>
        [Input("visitorPrioritizationRequest")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20240813CriterionVisitorPrioritizationRequestInputArgs>? VisitorPrioritizationRequest { get; set; }

        public GetPropertyRulesBuilderRulesV20240813CriterionInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240813CriterionInputArgs Empty => new GetPropertyRulesBuilderRulesV20240813CriterionInputArgs();
    }
}
