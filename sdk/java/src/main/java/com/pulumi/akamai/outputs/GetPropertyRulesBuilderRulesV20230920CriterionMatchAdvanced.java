// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvanced {
    /**
     * @return An XML string that closes the relevant block.
     * 
     */
    private @Nullable String closeXml;
    /**
     * @return A human-readable description of what the XML block does.
     * 
     */
    private @Nullable String description;
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    private @Nullable Boolean locked;
    /**
     * @return An XML string that opens the relevant block.
     * 
     */
    private @Nullable String openXml;
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

    private GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvanced() {}
    /**
     * @return An XML string that closes the relevant block.
     * 
     */
    public Optional<String> closeXml() {
        return Optional.ofNullable(this.closeXml);
    }
    /**
     * @return A human-readable description of what the XML block does.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    /**
     * @return An XML string that opens the relevant block.
     * 
     */
    public Optional<String> openXml() {
        return Optional.ofNullable(this.openXml);
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvanced defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String closeXml;
        private @Nullable String description;
        private @Nullable Boolean locked;
        private @Nullable String openXml;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvanced defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.closeXml = defaults.closeXml;
    	      this.description = defaults.description;
    	      this.locked = defaults.locked;
    	      this.openXml = defaults.openXml;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder closeXml(@Nullable String closeXml) {

            this.closeXml = closeXml;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder openXml(@Nullable String openXml) {

            this.openXml = openXml;
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
        public GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvanced build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230920CriterionMatchAdvanced();
            _resultValue.closeXml = closeXml;
            _resultValue.description = description;
            _resultValue.locked = locked;
            _resultValue.openXml = openXml;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
