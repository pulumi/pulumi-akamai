// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DnsRecordState extends com.pulumi.resources.ResourceArgs {

    public static final DnsRecordState Empty = new DnsRecordState();

    @Import(name="algorithm")
    private @Nullable Output<Integer> algorithm;

    public Optional<Output<Integer>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    @Import(name="answerType")
    private @Nullable Output<String> answerType;

    public Optional<Output<String>> answerType() {
        return Optional.ofNullable(this.answerType);
    }

    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="digest")
    private @Nullable Output<String> digest;

    public Optional<Output<String>> digest() {
        return Optional.ofNullable(this.digest);
    }

    @Import(name="digestType")
    private @Nullable Output<Integer> digestType;

    public Optional<Output<Integer>> digestType() {
        return Optional.ofNullable(this.digestType);
    }

    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    @Import(name="expiry")
    private @Nullable Output<Integer> expiry;

    public Optional<Output<Integer>> expiry() {
        return Optional.ofNullable(this.expiry);
    }

    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    @Import(name="fingerprintType")
    private @Nullable Output<Integer> fingerprintType;

    public Optional<Output<Integer>> fingerprintType() {
        return Optional.ofNullable(this.fingerprintType);
    }

    @Import(name="flags")
    private @Nullable Output<Integer> flags;

    public Optional<Output<Integer>> flags() {
        return Optional.ofNullable(this.flags);
    }

    @Import(name="flagsnaptr")
    private @Nullable Output<String> flagsnaptr;

    public Optional<Output<String>> flagsnaptr() {
        return Optional.ofNullable(this.flagsnaptr);
    }

    @Import(name="hardware")
    private @Nullable Output<String> hardware;

    public Optional<Output<String>> hardware() {
        return Optional.ofNullable(this.hardware);
    }

    @Import(name="inception")
    private @Nullable Output<String> inception;

    public Optional<Output<String>> inception() {
        return Optional.ofNullable(this.inception);
    }

    @Import(name="iterations")
    private @Nullable Output<Integer> iterations;

    public Optional<Output<Integer>> iterations() {
        return Optional.ofNullable(this.iterations);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="keytag")
    private @Nullable Output<Integer> keytag;

    public Optional<Output<Integer>> keytag() {
        return Optional.ofNullable(this.keytag);
    }

    @Import(name="labels")
    private @Nullable Output<Integer> labels;

    public Optional<Output<Integer>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="mailbox")
    private @Nullable Output<String> mailbox;

    public Optional<Output<String>> mailbox() {
        return Optional.ofNullable(this.mailbox);
    }

    @Import(name="matchType")
    private @Nullable Output<Integer> matchType;

    public Optional<Output<Integer>> matchType() {
        return Optional.ofNullable(this.matchType);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="nameServer")
    private @Nullable Output<String> nameServer;

    public Optional<Output<String>> nameServer() {
        return Optional.ofNullable(this.nameServer);
    }

    @Import(name="nextHashedOwnerName")
    private @Nullable Output<String> nextHashedOwnerName;

    public Optional<Output<String>> nextHashedOwnerName() {
        return Optional.ofNullable(this.nextHashedOwnerName);
    }

    @Import(name="nxdomainTtl")
    private @Nullable Output<Integer> nxdomainTtl;

    public Optional<Output<Integer>> nxdomainTtl() {
        return Optional.ofNullable(this.nxdomainTtl);
    }

    @Import(name="order")
    private @Nullable Output<Integer> order;

    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    @Import(name="originalTtl")
    private @Nullable Output<Integer> originalTtl;

    public Optional<Output<Integer>> originalTtl() {
        return Optional.ofNullable(this.originalTtl);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="preference")
    private @Nullable Output<Integer> preference;

    public Optional<Output<Integer>> preference() {
        return Optional.ofNullable(this.preference);
    }

    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="priorityIncrement")
    private @Nullable Output<Integer> priorityIncrement;

    public Optional<Output<Integer>> priorityIncrement() {
        return Optional.ofNullable(this.priorityIncrement);
    }

    @Import(name="protocol")
    private @Nullable Output<Integer> protocol;

    public Optional<Output<Integer>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="recordSha")
    private @Nullable Output<String> recordSha;

    public Optional<Output<String>> recordSha() {
        return Optional.ofNullable(this.recordSha);
    }

    @Import(name="recordtype")
    private @Nullable Output<String> recordtype;

    public Optional<Output<String>> recordtype() {
        return Optional.ofNullable(this.recordtype);
    }

    @Import(name="refresh")
    private @Nullable Output<Integer> refresh;

    public Optional<Output<Integer>> refresh() {
        return Optional.ofNullable(this.refresh);
    }

    @Import(name="regexp")
    private @Nullable Output<String> regexp;

    public Optional<Output<String>> regexp() {
        return Optional.ofNullable(this.regexp);
    }

    @Import(name="replacement")
    private @Nullable Output<String> replacement;

    public Optional<Output<String>> replacement() {
        return Optional.ofNullable(this.replacement);
    }

    @Import(name="retry")
    private @Nullable Output<Integer> retry;

    public Optional<Output<Integer>> retry() {
        return Optional.ofNullable(this.retry);
    }

    @Import(name="salt")
    private @Nullable Output<String> salt;

    public Optional<Output<String>> salt() {
        return Optional.ofNullable(this.salt);
    }

    @Import(name="selector")
    private @Nullable Output<Integer> selector;

    public Optional<Output<Integer>> selector() {
        return Optional.ofNullable(this.selector);
    }

    @Import(name="serial")
    private @Nullable Output<Integer> serial;

    public Optional<Output<Integer>> serial() {
        return Optional.ofNullable(this.serial);
    }

    @Import(name="service")
    private @Nullable Output<String> service;

    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    @Import(name="signature")
    private @Nullable Output<String> signature;

    public Optional<Output<String>> signature() {
        return Optional.ofNullable(this.signature);
    }

    @Import(name="signer")
    private @Nullable Output<String> signer;

    public Optional<Output<String>> signer() {
        return Optional.ofNullable(this.signer);
    }

    @Import(name="software")
    private @Nullable Output<String> software;

    public Optional<Output<String>> software() {
        return Optional.ofNullable(this.software);
    }

    @Import(name="subtype")
    private @Nullable Output<Integer> subtype;

    public Optional<Output<Integer>> subtype() {
        return Optional.ofNullable(this.subtype);
    }

    @Import(name="svcParams")
    private @Nullable Output<String> svcParams;

    public Optional<Output<String>> svcParams() {
        return Optional.ofNullable(this.svcParams);
    }

    @Import(name="svcPriority")
    private @Nullable Output<Integer> svcPriority;

    public Optional<Output<Integer>> svcPriority() {
        return Optional.ofNullable(this.svcPriority);
    }

    @Import(name="targetName")
    private @Nullable Output<String> targetName;

    public Optional<Output<String>> targetName() {
        return Optional.ofNullable(this.targetName);
    }

    @Import(name="targets")
    private @Nullable Output<List<String>> targets;

    public Optional<Output<List<String>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    @Import(name="txt")
    private @Nullable Output<String> txt;

    public Optional<Output<String>> txt() {
        return Optional.ofNullable(this.txt);
    }

    @Import(name="typeBitmaps")
    private @Nullable Output<String> typeBitmaps;

    public Optional<Output<String>> typeBitmaps() {
        return Optional.ofNullable(this.typeBitmaps);
    }

    @Import(name="typeCovered")
    private @Nullable Output<String> typeCovered;

    public Optional<Output<String>> typeCovered() {
        return Optional.ofNullable(this.typeCovered);
    }

    @Import(name="typeMnemonic")
    private @Nullable Output<String> typeMnemonic;

    public Optional<Output<String>> typeMnemonic() {
        return Optional.ofNullable(this.typeMnemonic);
    }

    @Import(name="typeValue")
    private @Nullable Output<Integer> typeValue;

    public Optional<Output<Integer>> typeValue() {
        return Optional.ofNullable(this.typeValue);
    }

    @Import(name="usage")
    private @Nullable Output<Integer> usage;

    public Optional<Output<Integer>> usage() {
        return Optional.ofNullable(this.usage);
    }

    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private DnsRecordState() {}

    private DnsRecordState(DnsRecordState $) {
        this.algorithm = $.algorithm;
        this.answerType = $.answerType;
        this.certificate = $.certificate;
        this.digest = $.digest;
        this.digestType = $.digestType;
        this.dnsName = $.dnsName;
        this.emailAddress = $.emailAddress;
        this.expiration = $.expiration;
        this.expiry = $.expiry;
        this.fingerprint = $.fingerprint;
        this.fingerprintType = $.fingerprintType;
        this.flags = $.flags;
        this.flagsnaptr = $.flagsnaptr;
        this.hardware = $.hardware;
        this.inception = $.inception;
        this.iterations = $.iterations;
        this.key = $.key;
        this.keytag = $.keytag;
        this.labels = $.labels;
        this.mailbox = $.mailbox;
        this.matchType = $.matchType;
        this.name = $.name;
        this.nameServer = $.nameServer;
        this.nextHashedOwnerName = $.nextHashedOwnerName;
        this.nxdomainTtl = $.nxdomainTtl;
        this.order = $.order;
        this.originalTtl = $.originalTtl;
        this.port = $.port;
        this.preference = $.preference;
        this.priority = $.priority;
        this.priorityIncrement = $.priorityIncrement;
        this.protocol = $.protocol;
        this.recordSha = $.recordSha;
        this.recordtype = $.recordtype;
        this.refresh = $.refresh;
        this.regexp = $.regexp;
        this.replacement = $.replacement;
        this.retry = $.retry;
        this.salt = $.salt;
        this.selector = $.selector;
        this.serial = $.serial;
        this.service = $.service;
        this.signature = $.signature;
        this.signer = $.signer;
        this.software = $.software;
        this.subtype = $.subtype;
        this.svcParams = $.svcParams;
        this.svcPriority = $.svcPriority;
        this.targetName = $.targetName;
        this.targets = $.targets;
        this.ttl = $.ttl;
        this.txt = $.txt;
        this.typeBitmaps = $.typeBitmaps;
        this.typeCovered = $.typeCovered;
        this.typeMnemonic = $.typeMnemonic;
        this.typeValue = $.typeValue;
        this.usage = $.usage;
        this.weight = $.weight;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsRecordState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsRecordState $;

        public Builder() {
            $ = new DnsRecordState();
        }

        public Builder(DnsRecordState defaults) {
            $ = new DnsRecordState(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(@Nullable Output<Integer> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(Integer algorithm) {
            return algorithm(Output.of(algorithm));
        }

        public Builder answerType(@Nullable Output<String> answerType) {
            $.answerType = answerType;
            return this;
        }

        public Builder answerType(String answerType) {
            return answerType(Output.of(answerType));
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder digest(@Nullable Output<String> digest) {
            $.digest = digest;
            return this;
        }

        public Builder digest(String digest) {
            return digest(Output.of(digest));
        }

        public Builder digestType(@Nullable Output<Integer> digestType) {
            $.digestType = digestType;
            return this;
        }

        public Builder digestType(Integer digestType) {
            return digestType(Output.of(digestType));
        }

        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        public Builder expiry(@Nullable Output<Integer> expiry) {
            $.expiry = expiry;
            return this;
        }

        public Builder expiry(Integer expiry) {
            return expiry(Output.of(expiry));
        }

        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        public Builder fingerprintType(@Nullable Output<Integer> fingerprintType) {
            $.fingerprintType = fingerprintType;
            return this;
        }

        public Builder fingerprintType(Integer fingerprintType) {
            return fingerprintType(Output.of(fingerprintType));
        }

        public Builder flags(@Nullable Output<Integer> flags) {
            $.flags = flags;
            return this;
        }

        public Builder flags(Integer flags) {
            return flags(Output.of(flags));
        }

        public Builder flagsnaptr(@Nullable Output<String> flagsnaptr) {
            $.flagsnaptr = flagsnaptr;
            return this;
        }

        public Builder flagsnaptr(String flagsnaptr) {
            return flagsnaptr(Output.of(flagsnaptr));
        }

        public Builder hardware(@Nullable Output<String> hardware) {
            $.hardware = hardware;
            return this;
        }

        public Builder hardware(String hardware) {
            return hardware(Output.of(hardware));
        }

        public Builder inception(@Nullable Output<String> inception) {
            $.inception = inception;
            return this;
        }

        public Builder inception(String inception) {
            return inception(Output.of(inception));
        }

        public Builder iterations(@Nullable Output<Integer> iterations) {
            $.iterations = iterations;
            return this;
        }

        public Builder iterations(Integer iterations) {
            return iterations(Output.of(iterations));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder keytag(@Nullable Output<Integer> keytag) {
            $.keytag = keytag;
            return this;
        }

        public Builder keytag(Integer keytag) {
            return keytag(Output.of(keytag));
        }

        public Builder labels(@Nullable Output<Integer> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Integer labels) {
            return labels(Output.of(labels));
        }

        public Builder mailbox(@Nullable Output<String> mailbox) {
            $.mailbox = mailbox;
            return this;
        }

        public Builder mailbox(String mailbox) {
            return mailbox(Output.of(mailbox));
        }

        public Builder matchType(@Nullable Output<Integer> matchType) {
            $.matchType = matchType;
            return this;
        }

        public Builder matchType(Integer matchType) {
            return matchType(Output.of(matchType));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder nameServer(@Nullable Output<String> nameServer) {
            $.nameServer = nameServer;
            return this;
        }

        public Builder nameServer(String nameServer) {
            return nameServer(Output.of(nameServer));
        }

        public Builder nextHashedOwnerName(@Nullable Output<String> nextHashedOwnerName) {
            $.nextHashedOwnerName = nextHashedOwnerName;
            return this;
        }

        public Builder nextHashedOwnerName(String nextHashedOwnerName) {
            return nextHashedOwnerName(Output.of(nextHashedOwnerName));
        }

        public Builder nxdomainTtl(@Nullable Output<Integer> nxdomainTtl) {
            $.nxdomainTtl = nxdomainTtl;
            return this;
        }

        public Builder nxdomainTtl(Integer nxdomainTtl) {
            return nxdomainTtl(Output.of(nxdomainTtl));
        }

        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public Builder originalTtl(@Nullable Output<Integer> originalTtl) {
            $.originalTtl = originalTtl;
            return this;
        }

        public Builder originalTtl(Integer originalTtl) {
            return originalTtl(Output.of(originalTtl));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder preference(@Nullable Output<Integer> preference) {
            $.preference = preference;
            return this;
        }

        public Builder preference(Integer preference) {
            return preference(Output.of(preference));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder priorityIncrement(@Nullable Output<Integer> priorityIncrement) {
            $.priorityIncrement = priorityIncrement;
            return this;
        }

        public Builder priorityIncrement(Integer priorityIncrement) {
            return priorityIncrement(Output.of(priorityIncrement));
        }

        public Builder protocol(@Nullable Output<Integer> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(Integer protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder recordSha(@Nullable Output<String> recordSha) {
            $.recordSha = recordSha;
            return this;
        }

        public Builder recordSha(String recordSha) {
            return recordSha(Output.of(recordSha));
        }

        public Builder recordtype(@Nullable Output<String> recordtype) {
            $.recordtype = recordtype;
            return this;
        }

        public Builder recordtype(String recordtype) {
            return recordtype(Output.of(recordtype));
        }

        public Builder refresh(@Nullable Output<Integer> refresh) {
            $.refresh = refresh;
            return this;
        }

        public Builder refresh(Integer refresh) {
            return refresh(Output.of(refresh));
        }

        public Builder regexp(@Nullable Output<String> regexp) {
            $.regexp = regexp;
            return this;
        }

        public Builder regexp(String regexp) {
            return regexp(Output.of(regexp));
        }

        public Builder replacement(@Nullable Output<String> replacement) {
            $.replacement = replacement;
            return this;
        }

        public Builder replacement(String replacement) {
            return replacement(Output.of(replacement));
        }

        public Builder retry(@Nullable Output<Integer> retry) {
            $.retry = retry;
            return this;
        }

        public Builder retry(Integer retry) {
            return retry(Output.of(retry));
        }

        public Builder salt(@Nullable Output<String> salt) {
            $.salt = salt;
            return this;
        }

        public Builder salt(String salt) {
            return salt(Output.of(salt));
        }

        public Builder selector(@Nullable Output<Integer> selector) {
            $.selector = selector;
            return this;
        }

        public Builder selector(Integer selector) {
            return selector(Output.of(selector));
        }

        public Builder serial(@Nullable Output<Integer> serial) {
            $.serial = serial;
            return this;
        }

        public Builder serial(Integer serial) {
            return serial(Output.of(serial));
        }

        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public Builder signature(@Nullable Output<String> signature) {
            $.signature = signature;
            return this;
        }

        public Builder signature(String signature) {
            return signature(Output.of(signature));
        }

        public Builder signer(@Nullable Output<String> signer) {
            $.signer = signer;
            return this;
        }

        public Builder signer(String signer) {
            return signer(Output.of(signer));
        }

        public Builder software(@Nullable Output<String> software) {
            $.software = software;
            return this;
        }

        public Builder software(String software) {
            return software(Output.of(software));
        }

        public Builder subtype(@Nullable Output<Integer> subtype) {
            $.subtype = subtype;
            return this;
        }

        public Builder subtype(Integer subtype) {
            return subtype(Output.of(subtype));
        }

        public Builder svcParams(@Nullable Output<String> svcParams) {
            $.svcParams = svcParams;
            return this;
        }

        public Builder svcParams(String svcParams) {
            return svcParams(Output.of(svcParams));
        }

        public Builder svcPriority(@Nullable Output<Integer> svcPriority) {
            $.svcPriority = svcPriority;
            return this;
        }

        public Builder svcPriority(Integer svcPriority) {
            return svcPriority(Output.of(svcPriority));
        }

        public Builder targetName(@Nullable Output<String> targetName) {
            $.targetName = targetName;
            return this;
        }

        public Builder targetName(String targetName) {
            return targetName(Output.of(targetName));
        }

        public Builder targets(@Nullable Output<List<String>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<String> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }

        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public Builder txt(@Nullable Output<String> txt) {
            $.txt = txt;
            return this;
        }

        public Builder txt(String txt) {
            return txt(Output.of(txt));
        }

        public Builder typeBitmaps(@Nullable Output<String> typeBitmaps) {
            $.typeBitmaps = typeBitmaps;
            return this;
        }

        public Builder typeBitmaps(String typeBitmaps) {
            return typeBitmaps(Output.of(typeBitmaps));
        }

        public Builder typeCovered(@Nullable Output<String> typeCovered) {
            $.typeCovered = typeCovered;
            return this;
        }

        public Builder typeCovered(String typeCovered) {
            return typeCovered(Output.of(typeCovered));
        }

        public Builder typeMnemonic(@Nullable Output<String> typeMnemonic) {
            $.typeMnemonic = typeMnemonic;
            return this;
        }

        public Builder typeMnemonic(String typeMnemonic) {
            return typeMnemonic(Output.of(typeMnemonic));
        }

        public Builder typeValue(@Nullable Output<Integer> typeValue) {
            $.typeValue = typeValue;
            return this;
        }

        public Builder typeValue(Integer typeValue) {
            return typeValue(Output.of(typeValue));
        }

        public Builder usage(@Nullable Output<Integer> usage) {
            $.usage = usage;
            return this;
        }

        public Builder usage(Integer usage) {
            return usage(Output.of(usage));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public DnsRecordState build() {
            return $;
        }
    }

}
