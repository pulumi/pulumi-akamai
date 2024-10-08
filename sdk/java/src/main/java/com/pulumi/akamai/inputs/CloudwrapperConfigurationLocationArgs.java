// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.CloudwrapperConfigurationLocationCapacityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudwrapperConfigurationLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudwrapperConfigurationLocationArgs Empty = new CloudwrapperConfigurationLocationArgs();

    /**
     * The capacity assigned to this configuration&#39;s location
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<CloudwrapperConfigurationLocationCapacityArgs> capacity;

    /**
     * @return The capacity assigned to this configuration&#39;s location
     * 
     */
    public Optional<Output<CloudwrapperConfigurationLocationCapacityArgs>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Additional comments provided by the user.
     * 
     */
    @Import(name="comments", required=true)
    private Output<String> comments;

    /**
     * @return Additional comments provided by the user.
     * 
     */
    public Output<String> comments() {
        return this.comments;
    }

    /**
     * Unique identifier for the location and traffic type combination
     * 
     */
    @Import(name="trafficTypeId", required=true)
    private Output<Integer> trafficTypeId;

    /**
     * @return Unique identifier for the location and traffic type combination
     * 
     */
    public Output<Integer> trafficTypeId() {
        return this.trafficTypeId;
    }

    private CloudwrapperConfigurationLocationArgs() {}

    private CloudwrapperConfigurationLocationArgs(CloudwrapperConfigurationLocationArgs $) {
        this.capacity = $.capacity;
        this.comments = $.comments;
        this.trafficTypeId = $.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudwrapperConfigurationLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudwrapperConfigurationLocationArgs $;

        public Builder() {
            $ = new CloudwrapperConfigurationLocationArgs();
        }

        public Builder(CloudwrapperConfigurationLocationArgs defaults) {
            $ = new CloudwrapperConfigurationLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The capacity assigned to this configuration&#39;s location
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<CloudwrapperConfigurationLocationCapacityArgs> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The capacity assigned to this configuration&#39;s location
         * 
         * @return builder
         * 
         */
        public Builder capacity(CloudwrapperConfigurationLocationCapacityArgs capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param comments Additional comments provided by the user.
         * 
         * @return builder
         * 
         */
        public Builder comments(Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments Additional comments provided by the user.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param trafficTypeId Unique identifier for the location and traffic type combination
         * 
         * @return builder
         * 
         */
        public Builder trafficTypeId(Output<Integer> trafficTypeId) {
            $.trafficTypeId = trafficTypeId;
            return this;
        }

        /**
         * @param trafficTypeId Unique identifier for the location and traffic type combination
         * 
         * @return builder
         * 
         */
        public Builder trafficTypeId(Integer trafficTypeId) {
            return trafficTypeId(Output.of(trafficTypeId));
        }

        public CloudwrapperConfigurationLocationArgs build() {
            if ($.comments == null) {
                throw new MissingRequiredPropertyException("CloudwrapperConfigurationLocationArgs", "comments");
            }
            if ($.trafficTypeId == null) {
                throw new MissingRequiredPropertyException("CloudwrapperConfigurationLocationArgs", "trafficTypeId");
            }
            return $;
        }
    }

}
