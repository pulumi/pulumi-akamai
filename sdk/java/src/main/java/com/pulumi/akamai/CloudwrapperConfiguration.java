// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.CloudwrapperConfigurationArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.CloudwrapperConfigurationState;
import com.pulumi.akamai.outputs.CloudwrapperConfigurationLocation;
import com.pulumi.akamai.outputs.CloudwrapperConfigurationTimeouts;
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

@ResourceType(type="akamai:index/cloudwrapperConfiguration:CloudwrapperConfiguration")
public class CloudwrapperConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Capacity Alerts enablement information for the configuration. The Alert Threshold should be between 50 and 100.
     * 
     */
    @Export(name="capacityAlertsThreshold", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> capacityAlertsThreshold;

    /**
     * @return Capacity Alerts enablement information for the configuration. The Alert Threshold should be between 50 and 100.
     * 
     */
    public Output<Optional<Integer>> capacityAlertsThreshold() {
        return Codegen.optional(this.capacityAlertsThreshold);
    }
    /**
     * Additional information you provide to differentiate or track changes of the configuration.
     * 
     */
    @Export(name="comments", refs={String.class}, tree="[0]")
    private Output<String> comments;

    /**
     * @return Additional information you provide to differentiate or track changes of the configuration.
     * 
     */
    public Output<String> comments() {
        return this.comments;
    }
    /**
     * Name of the configuration.
     * 
     */
    @Export(name="configName", refs={String.class}, tree="[0]")
    private Output<String> configName;

    /**
     * @return Name of the configuration.
     * 
     */
    public Output<String> configName() {
        return this.configName;
    }
    /**
     * Contract ID having Cloud Wrapper entitlement.
     * 
     */
    @Export(name="contractId", refs={String.class}, tree="[0]")
    private Output<String> contractId;

    /**
     * @return Contract ID having Cloud Wrapper entitlement.
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }
    /**
     * List of locations to use with the configuration.
     * 
     */
    @Export(name="locations", refs={List.class,CloudwrapperConfigurationLocation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CloudwrapperConfigurationLocation>> locations;

    /**
     * @return List of locations to use with the configuration.
     * 
     */
    public Output<Optional<List<CloudwrapperConfigurationLocation>>> locations() {
        return Codegen.optional(this.locations);
    }
    /**
     * Email addresses to use for notifications.
     * 
     */
    @Export(name="notificationEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notificationEmails;

    /**
     * @return Email addresses to use for notifications.
     * 
     */
    public Output<List<String>> notificationEmails() {
        return this.notificationEmails;
    }
    /**
     * List of properties belonging to eligible products.
     * 
     */
    @Export(name="propertyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> propertyIds;

    /**
     * @return List of properties belonging to eligible products.
     * 
     */
    public Output<List<String>> propertyIds() {
        return this.propertyIds;
    }
    /**
     * Retain idle objects beyond their max idle lifetime.
     * 
     */
    @Export(name="retainIdleObjects", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> retainIdleObjects;

    /**
     * @return Retain idle objects beyond their max idle lifetime.
     * 
     */
    public Output<Boolean> retainIdleObjects() {
        return this.retainIdleObjects;
    }
    /**
     * Unique hash value of the configuration.
     * 
     */
    @Export(name="revision", refs={String.class}, tree="[0]")
    private Output<String> revision;

    /**
     * @return Unique hash value of the configuration.
     * 
     */
    public Output<String> revision() {
        return this.revision;
    }
    @Export(name="timeouts", refs={CloudwrapperConfigurationTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ CloudwrapperConfigurationTimeouts> timeouts;

    public Output<Optional<CloudwrapperConfigurationTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudwrapperConfiguration(java.lang.String name) {
        this(name, CloudwrapperConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudwrapperConfiguration(java.lang.String name, CloudwrapperConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudwrapperConfiguration(java.lang.String name, CloudwrapperConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudwrapperConfiguration:CloudwrapperConfiguration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CloudwrapperConfiguration(java.lang.String name, Output<java.lang.String> id, @Nullable CloudwrapperConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudwrapperConfiguration:CloudwrapperConfiguration", name, state, makeResourceOptions(options, id), false);
    }

    private static CloudwrapperConfigurationArgs makeArgs(CloudwrapperConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CloudwrapperConfigurationArgs.Empty : args;
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
    public static CloudwrapperConfiguration get(java.lang.String name, Output<java.lang.String> id, @Nullable CloudwrapperConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudwrapperConfiguration(name, id, state, options);
    }
}
