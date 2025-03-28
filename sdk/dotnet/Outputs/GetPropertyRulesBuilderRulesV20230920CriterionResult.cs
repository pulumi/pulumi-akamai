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
    public sealed class GetPropertyRulesBuilderRulesV20230920CriterionResult
    {
        /// <summary>
        /// Matches whether the `imageManager` behavior already applies to the current set of requests. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionAdvancedImMatchResult? AdvancedImMatch;
        /// <summary>
        /// This matches a specified percentage of requests when used with the accompanying behavior. Contact Akamai Professional Services for help configuring it. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionBucketResult? Bucket;
        /// <summary>
        /// Matches the current cache state.  Note that any `NO_STORE` or `BYPASS_CACHE` HTTP headers set on the origin's content overrides properties' `caching` instructions, in which case this criteria does not apply. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionCacheabilityResult? Cacheability;
        /// <summary>
        /// Identifies traffic deployed over Akamai's regional ChinaCDN infrastructure. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionChinaCdnRegionResult? ChinaCdnRegion;
        /// <summary>
        /// Matches whether you have configured a client certificate to authenticate requests to edge servers. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionClientCertificateResult? ClientCertificate;
        /// <summary>
        /// Matches the IP number of the requesting client. To use this condition to match end-user IP addresses, apply it together with the `requestType` matching on the `CLIENT_REQ` value. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionClientIpResult? ClientIp;
        /// <summary>
        /// Matches the version of the IP protocol used by the requesting client. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionClientIpVersionResult? ClientIpVersion;
        /// <summary>
        /// Allows Cloudlets Origins, referenced by label, to define their own criteria to assign custom origin definitions. The criteria may match, for example, for a specified percentage of requests defined by the cloudlet to use an alternative version of a website. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionCloudletsOriginResult? CloudletsOrigin;
        /// <summary>
        /// Specifies the type of Akamai network handling the request. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionContentDeliveryNetworkResult? ContentDeliveryNetwork;
        /// <summary>
        /// Matches the HTTP response header's `Content-Type`. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionContentTypeResult? ContentType;
        /// <summary>
        /// Match various aspects of the device or browser making the request. Based on the value of the `characteristic` option, the expected value is either a boolean, a number, or a string, possibly representing a version number. Each type of value requires a different field. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionDeviceCharacteristicResult? DeviceCharacteristic;
        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdAuthGroupsResult? EcmdAuthGroups;
        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdAuthSchemeResult? EcmdAuthScheme;
        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdIsAuthenticatedResult? EcmdIsAuthenticated;
        /// <summary>
        /// This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdUsernameResult? EcmdUsername;
        /// <summary>
        /// Checks the EdgeWorkers execution status and detects whether a customer's JavaScript failed on edge servers. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEdgeWorkersFailureResult? EdgeWorkersFailure;
        /// <summary>
        /// Matches the requested filename's extension, if present. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionResult? FileExtension;
        /// <summary>
        /// Matches the requested filename, or test whether it is present. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionFilenameResult? Filename;
        /// <summary>
        /// Matches the requested hostname. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionHostnameResult? Hostname;
        /// <summary>
        /// This specifies match criteria using Akamai XML metadata. It can only be configured on your behalf by Akamai Professional Services. This criterion is for internal usage only. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvancedResult? MatchAdvanced;
        /// <summary>
        /// Match the assigned content provider code. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchCpCodeResult? MatchCpCode;
        /// <summary>
        /// Match a set or range of HTTP response codes. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchResponseCodeResult? MatchResponseCode;
        /// <summary>
        /// Matches a built-in variable, or a custom variable pre-declared within the rule tree by the `setVariable` behavior.  See `Support for variables` for more information on this feature. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchVariableResult? MatchVariable;
        /// <summary>
        /// Matches how the current rule corresponds to low-level syntax elements in translated XML metadata, indicating progressive stages as each edge server handles the request and response.  To use this match, you need to be thoroughly familiar with how Akamai edge servers process requests. Contact your Akamai Technical representative if you need help, and test thoroughly on staging before activating on production. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMetadataStageResult? MetadataStage;
        /// <summary>
        /// Matches when the origin responds with a timeout error. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionOriginTimeoutResult? OriginTimeout;
        /// <summary>
        /// Matches the URL's non-hostname path component. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionPathResult? Path;
        /// <summary>
        /// Matches query string field names or values. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionQueryStringParameterResult? QueryStringParameter;
        /// <summary>
        /// Matches a specified percentage of requests. Use this match to apply behaviors to a percentage of your incoming requests that differ from the remainder, useful for A/b testing, or to offload traffic onto different servers. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRandomResult? Random;
        /// <summary>
        /// Matches on specified origin recovery scenarios. The `originFailureRecoveryPolicy` behavior defines the scenarios that trigger the recovery or retry methods you set in the `originFailureRecoveryMethod` rule. If the origin fails, the system checks the name of the recovery method applied to your policy. It then either redirects the requesting client to a backup origin or returns predefined HTTP response codes. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRecoveryConfigResult? RecoveryConfig;
        /// <summary>
        /// Matches a regular expression against a string, especially to apply behaviors flexibly based on the contents of dynamic `variables`. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRegularExpressionResult? RegularExpression;
        /// <summary>
        /// Match the cookie name or value passed with the request. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestCookieResult? RequestCookie;
        /// <summary>
        /// Match HTTP header names or values. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestHeaderResult? RequestHeader;
        /// <summary>
        /// Specify the request's HTTP verb. Also supports WebDAV methods and common Akamai operations. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestMethodResult? RequestMethod;
        /// <summary>
        /// Matches whether the request uses the HTTP or HTTPS protocol. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestProtocolResult? RequestProtocol;
        /// <summary>
        /// Matches the basic type of request. To use this match, you need to be thoroughly familiar with how Akamai edge servers process requests. Contact your Akamai Technical representative if you need help, and test thoroughly on staging before activating on production. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestTypeResult? RequestType;
        /// <summary>
        /// Match HTTP header names or values. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionResponseHeaderResult? ResponseHeader;
        /// <summary>
        /// The location of the Akamai server handling the request. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionServerLocationResult? ServerLocation;
        /// <summary>
        /// Specifies ranges of times during which the request occurred. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionTimeResult? Time;
        /// <summary>
        /// Match on Auth Token 2.0 verification results. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionTokenAuthorizationResult? TokenAuthorization;
        /// <summary>
        /// Matches the user agent string that helps identify the client browser and device. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionUserAgentResult? UserAgent;
        /// <summary>
        /// The client browser's approximate geographic location, determined by looking up the IP address in a database. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionUserLocationResult? UserLocation;
        /// <summary>
        /// Matches details of the network over which the request was made, determined by looking up the IP address in a database. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionUserNetworkResult? UserNetwork;
        /// <summary>
        /// Matches any runtime errors that occur on edge servers based on the configuration of a `setVariable` behavior. See `Support for variables` section for more information on this feature. This criterion can be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionVariableErrorResult? VariableError;
        /// <summary>
        /// Helps to customize the requests identified by the `virtualWaitingRoom` behavior. Use this match criteria to define the `originServer` behavior for the waiting room. This criterion cannot be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionVirtualWaitingRoomRequestResult? VirtualWaitingRoomRequest;
        /// <summary>
        /// Helps to customize the requests identified by the `visitorPrioritizationFifo` behavior. The basic use case for this match criteria is to define the `originServer` behavior for the waiting room. This criterion cannot be used in includes.
        /// </summary>
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230920CriterionVisitorPrioritizationRequestResult? VisitorPrioritizationRequest;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230920CriterionResult(
            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionAdvancedImMatchResult? advancedImMatch,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionBucketResult? bucket,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionCacheabilityResult? cacheability,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionChinaCdnRegionResult? chinaCdnRegion,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionClientCertificateResult? clientCertificate,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionClientIpResult? clientIp,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionClientIpVersionResult? clientIpVersion,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionCloudletsOriginResult? cloudletsOrigin,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionContentDeliveryNetworkResult? contentDeliveryNetwork,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionContentTypeResult? contentType,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionDeviceCharacteristicResult? deviceCharacteristic,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdAuthGroupsResult? ecmdAuthGroups,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdAuthSchemeResult? ecmdAuthScheme,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdIsAuthenticatedResult? ecmdIsAuthenticated,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEcmdUsernameResult? ecmdUsername,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionEdgeWorkersFailureResult? edgeWorkersFailure,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionResult? fileExtension,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionFilenameResult? filename,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionHostnameResult? hostname,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvancedResult? matchAdvanced,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchCpCodeResult? matchCpCode,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchResponseCodeResult? matchResponseCode,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMatchVariableResult? matchVariable,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionMetadataStageResult? metadataStage,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionOriginTimeoutResult? originTimeout,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionPathResult? path,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionQueryStringParameterResult? queryStringParameter,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRandomResult? random,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRecoveryConfigResult? recoveryConfig,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRegularExpressionResult? regularExpression,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestCookieResult? requestCookie,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestHeaderResult? requestHeader,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestMethodResult? requestMethod,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestProtocolResult? requestProtocol,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionRequestTypeResult? requestType,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionResponseHeaderResult? responseHeader,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionServerLocationResult? serverLocation,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionTimeResult? time,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionTokenAuthorizationResult? tokenAuthorization,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionUserAgentResult? userAgent,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionUserLocationResult? userLocation,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionUserNetworkResult? userNetwork,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionVariableErrorResult? variableError,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionVirtualWaitingRoomRequestResult? virtualWaitingRoomRequest,

            Outputs.GetPropertyRulesBuilderRulesV20230920CriterionVisitorPrioritizationRequestResult? visitorPrioritizationRequest)
        {
            AdvancedImMatch = advancedImMatch;
            Bucket = bucket;
            Cacheability = cacheability;
            ChinaCdnRegion = chinaCdnRegion;
            ClientCertificate = clientCertificate;
            ClientIp = clientIp;
            ClientIpVersion = clientIpVersion;
            CloudletsOrigin = cloudletsOrigin;
            ContentDeliveryNetwork = contentDeliveryNetwork;
            ContentType = contentType;
            DeviceCharacteristic = deviceCharacteristic;
            EcmdAuthGroups = ecmdAuthGroups;
            EcmdAuthScheme = ecmdAuthScheme;
            EcmdIsAuthenticated = ecmdIsAuthenticated;
            EcmdUsername = ecmdUsername;
            EdgeWorkersFailure = edgeWorkersFailure;
            FileExtension = fileExtension;
            Filename = filename;
            Hostname = hostname;
            MatchAdvanced = matchAdvanced;
            MatchCpCode = matchCpCode;
            MatchResponseCode = matchResponseCode;
            MatchVariable = matchVariable;
            MetadataStage = metadataStage;
            OriginTimeout = originTimeout;
            Path = path;
            QueryStringParameter = queryStringParameter;
            Random = random;
            RecoveryConfig = recoveryConfig;
            RegularExpression = regularExpression;
            RequestCookie = requestCookie;
            RequestHeader = requestHeader;
            RequestMethod = requestMethod;
            RequestProtocol = requestProtocol;
            RequestType = requestType;
            ResponseHeader = responseHeader;
            ServerLocation = serverLocation;
            Time = time;
            TokenAuthorization = tokenAuthorization;
            UserAgent = userAgent;
            UserLocation = userLocation;
            UserNetwork = userNetwork;
            VariableError = variableError;
            VirtualWaitingRoomRequest = virtualWaitingRoomRequest;
            VisitorPrioritizationRequest = visitorPrioritizationRequest;
        }
    }
}
