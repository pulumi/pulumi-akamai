// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IamApiClientCredentialActions {
    /**
     * @return Whether you can activate the credential.
     * 
     */
    private @Nullable Boolean activate;
    /**
     * @return Whether you can deactivate the credential.
     * 
     */
    private @Nullable Boolean deactivate;
    /**
     * @return Whether you can remove the credential.
     * 
     */
    private @Nullable Boolean delete;
    /**
     * @return Whether you can modify the credential&#39;s description.
     * 
     */
    private @Nullable Boolean editDescription;
    /**
     * @return Whether you can modify the credential&#39;s expiration date.
     * 
     */
    private @Nullable Boolean editExpiration;

    private IamApiClientCredentialActions() {}
    /**
     * @return Whether you can activate the credential.
     * 
     */
    public Optional<Boolean> activate() {
        return Optional.ofNullable(this.activate);
    }
    /**
     * @return Whether you can deactivate the credential.
     * 
     */
    public Optional<Boolean> deactivate() {
        return Optional.ofNullable(this.deactivate);
    }
    /**
     * @return Whether you can remove the credential.
     * 
     */
    public Optional<Boolean> delete() {
        return Optional.ofNullable(this.delete);
    }
    /**
     * @return Whether you can modify the credential&#39;s description.
     * 
     */
    public Optional<Boolean> editDescription() {
        return Optional.ofNullable(this.editDescription);
    }
    /**
     * @return Whether you can modify the credential&#39;s expiration date.
     * 
     */
    public Optional<Boolean> editExpiration() {
        return Optional.ofNullable(this.editExpiration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamApiClientCredentialActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean activate;
        private @Nullable Boolean deactivate;
        private @Nullable Boolean delete;
        private @Nullable Boolean editDescription;
        private @Nullable Boolean editExpiration;
        public Builder() {}
        public Builder(IamApiClientCredentialActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activate = defaults.activate;
    	      this.deactivate = defaults.deactivate;
    	      this.delete = defaults.delete;
    	      this.editDescription = defaults.editDescription;
    	      this.editExpiration = defaults.editExpiration;
        }

        @CustomType.Setter
        public Builder activate(@Nullable Boolean activate) {

            this.activate = activate;
            return this;
        }
        @CustomType.Setter
        public Builder deactivate(@Nullable Boolean deactivate) {

            this.deactivate = deactivate;
            return this;
        }
        @CustomType.Setter
        public Builder delete(@Nullable Boolean delete) {

            this.delete = delete;
            return this;
        }
        @CustomType.Setter
        public Builder editDescription(@Nullable Boolean editDescription) {

            this.editDescription = editDescription;
            return this;
        }
        @CustomType.Setter
        public Builder editExpiration(@Nullable Boolean editExpiration) {

            this.editExpiration = editExpiration;
            return this;
        }
        public IamApiClientCredentialActions build() {
            final var _resultValue = new IamApiClientCredentialActions();
            _resultValue.activate = activate;
            _resultValue.deactivate = deactivate;
            _resultValue.delete = delete;
            _resultValue.editDescription = editDescription;
            _resultValue.editExpiration = editExpiration;
            return _resultValue;
        }
    }
}
