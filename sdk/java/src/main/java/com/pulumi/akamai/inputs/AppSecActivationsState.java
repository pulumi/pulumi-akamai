// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecActivationsState extends com.pulumi.resources.ResourceArgs {

    public static final AppSecActivationsState Empty = new AppSecActivationsState();

    /**
     * Unique identifier of the security configuration to be activated
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration to be activated
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Network on which to activate the configuration version (STAGING or PRODUCTION)
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Network on which to activate the configuration version (STAGING or PRODUCTION)
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Note describing the activation. Will use timestamp if omitted.
     * 
     */
    @Import(name="note")
    private @Nullable Output<String> note;

    /**
     * @return Note describing the activation. Will use timestamp if omitted.
     * 
     */
    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
    }

    /**
     * List of email addresses to be notified with the results of the activation
     * 
     */
    @Import(name="notificationEmails")
    private @Nullable Output<List<String>> notificationEmails;

    /**
     * @return List of email addresses to be notified with the results of the activation
     * 
     */
    public Optional<Output<List<String>>> notificationEmails() {
        return Optional.ofNullable(this.notificationEmails);
    }

    /**
     * The results of the activation
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The results of the activation
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Version of the security configuration to be activated
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Version of the security configuration to be activated
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private AppSecActivationsState() {}

    private AppSecActivationsState(AppSecActivationsState $) {
        this.configId = $.configId;
        this.network = $.network;
        this.note = $.note;
        this.notificationEmails = $.notificationEmails;
        this.status = $.status;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecActivationsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecActivationsState $;

        public Builder() {
            $ = new AppSecActivationsState();
        }

        public Builder(AppSecActivationsState defaults) {
            $ = new AppSecActivationsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Unique identifier of the security configuration to be activated
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration to be activated
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param network Network on which to activate the configuration version (STAGING or PRODUCTION)
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network on which to activate the configuration version (STAGING or PRODUCTION)
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param note Note describing the activation. Will use timestamp if omitted.
         * 
         * @return builder
         * 
         */
        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        /**
         * @param note Note describing the activation. Will use timestamp if omitted.
         * 
         * @return builder
         * 
         */
        public Builder note(String note) {
            return note(Output.of(note));
        }

        /**
         * @param notificationEmails List of email addresses to be notified with the results of the activation
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(@Nullable Output<List<String>> notificationEmails) {
            $.notificationEmails = notificationEmails;
            return this;
        }

        /**
         * @param notificationEmails List of email addresses to be notified with the results of the activation
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(List<String> notificationEmails) {
            return notificationEmails(Output.of(notificationEmails));
        }

        /**
         * @param notificationEmails List of email addresses to be notified with the results of the activation
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }

        /**
         * @param status The results of the activation
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The results of the activation
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param version Version of the security configuration to be activated
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the security configuration to be activated
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public AppSecActivationsState build() {
            return $;
        }
    }

}
