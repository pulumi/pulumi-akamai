// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergency;
import com.pulumi.akamai.outputs.PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTraffic;
import com.pulumi.akamai.outputs.PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone;
import com.pulumi.akamai.outputs.PropertyIncludeActivationComplianceRecordNoncomplianceReasonOther;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PropertyIncludeActivationComplianceRecord {
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `EMERGENCY`
     * 
     */
    private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergency noncomplianceReasonEmergency;
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `NO_PRODUCTION_TRAFFIC`
     * 
     */
    private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTraffic noncomplianceReasonNoProductionTraffic;
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `NONE`
     * 
     */
    private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone noncomplianceReasonNone;
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `OTHER`
     * 
     */
    private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonOther noncomplianceReasonOther;

    private PropertyIncludeActivationComplianceRecord() {}
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `EMERGENCY`
     * 
     */
    public Optional<PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergency> noncomplianceReasonEmergency() {
        return Optional.ofNullable(this.noncomplianceReasonEmergency);
    }
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `NO_PRODUCTION_TRAFFIC`
     * 
     */
    public Optional<PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTraffic> noncomplianceReasonNoProductionTraffic() {
        return Optional.ofNullable(this.noncomplianceReasonNoProductionTraffic);
    }
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `NONE`
     * 
     */
    public Optional<PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone> noncomplianceReasonNone() {
        return Optional.ofNullable(this.noncomplianceReasonNone);
    }
    /**
     * @return Provides an audit record when activating on a production network with noncompliance reason as `OTHER`
     * 
     */
    public Optional<PropertyIncludeActivationComplianceRecordNoncomplianceReasonOther> noncomplianceReasonOther() {
        return Optional.ofNullable(this.noncomplianceReasonOther);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertyIncludeActivationComplianceRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergency noncomplianceReasonEmergency;
        private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTraffic noncomplianceReasonNoProductionTraffic;
        private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone noncomplianceReasonNone;
        private @Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonOther noncomplianceReasonOther;
        public Builder() {}
        public Builder(PropertyIncludeActivationComplianceRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noncomplianceReasonEmergency = defaults.noncomplianceReasonEmergency;
    	      this.noncomplianceReasonNoProductionTraffic = defaults.noncomplianceReasonNoProductionTraffic;
    	      this.noncomplianceReasonNone = defaults.noncomplianceReasonNone;
    	      this.noncomplianceReasonOther = defaults.noncomplianceReasonOther;
        }

        @CustomType.Setter
        public Builder noncomplianceReasonEmergency(@Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonEmergency noncomplianceReasonEmergency) {

            this.noncomplianceReasonEmergency = noncomplianceReasonEmergency;
            return this;
        }
        @CustomType.Setter
        public Builder noncomplianceReasonNoProductionTraffic(@Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonNoProductionTraffic noncomplianceReasonNoProductionTraffic) {

            this.noncomplianceReasonNoProductionTraffic = noncomplianceReasonNoProductionTraffic;
            return this;
        }
        @CustomType.Setter
        public Builder noncomplianceReasonNone(@Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone noncomplianceReasonNone) {

            this.noncomplianceReasonNone = noncomplianceReasonNone;
            return this;
        }
        @CustomType.Setter
        public Builder noncomplianceReasonOther(@Nullable PropertyIncludeActivationComplianceRecordNoncomplianceReasonOther noncomplianceReasonOther) {

            this.noncomplianceReasonOther = noncomplianceReasonOther;
            return this;
        }
        public PropertyIncludeActivationComplianceRecord build() {
            final var _resultValue = new PropertyIncludeActivationComplianceRecord();
            _resultValue.noncomplianceReasonEmergency = noncomplianceReasonEmergency;
            _resultValue.noncomplianceReasonNoProductionTraffic = noncomplianceReasonNoProductionTraffic;
            _resultValue.noncomplianceReasonNone = noncomplianceReasonNone;
            _resultValue.noncomplianceReasonOther = noncomplianceReasonOther;
            return _resultValue;
        }
    }
}
