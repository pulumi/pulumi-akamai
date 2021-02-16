import * as pulumi from "@pulumi/pulumi";
import * as akamai from "@pulumi/akamai";

let groupId = "grp_175145";
let productId = "prd_Adaptive_Media_Delivery";
const contractId = akamai.getContract({
    groupId: groupId,
}).then(x => x.id)

const tsdomain = new akamai.EdgeHostName("test", {
    contractId: contractId,
    groupId: groupId,
    productId: productId,
    edgeHostname: "test-ts.mycompany",
    ipBehavior: "ipv4",
});

export const id = contractId;
