// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGtmGeomapAssignment {
    /**
     * @return Specifies an array of two-letter ISO 3166 country codes, or for finer subdivisions, the two-letter country code and the two-letter state or province code separated by a forward slash.
     * 
     */
    private List<String> countries;
    /**
     * @return A unique identifier for an existing data center in the domain.
     * 
     */
    private Integer datacenterId;
    /**
     * @return A descriptive label for the group.
     * 
     */
    private String nickname;

    private GetGtmGeomapAssignment() {}
    /**
     * @return Specifies an array of two-letter ISO 3166 country codes, or for finer subdivisions, the two-letter country code and the two-letter state or province code separated by a forward slash.
     * 
     */
    public List<String> countries() {
        return this.countries;
    }
    /**
     * @return A unique identifier for an existing data center in the domain.
     * 
     */
    public Integer datacenterId() {
        return this.datacenterId;
    }
    /**
     * @return A descriptive label for the group.
     * 
     */
    public String nickname() {
        return this.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGtmGeomapAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> countries;
        private Integer datacenterId;
        private String nickname;
        public Builder() {}
        public Builder(GetGtmGeomapAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countries = defaults.countries;
    	      this.datacenterId = defaults.datacenterId;
    	      this.nickname = defaults.nickname;
        }

        @CustomType.Setter
        public Builder countries(List<String> countries) {
            if (countries == null) {
              throw new MissingRequiredPropertyException("GetGtmGeomapAssignment", "countries");
            }
            this.countries = countries;
            return this;
        }
        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }
        @CustomType.Setter
        public Builder datacenterId(Integer datacenterId) {
            if (datacenterId == null) {
              throw new MissingRequiredPropertyException("GetGtmGeomapAssignment", "datacenterId");
            }
            this.datacenterId = datacenterId;
            return this;
        }
        @CustomType.Setter
        public Builder nickname(String nickname) {
            if (nickname == null) {
              throw new MissingRequiredPropertyException("GetGtmGeomapAssignment", "nickname");
            }
            this.nickname = nickname;
            return this;
        }
        public GetGtmGeomapAssignment build() {
            final var _resultValue = new GetGtmGeomapAssignment();
            _resultValue.countries = countries;
            _resultValue.datacenterId = datacenterId;
            _resultValue.nickname = nickname;
            return _resultValue;
        }
    }
}
