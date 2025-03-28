// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Allows you to specify custom JWT server connection values.
        /// </summary>
        [Input("customValues")]
        public Input<bool>? CustomValues { get; set; }

        /// <summary>
        /// Enables the default JWT server and sets the authentication endpoint to a default path.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the JWT server's hostname.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Specifies the path to your JWT server's authentication endpoint. This lets you generate JWTs to sign your requests.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

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

        public GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsInputArgs();
    }
}
