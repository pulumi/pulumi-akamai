// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDnsRecordSetResult {
    private String host;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> rdatas;
    private String recordType;
    private String zone;

    private GetDnsRecordSetResult() {}
    public String host() {
        return this.host;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> rdatas() {
        return this.rdatas;
    }
    public String recordType() {
        return this.recordType;
    }
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDnsRecordSetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private String id;
        private List<String> rdatas;
        private String recordType;
        private String zone;
        public Builder() {}
        public Builder(GetDnsRecordSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.rdatas = defaults.rdatas;
    	      this.recordType = defaults.recordType;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordSetResult", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordSetResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder rdatas(List<String> rdatas) {
            if (rdatas == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordSetResult", "rdatas");
            }
            this.rdatas = rdatas;
            return this;
        }
        public Builder rdatas(String... rdatas) {
            return rdatas(List.of(rdatas));
        }
        @CustomType.Setter
        public Builder recordType(String recordType) {
            if (recordType == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordSetResult", "recordType");
            }
            this.recordType = recordType;
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            if (zone == null) {
              throw new MissingRequiredPropertyException("GetDnsRecordSetResult", "zone");
            }
            this.zone = zone;
            return this;
        }
        public GetDnsRecordSetResult build() {
            final var _resultValue = new GetDnsRecordSetResult();
            _resultValue.host = host;
            _resultValue.id = id;
            _resultValue.rdatas = rdatas;
            _resultValue.recordType = recordType;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
