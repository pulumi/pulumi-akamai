// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetDatastreamsStreamsDetailProperty;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatastreamsStreamsDetail {
    /**
     * @return Identifies the contract that the stream is associated with.
     * 
     */
    private String contractId;
    /**
     * @return The username who created the stream.
     * 
     */
    private String createdBy;
    /**
     * @return The date and time when the stream was created.
     * 
     */
    private String createdDate;
    /**
     * @return Identifies the group where the stream is created.
     * 
     */
    private Integer groupId;
    /**
     * @return Identifies the latestVersion version of the stream.
     * 
     */
    private Integer latestVersion;
    /**
     * @return The username who activated or deactivated the stream
     * 
     */
    private String modifiedBy;
    /**
     * @return The date and time when activation status was modified
     * 
     */
    private String modifiedDate;
    /**
     * @return The productId.
     * 
     */
    private String productId;
    /**
     * @return List of properties associated with the stream.
     * 
     */
    private List<GetDatastreamsStreamsDetailProperty> properties;
    /**
     * @return Identifies the stream.
     * 
     */
    private Integer streamId;
    /**
     * @return The name of the stream.
     * 
     */
    private String streamName;
    /**
     * @return The activation status of the stream.
     * 
     */
    private String streamStatus;
    /**
     * @return Identifies the current version of the stream.
     * 
     */
    private Integer streamVersion;

    private GetDatastreamsStreamsDetail() {}
    /**
     * @return Identifies the contract that the stream is associated with.
     * 
     */
    public String contractId() {
        return this.contractId;
    }
    /**
     * @return The username who created the stream.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The date and time when the stream was created.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return Identifies the group where the stream is created.
     * 
     */
    public Integer groupId() {
        return this.groupId;
    }
    /**
     * @return Identifies the latestVersion version of the stream.
     * 
     */
    public Integer latestVersion() {
        return this.latestVersion;
    }
    /**
     * @return The username who activated or deactivated the stream
     * 
     */
    public String modifiedBy() {
        return this.modifiedBy;
    }
    /**
     * @return The date and time when activation status was modified
     * 
     */
    public String modifiedDate() {
        return this.modifiedDate;
    }
    /**
     * @return The productId.
     * 
     */
    public String productId() {
        return this.productId;
    }
    /**
     * @return List of properties associated with the stream.
     * 
     */
    public List<GetDatastreamsStreamsDetailProperty> properties() {
        return this.properties;
    }
    /**
     * @return Identifies the stream.
     * 
     */
    public Integer streamId() {
        return this.streamId;
    }
    /**
     * @return The name of the stream.
     * 
     */
    public String streamName() {
        return this.streamName;
    }
    /**
     * @return The activation status of the stream.
     * 
     */
    public String streamStatus() {
        return this.streamStatus;
    }
    /**
     * @return Identifies the current version of the stream.
     * 
     */
    public Integer streamVersion() {
        return this.streamVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastreamsStreamsDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String createdBy;
        private String createdDate;
        private Integer groupId;
        private Integer latestVersion;
        private String modifiedBy;
        private String modifiedDate;
        private String productId;
        private List<GetDatastreamsStreamsDetailProperty> properties;
        private Integer streamId;
        private String streamName;
        private String streamStatus;
        private Integer streamVersion;
        public Builder() {}
        public Builder(GetDatastreamsStreamsDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.createdBy = defaults.createdBy;
    	      this.createdDate = defaults.createdDate;
    	      this.groupId = defaults.groupId;
    	      this.latestVersion = defaults.latestVersion;
    	      this.modifiedBy = defaults.modifiedBy;
    	      this.modifiedDate = defaults.modifiedDate;
    	      this.productId = defaults.productId;
    	      this.properties = defaults.properties;
    	      this.streamId = defaults.streamId;
    	      this.streamName = defaults.streamName;
    	      this.streamStatus = defaults.streamStatus;
    	      this.streamVersion = defaults.streamVersion;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            if (contractId == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "contractId");
            }
            this.contractId = contractId;
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            if (createdBy == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            if (createdDate == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "createdDate");
            }
            this.createdDate = createdDate;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(Integer groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder latestVersion(Integer latestVersion) {
            if (latestVersion == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "latestVersion");
            }
            this.latestVersion = latestVersion;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedBy(String modifiedBy) {
            if (modifiedBy == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "modifiedBy");
            }
            this.modifiedBy = modifiedBy;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedDate(String modifiedDate) {
            if (modifiedDate == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "modifiedDate");
            }
            this.modifiedDate = modifiedDate;
            return this;
        }
        @CustomType.Setter
        public Builder productId(String productId) {
            if (productId == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "productId");
            }
            this.productId = productId;
            return this;
        }
        @CustomType.Setter
        public Builder properties(List<GetDatastreamsStreamsDetailProperty> properties) {
            if (properties == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "properties");
            }
            this.properties = properties;
            return this;
        }
        public Builder properties(GetDatastreamsStreamsDetailProperty... properties) {
            return properties(List.of(properties));
        }
        @CustomType.Setter
        public Builder streamId(Integer streamId) {
            if (streamId == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "streamId");
            }
            this.streamId = streamId;
            return this;
        }
        @CustomType.Setter
        public Builder streamName(String streamName) {
            if (streamName == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "streamName");
            }
            this.streamName = streamName;
            return this;
        }
        @CustomType.Setter
        public Builder streamStatus(String streamStatus) {
            if (streamStatus == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "streamStatus");
            }
            this.streamStatus = streamStatus;
            return this;
        }
        @CustomType.Setter
        public Builder streamVersion(Integer streamVersion) {
            if (streamVersion == null) {
              throw new MissingRequiredPropertyException("GetDatastreamsStreamsDetail", "streamVersion");
            }
            this.streamVersion = streamVersion;
            return this;
        }
        public GetDatastreamsStreamsDetail build() {
            final var _resultValue = new GetDatastreamsStreamsDetail();
            _resultValue.contractId = contractId;
            _resultValue.createdBy = createdBy;
            _resultValue.createdDate = createdDate;
            _resultValue.groupId = groupId;
            _resultValue.latestVersion = latestVersion;
            _resultValue.modifiedBy = modifiedBy;
            _resultValue.modifiedDate = modifiedDate;
            _resultValue.productId = productId;
            _resultValue.properties = properties;
            _resultValue.streamId = streamId;
            _resultValue.streamName = streamName;
            _resultValue.streamStatus = streamStatus;
            _resultValue.streamVersion = streamVersion;
            return _resultValue;
        }
    }
}
