// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyVideoPolicyVariableEnumOption;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyVideoPolicyVariable extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyVideoPolicyVariable Empty = new GetImagingPolicyVideoPolicyVariable();

    /**
     * The default value of the variable if no query parameter is provided. It needs to be one of the `enumOptions` if any are provided.
     * 
     */
    @Import(name="defaultValue", required=true)
    private String defaultValue;

    /**
     * @return The default value of the variable if no query parameter is provided. It needs to be one of the `enumOptions` if any are provided.
     * 
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    @Import(name="enumOptions")
    private @Nullable List<GetImagingPolicyVideoPolicyVariableEnumOption> enumOptions;

    public Optional<List<GetImagingPolicyVideoPolicyVariableEnumOption>> enumOptions() {
        return Optional.ofNullable(this.enumOptions);
    }

    /**
     * The name of the variable, also available as the query parameter name to set the variable&#39;s value dynamically. Use up to 50 alphanumeric characters.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the variable, also available as the query parameter name to set the variable&#39;s value dynamically. Use up to 50 alphanumeric characters.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A postfix added to the value provided for the variable, or to the default value.
     * 
     */
    @Import(name="postfix")
    private @Nullable String postfix;

    /**
     * @return A postfix added to the value provided for the variable, or to the default value.
     * 
     */
    public Optional<String> postfix() {
        return Optional.ofNullable(this.postfix);
    }

    /**
     * A prefix added to the value provided for the variable, or to the default value.
     * 
     */
    @Import(name="prefix")
    private @Nullable String prefix;

    /**
     * @return A prefix added to the value provided for the variable, or to the default value.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The type of value for the variable.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of value for the variable.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetImagingPolicyVideoPolicyVariable() {}

    private GetImagingPolicyVideoPolicyVariable(GetImagingPolicyVideoPolicyVariable $) {
        this.defaultValue = $.defaultValue;
        this.enumOptions = $.enumOptions;
        this.name = $.name;
        this.postfix = $.postfix;
        this.prefix = $.prefix;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyVideoPolicyVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyVideoPolicyVariable $;

        public Builder() {
            $ = new GetImagingPolicyVideoPolicyVariable();
        }

        public Builder(GetImagingPolicyVideoPolicyVariable defaults) {
            $ = new GetImagingPolicyVideoPolicyVariable(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue The default value of the variable if no query parameter is provided. It needs to be one of the `enumOptions` if any are provided.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder enumOptions(@Nullable List<GetImagingPolicyVideoPolicyVariableEnumOption> enumOptions) {
            $.enumOptions = enumOptions;
            return this;
        }

        public Builder enumOptions(GetImagingPolicyVideoPolicyVariableEnumOption... enumOptions) {
            return enumOptions(List.of(enumOptions));
        }

        /**
         * @param name The name of the variable, also available as the query parameter name to set the variable&#39;s value dynamically. Use up to 50 alphanumeric characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param postfix A postfix added to the value provided for the variable, or to the default value.
         * 
         * @return builder
         * 
         */
        public Builder postfix(@Nullable String postfix) {
            $.postfix = postfix;
            return this;
        }

        /**
         * @param prefix A prefix added to the value provided for the variable, or to the default value.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable String prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param type The type of value for the variable.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetImagingPolicyVideoPolicyVariable build() {
            if ($.defaultValue == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariable", "defaultValue");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariable", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariable", "type");
            }
            return $;
        }
    }

}
