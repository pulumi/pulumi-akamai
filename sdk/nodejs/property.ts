// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * The `akamai.Property` resource represents an Akamai property configuration.
 * This resource lets you to create, update, and activate properties on the
 * Akamai platform.
 *
 * Akamai’s edge network caches your web assets near to servers that request them.
 * A property provides the main way to control how edge servers respond to various
 * kinds of requests for those assets. Properties apply rules to a set of hostnames,
 * and you can only apply one property at a time to any given hostname. Each property
 * is assigned to a product, which determines which behaviors you can use. Each
 * property’s default rule needs a valid content provider (CP) code assigned to bill
 * and report for the service.
 *
 * > **Note** In version 0.10 and earlier of this resource, it also controlled content provider (CP) codes, origin settings, rules, and hostname associations. Starting with version 1.0.0, this logic is broken out into individual resources.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const example = new akamai.Property("example", {
 *     productId: "prd_SPM",
 *     contractId: _var.contractid,
 *     groupId: _var.groupid,
 *     hostnames: [
 *         {
 *             cnameFrom: "example.com",
 *             cnameTo: "example.com.edgekey.net",
 *             certProvisioningType: "DEFAULT",
 *         },
 *         {
 *             cnameFrom: "www.example.com",
 *             cnameTo: "example.com.edgesuite.net",
 *             certProvisioningType: "CPS_MANAGED",
 *         },
 *     ],
 *     ruleFormat: "v2020-03-04",
 *     rules: data.akamai_property_rules_template.example.json,
 * });
 * ```
 * ## Argument reference
 *
 * This resource supports these arguments:
 *
 * * `name` - (Required) The property name.
 * * `contractId` - (Required) A contract's unique ID, including the `ctr_` prefix.
 * * `groupId` - (Required) A group's unique ID, including the `grp_` prefix.
 * * `productId` - (Required to create, otherwise Optional) A product's unique ID, including the `prd_` prefix.
 * * `hostnames` - (Optional) A mapping of public hostnames to edge hostnames. See the `akamai.getPropertyHostnames` data source for details on the necessary DNS configuration.
 *   
 *     > **Note** Starting from version 1.5.0, the `hostnames` argument supports a new block type. If you created your code and state in version 1.4 or earlier, you need to manually update your configuration and replace the previous input for `hostnames` with the new syntax. This error indicates that the state is outdated: `Error: missing expected [`. To fix it, remove `akamai.Property` from the state and import it again.
 *   
 *   Requires these additional arguments:
 *   
 *       * `cnameFrom` - (Required) A string containing the original origin's hostname. For example, `"example.org"`.
 *       * `cnameTo` - (Required) A string containing the hostname for edge content. For example,  `"example.org.edgesuite.net"`.
 *       * `certProvisioningType` - (Required) The certificate’s provisioning type, either the default `CPS_MANAGED` type for the custom certificates you provision with the [Certificate Provisioning System (CPS)](https://learn.akamai.com/en-us/products/core_features/certificate_provisioning_system.html), or `DEFAULT` for certificates provisioned automatically.
 * * `rules` - (Optional) A JSON-encoded rule tree for a given property. For this argument, you need to enter a complete JSON rule tree, unless you set up a series of JSON templates. See the `akamai.getPropertyRules` data source.
 * * `ruleFormat` - (Optional) The [rule format](https://developer.akamai.com/api/core_features/property_manager/v1.html#getruleformats) to use. Uses the latest rule format by default.
 * * `contract` - (Deprecated) Replaced by `contractId`. Maintained for legacy purposes.
 * * `group` - (Deprecated) Replaced by `groupId`. Maintained for legacy purposes.
 * * `product` - (Deprecated) Optional argument replaced by the now required `productId`. Maintained for legacy purposes.
 *
 * ## Attribute reference
 *
 * The resource returns these attributes:
 *
 * * `ruleErrors` - The contents of `errors` field returned by the API. For more information see [Errors](https://developer.akamai.com/api/core_features/property_manager/v1.html#errors) in the PAPI documentation.
 * * `latestVersion` - The version of the property you've created or updated rules for. The Akamai Provider always uses the latest version or creates a new version if latest is not editable.
 * * `productionVersion` - The current version of the property active on the Akamai production network.
 * * `stagingVersion` - The current version of the property active on the Akamai staging network.
 *
 * ### Deprecated attributes
 *
 * * `ruleWarnings` - (Deprecated) Rule warnings are no longer maintained in the state file. You can still see the warnings in logs.
 *
 * ## Import
 *
 * Basic Usagehcl resource "akamai_property" "example" {
 *
 * # (resource arguments)
 *
 *  } You can import Akamai properties by using either the `property_id` or a comma-delimited string of the property, contract, and group IDs. You'll need to enter the string of IDs if the property belongs to multiple groups or contracts. If using the string of IDs, you need to enter them in this order`property_id,contract_id,group_id` Here are some examples
 *
 * ```sh
 *  $ pulumi import akamai:index/property:Property example prp_123
 * ```
 *
 *  Or
 *
 * ```sh
 *  $ pulumi import akamai:index/property:Property example prp_123,ctr_1-AB123,grp_123
 * ```
 */
export class Property extends pulumi.CustomResource {
    /**
     * Get an existing Property resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PropertyState, opts?: pulumi.CustomResourceOptions): Property {
        return new Property(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/property:Property';

    /**
     * Returns true if the given object is an instance of Property.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Property {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Property.__pulumiType;
    }

    /**
     * @deprecated The setting "contact" has been deprecated.
     */
    public readonly contacts!: pulumi.Output<string[] | undefined>;
    /**
     * @deprecated The setting "contract" has been deprecated.
     */
    public readonly contract!: pulumi.Output<string>;
    /**
     * Contract ID to be assigned to the Property
     */
    public readonly contractId!: pulumi.Output<string>;
    /**
     * @deprecated The setting "cp_code" has been deprecated.
     */
    public readonly cpCode!: pulumi.Output<string | undefined>;
    /**
     * @deprecated The setting "group" has been deprecated.
     */
    public readonly group!: pulumi.Output<string>;
    /**
     * Group ID to be assigned to the Property
     */
    public readonly groupId!: pulumi.Output<string>;
    public readonly hostnames!: pulumi.Output<outputs.PropertyHostname[] | undefined>;
    /**
     * @deprecated The setting "is_secure" has been deprecated.
     */
    public readonly isSecure!: pulumi.Output<boolean | undefined>;
    /**
     * Property's current latest version number
     */
    public /*out*/ readonly latestVersion!: pulumi.Output<number>;
    /**
     * Name to give to the Property (must be unique)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * @deprecated The setting "origin" has been deprecated.
     */
    public readonly origins!: pulumi.Output<outputs.PropertyOrigin[] | undefined>;
    /**
     * @deprecated The setting "product" has been deprecated.
     */
    public readonly product!: pulumi.Output<string>;
    /**
     * Product ID to be assigned to the Property
     */
    public readonly productId!: pulumi.Output<string>;
    /**
     * Property's version currently activated in production (zero when not active in production)
     */
    public /*out*/ readonly productionVersion!: pulumi.Output<number>;
    public /*out*/ readonly ruleErrors!: pulumi.Output<outputs.PropertyRuleError[]>;
    /**
     * Specify the rule format version (defaults to latest version available when created)
     */
    public readonly ruleFormat!: pulumi.Output<string>;
    /**
     * @deprecated Rule warnings will not be set in state anymore
     */
    public readonly ruleWarnings!: pulumi.Output<outputs.PropertyRuleWarning[]>;
    /**
     * Property Rules as JSON
     */
    public readonly rules!: pulumi.Output<string>;
    /**
     * Property's version currently activated in staging (zero when not active in staging)
     */
    public /*out*/ readonly stagingVersion!: pulumi.Output<number>;
    /**
     * @deprecated The setting "variables" has been deprecated.
     */
    public readonly variables!: pulumi.Output<string | undefined>;

    /**
     * Create a Property resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PropertyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PropertyArgs | PropertyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PropertyState | undefined;
            inputs["contacts"] = state ? state.contacts : undefined;
            inputs["contract"] = state ? state.contract : undefined;
            inputs["contractId"] = state ? state.contractId : undefined;
            inputs["cpCode"] = state ? state.cpCode : undefined;
            inputs["group"] = state ? state.group : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["hostnames"] = state ? state.hostnames : undefined;
            inputs["isSecure"] = state ? state.isSecure : undefined;
            inputs["latestVersion"] = state ? state.latestVersion : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["origins"] = state ? state.origins : undefined;
            inputs["product"] = state ? state.product : undefined;
            inputs["productId"] = state ? state.productId : undefined;
            inputs["productionVersion"] = state ? state.productionVersion : undefined;
            inputs["ruleErrors"] = state ? state.ruleErrors : undefined;
            inputs["ruleFormat"] = state ? state.ruleFormat : undefined;
            inputs["ruleWarnings"] = state ? state.ruleWarnings : undefined;
            inputs["rules"] = state ? state.rules : undefined;
            inputs["stagingVersion"] = state ? state.stagingVersion : undefined;
            inputs["variables"] = state ? state.variables : undefined;
        } else {
            const args = argsOrState as PropertyArgs | undefined;
            inputs["contacts"] = args ? args.contacts : undefined;
            inputs["contract"] = args ? args.contract : undefined;
            inputs["contractId"] = args ? args.contractId : undefined;
            inputs["cpCode"] = args ? args.cpCode : undefined;
            inputs["group"] = args ? args.group : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["hostnames"] = args ? args.hostnames : undefined;
            inputs["isSecure"] = args ? args.isSecure : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["origins"] = args ? args.origins : undefined;
            inputs["product"] = args ? args.product : undefined;
            inputs["productId"] = args ? args.productId : undefined;
            inputs["ruleFormat"] = args ? args.ruleFormat : undefined;
            inputs["ruleWarnings"] = args ? args.ruleWarnings : undefined;
            inputs["rules"] = args ? args.rules : undefined;
            inputs["variables"] = args ? args.variables : undefined;
            inputs["latestVersion"] = undefined /*out*/;
            inputs["productionVersion"] = undefined /*out*/;
            inputs["ruleErrors"] = undefined /*out*/;
            inputs["stagingVersion"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        const aliasOpts = { aliases: [{ type: "akamai:properties/property:Property" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(Property.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Property resources.
 */
export interface PropertyState {
    /**
     * @deprecated The setting "contact" has been deprecated.
     */
    readonly contacts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * @deprecated The setting "contract" has been deprecated.
     */
    readonly contract?: pulumi.Input<string>;
    /**
     * Contract ID to be assigned to the Property
     */
    readonly contractId?: pulumi.Input<string>;
    /**
     * @deprecated The setting "cp_code" has been deprecated.
     */
    readonly cpCode?: pulumi.Input<string>;
    /**
     * @deprecated The setting "group" has been deprecated.
     */
    readonly group?: pulumi.Input<string>;
    /**
     * Group ID to be assigned to the Property
     */
    readonly groupId?: pulumi.Input<string>;
    readonly hostnames?: pulumi.Input<pulumi.Input<inputs.PropertyHostname>[]>;
    /**
     * @deprecated The setting "is_secure" has been deprecated.
     */
    readonly isSecure?: pulumi.Input<boolean>;
    /**
     * Property's current latest version number
     */
    readonly latestVersion?: pulumi.Input<number>;
    /**
     * Name to give to the Property (must be unique)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * @deprecated The setting "origin" has been deprecated.
     */
    readonly origins?: pulumi.Input<pulumi.Input<inputs.PropertyOrigin>[]>;
    /**
     * @deprecated The setting "product" has been deprecated.
     */
    readonly product?: pulumi.Input<string>;
    /**
     * Product ID to be assigned to the Property
     */
    readonly productId?: pulumi.Input<string>;
    /**
     * Property's version currently activated in production (zero when not active in production)
     */
    readonly productionVersion?: pulumi.Input<number>;
    readonly ruleErrors?: pulumi.Input<pulumi.Input<inputs.PropertyRuleError>[]>;
    /**
     * Specify the rule format version (defaults to latest version available when created)
     */
    readonly ruleFormat?: pulumi.Input<string>;
    /**
     * @deprecated Rule warnings will not be set in state anymore
     */
    readonly ruleWarnings?: pulumi.Input<pulumi.Input<inputs.PropertyRuleWarning>[]>;
    /**
     * Property Rules as JSON
     */
    readonly rules?: pulumi.Input<string>;
    /**
     * Property's version currently activated in staging (zero when not active in staging)
     */
    readonly stagingVersion?: pulumi.Input<number>;
    /**
     * @deprecated The setting "variables" has been deprecated.
     */
    readonly variables?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Property resource.
 */
export interface PropertyArgs {
    /**
     * @deprecated The setting "contact" has been deprecated.
     */
    readonly contacts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * @deprecated The setting "contract" has been deprecated.
     */
    readonly contract?: pulumi.Input<string>;
    /**
     * Contract ID to be assigned to the Property
     */
    readonly contractId?: pulumi.Input<string>;
    /**
     * @deprecated The setting "cp_code" has been deprecated.
     */
    readonly cpCode?: pulumi.Input<string>;
    /**
     * @deprecated The setting "group" has been deprecated.
     */
    readonly group?: pulumi.Input<string>;
    /**
     * Group ID to be assigned to the Property
     */
    readonly groupId?: pulumi.Input<string>;
    readonly hostnames?: pulumi.Input<pulumi.Input<inputs.PropertyHostname>[]>;
    /**
     * @deprecated The setting "is_secure" has been deprecated.
     */
    readonly isSecure?: pulumi.Input<boolean>;
    /**
     * Name to give to the Property (must be unique)
     */
    readonly name?: pulumi.Input<string>;
    /**
     * @deprecated The setting "origin" has been deprecated.
     */
    readonly origins?: pulumi.Input<pulumi.Input<inputs.PropertyOrigin>[]>;
    /**
     * @deprecated The setting "product" has been deprecated.
     */
    readonly product?: pulumi.Input<string>;
    /**
     * Product ID to be assigned to the Property
     */
    readonly productId?: pulumi.Input<string>;
    /**
     * Specify the rule format version (defaults to latest version available when created)
     */
    readonly ruleFormat?: pulumi.Input<string>;
    /**
     * @deprecated Rule warnings will not be set in state anymore
     */
    readonly ruleWarnings?: pulumi.Input<pulumi.Input<inputs.PropertyRuleWarning>[]>;
    /**
     * Property Rules as JSON
     */
    readonly rules?: pulumi.Input<string>;
    /**
     * @deprecated The setting "variables" has been deprecated.
     */
    readonly variables?: pulumi.Input<string>;
}
