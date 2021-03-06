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
    /// The `akamai.AppSecActivations` resource allows you to activate or deactivate a given security configuration version.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Akamai = Pulumi.Akamai;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var configuration = Output.Create(Akamai.GetAppSecConfiguration.InvokeAsync(new Akamai.GetAppSecConfigurationArgs
    ///         {
    ///             Name = "Akamai Tools",
    ///         }));
    ///         var activation = new Akamai.AppSecActivations("activation", new Akamai.AppSecActivationsArgs
    ///         {
    ///             ConfigId = configuration.Apply(configuration =&gt; configuration.ConfigId),
    ///             Version = configuration.Apply(configuration =&gt; configuration.LatestVersion),
    ///             Network = "STAGING",
    ///             Notes = "TEST Notes",
    ///             NotificationEmails = 
    ///             {
    ///                 "user@example.com",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AkamaiResourceType("akamai:index/appSecActivations:AppSecActivations")]
    public partial class AppSecActivations : Pulumi.CustomResource
    {
        /// <summary>
        /// A boolean indicating whether to activate the specified configuration version. If not supplied, True is assumed.
        /// </summary>
        [Output("activate")]
        public Output<bool?> Activate { get; private set; } = null!;

        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// The network in which the security configuration should be activated. If supplied, must be either STAGING or PRODUCTION. If not supplied, STAGING will be assumed.
        /// </summary>
        [Output("network")]
        public Output<string?> Network { get; private set; } = null!;

        /// <summary>
        /// An optional text note describing this operation.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// A bracketed, comma-separated list of email addresses that will be notified when the operation is complete.
        /// </summary>
        [Output("notificationEmails")]
        public Output<ImmutableArray<string>> NotificationEmails { get; private set; } = null!;

        /// <summary>
        /// The status of the operation. The following values are may be returned:
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a AppSecActivations resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppSecActivations(string name, AppSecActivationsArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/appSecActivations:AppSecActivations", name, args ?? new AppSecActivationsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppSecActivations(string name, Input<string> id, AppSecActivationsState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/appSecActivations:AppSecActivations", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppSecActivations resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppSecActivations Get(string name, Input<string> id, AppSecActivationsState? state = null, CustomResourceOptions? options = null)
        {
            return new AppSecActivations(name, id, state, options);
        }
    }

    public sealed class AppSecActivationsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A boolean indicating whether to activate the specified configuration version. If not supplied, True is assumed.
        /// </summary>
        [Input("activate")]
        public Input<bool>? Activate { get; set; }

        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// The network in which the security configuration should be activated. If supplied, must be either STAGING or PRODUCTION. If not supplied, STAGING will be assumed.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// An optional text note describing this operation.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("notificationEmails", required: true)]
        private InputList<string>? _notificationEmails;

        /// <summary>
        /// A bracketed, comma-separated list of email addresses that will be notified when the operation is complete.
        /// </summary>
        public InputList<string> NotificationEmails
        {
            get => _notificationEmails ?? (_notificationEmails = new InputList<string>());
            set => _notificationEmails = value;
        }

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version", required: true)]
        public Input<int> Version { get; set; } = null!;

        public AppSecActivationsArgs()
        {
        }
    }

    public sealed class AppSecActivationsState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A boolean indicating whether to activate the specified configuration version. If not supplied, True is assumed.
        /// </summary>
        [Input("activate")]
        public Input<bool>? Activate { get; set; }

        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// The network in which the security configuration should be activated. If supplied, must be either STAGING or PRODUCTION. If not supplied, STAGING will be assumed.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// An optional text note describing this operation.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("notificationEmails")]
        private InputList<string>? _notificationEmails;

        /// <summary>
        /// A bracketed, comma-separated list of email addresses that will be notified when the operation is complete.
        /// </summary>
        public InputList<string> NotificationEmails
        {
            get => _notificationEmails ?? (_notificationEmails = new InputList<string>());
            set => _notificationEmails = value;
        }

        /// <summary>
        /// The status of the operation. The following values are may be returned:
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public AppSecActivationsState()
        {
        }
    }
}
