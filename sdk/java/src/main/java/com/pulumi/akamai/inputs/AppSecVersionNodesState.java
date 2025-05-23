// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecVersionNodesState extends com.pulumi.resources.ResourceArgs {

    public static final AppSecVersionNodesState Empty = new AppSecVersionNodesState();

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Text representation
     * 
     */
    @Import(name="outputText")
    private @Nullable Output<String> outputText;

    /**
     * @return Text representation
     * 
     */
    public Optional<Output<String>> outputText() {
        return Optional.ofNullable(this.outputText);
    }

    /**
     * Brief description of the security configuration version
     * 
     */
    @Import(name="versionNotes")
    private @Nullable Output<String> versionNotes;

    /**
     * @return Brief description of the security configuration version
     * 
     */
    public Optional<Output<String>> versionNotes() {
        return Optional.ofNullable(this.versionNotes);
    }

    private AppSecVersionNodesState() {}

    private AppSecVersionNodesState(AppSecVersionNodesState $) {
        this.configId = $.configId;
        this.outputText = $.outputText;
        this.versionNotes = $.versionNotes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecVersionNodesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecVersionNodesState $;

        public Builder() {
            $ = new AppSecVersionNodesState();
        }

        public Builder(AppSecVersionNodesState defaults) {
            $ = new AppSecVersionNodesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param outputText Text representation
         * 
         * @return builder
         * 
         */
        public Builder outputText(@Nullable Output<String> outputText) {
            $.outputText = outputText;
            return this;
        }

        /**
         * @param outputText Text representation
         * 
         * @return builder
         * 
         */
        public Builder outputText(String outputText) {
            return outputText(Output.of(outputText));
        }

        /**
         * @param versionNotes Brief description of the security configuration version
         * 
         * @return builder
         * 
         */
        public Builder versionNotes(@Nullable Output<String> versionNotes) {
            $.versionNotes = versionNotes;
            return this;
        }

        /**
         * @param versionNotes Brief description of the security configuration version
         * 
         * @return builder
         * 
         */
        public Builder versionNotes(String versionNotes) {
            return versionNotes(Output.of(versionNotes));
        }

        public AppSecVersionNodesState build() {
            return $;
        }
    }

}
