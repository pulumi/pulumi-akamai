// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamIpAllowlistState extends com.pulumi.resources.ResourceArgs {

    public static final IamIpAllowlistState Empty = new IamIpAllowlistState();

    /**
     * Whether to enable or disable the allowlist.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Whether to enable or disable the allowlist.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private IamIpAllowlistState() {}

    private IamIpAllowlistState(IamIpAllowlistState $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamIpAllowlistState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamIpAllowlistState $;

        public Builder() {
            $ = new IamIpAllowlistState();
        }

        public Builder(IamIpAllowlistState defaults) {
            $ = new IamIpAllowlistState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Whether to enable or disable the allowlist.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Whether to enable or disable the allowlist.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public IamIpAllowlistState build() {
            return $;
        }
    }

}
