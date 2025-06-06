// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.IamUserUserNotificationsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamUserState extends com.pulumi.resources.ResourceArgs {

    public static final IamUserState Empty = new IamUserState();

    /**
     * The user&#39;s street address.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The user&#39;s street address.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * A user&#39;s per-group role assignments, in JSON form.
     * 
     */
    @Import(name="authGrantsJson")
    private @Nullable Output<String> authGrantsJson;

    /**
     * @return A user&#39;s per-group role assignments, in JSON form.
     * 
     */
    public Optional<Output<String>> authGrantsJson() {
        return Optional.ofNullable(this.authGrantsJson);
    }

    /**
     * The user&#39;s city.
     * 
     */
    @Import(name="city")
    private @Nullable Output<String> city;

    /**
     * @return The user&#39;s city.
     * 
     */
    public Optional<Output<String>> city() {
        return Optional.ofNullable(this.city);
    }

    /**
     * To help characterize the user, the value can be any that are available from the view-contact-types operation.
     * 
     */
    @Import(name="contactType")
    private @Nullable Output<String> contactType;

    /**
     * @return To help characterize the user, the value can be any that are available from the view-contact-types operation.
     * 
     */
    public Optional<Output<String>> contactType() {
        return Optional.ofNullable(this.contactType);
    }

    /**
     * As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation.
     * 
     */
    @Import(name="country")
    private @Nullable Output<String> country;

    /**
     * @return As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation.
     * 
     */
    public Optional<Output<String>> country() {
        return Optional.ofNullable(this.country);
    }

    /**
     * The user&#39;s email address.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The user&#39;s email address.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Indicates whether email update is pending.
     * 
     */
    @Import(name="emailUpdatePending")
    private @Nullable Output<Boolean> emailUpdatePending;

    /**
     * @return Indicates whether email update is pending.
     * 
     */
    public Optional<Output<Boolean>> emailUpdatePending() {
        return Optional.ofNullable(this.emailUpdatePending);
    }

    /**
     * Indicates whether multi-factor authentication is allowed.
     * 
     */
    @Import(name="enableMfa")
    private @Nullable Output<Boolean> enableMfa;

    /**
     * @return Indicates whether multi-factor authentication is allowed.
     * 
     */
    public Optional<Output<Boolean>> enableMfa() {
        return Optional.ofNullable(this.enableMfa);
    }

    /**
     * Indicates whether two-factor authentication is allowed.
     * 
     */
    @Import(name="enableTfa")
    private @Nullable Output<Boolean> enableTfa;

    /**
     * @return Indicates whether two-factor authentication is allowed.
     * 
     */
    public Optional<Output<Boolean>> enableTfa() {
        return Optional.ofNullable(this.enableTfa);
    }

    /**
     * The user&#39;s first name.
     * 
     */
    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    /**
     * @return The user&#39;s first name.
     * 
     */
    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * The user&#39;s position at your company.
     * 
     */
    @Import(name="jobTitle")
    private @Nullable Output<String> jobTitle;

    /**
     * @return The user&#39;s position at your company.
     * 
     */
    public Optional<Output<String>> jobTitle() {
        return Optional.ofNullable(this.jobTitle);
    }

    /**
     * ISO 8601 timestamp indicating when the user last logged in.
     * 
     */
    @Import(name="lastLogin")
    private @Nullable Output<String> lastLogin;

    /**
     * @return ISO 8601 timestamp indicating when the user last logged in.
     * 
     */
    public Optional<Output<String>> lastLogin() {
        return Optional.ofNullable(this.lastLogin);
    }

    /**
     * The user&#39;s surname.
     * 
     */
    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    /**
     * @return The user&#39;s surname.
     * 
     */
    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    /**
     * Flag to block a user account.
     * 
     */
    @Import(name="lock")
    private @Nullable Output<Boolean> lock;

    /**
     * @return Flag to block a user account.
     * 
     */
    public Optional<Output<Boolean>> lock() {
        return Optional.ofNullable(this.lock);
    }

    /**
     * The user&#39;s mobile phone number.
     * 
     */
    @Import(name="mobilePhone")
    private @Nullable Output<String> mobilePhone;

    /**
     * @return The user&#39;s mobile phone number.
     * 
     */
    public Optional<Output<String>> mobilePhone() {
        return Optional.ofNullable(this.mobilePhone);
    }

    /**
     * New password for a user.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return New password for a user.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The date a user&#39;s password expires.
     * 
     */
    @Import(name="passwordExpiredAfter")
    private @Nullable Output<String> passwordExpiredAfter;

    /**
     * @return The date a user&#39;s password expires.
     * 
     */
    public Optional<Output<String>> passwordExpiredAfter() {
        return Optional.ofNullable(this.passwordExpiredAfter);
    }

    /**
     * The user&#39;s main phone number.
     * 
     */
    @Import(name="phone")
    private @Nullable Output<String> phone;

    /**
     * @return The user&#39;s main phone number.
     * 
     */
    public Optional<Output<String>> phone() {
        return Optional.ofNullable(this.phone);
    }

    /**
     * The value can be any that are available from the view-languages operation.
     * 
     */
    @Import(name="preferredLanguage")
    private @Nullable Output<String> preferredLanguage;

    /**
     * @return The value can be any that are available from the view-languages operation.
     * 
     */
    public Optional<Output<String>> preferredLanguage() {
        return Optional.ofNullable(this.preferredLanguage);
    }

    /**
     * The user&#39;s secondary email address.
     * 
     */
    @Import(name="secondaryEmail")
    private @Nullable Output<String> secondaryEmail;

    /**
     * @return The user&#39;s secondary email address.
     * 
     */
    public Optional<Output<String>> secondaryEmail() {
        return Optional.ofNullable(this.secondaryEmail);
    }

    /**
     * The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity.
     * 
     */
    @Import(name="sessionTimeout")
    private @Nullable Output<Integer> sessionTimeout;

    /**
     * @return The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity.
     * 
     */
    public Optional<Output<Integer>> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }

    /**
     * The user&#39;s state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The user&#39;s state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Indicates whether two-factor authentication is configured.
     * 
     */
    @Import(name="tfaConfigured")
    private @Nullable Output<Boolean> tfaConfigured;

    /**
     * @return Indicates whether two-factor authentication is configured.
     * 
     */
    public Optional<Output<Boolean>> tfaConfigured() {
        return Optional.ofNullable(this.tfaConfigured);
    }

    /**
     * The user&#39;s time zone. The value can be any that are available from the view-time-zones operation.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The user&#39;s time zone. The value can be any that are available from the view-time-zones operation.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * A user&#39;s `loginId`. Typically, a user&#39;s email address.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return A user&#39;s `loginId`. Typically, a user&#39;s email address.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    /**
     * Specifies email notifications the user receives for products.
     * 
     */
    @Import(name="userNotifications")
    private @Nullable Output<IamUserUserNotificationsArgs> userNotifications;

    /**
     * @return Specifies email notifications the user receives for products.
     * 
     */
    public Optional<Output<IamUserUserNotificationsArgs>> userNotifications() {
        return Optional.ofNullable(this.userNotifications);
    }

    /**
     * The user&#39;s five-digit ZIP code.
     * 
     */
    @Import(name="zipCode")
    private @Nullable Output<String> zipCode;

    /**
     * @return The user&#39;s five-digit ZIP code.
     * 
     */
    public Optional<Output<String>> zipCode() {
        return Optional.ofNullable(this.zipCode);
    }

    private IamUserState() {}

    private IamUserState(IamUserState $) {
        this.address = $.address;
        this.authGrantsJson = $.authGrantsJson;
        this.city = $.city;
        this.contactType = $.contactType;
        this.country = $.country;
        this.email = $.email;
        this.emailUpdatePending = $.emailUpdatePending;
        this.enableMfa = $.enableMfa;
        this.enableTfa = $.enableTfa;
        this.firstName = $.firstName;
        this.jobTitle = $.jobTitle;
        this.lastLogin = $.lastLogin;
        this.lastName = $.lastName;
        this.lock = $.lock;
        this.mobilePhone = $.mobilePhone;
        this.password = $.password;
        this.passwordExpiredAfter = $.passwordExpiredAfter;
        this.phone = $.phone;
        this.preferredLanguage = $.preferredLanguage;
        this.secondaryEmail = $.secondaryEmail;
        this.sessionTimeout = $.sessionTimeout;
        this.state = $.state;
        this.tfaConfigured = $.tfaConfigured;
        this.timeZone = $.timeZone;
        this.userName = $.userName;
        this.userNotifications = $.userNotifications;
        this.zipCode = $.zipCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamUserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamUserState $;

        public Builder() {
            $ = new IamUserState();
        }

        public Builder(IamUserState defaults) {
            $ = new IamUserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The user&#39;s street address.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The user&#39;s street address.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param authGrantsJson A user&#39;s per-group role assignments, in JSON form.
         * 
         * @return builder
         * 
         */
        public Builder authGrantsJson(@Nullable Output<String> authGrantsJson) {
            $.authGrantsJson = authGrantsJson;
            return this;
        }

        /**
         * @param authGrantsJson A user&#39;s per-group role assignments, in JSON form.
         * 
         * @return builder
         * 
         */
        public Builder authGrantsJson(String authGrantsJson) {
            return authGrantsJson(Output.of(authGrantsJson));
        }

        /**
         * @param city The user&#39;s city.
         * 
         * @return builder
         * 
         */
        public Builder city(@Nullable Output<String> city) {
            $.city = city;
            return this;
        }

        /**
         * @param city The user&#39;s city.
         * 
         * @return builder
         * 
         */
        public Builder city(String city) {
            return city(Output.of(city));
        }

        /**
         * @param contactType To help characterize the user, the value can be any that are available from the view-contact-types operation.
         * 
         * @return builder
         * 
         */
        public Builder contactType(@Nullable Output<String> contactType) {
            $.contactType = contactType;
            return this;
        }

        /**
         * @param contactType To help characterize the user, the value can be any that are available from the view-contact-types operation.
         * 
         * @return builder
         * 
         */
        public Builder contactType(String contactType) {
            return contactType(Output.of(contactType));
        }

        /**
         * @param country As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation.
         * 
         * @return builder
         * 
         */
        public Builder country(@Nullable Output<String> country) {
            $.country = country;
            return this;
        }

        /**
         * @param country As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation.
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            return country(Output.of(country));
        }

        /**
         * @param email The user&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The user&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param emailUpdatePending Indicates whether email update is pending.
         * 
         * @return builder
         * 
         */
        public Builder emailUpdatePending(@Nullable Output<Boolean> emailUpdatePending) {
            $.emailUpdatePending = emailUpdatePending;
            return this;
        }

        /**
         * @param emailUpdatePending Indicates whether email update is pending.
         * 
         * @return builder
         * 
         */
        public Builder emailUpdatePending(Boolean emailUpdatePending) {
            return emailUpdatePending(Output.of(emailUpdatePending));
        }

        /**
         * @param enableMfa Indicates whether multi-factor authentication is allowed.
         * 
         * @return builder
         * 
         */
        public Builder enableMfa(@Nullable Output<Boolean> enableMfa) {
            $.enableMfa = enableMfa;
            return this;
        }

        /**
         * @param enableMfa Indicates whether multi-factor authentication is allowed.
         * 
         * @return builder
         * 
         */
        public Builder enableMfa(Boolean enableMfa) {
            return enableMfa(Output.of(enableMfa));
        }

        /**
         * @param enableTfa Indicates whether two-factor authentication is allowed.
         * 
         * @return builder
         * 
         */
        public Builder enableTfa(@Nullable Output<Boolean> enableTfa) {
            $.enableTfa = enableTfa;
            return this;
        }

        /**
         * @param enableTfa Indicates whether two-factor authentication is allowed.
         * 
         * @return builder
         * 
         */
        public Builder enableTfa(Boolean enableTfa) {
            return enableTfa(Output.of(enableTfa));
        }

        /**
         * @param firstName The user&#39;s first name.
         * 
         * @return builder
         * 
         */
        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName The user&#39;s first name.
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param jobTitle The user&#39;s position at your company.
         * 
         * @return builder
         * 
         */
        public Builder jobTitle(@Nullable Output<String> jobTitle) {
            $.jobTitle = jobTitle;
            return this;
        }

        /**
         * @param jobTitle The user&#39;s position at your company.
         * 
         * @return builder
         * 
         */
        public Builder jobTitle(String jobTitle) {
            return jobTitle(Output.of(jobTitle));
        }

        /**
         * @param lastLogin ISO 8601 timestamp indicating when the user last logged in.
         * 
         * @return builder
         * 
         */
        public Builder lastLogin(@Nullable Output<String> lastLogin) {
            $.lastLogin = lastLogin;
            return this;
        }

        /**
         * @param lastLogin ISO 8601 timestamp indicating when the user last logged in.
         * 
         * @return builder
         * 
         */
        public Builder lastLogin(String lastLogin) {
            return lastLogin(Output.of(lastLogin));
        }

        /**
         * @param lastName The user&#39;s surname.
         * 
         * @return builder
         * 
         */
        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName The user&#39;s surname.
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        /**
         * @param lock Flag to block a user account.
         * 
         * @return builder
         * 
         */
        public Builder lock(@Nullable Output<Boolean> lock) {
            $.lock = lock;
            return this;
        }

        /**
         * @param lock Flag to block a user account.
         * 
         * @return builder
         * 
         */
        public Builder lock(Boolean lock) {
            return lock(Output.of(lock));
        }

        /**
         * @param mobilePhone The user&#39;s mobile phone number.
         * 
         * @return builder
         * 
         */
        public Builder mobilePhone(@Nullable Output<String> mobilePhone) {
            $.mobilePhone = mobilePhone;
            return this;
        }

        /**
         * @param mobilePhone The user&#39;s mobile phone number.
         * 
         * @return builder
         * 
         */
        public Builder mobilePhone(String mobilePhone) {
            return mobilePhone(Output.of(mobilePhone));
        }

        /**
         * @param password New password for a user.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password New password for a user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param passwordExpiredAfter The date a user&#39;s password expires.
         * 
         * @return builder
         * 
         */
        public Builder passwordExpiredAfter(@Nullable Output<String> passwordExpiredAfter) {
            $.passwordExpiredAfter = passwordExpiredAfter;
            return this;
        }

        /**
         * @param passwordExpiredAfter The date a user&#39;s password expires.
         * 
         * @return builder
         * 
         */
        public Builder passwordExpiredAfter(String passwordExpiredAfter) {
            return passwordExpiredAfter(Output.of(passwordExpiredAfter));
        }

        /**
         * @param phone The user&#39;s main phone number.
         * 
         * @return builder
         * 
         */
        public Builder phone(@Nullable Output<String> phone) {
            $.phone = phone;
            return this;
        }

        /**
         * @param phone The user&#39;s main phone number.
         * 
         * @return builder
         * 
         */
        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        /**
         * @param preferredLanguage The value can be any that are available from the view-languages operation.
         * 
         * @return builder
         * 
         */
        public Builder preferredLanguage(@Nullable Output<String> preferredLanguage) {
            $.preferredLanguage = preferredLanguage;
            return this;
        }

        /**
         * @param preferredLanguage The value can be any that are available from the view-languages operation.
         * 
         * @return builder
         * 
         */
        public Builder preferredLanguage(String preferredLanguage) {
            return preferredLanguage(Output.of(preferredLanguage));
        }

        /**
         * @param secondaryEmail The user&#39;s secondary email address.
         * 
         * @return builder
         * 
         */
        public Builder secondaryEmail(@Nullable Output<String> secondaryEmail) {
            $.secondaryEmail = secondaryEmail;
            return this;
        }

        /**
         * @param secondaryEmail The user&#39;s secondary email address.
         * 
         * @return builder
         * 
         */
        public Builder secondaryEmail(String secondaryEmail) {
            return secondaryEmail(Output.of(secondaryEmail));
        }

        /**
         * @param sessionTimeout The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity.
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            $.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * @param sessionTimeout The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity.
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            return sessionTimeout(Output.of(sessionTimeout));
        }

        /**
         * @param state The user&#39;s state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The user&#39;s state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tfaConfigured Indicates whether two-factor authentication is configured.
         * 
         * @return builder
         * 
         */
        public Builder tfaConfigured(@Nullable Output<Boolean> tfaConfigured) {
            $.tfaConfigured = tfaConfigured;
            return this;
        }

        /**
         * @param tfaConfigured Indicates whether two-factor authentication is configured.
         * 
         * @return builder
         * 
         */
        public Builder tfaConfigured(Boolean tfaConfigured) {
            return tfaConfigured(Output.of(tfaConfigured));
        }

        /**
         * @param timeZone The user&#39;s time zone. The value can be any that are available from the view-time-zones operation.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The user&#39;s time zone. The value can be any that are available from the view-time-zones operation.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        /**
         * @param userName A user&#39;s `loginId`. Typically, a user&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName A user&#39;s `loginId`. Typically, a user&#39;s email address.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param userNotifications Specifies email notifications the user receives for products.
         * 
         * @return builder
         * 
         */
        public Builder userNotifications(@Nullable Output<IamUserUserNotificationsArgs> userNotifications) {
            $.userNotifications = userNotifications;
            return this;
        }

        /**
         * @param userNotifications Specifies email notifications the user receives for products.
         * 
         * @return builder
         * 
         */
        public Builder userNotifications(IamUserUserNotificationsArgs userNotifications) {
            return userNotifications(Output.of(userNotifications));
        }

        /**
         * @param zipCode The user&#39;s five-digit ZIP code.
         * 
         * @return builder
         * 
         */
        public Builder zipCode(@Nullable Output<String> zipCode) {
            $.zipCode = zipCode;
            return this;
        }

        /**
         * @param zipCode The user&#39;s five-digit ZIP code.
         * 
         * @return builder
         * 
         */
        public Builder zipCode(String zipCode) {
            return zipCode(Output.of(zipCode));
        }

        public IamUserState build() {
            return $;
        }
    }

}
