// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationRelativeCropArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationRelativeCropArgs Empty = new GetImagingPolicyImagePolicyTransformationRelativeCropArgs();

    /**
     * The number of pixels to shrink or expand the right side of the image.
     * 
     */
    @Import(name="east")
    private @Nullable Output<String> east;

    /**
     * @return The number of pixels to shrink or expand the right side of the image.
     * 
     */
    public Optional<Output<String>> east() {
        return Optional.ofNullable(this.east);
    }

    /**
     * The number of pixels to shrink or expand the right side of the image.
     * 
     */
    @Import(name="eastVar")
    private @Nullable Output<String> eastVar;

    /**
     * @return The number of pixels to shrink or expand the right side of the image.
     * 
     */
    public Optional<Output<String>> eastVar() {
        return Optional.ofNullable(this.eastVar);
    }

    /**
     * The number of pixels to shrink or expand the top side of the image.
     * 
     */
    @Import(name="north")
    private @Nullable Output<String> north;

    /**
     * @return The number of pixels to shrink or expand the top side of the image.
     * 
     */
    public Optional<Output<String>> north() {
        return Optional.ofNullable(this.north);
    }

    /**
     * The number of pixels to shrink or expand the top side of the image.
     * 
     */
    @Import(name="northVar")
    private @Nullable Output<String> northVar;

    /**
     * @return The number of pixels to shrink or expand the top side of the image.
     * 
     */
    public Optional<Output<String>> northVar() {
        return Optional.ofNullable(this.northVar);
    }

    /**
     * The number of pixels to shrink or expand the bottom side of the image.
     * 
     */
    @Import(name="south")
    private @Nullable Output<String> south;

    /**
     * @return The number of pixels to shrink or expand the bottom side of the image.
     * 
     */
    public Optional<Output<String>> south() {
        return Optional.ofNullable(this.south);
    }

    /**
     * The number of pixels to shrink or expand the bottom side of the image.
     * 
     */
    @Import(name="southVar")
    private @Nullable Output<String> southVar;

    /**
     * @return The number of pixels to shrink or expand the bottom side of the image.
     * 
     */
    public Optional<Output<String>> southVar() {
        return Optional.ofNullable(this.southVar);
    }

    /**
     * The number of pixels to shrink or expand the left side of the image.
     * 
     */
    @Import(name="west")
    private @Nullable Output<String> west;

    /**
     * @return The number of pixels to shrink or expand the left side of the image.
     * 
     */
    public Optional<Output<String>> west() {
        return Optional.ofNullable(this.west);
    }

    /**
     * The number of pixels to shrink or expand the left side of the image.
     * 
     */
    @Import(name="westVar")
    private @Nullable Output<String> westVar;

    /**
     * @return The number of pixels to shrink or expand the left side of the image.
     * 
     */
    public Optional<Output<String>> westVar() {
        return Optional.ofNullable(this.westVar);
    }

    private GetImagingPolicyImagePolicyTransformationRelativeCropArgs() {}

    private GetImagingPolicyImagePolicyTransformationRelativeCropArgs(GetImagingPolicyImagePolicyTransformationRelativeCropArgs $) {
        this.east = $.east;
        this.eastVar = $.eastVar;
        this.north = $.north;
        this.northVar = $.northVar;
        this.south = $.south;
        this.southVar = $.southVar;
        this.west = $.west;
        this.westVar = $.westVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRelativeCropArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRelativeCropArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRelativeCropArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRelativeCropArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRelativeCropArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param east The number of pixels to shrink or expand the right side of the image.
         * 
         * @return builder
         * 
         */
        public Builder east(@Nullable Output<String> east) {
            $.east = east;
            return this;
        }

        /**
         * @param east The number of pixels to shrink or expand the right side of the image.
         * 
         * @return builder
         * 
         */
        public Builder east(String east) {
            return east(Output.of(east));
        }

        /**
         * @param eastVar The number of pixels to shrink or expand the right side of the image.
         * 
         * @return builder
         * 
         */
        public Builder eastVar(@Nullable Output<String> eastVar) {
            $.eastVar = eastVar;
            return this;
        }

        /**
         * @param eastVar The number of pixels to shrink or expand the right side of the image.
         * 
         * @return builder
         * 
         */
        public Builder eastVar(String eastVar) {
            return eastVar(Output.of(eastVar));
        }

        /**
         * @param north The number of pixels to shrink or expand the top side of the image.
         * 
         * @return builder
         * 
         */
        public Builder north(@Nullable Output<String> north) {
            $.north = north;
            return this;
        }

        /**
         * @param north The number of pixels to shrink or expand the top side of the image.
         * 
         * @return builder
         * 
         */
        public Builder north(String north) {
            return north(Output.of(north));
        }

        /**
         * @param northVar The number of pixels to shrink or expand the top side of the image.
         * 
         * @return builder
         * 
         */
        public Builder northVar(@Nullable Output<String> northVar) {
            $.northVar = northVar;
            return this;
        }

        /**
         * @param northVar The number of pixels to shrink or expand the top side of the image.
         * 
         * @return builder
         * 
         */
        public Builder northVar(String northVar) {
            return northVar(Output.of(northVar));
        }

        /**
         * @param south The number of pixels to shrink or expand the bottom side of the image.
         * 
         * @return builder
         * 
         */
        public Builder south(@Nullable Output<String> south) {
            $.south = south;
            return this;
        }

        /**
         * @param south The number of pixels to shrink or expand the bottom side of the image.
         * 
         * @return builder
         * 
         */
        public Builder south(String south) {
            return south(Output.of(south));
        }

        /**
         * @param southVar The number of pixels to shrink or expand the bottom side of the image.
         * 
         * @return builder
         * 
         */
        public Builder southVar(@Nullable Output<String> southVar) {
            $.southVar = southVar;
            return this;
        }

        /**
         * @param southVar The number of pixels to shrink or expand the bottom side of the image.
         * 
         * @return builder
         * 
         */
        public Builder southVar(String southVar) {
            return southVar(Output.of(southVar));
        }

        /**
         * @param west The number of pixels to shrink or expand the left side of the image.
         * 
         * @return builder
         * 
         */
        public Builder west(@Nullable Output<String> west) {
            $.west = west;
            return this;
        }

        /**
         * @param west The number of pixels to shrink or expand the left side of the image.
         * 
         * @return builder
         * 
         */
        public Builder west(String west) {
            return west(Output.of(west));
        }

        /**
         * @param westVar The number of pixels to shrink or expand the left side of the image.
         * 
         * @return builder
         * 
         */
        public Builder westVar(@Nullable Output<String> westVar) {
            $.westVar = westVar;
            return this;
        }

        /**
         * @param westVar The number of pixels to shrink or expand the left side of the image.
         * 
         * @return builder
         * 
         */
        public Builder westVar(String westVar) {
            return westVar(Output.of(westVar));
        }

        public GetImagingPolicyImagePolicyTransformationRelativeCropArgs build() {
            return $;
        }
    }

}
