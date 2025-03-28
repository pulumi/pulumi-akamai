// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20240109BehaviorClientCertificateAuthInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientCertificateAttributes")]
        private InputList<string>? _clientCertificateAttributes;

        /// <summary>
        /// Specify client certificate attributes to include in the `Client-To-Edge` authentication header that's sent to your origin server.
        /// </summary>
        public InputList<string> ClientCertificateAttributes
        {
            get => _clientCertificateAttributes ?? (_clientCertificateAttributes = new InputList<string>());
            set => _clientCertificateAttributes = value;
        }

        /// <summary>
        /// Constructs the `Client-To-Edge` authentication header using information from the client to edge mTLS handshake and forwards it to your origin. You can configure your origin to acknowledge the header to enable transitive trust. Some form of the client x.509 certificate needs to be included in the header. You can include the full certificate or specific attributes.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Whether to include the current validation status of the client certificate in the `Client-To-Edge` authentication header. This verifies the validation status of the certificate, regardless of the certificate attributes you're including in the header.
        /// </summary>
        [Input("enableClientCertificateValidationStatus")]
        public Input<bool>? EnableClientCertificateValidationStatus { get; set; }

        /// <summary>
        /// Whether to include the complete client certificate in the header, in its binary (DER) format. DER-formatted certificates leave out the `BEGIN CERTIFICATE/END CERTIFICATE` statements and most often use the `.der` extension. Alternatively, you can specify individual `clientCertificateAttributes` you want included in the request.
        /// </summary>
        [Input("enableCompleteClientCertificate")]
        public Input<bool>? EnableCompleteClientCertificate { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

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

        public GetPropertyRulesBuilderRulesV20240109BehaviorClientCertificateAuthInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20240109BehaviorClientCertificateAuthInputArgs Empty => new GetPropertyRulesBuilderRulesV20240109BehaviorClientCertificateAuthInputArgs();
    }
}
