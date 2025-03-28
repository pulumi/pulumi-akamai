// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorOriginInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the hostname to use when forming a cache key.
        /// </summary>
        [Input("cacheKeyHostname")]
        public Input<string>? CacheKeyHostname { get; set; }

        /// <summary>
        /// Enables `gzip` compression for non-NetStorage origins.
        /// </summary>
        [Input("compress")]
        public Input<bool>? Compress { get; set; }

        [Input("customCertificateAuthorities")]
        private InputList<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCustomCertificateAuthorityInputArgs>? _customCertificateAuthorities;

        /// <summary>
        /// Specifies an array of certification objects. See the `verification settings in the Origin Server behavior` or contact your Akamai representative for details on this object's requirements.
        /// </summary>
        public InputList<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCustomCertificateAuthorityInputArgs> CustomCertificateAuthorities
        {
            get => _customCertificateAuthorities ?? (_customCertificateAuthorities = new InputList<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCustomCertificateAuthorityInputArgs>());
            set => _customCertificateAuthorities = value;
        }

        [Input("customCertificates")]
        private InputList<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCustomCertificateInputArgs>? _customCertificates;

        /// <summary>
        /// Specifies an array of certification objects. See the `verification settings in the Origin Server behavior` or contact your Akamai representative for details on this object's requirements.
        /// </summary>
        public InputList<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCustomCertificateInputArgs> CustomCertificates
        {
            get => _customCertificates ?? (_customCertificates = new InputList<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginCustomCertificateInputArgs>());
            set => _customCertificates = value;
        }

        /// <summary>
        /// This specifies the name of the custom host header the edge server should pass to the origin.
        /// </summary>
        [Input("customForwardHostHeader")]
        public Input<string>? CustomForwardHostHeader { get; set; }

        [Input("customValidCnValues")]
        private InputList<string>? _customValidCnValues;

        /// <summary>
        /// Specifies values to look for in the origin certificate's `Subject Alternate Name` or `Common Name` fields. Specify `{{Origin Hostname}}` and `{{Forward Host Header}}` within the text in the order you want them to be evaluated. (Note that these two template items are not the same as in-line `variables`, which use the same curly-brace syntax.)
        /// </summary>
        public InputList<string> CustomValidCnValues
        {
            get => _customValidCnValues ?? (_customValidCnValues = new InputList<string>());
            set => _customValidCnValues = value;
        }

        /// <summary>
        /// When enabled on non-NetStorage origins, allows you to send a custom header (the `trueClientIpHeader`) identifying the IP address of the immediate client connecting to the edge server. This may provide more useful information than the standard `X-Forward-For` header, which proxies may modify.
        /// </summary>
        [Input("enableTrueClientIp")]
        public Input<bool>? EnableTrueClientIp { get; set; }

        /// <summary>
        /// When the `originType` is set to either `CUSTOMER` or `SAAS_DYNAMIC_ORIGIN`, this specifies which `Host` header to pass to the origin.
        /// </summary>
        [Input("forwardHostHeader")]
        public Input<string>? ForwardHostHeader { get; set; }

        /// <summary>
        /// Specifies the hostname or IPv4 address of your origin server, from which edge servers can retrieve your content.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Specifies the port on your origin server to which edge servers should connect for HTTP requests, customarily `80`.
        /// </summary>
        [Input("httpPort")]
        public Input<int>? HttpPort { get; set; }

        /// <summary>
        /// Specifies the port on your origin server to which edge servers should connect for secure HTTPS requests, customarily `443`. This option only applies if the property is marked as secure. See `Secure property requirements` for guidance.
        /// </summary>
        [Input("httpsPort")]
        public Input<int>? HttpsPort { get; set; }

        /// <summary>
        /// Specifies which IP version to use when getting content from the origin.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// This specifies the media's origin server.
        /// </summary>
        [Input("mslorigin")]
        public Input<string>? Mslorigin { get; set; }

        /// <summary>
        /// Specifies the details of the NetStorage server.
        /// </summary>
        [Input("netStorage")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorOriginNetStorageInputArgs>? NetStorage { get; set; }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        [Input("originCertificate")]
        public Input<string>? OriginCertificate { get; set; }

        /// <summary>
        /// Specifies which certificate to trust.
        /// </summary>
        [Input("originCertsToHonor")]
        public Input<string>? OriginCertsToHonor { get; set; }

        /// <summary>
        /// Identifies the Edge Load Balancing origin. This needs to correspond to an `edgeLoadBalancingOrigin` behavior's `id` attribute within the same property.
        /// </summary>
        [Input("originId")]
        public Input<string>? OriginId { get; set; }

        /// <summary>
        /// For non-NetStorage origins, enabling this adds a Server Name Indication (SNI) header in the SSL request sent to the origin, with the origin hostname as the value. See the `verification settings in the Origin Server behavior` or contact your Akamai representative for more information. If you want to use TLS version 1.3 in your existing properties, enable this option. New properties have this enabled by default.
        /// </summary>
        [Input("originSni")]
        public Input<bool>? OriginSni { get; set; }

        /// <summary>
        /// Choose where your content is retrieved from.
        /// </summary>
        [Input("originType")]
        public Input<string>? OriginType { get; set; }

        /// <summary>
        /// This field is only intended for export compatibility purposes, and modifying it will not impact your use of the behavior.
        /// </summary>
        [Input("ports")]
        public Input<string>? Ports { get; set; }

        /// <summary>
        /// Enabling this allows you to use a `CNAME chain` to determine the hostname for this SaaS dynamic origin.
        /// </summary>
        [Input("saasCnameEnabled")]
        public Input<bool>? SaasCnameEnabled { get; set; }

        /// <summary>
        /// Specifies the desired number of hostnames to use in the `CNAME chain`, starting backwards from the edge server.
        /// </summary>
        [Input("saasCnameLevel")]
        public Input<int>? SaasCnameLevel { get; set; }

        /// <summary>
        /// Specifies the name of the cookie that identifies this SaaS dynamic origin.
        /// </summary>
        [Input("saasCookie")]
        public Input<string>? SaasCookie { get; set; }

        /// <summary>
        /// Specifies the name of the query parameter that identifies this SaaS dynamic origin.
        /// </summary>
        [Input("saasQueryString")]
        public Input<string>? SaasQueryString { get; set; }

        /// <summary>
        /// Specifies the Perl-compatible regular expression match that identifies this SaaS dynamic origin.
        /// </summary>
        [Input("saasRegex")]
        public Input<string>? SaasRegex { get; set; }

        /// <summary>
        /// Specifies replacement text for what `saasRegex` matches.
        /// </summary>
        [Input("saasReplace")]
        public Input<string>? SaasReplace { get; set; }

        /// <summary>
        /// Specifies the static part of the SaaS dynamic origin.
        /// </summary>
        [Input("saasSuffix")]
        public Input<string>? SaasSuffix { get; set; }

        /// <summary>
        /// Specifies the part of the request that identifies this SaaS dynamic origin.
        /// </summary>
        [Input("saasType")]
        public Input<string>? SaasType { get; set; }

        /// <summary>
        /// Specifies the origin server's hostname, IPv4 address, or IPv6 address. Edge servers retrieve your content from this origin server.
        /// </summary>
        [Input("secondHostname")]
        public Input<string>? SecondHostname { get; set; }

        /// <summary>
        /// Available only for certain products. This specifies whether you want to use an additional origin server address.
        /// </summary>
        [Input("secondHostnameEnabled")]
        public Input<bool>? SecondHostnameEnabled { get; set; }

        [Input("standardCertificateAuthorities")]
        private InputList<string>? _standardCertificateAuthorities;
        public InputList<string> StandardCertificateAuthorities
        {
            get => _standardCertificateAuthorities ?? (_standardCertificateAuthorities = new InputList<string>());
            set => _standardCertificateAuthorities = value;
        }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// If a client sets the `True-Client-IP` header, the edge server allows it and passes the value to the origin. Otherwise the edge server removes it and sets the value itself.
        /// </summary>
        [Input("trueClientIpClientSetting")]
        public Input<bool>? TrueClientIpClientSetting { get; set; }

        /// <summary>
        /// This specifies the name of the field that identifies the end client's IP address, for example `True-Client-IP`.
        /// </summary>
        [Input("trueClientIpHeader")]
        public Input<string>? TrueClientIpHeader { get; set; }

        /// <summary>
        /// With a shared `hostname` such as provided by Amazon AWS, sets a unique cache key for your content.
        /// </summary>
        [Input("useUniqueCacheKey")]
        public Input<bool>? UseUniqueCacheKey { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// For non-NetStorage origins, maximize security by controlling which certificates edge servers should trust.
        /// </summary>
        [Input("verificationMode")]
        public Input<string>? VerificationMode { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorOriginInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorOriginInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorOriginInputArgs();
    }
}
