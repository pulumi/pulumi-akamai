# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetAuthoritiesSetResult',
    'AwaitableGetAuthoritiesSetResult',
    'get_authorities_set',
]

warnings.warn("""akamai.edgedns.getAuthoritiesSet has been deprecated in favor of akamai.getAuthoritiesSet""", DeprecationWarning)

@pulumi.output_type
class GetAuthoritiesSetResult:
    """
    A collection of values returned by getAuthoritiesSet.
    """
    def __init__(__self__, authorities=None, contract=None, id=None):
        if authorities and not isinstance(authorities, list):
            raise TypeError("Expected argument 'authorities' to be a list")
        pulumi.set(__self__, "authorities", authorities)
        if contract and not isinstance(contract, str):
            raise TypeError("Expected argument 'contract' to be a str")
        pulumi.set(__self__, "contract", contract)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def authorities(self) -> Sequence[str]:
        return pulumi.get(self, "authorities")

    @property
    @pulumi.getter
    def contract(self) -> str:
        return pulumi.get(self, "contract")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetAuthoritiesSetResult(GetAuthoritiesSetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuthoritiesSetResult(
            authorities=self.authorities,
            contract=self.contract,
            id=self.id)


def get_authorities_set(contract: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuthoritiesSetResult:
    """
    Use this data source to access information about an existing resource.
    """
    pulumi.log.warn("""get_authorities_set is deprecated: akamai.edgedns.getAuthoritiesSet has been deprecated in favor of akamai.getAuthoritiesSet""")
    __args__ = dict()
    __args__['contract'] = contract
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:edgedns/getAuthoritiesSet:getAuthoritiesSet', __args__, opts=opts, typ=GetAuthoritiesSetResult).value

    return AwaitableGetAuthoritiesSetResult(
        authorities=__ret__.authorities,
        contract=__ret__.contract,
        id=__ret__.id)
