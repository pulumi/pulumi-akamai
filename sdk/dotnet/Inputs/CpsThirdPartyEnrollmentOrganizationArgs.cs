// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class CpsThirdPartyEnrollmentOrganizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address of organization
        /// </summary>
        [Input("addressLineOne", required: true)]
        public Input<string> AddressLineOne { get; set; } = null!;

        /// <summary>
        /// The address of organization
        /// </summary>
        [Input("addressLineTwo")]
        public Input<string>? AddressLineTwo { get; set; }

        /// <summary>
        /// City of organization
        /// </summary>
        [Input("city", required: true)]
        public Input<string> City { get; set; } = null!;

        /// <summary>
        /// Country code of organization
        /// </summary>
        [Input("countryCode", required: true)]
        public Input<string> CountryCode { get; set; } = null!;

        /// <summary>
        /// Name of organization
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Phone number of organization
        /// </summary>
        [Input("phone", required: true)]
        public Input<string> Phone { get; set; } = null!;

        /// <summary>
        /// Postal code of organization
        /// </summary>
        [Input("postalCode", required: true)]
        public Input<string> PostalCode { get; set; } = null!;

        /// <summary>
        /// The region of organization
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public CpsThirdPartyEnrollmentOrganizationArgs()
        {
        }
        public static new CpsThirdPartyEnrollmentOrganizationArgs Empty => new CpsThirdPartyEnrollmentOrganizationArgs();
    }
}
