// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudAccessKeyTimeoutsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudAccessKeyTimeoutsArgs Empty = new CloudAccessKeyTimeoutsArgs();

    /**
     * Optional configurable resource create timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
     * 
     */
    @Import(name="create")
    private @Nullable Output<String> create;

    /**
     * @return Optional configurable resource create timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
     * 
     */
    public Optional<Output<String>> create() {
        return Optional.ofNullable(this.create);
    }

    /**
     * Optional configurable resource delete timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
     * 
     */
    @Import(name="delete")
    private @Nullable Output<String> delete;

    /**
     * @return Optional configurable resource delete timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
     * 
     */
    public Optional<Output<String>> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * Optional configurable resource update timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
     * 
     */
    @Import(name="update")
    private @Nullable Output<String> update;

    /**
     * @return Optional configurable resource update timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
     * 
     */
    public Optional<Output<String>> update() {
        return Optional.ofNullable(this.update);
    }

    private CloudAccessKeyTimeoutsArgs() {}

    private CloudAccessKeyTimeoutsArgs(CloudAccessKeyTimeoutsArgs $) {
        this.create = $.create;
        this.delete = $.delete;
        this.update = $.update;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudAccessKeyTimeoutsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudAccessKeyTimeoutsArgs $;

        public Builder() {
            $ = new CloudAccessKeyTimeoutsArgs();
        }

        public Builder(CloudAccessKeyTimeoutsArgs defaults) {
            $ = new CloudAccessKeyTimeoutsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param create Optional configurable resource create timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
         * 
         * @return builder
         * 
         */
        public Builder create(@Nullable Output<String> create) {
            $.create = create;
            return this;
        }

        /**
         * @param create Optional configurable resource create timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
         * 
         * @return builder
         * 
         */
        public Builder create(String create) {
            return create(Output.of(create));
        }

        /**
         * @param delete Optional configurable resource delete timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
         * 
         * @return builder
         * 
         */
        public Builder delete(@Nullable Output<String> delete) {
            $.delete = delete;
            return this;
        }

        /**
         * @param delete Optional configurable resource delete timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
         * 
         * @return builder
         * 
         */
        public Builder delete(String delete) {
            return delete(Output.of(delete));
        }

        /**
         * @param update Optional configurable resource update timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
         * 
         * @return builder
         * 
         */
        public Builder update(@Nullable Output<String> update) {
            $.update = update;
            return this;
        }

        /**
         * @param update Optional configurable resource update timeout. By default it&#39;s 60 minutes with 1 minute polling interval.
         * 
         * @return builder
         * 
         */
        public Builder update(String update) {
            return update(Output.of(update));
        }

        public CloudAccessKeyTimeoutsArgs build() {
            return $;
        }
    }

}
