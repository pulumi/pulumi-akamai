// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class AppsecAdvancedSettingsRequestBody extends pulumi.CustomResource {
    /**
     * Get an existing AppsecAdvancedSettingsRequestBody resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppsecAdvancedSettingsRequestBodyState, opts?: pulumi.CustomResourceOptions): AppsecAdvancedSettingsRequestBody {
        return new AppsecAdvancedSettingsRequestBody(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appsecAdvancedSettingsRequestBody:AppsecAdvancedSettingsRequestBody';

    /**
     * Returns true if the given object is an instance of AppsecAdvancedSettingsRequestBody.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppsecAdvancedSettingsRequestBody {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppsecAdvancedSettingsRequestBody.__pulumiType;
    }

    /**
     * Unique identifier of the security configuration
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * Request body inspection size limit in KB allowed values are 'default', 8, 16, 32
     */
    public readonly requestBodyInspectionLimit!: pulumi.Output<string>;
    /**
     * Indicates if the Request body inspection size should be overridden at policy
     */
    public readonly requestBodyInspectionLimitOverride!: pulumi.Output<boolean | undefined>;
    /**
     * Unique identifier of the security policy
     */
    public readonly securityPolicyId!: pulumi.Output<string | undefined>;

    /**
     * Create a AppsecAdvancedSettingsRequestBody resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppsecAdvancedSettingsRequestBodyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppsecAdvancedSettingsRequestBodyArgs | AppsecAdvancedSettingsRequestBodyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppsecAdvancedSettingsRequestBodyState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["requestBodyInspectionLimit"] = state ? state.requestBodyInspectionLimit : undefined;
            resourceInputs["requestBodyInspectionLimitOverride"] = state ? state.requestBodyInspectionLimitOverride : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
        } else {
            const args = argsOrState as AppsecAdvancedSettingsRequestBodyArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.requestBodyInspectionLimit === undefined) && !opts.urn) {
                throw new Error("Missing required property 'requestBodyInspectionLimit'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["requestBodyInspectionLimit"] = args ? args.requestBodyInspectionLimit : undefined;
            resourceInputs["requestBodyInspectionLimitOverride"] = args ? args.requestBodyInspectionLimitOverride : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppsecAdvancedSettingsRequestBody.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppsecAdvancedSettingsRequestBody resources.
 */
export interface AppsecAdvancedSettingsRequestBodyState {
    /**
     * Unique identifier of the security configuration
     */
    configId?: pulumi.Input<number>;
    /**
     * Request body inspection size limit in KB allowed values are 'default', 8, 16, 32
     */
    requestBodyInspectionLimit?: pulumi.Input<string>;
    /**
     * Indicates if the Request body inspection size should be overridden at policy
     */
    requestBodyInspectionLimitOverride?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the security policy
     */
    securityPolicyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppsecAdvancedSettingsRequestBody resource.
 */
export interface AppsecAdvancedSettingsRequestBodyArgs {
    /**
     * Unique identifier of the security configuration
     */
    configId: pulumi.Input<number>;
    /**
     * Request body inspection size limit in KB allowed values are 'default', 8, 16, 32
     */
    requestBodyInspectionLimit: pulumi.Input<string>;
    /**
     * Indicates if the Request body inspection size should be overridden at policy
     */
    requestBodyInspectionLimitOverride?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the security policy
     */
    securityPolicyId?: pulumi.Input<string>;
}
