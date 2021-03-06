// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetGtmDefaultDatacenter
    {
        /// <summary>
        /// Use the `akamai.getGtmDefaultDatacenter` data source to retrieve the default data center, ID, and nickname.
        /// 
        /// ## Argument reference
        /// 
        /// This data source supports these arguments:
        /// 
        /// * `domain` - (Required)
        /// * `datacenter` - (Optional) The default is `5400`.
        /// 
        /// ## Attributes reference
        /// 
        /// This data source supports these attributes:
        /// 
        /// * `id` - The data resource ID. Enter in this format: `&lt;domain&gt;:default_datacenter:&lt;datacenter_id&gt;`.
        /// * `datacenter_id` - The default data center ID.
        /// * `nickname` - The default data center nickname.
        /// </summary>
        public static Task<GetGtmDefaultDatacenterResult> InvokeAsync(GetGtmDefaultDatacenterArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGtmDefaultDatacenterResult>("akamai:index/getGtmDefaultDatacenter:getGtmDefaultDatacenter", args ?? new GetGtmDefaultDatacenterArgs(), options.WithVersion());
    }


    public sealed class GetGtmDefaultDatacenterArgs : Pulumi.InvokeArgs
    {
        [Input("datacenter")]
        public int? Datacenter { get; set; }

        [Input("domain", required: true)]
        public string Domain { get; set; } = null!;

        public GetGtmDefaultDatacenterArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetGtmDefaultDatacenterResult
    {
        public readonly int? Datacenter;
        public readonly int DatacenterId;
        public readonly string Domain;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Nickname;

        [OutputConstructor]
        private GetGtmDefaultDatacenterResult(
            int? datacenter,

            int datacenterId,

            string domain,

            string id,

            string nickname)
        {
            Datacenter = datacenter;
            DatacenterId = datacenterId;
            Domain = domain;
            Id = id;
            Nickname = nickname;
        }
    }
}
