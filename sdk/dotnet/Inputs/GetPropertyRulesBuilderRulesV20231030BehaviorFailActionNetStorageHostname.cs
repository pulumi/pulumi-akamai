// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20231030BehaviorFailActionNetStorageHostnameArgs : global::Pulumi.InvokeArgs
    {
        [Input("cpCode")]
        public int? CpCode { get; set; }

        [Input("downloadDomainName")]
        public string? DownloadDomainName { get; set; }

        [Input("g2oToken")]
        public string? G2oToken { get; set; }

        public GetPropertyRulesBuilderRulesV20231030BehaviorFailActionNetStorageHostnameArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20231030BehaviorFailActionNetStorageHostnameArgs Empty => new GetPropertyRulesBuilderRulesV20231030BehaviorFailActionNetStorageHostnameArgs();
    }
}
