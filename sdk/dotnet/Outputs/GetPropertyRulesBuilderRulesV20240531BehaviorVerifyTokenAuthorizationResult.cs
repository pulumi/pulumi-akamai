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
    public sealed class GetPropertyRulesBuilderRulesV20240531BehaviorVerifyTokenAuthorizationResult
    {
        /// <summary>
        /// Specifies the algorithm that generates the token. It needs to match the method chosen in the token generation code.
        /// </summary>
        public readonly string? Algorithm;
        /// <summary>
        /// URL-escapes HMAC inputs passed in as query parameters.
        /// </summary>
        public readonly bool? EscapeHmacInputs;
        /// <summary>
        /// When enabled, sends an HTTP error when an authentication test fails.
        /// </summary>
        public readonly bool? FailureResponse;
        /// <summary>
        /// Enabling this removes the query string from the URL used to form an encryption key.
        /// </summary>
        public readonly bool? IgnoreQueryString;
        /// <summary>
        /// The shared secret used to validate tokens, which needs to match the key used in the token generation code.
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Specifies where to find the token in the incoming request.
        /// </summary>
        public readonly string? Location;
        /// <summary>
        /// When `location` is `CLIENT_REQUEST_HEADER`, specifies the name of the incoming request's header where to find the token.
        /// </summary>
        public readonly string? LocationId;
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        public readonly bool? Locked;
        /// <summary>
        /// Specifies a salt string for input when generating the token, which needs to match the salt value used in the token generation code.
        /// </summary>
        public readonly string? Salt;
        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        public readonly string? TemplateUuid;
        /// <summary>
        /// Specifies a transition key as a hex value.
        /// </summary>
        public readonly string? TransitionKey;
        /// <summary>
        /// If enabled, allows you to specify advanced options such as `algorithm`, `escapeHmacInputs`, `ignoreQueryString`, `transitionKey`, and `salt`.
        /// </summary>
        public readonly bool? UseAdvanced;
        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20240531BehaviorVerifyTokenAuthorizationResult(
            string? algorithm,

            bool? escapeHmacInputs,

            bool? failureResponse,

            bool? ignoreQueryString,

            string? key,

            string? location,

            string? locationId,

            bool? locked,

            string? salt,

            string? templateUuid,

            string? transitionKey,

            bool? useAdvanced,

            string? uuid)
        {
            Algorithm = algorithm;
            EscapeHmacInputs = escapeHmacInputs;
            FailureResponse = failureResponse;
            IgnoreQueryString = ignoreQueryString;
            Key = key;
            Location = location;
            LocationId = locationId;
            Locked = locked;
            Salt = salt;
            TemplateUuid = templateUuid;
            TransitionKey = transitionKey;
            UseAdvanced = useAdvanced;
            Uuid = uuid;
        }
    }
}
