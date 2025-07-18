// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.IamApiClientGroupAccessGroup;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IamApiClientGroupAccess {
    /**
     * @return Sets the API client&#39;s group access the same as the authorized user.
     * 
     */
    private Boolean cloneAuthorizedUserGroups;
    /**
     * @return Groups the API client can access.
     * 
     */
    private @Nullable List<IamApiClientGroupAccessGroup> groups;

    private IamApiClientGroupAccess() {}
    /**
     * @return Sets the API client&#39;s group access the same as the authorized user.
     * 
     */
    public Boolean cloneAuthorizedUserGroups() {
        return this.cloneAuthorizedUserGroups;
    }
    /**
     * @return Groups the API client can access.
     * 
     */
    public List<IamApiClientGroupAccessGroup> groups() {
        return this.groups == null ? List.of() : this.groups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamApiClientGroupAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cloneAuthorizedUserGroups;
        private @Nullable List<IamApiClientGroupAccessGroup> groups;
        public Builder() {}
        public Builder(IamApiClientGroupAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloneAuthorizedUserGroups = defaults.cloneAuthorizedUserGroups;
    	      this.groups = defaults.groups;
        }

        @CustomType.Setter
        public Builder cloneAuthorizedUserGroups(Boolean cloneAuthorizedUserGroups) {
            if (cloneAuthorizedUserGroups == null) {
              throw new MissingRequiredPropertyException("IamApiClientGroupAccess", "cloneAuthorizedUserGroups");
            }
            this.cloneAuthorizedUserGroups = cloneAuthorizedUserGroups;
            return this;
        }
        @CustomType.Setter
        public Builder groups(@Nullable List<IamApiClientGroupAccessGroup> groups) {

            this.groups = groups;
            return this;
        }
        public Builder groups(IamApiClientGroupAccessGroup... groups) {
            return groups(List.of(groups));
        }
        public IamApiClientGroupAccess build() {
            final var _resultValue = new IamApiClientGroupAccess();
            _resultValue.cloneAuthorizedUserGroups = cloneAuthorizedUserGroups;
            _resultValue.groups = groups;
            return _resultValue;
        }
    }
}
