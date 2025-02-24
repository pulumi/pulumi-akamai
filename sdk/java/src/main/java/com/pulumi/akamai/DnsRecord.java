// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.DnsRecordArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.DnsRecordState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/dnsRecord:DnsRecord")
public class DnsRecord extends com.pulumi.resources.CustomResource {
    @Export(name="algorithm", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> algorithm;

    public Output<Optional<Integer>> algorithm() {
        return Codegen.optional(this.algorithm);
    }
    @Export(name="answerType", refs={String.class}, tree="[0]")
    private Output<String> answerType;

    public Output<String> answerType() {
        return this.answerType;
    }
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificate;

    public Output<Optional<String>> certificate() {
        return Codegen.optional(this.certificate);
    }
    @Export(name="digest", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> digest;

    public Output<Optional<String>> digest() {
        return Codegen.optional(this.digest);
    }
    @Export(name="digestType", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> digestType;

    public Output<Optional<Integer>> digestType() {
        return Codegen.optional(this.digestType);
    }
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    public Output<String> dnsName() {
        return this.dnsName;
    }
    @Export(name="emailAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> emailAddress;

    public Output<Optional<String>> emailAddress() {
        return Codegen.optional(this.emailAddress);
    }
    @Export(name="expiration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expiration;

    public Output<Optional<String>> expiration() {
        return Codegen.optional(this.expiration);
    }
    @Export(name="expiry", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> expiry;

    public Output<Optional<Integer>> expiry() {
        return Codegen.optional(this.expiry);
    }
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fingerprint;

    public Output<Optional<String>> fingerprint() {
        return Codegen.optional(this.fingerprint);
    }
    @Export(name="fingerprintType", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> fingerprintType;

    public Output<Optional<Integer>> fingerprintType() {
        return Codegen.optional(this.fingerprintType);
    }
    @Export(name="flags", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> flags;

    public Output<Optional<Integer>> flags() {
        return Codegen.optional(this.flags);
    }
    @Export(name="flagsnaptr", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> flagsnaptr;

    public Output<Optional<String>> flagsnaptr() {
        return Codegen.optional(this.flagsnaptr);
    }
    @Export(name="hardware", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hardware;

    public Output<Optional<String>> hardware() {
        return Codegen.optional(this.hardware);
    }
    @Export(name="inception", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> inception;

    public Output<Optional<String>> inception() {
        return Codegen.optional(this.inception);
    }
    @Export(name="iterations", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> iterations;

    public Output<Optional<Integer>> iterations() {
        return Codegen.optional(this.iterations);
    }
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> key;

    public Output<Optional<String>> key() {
        return Codegen.optional(this.key);
    }
    @Export(name="keytag", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> keytag;

    public Output<Optional<Integer>> keytag() {
        return Codegen.optional(this.keytag);
    }
    @Export(name="labels", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> labels;

    public Output<Optional<Integer>> labels() {
        return Codegen.optional(this.labels);
    }
    @Export(name="mailbox", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mailbox;

    public Output<Optional<String>> mailbox() {
        return Codegen.optional(this.mailbox);
    }
    @Export(name="matchType", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> matchType;

    public Output<Optional<Integer>> matchType() {
        return Codegen.optional(this.matchType);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="nameServer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nameServer;

    public Output<Optional<String>> nameServer() {
        return Codegen.optional(this.nameServer);
    }
    @Export(name="nextHashedOwnerName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nextHashedOwnerName;

    public Output<Optional<String>> nextHashedOwnerName() {
        return Codegen.optional(this.nextHashedOwnerName);
    }
    @Export(name="nxdomainTtl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> nxdomainTtl;

    public Output<Optional<Integer>> nxdomainTtl() {
        return Codegen.optional(this.nxdomainTtl);
    }
    @Export(name="order", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> order;

    public Output<Optional<Integer>> order() {
        return Codegen.optional(this.order);
    }
    @Export(name="originalTtl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> originalTtl;

    public Output<Optional<Integer>> originalTtl() {
        return Codegen.optional(this.originalTtl);
    }
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    @Export(name="preference", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> preference;

    public Output<Optional<Integer>> preference() {
        return Codegen.optional(this.preference);
    }
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    @Export(name="priorityIncrement", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priorityIncrement;

    public Output<Optional<Integer>> priorityIncrement() {
        return Codegen.optional(this.priorityIncrement);
    }
    @Export(name="protocol", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> protocol;

    public Output<Optional<Integer>> protocol() {
        return Codegen.optional(this.protocol);
    }
    @Export(name="recordSha", refs={String.class}, tree="[0]")
    private Output<String> recordSha;

    public Output<String> recordSha() {
        return this.recordSha;
    }
    @Export(name="recordtype", refs={String.class}, tree="[0]")
    private Output<String> recordtype;

    public Output<String> recordtype() {
        return this.recordtype;
    }
    @Export(name="refresh", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> refresh;

    public Output<Optional<Integer>> refresh() {
        return Codegen.optional(this.refresh);
    }
    @Export(name="regexp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> regexp;

    public Output<Optional<String>> regexp() {
        return Codegen.optional(this.regexp);
    }
    @Export(name="replacement", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> replacement;

    public Output<Optional<String>> replacement() {
        return Codegen.optional(this.replacement);
    }
    @Export(name="retry", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retry;

    public Output<Optional<Integer>> retry() {
        return Codegen.optional(this.retry);
    }
    @Export(name="salt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> salt;

    public Output<Optional<String>> salt() {
        return Codegen.optional(this.salt);
    }
    @Export(name="selector", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> selector;

    public Output<Optional<Integer>> selector() {
        return Codegen.optional(this.selector);
    }
    @Export(name="serial", refs={Integer.class}, tree="[0]")
    private Output<Integer> serial;

    public Output<Integer> serial() {
        return this.serial;
    }
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> service;

    public Output<Optional<String>> service() {
        return Codegen.optional(this.service);
    }
    @Export(name="signature", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> signature;

    public Output<Optional<String>> signature() {
        return Codegen.optional(this.signature);
    }
    @Export(name="signer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> signer;

    public Output<Optional<String>> signer() {
        return Codegen.optional(this.signer);
    }
    @Export(name="software", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> software;

    public Output<Optional<String>> software() {
        return Codegen.optional(this.software);
    }
    @Export(name="subtype", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> subtype;

    public Output<Optional<Integer>> subtype() {
        return Codegen.optional(this.subtype);
    }
    @Export(name="svcParams", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> svcParams;

    public Output<Optional<String>> svcParams() {
        return Codegen.optional(this.svcParams);
    }
    @Export(name="svcPriority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> svcPriority;

    public Output<Optional<Integer>> svcPriority() {
        return Codegen.optional(this.svcPriority);
    }
    @Export(name="targetName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> targetName;

    public Output<Optional<String>> targetName() {
        return Codegen.optional(this.targetName);
    }
    @Export(name="targets", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> targets;

    public Output<Optional<List<String>>> targets() {
        return Codegen.optional(this.targets);
    }
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output<Integer> ttl;

    public Output<Integer> ttl() {
        return this.ttl;
    }
    @Export(name="txt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> txt;

    public Output<Optional<String>> txt() {
        return Codegen.optional(this.txt);
    }
    @Export(name="typeBitmaps", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> typeBitmaps;

    public Output<Optional<String>> typeBitmaps() {
        return Codegen.optional(this.typeBitmaps);
    }
    @Export(name="typeCovered", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> typeCovered;

    public Output<Optional<String>> typeCovered() {
        return Codegen.optional(this.typeCovered);
    }
    @Export(name="typeMnemonic", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> typeMnemonic;

    public Output<Optional<String>> typeMnemonic() {
        return Codegen.optional(this.typeMnemonic);
    }
    @Export(name="typeValue", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> typeValue;

    public Output<Optional<Integer>> typeValue() {
        return Codegen.optional(this.typeValue);
    }
    @Export(name="usage", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> usage;

    public Output<Optional<Integer>> usage() {
        return Codegen.optional(this.usage);
    }
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> weight;

    public Output<Optional<Integer>> weight() {
        return Codegen.optional(this.weight);
    }
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DnsRecord(java.lang.String name) {
        this(name, DnsRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DnsRecord(java.lang.String name, DnsRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DnsRecord(java.lang.String name, DnsRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/dnsRecord:DnsRecord", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DnsRecord(java.lang.String name, Output<java.lang.String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/dnsRecord:DnsRecord", name, state, makeResourceOptions(options, id), false);
    }

    private static DnsRecordArgs makeArgs(DnsRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DnsRecordArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("akamai:edgedns/dnsRecord:DnsRecord").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DnsRecord get(java.lang.String name, Output<java.lang.String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DnsRecord(name, id, state, options);
    }
}
