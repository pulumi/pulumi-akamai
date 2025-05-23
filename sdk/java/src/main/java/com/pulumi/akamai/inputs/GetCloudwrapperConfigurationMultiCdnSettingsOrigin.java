// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationMultiCdnSettingsOrigin extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudwrapperConfigurationMultiCdnSettingsOrigin Empty = new GetCloudwrapperConfigurationMultiCdnSettingsOrigin();

    /**
     * Origins hostname corresponding to the Akamai Delivery Property.
     * 
     */
    @Import(name="hostname", required=true)
    private String hostname;

    /**
     * @return Origins hostname corresponding to the Akamai Delivery Property.
     * 
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Origin identifier and will be used to generated Multi CDN host names.
     * 
     */
    @Import(name="originId", required=true)
    private String originId;

    /**
     * @return Origin identifier and will be used to generated Multi CDN host names.
     * 
     */
    public String originId() {
        return this.originId;
    }

    /**
     * Property ID of the property that origin belongs to.
     * 
     */
    @Import(name="propertyId", required=true)
    private Integer propertyId;

    /**
     * @return Property ID of the property that origin belongs to.
     * 
     */
    public Integer propertyId() {
        return this.propertyId;
    }

    private GetCloudwrapperConfigurationMultiCdnSettingsOrigin() {}

    private GetCloudwrapperConfigurationMultiCdnSettingsOrigin(GetCloudwrapperConfigurationMultiCdnSettingsOrigin $) {
        this.hostname = $.hostname;
        this.originId = $.originId;
        this.propertyId = $.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettingsOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationMultiCdnSettingsOrigin $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsOrigin();
        }

        public Builder(GetCloudwrapperConfigurationMultiCdnSettingsOrigin defaults) {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsOrigin(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname Origins hostname corresponding to the Akamai Delivery Property.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param originId Origin identifier and will be used to generated Multi CDN host names.
         * 
         * @return builder
         * 
         */
        public Builder originId(String originId) {
            $.originId = originId;
            return this;
        }

        /**
         * @param propertyId Property ID of the property that origin belongs to.
         * 
         * @return builder
         * 
         */
        public Builder propertyId(Integer propertyId) {
            $.propertyId = propertyId;
            return this;
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsOrigin build() {
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationMultiCdnSettingsOrigin", "hostname");
            }
            if ($.originId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationMultiCdnSettingsOrigin", "originId");
            }
            if ($.propertyId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationMultiCdnSettingsOrigin", "propertyId");
            }
            return $;
        }
    }

}
