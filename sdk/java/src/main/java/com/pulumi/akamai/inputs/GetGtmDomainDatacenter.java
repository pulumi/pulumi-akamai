// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetGtmDomainDatacenterDefaultLoadObject;
import com.pulumi.akamai.inputs.GetGtmDomainDatacenterLink;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGtmDomainDatacenter extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmDomainDatacenter Empty = new GetGtmDomainDatacenter();

    /**
     * The name of the city where the data center is located.
     * 
     */
    @Import(name="city", required=true)
    private String city;

    /**
     * @return The name of the city where the data center is located.
     * 
     */
    public String city() {
        return this.city;
    }

    /**
     * Identifies the data center&#39;s ID of which this data center is a clone.
     * 
     */
    @Import(name="cloneOf", required=true)
    private Integer cloneOf;

    /**
     * @return Identifies the data center&#39;s ID of which this data center is a clone.
     * 
     */
    public Integer cloneOf() {
        return this.cloneOf;
    }

    /**
     * Balances load between two or more servers in a cloud environment.
     * 
     */
    @Import(name="cloudServerHostHeaderOverride", required=true)
    private Boolean cloudServerHostHeaderOverride;

    /**
     * @return Balances load between two or more servers in a cloud environment.
     * 
     */
    public Boolean cloudServerHostHeaderOverride() {
        return this.cloudServerHostHeaderOverride;
    }

    /**
     * Balances load between two or more servers in a cloud environment.
     * 
     */
    @Import(name="cloudServerTargeting", required=true)
    private Boolean cloudServerTargeting;

    /**
     * @return Balances load between two or more servers in a cloud environment.
     * 
     */
    public Boolean cloudServerTargeting() {
        return this.cloudServerTargeting;
    }

    /**
     * A two-letter code that specifies the continent where the data center maps to.
     * 
     */
    @Import(name="continent", required=true)
    private String continent;

    /**
     * @return A two-letter code that specifies the continent where the data center maps to.
     * 
     */
    public String continent() {
        return this.continent;
    }

    /**
     * A two-letter ISO 3166 country code that specifies the country where the data center is located.
     * 
     */
    @Import(name="country", required=true)
    private String country;

    /**
     * @return A two-letter ISO 3166 country code that specifies the country where the data center is located.
     * 
     */
    public String country() {
        return this.country;
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
     * Specifies the load reporting interface between you and the GTM system.
     * 
     */
    @Import(name="defaultLoadObjects")
    private @Nullable List<GetGtmDomainDatacenterDefaultLoadObject> defaultLoadObjects;

    /**
     * @return Specifies the load reporting interface between you and the GTM system.
     * 
     */
    public Optional<List<GetGtmDomainDatacenterDefaultLoadObject>> defaultLoadObjects() {
        return Optional.ofNullable(this.defaultLoadObjects);
    }

    /**
     * Specifies the geographic latitude of the data center&#39;s position.
     * 
     */
    @Import(name="latitude", required=true)
    private Double latitude;

    /**
     * @return Specifies the geographic latitude of the data center&#39;s position.
     * 
     */
    public Double latitude() {
        return this.latitude;
    }

    /**
     * Provides a URL path that allows direct navigation to a data center.
     * 
     */
    @Import(name="links")
    private @Nullable List<GetGtmDomainDatacenterLink> links;

    /**
     * @return Provides a URL path that allows direct navigation to a data center.
     * 
     */
    public Optional<List<GetGtmDomainDatacenterLink>> links() {
        return Optional.ofNullable(this.links);
    }

    /**
     * Specifies the geographic longitude of the data center&#39;s position.
     * 
     */
    @Import(name="longitude", required=true)
    private Double longitude;

    /**
     * @return Specifies the geographic longitude of the data center&#39;s position.
     * 
     */
    public Double longitude() {
        return this.longitude;
    }

    /**
     * A descriptive label for the datacenter.
     * 
     */
    @Import(name="nickname", required=true)
    private String nickname;

    /**
     * @return A descriptive label for the datacenter.
     * 
     */
    public String nickname() {
        return this.nickname;
    }

    /**
     * Influences the score for a datacenter.
     * 
     */
    @Import(name="scorePenalty", required=true)
    private Integer scorePenalty;

    /**
     * @return Influences the score for a datacenter.
     * 
     */
    public Integer scorePenalty() {
        return this.scorePenalty;
    }

    /**
     * The name of the pool from which servermonitors are drawn for liveness tests in this datacenter. If omitted (null), the domain-wide default is used. (If no domain-wide default is specified, the pool used is all servermonitors in the same continent as the datacenter.).
     * 
     */
    @Import(name="serverMonitorPool", required=true)
    private String serverMonitorPool;

    /**
     * @return The name of the pool from which servermonitors are drawn for liveness tests in this datacenter. If omitted (null), the domain-wide default is used. (If no domain-wide default is specified, the pool used is all servermonitors in the same continent as the datacenter.).
     * 
     */
    public String serverMonitorPool() {
        return this.serverMonitorPool;
    }

    /**
     * Specifies a two-letter ISO 3166 country code for the state of province, where the data center is located.
     * 
     */
    @Import(name="stateOrProvince", required=true)
    private String stateOrProvince;

    /**
     * @return Specifies a two-letter ISO 3166 country code for the state of province, where the data center is located.
     * 
     */
    public String stateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * Indicates whether or not the data center is virtual or physical.
     * 
     */
    @Import(name="virtual", required=true)
    private Boolean virtual;

    /**
     * @return Indicates whether or not the data center is virtual or physical.
     * 
     */
    public Boolean virtual() {
        return this.virtual;
    }

    private GetGtmDomainDatacenter() {}

    private GetGtmDomainDatacenter(GetGtmDomainDatacenter $) {
        this.city = $.city;
        this.cloneOf = $.cloneOf;
        this.cloudServerHostHeaderOverride = $.cloudServerHostHeaderOverride;
        this.cloudServerTargeting = $.cloudServerTargeting;
        this.continent = $.continent;
        this.country = $.country;
        this.datacenterId = $.datacenterId;
        this.defaultLoadObjects = $.defaultLoadObjects;
        this.latitude = $.latitude;
        this.links = $.links;
        this.longitude = $.longitude;
        this.nickname = $.nickname;
        this.scorePenalty = $.scorePenalty;
        this.serverMonitorPool = $.serverMonitorPool;
        this.stateOrProvince = $.stateOrProvince;
        this.virtual = $.virtual;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDomainDatacenter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDomainDatacenter $;

        public Builder() {
            $ = new GetGtmDomainDatacenter();
        }

        public Builder(GetGtmDomainDatacenter defaults) {
            $ = new GetGtmDomainDatacenter(Objects.requireNonNull(defaults));
        }

        /**
         * @param city The name of the city where the data center is located.
         * 
         * @return builder
         * 
         */
        public Builder city(String city) {
            $.city = city;
            return this;
        }

        /**
         * @param cloneOf Identifies the data center&#39;s ID of which this data center is a clone.
         * 
         * @return builder
         * 
         */
        public Builder cloneOf(Integer cloneOf) {
            $.cloneOf = cloneOf;
            return this;
        }

        /**
         * @param cloudServerHostHeaderOverride Balances load between two or more servers in a cloud environment.
         * 
         * @return builder
         * 
         */
        public Builder cloudServerHostHeaderOverride(Boolean cloudServerHostHeaderOverride) {
            $.cloudServerHostHeaderOverride = cloudServerHostHeaderOverride;
            return this;
        }

        /**
         * @param cloudServerTargeting Balances load between two or more servers in a cloud environment.
         * 
         * @return builder
         * 
         */
        public Builder cloudServerTargeting(Boolean cloudServerTargeting) {
            $.cloudServerTargeting = cloudServerTargeting;
            return this;
        }

        /**
         * @param continent A two-letter code that specifies the continent where the data center maps to.
         * 
         * @return builder
         * 
         */
        public Builder continent(String continent) {
            $.continent = continent;
            return this;
        }

        /**
         * @param country A two-letter ISO 3166 country code that specifies the country where the data center is located.
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            $.country = country;
            return this;
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
         * @param defaultLoadObjects Specifies the load reporting interface between you and the GTM system.
         * 
         * @return builder
         * 
         */
        public Builder defaultLoadObjects(@Nullable List<GetGtmDomainDatacenterDefaultLoadObject> defaultLoadObjects) {
            $.defaultLoadObjects = defaultLoadObjects;
            return this;
        }

        /**
         * @param defaultLoadObjects Specifies the load reporting interface between you and the GTM system.
         * 
         * @return builder
         * 
         */
        public Builder defaultLoadObjects(GetGtmDomainDatacenterDefaultLoadObject... defaultLoadObjects) {
            return defaultLoadObjects(List.of(defaultLoadObjects));
        }

        /**
         * @param latitude Specifies the geographic latitude of the data center&#39;s position.
         * 
         * @return builder
         * 
         */
        public Builder latitude(Double latitude) {
            $.latitude = latitude;
            return this;
        }

        /**
         * @param links Provides a URL path that allows direct navigation to a data center.
         * 
         * @return builder
         * 
         */
        public Builder links(@Nullable List<GetGtmDomainDatacenterLink> links) {
            $.links = links;
            return this;
        }

        /**
         * @param links Provides a URL path that allows direct navigation to a data center.
         * 
         * @return builder
         * 
         */
        public Builder links(GetGtmDomainDatacenterLink... links) {
            return links(List.of(links));
        }

        /**
         * @param longitude Specifies the geographic longitude of the data center&#39;s position.
         * 
         * @return builder
         * 
         */
        public Builder longitude(Double longitude) {
            $.longitude = longitude;
            return this;
        }

        /**
         * @param nickname A descriptive label for the datacenter.
         * 
         * @return builder
         * 
         */
        public Builder nickname(String nickname) {
            $.nickname = nickname;
            return this;
        }

        /**
         * @param scorePenalty Influences the score for a datacenter.
         * 
         * @return builder
         * 
         */
        public Builder scorePenalty(Integer scorePenalty) {
            $.scorePenalty = scorePenalty;
            return this;
        }

        /**
         * @param serverMonitorPool The name of the pool from which servermonitors are drawn for liveness tests in this datacenter. If omitted (null), the domain-wide default is used. (If no domain-wide default is specified, the pool used is all servermonitors in the same continent as the datacenter.).
         * 
         * @return builder
         * 
         */
        public Builder serverMonitorPool(String serverMonitorPool) {
            $.serverMonitorPool = serverMonitorPool;
            return this;
        }

        /**
         * @param stateOrProvince Specifies a two-letter ISO 3166 country code for the state of province, where the data center is located.
         * 
         * @return builder
         * 
         */
        public Builder stateOrProvince(String stateOrProvince) {
            $.stateOrProvince = stateOrProvince;
            return this;
        }

        /**
         * @param virtual Indicates whether or not the data center is virtual or physical.
         * 
         * @return builder
         * 
         */
        public Builder virtual(Boolean virtual) {
            $.virtual = virtual;
            return this;
        }

        public GetGtmDomainDatacenter build() {
            if ($.city == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "city");
            }
            if ($.cloneOf == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "cloneOf");
            }
            if ($.cloudServerHostHeaderOverride == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "cloudServerHostHeaderOverride");
            }
            if ($.cloudServerTargeting == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "cloudServerTargeting");
            }
            if ($.continent == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "continent");
            }
            if ($.country == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "country");
            }
            if ($.datacenterId == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "datacenterId");
            }
            if ($.latitude == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "latitude");
            }
            if ($.longitude == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "longitude");
            }
            if ($.nickname == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "nickname");
            }
            if ($.scorePenalty == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "scorePenalty");
            }
            if ($.serverMonitorPool == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "serverMonitorPool");
            }
            if ($.stateOrProvince == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "stateOrProvince");
            }
            if ($.virtual == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainDatacenter", "virtual");
            }
            return $;
        }
    }

}
