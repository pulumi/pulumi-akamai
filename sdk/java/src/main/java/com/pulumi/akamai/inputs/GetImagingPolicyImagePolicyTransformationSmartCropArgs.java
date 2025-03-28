// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationSmartCropArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationSmartCropArgs Empty = new GetImagingPolicyImagePolicyTransformationSmartCropArgs();

    /**
     * When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    @Import(name="debug")
    private @Nullable Output<String> debug;

    /**
     * @return When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    public Optional<Output<String>> debug() {
        return Optional.ofNullable(this.debug);
    }

    /**
     * When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    @Import(name="debugVar")
    private @Nullable Output<String> debugVar;

    /**
     * @return When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    public Optional<Output<String>> debugVar() {
        return Optional.ofNullable(this.debugVar);
    }

    /**
     * The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="height")
    private @Nullable Output<String> height;

    /**
     * @return The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<Output<String>> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="heightVar")
    private @Nullable Output<String> heightVar;

    /**
     * @return The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<Output<String>> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }

    /**
     * Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    @Import(name="sloppy")
    private @Nullable Output<String> sloppy;

    /**
     * @return Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    public Optional<Output<String>> sloppy() {
        return Optional.ofNullable(this.sloppy);
    }

    /**
     * Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    @Import(name="sloppyVar")
    private @Nullable Output<String> sloppyVar;

    /**
     * @return Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    public Optional<Output<String>> sloppyVar() {
        return Optional.ofNullable(this.sloppyVar);
    }

    /**
     * Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    @Import(name="style")
    private @Nullable Output<String> style;

    /**
     * @return Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    public Optional<Output<String>> style() {
        return Optional.ofNullable(this.style);
    }

    /**
     * Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    @Import(name="styleVar")
    private @Nullable Output<String> styleVar;

    /**
     * @return Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    public Optional<Output<String>> styleVar() {
        return Optional.ofNullable(this.styleVar);
    }

    /**
     * The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="width")
    private @Nullable Output<String> width;

    /**
     * @return The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<Output<String>> width() {
        return Optional.ofNullable(this.width);
    }

    /**
     * The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="widthVar")
    private @Nullable Output<String> widthVar;

    /**
     * @return The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<Output<String>> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    private GetImagingPolicyImagePolicyTransformationSmartCropArgs() {}

    private GetImagingPolicyImagePolicyTransformationSmartCropArgs(GetImagingPolicyImagePolicyTransformationSmartCropArgs $) {
        this.debug = $.debug;
        this.debugVar = $.debugVar;
        this.height = $.height;
        this.heightVar = $.heightVar;
        this.sloppy = $.sloppy;
        this.sloppyVar = $.sloppyVar;
        this.style = $.style;
        this.styleVar = $.styleVar;
        this.width = $.width;
        this.widthVar = $.widthVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationSmartCropArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationSmartCropArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationSmartCropArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationSmartCropArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationSmartCropArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param debug When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
         * 
         * @return builder
         * 
         */
        public Builder debug(@Nullable Output<String> debug) {
            $.debug = debug;
            return this;
        }

        /**
         * @param debug When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
         * 
         * @return builder
         * 
         */
        public Builder debug(String debug) {
            return debug(Output.of(debug));
        }

        /**
         * @param debugVar When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
         * 
         * @return builder
         * 
         */
        public Builder debugVar(@Nullable Output<String> debugVar) {
            $.debugVar = debugVar;
            return this;
        }

        /**
         * @param debugVar When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
         * 
         * @return builder
         * 
         */
        public Builder debugVar(String debugVar) {
            return debugVar(Output.of(debugVar));
        }

        /**
         * @param height The height in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable Output<String> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height The height in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder height(String height) {
            return height(Output.of(height));
        }

        /**
         * @param heightVar The height in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder heightVar(@Nullable Output<String> heightVar) {
            $.heightVar = heightVar;
            return this;
        }

        /**
         * @param heightVar The height in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder heightVar(String heightVar) {
            return heightVar(Output.of(heightVar));
        }

        /**
         * @param sloppy Whether to sacrifice any image fidelity for transformation performance.
         * 
         * @return builder
         * 
         */
        public Builder sloppy(@Nullable Output<String> sloppy) {
            $.sloppy = sloppy;
            return this;
        }

        /**
         * @param sloppy Whether to sacrifice any image fidelity for transformation performance.
         * 
         * @return builder
         * 
         */
        public Builder sloppy(String sloppy) {
            return sloppy(Output.of(sloppy));
        }

        /**
         * @param sloppyVar Whether to sacrifice any image fidelity for transformation performance.
         * 
         * @return builder
         * 
         */
        public Builder sloppyVar(@Nullable Output<String> sloppyVar) {
            $.sloppyVar = sloppyVar;
            return this;
        }

        /**
         * @param sloppyVar Whether to sacrifice any image fidelity for transformation performance.
         * 
         * @return builder
         * 
         */
        public Builder sloppyVar(String sloppyVar) {
            return sloppyVar(Output.of(sloppyVar));
        }

        /**
         * @param style Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable Output<String> style) {
            $.style = style;
            return this;
        }

        /**
         * @param style Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
         * 
         * @return builder
         * 
         */
        public Builder style(String style) {
            return style(Output.of(style));
        }

        /**
         * @param styleVar Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
         * 
         * @return builder
         * 
         */
        public Builder styleVar(@Nullable Output<String> styleVar) {
            $.styleVar = styleVar;
            return this;
        }

        /**
         * @param styleVar Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
         * 
         * @return builder
         * 
         */
        public Builder styleVar(String styleVar) {
            return styleVar(Output.of(styleVar));
        }

        /**
         * @param width The width in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable Output<String> width) {
            $.width = width;
            return this;
        }

        /**
         * @param width The width in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder width(String width) {
            return width(Output.of(width));
        }

        /**
         * @param widthVar The width in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder widthVar(@Nullable Output<String> widthVar) {
            $.widthVar = widthVar;
            return this;
        }

        /**
         * @param widthVar The width in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder widthVar(String widthVar) {
            return widthVar(Output.of(widthVar));
        }

        public GetImagingPolicyImagePolicyTransformationSmartCropArgs build() {
            return $;
        }
    }

}
