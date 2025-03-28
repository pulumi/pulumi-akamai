// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230920CriterionFilename extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230920CriterionFilename Empty = new GetPropertyRulesBuilderRulesV20230920CriterionFilename();

    /**
     * Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    @Import(name="locked")
    private @Nullable Boolean locked;

    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * Sets a case-sensitive match for the `values` field.
     * 
     */
    @Import(name="matchCaseSensitive")
    private @Nullable Boolean matchCaseSensitive;

    /**
     * @return Sets a case-sensitive match for the `values` field.
     * 
     */
    public Optional<Boolean> matchCaseSensitive() {
        return Optional.ofNullable(this.matchCaseSensitive);
    }

    /**
     * If set to `IS_ONE_OF` or `IS_NOT_ONE_OF`, matches whether the filename matches one of the `values`. If set to `IS_EMPTY` or `IS_NOT_EMPTY`, matches whether the specified filename is part of the path.
     * 
     */
    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    /**
     * @return If set to `IS_ONE_OF` or `IS_NOT_ONE_OF`, matches whether the filename matches one of the `values`. If set to `IS_EMPTY` or `IS_NOT_EMPTY`, matches whether the specified filename is part of the path.
     * 
     */
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    /**
     * This option is for internal usage only.
     * 
     */
    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    /**
     * A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    @Import(name="uuid")
    private @Nullable String uuid;

    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * Matches the filename component of the request URL. Allows wildcards, where `?` matches a single character and `*` matches zero or more characters. For example, specify `filename.*` to accept any extension.
     * 
     */
    @Import(name="values")
    private @Nullable List<String> values;

    /**
     * @return Matches the filename component of the request URL. Allows wildcards, where `?` matches a single character and `*` matches zero or more characters. For example, specify `filename.*` to accept any extension.
     * 
     */
    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetPropertyRulesBuilderRulesV20230920CriterionFilename() {}

    private GetPropertyRulesBuilderRulesV20230920CriterionFilename(GetPropertyRulesBuilderRulesV20230920CriterionFilename $) {
        this.locked = $.locked;
        this.matchCaseSensitive = $.matchCaseSensitive;
        this.matchOperator = $.matchOperator;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230920CriterionFilename defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230920CriterionFilename $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230920CriterionFilename();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230920CriterionFilename defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230920CriterionFilename(Objects.requireNonNull(defaults));
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param matchCaseSensitive Sets a case-sensitive match for the `values` field.
         * 
         * @return builder
         * 
         */
        public Builder matchCaseSensitive(@Nullable Boolean matchCaseSensitive) {
            $.matchCaseSensitive = matchCaseSensitive;
            return this;
        }

        /**
         * @param matchOperator If set to `IS_ONE_OF` or `IS_NOT_ONE_OF`, matches whether the filename matches one of the `values`. If set to `IS_EMPTY` or `IS_NOT_EMPTY`, matches whether the specified filename is part of the path.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param values Matches the filename component of the request URL. Allows wildcards, where `?` matches a single character and `*` matches zero or more characters. For example, specify `filename.*` to accept any extension.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Matches the filename component of the request URL. Allows wildcards, where `?` matches a single character and `*` matches zero or more characters. For example, specify `filename.*` to accept any extension.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetPropertyRulesBuilderRulesV20230920CriterionFilename build() {
            return $;
        }
    }

}
