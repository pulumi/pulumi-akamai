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
    'GetIamTimeoutPoliciesResult',
    'AwaitableGetIamTimeoutPoliciesResult',
    'get_iam_timeout_policies',
    'get_iam_timeout_policies_output',
]

@pulumi.output_type
class GetIamTimeoutPoliciesResult:
    """
    A collection of values returned by getIamTimeoutPolicies.
    """
    def __init__(__self__, id=None, policies=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if policies and not isinstance(policies, dict):
            raise TypeError("Expected argument 'policies' to be a dict")
        pulumi.set(__self__, "policies", policies)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def policies(self) -> Mapping[str, builtins.int]:
        return pulumi.get(self, "policies")


class AwaitableGetIamTimeoutPoliciesResult(GetIamTimeoutPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIamTimeoutPoliciesResult(
            id=self.id,
            policies=self.policies)


def get_iam_timeout_policies(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIamTimeoutPoliciesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getIamTimeoutPolicies:getIamTimeoutPolicies', __args__, opts=opts, typ=GetIamTimeoutPoliciesResult).value

    return AwaitableGetIamTimeoutPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        policies=pulumi.get(__ret__, 'policies'))
def get_iam_timeout_policies_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIamTimeoutPoliciesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getIamTimeoutPolicies:getIamTimeoutPolicies', __args__, opts=opts, typ=GetIamTimeoutPoliciesResult)
    return __ret__.apply(lambda __response__: GetIamTimeoutPoliciesResult(
        id=pulumi.get(__response__, 'id'),
        policies=pulumi.get(__response__, 'policies')))
