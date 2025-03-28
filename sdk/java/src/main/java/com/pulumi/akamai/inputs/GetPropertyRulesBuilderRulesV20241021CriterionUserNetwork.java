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


public final class GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork Empty = new GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork();

    /**
     * Bandwidth range in bits per second, either `1`, `57`, `257`, `1000`, `2000`, or `5000`.
     * 
     */
    @Import(name="bandwidthValues")
    private @Nullable List<String> bandwidthValues;

    /**
     * @return Bandwidth range in bits per second, either `1`, `57`, `257`, `1000`, `2000`, or `5000`.
     * 
     */
    public Optional<List<String>> bandwidthValues() {
        return Optional.ofNullable(this.bandwidthValues);
    }

    /**
     * Specifies which IP addresses determine the user&#39;s network.
     * 
     */
    @Import(name="checkIps")
    private @Nullable String checkIps;

    /**
     * @return Specifies which IP addresses determine the user&#39;s network.
     * 
     */
    public Optional<String> checkIps() {
        return Optional.ofNullable(this.checkIps);
    }

    /**
     * The type of information to match.
     * 
     */
    @Import(name="field")
    private @Nullable String field;

    /**
     * @return The type of information to match.
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }

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
     * Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
     * 
     */
    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    /**
     * @return Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
     * 
     */
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="networkTypeValues")
    private @Nullable List<String> networkTypeValues;

    public Optional<List<String>> networkTypeValues() {
        return Optional.ofNullable(this.networkTypeValues);
    }

    /**
     * Any set of specific networks.
     * 
     */
    @Import(name="networkValues")
    private @Nullable List<String> networkValues;

    /**
     * @return Any set of specific networks.
     * 
     */
    public Optional<List<String>> networkValues() {
        return Optional.ofNullable(this.networkValues);
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
     * When connecting via a proxy server as determined by the `X-Forwarded-For` header, enabling this option matches the end client specified in the header. Disabling it matches the connecting client&#39;s IP address.
     * 
     */
    @Import(name="useOnlyFirstXForwardedForIp")
    private @Nullable Boolean useOnlyFirstXForwardedForIp;

    /**
     * @return When connecting via a proxy server as determined by the `X-Forwarded-For` header, enabling this option matches the end client specified in the header. Disabling it matches the connecting client&#39;s IP address.
     * 
     */
    public Optional<Boolean> useOnlyFirstXForwardedForIp() {
        return Optional.ofNullable(this.useOnlyFirstXForwardedForIp);
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

    private GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork() {}

    private GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork(GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork $) {
        this.bandwidthValues = $.bandwidthValues;
        this.checkIps = $.checkIps;
        this.field = $.field;
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.networkTypeValues = $.networkTypeValues;
        this.networkValues = $.networkValues;
        this.templateUuid = $.templateUuid;
        this.useOnlyFirstXForwardedForIp = $.useOnlyFirstXForwardedForIp;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork();
        }

        public Builder(GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork defaults) {
            $ = new GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthValues Bandwidth range in bits per second, either `1`, `57`, `257`, `1000`, `2000`, or `5000`.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthValues(@Nullable List<String> bandwidthValues) {
            $.bandwidthValues = bandwidthValues;
            return this;
        }

        /**
         * @param bandwidthValues Bandwidth range in bits per second, either `1`, `57`, `257`, `1000`, `2000`, or `5000`.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthValues(String... bandwidthValues) {
            return bandwidthValues(List.of(bandwidthValues));
        }

        /**
         * @param checkIps Specifies which IP addresses determine the user&#39;s network.
         * 
         * @return builder
         * 
         */
        public Builder checkIps(@Nullable String checkIps) {
            $.checkIps = checkIps;
            return this;
        }

        /**
         * @param field The type of information to match.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable String field) {
            $.field = field;
            return this;
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
         * @param matchOperator Matches the specified set of values when set to `IS_ONE_OF`, otherwise `IS_NOT_ONE_OF` reverses the match.
         * 
         * @return builder
         * 
         */
        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder networkTypeValues(@Nullable List<String> networkTypeValues) {
            $.networkTypeValues = networkTypeValues;
            return this;
        }

        public Builder networkTypeValues(String... networkTypeValues) {
            return networkTypeValues(List.of(networkTypeValues));
        }

        /**
         * @param networkValues Any set of specific networks.
         * 
         * @return builder
         * 
         */
        public Builder networkValues(@Nullable List<String> networkValues) {
            $.networkValues = networkValues;
            return this;
        }

        /**
         * @param networkValues Any set of specific networks.
         * 
         * @return builder
         * 
         */
        public Builder networkValues(String... networkValues) {
            return networkValues(List.of(networkValues));
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
         * @param useOnlyFirstXForwardedForIp When connecting via a proxy server as determined by the `X-Forwarded-For` header, enabling this option matches the end client specified in the header. Disabling it matches the connecting client&#39;s IP address.
         * 
         * @return builder
         * 
         */
        public Builder useOnlyFirstXForwardedForIp(@Nullable Boolean useOnlyFirstXForwardedForIp) {
            $.useOnlyFirstXForwardedForIp = useOnlyFirstXForwardedForIp;
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

        public GetPropertyRulesBuilderRulesV20241021CriterionUserNetwork build() {
            return $;
        }
    }

}
