// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DnsZoneTsigKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsZoneTsigKeyArgs Empty = new DnsZoneTsigKeyArgs();

    @Import(name="algorithm", required=true)
    private Output<String> algorithm;

    public Output<String> algorithm() {
        return this.algorithm;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="secret", required=true)
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }

    private DnsZoneTsigKeyArgs() {}

    private DnsZoneTsigKeyArgs(DnsZoneTsigKeyArgs $) {
        this.algorithm = $.algorithm;
        this.name = $.name;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsZoneTsigKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsZoneTsigKeyArgs $;

        public Builder() {
            $ = new DnsZoneTsigKeyArgs();
        }

        public Builder(DnsZoneTsigKeyArgs defaults) {
            $ = new DnsZoneTsigKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public DnsZoneTsigKeyArgs build() {
            if ($.algorithm == null) {
                throw new MissingRequiredPropertyException("DnsZoneTsigKeyArgs", "algorithm");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("DnsZoneTsigKeyArgs", "name");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("DnsZoneTsigKeyArgs", "secret");
            }
            return $;
        }
    }

}
