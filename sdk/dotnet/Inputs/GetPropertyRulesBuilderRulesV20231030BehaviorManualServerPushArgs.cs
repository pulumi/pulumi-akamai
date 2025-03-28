// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20231030BehaviorManualServerPushInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("serverpushlists")]
        private InputList<string>? _serverpushlists;

        /// <summary>
        /// Specifies the set of objects to load into the client browser's cache over HTTP2. Each value in the array represents a hostname and full path to the object, such as `www.example.com/js/site.js`.
        /// </summary>
        public InputList<string> Serverpushlists
        {
            get => _serverpushlists ?? (_serverpushlists = new InputList<string>());
            set => _serverpushlists = value;
        }

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

        public GetPropertyRulesBuilderRulesV20231030BehaviorManualServerPushInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20231030BehaviorManualServerPushInputArgs Empty => new GetPropertyRulesBuilderRulesV20231030BehaviorManualServerPushInputArgs();
    }
}
