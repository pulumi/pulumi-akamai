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
    public sealed class GetPropertyRulesBuilderRulesV20250113BehaviorOriginCustomCertificateIssuerRdnsResult
    {
        public readonly string? C;
        public readonly string? Cn;
        public readonly string? O;
        public readonly string? Ou;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20250113BehaviorOriginCustomCertificateIssuerRdnsResult(
            string? c,

            string? cn,

            string? o,

            string? ou)
        {
            C = c;
            Cn = cn;
            O = o;
            Ou = ou;
        }
    }
}
