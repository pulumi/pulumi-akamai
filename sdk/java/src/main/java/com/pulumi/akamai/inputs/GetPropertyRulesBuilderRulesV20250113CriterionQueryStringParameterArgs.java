// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs Empty = new GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs();

    /**
     * Matches when the `value` is URL-escaped.
     * 
     */
    @Import(name="escapeValue")
    private @Nullable Output<Boolean> escapeValue;

    /**
     * @return Matches when the `value` is URL-escaped.
     * 
     */
    public Optional<Output<Boolean>> escapeValue() {
        return Optional.ofNullable(this.escapeValue);
    }

    /**
     * Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * Specifies the match&#39;s minimum value.
     * 
     */
    @Import(name="lowerBound")
    private @Nullable Output<Integer> lowerBound;

    /**
     * @return Specifies the match&#39;s minimum value.
     * 
     */
    public Optional<Output<Integer>> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
    }

    /**
     * Sets a case-sensitive match for the `parameterName` field.
     * 
     */
    @Import(name="matchCaseSensitiveName")
    private @Nullable Output<Boolean> matchCaseSensitiveName;

    /**
     * @return Sets a case-sensitive match for the `parameterName` field.
     * 
     */
    public Optional<Output<Boolean>> matchCaseSensitiveName() {
        return Optional.ofNullable(this.matchCaseSensitiveName);
    }

    /**
     * Sets a case-sensitive match for the `value` field.
     * 
     */
    @Import(name="matchCaseSensitiveValue")
    private @Nullable Output<Boolean> matchCaseSensitiveValue;

    /**
     * @return Sets a case-sensitive match for the `value` field.
     * 
     */
    public Optional<Output<Boolean>> matchCaseSensitiveValue() {
        return Optional.ofNullable(this.matchCaseSensitiveValue);
    }

    /**
     * Narrows the match criteria.
     * 
     */
    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    /**
     * @return Narrows the match criteria.
     * 
     */
    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    /**
     * Allows wildcards in the `parameterName` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    @Import(name="matchWildcardName")
    private @Nullable Output<Boolean> matchWildcardName;

    /**
     * @return Allows wildcards in the `parameterName` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    public Optional<Output<Boolean>> matchWildcardName() {
        return Optional.ofNullable(this.matchWildcardName);
    }

    /**
     * Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    @Import(name="matchWildcardValue")
    private @Nullable Output<Boolean> matchWildcardValue;

    /**
     * @return Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    public Optional<Output<Boolean>> matchWildcardValue() {
        return Optional.ofNullable(this.matchWildcardValue);
    }

    /**
     * The name of the query field, for example, `q` in `?q=string`.
     * 
     */
    @Import(name="parameterName")
    private @Nullable Output<String> parameterName;

    /**
     * @return The name of the query field, for example, `q` in `?q=string`.
     * 
     */
    public Optional<Output<String>> parameterName() {
        return Optional.ofNullable(this.parameterName);
    }

    /**
     * This option is for internal usage only.
     * 
     */
    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    /**
     * When the `value` is numeric, this field specifies the match&#39;s maximum value.
     * 
     */
    @Import(name="upperBound")
    private @Nullable Output<Integer> upperBound;

    /**
     * @return When the `value` is numeric, this field specifies the match&#39;s maximum value.
     * 
     */
    public Optional<Output<Integer>> upperBound() {
        return Optional.ofNullable(this.upperBound);
    }

    /**
     * A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * The value of the query field, for example, `string` in `?q=string`.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The value of the query field, for example, `string` in `?q=string`.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs() {}

    private GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs(GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs $) {
        this.escapeValue = $.escapeValue;
        this.locked = $.locked;
        this.lowerBound = $.lowerBound;
        this.matchCaseSensitiveName = $.matchCaseSensitiveName;
        this.matchCaseSensitiveValue = $.matchCaseSensitiveValue;
        this.matchOperator = $.matchOperator;
        this.matchWildcardName = $.matchWildcardName;
        this.matchWildcardValue = $.matchWildcardValue;
        this.parameterName = $.parameterName;
        this.templateUuid = $.templateUuid;
        this.upperBound = $.upperBound;
        this.uuid = $.uuid;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param escapeValue Matches when the `value` is URL-escaped.
         * 
         * @return builder
         * 
         */
        public Builder escapeValue(@Nullable Output<Boolean> escapeValue) {
            $.escapeValue = escapeValue;
            return this;
        }

        /**
         * @param escapeValue Matches when the `value` is URL-escaped.
         * 
         * @return builder
         * 
         */
        public Builder escapeValue(Boolean escapeValue) {
            return escapeValue(Output.of(escapeValue));
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        /**
         * @param lowerBound Specifies the match&#39;s minimum value.
         * 
         * @return builder
         * 
         */
        public Builder lowerBound(@Nullable Output<Integer> lowerBound) {
            $.lowerBound = lowerBound;
            return this;
        }

        /**
         * @param lowerBound Specifies the match&#39;s minimum value.
         * 
         * @return builder
         * 
         */
        public Builder lowerBound(Integer lowerBound) {
            return lowerBound(Output.of(lowerBound));
        }

        /**
         * @param matchCaseSensitiveName Sets a case-sensitive match for the `parameterName` field.
         * 
         * @return builder
         * 
         */
        public Builder matchCaseSensitiveName(@Nullable Output<Boolean> matchCaseSensitiveName) {
            $.matchCaseSensitiveName = matchCaseSensitiveName;
            return this;
        }

        /**
         * @param matchCaseSensitiveName Sets a case-sensitive match for the `parameterName` field.
         * 
         * @return builder
         * 
         */
        public Builder matchCaseSensitiveName(Boolean matchCaseSensitiveName) {
            return matchCaseSensitiveName(Output.of(matchCaseSensitiveName));
        }

        /**
         * @param matchCaseSensitiveValue Sets a case-sensitive match for the `value` field.
         * 
         * @return builder
         * 
         */
        public Builder matchCaseSensitiveValue(@Nullable Output<Boolean> matchCaseSensitiveValue) {
            $.matchCaseSensitiveValue = matchCaseSensitiveValue;
            return this;
        }

        /**
         * @param matchCaseSensitiveValue Sets a case-sensitive match for the `value` field.
         * 
         * @return builder
         * 
         */
        public Builder matchCaseSensitiveValue(Boolean matchCaseSensitiveValue) {
            return matchCaseSensitiveValue(Output.of(matchCaseSensitiveValue));
        }

        /**
         * @param matchOperator Narrows the match criteria.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        /**
         * @param matchOperator Narrows the match criteria.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
        }

        /**
         * @param matchWildcardName Allows wildcards in the `parameterName` field, where `?` matches a single character and `*` matches zero or more characters.
         * 
         * @return builder
         * 
         */
        public Builder matchWildcardName(@Nullable Output<Boolean> matchWildcardName) {
            $.matchWildcardName = matchWildcardName;
            return this;
        }

        /**
         * @param matchWildcardName Allows wildcards in the `parameterName` field, where `?` matches a single character and `*` matches zero or more characters.
         * 
         * @return builder
         * 
         */
        public Builder matchWildcardName(Boolean matchWildcardName) {
            return matchWildcardName(Output.of(matchWildcardName));
        }

        /**
         * @param matchWildcardValue Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
         * 
         * @return builder
         * 
         */
        public Builder matchWildcardValue(@Nullable Output<Boolean> matchWildcardValue) {
            $.matchWildcardValue = matchWildcardValue;
            return this;
        }

        /**
         * @param matchWildcardValue Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
         * 
         * @return builder
         * 
         */
        public Builder matchWildcardValue(Boolean matchWildcardValue) {
            return matchWildcardValue(Output.of(matchWildcardValue));
        }

        /**
         * @param parameterName The name of the query field, for example, `q` in `?q=string`.
         * 
         * @return builder
         * 
         */
        public Builder parameterName(@Nullable Output<String> parameterName) {
            $.parameterName = parameterName;
            return this;
        }

        /**
         * @param parameterName The name of the query field, for example, `q` in `?q=string`.
         * 
         * @return builder
         * 
         */
        public Builder parameterName(String parameterName) {
            return parameterName(Output.of(parameterName));
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        /**
         * @param upperBound When the `value` is numeric, this field specifies the match&#39;s maximum value.
         * 
         * @return builder
         * 
         */
        public Builder upperBound(@Nullable Output<Integer> upperBound) {
            $.upperBound = upperBound;
            return this;
        }

        /**
         * @param upperBound When the `value` is numeric, this field specifies the match&#39;s maximum value.
         * 
         * @return builder
         * 
         */
        public Builder upperBound(Integer upperBound) {
            return upperBound(Output.of(upperBound));
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        /**
         * @param values The value of the query field, for example, `string` in `?q=string`.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The value of the query field, for example, `string` in `?q=string`.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The value of the query field, for example, `string` in `?q=string`.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetPropertyRulesBuilderRulesV20250113CriterionQueryStringParameterArgs build() {
            return $;
        }
    }

}
