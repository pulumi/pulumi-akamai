// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationTrim {
    /**
     * @return The fuzz tolerance of the trim, a value between `0` and `1` that determines the acceptable amount of background variation before trimming stops.
     * 
     */
    private @Nullable String fuzz;
    /**
     * @return The fuzz tolerance of the trim, a value between `0` and `1` that determines the acceptable amount of background variation before trimming stops.
     * 
     */
    private @Nullable String fuzzVar;
    /**
     * @return The amount of padding in pixels to add to the trimmed image.
     * 
     */
    private @Nullable String padding;
    /**
     * @return The amount of padding in pixels to add to the trimmed image.
     * 
     */
    private @Nullable String paddingVar;

    private GetImagingPolicyImagePolicyTransformationTrim() {}
    /**
     * @return The fuzz tolerance of the trim, a value between `0` and `1` that determines the acceptable amount of background variation before trimming stops.
     * 
     */
    public Optional<String> fuzz() {
        return Optional.ofNullable(this.fuzz);
    }
    /**
     * @return The fuzz tolerance of the trim, a value between `0` and `1` that determines the acceptable amount of background variation before trimming stops.
     * 
     */
    public Optional<String> fuzzVar() {
        return Optional.ofNullable(this.fuzzVar);
    }
    /**
     * @return The amount of padding in pixels to add to the trimmed image.
     * 
     */
    public Optional<String> padding() {
        return Optional.ofNullable(this.padding);
    }
    /**
     * @return The amount of padding in pixels to add to the trimmed image.
     * 
     */
    public Optional<String> paddingVar() {
        return Optional.ofNullable(this.paddingVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationTrim defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fuzz;
        private @Nullable String fuzzVar;
        private @Nullable String padding;
        private @Nullable String paddingVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationTrim defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fuzz = defaults.fuzz;
    	      this.fuzzVar = defaults.fuzzVar;
    	      this.padding = defaults.padding;
    	      this.paddingVar = defaults.paddingVar;
        }

        @CustomType.Setter
        public Builder fuzz(@Nullable String fuzz) {

            this.fuzz = fuzz;
            return this;
        }
        @CustomType.Setter
        public Builder fuzzVar(@Nullable String fuzzVar) {

            this.fuzzVar = fuzzVar;
            return this;
        }
        @CustomType.Setter
        public Builder padding(@Nullable String padding) {

            this.padding = padding;
            return this;
        }
        @CustomType.Setter
        public Builder paddingVar(@Nullable String paddingVar) {

            this.paddingVar = paddingVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationTrim build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationTrim();
            _resultValue.fuzz = fuzz;
            _resultValue.fuzzVar = fuzzVar;
            _resultValue.padding = padding;
            _resultValue.paddingVar = paddingVar;
            return _resultValue;
        }
    }
}
