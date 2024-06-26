// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDnsRecordSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDnsRecordSetPlainArgs Empty = new GetDnsRecordSetPlainArgs();

    @Import(name="host", required=true)
    private String host;

    public String host() {
        return this.host;
    }

    @Import(name="recordType", required=true)
    private String recordType;

    public String recordType() {
        return this.recordType;
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetDnsRecordSetPlainArgs() {}

    private GetDnsRecordSetPlainArgs(GetDnsRecordSetPlainArgs $) {
        this.host = $.host;
        this.recordType = $.recordType;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDnsRecordSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDnsRecordSetPlainArgs $;

        public Builder() {
            $ = new GetDnsRecordSetPlainArgs();
        }

        public Builder(GetDnsRecordSetPlainArgs defaults) {
            $ = new GetDnsRecordSetPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(String host) {
            $.host = host;
            return this;
        }

        public Builder recordType(String recordType) {
            $.recordType = recordType;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetDnsRecordSetPlainArgs build() {
            if ($.host == null) {
                throw new MissingRequiredPropertyException("GetDnsRecordSetPlainArgs", "host");
            }
            if ($.recordType == null) {
                throw new MissingRequiredPropertyException("GetDnsRecordSetPlainArgs", "recordType");
            }
            if ($.zone == null) {
                throw new MissingRequiredPropertyException("GetDnsRecordSetPlainArgs", "zone");
            }
            return $;
        }
    }

}
