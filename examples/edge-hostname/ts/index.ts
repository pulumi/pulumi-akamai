import * as pulumi from "@pulumi/pulumi";
import * as akamai from "@pulumi/akamai";

const contractId = akamai.getContract().then(x => x.id)
const groupId = akamai.getGroup().then(x => x.id)

const tsdomain = new akamai.properties.EdgeHostName("test", {
    contract: contractId,
    group: groupId,
    product: "prd_Fresca",
    edgeHostname: "test-ts.mycompany.io",
    ipv4: true,
});
