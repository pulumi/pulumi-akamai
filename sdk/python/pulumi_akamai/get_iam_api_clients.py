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
from . import outputs

__all__ = [
    'GetIamApiClientsResult',
    'AwaitableGetIamApiClientsResult',
    'get_iam_api_clients',
    'get_iam_api_clients_output',
]

@pulumi.output_type
class GetIamApiClientsResult:
    """
    A collection of values returned by getIamApiClients.
    """
    def __init__(__self__, api_clients=None, id=None):
        if api_clients and not isinstance(api_clients, list):
            raise TypeError("Expected argument 'api_clients' to be a list")
        pulumi.set(__self__, "api_clients", api_clients)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="apiClients")
    def api_clients(self) -> Sequence['outputs.GetIamApiClientsApiClientResult']:
        return pulumi.get(self, "api_clients")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetIamApiClientsResult(GetIamApiClientsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIamApiClientsResult(
            api_clients=self.api_clients,
            id=self.id)


def get_iam_api_clients(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIamApiClientsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getIamApiClients:getIamApiClients', __args__, opts=opts, typ=GetIamApiClientsResult).value

    return AwaitableGetIamApiClientsResult(
        api_clients=pulumi.get(__ret__, 'api_clients'),
        id=pulumi.get(__ret__, 'id'))
def get_iam_api_clients_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIamApiClientsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getIamApiClients:getIamApiClients', __args__, opts=opts, typ=GetIamApiClientsResult)
    return __ret__.apply(lambda __response__: GetIamApiClientsResult(
        api_clients=pulumi.get(__response__, 'api_clients'),
        id=pulumi.get(__response__, 'id')))
