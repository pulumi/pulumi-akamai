// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IamApiClientIpAcl {
    /**
     * @return IP addresses or CIDR blocks the API client can access.
     * 
     */
    private @Nullable List<String> cidrs;
    /**
     * @return Enables the API client to access the IP access control list (ACL).
     * 
     */
    private Boolean enable;

    private IamApiClientIpAcl() {}
    /**
     * @return IP addresses or CIDR blocks the API client can access.
     * 
     */
    public List<String> cidrs() {
        return this.cidrs == null ? List.of() : this.cidrs;
    }
    /**
     * @return Enables the API client to access the IP access control list (ACL).
     * 
     */
    public Boolean enable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamApiClientIpAcl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cidrs;
        private Boolean enable;
        public Builder() {}
        public Builder(IamApiClientIpAcl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder cidrs(@Nullable List<String> cidrs) {

            this.cidrs = cidrs;
            return this;
        }
        public Builder cidrs(String... cidrs) {
            return cidrs(List.of(cidrs));
        }
        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("IamApiClientIpAcl", "enable");
            }
            this.enable = enable;
            return this;
        }
        public IamApiClientIpAcl build() {
            final var _resultValue = new IamApiClientIpAcl();
            _resultValue.cidrs = cidrs;
            _resultValue.enable = enable;
            return _resultValue;
        }
    }
}
