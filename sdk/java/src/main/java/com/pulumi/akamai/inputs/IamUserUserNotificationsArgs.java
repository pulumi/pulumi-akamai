// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamUserUserNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamUserUserNotificationsArgs Empty = new IamUserUserNotificationsArgs();

    /**
     * Enables notifications for expiring API client credentials.
     * 
     */
    @Import(name="apiClientCredentialExpiryNotification")
    private @Nullable Output<Boolean> apiClientCredentialExpiryNotification;

    /**
     * @return Enables notifications for expiring API client credentials.
     * 
     */
    public Optional<Output<Boolean>> apiClientCredentialExpiryNotification() {
        return Optional.ofNullable(this.apiClientCredentialExpiryNotification);
    }

    /**
     * Enables email notifications.
     * 
     */
    @Import(name="enableEmailNotifications", required=true)
    private Output<Boolean> enableEmailNotifications;

    /**
     * @return Enables email notifications.
     * 
     */
    public Output<Boolean> enableEmailNotifications() {
        return this.enableEmailNotifications;
    }

    /**
     * Enables notifications for group administrators when the user creates other new users.
     * 
     */
    @Import(name="newUserNotification")
    private @Nullable Output<Boolean> newUserNotification;

    /**
     * @return Enables notifications for group administrators when the user creates other new users.
     * 
     */
    public Optional<Output<Boolean>> newUserNotification() {
        return Optional.ofNullable(this.newUserNotification);
    }

    /**
     * Enables notifications for expiring passwords.
     * 
     */
    @Import(name="passwordExpiry", required=true)
    private Output<Boolean> passwordExpiry;

    /**
     * @return Enables notifications for expiring passwords.
     * 
     */
    public Output<Boolean> passwordExpiry() {
        return this.passwordExpiry;
    }

    /**
     * Products for which the user gets notifications for service issues.
     * 
     */
    @Import(name="proactives", required=true)
    private Output<List<String>> proactives;

    /**
     * @return Products for which the user gets notifications for service issues.
     * 
     */
    public Output<List<String>> proactives() {
        return this.proactives;
    }

    /**
     * Products for which the user receives notifications for upgrades.
     * 
     */
    @Import(name="upgrades", required=true)
    private Output<List<String>> upgrades;

    /**
     * @return Products for which the user receives notifications for upgrades.
     * 
     */
    public Output<List<String>> upgrades() {
        return this.upgrades;
    }

    private IamUserUserNotificationsArgs() {}

    private IamUserUserNotificationsArgs(IamUserUserNotificationsArgs $) {
        this.apiClientCredentialExpiryNotification = $.apiClientCredentialExpiryNotification;
        this.enableEmailNotifications = $.enableEmailNotifications;
        this.newUserNotification = $.newUserNotification;
        this.passwordExpiry = $.passwordExpiry;
        this.proactives = $.proactives;
        this.upgrades = $.upgrades;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamUserUserNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamUserUserNotificationsArgs $;

        public Builder() {
            $ = new IamUserUserNotificationsArgs();
        }

        public Builder(IamUserUserNotificationsArgs defaults) {
            $ = new IamUserUserNotificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiClientCredentialExpiryNotification Enables notifications for expiring API client credentials.
         * 
         * @return builder
         * 
         */
        public Builder apiClientCredentialExpiryNotification(@Nullable Output<Boolean> apiClientCredentialExpiryNotification) {
            $.apiClientCredentialExpiryNotification = apiClientCredentialExpiryNotification;
            return this;
        }

        /**
         * @param apiClientCredentialExpiryNotification Enables notifications for expiring API client credentials.
         * 
         * @return builder
         * 
         */
        public Builder apiClientCredentialExpiryNotification(Boolean apiClientCredentialExpiryNotification) {
            return apiClientCredentialExpiryNotification(Output.of(apiClientCredentialExpiryNotification));
        }

        /**
         * @param enableEmailNotifications Enables email notifications.
         * 
         * @return builder
         * 
         */
        public Builder enableEmailNotifications(Output<Boolean> enableEmailNotifications) {
            $.enableEmailNotifications = enableEmailNotifications;
            return this;
        }

        /**
         * @param enableEmailNotifications Enables email notifications.
         * 
         * @return builder
         * 
         */
        public Builder enableEmailNotifications(Boolean enableEmailNotifications) {
            return enableEmailNotifications(Output.of(enableEmailNotifications));
        }

        /**
         * @param newUserNotification Enables notifications for group administrators when the user creates other new users.
         * 
         * @return builder
         * 
         */
        public Builder newUserNotification(@Nullable Output<Boolean> newUserNotification) {
            $.newUserNotification = newUserNotification;
            return this;
        }

        /**
         * @param newUserNotification Enables notifications for group administrators when the user creates other new users.
         * 
         * @return builder
         * 
         */
        public Builder newUserNotification(Boolean newUserNotification) {
            return newUserNotification(Output.of(newUserNotification));
        }

        /**
         * @param passwordExpiry Enables notifications for expiring passwords.
         * 
         * @return builder
         * 
         */
        public Builder passwordExpiry(Output<Boolean> passwordExpiry) {
            $.passwordExpiry = passwordExpiry;
            return this;
        }

        /**
         * @param passwordExpiry Enables notifications for expiring passwords.
         * 
         * @return builder
         * 
         */
        public Builder passwordExpiry(Boolean passwordExpiry) {
            return passwordExpiry(Output.of(passwordExpiry));
        }

        /**
         * @param proactives Products for which the user gets notifications for service issues.
         * 
         * @return builder
         * 
         */
        public Builder proactives(Output<List<String>> proactives) {
            $.proactives = proactives;
            return this;
        }

        /**
         * @param proactives Products for which the user gets notifications for service issues.
         * 
         * @return builder
         * 
         */
        public Builder proactives(List<String> proactives) {
            return proactives(Output.of(proactives));
        }

        /**
         * @param proactives Products for which the user gets notifications for service issues.
         * 
         * @return builder
         * 
         */
        public Builder proactives(String... proactives) {
            return proactives(List.of(proactives));
        }

        /**
         * @param upgrades Products for which the user receives notifications for upgrades.
         * 
         * @return builder
         * 
         */
        public Builder upgrades(Output<List<String>> upgrades) {
            $.upgrades = upgrades;
            return this;
        }

        /**
         * @param upgrades Products for which the user receives notifications for upgrades.
         * 
         * @return builder
         * 
         */
        public Builder upgrades(List<String> upgrades) {
            return upgrades(Output.of(upgrades));
        }

        /**
         * @param upgrades Products for which the user receives notifications for upgrades.
         * 
         * @return builder
         * 
         */
        public Builder upgrades(String... upgrades) {
            return upgrades(List.of(upgrades));
        }

        public IamUserUserNotificationsArgs build() {
            if ($.enableEmailNotifications == null) {
                throw new MissingRequiredPropertyException("IamUserUserNotificationsArgs", "enableEmailNotifications");
            }
            if ($.passwordExpiry == null) {
                throw new MissingRequiredPropertyException("IamUserUserNotificationsArgs", "passwordExpiry");
            }
            if ($.proactives == null) {
                throw new MissingRequiredPropertyException("IamUserUserNotificationsArgs", "proactives");
            }
            if ($.upgrades == null) {
                throw new MissingRequiredPropertyException("IamUserUserNotificationsArgs", "upgrades");
            }
            return $;
        }
    }

}
