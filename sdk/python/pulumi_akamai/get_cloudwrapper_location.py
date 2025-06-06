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
    'GetCloudwrapperLocationResult',
    'AwaitableGetCloudwrapperLocationResult',
    'get_cloudwrapper_location',
    'get_cloudwrapper_location_output',
]

@pulumi.output_type
class GetCloudwrapperLocationResult:
    """
    A collection of values returned by getCloudwrapperLocation.
    """
    def __init__(__self__, id=None, location_id=None, location_name=None, traffic_type=None, traffic_type_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location_id and not isinstance(location_id, str):
            raise TypeError("Expected argument 'location_id' to be a str")
        pulumi.set(__self__, "location_id", location_id)
        if location_name and not isinstance(location_name, str):
            raise TypeError("Expected argument 'location_name' to be a str")
        pulumi.set(__self__, "location_name", location_name)
        if traffic_type and not isinstance(traffic_type, str):
            raise TypeError("Expected argument 'traffic_type' to be a str")
        pulumi.set(__self__, "traffic_type", traffic_type)
        if traffic_type_id and not isinstance(traffic_type_id, int):
            raise TypeError("Expected argument 'traffic_type_id' to be a int")
        pulumi.set(__self__, "traffic_type_id", traffic_type_id)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="locationId")
    def location_id(self) -> builtins.str:
        return pulumi.get(self, "location_id")

    @property
    @pulumi.getter(name="locationName")
    def location_name(self) -> builtins.str:
        return pulumi.get(self, "location_name")

    @property
    @pulumi.getter(name="trafficType")
    def traffic_type(self) -> builtins.str:
        return pulumi.get(self, "traffic_type")

    @property
    @pulumi.getter(name="trafficTypeId")
    def traffic_type_id(self) -> builtins.int:
        return pulumi.get(self, "traffic_type_id")


class AwaitableGetCloudwrapperLocationResult(GetCloudwrapperLocationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudwrapperLocationResult(
            id=self.id,
            location_id=self.location_id,
            location_name=self.location_name,
            traffic_type=self.traffic_type,
            traffic_type_id=self.traffic_type_id)


def get_cloudwrapper_location(location_name: Optional[builtins.str] = None,
                              traffic_type: Optional[builtins.str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudwrapperLocationResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['locationName'] = location_name
    __args__['trafficType'] = traffic_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getCloudwrapperLocation:getCloudwrapperLocation', __args__, opts=opts, typ=GetCloudwrapperLocationResult).value

    return AwaitableGetCloudwrapperLocationResult(
        id=pulumi.get(__ret__, 'id'),
        location_id=pulumi.get(__ret__, 'location_id'),
        location_name=pulumi.get(__ret__, 'location_name'),
        traffic_type=pulumi.get(__ret__, 'traffic_type'),
        traffic_type_id=pulumi.get(__ret__, 'traffic_type_id'))
def get_cloudwrapper_location_output(location_name: Optional[pulumi.Input[builtins.str]] = None,
                                     traffic_type: Optional[pulumi.Input[builtins.str]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCloudwrapperLocationResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['locationName'] = location_name
    __args__['trafficType'] = traffic_type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getCloudwrapperLocation:getCloudwrapperLocation', __args__, opts=opts, typ=GetCloudwrapperLocationResult)
    return __ret__.apply(lambda __response__: GetCloudwrapperLocationResult(
        id=pulumi.get(__response__, 'id'),
        location_id=pulumi.get(__response__, 'location_id'),
        location_name=pulumi.get(__response__, 'location_name'),
        traffic_type=pulumi.get(__response__, 'traffic_type'),
        traffic_type_id=pulumi.get(__response__, 'traffic_type_id')))
