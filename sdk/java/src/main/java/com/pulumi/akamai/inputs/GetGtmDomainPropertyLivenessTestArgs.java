// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetGtmDomainPropertyLivenessTestHttpHeaderArgs;
import com.pulumi.core.Output;
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


public final class GetGtmDomainPropertyLivenessTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGtmDomainPropertyLivenessTestArgs Empty = new GetGtmDomainPropertyLivenessTestArgs();

    /**
     * List of alternate trust anchors (CA certificates)
     * 
     */
    @Import(name="alternateCaCertificates", required=true)
    private Output<List<String>> alternateCaCertificates;

    /**
     * @return List of alternate trust anchors (CA certificates)
     * 
     */
    public Output<List<String>> alternateCaCertificates() {
        return this.alternateCaCertificates;
    }

    /**
     * If testObjectProtocol is DNS, DOH or DOT, requires an answer to the DNS query to be considered a success.
     * 
     */
    @Import(name="answersRequired", required=true)
    private Output<Boolean> answersRequired;

    /**
     * @return If testObjectProtocol is DNS, DOH or DOT, requires an answer to the DNS query to be considered a success.
     * 
     */
    public Output<Boolean> answersRequired() {
        return this.answersRequired;
    }

    /**
     * Disables warnings when non-standard ports are used.
     * 
     */
    @Import(name="disableNonstandardPortWarning", required=true)
    private Output<Boolean> disableNonstandardPortWarning;

    /**
     * @return Disables warnings when non-standard ports are used.
     * 
     */
    public Output<Boolean> disableNonstandardPortWarning() {
        return this.disableNonstandardPortWarning;
    }

    /**
     * Disables the liveness test.
     * 
     */
    @Import(name="disabled", required=true)
    private Output<Boolean> disabled;

    /**
     * @return Disables the liveness test.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }

    /**
     * Specifies the score that&#39;s reported if the liveness test encounters an error other than timeout, such as connection refused, and 404.
     * 
     */
    @Import(name="errorPenalty", required=true)
    private Output<Double> errorPenalty;

    /**
     * @return Specifies the score that&#39;s reported if the liveness test encounters an error other than timeout, such as connection refused, and 404.
     * 
     */
    public Output<Double> errorPenalty() {
        return this.errorPenalty;
    }

    /**
     * Treats a 3xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
     * 
     */
    @Import(name="httpError3xx", required=true)
    private Output<Boolean> httpError3xx;

    /**
     * @return Treats a 3xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
     * 
     */
    public Output<Boolean> httpError3xx() {
        return this.httpError3xx;
    }

    /**
     * Treats a 4xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
     * 
     */
    @Import(name="httpError4xx", required=true)
    private Output<Boolean> httpError4xx;

    /**
     * @return Treats a 4xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
     * 
     */
    public Output<Boolean> httpError4xx() {
        return this.httpError4xx;
    }

    /**
     * Treats a 5xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
     * 
     */
    @Import(name="httpError5xx", required=true)
    private Output<Boolean> httpError5xx;

    /**
     * @return Treats a 5xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
     * 
     */
    public Output<Boolean> httpError5xx() {
        return this.httpError5xx;
    }

    /**
     * List of HTTP headers for the liveness test.
     * 
     */
    @Import(name="httpHeaders")
    private @Nullable Output<List<GetGtmDomainPropertyLivenessTestHttpHeaderArgs>> httpHeaders;

    /**
     * @return List of HTTP headers for the liveness test.
     * 
     */
    public Optional<Output<List<GetGtmDomainPropertyLivenessTestHttpHeaderArgs>>> httpHeaders() {
        return Optional.ofNullable(this.httpHeaders);
    }

    /**
     * Contains HTTP method to send if the `testObjectProtocol` is `http` or `https`. Supported values are `TRACE`, `HEAD`, `OPTIONS`, `GET`, `PUT`, `POST`, `PATCH`, `DELETE`. When omitted or `null`, this value defaults to `GET`.
     * 
     */
    @Import(name="httpMethod", required=true)
    private Output<String> httpMethod;

    /**
     * @return Contains HTTP method to send if the `testObjectProtocol` is `http` or `https`. Supported values are `TRACE`, `HEAD`, `OPTIONS`, `GET`, `PUT`, `POST`, `PATCH`, `DELETE`. When omitted or `null`, this value defaults to `GET`.
     * 
     */
    public Output<String> httpMethod() {
        return this.httpMethod;
    }

    /**
     * Contains Base64-encoded HTTP request body to send if the `testObjectProtocol` is `http` or `https`. When omitted or `null`, omits the request body from the request.
     * 
     */
    @Import(name="httpRequestBody", required=true)
    private Output<String> httpRequestBody;

    /**
     * @return Contains Base64-encoded HTTP request body to send if the `testObjectProtocol` is `http` or `https`. When omitted or `null`, omits the request body from the request.
     * 
     */
    public Output<String> httpRequestBody() {
        return this.httpRequestBody;
    }

    /**
     * A descriptive name for the liveness test.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A descriptive name for the liveness test.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Validates the origin certificate. Applies only to tests with testObjectProtocol of https.
     * 
     */
    @Import(name="peerCertificateVerification", required=true)
    private Output<Boolean> peerCertificateVerification;

    /**
     * @return Validates the origin certificate. Applies only to tests with testObjectProtocol of https.
     * 
     */
    public Output<Boolean> peerCertificateVerification() {
        return this.peerCertificateVerification;
    }

    /**
     * Whether to enable backwards compatibility for liveness endpoints that use older TLS protocols
     * 
     */
    @Import(name="pre2023SecurityPosture", required=true)
    private Output<Boolean> pre2023SecurityPosture;

    /**
     * @return Whether to enable backwards compatibility for liveness endpoints that use older TLS protocols
     * 
     */
    public Output<Boolean> pre2023SecurityPosture() {
        return this.pre2023SecurityPosture;
    }

    /**
     * Indicates that if testObjectProtocol is DNS, DOH or DOT, the DNS query is recursive.
     * 
     */
    @Import(name="recursionRequested", required=true)
    private Output<Boolean> recursionRequested;

    /**
     * @return Indicates that if testObjectProtocol is DNS, DOH or DOT, the DNS query is recursive.
     * 
     */
    public Output<Boolean> recursionRequested() {
        return this.recursionRequested;
    }

    /**
     * Specifies a request string.
     * 
     */
    @Import(name="requestString", required=true)
    private Output<String> requestString;

    /**
     * @return Specifies a request string.
     * 
     */
    public Output<String> requestString() {
        return this.requestString;
    }

    /**
     * Specifies the query type, if testObjectProtocol is DNS.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return Specifies the query type, if testObjectProtocol is DNS.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * Specifies a response string.
     * 
     */
    @Import(name="responseString", required=true)
    private Output<String> responseString;

    /**
     * @return Specifies a response string.
     * 
     */
    public Output<String> responseString() {
        return this.responseString;
    }

    /**
     * Indicates a base64-encoded certificate.
     * 
     */
    @Import(name="sslClientCertificate", required=true)
    private Output<String> sslClientCertificate;

    /**
     * @return Indicates a base64-encoded certificate.
     * 
     */
    public Output<String> sslClientCertificate() {
        return this.sslClientCertificate;
    }

    /**
     * Indicates a base64-encoded private key.
     * 
     */
    @Import(name="sslClientPrivateKey", required=true)
    private Output<String> sslClientPrivateKey;

    /**
     * @return Indicates a base64-encoded private key.
     * 
     */
    public Output<String> sslClientPrivateKey() {
        return this.sslClientPrivateKey;
    }

    /**
     * Indicates the interval at which the liveness test is run, in seconds.
     * 
     */
    @Import(name="testInterval", required=true)
    private Output<Integer> testInterval;

    /**
     * @return Indicates the interval at which the liveness test is run, in seconds.
     * 
     */
    public Output<Integer> testInterval() {
        return this.testInterval;
    }

    /**
     * Specifies the static text that acts as a stand-in for the data that you&#39;re sending on the network.
     * 
     */
    @Import(name="testObject", required=true)
    private Output<String> testObject;

    /**
     * @return Specifies the static text that acts as a stand-in for the data that you&#39;re sending on the network.
     * 
     */
    public Output<String> testObject() {
        return this.testObject;
    }

    /**
     * Specifies the test object&#39;s password.
     * 
     */
    @Import(name="testObjectPassword", required=true)
    private Output<String> testObjectPassword;

    /**
     * @return Specifies the test object&#39;s password.
     * 
     */
    public Output<String> testObjectPassword() {
        return this.testObjectPassword;
    }

    /**
     * Specifies the port number for the testObject.
     * 
     */
    @Import(name="testObjectPort", required=true)
    private Output<Integer> testObjectPort;

    /**
     * @return Specifies the port number for the testObject.
     * 
     */
    public Output<Integer> testObjectPort() {
        return this.testObjectPort;
    }

    /**
     * Specifies the test protocol.
     * 
     */
    @Import(name="testObjectProtocol", required=true)
    private Output<String> testObjectProtocol;

    /**
     * @return Specifies the test protocol.
     * 
     */
    public Output<String> testObjectProtocol() {
        return this.testObjectProtocol;
    }

    /**
     * A descriptive name for the testObject.
     * 
     */
    @Import(name="testObjectUsername", required=true)
    private Output<String> testObjectUsername;

    /**
     * @return A descriptive name for the testObject.
     * 
     */
    public Output<String> testObjectUsername() {
        return this.testObjectUsername;
    }

    /**
     * Specifies the duration of the liveness test before it fails.
     * 
     */
    @Import(name="testTimeout", required=true)
    private Output<Double> testTimeout;

    /**
     * @return Specifies the duration of the liveness test before it fails.
     * 
     */
    public Output<Double> testTimeout() {
        return this.testTimeout;
    }

    /**
     * Specifies the timeout penalty score.
     * 
     */
    @Import(name="timeoutPenalty", required=true)
    private Output<Double> timeoutPenalty;

    /**
     * @return Specifies the timeout penalty score.
     * 
     */
    public Output<Double> timeoutPenalty() {
        return this.timeoutPenalty;
    }

    private GetGtmDomainPropertyLivenessTestArgs() {}

    private GetGtmDomainPropertyLivenessTestArgs(GetGtmDomainPropertyLivenessTestArgs $) {
        this.alternateCaCertificates = $.alternateCaCertificates;
        this.answersRequired = $.answersRequired;
        this.disableNonstandardPortWarning = $.disableNonstandardPortWarning;
        this.disabled = $.disabled;
        this.errorPenalty = $.errorPenalty;
        this.httpError3xx = $.httpError3xx;
        this.httpError4xx = $.httpError4xx;
        this.httpError5xx = $.httpError5xx;
        this.httpHeaders = $.httpHeaders;
        this.httpMethod = $.httpMethod;
        this.httpRequestBody = $.httpRequestBody;
        this.name = $.name;
        this.peerCertificateVerification = $.peerCertificateVerification;
        this.pre2023SecurityPosture = $.pre2023SecurityPosture;
        this.recursionRequested = $.recursionRequested;
        this.requestString = $.requestString;
        this.resourceType = $.resourceType;
        this.responseString = $.responseString;
        this.sslClientCertificate = $.sslClientCertificate;
        this.sslClientPrivateKey = $.sslClientPrivateKey;
        this.testInterval = $.testInterval;
        this.testObject = $.testObject;
        this.testObjectPassword = $.testObjectPassword;
        this.testObjectPort = $.testObjectPort;
        this.testObjectProtocol = $.testObjectProtocol;
        this.testObjectUsername = $.testObjectUsername;
        this.testTimeout = $.testTimeout;
        this.timeoutPenalty = $.timeoutPenalty;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmDomainPropertyLivenessTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmDomainPropertyLivenessTestArgs $;

        public Builder() {
            $ = new GetGtmDomainPropertyLivenessTestArgs();
        }

        public Builder(GetGtmDomainPropertyLivenessTestArgs defaults) {
            $ = new GetGtmDomainPropertyLivenessTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternateCaCertificates List of alternate trust anchors (CA certificates)
         * 
         * @return builder
         * 
         */
        public Builder alternateCaCertificates(Output<List<String>> alternateCaCertificates) {
            $.alternateCaCertificates = alternateCaCertificates;
            return this;
        }

        /**
         * @param alternateCaCertificates List of alternate trust anchors (CA certificates)
         * 
         * @return builder
         * 
         */
        public Builder alternateCaCertificates(List<String> alternateCaCertificates) {
            return alternateCaCertificates(Output.of(alternateCaCertificates));
        }

        /**
         * @param alternateCaCertificates List of alternate trust anchors (CA certificates)
         * 
         * @return builder
         * 
         */
        public Builder alternateCaCertificates(String... alternateCaCertificates) {
            return alternateCaCertificates(List.of(alternateCaCertificates));
        }

        /**
         * @param answersRequired If testObjectProtocol is DNS, DOH or DOT, requires an answer to the DNS query to be considered a success.
         * 
         * @return builder
         * 
         */
        public Builder answersRequired(Output<Boolean> answersRequired) {
            $.answersRequired = answersRequired;
            return this;
        }

        /**
         * @param answersRequired If testObjectProtocol is DNS, DOH or DOT, requires an answer to the DNS query to be considered a success.
         * 
         * @return builder
         * 
         */
        public Builder answersRequired(Boolean answersRequired) {
            return answersRequired(Output.of(answersRequired));
        }

        /**
         * @param disableNonstandardPortWarning Disables warnings when non-standard ports are used.
         * 
         * @return builder
         * 
         */
        public Builder disableNonstandardPortWarning(Output<Boolean> disableNonstandardPortWarning) {
            $.disableNonstandardPortWarning = disableNonstandardPortWarning;
            return this;
        }

        /**
         * @param disableNonstandardPortWarning Disables warnings when non-standard ports are used.
         * 
         * @return builder
         * 
         */
        public Builder disableNonstandardPortWarning(Boolean disableNonstandardPortWarning) {
            return disableNonstandardPortWarning(Output.of(disableNonstandardPortWarning));
        }

        /**
         * @param disabled Disables the liveness test.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Disables the liveness test.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param errorPenalty Specifies the score that&#39;s reported if the liveness test encounters an error other than timeout, such as connection refused, and 404.
         * 
         * @return builder
         * 
         */
        public Builder errorPenalty(Output<Double> errorPenalty) {
            $.errorPenalty = errorPenalty;
            return this;
        }

        /**
         * @param errorPenalty Specifies the score that&#39;s reported if the liveness test encounters an error other than timeout, such as connection refused, and 404.
         * 
         * @return builder
         * 
         */
        public Builder errorPenalty(Double errorPenalty) {
            return errorPenalty(Output.of(errorPenalty));
        }

        /**
         * @param httpError3xx Treats a 3xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
         * 
         * @return builder
         * 
         */
        public Builder httpError3xx(Output<Boolean> httpError3xx) {
            $.httpError3xx = httpError3xx;
            return this;
        }

        /**
         * @param httpError3xx Treats a 3xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
         * 
         * @return builder
         * 
         */
        public Builder httpError3xx(Boolean httpError3xx) {
            return httpError3xx(Output.of(httpError3xx));
        }

        /**
         * @param httpError4xx Treats a 4xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
         * 
         * @return builder
         * 
         */
        public Builder httpError4xx(Output<Boolean> httpError4xx) {
            $.httpError4xx = httpError4xx;
            return this;
        }

        /**
         * @param httpError4xx Treats a 4xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
         * 
         * @return builder
         * 
         */
        public Builder httpError4xx(Boolean httpError4xx) {
            return httpError4xx(Output.of(httpError4xx));
        }

        /**
         * @param httpError5xx Treats a 5xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
         * 
         * @return builder
         * 
         */
        public Builder httpError5xx(Output<Boolean> httpError5xx) {
            $.httpError5xx = httpError5xx;
            return this;
        }

        /**
         * @param httpError5xx Treats a 5xx HTTP response as a failure if the testObjectProtocol is http, https or ftp.
         * 
         * @return builder
         * 
         */
        public Builder httpError5xx(Boolean httpError5xx) {
            return httpError5xx(Output.of(httpError5xx));
        }

        /**
         * @param httpHeaders List of HTTP headers for the liveness test.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaders(@Nullable Output<List<GetGtmDomainPropertyLivenessTestHttpHeaderArgs>> httpHeaders) {
            $.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * @param httpHeaders List of HTTP headers for the liveness test.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaders(List<GetGtmDomainPropertyLivenessTestHttpHeaderArgs> httpHeaders) {
            return httpHeaders(Output.of(httpHeaders));
        }

        /**
         * @param httpHeaders List of HTTP headers for the liveness test.
         * 
         * @return builder
         * 
         */
        public Builder httpHeaders(GetGtmDomainPropertyLivenessTestHttpHeaderArgs... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }

        /**
         * @param httpMethod Contains HTTP method to send if the `testObjectProtocol` is `http` or `https`. Supported values are `TRACE`, `HEAD`, `OPTIONS`, `GET`, `PUT`, `POST`, `PATCH`, `DELETE`. When omitted or `null`, this value defaults to `GET`.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod Contains HTTP method to send if the `testObjectProtocol` is `http` or `https`. Supported values are `TRACE`, `HEAD`, `OPTIONS`, `GET`, `PUT`, `POST`, `PATCH`, `DELETE`. When omitted or `null`, this value defaults to `GET`.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param httpRequestBody Contains Base64-encoded HTTP request body to send if the `testObjectProtocol` is `http` or `https`. When omitted or `null`, omits the request body from the request.
         * 
         * @return builder
         * 
         */
        public Builder httpRequestBody(Output<String> httpRequestBody) {
            $.httpRequestBody = httpRequestBody;
            return this;
        }

        /**
         * @param httpRequestBody Contains Base64-encoded HTTP request body to send if the `testObjectProtocol` is `http` or `https`. When omitted or `null`, omits the request body from the request.
         * 
         * @return builder
         * 
         */
        public Builder httpRequestBody(String httpRequestBody) {
            return httpRequestBody(Output.of(httpRequestBody));
        }

        /**
         * @param name A descriptive name for the liveness test.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A descriptive name for the liveness test.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peerCertificateVerification Validates the origin certificate. Applies only to tests with testObjectProtocol of https.
         * 
         * @return builder
         * 
         */
        public Builder peerCertificateVerification(Output<Boolean> peerCertificateVerification) {
            $.peerCertificateVerification = peerCertificateVerification;
            return this;
        }

        /**
         * @param peerCertificateVerification Validates the origin certificate. Applies only to tests with testObjectProtocol of https.
         * 
         * @return builder
         * 
         */
        public Builder peerCertificateVerification(Boolean peerCertificateVerification) {
            return peerCertificateVerification(Output.of(peerCertificateVerification));
        }

        /**
         * @param pre2023SecurityPosture Whether to enable backwards compatibility for liveness endpoints that use older TLS protocols
         * 
         * @return builder
         * 
         */
        public Builder pre2023SecurityPosture(Output<Boolean> pre2023SecurityPosture) {
            $.pre2023SecurityPosture = pre2023SecurityPosture;
            return this;
        }

        /**
         * @param pre2023SecurityPosture Whether to enable backwards compatibility for liveness endpoints that use older TLS protocols
         * 
         * @return builder
         * 
         */
        public Builder pre2023SecurityPosture(Boolean pre2023SecurityPosture) {
            return pre2023SecurityPosture(Output.of(pre2023SecurityPosture));
        }

        /**
         * @param recursionRequested Indicates that if testObjectProtocol is DNS, DOH or DOT, the DNS query is recursive.
         * 
         * @return builder
         * 
         */
        public Builder recursionRequested(Output<Boolean> recursionRequested) {
            $.recursionRequested = recursionRequested;
            return this;
        }

        /**
         * @param recursionRequested Indicates that if testObjectProtocol is DNS, DOH or DOT, the DNS query is recursive.
         * 
         * @return builder
         * 
         */
        public Builder recursionRequested(Boolean recursionRequested) {
            return recursionRequested(Output.of(recursionRequested));
        }

        /**
         * @param requestString Specifies a request string.
         * 
         * @return builder
         * 
         */
        public Builder requestString(Output<String> requestString) {
            $.requestString = requestString;
            return this;
        }

        /**
         * @param requestString Specifies a request string.
         * 
         * @return builder
         * 
         */
        public Builder requestString(String requestString) {
            return requestString(Output.of(requestString));
        }

        /**
         * @param resourceType Specifies the query type, if testObjectProtocol is DNS.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Specifies the query type, if testObjectProtocol is DNS.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param responseString Specifies a response string.
         * 
         * @return builder
         * 
         */
        public Builder responseString(Output<String> responseString) {
            $.responseString = responseString;
            return this;
        }

        /**
         * @param responseString Specifies a response string.
         * 
         * @return builder
         * 
         */
        public Builder responseString(String responseString) {
            return responseString(Output.of(responseString));
        }

        /**
         * @param sslClientCertificate Indicates a base64-encoded certificate.
         * 
         * @return builder
         * 
         */
        public Builder sslClientCertificate(Output<String> sslClientCertificate) {
            $.sslClientCertificate = sslClientCertificate;
            return this;
        }

        /**
         * @param sslClientCertificate Indicates a base64-encoded certificate.
         * 
         * @return builder
         * 
         */
        public Builder sslClientCertificate(String sslClientCertificate) {
            return sslClientCertificate(Output.of(sslClientCertificate));
        }

        /**
         * @param sslClientPrivateKey Indicates a base64-encoded private key.
         * 
         * @return builder
         * 
         */
        public Builder sslClientPrivateKey(Output<String> sslClientPrivateKey) {
            $.sslClientPrivateKey = sslClientPrivateKey;
            return this;
        }

        /**
         * @param sslClientPrivateKey Indicates a base64-encoded private key.
         * 
         * @return builder
         * 
         */
        public Builder sslClientPrivateKey(String sslClientPrivateKey) {
            return sslClientPrivateKey(Output.of(sslClientPrivateKey));
        }

        /**
         * @param testInterval Indicates the interval at which the liveness test is run, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder testInterval(Output<Integer> testInterval) {
            $.testInterval = testInterval;
            return this;
        }

        /**
         * @param testInterval Indicates the interval at which the liveness test is run, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder testInterval(Integer testInterval) {
            return testInterval(Output.of(testInterval));
        }

        /**
         * @param testObject Specifies the static text that acts as a stand-in for the data that you&#39;re sending on the network.
         * 
         * @return builder
         * 
         */
        public Builder testObject(Output<String> testObject) {
            $.testObject = testObject;
            return this;
        }

        /**
         * @param testObject Specifies the static text that acts as a stand-in for the data that you&#39;re sending on the network.
         * 
         * @return builder
         * 
         */
        public Builder testObject(String testObject) {
            return testObject(Output.of(testObject));
        }

        /**
         * @param testObjectPassword Specifies the test object&#39;s password.
         * 
         * @return builder
         * 
         */
        public Builder testObjectPassword(Output<String> testObjectPassword) {
            $.testObjectPassword = testObjectPassword;
            return this;
        }

        /**
         * @param testObjectPassword Specifies the test object&#39;s password.
         * 
         * @return builder
         * 
         */
        public Builder testObjectPassword(String testObjectPassword) {
            return testObjectPassword(Output.of(testObjectPassword));
        }

        /**
         * @param testObjectPort Specifies the port number for the testObject.
         * 
         * @return builder
         * 
         */
        public Builder testObjectPort(Output<Integer> testObjectPort) {
            $.testObjectPort = testObjectPort;
            return this;
        }

        /**
         * @param testObjectPort Specifies the port number for the testObject.
         * 
         * @return builder
         * 
         */
        public Builder testObjectPort(Integer testObjectPort) {
            return testObjectPort(Output.of(testObjectPort));
        }

        /**
         * @param testObjectProtocol Specifies the test protocol.
         * 
         * @return builder
         * 
         */
        public Builder testObjectProtocol(Output<String> testObjectProtocol) {
            $.testObjectProtocol = testObjectProtocol;
            return this;
        }

        /**
         * @param testObjectProtocol Specifies the test protocol.
         * 
         * @return builder
         * 
         */
        public Builder testObjectProtocol(String testObjectProtocol) {
            return testObjectProtocol(Output.of(testObjectProtocol));
        }

        /**
         * @param testObjectUsername A descriptive name for the testObject.
         * 
         * @return builder
         * 
         */
        public Builder testObjectUsername(Output<String> testObjectUsername) {
            $.testObjectUsername = testObjectUsername;
            return this;
        }

        /**
         * @param testObjectUsername A descriptive name for the testObject.
         * 
         * @return builder
         * 
         */
        public Builder testObjectUsername(String testObjectUsername) {
            return testObjectUsername(Output.of(testObjectUsername));
        }

        /**
         * @param testTimeout Specifies the duration of the liveness test before it fails.
         * 
         * @return builder
         * 
         */
        public Builder testTimeout(Output<Double> testTimeout) {
            $.testTimeout = testTimeout;
            return this;
        }

        /**
         * @param testTimeout Specifies the duration of the liveness test before it fails.
         * 
         * @return builder
         * 
         */
        public Builder testTimeout(Double testTimeout) {
            return testTimeout(Output.of(testTimeout));
        }

        /**
         * @param timeoutPenalty Specifies the timeout penalty score.
         * 
         * @return builder
         * 
         */
        public Builder timeoutPenalty(Output<Double> timeoutPenalty) {
            $.timeoutPenalty = timeoutPenalty;
            return this;
        }

        /**
         * @param timeoutPenalty Specifies the timeout penalty score.
         * 
         * @return builder
         * 
         */
        public Builder timeoutPenalty(Double timeoutPenalty) {
            return timeoutPenalty(Output.of(timeoutPenalty));
        }

        public GetGtmDomainPropertyLivenessTestArgs build() {
            if ($.alternateCaCertificates == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "alternateCaCertificates");
            }
            if ($.answersRequired == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "answersRequired");
            }
            if ($.disableNonstandardPortWarning == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "disableNonstandardPortWarning");
            }
            if ($.disabled == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "disabled");
            }
            if ($.errorPenalty == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "errorPenalty");
            }
            if ($.httpError3xx == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "httpError3xx");
            }
            if ($.httpError4xx == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "httpError4xx");
            }
            if ($.httpError5xx == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "httpError5xx");
            }
            if ($.httpMethod == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "httpMethod");
            }
            if ($.httpRequestBody == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "httpRequestBody");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "name");
            }
            if ($.peerCertificateVerification == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "peerCertificateVerification");
            }
            if ($.pre2023SecurityPosture == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "pre2023SecurityPosture");
            }
            if ($.recursionRequested == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "recursionRequested");
            }
            if ($.requestString == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "requestString");
            }
            if ($.resourceType == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "resourceType");
            }
            if ($.responseString == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "responseString");
            }
            if ($.sslClientCertificate == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "sslClientCertificate");
            }
            if ($.sslClientPrivateKey == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "sslClientPrivateKey");
            }
            if ($.testInterval == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "testInterval");
            }
            if ($.testObject == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "testObject");
            }
            if ($.testObjectPassword == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "testObjectPassword");
            }
            if ($.testObjectPort == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "testObjectPort");
            }
            if ($.testObjectProtocol == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "testObjectProtocol");
            }
            if ($.testObjectUsername == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "testObjectUsername");
            }
            if ($.testTimeout == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "testTimeout");
            }
            if ($.timeoutPenalty == null) {
                throw new MissingRequiredPropertyException("GetGtmDomainPropertyLivenessTestArgs", "timeoutPenalty");
            }
            return $;
        }
    }

}
