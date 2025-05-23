// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetGtmAsmapAssignment;
import com.pulumi.akamai.inputs.GetGtmAsmapDefaultDatacenter;
import com.pulumi.akamai.inputs.GetGtmAsmapLink;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGtmAsmapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmAsmapPlainArgs Empty = new GetGtmAsmapPlainArgs();

    @Import(name="assignments")
    private @Nullable List<GetGtmAsmapAssignment> assignments;

    public Optional<List<GetGtmAsmapAssignment>> assignments() {
        return Optional.ofNullable(this.assignments);
    }

    @Import(name="defaultDatacenter")
    private @Nullable GetGtmAsmapDefaultDatacenter defaultDatacenter;

    public Optional<GetGtmAsmapDefaultDatacenter> defaultDatacenter() {
        return Optional.ofNullable(this.defaultDatacenter);
    }

    @Import(name="domain", required=true)
    private String domain;

    public String domain() {
        return this.domain;
    }

    @Import(name="links")
    private @Nullable List<GetGtmAsmapLink> links;

    public Optional<List<GetGtmAsmapLink>> links() {
        return Optional.ofNullable(this.links);
    }

    @Import(name="mapName", required=true)
    private String mapName;

    public String mapName() {
        return this.mapName;
    }

    private GetGtmAsmapPlainArgs() {}

    private GetGtmAsmapPlainArgs(GetGtmAsmapPlainArgs $) {
        this.assignments = $.assignments;
        this.defaultDatacenter = $.defaultDatacenter;
        this.domain = $.domain;
        this.links = $.links;
        this.mapName = $.mapName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmAsmapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmAsmapPlainArgs $;

        public Builder() {
            $ = new GetGtmAsmapPlainArgs();
        }

        public Builder(GetGtmAsmapPlainArgs defaults) {
            $ = new GetGtmAsmapPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder assignments(@Nullable List<GetGtmAsmapAssignment> assignments) {
            $.assignments = assignments;
            return this;
        }

        public Builder assignments(GetGtmAsmapAssignment... assignments) {
            return assignments(List.of(assignments));
        }

        public Builder defaultDatacenter(@Nullable GetGtmAsmapDefaultDatacenter defaultDatacenter) {
            $.defaultDatacenter = defaultDatacenter;
            return this;
        }

        public Builder domain(String domain) {
            $.domain = domain;
            return this;
        }

        public Builder links(@Nullable List<GetGtmAsmapLink> links) {
            $.links = links;
            return this;
        }

        public Builder links(GetGtmAsmapLink... links) {
            return links(List.of(links));
        }

        public Builder mapName(String mapName) {
            $.mapName = mapName;
            return this;
        }

        public GetGtmAsmapPlainArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("GetGtmAsmapPlainArgs", "domain");
            }
            if ($.mapName == null) {
                throw new MissingRequiredPropertyException("GetGtmAsmapPlainArgs", "mapName");
            }
            return $;
        }
    }

}
