// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetIamCidrBlockArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIamCidrBlockArgs Empty = new GetIamCidrBlockArgs();

    @Import(name="cidrBlockId", required=true)
    private Output<Integer> cidrBlockId;

    public Output<Integer> cidrBlockId() {
        return this.cidrBlockId;
    }

    private GetIamCidrBlockArgs() {}

    private GetIamCidrBlockArgs(GetIamCidrBlockArgs $) {
        this.cidrBlockId = $.cidrBlockId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIamCidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIamCidrBlockArgs $;

        public Builder() {
            $ = new GetIamCidrBlockArgs();
        }

        public Builder(GetIamCidrBlockArgs defaults) {
            $ = new GetIamCidrBlockArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidrBlockId(Output<Integer> cidrBlockId) {
            $.cidrBlockId = cidrBlockId;
            return this;
        }

        public Builder cidrBlockId(Integer cidrBlockId) {
            return cidrBlockId(Output.of(cidrBlockId));
        }

        public GetIamCidrBlockArgs build() {
            if ($.cidrBlockId == null) {
                throw new MissingRequiredPropertyException("GetIamCidrBlockArgs", "cidrBlockId");
            }
            return $;
        }
    }

}
