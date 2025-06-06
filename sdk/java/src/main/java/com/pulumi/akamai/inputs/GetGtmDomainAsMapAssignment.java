// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetGtmDomainAsMapAssignment extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmDomainAsMapAssignment Empty = new GetGtmDomainAsMapAssignment();

    /**
     * Specifies an array of AS numbers.
     * 
     */
    @Import(name="asNumbers", required=true)
    private List<Integer> asNumbers;

    /**
     * @return Specifies an array of AS numbers.
     * 
     */
    public List<Integer> asNumbers() {
        return this.asNumbers;
    }

    /**
     * A unique identifier for an existing data center in the domain.
     * 
     */
    @Import(name="datacenterId", required=true)
    private Integer datacenterId;

    /**
     * @return A unique identifier for an existing data center in the domain.
     * 
     */
    public Integer datacenterId() {
        return this.datacenterId;
    }

    /**
     * A descriptive label for all other AS zones.
     * 
     */
    @Import(name="nickname", required=true)
    private String nickname;

    /**
     * @return A descriptive label for all other AS zones.
     * 
     */
    public String nickname() {
        return this.nickname;
    }

    private GetGtmDomainAsMapAssignment() {}

    private GetGtmDomainAsMapAssignment(GetGtmDomainAsMapAssignment $) {
        this.asNumbers = $.asNumbers;
        this.datacenterId = $.datacenterId;
        this.nickname = $.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDomainAsMapAssignment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDomainAsMapAssignment $;

        public Builder() {
            $ = new GetGtmDomainAsMapAssignment();
        }

        public Builder(GetGtmDomainAsMapAssignment defaults) {
            $ = new GetGtmDomainAsMapAssignment(Objects.requireNonNull(defaults));
        }

        /**
         * @param asNumbers Specifies an array of AS numbers.
         * 
         * @return builder
         * 
         */
        public Builder asNumbers(List<Integer> asNumbers) {
            $.asNumbers = asNumbers;
            return this;
        }

        /**
         * @param asNumbers Specifies an array of AS numbers.
         * 
         * @return builder
         * 
         */
        public Builder asNumbers(Integer... asNumbers) {
            return asNumbers(List.of(asNumbers));
        }

        /**
         * @param datacenterId A unique identifier for an existing data center in the domain.
         * 
         * @return builder
         * 
         */
        public Builder datacenterId(Integer datacenterId) {
            $.datacenterId = datacenterId;
            return this;
        }

        /**
         * @param nickname A descriptive label for all other AS zones.
         * 
         * @return builder
         * 
         */
        public Builder nickname(String nickname) {
            $.nickname = nickname;
            return this;
        }

        public GetGtmDomainAsMapAssignment build() {
            if ($.asNumbers == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainAsMapAssignment", "asNumbers");
            }
            if ($.datacenterId == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainAsMapAssignment", "datacenterId");
            }
            if ($.nickname == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainAsMapAssignment", "nickname");
            }
            return $;
        }
    }

}
