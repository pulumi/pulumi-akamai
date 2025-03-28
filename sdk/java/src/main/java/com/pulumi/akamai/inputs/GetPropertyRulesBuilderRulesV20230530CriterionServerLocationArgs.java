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


public final class GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs Empty = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs();

    /**
     * Continent codes.
     * 
     */
    @Import(name="continents")
    private @Nullable Output<List<String>> continents;

    /**
     * @return Continent codes.
     * 
     */
    public Optional<Output<List<String>>> continents() {
        return Optional.ofNullable(this.continents);
    }

    /**
     * ISO 3166-1 country codes, such as `US` or `CN`.
     * 
     */
    @Import(name="countries")
    private @Nullable Output<List<String>> countries;

    /**
     * @return ISO 3166-1 country codes, such as `US` or `CN`.
     * 
     */
    public Optional<Output<List<String>>> countries() {
        return Optional.ofNullable(this.countries);
    }

    /**
     * Indicates the geographic scope.
     * 
     */
    @Import(name="locationType")
    private @Nullable Output<String> locationType;

    /**
     * @return Indicates the geographic scope.
     * 
     */
    public Optional<Output<String>> locationType() {
        return Optional.ofNullable(this.locationType);
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
     * Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
     * 
     */
    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    /**
     * @return Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
     * 
     */
    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    /**
     * ISO 3166 country and region codes, for example `US:MA` for Massachusetts or `JP:13` for Tokyo.
     * 
     */
    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    /**
     * @return ISO 3166 country and region codes, for example `US:MA` for Massachusetts or `JP:13` for Tokyo.
     * 
     */
    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
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

    private GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs(GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs $) {
        this.continents = $.continents;
        this.countries = $.countries;
        this.locationType = $.locationType;
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.regions = $.regions;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param continents Continent codes.
         * 
         * @return builder
         * 
         */
        public Builder continents(@Nullable Output<List<String>> continents) {
            $.continents = continents;
            return this;
        }

        /**
         * @param continents Continent codes.
         * 
         * @return builder
         * 
         */
        public Builder continents(List<String> continents) {
            return continents(Output.of(continents));
        }

        /**
         * @param continents Continent codes.
         * 
         * @return builder
         * 
         */
        public Builder continents(String... continents) {
            return continents(List.of(continents));
        }

        /**
         * @param countries ISO 3166-1 country codes, such as `US` or `CN`.
         * 
         * @return builder
         * 
         */
        public Builder countries(@Nullable Output<List<String>> countries) {
            $.countries = countries;
            return this;
        }

        /**
         * @param countries ISO 3166-1 country codes, such as `US` or `CN`.
         * 
         * @return builder
         * 
         */
        public Builder countries(List<String> countries) {
            return countries(Output.of(countries));
        }

        /**
         * @param countries ISO 3166-1 country codes, such as `US` or `CN`.
         * 
         * @return builder
         * 
         */
        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }

        /**
         * @param locationType Indicates the geographic scope.
         * 
         * @return builder
         * 
         */
        public Builder locationType(@Nullable Output<String> locationType) {
            $.locationType = locationType;
            return this;
        }

        /**
         * @param locationType Indicates the geographic scope.
         * 
         * @return builder
         * 
         */
        public Builder locationType(String locationType) {
            return locationType(Output.of(locationType));
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
         * @param matchOperator Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        /**
         * @param matchOperator Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
        }

        /**
         * @param regions ISO 3166 country and region codes, for example `US:MA` for Massachusetts or `JP:13` for Tokyo.
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions ISO 3166 country and region codes, for example `US:MA` for Massachusetts or `JP:13` for Tokyo.
         * 
         * @return builder
         * 
         */
        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        /**
         * @param regions ISO 3166 country and region codes, for example `US:MA` for Massachusetts or `JP:13` for Tokyo.
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
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

        public GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs build() {
            return $;
        }
    }

}
