// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperPropertiesProperty {
    /**
     * @return Contract ID having Cloud Wrapper entitlement.
     * 
     */
    private String contractId;
    /**
     * @return ID of the group which the property belongs to.
     * 
     */
    private Integer groupId;
    /**
     * @return Property ID of the property.
     * 
     */
    private Integer propertyId;
    /**
     * @return Name of the property belonging to the origin.
     * 
     */
    private String propertyName;
    /**
     * @return The type of property. MEDIA applies to live or video on demand content. WEB applies to website or app content.
     * 
     */
    private String type;

    private GetCloudwrapperPropertiesProperty() {}
    /**
     * @return Contract ID having Cloud Wrapper entitlement.
     * 
     */
    public String contractId() {
        return this.contractId;
    }
    /**
     * @return ID of the group which the property belongs to.
     * 
     */
    public Integer groupId() {
        return this.groupId;
    }
    /**
     * @return Property ID of the property.
     * 
     */
    public Integer propertyId() {
        return this.propertyId;
    }
    /**
     * @return Name of the property belonging to the origin.
     * 
     */
    public String propertyName() {
        return this.propertyName;
    }
    /**
     * @return The type of property. MEDIA applies to live or video on demand content. WEB applies to website or app content.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperPropertiesProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private Integer groupId;
        private Integer propertyId;
        private String propertyName;
        private String type;
        public Builder() {}
        public Builder(GetCloudwrapperPropertiesProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.groupId = defaults.groupId;
    	      this.propertyId = defaults.propertyId;
    	      this.propertyName = defaults.propertyName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperPropertiesProperty", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(Integer groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperPropertiesProperty", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder propertyId(Integer propertyId) {
            if (propertyId == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperPropertiesProperty", "propertyId");
            }
            this.propertyId = propertyId;
            return this;
        }
        @CustomType.Setter
        public Builder propertyName(String propertyName) {
            if (propertyName == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperPropertiesProperty", "propertyName");
            }
            this.propertyName = propertyName;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperPropertiesProperty", "type");
            }
            this.type = type;
            return this;
        }
        public GetCloudwrapperPropertiesProperty build() {
            final var _resultValue = new GetCloudwrapperPropertiesProperty();
            _resultValue.contractId = contractId;
            _resultValue.groupId = groupId;
            _resultValue.propertyId = propertyId;
            _resultValue.propertyName = propertyName;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
