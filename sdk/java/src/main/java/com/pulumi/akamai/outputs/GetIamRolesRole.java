// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIamRolesRole {
    /**
     * @return The user name or email of the person who created the role.
     * 
     */
    private String createdBy;
    /**
     * @return The role&#39;s description.
     * 
     */
    private String description;
    /**
     * @return The username or email of the last person to edit the role.
     * 
     */
    private String modifiedBy;
    /**
     * @return The role&#39;s name.
     * 
     */
    private String name;
    /**
     * @return A unique identifier for each role.
     * 
     */
    private String roleId;
    /**
     * @return ISO 8601 timestamp indicating when the role was originally created.
     * 
     */
    private String timeCreated;
    /**
     * @return ISO 8601 timestamp indicating when the role was last updated.
     * 
     */
    private String timeModified;
    /**
     * @return Whether the role is a standard role or a custom role.
     * 
     */
    private String type;

    private GetIamRolesRole() {}
    /**
     * @return The user name or email of the person who created the role.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The role&#39;s description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The username or email of the last person to edit the role.
     * 
     */
    public String modifiedBy() {
        return this.modifiedBy;
    }
    /**
     * @return The role&#39;s name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A unique identifier for each role.
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    /**
     * @return ISO 8601 timestamp indicating when the role was originally created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return ISO 8601 timestamp indicating when the role was last updated.
     * 
     */
    public String timeModified() {
        return this.timeModified;
    }
    /**
     * @return Whether the role is a standard role or a custom role.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIamRolesRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdBy;
        private String description;
        private String modifiedBy;
        private String name;
        private String roleId;
        private String timeCreated;
        private String timeModified;
        private String type;
        public Builder() {}
        public Builder(GetIamRolesRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdBy = defaults.createdBy;
    	      this.description = defaults.description;
    	      this.modifiedBy = defaults.modifiedBy;
    	      this.name = defaults.name;
    	      this.roleId = defaults.roleId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            if (createdBy == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedBy(String modifiedBy) {
            if (modifiedBy == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "modifiedBy");
            }
            this.modifiedBy = modifiedBy;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder timeCreated(String timeCreated) {
            if (timeCreated == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "timeCreated");
            }
            this.timeCreated = timeCreated;
            return this;
        }
        @CustomType.Setter
        public Builder timeModified(String timeModified) {
            if (timeModified == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "timeModified");
            }
            this.timeModified = timeModified;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetIamRolesRole", "type");
            }
            this.type = type;
            return this;
        }
        public GetIamRolesRole build() {
            final var _resultValue = new GetIamRolesRole();
            _resultValue.createdBy = createdBy;
            _resultValue.description = description;
            _resultValue.modifiedBy = modifiedBy;
            _resultValue.name = name;
            _resultValue.roleId = roleId;
            _resultValue.timeCreated = timeCreated;
            _resultValue.timeModified = timeModified;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
