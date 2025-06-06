// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetIamCidrBlocksCidrBlockActions {
    /**
     * @return Whether you can delete this CIDR block.
     * 
     */
    private Boolean delete;
    /**
     * @return Whether you can edit this CIDR block.
     * 
     */
    private Boolean edit;

    private GetIamCidrBlocksCidrBlockActions() {}
    /**
     * @return Whether you can delete this CIDR block.
     * 
     */
    public Boolean delete() {
        return this.delete;
    }
    /**
     * @return Whether you can edit this CIDR block.
     * 
     */
    public Boolean edit() {
        return this.edit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIamCidrBlocksCidrBlockActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean delete;
        private Boolean edit;
        public Builder() {}
        public Builder(GetIamCidrBlocksCidrBlockActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.edit = defaults.edit;
        }

        @CustomType.Setter
        public Builder delete(Boolean delete) {
            if (delete == null) {
              throw new MissingRequiredPropertyException("GetIamCidrBlocksCidrBlockActions", "delete");
            }
            this.delete = delete;
            return this;
        }
        @CustomType.Setter
        public Builder edit(Boolean edit) {
            if (edit == null) {
              throw new MissingRequiredPropertyException("GetIamCidrBlocksCidrBlockActions", "edit");
            }
            this.edit = edit;
            return this;
        }
        public GetIamCidrBlocksCidrBlockActions build() {
            final var _resultValue = new GetIamCidrBlocksCidrBlockActions();
            _resultValue.delete = delete;
            _resultValue.edit = edit;
            return _resultValue;
        }
    }
}
