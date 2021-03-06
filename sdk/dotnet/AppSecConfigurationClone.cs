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
    /// The `resource_akamai_appsec_configuration_clone` resource allows you to create a new version of a given security configuration.
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
    ///             Name = @var.Security_configuration,
    ///         }));
    ///         var contractsGroups = Output.Create(Akamai.GetAppSecContractsGroups.InvokeAsync(new Akamai.GetAppSecContractsGroupsArgs
    ///         {
    ///             Contractid = @var.Contractid,
    ///             Groupid = @var.Groupid,
    ///         }));
    ///         var selectableHostnames = Output.Tuple(configuration, configuration).Apply(values =&gt;
    ///         {
    ///             var configuration = values.Item1;
    ///             var configuration1 = values.Item2;
    ///             return Output.Create(Akamai.GetAppSecSelectableHostnames.InvokeAsync(new Akamai.GetAppSecSelectableHostnamesArgs
    ///             {
    ///                 ConfigId = configuration.ConfigId,
    ///                 Version = configuration1.LatestVersion,
    ///             }));
    ///         });
    ///         var cloneConfig = new Akamai.AppSecConfigurationClone("cloneConfig", new Akamai.AppSecConfigurationCloneArgs
    ///         {
    ///             CreateFromConfigId = configuration.Apply(configuration =&gt; configuration.ConfigId),
    ///             CreateFromVersion = configuration.Apply(configuration =&gt; configuration.LatestVersion),
    ///             Description = @var.Description,
    ///             ContractId = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.DefaultContractid),
    ///             GroupId = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.DefaultGroupid),
    ///             HostNames = selectableHostnames.Apply(selectableHostnames =&gt; selectableHostnames.Hostnames),
    ///         });
    ///         this.CloneConfigId = cloneConfig.ConfigId;
    ///         this.CloneConfigVersion = cloneConfig.Version;
    ///     }
    /// 
    ///     [Output("cloneConfigId")]
    ///     public Output&lt;string&gt; CloneConfigId { get; set; }
    ///     [Output("cloneConfigVersion")]
    ///     public Output&lt;string&gt; CloneConfigVersion { get; set; }
    /// }
    /// ```
    /// </summary>
    [AkamaiResourceType("akamai:index/appSecConfigurationClone:AppSecConfigurationClone")]
    public partial class AppSecConfigurationClone : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the newly created configuration.
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// The contract id to use.
        /// </summary>
        [Output("contractId")]
        public Output<string> ContractId { get; private set; } = null!;

        /// <summary>
        /// The ID of the configuration to be cloned.
        /// </summary>
        [Output("createFromConfigId")]
        public Output<int> CreateFromConfigId { get; private set; } = null!;

        /// <summary>
        /// The version number of the configuration to be cloned.
        /// </summary>
        [Output("createFromVersion")]
        public Output<int> CreateFromVersion { get; private set; } = null!;

        /// <summary>
        /// A description of the new configuration.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The group id to use.
        /// </summary>
        [Output("groupId")]
        public Output<int> GroupId { get; private set; } = null!;

        /// <summary>
        /// The hostnames to be protected under the new configuration.
        /// </summary>
        [Output("hostNames")]
        public Output<ImmutableArray<string>> HostNames { get; private set; } = null!;

        /// <summary>
        /// The name to be applied to the new configuration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The version number of the newly created configuration.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a AppSecConfigurationClone resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppSecConfigurationClone(string name, AppSecConfigurationCloneArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/appSecConfigurationClone:AppSecConfigurationClone", name, args ?? new AppSecConfigurationCloneArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppSecConfigurationClone(string name, Input<string> id, AppSecConfigurationCloneState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/appSecConfigurationClone:AppSecConfigurationClone", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppSecConfigurationClone resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppSecConfigurationClone Get(string name, Input<string> id, AppSecConfigurationCloneState? state = null, CustomResourceOptions? options = null)
        {
            return new AppSecConfigurationClone(name, id, state, options);
        }
    }

    public sealed class AppSecConfigurationCloneArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The contract id to use.
        /// </summary>
        [Input("contractId", required: true)]
        public Input<string> ContractId { get; set; } = null!;

        /// <summary>
        /// The ID of the configuration to be cloned.
        /// </summary>
        [Input("createFromConfigId", required: true)]
        public Input<int> CreateFromConfigId { get; set; } = null!;

        /// <summary>
        /// The version number of the configuration to be cloned.
        /// </summary>
        [Input("createFromVersion", required: true)]
        public Input<int> CreateFromVersion { get; set; } = null!;

        /// <summary>
        /// A description of the new configuration.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The group id to use.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<int> GroupId { get; set; } = null!;

        [Input("hostNames", required: true)]
        private InputList<string>? _hostNames;

        /// <summary>
        /// The hostnames to be protected under the new configuration.
        /// </summary>
        public InputList<string> HostNames
        {
            get => _hostNames ?? (_hostNames = new InputList<string>());
            set => _hostNames = value;
        }

        /// <summary>
        /// The name to be applied to the new configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AppSecConfigurationCloneArgs()
        {
        }
    }

    public sealed class AppSecConfigurationCloneState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the newly created configuration.
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// The contract id to use.
        /// </summary>
        [Input("contractId")]
        public Input<string>? ContractId { get; set; }

        /// <summary>
        /// The ID of the configuration to be cloned.
        /// </summary>
        [Input("createFromConfigId")]
        public Input<int>? CreateFromConfigId { get; set; }

        /// <summary>
        /// The version number of the configuration to be cloned.
        /// </summary>
        [Input("createFromVersion")]
        public Input<int>? CreateFromVersion { get; set; }

        /// <summary>
        /// A description of the new configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The group id to use.
        /// </summary>
        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        [Input("hostNames")]
        private InputList<string>? _hostNames;

        /// <summary>
        /// The hostnames to be protected under the new configuration.
        /// </summary>
        public InputList<string> HostNames
        {
            get => _hostNames ?? (_hostNames = new InputList<string>());
            set => _hostNames = value;
        }

        /// <summary>
        /// The name to be applied to the new configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The version number of the newly created configuration.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public AppSecConfigurationCloneState()
        {
        }
    }
}
