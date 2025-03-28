// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth Empty = new GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth();

    /**
     * Specify client certificate attributes to include in the `Client-To-Edge` authentication header that&#39;s sent to your origin server.
     * 
     */
    @Import(name="clientCertificateAttributes")
    private @Nullable List<String> clientCertificateAttributes;

    /**
     * @return Specify client certificate attributes to include in the `Client-To-Edge` authentication header that&#39;s sent to your origin server.
     * 
     */
    public Optional<List<String>> clientCertificateAttributes() {
        return Optional.ofNullable(this.clientCertificateAttributes);
    }

    /**
     * Constructs the `Client-To-Edge` authentication header using information from the client to edge mTLS handshake and forwards it to your origin. You can configure your origin to acknowledge the header to enable transitive trust. Some form of the client x.509 certificate needs to be included in the header. You can include the full certificate or specific attributes.
     * 
     */
    @Import(name="enable")
    private @Nullable Boolean enable;

    /**
     * @return Constructs the `Client-To-Edge` authentication header using information from the client to edge mTLS handshake and forwards it to your origin. You can configure your origin to acknowledge the header to enable transitive trust. Some form of the client x.509 certificate needs to be included in the header. You can include the full certificate or specific attributes.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Whether to include the current validation status of the client certificate in the `Client-To-Edge` authentication header. This verifies the validation status of the certificate, regardless of the certificate attributes you&#39;re including in the header.
     * 
     */
    @Import(name="enableClientCertificateValidationStatus")
    private @Nullable Boolean enableClientCertificateValidationStatus;

    /**
     * @return Whether to include the current validation status of the client certificate in the `Client-To-Edge` authentication header. This verifies the validation status of the certificate, regardless of the certificate attributes you&#39;re including in the header.
     * 
     */
    public Optional<Boolean> enableClientCertificateValidationStatus() {
        return Optional.ofNullable(this.enableClientCertificateValidationStatus);
    }

    /**
     * Whether to include the complete client certificate in the header, in its binary (DER) format. DER-formatted certificates leave out the `BEGIN CERTIFICATE/END CERTIFICATE` statements and most often use the `.der` extension. Alternatively, you can specify individual `clientCertificateAttributes` you want included in the request.
     * 
     */
    @Import(name="enableCompleteClientCertificate")
    private @Nullable Boolean enableCompleteClientCertificate;

    /**
     * @return Whether to include the complete client certificate in the header, in its binary (DER) format. DER-formatted certificates leave out the `BEGIN CERTIFICATE/END CERTIFICATE` statements and most often use the `.der` extension. Alternatively, you can specify individual `clientCertificateAttributes` you want included in the request.
     * 
     */
    public Optional<Boolean> enableCompleteClientCertificate() {
        return Optional.ofNullable(this.enableCompleteClientCertificate);
    }

    /**
     * Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    @Import(name="locked")
    private @Nullable Boolean locked;

    /**
     * @return Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
     * 
     */
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * This option is for internal usage only.
     * 
     */
    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    /**
     * @return This option is for internal usage only.
     * 
     */
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    /**
     * A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    @Import(name="uuid")
    private @Nullable String uuid;

    /**
     * @return A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth() {}

    private GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth(GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth $) {
        this.clientCertificateAttributes = $.clientCertificateAttributes;
        this.enable = $.enable;
        this.enableClientCertificateValidationStatus = $.enableClientCertificateValidationStatus;
        this.enableCompleteClientCertificate = $.enableCompleteClientCertificate;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientCertificateAttributes Specify client certificate attributes to include in the `Client-To-Edge` authentication header that&#39;s sent to your origin server.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateAttributes(@Nullable List<String> clientCertificateAttributes) {
            $.clientCertificateAttributes = clientCertificateAttributes;
            return this;
        }

        /**
         * @param clientCertificateAttributes Specify client certificate attributes to include in the `Client-To-Edge` authentication header that&#39;s sent to your origin server.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateAttributes(String... clientCertificateAttributes) {
            return clientCertificateAttributes(List.of(clientCertificateAttributes));
        }

        /**
         * @param enable Constructs the `Client-To-Edge` authentication header using information from the client to edge mTLS handshake and forwards it to your origin. You can configure your origin to acknowledge the header to enable transitive trust. Some form of the client x.509 certificate needs to be included in the header. You can include the full certificate or specific attributes.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Boolean enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enableClientCertificateValidationStatus Whether to include the current validation status of the client certificate in the `Client-To-Edge` authentication header. This verifies the validation status of the certificate, regardless of the certificate attributes you&#39;re including in the header.
         * 
         * @return builder
         * 
         */
        public Builder enableClientCertificateValidationStatus(@Nullable Boolean enableClientCertificateValidationStatus) {
            $.enableClientCertificateValidationStatus = enableClientCertificateValidationStatus;
            return this;
        }

        /**
         * @param enableCompleteClientCertificate Whether to include the complete client certificate in the header, in its binary (DER) format. DER-formatted certificates leave out the `BEGIN CERTIFICATE/END CERTIFICATE` statements and most often use the `.der` extension. Alternatively, you can specify individual `clientCertificateAttributes` you want included in the request.
         * 
         * @return builder
         * 
         */
        public Builder enableCompleteClientCertificate(@Nullable Boolean enableCompleteClientCertificate) {
            $.enableCompleteClientCertificate = enableCompleteClientCertificate;
            return this;
        }

        /**
         * @param locked Indicates that your Akamai representative has locked this behavior or criteria so that you can&#39;t modify it. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param templateUuid This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        /**
         * @param uuid A uuid member indicates that at least one of its component behaviors or criteria is advanced and read-only. You need to preserve this uuid as well when modifying the rule tree. This option is for internal usage only.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230920BehaviorClientCertificateAuth build() {
            return $;
        }
    }

}
