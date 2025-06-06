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
    'GetCloudaccessKeyPropertiesResult',
    'AwaitableGetCloudaccessKeyPropertiesResult',
    'get_cloudaccess_key_properties',
    'get_cloudaccess_key_properties_output',
]

@pulumi.output_type
class GetCloudaccessKeyPropertiesResult:
    """
    A collection of values returned by getCloudaccessKeyProperties.
    """
    def __init__(__self__, access_key_name=None, access_key_uid=None, id=None, properties=None):
        if access_key_name and not isinstance(access_key_name, str):
            raise TypeError("Expected argument 'access_key_name' to be a str")
        pulumi.set(__self__, "access_key_name", access_key_name)
        if access_key_uid and not isinstance(access_key_uid, int):
            raise TypeError("Expected argument 'access_key_uid' to be a int")
        pulumi.set(__self__, "access_key_uid", access_key_uid)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if properties and not isinstance(properties, list):
            raise TypeError("Expected argument 'properties' to be a list")
        pulumi.set(__self__, "properties", properties)

    @property
    @pulumi.getter(name="accessKeyName")
    def access_key_name(self) -> builtins.str:
        return pulumi.get(self, "access_key_name")

    @property
    @pulumi.getter(name="accessKeyUid")
    def access_key_uid(self) -> builtins.int:
        return pulumi.get(self, "access_key_uid")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def properties(self) -> Sequence['outputs.GetCloudaccessKeyPropertiesPropertyResult']:
        return pulumi.get(self, "properties")


class AwaitableGetCloudaccessKeyPropertiesResult(GetCloudaccessKeyPropertiesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudaccessKeyPropertiesResult(
            access_key_name=self.access_key_name,
            access_key_uid=self.access_key_uid,
            id=self.id,
            properties=self.properties)


def get_cloudaccess_key_properties(access_key_name: Optional[builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudaccessKeyPropertiesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['accessKeyName'] = access_key_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getCloudaccessKeyProperties:getCloudaccessKeyProperties', __args__, opts=opts, typ=GetCloudaccessKeyPropertiesResult).value

    return AwaitableGetCloudaccessKeyPropertiesResult(
        access_key_name=pulumi.get(__ret__, 'access_key_name'),
        access_key_uid=pulumi.get(__ret__, 'access_key_uid'),
        id=pulumi.get(__ret__, 'id'),
        properties=pulumi.get(__ret__, 'properties'))
def get_cloudaccess_key_properties_output(access_key_name: Optional[pulumi.Input[builtins.str]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCloudaccessKeyPropertiesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['accessKeyName'] = access_key_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getCloudaccessKeyProperties:getCloudaccessKeyProperties', __args__, opts=opts, typ=GetCloudaccessKeyPropertiesResult)
    return __ret__.apply(lambda __response__: GetCloudaccessKeyPropertiesResult(
        access_key_name=pulumi.get(__response__, 'access_key_name'),
        access_key_uid=pulumi.get(__response__, 'access_key_uid'),
        id=pulumi.get(__response__, 'id'),
        properties=pulumi.get(__response__, 'properties')))
