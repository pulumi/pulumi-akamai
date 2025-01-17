// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastreamAzureConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamAzureConnectorArgs Empty = new DatastreamAzureConnectorArgs();

    /**
     * Access keys associated with Azure Storage account
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return Access keys associated with Azure Storage account
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * Specifies the Azure Storage account name
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Specifies the Azure Storage account name
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Indicates whether the logs should be compressed
     * 
     */
    @Import(name="compressLogs")
    private @Nullable Output<Boolean> compressLogs;

    /**
     * @return Indicates whether the logs should be compressed
     * 
     */
    public Optional<Output<Boolean>> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }

    /**
     * Specifies the Azure Storage container name
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return Specifies the Azure Storage container name
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The name of the connector
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the connector
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The path to the folder within Azure Storage container where logs will be stored
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path to the folder within Azure Storage container where logs will be stored
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private DatastreamAzureConnectorArgs() {}

    private DatastreamAzureConnectorArgs(DatastreamAzureConnectorArgs $) {
        this.accessKey = $.accessKey;
        this.accountName = $.accountName;
        this.compressLogs = $.compressLogs;
        this.containerName = $.containerName;
        this.displayName = $.displayName;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamAzureConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamAzureConnectorArgs $;

        public Builder() {
            $ = new DatastreamAzureConnectorArgs();
        }

        public Builder(DatastreamAzureConnectorArgs defaults) {
            $ = new DatastreamAzureConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey Access keys associated with Azure Storage account
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Access keys associated with Azure Storage account
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param accountName Specifies the Azure Storage account name
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Specifies the Azure Storage account name
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param compressLogs Indicates whether the logs should be compressed
         * 
         * @return builder
         * 
         */
        public Builder compressLogs(@Nullable Output<Boolean> compressLogs) {
            $.compressLogs = compressLogs;
            return this;
        }

        /**
         * @param compressLogs Indicates whether the logs should be compressed
         * 
         * @return builder
         * 
         */
        public Builder compressLogs(Boolean compressLogs) {
            return compressLogs(Output.of(compressLogs));
        }

        /**
         * @param containerName Specifies the Azure Storage container name
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Specifies the Azure Storage container name
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param displayName The name of the connector
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the connector
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param path The path to the folder within Azure Storage container where logs will be stored
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to the folder within Azure Storage container where logs will be stored
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public DatastreamAzureConnectorArgs build() {
            if ($.accessKey == null) {
                throw new MissingRequiredPropertyException("DatastreamAzureConnectorArgs", "accessKey");
            }
            if ($.accountName == null) {
                throw new MissingRequiredPropertyException("DatastreamAzureConnectorArgs", "accountName");
            }
            if ($.containerName == null) {
                throw new MissingRequiredPropertyException("DatastreamAzureConnectorArgs", "containerName");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("DatastreamAzureConnectorArgs", "displayName");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("DatastreamAzureConnectorArgs", "path");
            }
            return $;
        }
    }

}
