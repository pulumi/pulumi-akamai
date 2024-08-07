// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.inputs.ProviderConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="cacheEnabled", json=true)
    private @Nullable Output<Boolean> cacheEnabled;

    public Optional<Output<Boolean>> cacheEnabled() {
        return Optional.ofNullable(this.cacheEnabled);
    }

    @Import(name="config", json=true)
    private @Nullable Output<ProviderConfigArgs> config;

    public Optional<Output<ProviderConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The section of the edgerc file to use for configuration
     * 
     */
    @Import(name="configSection")
    private @Nullable Output<String> configSection;

    /**
     * @return The section of the edgerc file to use for configuration
     * 
     */
    public Optional<Output<String>> configSection() {
        return Optional.ofNullable(this.configSection);
    }

    @Import(name="edgerc")
    private @Nullable Output<String> edgerc;

    public Optional<Output<String>> edgerc() {
        return Optional.ofNullable(this.edgerc);
    }

    /**
     * The maximum number of API requests to be made per second (0 for no limit)
     * 
     */
    @Import(name="requestLimit", json=true)
    private @Nullable Output<Integer> requestLimit;

    /**
     * @return The maximum number of API requests to be made per second (0 for no limit)
     * 
     */
    public Optional<Output<Integer>> requestLimit() {
        return Optional.ofNullable(this.requestLimit);
    }

    /**
     * Should the retries of API requests be disabled, default false
     * 
     */
    @Import(name="retryDisabled", json=true)
    private @Nullable Output<Boolean> retryDisabled;

    /**
     * @return Should the retries of API requests be disabled, default false
     * 
     */
    public Optional<Output<Boolean>> retryDisabled() {
        return Optional.ofNullable(this.retryDisabled);
    }

    /**
     * The maximum number retires of API requests, default 10
     * 
     */
    @Import(name="retryMax", json=true)
    private @Nullable Output<Integer> retryMax;

    /**
     * @return The maximum number retires of API requests, default 10
     * 
     */
    public Optional<Output<Integer>> retryMax() {
        return Optional.ofNullable(this.retryMax);
    }

    /**
     * The maximum wait time in seconds between API requests retries, default is 30 sec
     * 
     */
    @Import(name="retryWaitMax", json=true)
    private @Nullable Output<Integer> retryWaitMax;

    /**
     * @return The maximum wait time in seconds between API requests retries, default is 30 sec
     * 
     */
    public Optional<Output<Integer>> retryWaitMax() {
        return Optional.ofNullable(this.retryWaitMax);
    }

    /**
     * The minimum wait time in seconds between API requests retries, default is 1 sec
     * 
     */
    @Import(name="retryWaitMin", json=true)
    private @Nullable Output<Integer> retryWaitMin;

    /**
     * @return The minimum wait time in seconds between API requests retries, default is 1 sec
     * 
     */
    public Optional<Output<Integer>> retryWaitMin() {
        return Optional.ofNullable(this.retryWaitMin);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.cacheEnabled = $.cacheEnabled;
        this.config = $.config;
        this.configSection = $.configSection;
        this.edgerc = $.edgerc;
        this.requestLimit = $.requestLimit;
        this.retryDisabled = $.retryDisabled;
        this.retryMax = $.retryMax;
        this.retryWaitMax = $.retryWaitMax;
        this.retryWaitMin = $.retryWaitMin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder cacheEnabled(@Nullable Output<Boolean> cacheEnabled) {
            $.cacheEnabled = cacheEnabled;
            return this;
        }

        public Builder cacheEnabled(Boolean cacheEnabled) {
            return cacheEnabled(Output.of(cacheEnabled));
        }

        public Builder config(@Nullable Output<ProviderConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(ProviderConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param configSection The section of the edgerc file to use for configuration
         * 
         * @return builder
         * 
         */
        public Builder configSection(@Nullable Output<String> configSection) {
            $.configSection = configSection;
            return this;
        }

        /**
         * @param configSection The section of the edgerc file to use for configuration
         * 
         * @return builder
         * 
         */
        public Builder configSection(String configSection) {
            return configSection(Output.of(configSection));
        }

        public Builder edgerc(@Nullable Output<String> edgerc) {
            $.edgerc = edgerc;
            return this;
        }

        public Builder edgerc(String edgerc) {
            return edgerc(Output.of(edgerc));
        }

        /**
         * @param requestLimit The maximum number of API requests to be made per second (0 for no limit)
         * 
         * @return builder
         * 
         */
        public Builder requestLimit(@Nullable Output<Integer> requestLimit) {
            $.requestLimit = requestLimit;
            return this;
        }

        /**
         * @param requestLimit The maximum number of API requests to be made per second (0 for no limit)
         * 
         * @return builder
         * 
         */
        public Builder requestLimit(Integer requestLimit) {
            return requestLimit(Output.of(requestLimit));
        }

        /**
         * @param retryDisabled Should the retries of API requests be disabled, default false
         * 
         * @return builder
         * 
         */
        public Builder retryDisabled(@Nullable Output<Boolean> retryDisabled) {
            $.retryDisabled = retryDisabled;
            return this;
        }

        /**
         * @param retryDisabled Should the retries of API requests be disabled, default false
         * 
         * @return builder
         * 
         */
        public Builder retryDisabled(Boolean retryDisabled) {
            return retryDisabled(Output.of(retryDisabled));
        }

        /**
         * @param retryMax The maximum number retires of API requests, default 10
         * 
         * @return builder
         * 
         */
        public Builder retryMax(@Nullable Output<Integer> retryMax) {
            $.retryMax = retryMax;
            return this;
        }

        /**
         * @param retryMax The maximum number retires of API requests, default 10
         * 
         * @return builder
         * 
         */
        public Builder retryMax(Integer retryMax) {
            return retryMax(Output.of(retryMax));
        }

        /**
         * @param retryWaitMax The maximum wait time in seconds between API requests retries, default is 30 sec
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMax(@Nullable Output<Integer> retryWaitMax) {
            $.retryWaitMax = retryWaitMax;
            return this;
        }

        /**
         * @param retryWaitMax The maximum wait time in seconds between API requests retries, default is 30 sec
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMax(Integer retryWaitMax) {
            return retryWaitMax(Output.of(retryWaitMax));
        }

        /**
         * @param retryWaitMin The minimum wait time in seconds between API requests retries, default is 1 sec
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMin(@Nullable Output<Integer> retryWaitMin) {
            $.retryWaitMin = retryWaitMin;
            return this;
        }

        /**
         * @param retryWaitMin The minimum wait time in seconds between API requests retries, default is 1 sec
         * 
         * @return builder
         * 
         */
        public Builder retryWaitMin(Integer retryWaitMin) {
            return retryWaitMin(Output.of(retryWaitMin));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
