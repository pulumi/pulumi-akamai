// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20250113CriterionUserLocationInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies which IP addresses determine the user's location.
        /// </summary>
        [Input("checkIps")]
        public Input<string>? CheckIps { get; set; }

        [Input("continentValues")]
        private InputList<string>? _continentValues;

        /// <summary>
        /// Continent codes.
        /// </summary>
        public InputList<string> ContinentValues
        {
            get => _continentValues ?? (_continentValues = new InputList<string>());
            set => _continentValues = value;
        }

        [Input("countryValues")]
        private InputList<string>? _countryValues;

        /// <summary>
        /// ISO 3166-1 country codes, such as `US` or `CN`.
        /// </summary>
        public InputList<string> CountryValues
        {
            get => _countryValues ?? (_countryValues = new InputList<string>());
            set => _countryValues = value;
        }

        /// <summary>
        /// Indicates the geographic scope.
        /// </summary>
        [Input("field")]
        public Input<string>? Field { get; set; }

        /// <summary>
        /// Indicates that your Akamai representative has locked this behavior or criteria so that you can't modify it. This option is for internal usage only.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
        /// </summary>
        [Input("matchOperator")]
        public Input<string>? MatchOperator { get; set; }

        [Input("regionValues")]
        private InputList<string>? _regionValues;

        /// <summary>
        /// ISO 3166 country and region codes, for example `US:MA` for Massachusetts or `JP:13` for Tokyo.
        /// </summary>
        public InputList<string> RegionValues
        {
            get => _regionValues ?? (_regionValues = new InputList<string>());
            set => _regionValues = value;
        }

        /// <summary>
        /// This option is for internal usage only.
        /// </summary>
        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        /// <summary>
        /// When connecting via a proxy server as determined by the `X-Forwarded-For` header, enabling this option matches the end client specified in the header. Disabling it matches the connecting client's IP address.
        /// </summary>
        [Input("useOnlyFirstXForwardedForIp")]
        public Input<bool>? UseOnlyFirstXForwardedForIp { get; set; }

        /// <summary>
        /// A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20250113CriterionUserLocationInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20250113CriterionUserLocationInputArgs Empty => new GetPropertyRulesBuilderRulesV20250113CriterionUserLocationInputArgs();
    }
}
