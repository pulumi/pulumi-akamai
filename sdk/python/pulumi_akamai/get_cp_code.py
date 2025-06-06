# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'GetCpCodeResult',
    'AwaitableGetCpCodeResult',
    'get_cp_code',
    'get_cp_code_output',
]

@pulumi.output_type
class GetCpCodeResult:
    """
    A collection of values returned by getCpCode.
    """
    def __init__(__self__, contract_id=None, created_date=None, group_id=None, id=None, name=None, product_ids=None):
        if contract_id and not isinstance(contract_id, str):
            raise TypeError("Expected argument 'contract_id' to be a str")
        pulumi.set(__self__, "contract_id", contract_id)
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
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
    @pulumi.getter(name="contractId")
    def contract_id(self) -> builtins.str:
        return pulumi.get(self, "contract_id")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> builtins.str:
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> builtins.str:
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="productIds")
    def product_ids(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "product_ids")


class AwaitableGetCpCodeResult(GetCpCodeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCpCodeResult(
            contract_id=self.contract_id,
            created_date=self.created_date,
            group_id=self.group_id,
            id=self.id,
            name=self.name,
            product_ids=self.product_ids)


def get_cp_code(contract_id: Optional[builtins.str] = None,
                group_id: Optional[builtins.str] = None,
                name: Optional[builtins.str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCpCodeResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['contractId'] = contract_id
    __args__['groupId'] = group_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getCpCode:getCpCode', __args__, opts=opts, typ=GetCpCodeResult).value

    return AwaitableGetCpCodeResult(
        contract_id=pulumi.get(__ret__, 'contract_id'),
        created_date=pulumi.get(__ret__, 'created_date'),
        group_id=pulumi.get(__ret__, 'group_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        product_ids=pulumi.get(__ret__, 'product_ids'))
def get_cp_code_output(contract_id: Optional[pulumi.Input[builtins.str]] = None,
                       group_id: Optional[pulumi.Input[builtins.str]] = None,
                       name: Optional[pulumi.Input[builtins.str]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCpCodeResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['contractId'] = contract_id
    __args__['groupId'] = group_id
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getCpCode:getCpCode', __args__, opts=opts, typ=GetCpCodeResult)
    return __ret__.apply(lambda __response__: GetCpCodeResult(
        contract_id=pulumi.get(__response__, 'contract_id'),
        created_date=pulumi.get(__response__, 'created_date'),
        group_id=pulumi.get(__response__, 'group_id'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        product_ids=pulumi.get(__response__, 'product_ids')))
