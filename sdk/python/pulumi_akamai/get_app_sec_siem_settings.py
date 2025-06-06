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
    'GetAppSecSiemSettingsResult',
    'AwaitableGetAppSecSiemSettingsResult',
    'get_app_sec_siem_settings',
    'get_app_sec_siem_settings_output',
]

@pulumi.output_type
class GetAppSecSiemSettingsResult:
    """
    A collection of values returned by getAppSecSiemSettings.
    """
    def __init__(__self__, config_id=None, id=None, json=None, output_text=None):
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)
        if output_text and not isinstance(output_text, str):
            raise TypeError("Expected argument 'output_text' to be a str")
        pulumi.set(__self__, "output_text", output_text)

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
    @pulumi.getter(name="outputText")
    def output_text(self) -> builtins.str:
        return pulumi.get(self, "output_text")


class AwaitableGetAppSecSiemSettingsResult(GetAppSecSiemSettingsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecSiemSettingsResult(
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            output_text=self.output_text)


def get_app_sec_siem_settings(config_id: Optional[builtins.int] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecSiemSettingsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecSiemSettings:getAppSecSiemSettings', __args__, opts=opts, typ=GetAppSecSiemSettingsResult).value

    return AwaitableGetAppSecSiemSettingsResult(
        config_id=pulumi.get(__ret__, 'config_id'),
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'),
        output_text=pulumi.get(__ret__, 'output_text'))
def get_app_sec_siem_settings_output(config_id: Optional[pulumi.Input[builtins.int]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppSecSiemSettingsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getAppSecSiemSettings:getAppSecSiemSettings', __args__, opts=opts, typ=GetAppSecSiemSettingsResult)
    return __ret__.apply(lambda __response__: GetAppSecSiemSettingsResult(
        config_id=pulumi.get(__response__, 'config_id'),
        id=pulumi.get(__response__, 'id'),
        json=pulumi.get(__response__, 'json'),
        output_text=pulumi.get(__response__, 'output_text')))
