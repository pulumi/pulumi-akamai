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
    'GetGtmGeomapsResult',
    'AwaitableGetGtmGeomapsResult',
    'get_gtm_geomaps',
    'get_gtm_geomaps_output',
]

@pulumi.output_type
class GetGtmGeomapsResult:
    """
    A collection of values returned by getGtmGeomaps.
    """
    def __init__(__self__, domain=None, geo_maps=None, id=None):
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if geo_maps and not isinstance(geo_maps, list):
            raise TypeError("Expected argument 'geo_maps' to be a list")
        pulumi.set(__self__, "geo_maps", geo_maps)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def domain(self) -> builtins.str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="geoMaps")
    def geo_maps(self) -> Sequence['outputs.GetGtmGeomapsGeoMapResult']:
        return pulumi.get(self, "geo_maps")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetGtmGeomapsResult(GetGtmGeomapsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGtmGeomapsResult(
            domain=self.domain,
            geo_maps=self.geo_maps,
            id=self.id)


def get_gtm_geomaps(domain: Optional[builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGtmGeomapsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['domain'] = domain
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('akamai:index/getGtmGeomaps:getGtmGeomaps', __args__, opts=opts, typ=GetGtmGeomapsResult).value

    return AwaitableGetGtmGeomapsResult(
        domain=pulumi.get(__ret__, 'domain'),
        geo_maps=pulumi.get(__ret__, 'geo_maps'),
        id=pulumi.get(__ret__, 'id'))
def get_gtm_geomaps_output(domain: Optional[pulumi.Input[builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGtmGeomapsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['domain'] = domain
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('akamai:index/getGtmGeomaps:getGtmGeomaps', __args__, opts=opts, typ=GetGtmGeomapsResult)
    return __ret__.apply(lambda __response__: GetGtmGeomapsResult(
        domain=pulumi.get(__response__, 'domain'),
        geo_maps=pulumi.get(__response__, 'geo_maps'),
        id=pulumi.get(__response__, 'id')))
