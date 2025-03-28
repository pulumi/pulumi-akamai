// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase Empty = new GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase();

    /**
     * Specifies a default database for this property. If you don&#39;t configure a default data set in the `ecmsDataset` behavior, requests to objects in this database follow the pattern: `&lt;hostname&gt;/datastore/&lt;data_set_name&gt;/&lt;object_key&gt;`.
     * 
     */
    @Import(name="database")
    private @Nullable String database;

    /**
     * @return Specifies a default database for this property. If you don&#39;t configure a default data set in the `ecmsDataset` behavior, requests to objects in this database follow the pattern: `&lt;hostname&gt;/datastore/&lt;data_set_name&gt;/&lt;object_key&gt;`.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Specifies where to pass a database name in requests. If the specified location doesn&#39;t include the database name or the name doesn&#39;t match the regular expression, the default database is used.
     * 
     */
    @Import(name="extractLocation")
    private @Nullable String extractLocation;

    /**
     * @return Specifies where to pass a database name in requests. If the specified location doesn&#39;t include the database name or the name doesn&#39;t match the regular expression, the default database is used.
     * 
     */
    public Optional<String> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }

    /**
     * Specifies the request header that passed the database name. By default, it points to `X-KV-Database`.
     * 
     */
    @Import(name="headerName")
    private @Nullable String headerName;

    /**
     * @return Specifies the request header that passed the database name. By default, it points to `X-KV-Database`.
     * 
     */
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
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
     * Specifies the query string parameter that passed the database name. By default, it points to `database`.
     * 
     */
    @Import(name="queryParameterName")
    private @Nullable String queryParameterName;

    /**
     * @return Specifies the query string parameter that passed the database name. By default, it points to `database`.
     * 
     */
    public Optional<String> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
    }

    /**
     * Specifies the regular expression that matches the database name in the URL.
     * 
     */
    @Import(name="regexPattern")
    private @Nullable String regexPattern;

    /**
     * @return Specifies the regular expression that matches the database name in the URL.
     * 
     */
    public Optional<String> regexPattern() {
        return Optional.ofNullable(this.regexPattern);
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

    private GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase() {}

    private GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase(GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase $) {
        this.database = $.database;
        this.extractLocation = $.extractLocation;
        this.headerName = $.headerName;
        this.locked = $.locked;
        this.queryParameterName = $.queryParameterName;
        this.regexPattern = $.regexPattern;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase();
        }

        public Builder(GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase defaults) {
            $ = new GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Specifies a default database for this property. If you don&#39;t configure a default data set in the `ecmsDataset` behavior, requests to objects in this database follow the pattern: `&lt;hostname&gt;/datastore/&lt;data_set_name&gt;/&lt;object_key&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable String database) {
            $.database = database;
            return this;
        }

        /**
         * @param extractLocation Specifies where to pass a database name in requests. If the specified location doesn&#39;t include the database name or the name doesn&#39;t match the regular expression, the default database is used.
         * 
         * @return builder
         * 
         */
        public Builder extractLocation(@Nullable String extractLocation) {
            $.extractLocation = extractLocation;
            return this;
        }

        /**
         * @param headerName Specifies the request header that passed the database name. By default, it points to `X-KV-Database`.
         * 
         * @return builder
         * 
         */
        public Builder headerName(@Nullable String headerName) {
            $.headerName = headerName;
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
         * @param queryParameterName Specifies the query string parameter that passed the database name. By default, it points to `database`.
         * 
         * @return builder
         * 
         */
        public Builder queryParameterName(@Nullable String queryParameterName) {
            $.queryParameterName = queryParameterName;
            return this;
        }

        /**
         * @param regexPattern Specifies the regular expression that matches the database name in the URL.
         * 
         * @return builder
         * 
         */
        public Builder regexPattern(@Nullable String regexPattern) {
            $.regexPattern = regexPattern;
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

        public GetPropertyRulesBuilderRulesV20241021BehaviorEcmsDatabase build() {
            return $;
        }
    }

}
