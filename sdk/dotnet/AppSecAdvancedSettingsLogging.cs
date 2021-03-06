// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    /// <summary>
    /// The `resource_akamai_appsec_advanced_settings_logging` resource allows you to enable, disable, or update HTTP header logging settings for a configuration. This operation applies at the configuration level, and therefore applies to all policies within a configuration. You may override these settings for a particular policy by specifying the policy using the security_policy_id parameter.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
    /// ```csharp
    /// using System.IO;
    /// using Pulumi;
    /// using Akamai = Pulumi.Akamai;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var configuration = Output.Create(Akamai.GetAppSecConfiguration.InvokeAsync(new Akamai.GetAppSecConfigurationArgs
    ///         {
    ///             Name = @var.Security_configuration,
    ///         }));
    ///         var logging = new Akamai.AppSecAdvancedSettingsLogging("logging", new Akamai.AppSecAdvancedSettingsLoggingArgs
    ///         {
    ///             ConfigId = configuration.Apply(configuration =&gt; configuration.ConfigId),
    ///             Version = configuration.Apply(configuration =&gt; configuration.LatestVersion),
    ///             Logging = File.ReadAllText($"{path.Module}/logging.json"),
    ///         });
    ///         // USE CASE: user wants to override the logging settings for a security policy
    ///         var policyLogging = new Akamai.AppSecAdvancedSettingsLogging("policyLogging", new Akamai.AppSecAdvancedSettingsLoggingArgs
    ///         {
    ///             ConfigId = configuration.Apply(configuration =&gt; configuration.ConfigId),
    ///             Version = configuration.Apply(configuration =&gt; configuration.LatestVersion),
    ///             SecurityPolicyId = @var.Security_policy_id,
    ///             Logging = File.ReadAllText($"{path.Module}/logging.json"),
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AkamaiResourceType("akamai:index/appSecAdvancedSettingsLogging:AppSecAdvancedSettingsLogging")]
    public partial class AppSecAdvancedSettingsLogging : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// The logging settings to apply ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#puthttpheaderloggingforaconfiguration)).
        /// </summary>
        [Output("logging")]
        public Output<string> Logging { get; private set; } = null!;

        /// <summary>
        /// The ID of a specific security policy to which the logging settings should be applied. If not supplied, the indicated settings will be applied to all policies within the configuration.
        /// </summary>
        [Output("securityPolicyId")]
        public Output<string?> SecurityPolicyId { get; private set; } = null!;

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a AppSecAdvancedSettingsLogging resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppSecAdvancedSettingsLogging(string name, AppSecAdvancedSettingsLoggingArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/appSecAdvancedSettingsLogging:AppSecAdvancedSettingsLogging", name, args ?? new AppSecAdvancedSettingsLoggingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppSecAdvancedSettingsLogging(string name, Input<string> id, AppSecAdvancedSettingsLoggingState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/appSecAdvancedSettingsLogging:AppSecAdvancedSettingsLogging", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AppSecAdvancedSettingsLogging resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppSecAdvancedSettingsLogging Get(string name, Input<string> id, AppSecAdvancedSettingsLoggingState? state = null, CustomResourceOptions? options = null)
        {
            return new AppSecAdvancedSettingsLogging(name, id, state, options);
        }
    }

    public sealed class AppSecAdvancedSettingsLoggingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// The logging settings to apply ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#puthttpheaderloggingforaconfiguration)).
        /// </summary>
        [Input("logging", required: true)]
        public Input<string> Logging { get; set; } = null!;

        /// <summary>
        /// The ID of a specific security policy to which the logging settings should be applied. If not supplied, the indicated settings will be applied to all policies within the configuration.
        /// </summary>
        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version", required: true)]
        public Input<int> Version { get; set; } = null!;

        public AppSecAdvancedSettingsLoggingArgs()
        {
        }
    }

    public sealed class AppSecAdvancedSettingsLoggingState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// The logging settings to apply ([format](https://developer.akamai.com/api/cloud_security/application_security/v1.html#puthttpheaderloggingforaconfiguration)).
        /// </summary>
        [Input("logging")]
        public Input<string>? Logging { get; set; }

        /// <summary>
        /// The ID of a specific security policy to which the logging settings should be applied. If not supplied, the indicated settings will be applied to all policies within the configuration.
        /// </summary>
        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public AppSecAdvancedSettingsLoggingState()
        {
        }
    }
}
