// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs Empty = new GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs();

    /**
     * The action to perform on the path.
     * 
     */
    @Import(name="behavior")
    private @Nullable Output<String> behavior;

    /**
     * @return The action to perform on the path.
     * 
     */
    public Optional<Output<String>> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    /**
     * When enabled, retains the original path&#39;s query parameters.
     * 
     */
    @Import(name="keepQueryString")
    private @Nullable Output<Boolean> keepQueryString;

    /**
     * @return When enabled, retains the original path&#39;s query parameters.
     * 
     */
    public Optional<Output<Boolean>> keepQueryString() {
        return Optional.ofNullable(this.keepQueryString);
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
     * When `behavior` is `REMOVE` or `REPLACE`, specifies the part of the incoming path you&#39;d like to remove or modify.
     * 
     */
    @Import(name="match")
    private @Nullable Output<String> match;

    /**
     * @return When `behavior` is `REMOVE` or `REPLACE`, specifies the part of the incoming path you&#39;d like to remove or modify.
     * 
     */
    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * When enabled, replaces all potential matches rather than only the first.
     * 
     */
    @Import(name="matchMultiple")
    private @Nullable Output<Boolean> matchMultiple;

    /**
     * @return When enabled, replaces all potential matches rather than only the first.
     * 
     */
    public Optional<Output<Boolean>> matchMultiple() {
        return Optional.ofNullable(this.matchMultiple);
    }

    /**
     * When `behavior` is set to `REGEX_REPLACE`, specifies the Perl-compatible regular expression to replace with `targetRegex`.
     * 
     */
    @Import(name="matchRegex")
    private @Nullable Output<String> matchRegex;

    /**
     * @return When `behavior` is set to `REGEX_REPLACE`, specifies the Perl-compatible regular expression to replace with `targetRegex`.
     * 
     */
    public Optional<Output<String>> matchRegex() {
        return Optional.ofNullable(this.matchRegex);
    }

    /**
     * When `behavior` is set to `REPLACE`, this path replaces whatever the `match` field matches in the incoming request&#39;s path.
     * 
     */
    @Import(name="targetPath")
    private @Nullable Output<String> targetPath;

    /**
     * @return When `behavior` is set to `REPLACE`, this path replaces whatever the `match` field matches in the incoming request&#39;s path.
     * 
     */
    public Optional<Output<String>> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    /**
     * When `behavior` is set to `PREPEND`, specifies a path to prepend to the incoming request&#39;s URL.
     * 
     */
    @Import(name="targetPathPrepend")
    private @Nullable Output<String> targetPathPrepend;

    /**
     * @return When `behavior` is set to `PREPEND`, specifies a path to prepend to the incoming request&#39;s URL.
     * 
     */
    public Optional<Output<String>> targetPathPrepend() {
        return Optional.ofNullable(this.targetPathPrepend);
    }

    /**
     * When `behavior` is set to `REGEX_REPLACE`, this replaces whatever the `matchRegex` field matches, along with any captured sequences from `\$1` through `\$9`.
     * 
     */
    @Import(name="targetRegex")
    private @Nullable Output<String> targetRegex;

    /**
     * @return When `behavior` is set to `REGEX_REPLACE`, this replaces whatever the `matchRegex` field matches, along with any captured sequences from `\$1` through `\$9`.
     * 
     */
    public Optional<Output<String>> targetRegex() {
        return Optional.ofNullable(this.targetRegex);
    }

    /**
     * When `behavior` is set to `REWRITE`, specifies the full path to request from the origin.
     * 
     */
    @Import(name="targetUrl")
    private @Nullable Output<String> targetUrl;

    /**
     * @return When `behavior` is set to `REWRITE`, specifies the full path to request from the origin.
     * 
     */
    public Optional<Output<String>> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
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

    private GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs() {}

    private GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs(GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs $) {
        this.behavior = $.behavior;
        this.keepQueryString = $.keepQueryString;
        this.locked = $.locked;
        this.match = $.match;
        this.matchMultiple = $.matchMultiple;
        this.matchRegex = $.matchRegex;
        this.targetPath = $.targetPath;
        this.targetPathPrepend = $.targetPathPrepend;
        this.targetRegex = $.targetRegex;
        this.targetUrl = $.targetUrl;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param behavior The action to perform on the path.
         * 
         * @return builder
         * 
         */
        public Builder behavior(@Nullable Output<String> behavior) {
            $.behavior = behavior;
            return this;
        }

        /**
         * @param behavior The action to perform on the path.
         * 
         * @return builder
         * 
         */
        public Builder behavior(String behavior) {
            return behavior(Output.of(behavior));
        }

        /**
         * @param keepQueryString When enabled, retains the original path&#39;s query parameters.
         * 
         * @return builder
         * 
         */
        public Builder keepQueryString(@Nullable Output<Boolean> keepQueryString) {
            $.keepQueryString = keepQueryString;
            return this;
        }

        /**
         * @param keepQueryString When enabled, retains the original path&#39;s query parameters.
         * 
         * @return builder
         * 
         */
        public Builder keepQueryString(Boolean keepQueryString) {
            return keepQueryString(Output.of(keepQueryString));
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
         * @param match When `behavior` is `REMOVE` or `REPLACE`, specifies the part of the incoming path you&#39;d like to remove or modify.
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match When `behavior` is `REMOVE` or `REPLACE`, specifies the part of the incoming path you&#39;d like to remove or modify.
         * 
         * @return builder
         * 
         */
        public Builder match(String match) {
            return match(Output.of(match));
        }

        /**
         * @param matchMultiple When enabled, replaces all potential matches rather than only the first.
         * 
         * @return builder
         * 
         */
        public Builder matchMultiple(@Nullable Output<Boolean> matchMultiple) {
            $.matchMultiple = matchMultiple;
            return this;
        }

        /**
         * @param matchMultiple When enabled, replaces all potential matches rather than only the first.
         * 
         * @return builder
         * 
         */
        public Builder matchMultiple(Boolean matchMultiple) {
            return matchMultiple(Output.of(matchMultiple));
        }

        /**
         * @param matchRegex When `behavior` is set to `REGEX_REPLACE`, specifies the Perl-compatible regular expression to replace with `targetRegex`.
         * 
         * @return builder
         * 
         */
        public Builder matchRegex(@Nullable Output<String> matchRegex) {
            $.matchRegex = matchRegex;
            return this;
        }

        /**
         * @param matchRegex When `behavior` is set to `REGEX_REPLACE`, specifies the Perl-compatible regular expression to replace with `targetRegex`.
         * 
         * @return builder
         * 
         */
        public Builder matchRegex(String matchRegex) {
            return matchRegex(Output.of(matchRegex));
        }

        /**
         * @param targetPath When `behavior` is set to `REPLACE`, this path replaces whatever the `match` field matches in the incoming request&#39;s path.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(@Nullable Output<String> targetPath) {
            $.targetPath = targetPath;
            return this;
        }

        /**
         * @param targetPath When `behavior` is set to `REPLACE`, this path replaces whatever the `match` field matches in the incoming request&#39;s path.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(String targetPath) {
            return targetPath(Output.of(targetPath));
        }

        /**
         * @param targetPathPrepend When `behavior` is set to `PREPEND`, specifies a path to prepend to the incoming request&#39;s URL.
         * 
         * @return builder
         * 
         */
        public Builder targetPathPrepend(@Nullable Output<String> targetPathPrepend) {
            $.targetPathPrepend = targetPathPrepend;
            return this;
        }

        /**
         * @param targetPathPrepend When `behavior` is set to `PREPEND`, specifies a path to prepend to the incoming request&#39;s URL.
         * 
         * @return builder
         * 
         */
        public Builder targetPathPrepend(String targetPathPrepend) {
            return targetPathPrepend(Output.of(targetPathPrepend));
        }

        /**
         * @param targetRegex When `behavior` is set to `REGEX_REPLACE`, this replaces whatever the `matchRegex` field matches, along with any captured sequences from `\$1` through `\$9`.
         * 
         * @return builder
         * 
         */
        public Builder targetRegex(@Nullable Output<String> targetRegex) {
            $.targetRegex = targetRegex;
            return this;
        }

        /**
         * @param targetRegex When `behavior` is set to `REGEX_REPLACE`, this replaces whatever the `matchRegex` field matches, along with any captured sequences from `\$1` through `\$9`.
         * 
         * @return builder
         * 
         */
        public Builder targetRegex(String targetRegex) {
            return targetRegex(Output.of(targetRegex));
        }

        /**
         * @param targetUrl When `behavior` is set to `REWRITE`, specifies the full path to request from the origin.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(@Nullable Output<String> targetUrl) {
            $.targetUrl = targetUrl;
            return this;
        }

        /**
         * @param targetUrl When `behavior` is set to `REWRITE`, specifies the full path to request from the origin.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(String targetUrl) {
            return targetUrl(Output.of(targetUrl));
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

        public GetPropertyRulesBuilderRulesV20240813BehaviorRewriteUrlArgs build() {
            return $;
        }
    }

}
