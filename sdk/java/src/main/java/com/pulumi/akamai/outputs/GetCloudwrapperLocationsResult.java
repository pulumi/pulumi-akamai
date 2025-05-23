// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudwrapperLocationsLocation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudwrapperLocationsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable List<GetCloudwrapperLocationsLocation> locations;

    private GetCloudwrapperLocationsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetCloudwrapperLocationsLocation> locations() {
        return this.locations == null ? List.of() : this.locations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperLocationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable List<GetCloudwrapperLocationsLocation> locations;
        public Builder() {}
        public Builder(GetCloudwrapperLocationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.locations = defaults.locations;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudwrapperLocationsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder locations(@Nullable List<GetCloudwrapperLocationsLocation> locations) {

            this.locations = locations;
            return this;
        }
        public Builder locations(GetCloudwrapperLocationsLocation... locations) {
            return locations(List.of(locations));
        }
        public GetCloudwrapperLocationsResult build() {
            final var _resultValue = new GetCloudwrapperLocationsResult();
            _resultValue.id = id;
            _resultValue.locations = locations;
            return _resultValue;
        }
    }
}
