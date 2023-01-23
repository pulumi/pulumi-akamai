import * as akamai from "@pulumi/akamai";

const groupId = "grp_201328";
const productId = "prd_Fresca";
const contractId = akamai
  .getContract({
    groupId: groupId,
  })
  .then((x) => x.id);

new akamai.Property("test", {
  productId: productId,
  contractId: contractId,
  groupId: groupId,
  hostnames: [
    {
      cnameFrom: "example.com",
      cnameTo: "example.com.edgekey.net",
      certProvisioningType: "DEFAULT",
    },
  ],
  ruleFormat: "v2020-03-04",
});
