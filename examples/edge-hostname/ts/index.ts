import * as pulumi from "@pulumi/pulumi";
import * as akamai from "@pulumi/akamai";

let groupId = "175146";
let productId = "prd_Fresca";
const contractId = akamai.getContract({
    groupId: groupId,
}).then(x => x.id)


const tsdomain = new akamai.EdgeHostName("test", {
    contractId: contractId,
    groupId: groupId,
    productId: productId,
    edgeHostname: "test-ts.mycompany.io",
    ipBehavior: "ipv4",
});

export const id = contractId;
