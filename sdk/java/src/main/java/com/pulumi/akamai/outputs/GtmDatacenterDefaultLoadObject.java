// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GtmDatacenterDefaultLoadObject {
    private @Nullable String loadObject;
    private @Nullable Integer loadObjectPort;
    private @Nullable List<String> loadServers;

    private GtmDatacenterDefaultLoadObject() {}
    public Optional<String> loadObject() {
        return Optional.ofNullable(this.loadObject);
    }
    public Optional<Integer> loadObjectPort() {
        return Optional.ofNullable(this.loadObjectPort);
    }
    public List<String> loadServers() {
        return this.loadServers == null ? List.of() : this.loadServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GtmDatacenterDefaultLoadObject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String loadObject;
        private @Nullable Integer loadObjectPort;
        private @Nullable List<String> loadServers;
        public Builder() {}
        public Builder(GtmDatacenterDefaultLoadObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadObject = defaults.loadObject;
    	      this.loadObjectPort = defaults.loadObjectPort;
    	      this.loadServers = defaults.loadServers;
        }

        @CustomType.Setter
        public Builder loadObject(@Nullable String loadObject) {

            this.loadObject = loadObject;
            return this;
        }
        @CustomType.Setter
        public Builder loadObjectPort(@Nullable Integer loadObjectPort) {

            this.loadObjectPort = loadObjectPort;
            return this;
        }
        @CustomType.Setter
        public Builder loadServers(@Nullable List<String> loadServers) {

            this.loadServers = loadServers;
            return this;
        }
        public Builder loadServers(String... loadServers) {
            return loadServers(List.of(loadServers));
        }
        public GtmDatacenterDefaultLoadObject build() {
            final var _resultValue = new GtmDatacenterDefaultLoadObject();
            _resultValue.loadObject = loadObject;
            _resultValue.loadObjectPort = loadObjectPort;
            _resultValue.loadServers = loadServers;
            return _resultValue;
        }
    }
}
