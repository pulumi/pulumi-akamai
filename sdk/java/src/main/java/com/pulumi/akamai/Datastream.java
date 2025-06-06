// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.DatastreamArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.DatastreamState;
import com.pulumi.akamai.outputs.DatastreamAzureConnector;
import com.pulumi.akamai.outputs.DatastreamDatadogConnector;
import com.pulumi.akamai.outputs.DatastreamDeliveryConfiguration;
import com.pulumi.akamai.outputs.DatastreamElasticsearchConnector;
import com.pulumi.akamai.outputs.DatastreamGcsConnector;
import com.pulumi.akamai.outputs.DatastreamHttpsConnector;
import com.pulumi.akamai.outputs.DatastreamLogglyConnector;
import com.pulumi.akamai.outputs.DatastreamNewRelicConnector;
import com.pulumi.akamai.outputs.DatastreamOracleConnector;
import com.pulumi.akamai.outputs.DatastreamS3Connector;
import com.pulumi.akamai.outputs.DatastreamSplunkConnector;
import com.pulumi.akamai.outputs.DatastreamSumologicConnector;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/datastream:Datastream")
public class Datastream extends com.pulumi.resources.CustomResource {
    /**
     * Defining if stream should be active or not
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> active;

    /**
     * @return Defining if stream should be active or not
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    @Export(name="azureConnector", refs={DatastreamAzureConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamAzureConnector> azureConnector;

    public Output<Optional<DatastreamAzureConnector>> azureConnector() {
        return Codegen.optional(this.azureConnector);
    }
    /**
     * Identifies if stream needs to collect midgress data
     * 
     */
    @Export(name="collectMidgress", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> collectMidgress;

    /**
     * @return Identifies if stream needs to collect midgress data
     * 
     */
    public Output<Optional<Boolean>> collectMidgress() {
        return Codegen.optional(this.collectMidgress);
    }
    /**
     * Identifies the contract that has access to the product
     * 
     */
    @Export(name="contractId", refs={String.class}, tree="[0]")
    private Output<String> contractId;

    /**
     * @return Identifies the contract that has access to the product
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }
    /**
     * The username who created the stream
     * 
     */
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    /**
     * @return The username who created the stream
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * The date and time when the stream was created
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return The date and time when the stream was created
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    @Export(name="datadogConnector", refs={DatastreamDatadogConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamDatadogConnector> datadogConnector;

    public Output<Optional<DatastreamDatadogConnector>> datadogConnector() {
        return Codegen.optional(this.datadogConnector);
    }
    /**
     * A list of data set fields selected from the associated template that the stream monitors in logs. The order of the
     * identifiers define how the value for these fields appear in the log lines
     * 
     */
    @Export(name="datasetFields", refs={List.class,Integer.class}, tree="[0,1]")
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
    @Export(name="deliveryConfiguration", refs={DatastreamDeliveryConfiguration.class}, tree="[0]")
    private Output<DatastreamDeliveryConfiguration> deliveryConfiguration;

    /**
     * @return Provides information about the configuration related to logs (format, file names, delivery frequency)
     * 
     */
    public Output<DatastreamDeliveryConfiguration> deliveryConfiguration() {
        return this.deliveryConfiguration;
    }
    @Export(name="elasticsearchConnector", refs={DatastreamElasticsearchConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamElasticsearchConnector> elasticsearchConnector;

    public Output<Optional<DatastreamElasticsearchConnector>> elasticsearchConnector() {
        return Codegen.optional(this.elasticsearchConnector);
    }
    @Export(name="gcsConnector", refs={DatastreamGcsConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamGcsConnector> gcsConnector;

    public Output<Optional<DatastreamGcsConnector>> gcsConnector() {
        return Codegen.optional(this.gcsConnector);
    }
    /**
     * Identifies the group that has access to the product and for which the stream configuration was created
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return Identifies the group that has access to the product and for which the stream configuration was created
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    @Export(name="httpsConnector", refs={DatastreamHttpsConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamHttpsConnector> httpsConnector;

    public Output<Optional<DatastreamHttpsConnector>> httpsConnector() {
        return Codegen.optional(this.httpsConnector);
    }
    /**
     * Identifies the latest active configuration version of the stream
     * 
     */
    @Export(name="latestVersion", refs={Integer.class}, tree="[0]")
    private Output<Integer> latestVersion;

    /**
     * @return Identifies the latest active configuration version of the stream
     * 
     */
    public Output<Integer> latestVersion() {
        return this.latestVersion;
    }
    @Export(name="logglyConnector", refs={DatastreamLogglyConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamLogglyConnector> logglyConnector;

    public Output<Optional<DatastreamLogglyConnector>> logglyConnector() {
        return Codegen.optional(this.logglyConnector);
    }
    /**
     * The username who modified the stream
     * 
     */
    @Export(name="modifiedBy", refs={String.class}, tree="[0]")
    private Output<String> modifiedBy;

    /**
     * @return The username who modified the stream
     * 
     */
    public Output<String> modifiedBy() {
        return this.modifiedBy;
    }
    /**
     * The date and time when the stream was modified
     * 
     */
    @Export(name="modifiedDate", refs={String.class}, tree="[0]")
    private Output<String> modifiedDate;

    /**
     * @return The date and time when the stream was modified
     * 
     */
    public Output<String> modifiedDate() {
        return this.modifiedDate;
    }
    @Export(name="newRelicConnector", refs={DatastreamNewRelicConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamNewRelicConnector> newRelicConnector;

    public Output<Optional<DatastreamNewRelicConnector>> newRelicConnector() {
        return Codegen.optional(this.newRelicConnector);
    }
    /**
     * List of email addresses where the system sends notifications about activations and deactivations of the stream
     * 
     */
    @Export(name="notificationEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> notificationEmails;

    /**
     * @return List of email addresses where the system sends notifications about activations and deactivations of the stream
     * 
     */
    public Output<Optional<List<String>>> notificationEmails() {
        return Codegen.optional(this.notificationEmails);
    }
    @Export(name="oracleConnector", refs={DatastreamOracleConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamOracleConnector> oracleConnector;

    public Output<Optional<DatastreamOracleConnector>> oracleConnector() {
        return Codegen.optional(this.oracleConnector);
    }
    /**
     * The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
     * 
     */
    @Export(name="papiJson", refs={String.class}, tree="[0]")
    private Output<String> papiJson;

    /**
     * @return The configuration in JSON format that can be copy-pasted into PAPI configuration to enable datastream behavior
     * 
     */
    public Output<String> papiJson() {
        return this.papiJson;
    }
    /**
     * The ID of the product for which the stream was created
     * 
     */
    @Export(name="productId", refs={String.class}, tree="[0]")
    private Output<String> productId;

    /**
     * @return The ID of the product for which the stream was created
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }
    /**
     * Identifies the properties monitored in the stream
     * 
     */
    @Export(name="properties", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> properties;

    /**
     * @return Identifies the properties monitored in the stream
     * 
     */
    public Output<List<String>> properties() {
        return this.properties;
    }
    @Export(name="s3Connector", refs={DatastreamS3Connector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamS3Connector> s3Connector;

    public Output<Optional<DatastreamS3Connector>> s3Connector() {
        return Codegen.optional(this.s3Connector);
    }
    @Export(name="splunkConnector", refs={DatastreamSplunkConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamSplunkConnector> splunkConnector;

    public Output<Optional<DatastreamSplunkConnector>> splunkConnector() {
        return Codegen.optional(this.splunkConnector);
    }
    /**
     * The name of the stream
     * 
     */
    @Export(name="streamName", refs={String.class}, tree="[0]")
    private Output<String> streamName;

    /**
     * @return The name of the stream
     * 
     */
    public Output<String> streamName() {
        return this.streamName;
    }
    /**
     * Identifies the configuration version of the stream
     * 
     */
    @Export(name="streamVersion", refs={Integer.class}, tree="[0]")
    private Output<Integer> streamVersion;

    /**
     * @return Identifies the configuration version of the stream
     * 
     */
    public Output<Integer> streamVersion() {
        return this.streamVersion;
    }
    @Export(name="sumologicConnector", refs={DatastreamSumologicConnector.class}, tree="[0]")
    private Output</* @Nullable */ DatastreamSumologicConnector> sumologicConnector;

    public Output<Optional<DatastreamSumologicConnector>> sumologicConnector() {
        return Codegen.optional(this.sumologicConnector);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Datastream(java.lang.String name) {
        this(name, DatastreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Datastream(java.lang.String name, DatastreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Datastream(java.lang.String name, DatastreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/datastream:Datastream", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Datastream(java.lang.String name, Output<java.lang.String> id, @Nullable DatastreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/datastream:Datastream", name, state, makeResourceOptions(options, id), false);
    }

    private static DatastreamArgs makeArgs(DatastreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatastreamArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Datastream get(java.lang.String name, Output<java.lang.String> id, @Nullable DatastreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Datastream(name, id, state, options);
    }
}
