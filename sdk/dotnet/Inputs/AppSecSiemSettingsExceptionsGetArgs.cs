// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class AppSecSiemSettingsExceptionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiRequestConstraints")]
        private InputList<string>? _apiRequestConstraints;

        /// <summary>
        /// Whether there should be an exception to include api request constraints events in SIEM
        /// </summary>
        public InputList<string> ApiRequestConstraints
        {
            get => _apiRequestConstraints ?? (_apiRequestConstraints = new InputList<string>());
            set => _apiRequestConstraints = value;
        }

        [Input("aprProtections")]
        private InputList<string>? _aprProtections;

        /// <summary>
        /// Whether there should be an exception to include apr protection events in SIEM
        /// </summary>
        public InputList<string> AprProtections
        {
            get => _aprProtections ?? (_aprProtections = new InputList<string>());
            set => _aprProtections = value;
        }

        [Input("botManagements")]
        private InputList<string>? _botManagements;

        /// <summary>
        /// Whether there should be an exception to include bot management events in SIEM
        /// </summary>
        public InputList<string> BotManagements
        {
            get => _botManagements ?? (_botManagements = new InputList<string>());
            set => _botManagements = value;
        }

        [Input("clientReps")]
        private InputList<string>? _clientReps;

        /// <summary>
        /// Whether there should be an exception to include client reputation events in SIEM
        /// </summary>
        public InputList<string> ClientReps
        {
            get => _clientReps ?? (_clientReps = new InputList<string>());
            set => _clientReps = value;
        }

        [Input("customRules")]
        private InputList<string>? _customRules;

        /// <summary>
        /// Whether there should be an exception to include custom rules events in SIEM
        /// </summary>
        public InputList<string> CustomRules
        {
            get => _customRules ?? (_customRules = new InputList<string>());
            set => _customRules = value;
        }

        [Input("ipGeos")]
        private InputList<string>? _ipGeos;

        /// <summary>
        /// Whether there should be an exception to include ip geo events in SIEM
        /// </summary>
        public InputList<string> IpGeos
        {
            get => _ipGeos ?? (_ipGeos = new InputList<string>());
            set => _ipGeos = value;
        }

        [Input("malwareProtections")]
        private InputList<string>? _malwareProtections;

        /// <summary>
        /// Whether there should be an exception to include malware protection events in SIEM
        /// </summary>
        public InputList<string> MalwareProtections
        {
            get => _malwareProtections ?? (_malwareProtections = new InputList<string>());
            set => _malwareProtections = value;
        }

        [Input("rates")]
        private InputList<string>? _rates;

        /// <summary>
        /// Whether there should be an exception to include rate events in SIEM
        /// </summary>
        public InputList<string> Rates
        {
            get => _rates ?? (_rates = new InputList<string>());
            set => _rates = value;
        }

        [Input("slowPosts")]
        private InputList<string>? _slowPosts;

        /// <summary>
        /// Whether there should be an exception to include slow post events in SIEM
        /// </summary>
        public InputList<string> SlowPosts
        {
            get => _slowPosts ?? (_slowPosts = new InputList<string>());
            set => _slowPosts = value;
        }

        [Input("urlProtections")]
        private InputList<string>? _urlProtections;

        /// <summary>
        /// Whether there should be an exception to include url protection events in SIEM
        /// </summary>
        public InputList<string> UrlProtections
        {
            get => _urlProtections ?? (_urlProtections = new InputList<string>());
            set => _urlProtections = value;
        }

        [Input("wafs")]
        private InputList<string>? _wafs;

        /// <summary>
        /// Whether there should be an exception to include waf events in SIEM
        /// </summary>
        public InputList<string> Wafs
        {
            get => _wafs ?? (_wafs = new InputList<string>());
            set => _wafs = value;
        }

        public AppSecSiemSettingsExceptionsGetArgs()
        {
        }
        public static new AppSecSiemSettingsExceptionsGetArgs Empty => new AppSecSiemSettingsExceptionsGetArgs();
    }
}
