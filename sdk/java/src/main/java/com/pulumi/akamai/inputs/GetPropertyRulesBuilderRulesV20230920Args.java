// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230920BehaviorArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230920CriterionArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230920CustomOverrideArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230920VariableArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230920Args extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230920Args Empty = new GetPropertyRulesBuilderRulesV20230920Args();

    /**
     * XML metadata of the rule
     * 
     */
    @Import(name="advancedOverride")
    private @Nullable Output<String> advancedOverride;

    /**
     * @return XML metadata of the rule
     * 
     */
    public Optional<Output<String>> advancedOverride() {
        return Optional.ofNullable(this.advancedOverride);
    }

    /**
     * The list of behaviors for a rule
     * 
     */
    @Import(name="behaviors")
    private @Nullable Output<List<GetPropertyRulesBuilderRulesV20230920BehaviorArgs>> behaviors;

    /**
     * @return The list of behaviors for a rule
     * 
     */
    public Optional<Output<List<GetPropertyRulesBuilderRulesV20230920BehaviorArgs>>> behaviors() {
        return Optional.ofNullable(this.behaviors);
    }

    /**
     * A list of child rules for a particular rule in JSON format
     * 
     */
    @Import(name="childrens")
    private @Nullable Output<List<String>> childrens;

    /**
     * @return A list of child rules for a particular rule in JSON format
     * 
     */
    public Optional<Output<List<String>>> childrens() {
        return Optional.ofNullable(this.childrens);
    }

    /**
     * The comments for a rule
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return The comments for a rule
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * States whether changes to &#39;criterion&#39; objects are prohibited
     * 
     */
    @Import(name="criteriaLocked")
    private @Nullable Output<Boolean> criteriaLocked;

    /**
     * @return States whether changes to &#39;criterion&#39; objects are prohibited
     * 
     */
    public Optional<Output<Boolean>> criteriaLocked() {
        return Optional.ofNullable(this.criteriaLocked);
    }

    /**
     * States whether &#39;all&#39; criteria need to match or &#39;any&#39;
     * 
     */
    @Import(name="criteriaMustSatisfy")
    private @Nullable Output<String> criteriaMustSatisfy;

    /**
     * @return States whether &#39;all&#39; criteria need to match or &#39;any&#39;
     * 
     */
    public Optional<Output<String>> criteriaMustSatisfy() {
        return Optional.ofNullable(this.criteriaMustSatisfy);
    }

    /**
     * The list of criteria for a rule
     * 
     */
    @Import(name="criterions")
    private @Nullable Output<List<GetPropertyRulesBuilderRulesV20230920CriterionArgs>> criterions;

    /**
     * @return The list of criteria for a rule
     * 
     */
    public Optional<Output<List<GetPropertyRulesBuilderRulesV20230920CriterionArgs>>> criterions() {
        return Optional.ofNullable(this.criterions);
    }

    /**
     * XML metadata of the rule
     * 
     */
    @Import(name="customOverride")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230920CustomOverrideArgs> customOverride;

    /**
     * @return XML metadata of the rule
     * 
     */
    public Optional<Output<GetPropertyRulesBuilderRulesV20230920CustomOverrideArgs>> customOverride() {
        return Optional.ofNullable(this.customOverride);
    }

    /**
     * States whether a rule is secure
     * 
     */
    @Import(name="isSecure")
    private @Nullable Output<Boolean> isSecure;

    /**
     * @return States whether a rule is secure
     * 
     */
    public Optional<Output<Boolean>> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }

    /**
     * The name of a rule
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of a rule
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The template link for the rule
     * 
     */
    @Import(name="templateLink")
    private @Nullable Output<String> templateLink;

    /**
     * @return The template link for the rule
     * 
     */
    public Optional<Output<String>> templateLink() {
        return Optional.ofNullable(this.templateLink);
    }

    /**
     * The UUID of a rule template
     * 
     */
    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    /**
     * @return The UUID of a rule template
     * 
     */
    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    /**
     * The UUID of the rule
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return The UUID of the rule
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * A list of variables for a rule
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<GetPropertyRulesBuilderRulesV20230920VariableArgs>> variables;

    /**
     * @return A list of variables for a rule
     * 
     */
    public Optional<Output<List<GetPropertyRulesBuilderRulesV20230920VariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetPropertyRulesBuilderRulesV20230920Args() {}

    private GetPropertyRulesBuilderRulesV20230920Args(GetPropertyRulesBuilderRulesV20230920Args $) {
        this.advancedOverride = $.advancedOverride;
        this.behaviors = $.behaviors;
        this.childrens = $.childrens;
        this.comments = $.comments;
        this.criteriaLocked = $.criteriaLocked;
        this.criteriaMustSatisfy = $.criteriaMustSatisfy;
        this.criterions = $.criterions;
        this.customOverride = $.customOverride;
        this.isSecure = $.isSecure;
        this.name = $.name;
        this.templateLink = $.templateLink;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230920Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230920Args $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230920Args();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230920Args defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230920Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedOverride XML metadata of the rule
         * 
         * @return builder
         * 
         */
        public Builder advancedOverride(@Nullable Output<String> advancedOverride) {
            $.advancedOverride = advancedOverride;
            return this;
        }

        /**
         * @param advancedOverride XML metadata of the rule
         * 
         * @return builder
         * 
         */
        public Builder advancedOverride(String advancedOverride) {
            return advancedOverride(Output.of(advancedOverride));
        }

        /**
         * @param behaviors The list of behaviors for a rule
         * 
         * @return builder
         * 
         */
        public Builder behaviors(@Nullable Output<List<GetPropertyRulesBuilderRulesV20230920BehaviorArgs>> behaviors) {
            $.behaviors = behaviors;
            return this;
        }

        /**
         * @param behaviors The list of behaviors for a rule
         * 
         * @return builder
         * 
         */
        public Builder behaviors(List<GetPropertyRulesBuilderRulesV20230920BehaviorArgs> behaviors) {
            return behaviors(Output.of(behaviors));
        }

        /**
         * @param behaviors The list of behaviors for a rule
         * 
         * @return builder
         * 
         */
        public Builder behaviors(GetPropertyRulesBuilderRulesV20230920BehaviorArgs... behaviors) {
            return behaviors(List.of(behaviors));
        }

        /**
         * @param childrens A list of child rules for a particular rule in JSON format
         * 
         * @return builder
         * 
         */
        public Builder childrens(@Nullable Output<List<String>> childrens) {
            $.childrens = childrens;
            return this;
        }

        /**
         * @param childrens A list of child rules for a particular rule in JSON format
         * 
         * @return builder
         * 
         */
        public Builder childrens(List<String> childrens) {
            return childrens(Output.of(childrens));
        }

        /**
         * @param childrens A list of child rules for a particular rule in JSON format
         * 
         * @return builder
         * 
         */
        public Builder childrens(String... childrens) {
            return childrens(List.of(childrens));
        }

        /**
         * @param comments The comments for a rule
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments The comments for a rule
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param criteriaLocked States whether changes to &#39;criterion&#39; objects are prohibited
         * 
         * @return builder
         * 
         */
        public Builder criteriaLocked(@Nullable Output<Boolean> criteriaLocked) {
            $.criteriaLocked = criteriaLocked;
            return this;
        }

        /**
         * @param criteriaLocked States whether changes to &#39;criterion&#39; objects are prohibited
         * 
         * @return builder
         * 
         */
        public Builder criteriaLocked(Boolean criteriaLocked) {
            return criteriaLocked(Output.of(criteriaLocked));
        }

        /**
         * @param criteriaMustSatisfy States whether &#39;all&#39; criteria need to match or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder criteriaMustSatisfy(@Nullable Output<String> criteriaMustSatisfy) {
            $.criteriaMustSatisfy = criteriaMustSatisfy;
            return this;
        }

        /**
         * @param criteriaMustSatisfy States whether &#39;all&#39; criteria need to match or &#39;any&#39;
         * 
         * @return builder
         * 
         */
        public Builder criteriaMustSatisfy(String criteriaMustSatisfy) {
            return criteriaMustSatisfy(Output.of(criteriaMustSatisfy));
        }

        /**
         * @param criterions The list of criteria for a rule
         * 
         * @return builder
         * 
         */
        public Builder criterions(@Nullable Output<List<GetPropertyRulesBuilderRulesV20230920CriterionArgs>> criterions) {
            $.criterions = criterions;
            return this;
        }

        /**
         * @param criterions The list of criteria for a rule
         * 
         * @return builder
         * 
         */
        public Builder criterions(List<GetPropertyRulesBuilderRulesV20230920CriterionArgs> criterions) {
            return criterions(Output.of(criterions));
        }

        /**
         * @param criterions The list of criteria for a rule
         * 
         * @return builder
         * 
         */
        public Builder criterions(GetPropertyRulesBuilderRulesV20230920CriterionArgs... criterions) {
            return criterions(List.of(criterions));
        }

        /**
         * @param customOverride XML metadata of the rule
         * 
         * @return builder
         * 
         */
        public Builder customOverride(@Nullable Output<GetPropertyRulesBuilderRulesV20230920CustomOverrideArgs> customOverride) {
            $.customOverride = customOverride;
            return this;
        }

        /**
         * @param customOverride XML metadata of the rule
         * 
         * @return builder
         * 
         */
        public Builder customOverride(GetPropertyRulesBuilderRulesV20230920CustomOverrideArgs customOverride) {
            return customOverride(Output.of(customOverride));
        }

        /**
         * @param isSecure States whether a rule is secure
         * 
         * @return builder
         * 
         */
        public Builder isSecure(@Nullable Output<Boolean> isSecure) {
            $.isSecure = isSecure;
            return this;
        }

        /**
         * @param isSecure States whether a rule is secure
         * 
         * @return builder
         * 
         */
        public Builder isSecure(Boolean isSecure) {
            return isSecure(Output.of(isSecure));
        }

        /**
         * @param name The name of a rule
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of a rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param templateLink The template link for the rule
         * 
         * @return builder
         * 
         */
        public Builder templateLink(@Nullable Output<String> templateLink) {
            $.templateLink = templateLink;
            return this;
        }

        /**
         * @param templateLink The template link for the rule
         * 
         * @return builder
         * 
         */
        public Builder templateLink(String templateLink) {
            return templateLink(Output.of(templateLink));
        }

        /**
         * @param templateUuid The UUID of a rule template
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        /**
         * @param templateUuid The UUID of a rule template
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        /**
         * @param uuid The UUID of the rule
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid The UUID of the rule
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        /**
         * @param variables A list of variables for a rule
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<List<GetPropertyRulesBuilderRulesV20230920VariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables A list of variables for a rule
         * 
         * @return builder
         * 
         */
        public Builder variables(List<GetPropertyRulesBuilderRulesV20230920VariableArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables A list of variables for a rule
         * 
         * @return builder
         * 
         */
        public Builder variables(GetPropertyRulesBuilderRulesV20230920VariableArgs... variables) {
            return variables(List.of(variables));
        }

        public GetPropertyRulesBuilderRulesV20230920Args build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230920Args", "name");
            }
            return $;
        }
    }

}
