// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyHostnameActivationsHostnameActivation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyHostnameActivationsResult {
    private String accountId;
    private String contractId;
    private String groupId;
    private List<GetPropertyHostnameActivationsHostnameActivation> hostnameActivations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String network;
    private String propertyId;
    private String propertyName;

    private GetPropertyHostnameActivationsResult() {}
    public String accountId() {
        return this.accountId;
    }
    public String contractId() {
        return this.contractId;
    }
    public String groupId() {
        return this.groupId;
    }
    public List<GetPropertyHostnameActivationsHostnameActivation> hostnameActivations() {
        return this.hostnameActivations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    public String propertyId() {
        return this.propertyId;
    }
    public String propertyName() {
        return this.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyHostnameActivationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String contractId;
        private String groupId;
        private List<GetPropertyHostnameActivationsHostnameActivation> hostnameActivations;
        private String id;
        private @Nullable String network;
        private String propertyId;
        private String propertyName;
        public Builder() {}
        public Builder(GetPropertyHostnameActivationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.contractId = defaults.contractId;
    	      this.groupId = defaults.groupId;
    	      this.hostnameActivations = defaults.hostnameActivations;
    	      this.id = defaults.id;
    	      this.network = defaults.network;
    	      this.propertyId = defaults.propertyId;
    	      this.propertyName = defaults.propertyName;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsResult", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsResult", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder hostnameActivations(List<GetPropertyHostnameActivationsHostnameActivation> hostnameActivations) {
            if (hostnameActivations == null) {
              throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsResult", "hostnameActivations");
            }
            this.hostnameActivations = hostnameActivations;
            return this;
        }
        public Builder hostnameActivations(GetPropertyHostnameActivationsHostnameActivation... hostnameActivations) {
            return hostnameActivations(List.of(hostnameActivations));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder propertyId(String propertyId) {
            if (propertyId == null) {
              throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsResult", "propertyId");
            }
            this.propertyId = propertyId;
            return this;
        }
        @CustomType.Setter
        public Builder propertyName(String propertyName) {
            if (propertyName == null) {
              throw new MissingRequiredPropertyException("GetPropertyHostnameActivationsResult", "propertyName");
            }
            this.propertyName = propertyName;
            return this;
        }
        public GetPropertyHostnameActivationsResult build() {
            final var _resultValue = new GetPropertyHostnameActivationsResult();
            _resultValue.accountId = accountId;
            _resultValue.contractId = contractId;
            _resultValue.groupId = groupId;
            _resultValue.hostnameActivations = hostnameActivations;
            _resultValue.id = id;
            _resultValue.network = network;
            _resultValue.propertyId = propertyId;
            _resultValue.propertyName = propertyName;
            return _resultValue;
        }
    }
}
