// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Accepts requests made using credentials, like cookies or TLS client certificates.
        /// </summary>
        [Input("allowCredentials")]
        public Input<bool>? AllowCredentials { get; set; }

        /// <summary>
        /// In responses to preflight requests, defines which headers to allow when making the actual request.
        /// </summary>
        [Input("allowHeaders")]
        public Input<string>? AllowHeaders { get; set; }

        /// <summary>
        /// In responses to preflight requests, sets which origin hostnames to accept requests from.
        /// </summary>
        [Input("allowOrigins")]
        public Input<string>? AllowOrigins { get; set; }

        /// <summary>
        /// Enables CORS feature.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("exposeHeaders")]
        private InputList<string>? _exposeHeaders;

        /// <summary>
        /// In responses to preflight requests, lists names of headers that clients can access. By default, clients can access the following simple response headers: `Cache-Control`, `Content-Language`, `Content-Type`, `Expires`, `Last-Modified`, and `Pragma`. You can add other header names to make them accessible to clients.
        /// </summary>
        public InputList<string> ExposeHeaders
        {
            get => _exposeHeaders ?? (_exposeHeaders = new InputList<string>());
            set => _exposeHeaders = value;
        }

        [Input("headers")]
        private InputList<string>? _headers;

        /// <summary>
        /// Defines the supported request headers.
        /// </summary>
        public InputList<string> Headers
        {
            get => _headers ?? (_headers = new InputList<string>());
            set => _headers = value;
        }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("methods")]
        private InputList<string>? _methods;

        /// <summary>
        /// Specifies any combination of the following methods: `DELETE`, `GET`, `PATCH`, `POST`, and `PUT` that are allowed when accessing the resource from an external domain.
        /// </summary>
        public InputList<string> Methods
        {
            get => _methods ?? (_methods = new InputList<string>());
            set => _methods = value;
        }

        [Input("origins")]
        private InputList<string>? _origins;

        /// <summary>
        /// Defines the origin hostnames to accept requests from. The hostnames that you enter need to start with `http` or `https`. For detailed hostname syntax requirements, refer to RFC-952 and RFC-1123 specifications.
        /// </summary>
        public InputList<string> Origins
        {
            get => _origins ?? (_origins = new InputList<string>());
            set => _origins = value;
        }

        /// <summary>
        /// Defines the number of seconds that the browser should cache the response to a preflight request.
        /// </summary>
        [Input("preflightMaxAge")]
        public Input<string>? PreflightMaxAge { get; set; }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupportInputArgs();
    }
}
