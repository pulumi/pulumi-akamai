// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyVideoPolicyOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyVideoPolicyOutputArgs Empty = new GetImagingPolicyVideoPolicyOutputArgs();

    /**
     * The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
     * 
     */
    @Import(name="perceptualQuality")
    private @Nullable Output<String> perceptualQuality;

    /**
     * @return The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
     * 
     */
    public Optional<Output<String>> perceptualQuality() {
        return Optional.ofNullable(this.perceptualQuality);
    }

    /**
     * The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
     * 
     */
    @Import(name="perceptualQualityVar")
    private @Nullable Output<String> perceptualQualityVar;

    /**
     * @return The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
     * 
     */
    public Optional<Output<String>> perceptualQualityVar() {
        return Optional.ofNullable(this.perceptualQualityVar);
    }

    /**
     * Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
     * 
     */
    @Import(name="placeholderVideoUrl")
    private @Nullable Output<String> placeholderVideoUrl;

    /**
     * @return Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
     * 
     */
    public Optional<Output<String>> placeholderVideoUrl() {
        return Optional.ofNullable(this.placeholderVideoUrl);
    }

    /**
     * Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
     * 
     */
    @Import(name="placeholderVideoUrlVar")
    private @Nullable Output<String> placeholderVideoUrlVar;

    /**
     * @return Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
     * 
     */
    public Optional<Output<String>> placeholderVideoUrlVar() {
        return Optional.ofNullable(this.placeholderVideoUrlVar);
    }

    /**
     * Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
     * 
     */
    @Import(name="videoAdaptiveQuality")
    private @Nullable Output<String> videoAdaptiveQuality;

    /**
     * @return Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
     * 
     */
    public Optional<Output<String>> videoAdaptiveQuality() {
        return Optional.ofNullable(this.videoAdaptiveQuality);
    }

    /**
     * Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
     * 
     */
    @Import(name="videoAdaptiveQualityVar")
    private @Nullable Output<String> videoAdaptiveQualityVar;

    /**
     * @return Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
     * 
     */
    public Optional<Output<String>> videoAdaptiveQualityVar() {
        return Optional.ofNullable(this.videoAdaptiveQualityVar);
    }

    private GetImagingPolicyVideoPolicyOutputArgs() {}

    private GetImagingPolicyVideoPolicyOutputArgs(GetImagingPolicyVideoPolicyOutputArgs $) {
        this.perceptualQuality = $.perceptualQuality;
        this.perceptualQualityVar = $.perceptualQualityVar;
        this.placeholderVideoUrl = $.placeholderVideoUrl;
        this.placeholderVideoUrlVar = $.placeholderVideoUrlVar;
        this.videoAdaptiveQuality = $.videoAdaptiveQuality;
        this.videoAdaptiveQualityVar = $.videoAdaptiveQualityVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyVideoPolicyOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyVideoPolicyOutputArgs $;

        public Builder() {
            $ = new GetImagingPolicyVideoPolicyOutputArgs();
        }

        public Builder(GetImagingPolicyVideoPolicyOutputArgs defaults) {
            $ = new GetImagingPolicyVideoPolicyOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param perceptualQuality The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
         * 
         * @return builder
         * 
         */
        public Builder perceptualQuality(@Nullable Output<String> perceptualQuality) {
            $.perceptualQuality = perceptualQuality;
            return this;
        }

        /**
         * @param perceptualQuality The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
         * 
         * @return builder
         * 
         */
        public Builder perceptualQuality(String perceptualQuality) {
            return perceptualQuality(Output.of(perceptualQuality));
        }

        /**
         * @param perceptualQualityVar The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
         * 
         * @return builder
         * 
         */
        public Builder perceptualQualityVar(@Nullable Output<String> perceptualQualityVar) {
            $.perceptualQualityVar = perceptualQualityVar;
            return this;
        }

        /**
         * @param perceptualQualityVar The quality of derivative videos. High preserves video quality with reduced byte savings while low reduces video quality to increase byte savings.
         * 
         * @return builder
         * 
         */
        public Builder perceptualQualityVar(String perceptualQualityVar) {
            return perceptualQualityVar(Output.of(perceptualQualityVar));
        }

        /**
         * @param placeholderVideoUrl Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
         * 
         * @return builder
         * 
         */
        public Builder placeholderVideoUrl(@Nullable Output<String> placeholderVideoUrl) {
            $.placeholderVideoUrl = placeholderVideoUrl;
            return this;
        }

        /**
         * @param placeholderVideoUrl Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
         * 
         * @return builder
         * 
         */
        public Builder placeholderVideoUrl(String placeholderVideoUrl) {
            return placeholderVideoUrl(Output.of(placeholderVideoUrl));
        }

        /**
         * @param placeholderVideoUrlVar Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
         * 
         * @return builder
         * 
         */
        public Builder placeholderVideoUrlVar(@Nullable Output<String> placeholderVideoUrlVar) {
            $.placeholderVideoUrlVar = placeholderVideoUrlVar;
            return this;
        }

        /**
         * @param placeholderVideoUrlVar Allows you to add a specific placeholder video that appears when a user first requests a video, but before Image &amp; Video Manager processes the video. If not specified the original video plays during the processing time.
         * 
         * @return builder
         * 
         */
        public Builder placeholderVideoUrlVar(String placeholderVideoUrlVar) {
            return placeholderVideoUrlVar(Output.of(placeholderVideoUrlVar));
        }

        /**
         * @param videoAdaptiveQuality Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
         * 
         * @return builder
         * 
         */
        public Builder videoAdaptiveQuality(@Nullable Output<String> videoAdaptiveQuality) {
            $.videoAdaptiveQuality = videoAdaptiveQuality;
            return this;
        }

        /**
         * @param videoAdaptiveQuality Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
         * 
         * @return builder
         * 
         */
        public Builder videoAdaptiveQuality(String videoAdaptiveQuality) {
            return videoAdaptiveQuality(Output.of(videoAdaptiveQuality));
        }

        /**
         * @param videoAdaptiveQualityVar Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
         * 
         * @return builder
         * 
         */
        public Builder videoAdaptiveQualityVar(@Nullable Output<String> videoAdaptiveQualityVar) {
            $.videoAdaptiveQualityVar = videoAdaptiveQualityVar;
            return this;
        }

        /**
         * @param videoAdaptiveQualityVar Override the quality of video to serve when Image &amp; Video Manager detects a slow connection. Specifying lower values lets users with slow connections browse your site with reduced load times without impacting the quality of videos for users with faster connections.
         * 
         * @return builder
         * 
         */
        public Builder videoAdaptiveQualityVar(String videoAdaptiveQualityVar) {
            return videoAdaptiveQualityVar(Output.of(videoAdaptiveQualityVar));
        }

        public GetImagingPolicyVideoPolicyOutputArgs build() {
            return $;
        }
    }

}
