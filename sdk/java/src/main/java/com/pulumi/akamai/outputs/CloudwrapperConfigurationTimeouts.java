// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudwrapperConfigurationTimeouts {
    /**
     * @return A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
     * 
     */
    private @Nullable String delete;

    private CloudwrapperConfigurationTimeouts() {}
    /**
     * @return A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
     * 
     */
    public Optional<String> delete() {
        return Optional.ofNullable(this.delete);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudwrapperConfigurationTimeouts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String delete;
        public Builder() {}
        public Builder(CloudwrapperConfigurationTimeouts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
        }

        @CustomType.Setter
        public Builder delete(@Nullable String delete) {

            this.delete = delete;
            return this;
        }
        public CloudwrapperConfigurationTimeouts build() {
            final var _resultValue = new CloudwrapperConfigurationTimeouts();
            _resultValue.delete = delete;
            return _resultValue;
        }
    }
}
