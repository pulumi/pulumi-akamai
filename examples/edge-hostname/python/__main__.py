"""A Python Pulumi program"""

import pulumi
import pulumi_akamai as akamai

contract_id = pulumi.Output.from_input(akamai.get_contract()).id
group_id = pulumi.Output.from_input(akamai.get_group()).id

pydomain = akamai.properties.EdgeHostName("test",
                                          contract=contract_id,
                                          group=group_id,
                                          product="prd_Fresca",
                                          edge_hostname="test-py.mycompany.io",
                                          ipv4="true")
