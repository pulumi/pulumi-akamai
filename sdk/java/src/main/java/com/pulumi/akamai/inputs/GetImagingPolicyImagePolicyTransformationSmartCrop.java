// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationSmartCrop extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationSmartCrop Empty = new GetImagingPolicyImagePolicyTransformationSmartCrop();

    /**
     * When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    @Import(name="debug")
    private @Nullable String debug;

    /**
     * @return When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    public Optional<String> debug() {
        return Optional.ofNullable(this.debug);
    }

    /**
     * When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    @Import(name="debugVar")
    private @Nullable String debugVar;

    /**
     * @return When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
     * 
     */
    public Optional<String> debugVar() {
        return Optional.ofNullable(this.debugVar);
    }

    /**
     * The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="height")
    private @Nullable String height;

    /**
     * @return The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }

    /**
     * The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="heightVar")
    private @Nullable String heightVar;

    /**
     * @return The height in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }

    /**
     * Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    @Import(name="sloppy")
    private @Nullable String sloppy;

    /**
     * @return Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    public Optional<String> sloppy() {
        return Optional.ofNullable(this.sloppy);
    }

    /**
     * Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    @Import(name="sloppyVar")
    private @Nullable String sloppyVar;

    /**
     * @return Whether to sacrifice any image fidelity for transformation performance.
     * 
     */
    public Optional<String> sloppyVar() {
        return Optional.ofNullable(this.sloppyVar);
    }

    /**
     * Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    @Import(name="style")
    private @Nullable String style;

    /**
     * @return Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    public Optional<String> style() {
        return Optional.ofNullable(this.style);
    }

    /**
     * Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    @Import(name="styleVar")
    private @Nullable String styleVar;

    /**
     * @return Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
     * 
     */
    public Optional<String> styleVar() {
        return Optional.ofNullable(this.styleVar);
    }

    /**
     * The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="width")
    private @Nullable String width;

    /**
     * @return The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    /**
     * The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    @Import(name="widthVar")
    private @Nullable String widthVar;

    /**
     * @return The width in pixels of the output image relative to the specified `style` value.
     * 
     */
    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    private GetImagingPolicyImagePolicyTransformationSmartCrop() {}

    private GetImagingPolicyImagePolicyTransformationSmartCrop(GetImagingPolicyImagePolicyTransformationSmartCrop $) {
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
    public static Builder builder(GetImagingPolicyImagePolicyTransformationSmartCrop defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationSmartCrop $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationSmartCrop();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationSmartCrop defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationSmartCrop(Objects.requireNonNull(defaults));
        }

        /**
         * @param debug When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
         * 
         * @return builder
         * 
         */
        public Builder debug(@Nullable String debug) {
            $.debug = debug;
            return this;
        }

        /**
         * @param debugVar When enabled, the SmartCrop transformation doesn&#39;t actually execute. Instead, it outlines found faces or features, the region of interest, and the crop area.
         * 
         * @return builder
         * 
         */
        public Builder debugVar(@Nullable String debugVar) {
            $.debugVar = debugVar;
            return this;
        }

        /**
         * @param height The height in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable String height) {
            $.height = height;
            return this;
        }

        /**
         * @param heightVar The height in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder heightVar(@Nullable String heightVar) {
            $.heightVar = heightVar;
            return this;
        }

        /**
         * @param sloppy Whether to sacrifice any image fidelity for transformation performance.
         * 
         * @return builder
         * 
         */
        public Builder sloppy(@Nullable String sloppy) {
            $.sloppy = sloppy;
            return this;
        }

        /**
         * @param sloppyVar Whether to sacrifice any image fidelity for transformation performance.
         * 
         * @return builder
         * 
         */
        public Builder sloppyVar(@Nullable String sloppyVar) {
            $.sloppyVar = sloppyVar;
            return this;
        }

        /**
         * @param style Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
         * 
         * @return builder
         * 
         */
        public Builder style(@Nullable String style) {
            $.style = style;
            return this;
        }

        /**
         * @param styleVar Specifies how to crop or scale a crop area for the specified area of interest in the source image, `fill` by default. The output image resizes to the specified `width` and `height` values. A value of `crop` places raw crop around the point of interest.  A value of `fill` scales the crop area to include as much of the image and point of interest as possible, relative to the specified `width` and `height` values. A value of `zoom` scales the crop area as small as possible to fit the point of interest, relative to the specified `width` and `height` values.
         * 
         * @return builder
         * 
         */
        public Builder styleVar(@Nullable String styleVar) {
            $.styleVar = styleVar;
            return this;
        }

        /**
         * @param width The width in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder width(@Nullable String width) {
            $.width = width;
            return this;
        }

        /**
         * @param widthVar The width in pixels of the output image relative to the specified `style` value.
         * 
         * @return builder
         * 
         */
        public Builder widthVar(@Nullable String widthVar) {
            $.widthVar = widthVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationSmartCrop build() {
            return $;
        }
    }

}
