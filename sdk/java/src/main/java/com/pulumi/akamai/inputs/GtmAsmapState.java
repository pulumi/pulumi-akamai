// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GtmAsmapAssignmentArgs;
import com.pulumi.akamai.inputs.GtmAsmapDefaultDatacenterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GtmAsmapState extends com.pulumi.resources.ResourceArgs {

    public static final GtmAsmapState Empty = new GtmAsmapState();

    @Import(name="assignments")
    private @Nullable Output<List<GtmAsmapAssignmentArgs>> assignments;

    public Optional<Output<List<GtmAsmapAssignmentArgs>>> assignments() {
        return Optional.ofNullable(this.assignments);
    }

    @Import(name="defaultDatacenter")
    private @Nullable Output<GtmAsmapDefaultDatacenterArgs> defaultDatacenter;

    public Optional<Output<GtmAsmapDefaultDatacenterArgs>> defaultDatacenter() {
        return Optional.ofNullable(this.defaultDatacenter);
    }

    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="waitOnComplete")
    private @Nullable Output<Boolean> waitOnComplete;

    public Optional<Output<Boolean>> waitOnComplete() {
        return Optional.ofNullable(this.waitOnComplete);
    }

    private GtmAsmapState() {}

    private GtmAsmapState(GtmAsmapState $) {
        this.assignments = $.assignments;
        this.defaultDatacenter = $.defaultDatacenter;
        this.domain = $.domain;
        this.name = $.name;
        this.waitOnComplete = $.waitOnComplete;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GtmAsmapState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GtmAsmapState $;

        public Builder() {
            $ = new GtmAsmapState();
        }

        public Builder(GtmAsmapState defaults) {
            $ = new GtmAsmapState(Objects.requireNonNull(defaults));
        }

        public Builder assignments(@Nullable Output<List<GtmAsmapAssignmentArgs>> assignments) {
            $.assignments = assignments;
            return this;
        }

        public Builder assignments(List<GtmAsmapAssignmentArgs> assignments) {
            return assignments(Output.of(assignments));
        }

        public Builder assignments(GtmAsmapAssignmentArgs... assignments) {
            return assignments(List.of(assignments));
        }

        public Builder defaultDatacenter(@Nullable Output<GtmAsmapDefaultDatacenterArgs> defaultDatacenter) {
            $.defaultDatacenter = defaultDatacenter;
            return this;
        }

        public Builder defaultDatacenter(GtmAsmapDefaultDatacenterArgs defaultDatacenter) {
            return defaultDatacenter(Output.of(defaultDatacenter));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder waitOnComplete(@Nullable Output<Boolean> waitOnComplete) {
            $.waitOnComplete = waitOnComplete;
            return this;
        }

        public Builder waitOnComplete(Boolean waitOnComplete) {
            return waitOnComplete(Output.of(waitOnComplete));
        }

        public GtmAsmapState build() {
            return $;
        }
    }

}
