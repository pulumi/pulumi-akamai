// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetGtmResourceResourceInstance extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmResourceResourceInstance Empty = new GetGtmResourceResourceInstance();

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
     * Identifies the load object file used to report real-time information about the current load, maximum allowable load and target load on each resource.
     * 
     */
    @Import(name="loadObject", required=true)
    private String loadObject;

    /**
     * @return Identifies the load object file used to report real-time information about the current load, maximum allowable load and target load on each resource.
     * 
     */
    public String loadObject() {
        return this.loadObject;
    }

    /**
     * Specifies the TCP port of the loadObject.
     * 
     */
    @Import(name="loadObjectPort", required=true)
    private Integer loadObjectPort;

    /**
     * @return Specifies the TCP port of the loadObject.
     * 
     */
    public Integer loadObjectPort() {
        return this.loadObjectPort;
    }

    /**
     * Specifies the list of servers to requests the load object from.
     * 
     */
    @Import(name="loadServers", required=true)
    private List<String> loadServers;

    /**
     * @return Specifies the list of servers to requests the load object from.
     * 
     */
    public List<String> loadServers() {
        return this.loadServers;
    }

    /**
     * Whether to use default loadObject.
     * 
     */
    @Import(name="useDefaultLoadObject", required=true)
    private Boolean useDefaultLoadObject;

    /**
     * @return Whether to use default loadObject.
     * 
     */
    public Boolean useDefaultLoadObject() {
        return this.useDefaultLoadObject;
    }

    private GetGtmResourceResourceInstance() {}

    private GetGtmResourceResourceInstance(GetGtmResourceResourceInstance $) {
        this.datacenterId = $.datacenterId;
        this.loadObject = $.loadObject;
        this.loadObjectPort = $.loadObjectPort;
        this.loadServers = $.loadServers;
        this.useDefaultLoadObject = $.useDefaultLoadObject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmResourceResourceInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmResourceResourceInstance $;

        public Builder() {
            $ = new GetGtmResourceResourceInstance();
        }

        public Builder(GetGtmResourceResourceInstance defaults) {
            $ = new GetGtmResourceResourceInstance(Objects.requireNonNull(defaults));
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
         * @param loadObject Identifies the load object file used to report real-time information about the current load, maximum allowable load and target load on each resource.
         * 
         * @return builder
         * 
         */
        public Builder loadObject(String loadObject) {
            $.loadObject = loadObject;
            return this;
        }

        /**
         * @param loadObjectPort Specifies the TCP port of the loadObject.
         * 
         * @return builder
         * 
         */
        public Builder loadObjectPort(Integer loadObjectPort) {
            $.loadObjectPort = loadObjectPort;
            return this;
        }

        /**
         * @param loadServers Specifies the list of servers to requests the load object from.
         * 
         * @return builder
         * 
         */
        public Builder loadServers(List<String> loadServers) {
            $.loadServers = loadServers;
            return this;
        }

        /**
         * @param loadServers Specifies the list of servers to requests the load object from.
         * 
         * @return builder
         * 
         */
        public Builder loadServers(String... loadServers) {
            return loadServers(List.of(loadServers));
        }

        /**
         * @param useDefaultLoadObject Whether to use default loadObject.
         * 
         * @return builder
         * 
         */
        public Builder useDefaultLoadObject(Boolean useDefaultLoadObject) {
            $.useDefaultLoadObject = useDefaultLoadObject;
            return this;
        }

        public GetGtmResourceResourceInstance build() {
            if ($.datacenterId == null) {
                throw new MissingRequiredPropertyException("GetGtmResourceResourceInstance", "datacenterId");
            }
            if ($.loadObject == null) {
                throw new MissingRequiredPropertyException("GetGtmResourceResourceInstance", "loadObject");
            }
            if ($.loadObjectPort == null) {
                throw new MissingRequiredPropertyException("GetGtmResourceResourceInstance", "loadObjectPort");
            }
            if ($.loadServers == null) {
                throw new MissingRequiredPropertyException("GetGtmResourceResourceInstance", "loadServers");
            }
            if ($.useDefaultLoadObject == null) {
                throw new MissingRequiredPropertyException("GetGtmResourceResourceInstance", "useDefaultLoadObject");
            }
            return $;
        }
    }

}
