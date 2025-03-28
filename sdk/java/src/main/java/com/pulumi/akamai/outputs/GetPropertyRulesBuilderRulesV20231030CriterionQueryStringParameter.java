// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20231030CriterionQueryStringParameter {
    /**
     * @return Matches when the `value` is URL-escaped.
     * 
     */
    private @Nullable Boolean escapeValue;
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    private @Nullable Boolean locked;
    /**
     * @return Specifies the match&#39;s minimum value.
     * 
     */
    private @Nullable Integer lowerBound;
    /**
     * @return Sets a case-sensitive match for the `parameterName` field.
     * 
     */
    private @Nullable Boolean matchCaseSensitiveName;
    /**
     * @return Sets a case-sensitive match for the `value` field.
     * 
     */
    private @Nullable Boolean matchCaseSensitiveValue;
    /**
     * @return Narrows the match criteria.
     * 
     */
    private @Nullable String matchOperator;
    /**
     * @return Allows wildcards in the `parameterName` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    private @Nullable Boolean matchWildcardName;
    /**
     * @return Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    private @Nullable Boolean matchWildcardValue;
    /**
     * @return The name of the query field, for example, `q` in `?q=string`.
     * 
     */
    private @Nullable String parameterName;
    /**
     * @return This option is for internal usage only.
     * 
     */
    private @Nullable String templateUuid;
    /**
     * @return When the `value` is numeric, this field specifies the match&#39;s maximum value.
     * 
     */
    private @Nullable Integer upperBound;
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    private @Nullable String uuid;
    /**
     * @return The value of the query field, for example, `string` in `?q=string`.
     * 
     */
    private @Nullable List<String> values;

    private GetPropertyRulesBuilderRulesV20231030CriterionQueryStringParameter() {}
    /**
     * @return Matches when the `value` is URL-escaped.
     * 
     */
    public Optional<Boolean> escapeValue() {
        return Optional.ofNullable(this.escapeValue);
    }
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    /**
     * @return Specifies the match&#39;s minimum value.
     * 
     */
    public Optional<Integer> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
    }
    /**
     * @return Sets a case-sensitive match for the `parameterName` field.
     * 
     */
    public Optional<Boolean> matchCaseSensitiveName() {
        return Optional.ofNullable(this.matchCaseSensitiveName);
    }
    /**
     * @return Sets a case-sensitive match for the `value` field.
     * 
     */
    public Optional<Boolean> matchCaseSensitiveValue() {
        return Optional.ofNullable(this.matchCaseSensitiveValue);
    }
    /**
     * @return Narrows the match criteria.
     * 
     */
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }
    /**
     * @return Allows wildcards in the `parameterName` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    public Optional<Boolean> matchWildcardName() {
        return Optional.ofNullable(this.matchWildcardName);
    }
    /**
     * @return Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    public Optional<Boolean> matchWildcardValue() {
        return Optional.ofNullable(this.matchWildcardValue);
    }
    /**
     * @return The name of the query field, for example, `q` in `?q=string`.
     * 
     */
    public Optional<String> parameterName() {
        return Optional.ofNullable(this.parameterName);
    }
    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    /**
     * @return When the `value` is numeric, this field specifies the match&#39;s maximum value.
     * 
     */
    public Optional<Integer> upperBound() {
        return Optional.ofNullable(this.upperBound);
    }
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    /**
     * @return The value of the query field, for example, `string` in `?q=string`.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20231030CriterionQueryStringParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean escapeValue;
        private @Nullable Boolean locked;
        private @Nullable Integer lowerBound;
        private @Nullable Boolean matchCaseSensitiveName;
        private @Nullable Boolean matchCaseSensitiveValue;
        private @Nullable String matchOperator;
        private @Nullable Boolean matchWildcardName;
        private @Nullable Boolean matchWildcardValue;
        private @Nullable String parameterName;
        private @Nullable String templateUuid;
        private @Nullable Integer upperBound;
        private @Nullable String uuid;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20231030CriterionQueryStringParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.escapeValue = defaults.escapeValue;
    	      this.locked = defaults.locked;
    	      this.lowerBound = defaults.lowerBound;
    	      this.matchCaseSensitiveName = defaults.matchCaseSensitiveName;
    	      this.matchCaseSensitiveValue = defaults.matchCaseSensitiveValue;
    	      this.matchOperator = defaults.matchOperator;
    	      this.matchWildcardName = defaults.matchWildcardName;
    	      this.matchWildcardValue = defaults.matchWildcardValue;
    	      this.parameterName = defaults.parameterName;
    	      this.templateUuid = defaults.templateUuid;
    	      this.upperBound = defaults.upperBound;
    	      this.uuid = defaults.uuid;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder escapeValue(@Nullable Boolean escapeValue) {

            this.escapeValue = escapeValue;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder lowerBound(@Nullable Integer lowerBound) {

            this.lowerBound = lowerBound;
            return this;
        }
        @CustomType.Setter
        public Builder matchCaseSensitiveName(@Nullable Boolean matchCaseSensitiveName) {

            this.matchCaseSensitiveName = matchCaseSensitiveName;
            return this;
        }
        @CustomType.Setter
        public Builder matchCaseSensitiveValue(@Nullable Boolean matchCaseSensitiveValue) {

            this.matchCaseSensitiveValue = matchCaseSensitiveValue;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {

            this.matchOperator = matchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder matchWildcardName(@Nullable Boolean matchWildcardName) {

            this.matchWildcardName = matchWildcardName;
            return this;
        }
        @CustomType.Setter
        public Builder matchWildcardValue(@Nullable Boolean matchWildcardValue) {

            this.matchWildcardValue = matchWildcardValue;
            return this;
        }
        @CustomType.Setter
        public Builder parameterName(@Nullable String parameterName) {

            this.parameterName = parameterName;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder upperBound(@Nullable Integer upperBound) {

            this.upperBound = upperBound;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {

            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetPropertyRulesBuilderRulesV20231030CriterionQueryStringParameter build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20231030CriterionQueryStringParameter();
            _resultValue.escapeValue = escapeValue;
            _resultValue.locked = locked;
            _resultValue.lowerBound = lowerBound;
            _resultValue.matchCaseSensitiveName = matchCaseSensitiveName;
            _resultValue.matchCaseSensitiveValue = matchCaseSensitiveValue;
            _resultValue.matchOperator = matchOperator;
            _resultValue.matchWildcardName = matchWildcardName;
            _resultValue.matchWildcardValue = matchWildcardValue;
            _resultValue.parameterName = parameterName;
            _resultValue.templateUuid = templateUuid;
            _resultValue.upperBound = upperBound;
            _resultValue.uuid = uuid;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
