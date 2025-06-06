// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class DatastreamDeliveryConfigurationFrequencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamDeliveryConfigurationFrequencyArgs Empty = new DatastreamDeliveryConfigurationFrequencyArgs();

    /**
     * The time in seconds after which the system bundles log lines into a file and sends it to a destination
     * 
     */
    @Import(name="intervalInSecs", required=true)
    private Output<Integer> intervalInSecs;

    /**
     * @return The time in seconds after which the system bundles log lines into a file and sends it to a destination
     * 
     */
    public Output<Integer> intervalInSecs() {
        return this.intervalInSecs;
    }

    private DatastreamDeliveryConfigurationFrequencyArgs() {}

    private DatastreamDeliveryConfigurationFrequencyArgs(DatastreamDeliveryConfigurationFrequencyArgs $) {
        this.intervalInSecs = $.intervalInSecs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamDeliveryConfigurationFrequencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamDeliveryConfigurationFrequencyArgs $;

        public Builder() {
            $ = new DatastreamDeliveryConfigurationFrequencyArgs();
        }

        public Builder(DatastreamDeliveryConfigurationFrequencyArgs defaults) {
            $ = new DatastreamDeliveryConfigurationFrequencyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param intervalInSecs The time in seconds after which the system bundles log lines into a file and sends it to a destination
         * 
         * @return builder
         * 
         */
        public Builder intervalInSecs(Output<Integer> intervalInSecs) {
            $.intervalInSecs = intervalInSecs;
            return this;
        }

        /**
         * @param intervalInSecs The time in seconds after which the system bundles log lines into a file and sends it to a destination
         * 
         * @return builder
         * 
         */
        public Builder intervalInSecs(Integer intervalInSecs) {
            return intervalInSecs(Output.of(intervalInSecs));
        }

        public DatastreamDeliveryConfigurationFrequencyArgs build() {
            if ($.intervalInSecs == null) {
                throw new MissingRequiredPropertyException("DatastreamDeliveryConfigurationFrequencyArgs", "intervalInSecs");
            }
            return $;
        }
    }

}
