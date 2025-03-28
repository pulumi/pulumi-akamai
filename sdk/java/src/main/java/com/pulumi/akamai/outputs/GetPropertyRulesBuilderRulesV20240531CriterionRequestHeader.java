// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20240531CriterionRequestHeader {
    /**
     * @return The name of the request header, for example `Accept-Language`.
     * 
     */
    private @Nullable String headerName;
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    private @Nullable Boolean locked;
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
     * @return Allows wildcards in the `headerName` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    private @Nullable Boolean matchWildcardName;
    /**
     * @return Allows wildcards in the `value` field, where `?` matches a single character and `*` matches zero or more characters.
     * 
     */
    private @Nullable Boolean matchWildcardValue;
    /**
     * @return This option is for internal usage only.
     * 
     */
    private @Nullable String templateUuid;
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    private @Nullable String uuid;
    /**
     * @return The request header&#39;s value, for example `en-US` when the header `headerName` is `Accept-Language`.
     * 
     */
    private @Nullable List<String> values;

    private GetPropertyRulesBuilderRulesV20240531CriterionRequestHeader() {}
    /**
     * @return The name of the request header, for example `Accept-Language`.
     * 
     */
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
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
     * @return Allows wildcards in the `headerName` field, where `?` matches a single character and `*` matches zero or more characters.
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
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    /**
     * @return The request header&#39;s value, for example `en-US` when the header `headerName` is `Accept-Language`.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20240531CriterionRequestHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String headerName;
        private @Nullable Boolean locked;
        private @Nullable Boolean matchCaseSensitiveValue;
        private @Nullable String matchOperator;
        private @Nullable Boolean matchWildcardName;
        private @Nullable Boolean matchWildcardValue;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20240531CriterionRequestHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.locked = defaults.locked;
    	      this.matchCaseSensitiveValue = defaults.matchCaseSensitiveValue;
    	      this.matchOperator = defaults.matchOperator;
    	      this.matchWildcardName = defaults.matchWildcardName;
    	      this.matchWildcardValue = defaults.matchWildcardValue;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder headerName(@Nullable String headerName) {

            this.headerName = headerName;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
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
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
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
        public GetPropertyRulesBuilderRulesV20240531CriterionRequestHeader build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20240531CriterionRequestHeader();
            _resultValue.headerName = headerName;
            _resultValue.locked = locked;
            _resultValue.matchCaseSensitiveValue = matchCaseSensitiveValue;
            _resultValue.matchOperator = matchOperator;
            _resultValue.matchWildcardName = matchWildcardName;
            _resultValue.matchWildcardValue = matchWildcardValue;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
