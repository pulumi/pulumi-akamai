// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamRoleArgs Empty = new IamRoleArgs();

    /**
     * The description for a role.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description for a role.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The list of existing unique identifiers for the granted roles.
     * 
     */
    @Import(name="grantedRoles", required=true)
    private Output<List<Integer>> grantedRoles;

    /**
     * @return The list of existing unique identifiers for the granted roles.
     * 
     */
    public Output<List<Integer>> grantedRoles() {
        return this.grantedRoles;
    }

    /**
     * The name you supply for a role.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name you supply for a role.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The role type which indicates whether it&#39;s a standard role provided by Akamai or a custom role for the account.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The role type which indicates whether it&#39;s a standard role provided by Akamai or a custom role for the account.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private IamRoleArgs() {}

    private IamRoleArgs(IamRoleArgs $) {
        this.description = $.description;
        this.grantedRoles = $.grantedRoles;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamRoleArgs $;

        public Builder() {
            $ = new IamRoleArgs();
        }

        public Builder(IamRoleArgs defaults) {
            $ = new IamRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description for a role.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for a role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param grantedRoles The list of existing unique identifiers for the granted roles.
         * 
         * @return builder
         * 
         */
        public Builder grantedRoles(Output<List<Integer>> grantedRoles) {
            $.grantedRoles = grantedRoles;
            return this;
        }

        /**
         * @param grantedRoles The list of existing unique identifiers for the granted roles.
         * 
         * @return builder
         * 
         */
        public Builder grantedRoles(List<Integer> grantedRoles) {
            return grantedRoles(Output.of(grantedRoles));
        }

        /**
         * @param grantedRoles The list of existing unique identifiers for the granted roles.
         * 
         * @return builder
         * 
         */
        public Builder grantedRoles(Integer... grantedRoles) {
            return grantedRoles(List.of(grantedRoles));
        }

        /**
         * @param name The name you supply for a role.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name you supply for a role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The role type which indicates whether it&#39;s a standard role provided by Akamai or a custom role for the account.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The role type which indicates whether it&#39;s a standard role provided by Akamai or a custom role for the account.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IamRoleArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("IamRoleArgs", "description");
            }
            if ($.grantedRoles == null) {
                throw new MissingRequiredPropertyException("IamRoleArgs", "grantedRoles");
            }
            return $;
        }
    }

}
