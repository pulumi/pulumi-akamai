// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.inputs.PropertyActivationComplianceRecordArgs;
import com.pulumi.akamai.inputs.PropertyActivationTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PropertyActivationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PropertyActivationArgs Empty = new PropertyActivationArgs();

    /**
     * The ID given to the activation event while it&#39;s in progress.
     * 
     */
    @Import(name="activationId")
    private @Nullable Output<String> activationId;

    /**
     * @return The ID given to the activation event while it&#39;s in progress.
     * 
     */
    public Optional<Output<String>> activationId() {
        return Optional.ofNullable(this.activationId);
    }

    /**
     * Automatically acknowledge all rule warnings for activation to continue. Default is false
     * 
     */
    @Import(name="autoAcknowledgeRuleWarnings")
    private @Nullable Output<Boolean> autoAcknowledgeRuleWarnings;

    /**
     * @return Automatically acknowledge all rule warnings for activation to continue. Default is false
     * 
     */
    public Optional<Output<Boolean>> autoAcknowledgeRuleWarnings() {
        return Optional.ofNullable(this.autoAcknowledgeRuleWarnings);
    }

    /**
     * Provides an audit record when activating on a production network.
     * 
     */
    @Import(name="complianceRecord")
    private @Nullable Output<PropertyActivationComplianceRecordArgs> complianceRecord;

    /**
     * @return Provides an audit record when activating on a production network.
     * 
     */
    public Optional<Output<PropertyActivationComplianceRecordArgs>> complianceRecord() {
        return Optional.ofNullable(this.complianceRecord);
    }

    /**
     * One or more email addresses to which to send activation status changes.
     * 
     */
    @Import(name="contacts", required=true)
    private Output<List<String>> contacts;

    /**
     * @return One or more email addresses to which to send activation status changes.
     * 
     */
    public Output<List<String>> contacts() {
        return this.contacts;
    }

    /**
     * Akamai network in which to activate your property, either STAGING or PRODUCTION. The default is STAGING.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Akamai network in which to activate your property, either STAGING or PRODUCTION. The default is STAGING.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Assigns a log message to the activation request.
     * 
     */
    @Import(name="note")
    private @Nullable Output<String> note;

    /**
     * @return Assigns a log message to the activation request.
     * 
     */
    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
    }

    /**
     * Your property&#39;s ID, including the prp_ prefix.
     * 
     */
    @Import(name="propertyId", required=true)
    private Output<String> propertyId;

    /**
     * @return Your property&#39;s ID, including the prp_ prefix.
     * 
     */
    public Output<String> propertyId() {
        return this.propertyId;
    }

    /**
     * Enables to set timeout for processing.
     * 
     */
    @Import(name="timeouts")
    private @Nullable Output<PropertyActivationTimeoutsArgs> timeouts;

    /**
     * @return Enables to set timeout for processing.
     * 
     */
    public Optional<Output<PropertyActivationTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * Your property&#39;s version number.
     * 
     */
    @Import(name="version", required=true)
    private Output<Integer> version;

    /**
     * @return Your property&#39;s version number.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    private PropertyActivationArgs() {}

    private PropertyActivationArgs(PropertyActivationArgs $) {
        this.activationId = $.activationId;
        this.autoAcknowledgeRuleWarnings = $.autoAcknowledgeRuleWarnings;
        this.complianceRecord = $.complianceRecord;
        this.contacts = $.contacts;
        this.network = $.network;
        this.note = $.note;
        this.propertyId = $.propertyId;
        this.timeouts = $.timeouts;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyActivationArgs $;

        public Builder() {
            $ = new PropertyActivationArgs();
        }

        public Builder(PropertyActivationArgs defaults) {
            $ = new PropertyActivationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activationId The ID given to the activation event while it&#39;s in progress.
         * 
         * @return builder
         * 
         */
        public Builder activationId(@Nullable Output<String> activationId) {
            $.activationId = activationId;
            return this;
        }

        /**
         * @param activationId The ID given to the activation event while it&#39;s in progress.
         * 
         * @return builder
         * 
         */
        public Builder activationId(String activationId) {
            return activationId(Output.of(activationId));
        }

        /**
         * @param autoAcknowledgeRuleWarnings Automatically acknowledge all rule warnings for activation to continue. Default is false
         * 
         * @return builder
         * 
         */
        public Builder autoAcknowledgeRuleWarnings(@Nullable Output<Boolean> autoAcknowledgeRuleWarnings) {
            $.autoAcknowledgeRuleWarnings = autoAcknowledgeRuleWarnings;
            return this;
        }

        /**
         * @param autoAcknowledgeRuleWarnings Automatically acknowledge all rule warnings for activation to continue. Default is false
         * 
         * @return builder
         * 
         */
        public Builder autoAcknowledgeRuleWarnings(Boolean autoAcknowledgeRuleWarnings) {
            return autoAcknowledgeRuleWarnings(Output.of(autoAcknowledgeRuleWarnings));
        }

        /**
         * @param complianceRecord Provides an audit record when activating on a production network.
         * 
         * @return builder
         * 
         */
        public Builder complianceRecord(@Nullable Output<PropertyActivationComplianceRecordArgs> complianceRecord) {
            $.complianceRecord = complianceRecord;
            return this;
        }

        /**
         * @param complianceRecord Provides an audit record when activating on a production network.
         * 
         * @return builder
         * 
         */
        public Builder complianceRecord(PropertyActivationComplianceRecordArgs complianceRecord) {
            return complianceRecord(Output.of(complianceRecord));
        }

        /**
         * @param contacts One or more email addresses to which to send activation status changes.
         * 
         * @return builder
         * 
         */
        public Builder contacts(Output<List<String>> contacts) {
            $.contacts = contacts;
            return this;
        }

        /**
         * @param contacts One or more email addresses to which to send activation status changes.
         * 
         * @return builder
         * 
         */
        public Builder contacts(List<String> contacts) {
            return contacts(Output.of(contacts));
        }

        /**
         * @param contacts One or more email addresses to which to send activation status changes.
         * 
         * @return builder
         * 
         */
        public Builder contacts(String... contacts) {
            return contacts(List.of(contacts));
        }

        /**
         * @param network Akamai network in which to activate your property, either STAGING or PRODUCTION. The default is STAGING.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Akamai network in which to activate your property, either STAGING or PRODUCTION. The default is STAGING.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param note Assigns a log message to the activation request.
         * 
         * @return builder
         * 
         */
        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        /**
         * @param note Assigns a log message to the activation request.
         * 
         * @return builder
         * 
         */
        public Builder note(String note) {
            return note(Output.of(note));
        }

        /**
         * @param propertyId Your property&#39;s ID, including the prp_ prefix.
         * 
         * @return builder
         * 
         */
        public Builder propertyId(Output<String> propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        /**
         * @param propertyId Your property&#39;s ID, including the prp_ prefix.
         * 
         * @return builder
         * 
         */
        public Builder propertyId(String propertyId) {
            return propertyId(Output.of(propertyId));
        }

        /**
         * @param timeouts Enables to set timeout for processing.
         * 
         * @return builder
         * 
         */
        public Builder timeouts(@Nullable Output<PropertyActivationTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        /**
         * @param timeouts Enables to set timeout for processing.
         * 
         * @return builder
         * 
         */
        public Builder timeouts(PropertyActivationTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param version Your property&#39;s version number.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Your property&#39;s version number.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public PropertyActivationArgs build() {
            if ($.contacts == null) {
                throw new MissingRequiredPropertyException("PropertyActivationArgs", "contacts");
            }
            if ($.propertyId == null) {
                throw new MissingRequiredPropertyException("PropertyActivationArgs", "propertyId");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("PropertyActivationArgs", "version");
            }
            return $;
        }
    }

}
