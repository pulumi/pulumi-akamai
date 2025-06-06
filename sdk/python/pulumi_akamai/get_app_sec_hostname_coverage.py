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
    'GetAppSecHostnameCoverageResult',
    'AwaitableGetAppSecHostnameCoverageResult',
    'get_app_sec_hostname_coverage',
    'get_app_sec_hostname_coverage_output',
]

@pulumi.output_type
class GetAppSecHostnameCoverageResult:
    """
    A collection of values returned by getAppSecHostnameCoverage.
    """
    def __init__(__self__, id=None, json=None, output_text=None):
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


class AwaitableGetAppSecHostnameCoverageResult(GetAppSecHostnameCoverageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecHostnameCoverageResult(
            id=self.id,
            json=self.json,
            output_text=self.output_text)


def get_app_sec_hostname_coverage(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecHostnameCoverageResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecHostnameCoverage:getAppSecHostnameCoverage', __args__, opts=opts, typ=GetAppSecHostnameCoverageResult).value

    return AwaitableGetAppSecHostnameCoverageResult(
        id=pulumi.get(__ret__, 'id'),
        json=pulumi.get(__ret__, 'json'),
        output_text=pulumi.get(__ret__, 'output_text'))
def get_app_sec_hostname_coverage_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAppSecHostnameCoverageResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getAppSecHostnameCoverage:getAppSecHostnameCoverage', __args__, opts=opts, typ=GetAppSecHostnameCoverageResult)
    return __ret__.apply(lambda __response__: GetAppSecHostnameCoverageResult(
        id=pulumi.get(__response__, 'id'),
        json=pulumi.get(__response__, 'json'),
        output_text=pulumi.get(__response__, 'output_text')))
