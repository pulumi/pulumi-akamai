// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.inputs.DatastreamAzureConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamDatadogConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamDeliveryConfigurationArgs;
import com.pulumi.akamai.inputs.DatastreamElasticsearchConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamGcsConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamHttpsConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamLogglyConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamNewRelicConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamOracleConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamS3ConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamSplunkConnectorArgs;
import com.pulumi.akamai.inputs.DatastreamSumologicConnectorArgs;
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


public final class DatastreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamArgs Empty = new DatastreamArgs();

    /**
     * Defining if stream should be active or not
     * 
     */
    @Import(name="active", required=true)
    private Output<Boolean> active;

    /**
     * @return Defining if stream should be active or not
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }

    @Import(name="azureConnector")
    private @Nullable Output<DatastreamAzureConnectorArgs> azureConnector;

    public Optional<Output<DatastreamAzureConnectorArgs>> azureConnector() {
        return Optional.ofNullable(this.azureConnector);
    }

    /**
     * Identifies if stream needs to collect midgress data
     * 
     */
    @Import(name="collectMidgress")
    private @Nullable Output<Boolean> collectMidgress;

    /**
     * @return Identifies if stream needs to collect midgress data
     * 
     */
    public Optional<Output<Boolean>> collectMidgress() {
        return Optional.ofNullable(this.collectMidgress);
    }

    /**
     * Identifies the contract that has access to the product
     * 
     */
    @Import(name="contractId", required=true)
    private Output<String> contractId;

    /**
     * @return Identifies the contract that has access to the product
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }

    @Import(name="datadogConnector")
    private @Nullable Output<DatastreamDatadogConnectorArgs> datadogConnector;

    public Optional<Output<DatastreamDatadogConnectorArgs>> datadogConnector() {
        return Optional.ofNullable(this.datadogConnector);
    }

    /**
     * A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
     * identifiers define how the value for these fields appear in the log lines
     * 
     */
    @Import(name="datasetFields", required=true)
    private Output<List<Integer>> datasetFields;

    /**
     * @return A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
     * identifiers define how the value for these fields appear in the log lines
     * 
     */
    public Output<List<Integer>> datasetFields() {
        return this.datasetFields;
    }

    /**
     * Provides information about the configuration related to logs (format, file names, delivery frequency)
     * 
     */
    @Import(name="deliveryConfiguration", required=true)
    private Output<DatastreamDeliveryConfigurationArgs> deliveryConfiguration;

    /**
     * @return Provides information about the configuration related to logs (format, file names, delivery frequency)
     * 
     */
    public Output<DatastreamDeliveryConfigurationArgs> deliveryConfiguration() {
        return this.deliveryConfiguration;
    }

    @Import(name="elasticsearchConnector")
    private @Nullable Output<DatastreamElasticsearchConnectorArgs> elasticsearchConnector;

    public Optional<Output<DatastreamElasticsearchConnectorArgs>> elasticsearchConnector() {
        return Optional.ofNullable(this.elasticsearchConnector);
    }

    @Import(name="gcsConnector")
    private @Nullable Output<DatastreamGcsConnectorArgs> gcsConnector;

    public Optional<Output<DatastreamGcsConnectorArgs>> gcsConnector() {
        return Optional.ofNullable(this.gcsConnector);
    }

    /**
     * Identifies the group that has access to the product and for which the stream configuration was created
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return Identifies the group that has access to the product and for which the stream configuration was created
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    @Import(name="httpsConnector")
    private @Nullable Output<DatastreamHttpsConnectorArgs> httpsConnector;

    public Optional<Output<DatastreamHttpsConnectorArgs>> httpsConnector() {
        return Optional.ofNullable(this.httpsConnector);
    }

    @Import(name="logglyConnector")
    private @Nullable Output<DatastreamLogglyConnectorArgs> logglyConnector;

    public Optional<Output<DatastreamLogglyConnectorArgs>> logglyConnector() {
        return Optional.ofNullable(this.logglyConnector);
    }

    @Import(name="newRelicConnector")
    private @Nullable Output<DatastreamNewRelicConnectorArgs> newRelicConnector;

    public Optional<Output<DatastreamNewRelicConnectorArgs>> newRelicConnector() {
        return Optional.ofNullable(this.newRelicConnector);
    }

    /**
     * List of email addresses where the system sends notifications about activations and deactivations of the stream
     * 
     */
    @Import(name="notificationEmails")
    private @Nullable Output<List<String>> notificationEmails;

    /**
     * @return List of email addresses where the system sends notifications about activations and deactivations of the stream
     * 
     */
    public Optional<Output<List<String>>> notificationEmails() {
        return Optional.ofNullable(this.notificationEmails);
    }

    @Import(name="oracleConnector")
    private @Nullable Output<DatastreamOracleConnectorArgs> oracleConnector;

    public Optional<Output<DatastreamOracleConnectorArgs>> oracleConnector() {
        return Optional.ofNullable(this.oracleConnector);
    }

    /**
     * Identifies the properties monitored in the stream
     * 
     */
    @Import(name="properties", required=true)
    private Output<List<String>> properties;

    /**
     * @return Identifies the properties monitored in the stream
     * 
     */
    public Output<List<String>> properties() {
        return this.properties;
    }

    @Import(name="s3Connector")
    private @Nullable Output<DatastreamS3ConnectorArgs> s3Connector;

    public Optional<Output<DatastreamS3ConnectorArgs>> s3Connector() {
        return Optional.ofNullable(this.s3Connector);
    }

    @Import(name="splunkConnector")
    private @Nullable Output<DatastreamSplunkConnectorArgs> splunkConnector;

    public Optional<Output<DatastreamSplunkConnectorArgs>> splunkConnector() {
        return Optional.ofNullable(this.splunkConnector);
    }

    /**
     * The name of the stream
     * 
     */
    @Import(name="streamName", required=true)
    private Output<String> streamName;

    /**
     * @return The name of the stream
     * 
     */
    public Output<String> streamName() {
        return this.streamName;
    }

    @Import(name="sumologicConnector")
    private @Nullable Output<DatastreamSumologicConnectorArgs> sumologicConnector;

    public Optional<Output<DatastreamSumologicConnectorArgs>> sumologicConnector() {
        return Optional.ofNullable(this.sumologicConnector);
    }

    private DatastreamArgs() {}

    private DatastreamArgs(DatastreamArgs $) {
        this.active = $.active;
        this.azureConnector = $.azureConnector;
        this.collectMidgress = $.collectMidgress;
        this.contractId = $.contractId;
        this.datadogConnector = $.datadogConnector;
        this.datasetFields = $.datasetFields;
        this.deliveryConfiguration = $.deliveryConfiguration;
        this.elasticsearchConnector = $.elasticsearchConnector;
        this.gcsConnector = $.gcsConnector;
        this.groupId = $.groupId;
        this.httpsConnector = $.httpsConnector;
        this.logglyConnector = $.logglyConnector;
        this.newRelicConnector = $.newRelicConnector;
        this.notificationEmails = $.notificationEmails;
        this.oracleConnector = $.oracleConnector;
        this.properties = $.properties;
        this.s3Connector = $.s3Connector;
        this.splunkConnector = $.splunkConnector;
        this.streamName = $.streamName;
        this.sumologicConnector = $.sumologicConnector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamArgs $;

        public Builder() {
            $ = new DatastreamArgs();
        }

        public Builder(DatastreamArgs defaults) {
            $ = new DatastreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Defining if stream should be active or not
         * 
         * @return builder
         * 
         */
        public Builder active(Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Defining if stream should be active or not
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        public Builder azureConnector(@Nullable Output<DatastreamAzureConnectorArgs> azureConnector) {
            $.azureConnector = azureConnector;
            return this;
        }

        public Builder azureConnector(DatastreamAzureConnectorArgs azureConnector) {
            return azureConnector(Output.of(azureConnector));
        }

        /**
         * @param collectMidgress Identifies if stream needs to collect midgress data
         * 
         * @return builder
         * 
         */
        public Builder collectMidgress(@Nullable Output<Boolean> collectMidgress) {
            $.collectMidgress = collectMidgress;
            return this;
        }

        /**
         * @param collectMidgress Identifies if stream needs to collect midgress data
         * 
         * @return builder
         * 
         */
        public Builder collectMidgress(Boolean collectMidgress) {
            return collectMidgress(Output.of(collectMidgress));
        }

        /**
         * @param contractId Identifies the contract that has access to the product
         * 
         * @return builder
         * 
         */
        public Builder contractId(Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param contractId Identifies the contract that has access to the product
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        public Builder datadogConnector(@Nullable Output<DatastreamDatadogConnectorArgs> datadogConnector) {
            $.datadogConnector = datadogConnector;
            return this;
        }

        public Builder datadogConnector(DatastreamDatadogConnectorArgs datadogConnector) {
            return datadogConnector(Output.of(datadogConnector));
        }

        /**
         * @param datasetFields A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
         * identifiers define how the value for these fields appear in the log lines
         * 
         * @return builder
         * 
         */
        public Builder datasetFields(Output<List<Integer>> datasetFields) {
            $.datasetFields = datasetFields;
            return this;
        }

        /**
         * @param datasetFields A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
         * identifiers define how the value for these fields appear in the log lines
         * 
         * @return builder
         * 
         */
        public Builder datasetFields(List<Integer> datasetFields) {
            return datasetFields(Output.of(datasetFields));
        }

        /**
         * @param datasetFields A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
         * identifiers define how the value for these fields appear in the log lines
         * 
         * @return builder
         * 
         */
        public Builder datasetFields(Integer... datasetFields) {
            return datasetFields(List.of(datasetFields));
        }

        /**
         * @param deliveryConfiguration Provides information about the configuration related to logs (format, file names, delivery frequency)
         * 
         * @return builder
         * 
         */
        public Builder deliveryConfiguration(Output<DatastreamDeliveryConfigurationArgs> deliveryConfiguration) {
            $.deliveryConfiguration = deliveryConfiguration;
            return this;
        }

        /**
         * @param deliveryConfiguration Provides information about the configuration related to logs (format, file names, delivery frequency)
         * 
         * @return builder
         * 
         */
        public Builder deliveryConfiguration(DatastreamDeliveryConfigurationArgs deliveryConfiguration) {
            return deliveryConfiguration(Output.of(deliveryConfiguration));
        }

        public Builder elasticsearchConnector(@Nullable Output<DatastreamElasticsearchConnectorArgs> elasticsearchConnector) {
            $.elasticsearchConnector = elasticsearchConnector;
            return this;
        }

        public Builder elasticsearchConnector(DatastreamElasticsearchConnectorArgs elasticsearchConnector) {
            return elasticsearchConnector(Output.of(elasticsearchConnector));
        }

        public Builder gcsConnector(@Nullable Output<DatastreamGcsConnectorArgs> gcsConnector) {
            $.gcsConnector = gcsConnector;
            return this;
        }

        public Builder gcsConnector(DatastreamGcsConnectorArgs gcsConnector) {
            return gcsConnector(Output.of(gcsConnector));
        }

        /**
         * @param groupId Identifies the group that has access to the product and for which the stream configuration was created
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Identifies the group that has access to the product and for which the stream configuration was created
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder httpsConnector(@Nullable Output<DatastreamHttpsConnectorArgs> httpsConnector) {
            $.httpsConnector = httpsConnector;
            return this;
        }

        public Builder httpsConnector(DatastreamHttpsConnectorArgs httpsConnector) {
            return httpsConnector(Output.of(httpsConnector));
        }

        public Builder logglyConnector(@Nullable Output<DatastreamLogglyConnectorArgs> logglyConnector) {
            $.logglyConnector = logglyConnector;
            return this;
        }

        public Builder logglyConnector(DatastreamLogglyConnectorArgs logglyConnector) {
            return logglyConnector(Output.of(logglyConnector));
        }

        public Builder newRelicConnector(@Nullable Output<DatastreamNewRelicConnectorArgs> newRelicConnector) {
            $.newRelicConnector = newRelicConnector;
            return this;
        }

        public Builder newRelicConnector(DatastreamNewRelicConnectorArgs newRelicConnector) {
            return newRelicConnector(Output.of(newRelicConnector));
        }

        /**
         * @param notificationEmails List of email addresses where the system sends notifications about activations and deactivations of the stream
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(@Nullable Output<List<String>> notificationEmails) {
            $.notificationEmails = notificationEmails;
            return this;
        }

        /**
         * @param notificationEmails List of email addresses where the system sends notifications about activations and deactivations of the stream
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(List<String> notificationEmails) {
            return notificationEmails(Output.of(notificationEmails));
        }

        /**
         * @param notificationEmails List of email addresses where the system sends notifications about activations and deactivations of the stream
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }

        public Builder oracleConnector(@Nullable Output<DatastreamOracleConnectorArgs> oracleConnector) {
            $.oracleConnector = oracleConnector;
            return this;
        }

        public Builder oracleConnector(DatastreamOracleConnectorArgs oracleConnector) {
            return oracleConnector(Output.of(oracleConnector));
        }

        /**
         * @param properties Identifies the properties monitored in the stream
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<List<String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Identifies the properties monitored in the stream
         * 
         * @return builder
         * 
         */
        public Builder properties(List<String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties Identifies the properties monitored in the stream
         * 
         * @return builder
         * 
         */
        public Builder properties(String... properties) {
            return properties(List.of(properties));
        }

        public Builder s3Connector(@Nullable Output<DatastreamS3ConnectorArgs> s3Connector) {
            $.s3Connector = s3Connector;
            return this;
        }

        public Builder s3Connector(DatastreamS3ConnectorArgs s3Connector) {
            return s3Connector(Output.of(s3Connector));
        }

        public Builder splunkConnector(@Nullable Output<DatastreamSplunkConnectorArgs> splunkConnector) {
            $.splunkConnector = splunkConnector;
            return this;
        }

        public Builder splunkConnector(DatastreamSplunkConnectorArgs splunkConnector) {
            return splunkConnector(Output.of(splunkConnector));
        }

        /**
         * @param streamName The name of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamName(Output<String> streamName) {
            $.streamName = streamName;
            return this;
        }

        /**
         * @param streamName The name of the stream
         * 
         * @return builder
         * 
         */
        public Builder streamName(String streamName) {
            return streamName(Output.of(streamName));
        }

        public Builder sumologicConnector(@Nullable Output<DatastreamSumologicConnectorArgs> sumologicConnector) {
            $.sumologicConnector = sumologicConnector;
            return this;
        }

        public Builder sumologicConnector(DatastreamSumologicConnectorArgs sumologicConnector) {
            return sumologicConnector(Output.of(sumologicConnector));
        }

        public DatastreamArgs build() {
            if ($.active == null) {
                throw new MissingRequiredPropertyException("DatastreamArgs", "active");
            }
            if ($.contractId == null) {
                throw new MissingRequiredPropertyException("DatastreamArgs", "contractId");
            }
            if ($.datasetFields == null) {
                throw new MissingRequiredPropertyException("DatastreamArgs", "datasetFields");
            }
            if ($.deliveryConfiguration == null) {
                throw new MissingRequiredPropertyException("DatastreamArgs", "deliveryConfiguration");
            }
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("DatastreamArgs", "groupId");
            }
            if ($.properties == null) {
                throw new MissingRequiredPropertyException("DatastreamArgs", "properties");
            }
            if ($.streamName == null) {
                throw new MissingRequiredPropertyException("DatastreamArgs", "streamName");
            }
            return $;
        }
    }

}
