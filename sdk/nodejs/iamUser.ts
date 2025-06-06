// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class IamUser extends pulumi.CustomResource {
    /**
     * Get an existing IamUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IamUserState, opts?: pulumi.CustomResourceOptions): IamUser {
        return new IamUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/iamUser:IamUser';

    /**
     * Returns true if the given object is an instance of IamUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IamUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IamUser.__pulumiType;
    }

    /**
     * The user's street address.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * A user's per-group role assignments, in JSON form.
     */
    public readonly authGrantsJson!: pulumi.Output<string>;
    /**
     * The user's city.
     */
    public readonly city!: pulumi.Output<string | undefined>;
    /**
     * To help characterize the user, the value can be any that are available from the view-contact-types operation.
     */
    public readonly contactType!: pulumi.Output<string>;
    /**
     * As part of the user's location, the value can be any that are available from the view-supported-countries operation.
     */
    public readonly country!: pulumi.Output<string>;
    /**
     * The user's email address.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * Indicates whether email update is pending.
     */
    public /*out*/ readonly emailUpdatePending!: pulumi.Output<boolean>;
    /**
     * Indicates whether multi-factor authentication is allowed.
     */
    public readonly enableMfa!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates whether two-factor authentication is allowed.
     */
    public readonly enableTfa!: pulumi.Output<boolean | undefined>;
    /**
     * The user's first name.
     */
    public readonly firstName!: pulumi.Output<string>;
    /**
     * The user's position at your company.
     */
    public readonly jobTitle!: pulumi.Output<string | undefined>;
    /**
     * ISO 8601 timestamp indicating when the user last logged in.
     */
    public /*out*/ readonly lastLogin!: pulumi.Output<string>;
    /**
     * The user's surname.
     */
    public readonly lastName!: pulumi.Output<string>;
    /**
     * Flag to block a user account.
     */
    public readonly lock!: pulumi.Output<boolean | undefined>;
    /**
     * The user's mobile phone number.
     */
    public readonly mobilePhone!: pulumi.Output<string | undefined>;
    /**
     * New password for a user.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The date a user's password expires.
     */
    public /*out*/ readonly passwordExpiredAfter!: pulumi.Output<string>;
    /**
     * The user's main phone number.
     */
    public readonly phone!: pulumi.Output<string | undefined>;
    /**
     * The value can be any that are available from the view-languages operation.
     */
    public readonly preferredLanguage!: pulumi.Output<string>;
    /**
     * The user's secondary email address.
     */
    public readonly secondaryEmail!: pulumi.Output<string | undefined>;
    /**
     * The number of seconds it takes for the user's Control Center session to time out if there hasn't been any activity.
     */
    public readonly sessionTimeout!: pulumi.Output<number>;
    /**
     * The user's state.
     */
    public readonly state!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether two-factor authentication is configured.
     */
    public /*out*/ readonly tfaConfigured!: pulumi.Output<boolean>;
    /**
     * The user's time zone. The value can be any that are available from the view-time-zones operation.
     */
    public readonly timeZone!: pulumi.Output<string>;
    /**
     * A user's `loginId`. Typically, a user's email address.
     */
    public /*out*/ readonly userName!: pulumi.Output<string>;
    /**
     * Specifies email notifications the user receives for products.
     */
    public readonly userNotifications!: pulumi.Output<outputs.IamUserUserNotifications>;
    /**
     * The user's five-digit ZIP code.
     */
    public readonly zipCode!: pulumi.Output<string | undefined>;

    /**
     * Create a IamUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IamUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IamUserArgs | IamUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IamUserState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["authGrantsJson"] = state ? state.authGrantsJson : undefined;
            resourceInputs["city"] = state ? state.city : undefined;
            resourceInputs["contactType"] = state ? state.contactType : undefined;
            resourceInputs["country"] = state ? state.country : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["emailUpdatePending"] = state ? state.emailUpdatePending : undefined;
            resourceInputs["enableMfa"] = state ? state.enableMfa : undefined;
            resourceInputs["enableTfa"] = state ? state.enableTfa : undefined;
            resourceInputs["firstName"] = state ? state.firstName : undefined;
            resourceInputs["jobTitle"] = state ? state.jobTitle : undefined;
            resourceInputs["lastLogin"] = state ? state.lastLogin : undefined;
            resourceInputs["lastName"] = state ? state.lastName : undefined;
            resourceInputs["lock"] = state ? state.lock : undefined;
            resourceInputs["mobilePhone"] = state ? state.mobilePhone : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["passwordExpiredAfter"] = state ? state.passwordExpiredAfter : undefined;
            resourceInputs["phone"] = state ? state.phone : undefined;
            resourceInputs["preferredLanguage"] = state ? state.preferredLanguage : undefined;
            resourceInputs["secondaryEmail"] = state ? state.secondaryEmail : undefined;
            resourceInputs["sessionTimeout"] = state ? state.sessionTimeout : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tfaConfigured"] = state ? state.tfaConfigured : undefined;
            resourceInputs["timeZone"] = state ? state.timeZone : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
            resourceInputs["userNotifications"] = state ? state.userNotifications : undefined;
            resourceInputs["zipCode"] = state ? state.zipCode : undefined;
        } else {
            const args = argsOrState as IamUserArgs | undefined;
            if ((!args || args.authGrantsJson === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authGrantsJson'");
            }
            if ((!args || args.country === undefined) && !opts.urn) {
                throw new Error("Missing required property 'country'");
            }
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            if ((!args || args.firstName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firstName'");
            }
            if ((!args || args.lastName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lastName'");
            }
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["authGrantsJson"] = args ? args.authGrantsJson : undefined;
            resourceInputs["city"] = args ? args.city : undefined;
            resourceInputs["contactType"] = args ? args.contactType : undefined;
            resourceInputs["country"] = args ? args.country : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["enableMfa"] = args ? args.enableMfa : undefined;
            resourceInputs["enableTfa"] = args ? args.enableTfa : undefined;
            resourceInputs["firstName"] = args ? args.firstName : undefined;
            resourceInputs["jobTitle"] = args ? args.jobTitle : undefined;
            resourceInputs["lastName"] = args ? args.lastName : undefined;
            resourceInputs["lock"] = args ? args.lock : undefined;
            resourceInputs["mobilePhone"] = args ? args.mobilePhone : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["phone"] = args ? args.phone : undefined;
            resourceInputs["preferredLanguage"] = args ? args.preferredLanguage : undefined;
            resourceInputs["secondaryEmail"] = args ? args.secondaryEmail : undefined;
            resourceInputs["sessionTimeout"] = args ? args.sessionTimeout : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["timeZone"] = args ? args.timeZone : undefined;
            resourceInputs["userNotifications"] = args ? args.userNotifications : undefined;
            resourceInputs["zipCode"] = args ? args.zipCode : undefined;
            resourceInputs["emailUpdatePending"] = undefined /*out*/;
            resourceInputs["lastLogin"] = undefined /*out*/;
            resourceInputs["passwordExpiredAfter"] = undefined /*out*/;
            resourceInputs["tfaConfigured"] = undefined /*out*/;
            resourceInputs["userName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(IamUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IamUser resources.
 */
export interface IamUserState {
    /**
     * The user's street address.
     */
    address?: pulumi.Input<string>;
    /**
     * A user's per-group role assignments, in JSON form.
     */
    authGrantsJson?: pulumi.Input<string>;
    /**
     * The user's city.
     */
    city?: pulumi.Input<string>;
    /**
     * To help characterize the user, the value can be any that are available from the view-contact-types operation.
     */
    contactType?: pulumi.Input<string>;
    /**
     * As part of the user's location, the value can be any that are available from the view-supported-countries operation.
     */
    country?: pulumi.Input<string>;
    /**
     * The user's email address.
     */
    email?: pulumi.Input<string>;
    /**
     * Indicates whether email update is pending.
     */
    emailUpdatePending?: pulumi.Input<boolean>;
    /**
     * Indicates whether multi-factor authentication is allowed.
     */
    enableMfa?: pulumi.Input<boolean>;
    /**
     * Indicates whether two-factor authentication is allowed.
     */
    enableTfa?: pulumi.Input<boolean>;
    /**
     * The user's first name.
     */
    firstName?: pulumi.Input<string>;
    /**
     * The user's position at your company.
     */
    jobTitle?: pulumi.Input<string>;
    /**
     * ISO 8601 timestamp indicating when the user last logged in.
     */
    lastLogin?: pulumi.Input<string>;
    /**
     * The user's surname.
     */
    lastName?: pulumi.Input<string>;
    /**
     * Flag to block a user account.
     */
    lock?: pulumi.Input<boolean>;
    /**
     * The user's mobile phone number.
     */
    mobilePhone?: pulumi.Input<string>;
    /**
     * New password for a user.
     */
    password?: pulumi.Input<string>;
    /**
     * The date a user's password expires.
     */
    passwordExpiredAfter?: pulumi.Input<string>;
    /**
     * The user's main phone number.
     */
    phone?: pulumi.Input<string>;
    /**
     * The value can be any that are available from the view-languages operation.
     */
    preferredLanguage?: pulumi.Input<string>;
    /**
     * The user's secondary email address.
     */
    secondaryEmail?: pulumi.Input<string>;
    /**
     * The number of seconds it takes for the user's Control Center session to time out if there hasn't been any activity.
     */
    sessionTimeout?: pulumi.Input<number>;
    /**
     * The user's state.
     */
    state?: pulumi.Input<string>;
    /**
     * Indicates whether two-factor authentication is configured.
     */
    tfaConfigured?: pulumi.Input<boolean>;
    /**
     * The user's time zone. The value can be any that are available from the view-time-zones operation.
     */
    timeZone?: pulumi.Input<string>;
    /**
     * A user's `loginId`. Typically, a user's email address.
     */
    userName?: pulumi.Input<string>;
    /**
     * Specifies email notifications the user receives for products.
     */
    userNotifications?: pulumi.Input<inputs.IamUserUserNotifications>;
    /**
     * The user's five-digit ZIP code.
     */
    zipCode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IamUser resource.
 */
export interface IamUserArgs {
    /**
     * The user's street address.
     */
    address?: pulumi.Input<string>;
    /**
     * A user's per-group role assignments, in JSON form.
     */
    authGrantsJson: pulumi.Input<string>;
    /**
     * The user's city.
     */
    city?: pulumi.Input<string>;
    /**
     * To help characterize the user, the value can be any that are available from the view-contact-types operation.
     */
    contactType?: pulumi.Input<string>;
    /**
     * As part of the user's location, the value can be any that are available from the view-supported-countries operation.
     */
    country: pulumi.Input<string>;
    /**
     * The user's email address.
     */
    email: pulumi.Input<string>;
    /**
     * Indicates whether multi-factor authentication is allowed.
     */
    enableMfa?: pulumi.Input<boolean>;
    /**
     * Indicates whether two-factor authentication is allowed.
     */
    enableTfa?: pulumi.Input<boolean>;
    /**
     * The user's first name.
     */
    firstName: pulumi.Input<string>;
    /**
     * The user's position at your company.
     */
    jobTitle?: pulumi.Input<string>;
    /**
     * The user's surname.
     */
    lastName: pulumi.Input<string>;
    /**
     * Flag to block a user account.
     */
    lock?: pulumi.Input<boolean>;
    /**
     * The user's mobile phone number.
     */
    mobilePhone?: pulumi.Input<string>;
    /**
     * New password for a user.
     */
    password?: pulumi.Input<string>;
    /**
     * The user's main phone number.
     */
    phone?: pulumi.Input<string>;
    /**
     * The value can be any that are available from the view-languages operation.
     */
    preferredLanguage?: pulumi.Input<string>;
    /**
     * The user's secondary email address.
     */
    secondaryEmail?: pulumi.Input<string>;
    /**
     * The number of seconds it takes for the user's Control Center session to time out if there hasn't been any activity.
     */
    sessionTimeout?: pulumi.Input<number>;
    /**
     * The user's state.
     */
    state?: pulumi.Input<string>;
    /**
     * The user's time zone. The value can be any that are available from the view-time-zones operation.
     */
    timeZone?: pulumi.Input<string>;
    /**
     * Specifies email notifications the user receives for products.
     */
    userNotifications?: pulumi.Input<inputs.IamUserUserNotifications>;
    /**
     * The user's five-digit ZIP code.
     */
    zipCode?: pulumi.Input<string>;
}
