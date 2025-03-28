// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs Empty = new GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs();

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
     * Sets a case-sensitive match.
     * 
     */
    @Import(name="matchCaseSensitive")
    private @Nullable Output<Boolean> matchCaseSensitive;

    /**
     * @return Sets a case-sensitive match.
     * 
     */
    public Optional<Output<Boolean>> matchCaseSensitive() {
        return Optional.ofNullable(this.matchCaseSensitive);
    }

    /**
     * Matches the contents of `values` if set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
     * 
     */
    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    /**
     * @return Matches the contents of `values` if set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
     * 
     */
    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
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
     * An array of file extension strings, with no leading dot characters, for example `png`, `jpg`, `jpeg`, and `gif`.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return An array of file extension strings, with no leading dot characters, for example `png`, `jpg`, `jpeg`, and `gif`.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs() {}

    private GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs(GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs $) {
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
    public static Builder builder(GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs(Objects.requireNonNull(defaults));
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
         * @param matchCaseSensitive Sets a case-sensitive match.
         * 
         * @return builder
         * 
         */
        public Builder matchCaseSensitive(@Nullable Output<Boolean> matchCaseSensitive) {
            $.matchCaseSensitive = matchCaseSensitive;
            return this;
        }

        /**
         * @param matchCaseSensitive Sets a case-sensitive match.
         * 
         * @return builder
         * 
         */
        public Builder matchCaseSensitive(Boolean matchCaseSensitive) {
            return matchCaseSensitive(Output.of(matchCaseSensitive));
        }

        /**
         * @param matchOperator Matches the contents of `values` if set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        /**
         * @param matchOperator Matches the contents of `values` if set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
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
         * @param values An array of file extension strings, with no leading dot characters, for example `png`, `jpg`, `jpeg`, and `gif`.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values An array of file extension strings, with no leading dot characters, for example `png`, `jpg`, `jpeg`, and `gif`.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values An array of file extension strings, with no leading dot characters, for example `png`, `jpg`, `jpeg`, and `gif`.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetPropertyRulesBuilderRulesV20230920CriterionFileExtensionArgs build() {
            return $;
        }
    }

}
