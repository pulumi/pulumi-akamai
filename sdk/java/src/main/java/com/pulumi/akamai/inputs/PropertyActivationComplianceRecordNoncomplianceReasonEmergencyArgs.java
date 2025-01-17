// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs Empty = new PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs();

    /**
     * Identifies the ticket that describes the need for the activation
     * 
     */
    @Import(name="ticketId")
    private @Nullable Output<String> ticketId;

    /**
     * @return Identifies the ticket that describes the need for the activation
     * 
     */
    public Optional<Output<String>> ticketId() {
        return Optional.ofNullable(this.ticketId);
    }

    private PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs() {}

    private PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs(PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs $) {
        this.ticketId = $.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs $;

        public Builder() {
            $ = new PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs();
        }

        public Builder(PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs defaults) {
            $ = new PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ticketId Identifies the ticket that describes the need for the activation
         * 
         * @return builder
         * 
         */
        public Builder ticketId(@Nullable Output<String> ticketId) {
            $.ticketId = ticketId;
            return this;
        }

        /**
         * @param ticketId Identifies the ticket that describes the need for the activation
         * 
         * @return builder
         * 
         */
        public Builder ticketId(String ticketId) {
            return ticketId(Output.of(ticketId));
        }

        public PropertyActivationComplianceRecordNoncomplianceReasonEmergencyArgs build() {
            return $;
        }
    }

}
