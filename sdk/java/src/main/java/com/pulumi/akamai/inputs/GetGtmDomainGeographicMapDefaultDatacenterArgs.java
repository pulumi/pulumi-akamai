// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetGtmDomainGeographicMapDefaultDatacenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGtmDomainGeographicMapDefaultDatacenterArgs Empty = new GetGtmDomainGeographicMapDefaultDatacenterArgs();

    /**
     * An identifier for all other geographic zones&#39; CNAME.
     * 
     */
    @Import(name="datacenterId", required=true)
    private Output<Integer> datacenterId;

    /**
     * @return An identifier for all other geographic zones&#39; CNAME.
     * 
     */
    public Output<Integer> datacenterId() {
        return this.datacenterId;
    }

    /**
     * A descriptive label for all other geographic zones.
     * 
     */
    @Import(name="nickname", required=true)
    private Output<String> nickname;

    /**
     * @return A descriptive label for all other geographic zones.
     * 
     */
    public Output<String> nickname() {
        return this.nickname;
    }

    private GetGtmDomainGeographicMapDefaultDatacenterArgs() {}

    private GetGtmDomainGeographicMapDefaultDatacenterArgs(GetGtmDomainGeographicMapDefaultDatacenterArgs $) {
        this.datacenterId = $.datacenterId;
        this.nickname = $.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDomainGeographicMapDefaultDatacenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDomainGeographicMapDefaultDatacenterArgs $;

        public Builder() {
            $ = new GetGtmDomainGeographicMapDefaultDatacenterArgs();
        }

        public Builder(GetGtmDomainGeographicMapDefaultDatacenterArgs defaults) {
            $ = new GetGtmDomainGeographicMapDefaultDatacenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datacenterId An identifier for all other geographic zones&#39; CNAME.
         * 
         * @return builder
         * 
         */
        public Builder datacenterId(Output<Integer> datacenterId) {
            $.datacenterId = datacenterId;
            return this;
        }

        /**
         * @param datacenterId An identifier for all other geographic zones&#39; CNAME.
         * 
         * @return builder
         * 
         */
        public Builder datacenterId(Integer datacenterId) {
            return datacenterId(Output.of(datacenterId));
        }

        /**
         * @param nickname A descriptive label for all other geographic zones.
         * 
         * @return builder
         * 
         */
        public Builder nickname(Output<String> nickname) {
            $.nickname = nickname;
            return this;
        }

        /**
         * @param nickname A descriptive label for all other geographic zones.
         * 
         * @return builder
         * 
         */
        public Builder nickname(String nickname) {
            return nickname(Output.of(nickname));
        }

        public GetGtmDomainGeographicMapDefaultDatacenterArgs build() {
            if ($.datacenterId == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainGeographicMapDefaultDatacenterArgs", "datacenterId");
            }
            if ($.nickname == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainGeographicMapDefaultDatacenterArgs", "nickname");
            }
            return $;
        }
    }

}
