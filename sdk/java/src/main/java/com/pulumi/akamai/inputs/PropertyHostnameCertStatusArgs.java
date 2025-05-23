// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PropertyHostnameCertStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PropertyHostnameCertStatusArgs Empty = new PropertyHostnameCertStatusArgs();

    /**
     * The hostname part of the CNAME record used to validate the certificate&#39;s domain.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The hostname part of the CNAME record used to validate the certificate&#39;s domain.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The certificate&#39;s deployment status on the production network.
     * 
     */
    @Import(name="productionStatus")
    private @Nullable Output<String> productionStatus;

    /**
     * @return The certificate&#39;s deployment status on the production network.
     * 
     */
    public Optional<Output<String>> productionStatus() {
        return Optional.ofNullable(this.productionStatus);
    }

    /**
     * The certificate&#39;s deployment status on the staging network.
     * 
     */
    @Import(name="stagingStatus")
    private @Nullable Output<String> stagingStatus;

    /**
     * @return The certificate&#39;s deployment status on the staging network.
     * 
     */
    public Optional<Output<String>> stagingStatus() {
        return Optional.ofNullable(this.stagingStatus);
    }

    /**
     * The destination part of the CNAME record used to validate the certificate&#39;s domain.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The destination part of the CNAME record used to validate the certificate&#39;s domain.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    private PropertyHostnameCertStatusArgs() {}

    private PropertyHostnameCertStatusArgs(PropertyHostnameCertStatusArgs $) {
        this.hostname = $.hostname;
        this.productionStatus = $.productionStatus;
        this.stagingStatus = $.stagingStatus;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyHostnameCertStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyHostnameCertStatusArgs $;

        public Builder() {
            $ = new PropertyHostnameCertStatusArgs();
        }

        public Builder(PropertyHostnameCertStatusArgs defaults) {
            $ = new PropertyHostnameCertStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname The hostname part of the CNAME record used to validate the certificate&#39;s domain.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname part of the CNAME record used to validate the certificate&#39;s domain.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param productionStatus The certificate&#39;s deployment status on the production network.
         * 
         * @return builder
         * 
         */
        public Builder productionStatus(@Nullable Output<String> productionStatus) {
            $.productionStatus = productionStatus;
            return this;
        }

        /**
         * @param productionStatus The certificate&#39;s deployment status on the production network.
         * 
         * @return builder
         * 
         */
        public Builder productionStatus(String productionStatus) {
            return productionStatus(Output.of(productionStatus));
        }

        /**
         * @param stagingStatus The certificate&#39;s deployment status on the staging network.
         * 
         * @return builder
         * 
         */
        public Builder stagingStatus(@Nullable Output<String> stagingStatus) {
            $.stagingStatus = stagingStatus;
            return this;
        }

        /**
         * @param stagingStatus The certificate&#39;s deployment status on the staging network.
         * 
         * @return builder
         * 
         */
        public Builder stagingStatus(String stagingStatus) {
            return stagingStatus(Output.of(stagingStatus));
        }

        /**
         * @param target The destination part of the CNAME record used to validate the certificate&#39;s domain.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The destination part of the CNAME record used to validate the certificate&#39;s domain.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public PropertyHostnameCertStatusArgs build() {
            return $;
        }
    }

}
