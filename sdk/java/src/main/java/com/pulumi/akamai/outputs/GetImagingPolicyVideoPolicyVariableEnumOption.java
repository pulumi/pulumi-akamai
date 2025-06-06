// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagingPolicyVideoPolicyVariableEnumOption {
    /**
     * @return The unique identifier for each enum value, up to 50 alphanumeric characters.
     * 
     */
    private String id;
    /**
     * @return The value of the variable when the `id` is provided.
     * 
     */
    private String value;

    private GetImagingPolicyVideoPolicyVariableEnumOption() {}
    /**
     * @return The unique identifier for each enum value, up to 50 alphanumeric characters.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The value of the variable when the `id` is provided.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyVideoPolicyVariableEnumOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String value;
        public Builder() {}
        public Builder(GetImagingPolicyVideoPolicyVariableEnumOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariableEnumOption", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariableEnumOption", "value");
            }
            this.value = value;
            return this;
        }
        public GetImagingPolicyVideoPolicyVariableEnumOption build() {
            final var _resultValue = new GetImagingPolicyVideoPolicyVariableEnumOption();
            _resultValue.id = id;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
