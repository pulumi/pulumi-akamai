// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudaccessKeyPropertiesProperty;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloudaccessKeyPropertiesResult {
    private String accessKeyName;
    private Integer accessKeyUid;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetCloudaccessKeyPropertiesProperty> properties;

    private GetCloudaccessKeyPropertiesResult() {}
    public String accessKeyName() {
        return this.accessKeyName;
    }
    public Integer accessKeyUid() {
        return this.accessKeyUid;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetCloudaccessKeyPropertiesProperty> properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudaccessKeyPropertiesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKeyName;
        private Integer accessKeyUid;
        private String id;
        private List<GetCloudaccessKeyPropertiesProperty> properties;
        public Builder() {}
        public Builder(GetCloudaccessKeyPropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyName = defaults.accessKeyName;
    	      this.accessKeyUid = defaults.accessKeyUid;
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        @CustomType.Setter
        public Builder accessKeyName(String accessKeyName) {
            if (accessKeyName == null) {
              throw new MissingRequiredPropertyException("GetCloudaccessKeyPropertiesResult", "accessKeyName");
            }
            this.accessKeyName = accessKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder accessKeyUid(Integer accessKeyUid) {
            if (accessKeyUid == null) {
              throw new MissingRequiredPropertyException("GetCloudaccessKeyPropertiesResult", "accessKeyUid");
            }
            this.accessKeyUid = accessKeyUid;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudaccessKeyPropertiesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder properties(List<GetCloudaccessKeyPropertiesProperty> properties) {
            if (properties == null) {
              throw new MissingRequiredPropertyException("GetCloudaccessKeyPropertiesResult", "properties");
            }
            this.properties = properties;
            return this;
        }
        public Builder properties(GetCloudaccessKeyPropertiesProperty... properties) {
            return properties(List.of(properties));
        }
        public GetCloudaccessKeyPropertiesResult build() {
            final var _resultValue = new GetCloudaccessKeyPropertiesResult();
            _resultValue.accessKeyName = accessKeyName;
            _resultValue.accessKeyUid = accessKeyUid;
            _resultValue.id = id;
            _resultValue.properties = properties;
            return _resultValue;
        }
    }
}
