// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSecConfigurationResult {
    private Integer configId;
    private List<String> hostNames;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Integer latestVersion;
    private @Nullable String name;
    private String outputText;
    private Integer productionVersion;
    private Integer stagingVersion;

    private GetAppSecConfigurationResult() {}
    public Integer configId() {
        return this.configId;
    }
    public List<String> hostNames() {
        return this.hostNames;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer latestVersion() {
        return this.latestVersion;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String outputText() {
        return this.outputText;
    }
    public Integer productionVersion() {
        return this.productionVersion;
    }
    public Integer stagingVersion() {
        return this.stagingVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSecConfigurationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private List<String> hostNames;
        private String id;
        private Integer latestVersion;
        private @Nullable String name;
        private String outputText;
        private Integer productionVersion;
        private Integer stagingVersion;
        public Builder() {}
        public Builder(GetAppSecConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.hostNames = defaults.hostNames;
    	      this.id = defaults.id;
    	      this.latestVersion = defaults.latestVersion;
    	      this.name = defaults.name;
    	      this.outputText = defaults.outputText;
    	      this.productionVersion = defaults.productionVersion;
    	      this.stagingVersion = defaults.stagingVersion;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            if (configId == null) {
              throw new MissingRequiredPropertyException("GetAppSecConfigurationResult", "configId");
            }
            this.configId = configId;
            return this;
        }
        @CustomType.Setter
        public Builder hostNames(List<String> hostNames) {
            if (hostNames == null) {
              throw new MissingRequiredPropertyException("GetAppSecConfigurationResult", "hostNames");
            }
            this.hostNames = hostNames;
            return this;
        }
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAppSecConfigurationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder latestVersion(Integer latestVersion) {
            if (latestVersion == null) {
              throw new MissingRequiredPropertyException("GetAppSecConfigurationResult", "latestVersion");
            }
            this.latestVersion = latestVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder outputText(String outputText) {
            if (outputText == null) {
              throw new MissingRequiredPropertyException("GetAppSecConfigurationResult", "outputText");
            }
            this.outputText = outputText;
            return this;
        }
        @CustomType.Setter
        public Builder productionVersion(Integer productionVersion) {
            if (productionVersion == null) {
              throw new MissingRequiredPropertyException("GetAppSecConfigurationResult", "productionVersion");
            }
            this.productionVersion = productionVersion;
            return this;
        }
        @CustomType.Setter
        public Builder stagingVersion(Integer stagingVersion) {
            if (stagingVersion == null) {
              throw new MissingRequiredPropertyException("GetAppSecConfigurationResult", "stagingVersion");
            }
            this.stagingVersion = stagingVersion;
            return this;
        }
        public GetAppSecConfigurationResult build() {
            final var _resultValue = new GetAppSecConfigurationResult();
            _resultValue.configId = configId;
            _resultValue.hostNames = hostNames;
            _resultValue.id = id;
            _resultValue.latestVersion = latestVersion;
            _resultValue.name = name;
            _resultValue.outputText = outputText;
            _resultValue.productionVersion = productionVersion;
            _resultValue.stagingVersion = stagingVersion;
            return _resultValue;
        }
    }
}
