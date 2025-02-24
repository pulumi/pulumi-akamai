// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesTemplateVariable extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesTemplateVariable Empty = new GetPropertyRulesTemplateVariable();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetPropertyRulesTemplateVariable() {}

    private GetPropertyRulesTemplateVariable(GetPropertyRulesTemplateVariable $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesTemplateVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesTemplateVariable $;

        public Builder() {
            $ = new GetPropertyRulesTemplateVariable();
        }

        public Builder(GetPropertyRulesTemplateVariable defaults) {
            $ = new GetPropertyRulesTemplateVariable(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetPropertyRulesTemplateVariable build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesTemplateVariable", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesTemplateVariable", "value");
            }
            return $;
        }
    }

}
