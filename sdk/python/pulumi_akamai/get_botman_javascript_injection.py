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
    'GetBotmanJavascriptInjectionResult',
    'AwaitableGetBotmanJavascriptInjectionResult',
    'get_botman_javascript_injection',
    'get_botman_javascript_injection_output',
]

@pulumi.output_type
class GetBotmanJavascriptInjectionResult:
    """
    A collection of values returned by getBotmanJavascriptInjection.
    """
    def __init__(__self__, config_id=None, id=None, json=None, security_policy_id=None):
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)
        if security_policy_id and not isinstance(security_policy_id, str):
            raise TypeError("Expected argument 'security_policy_id' to be a str")
        pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> builtins.int:
        return pulumi.get(self, "config_id")

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

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> builtins.str:
        return pulumi.get(self, "security_policy_id")


class AwaitableGetBotmanJavascriptInjectionResult(GetBotmanJavascriptInjectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBotmanJavascriptInjectionResult(
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            security_policy_id=self.security_policy_id)


def get_botman_javascript_injection(config_id: Optional[builtins.int] = None,
                                    security_policy_id: Optional[builtins.str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBotmanJavascriptInjectionResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getBotmanJavascriptInjection:getBotmanJavascriptInjection', __args__, opts=opts, typ=GetBotmanJavascriptInjectionResult).value

    return AwaitableGetBotmanJavascriptInjectionResult(
        config_id=pulumi.get(__ret__, 'config_id'),
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'),
        security_policy_id=pulumi.get(__ret__, 'security_policy_id'))
def get_botman_javascript_injection_output(config_id: Optional[pulumi.Input[builtins.int]] = None,
                                           security_policy_id: Optional[pulumi.Input[builtins.str]] = None,
                                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBotmanJavascriptInjectionResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getBotmanJavascriptInjection:getBotmanJavascriptInjection', __args__, opts=opts, typ=GetBotmanJavascriptInjectionResult)
    return __ret__.apply(lambda __response__: GetBotmanJavascriptInjectionResult(
        config_id=pulumi.get(__response__, 'config_id'),
        id=pulumi.get(__response__, 'id'),
        json=pulumi.get(__response__, 'json'),
        security_policy_id=pulumi.get(__response__, 'security_policy_id')))
