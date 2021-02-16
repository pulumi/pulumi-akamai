"""A Python Pulumi program"""

import pulumi
import pulumi_akamai as akamai

group_id = "grp_175145"
product_id = "prd_Adaptive_Media_Delivery"

contract_id = pulumi.Output.from_input(akamai.get_contract(group_id = group_id)).id

pydomain = akamai.EdgeHostName("test",
                                  contract_id=contract_id,
                                  group_id=group_id,
                                  product_id="prd_Adaptive_Media_Delivery",
                                  edge_hostname="test-py.mycompany",
                                  ip_behavior="ipv4")
