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
    'GetBotmanBotAnalyticsCookieValuesResult',
    'AwaitableGetBotmanBotAnalyticsCookieValuesResult',
    'get_botman_bot_analytics_cookie_values',
    'get_botman_bot_analytics_cookie_values_output',
]

@pulumi.output_type
class GetBotmanBotAnalyticsCookieValuesResult:
    """
    A collection of values returned by getBotmanBotAnalyticsCookieValues.
    """
    def __init__(__self__, id=None, json=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> builtins.str:
        return pulumi.get(self, "json")


class AwaitableGetBotmanBotAnalyticsCookieValuesResult(GetBotmanBotAnalyticsCookieValuesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBotmanBotAnalyticsCookieValuesResult(
            id=self.id,
            json=self.json)


def get_botman_bot_analytics_cookie_values(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBotmanBotAnalyticsCookieValuesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getBotmanBotAnalyticsCookieValues:getBotmanBotAnalyticsCookieValues', __args__, opts=opts, typ=GetBotmanBotAnalyticsCookieValuesResult).value

    return AwaitableGetBotmanBotAnalyticsCookieValuesResult(
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'))
def get_botman_bot_analytics_cookie_values_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBotmanBotAnalyticsCookieValuesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getBotmanBotAnalyticsCookieValues:getBotmanBotAnalyticsCookieValues', __args__, opts=opts, typ=GetBotmanBotAnalyticsCookieValuesResult)
    return __ret__.apply(lambda __response__: GetBotmanBotAnalyticsCookieValuesResult(
        id=pulumi.get(__response__, 'id'),
        json=pulumi.get(__response__, 'json')))
