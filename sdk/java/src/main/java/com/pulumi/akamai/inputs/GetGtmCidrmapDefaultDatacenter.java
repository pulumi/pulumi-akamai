// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetGtmCidrmapDefaultDatacenter extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmCidrmapDefaultDatacenter Empty = new GetGtmCidrmapDefaultDatacenter();

    /**
     * For each property, an identifier for all other CIDR zones&#39; CNAME.
     * 
     */
    @Import(name="datacenterId", required=true)
    private Integer datacenterId;

    /**
     * @return For each property, an identifier for all other CIDR zones&#39; CNAME.
     * 
     */
    public Integer datacenterId() {
        return this.datacenterId;
    }

    /**
     * A descriptive label for all other CIDR blocks.
     * 
     */
    @Import(name="nickname", required=true)
    private String nickname;

    /**
     * @return A descriptive label for all other CIDR blocks.
     * 
     */
    public String nickname() {
        return this.nickname;
    }

    private GetGtmCidrmapDefaultDatacenter() {}

    private GetGtmCidrmapDefaultDatacenter(GetGtmCidrmapDefaultDatacenter $) {
        this.datacenterId = $.datacenterId;
        this.nickname = $.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmCidrmapDefaultDatacenter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmCidrmapDefaultDatacenter $;

        public Builder() {
            $ = new GetGtmCidrmapDefaultDatacenter();
        }

        public Builder(GetGtmCidrmapDefaultDatacenter defaults) {
            $ = new GetGtmCidrmapDefaultDatacenter(Objects.requireNonNull(defaults));
        }

        /**
         * @param datacenterId For each property, an identifier for all other CIDR zones&#39; CNAME.
         * 
         * @return builder
         * 
         */
        public Builder datacenterId(Integer datacenterId) {
            $.datacenterId = datacenterId;
            return this;
        }

        /**
         * @param nickname A descriptive label for all other CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder nickname(String nickname) {
            $.nickname = nickname;
            return this;
        }

        public GetGtmCidrmapDefaultDatacenter build() {
            if ($.datacenterId == null) {
                throw new MissingRequiredPropertyException("GetGtmCidrmapDefaultDatacenter", "datacenterId");
            }
            if ($.nickname == null) {
                throw new MissingRequiredPropertyException("GetGtmCidrmapDefaultDatacenter", "nickname");
            }
            return $;
        }
    }

}
