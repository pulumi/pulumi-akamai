# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCpCodeResult',
    'AwaitableGetCpCodeResult',
    'get_cp_code',
]

@pulumi.output_type
class GetCpCodeResult:
    """
    A collection of values returned by getCpCode.
    """
    def __init__(__self__, contract=None, contract_id=None, group=None, group_id=None, id=None, name=None, product_ids=None):
        if contract and not isinstance(contract, str):
            raise TypeError("Expected argument 'contract' to be a str")
        if contract is not None:
            warnings.warn("""The setting \"contract\" has been deprecated.""", DeprecationWarning)
            pulumi.log.warn("""contract is deprecated: The setting \"contract\" has been deprecated.""")

        pulumi.set(__self__, "contract", contract)
        if contract_id and not isinstance(contract_id, str):
            raise TypeError("Expected argument 'contract_id' to be a str")
        pulumi.set(__self__, "contract_id", contract_id)
        if group and not isinstance(group, str):
            raise TypeError("Expected argument 'group' to be a str")
        if group is not None:
            warnings.warn("""The setting \"group\" has been deprecated.""", DeprecationWarning)
            pulumi.log.warn("""group is deprecated: The setting \"group\" has been deprecated.""")

        pulumi.set(__self__, "group", group)
        if group_id and not isinstance(group_id, str):
            raise TypeError("Expected argument 'group_id' to be a str")
        pulumi.set(__self__, "group_id", group_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if product_ids and not isinstance(product_ids, list):
            raise TypeError("Expected argument 'product_ids' to be a list")
        pulumi.set(__self__, "product_ids", product_ids)

    @property
    @pulumi.getter
    def contract(self) -> str:
        return pulumi.get(self, "contract")

    @property
    @pulumi.getter(name="contractId")
    def contract_id(self) -> str:
        return pulumi.get(self, "contract_id")

    @property
    @pulumi.getter
    def group(self) -> str:
        return pulumi.get(self, "group")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="productIds")
    def product_ids(self) -> Sequence[str]:
        return pulumi.get(self, "product_ids")


class AwaitableGetCpCodeResult(GetCpCodeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCpCodeResult(
            contract=self.contract,
            contract_id=self.contract_id,
            group=self.group,
            group_id=self.group_id,
            id=self.id,
            name=self.name,
            product_ids=self.product_ids)


def get_cp_code(contract: Optional[str] = None,
                contract_id: Optional[str] = None,
                group: Optional[str] = None,
                group_id: Optional[str] = None,
                name: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCpCodeResult:
    """
    Use the `CpCode` data source to retrieve the ID for a content provider (CP) code.

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    example = akamai.get_cp_code(contract_id="ctr_1-AB123",
        group_id="grp_123",
        name="my cpcode name")
    ```

    Here's a real-world example that includes other data sources as dependencies:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    group_name = "example group name"
    cpcode_name = "My CP code Name"
    example_contract = akamai.get_contract(group_name=group_name)
    example_group = akamai.get_group(group_name=group_name,
        contract_id=example_contract.id)
    example_cp_code = akamai.get_cp_code(name=cpcode_name,
        group_id=example_group.id,
        contract_id=example_contract.id)
    ```
    ## Argument reference

    This data source supports these arguments:

    * `name` - (Required) The name of the CP code.
    * `group_id` - (Required) The group's unique ID, including the `grp_` prefix.
    * `contract_id` - (Required) A contract's unique ID, including the `ctr_` prefix.

    ### Deprecated arguments
    * `contract` - (Deprecated) Replaced by `contract_id`. Maintained for legacy purposes.
    * `group` - (Deprecated) Replaced by `group_id`. Maintained for legacy purposes.

    ## Attributes reference

    This data source returns these attributes:

    * `id` - The ID of the CP code, including the `cpc_` prefix.
    * `product_ids` - An array of product IDs associated with this CP code. Each ID returned includes the `prd_` prefix.
    """
    __args__ = dict()
    __args__['contract'] = contract
    __args__['contractId'] = contract_id
    __args__['group'] = group
    __args__['groupId'] = group_id
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getCpCode:getCpCode', __args__, opts=opts, typ=GetCpCodeResult).value

    return AwaitableGetCpCodeResult(
        contract=__ret__.contract,
        contract_id=__ret__.contract_id,
        group=__ret__.group,
        group_id=__ret__.group_id,
        id=__ret__.id,
        name=__ret__.name,
        product_ids=__ret__.product_ids)
